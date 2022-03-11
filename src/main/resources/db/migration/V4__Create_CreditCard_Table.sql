CREATE TABLE CreditCard(
    creditcard_id INT GENERATED ALWAYS AS IDENTITY,
    number varchar(20) NOT NULL,
    expirationDate Date NOT NULL,

    PRIMARY KEY (creditCardId)
)