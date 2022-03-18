ALTER TABLE Rents
ADD user_id INT NOT NULL,
ADD FOREIGN KEY (user_id) REFERENCES Users(user_id);