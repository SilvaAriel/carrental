CREATE TABLE Credit_Cards(
    creditcard_id INT GENERATED ALWAYS AS IDENTITY,
    number varchar(20) NOT NULL,
    expirationDate Date NOT NULL,

    PRIMARY KEY (creditcard_id)
)