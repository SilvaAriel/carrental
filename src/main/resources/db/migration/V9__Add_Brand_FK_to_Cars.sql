ALTER TABLE Cars
ADD brand_id INT NOT NULL,
ADD FOREIGN KEY (brand_id) REFERENCES Brands(brand_id);