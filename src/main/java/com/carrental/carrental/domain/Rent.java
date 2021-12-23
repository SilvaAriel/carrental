package com.carrental.carrental.domain;

import com.itextpdf.text.Document;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Date;
import java.util.List;

@AllArgsConstructor
@Getter
public class Rent {
    private Date dateBegin;
    private Date dateEnd;
    private int feeDaily;
    private List<Car> cars;
    private Date paymentDate;
    private User responsible;
    private int mileage;
    private boolean hasMileageLimit;
    private int mileageLimit;
}
