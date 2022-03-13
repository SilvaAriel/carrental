ALTER TABLE Credit_Cards
ADD user_id INT,
ADD FOREIGN KEY (user_id) REFERENCES Users(user_id);