package com.carrental.carrental.domain;

import com.carrental.carrental.domain.enums.RentStatusEnum;
import lombok.Getter;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.List;

@Getter
public class Rent {
    private RentStatusEnum status;
    private LocalDate dateBegin;
    private LocalDate dateEnd;
    private int feeDaily;
    private List<Car> cars;
    private LocalDate paymentDate;
    private User responsible;
    private int mileage;
    private boolean hasMileageLimit;
    private int mileageLimit;

    public Rent(LocalDate dateBegin, LocalDate dateEnd, int feeDaily, List<Car> cars, LocalDate paymentDate, User responsible, int mileage, boolean hasMileageLimit, int mileageLimit) {
        this.status = RentStatusEnum.OPEN;
        this.dateBegin = dateBegin;
        this.dateEnd = dateEnd;
        this.feeDaily = feeDaily;
        this.cars = cars;
        this.paymentDate = paymentDate;
        this.responsible = responsible;
        this.mileage = mileage;
        this.hasMileageLimit = hasMileageLimit;
        this.mileageLimit = mileageLimit;
    }

    public void payRent() {
        this.status = RentStatusEnum.PAID;
    }

    public long getTotalDays(){
        return this.dateBegin.until(this.dateEnd, ChronoUnit.DAYS);
    };

    public boolean isValid() {
        return this.status.equals(RentStatusEnum.PAID);
    }
}
