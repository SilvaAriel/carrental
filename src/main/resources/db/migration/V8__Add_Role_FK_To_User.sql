ALTER TABLE Users
ADD role_id INT NOT NULL,
ADD FOREIGN KEY (role_id) REFERENCES Roles(role_id);