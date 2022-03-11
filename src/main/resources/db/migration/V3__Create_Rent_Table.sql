CREATE TABLE Rents (
    rent_id INT GENERATED ALWAYS AS IDENTITY,
    date_begin Date NOT NULL,
    date_end Date NOT NULL,
    fee_daily INT,
    payment_date Date,
    mileage INT,
    mileage_limit INT,

    PRIMARY KEY (rentId)
)