CREATE TABLE CreditCard(
    creditCardId INT GENERATED ALWAYS AS IDENTITY,
    number varchar(20),
    expirationDate Date NOT NULL,

    PRIMARY KEY (creditCardId)
)