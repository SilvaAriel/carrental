CREATE TABLE Users (
    user_id INT GENERATED ALWAYS AS IDENTITY,
    email varchar (255) NOT NULL,
    password varchar (255),
    identification varchar (255) NOT NULL,
    firstName varchar (255) NOT NULL,
    lastName varchar (255) NOT NULL,
    drivingLicence varchar (100),
    birthday Date,
    picture bytea,
    addressLineOne varchar (255) NOT NULL,
    addressLineTwo varchar (255),
    neighbor varchar (255) NOT NULL,
    city varchar (255) NOT NULL,
    zipcode varchar (100) NOT NULL,

    PRIMARY KEY (user_id)
)