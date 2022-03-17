package com.carrental.carrental.domain;

import com.carrental.carrental.domain.enums.RentStatusEnum;
import lombok.*;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.List;

@RequiredArgsConstructor
@Getter
public class Rent {
    @NonNull private LocalDate dateBegin;
    @NonNull private LocalDate dateEnd;
    @NonNull private int feeDaily;
    @NonNull private List<Car> cars;
    @Setter private LocalDate paymentDate;
    @NonNull private User responsible;
    @NonNull private int mileage;
    @NonNull private boolean hasMileageLimit;
    @NonNull private int mileageLimit;
    @Setter private RentStatusEnum status = RentStatusEnum.OPEN;

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
