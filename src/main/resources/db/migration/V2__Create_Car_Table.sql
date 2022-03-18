CREATE TABLE Cars (
    car_id INT GENERATED ALWAYS AS IDENTITY,
    license_plate varchar(150) NOT NULL,
    model varchar(255) NOT NULL,
    registration_date Date NOT NULL,
    mileage INT NOT NULL,
    transmission char(1) NOT NULL,
    weight float,
    color varchar(200) NOT NULL,
    manufacture_year Date NOT NULL,
    seats INT NOT NULL,
    fuel_type varchar(50) NOT NULL,
    fee INT NOT NULL,
    photos bytea,
    size varchar(100) NOT NULL,

    PRIMARY KEY (car_id)
)