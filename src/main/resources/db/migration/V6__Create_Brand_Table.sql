CREATE TABLE Brands(
    brand_id INT GENERATED ALWAYS AS IDENTITY,
    brand varchar(255) NOT NULL,

    PRIMARY KEY (brand_id)
)