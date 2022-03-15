CREATE TABLE Rents (
    rent_id INT GENERATED ALWAYS AS IDENTITY,
    status varchar(100),
    date_begin Date NOT NULL,
    date_end Date NOT NULL,
    fee_daily INT,
    payment_date Date,
    mileage INT,
    mileage_limit INT,

    PRIMARY KEY (rent_id)
)