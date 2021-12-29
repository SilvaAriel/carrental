package com.carrental.carrental.domain;

import com.carrental.carrental.domain.enums.RentStatusEnum;
import lombok.Getter;
import lombok.Setter;

import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;
import java.util.List;


public class Rent {
    @Getter @Setter
    private RentStatusEnum status;
    @Getter
    private long dateBegin;
    @Getter
    private long dateEnd;
    @Getter
    private int feeDaily;
    @Getter
    private List<Car> cars;
    @Getter @Setter
    private long paymentDate;
    @Getter
    private User responsible;
    @Getter
    private boolean hasMileageLimit;
    @Getter
    private int mileageLimit;

    public Rent(long dateBegin, long dateEnd, int feeDaily, List<Car> cars, long paymentDate, User responsible, boolean hasMileageLimit, int mileageLimit) {
        this.status = RentStatusEnum.OPEN;
        this.dateBegin = System.currentTimeMillis();
        this.dateEnd = dateEnd;
        this.feeDaily = feeDaily;
        this.cars = cars;
        this.paymentDate = paymentDate;
        this.responsible = responsible;
        this.hasMileageLimit = hasMileageLimit;
        this.mileageLimit = mileageLimit;
    }

    // Without payment date
    public Rent(long dateBegin, long dateEnd, int feeDaily, List<Car> cars, User responsible, boolean hasMileageLimit, int mileageLimit) {
        this.status = RentStatusEnum.OPEN;
        this.dateBegin = System.currentTimeMillis();
        this.dateEnd = dateEnd;
        this.feeDaily = feeDaily;
        this.cars = cars;
        this.responsible = responsible;
        this.hasMileageLimit = hasMileageLimit;
        this.mileageLimit = mileageLimit;
    }

    public void payRent() {
        this.status = RentStatusEnum.PAID;
    }

    public long getTotalDays(){
        LocalDate begin = Instant.ofEpochMilli(this.dateBegin).atZone(ZoneId.systemDefault()).toLocalDate();
        LocalDate end = Instant.ofEpochMilli(this.dateEnd).atZone(ZoneId.systemDefault()).toLocalDate();
        return begin.until(end, ChronoUnit.DAYS);
    };

    public boolean isPaid() {
        return this.status.equals(RentStatusEnum.PAID);
    }

    public boolean isValid() {
        return (!this.status.equals(RentStatusEnum.CLOSED) && !this.status.equals(RentStatusEnum.DUE));
    }
}
