CREATE TABLE Users (
    user_id INT GENERATED ALWAYS AS IDENTITY,
    email varchar (255),
    password varchar (255),
    identification varchar (255),
    firstName varchar (255),
    lastName varchar (255),
    drivingLicence varchar (100),
    birthday Date,
    picture bytea,
    addressLineOne varchar (255),
    addressLineTwo varchar (255),
    neighbor varchar (255),
    city varchar (255),
    zipcode varchar (100),

    PRIMARY KEY (userId)
)