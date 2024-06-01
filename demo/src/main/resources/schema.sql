-- -- Create the products table
-- CREATE TABLE products (
--   id UUID DEFAULT RANDOM_UUID() PRIMARY KEY,
--   code VARCHAR(9) NOT NULL,
--   name VARCHAR(90) NOT NULL,
--   category VARCHAR(28) NOT NULL,
--   brand VARCHAR(28),
--   type VARCHAR(21),
--   description VARCHAR(180),
--   created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
--   updated_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
--   UNIQUE (code)
-- );

-- Create the products table
CREATE TABLE products (
  id INT(10) AUTO_INCREMENT PRIMARY KEY,
  code VARCHAR(9) NOT NULL,
  name VARCHAR(90) NOT NULL,
  category VARCHAR(28) NOT NULL,
  brand VARCHAR(28),
  type VARCHAR(21),
  description VARCHAR(180),
  created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
  updated_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  UNIQUE (code)
);

