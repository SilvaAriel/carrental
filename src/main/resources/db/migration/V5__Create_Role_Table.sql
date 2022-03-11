CREATE TABLE Roles (
    role_id INT GENERATED ALWAYS AS IDENTITY,
    role varchar(100) NOT NULL,

    PRIMARY KEY (role_id)
)