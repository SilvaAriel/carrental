CREATE TABLE Rents (
    rent_id INT GENERATED ALWAYS AS IDENTITY,
    dateBegin Date NOT NULL,
    dateEnd Date NOT NULL,
    feeDaily INT,
    paymentDate Date,
    mileage INT,
    hasMileageLimit boolean,
    mileageLimit INT,

    PRIMARY KEY (rentId)
)