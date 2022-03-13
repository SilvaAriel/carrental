CREATE TABLE Cars (
    car_id INT GENERATED ALWAYS AS IDENTITY,
    licensePlate varchar(150),
    model varchar(255) NOT NULL,
    registration_date Date,
    mileage INT NOT NULL,
    transmission char(1) NOT NULL,
    weight float,
    manufacture_year Date NOT NULL,
    seats INT NOT NULL,
    fuel_type varchar(50) NOT NULL,
    fee INT,
    photos bytea,
    car_size varchar(100) NOT NULL,

    PRIMARY KEY (car_id)
)