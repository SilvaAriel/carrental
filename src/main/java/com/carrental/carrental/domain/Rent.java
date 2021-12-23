package com.carrental.carrental.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.time.LocalDate;
import java.util.List;

@AllArgsConstructor
@Getter
public class Rent {
    private LocalDate dateBegin;
    private LocalDate dateEnd;
    private int feeDaily;
    private List<Car> cars;
    private LocalDate paymentDate;
    private User responsible;
    private int mileage;
    private boolean hasMileageLimit;
    private int mileageLimit;

//    public Date getTotalDays() {
//
//    };

    public int getDaysLeft(){
        return this.dateBegin.compareTo(this.dateEnd);
    };
}
