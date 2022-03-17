CREATE TABLE Rents (
    rent_id INT GENERATED ALWAYS AS IDENTITY,
    status varchar(100) NOT NULL,
    date_begin Date NOT NULL,
    date_end Date NOT NULL,
    fee_daily INT NOT NULL,
    payment_date Date,
    mileage INT NOT NULL,
    mileage_limit INT NOT NULL,

    PRIMARY KEY (rent_id)
)