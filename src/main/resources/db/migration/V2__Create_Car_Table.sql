CREATE TABLE Cars (
    carId INT GENERATED ALWAYS AS IDENTITY,
    licensePlate varchar(150),
    model varchar(255),
    mileage INT,
    weight float,
    seats INT,
    fee INT,

    PRIMARY KEY (carId)
)