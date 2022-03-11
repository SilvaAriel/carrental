CREATE TABLE Cars (
    carId INT GENERATED ALWAYS AS IDENTITY,
    licensePlate varchar(150),
    model varchar(255),
    registration_date Date,
    mileage INT,
    transmission char(1)
    weight float,
    manufacture_year Date,
    seats INT,
    fuel_type varchar(50),
    fee INT,
    photos bytea,
    car_size varchar(100),

    PRIMARY KEY (carId)
)