ALTER TABLE Cars
ADD color_id INT NOT NULL,
ADD FOREIGN KEY (color_id) REFERENCES Colors(color_id);