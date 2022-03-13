CREATE TABLE Color (
    color_id INT GENERATED ALWAYS AS IDENTITY,
    color varchar(255) NOT NULL,

    PRIMARY KEY (color_id)
)