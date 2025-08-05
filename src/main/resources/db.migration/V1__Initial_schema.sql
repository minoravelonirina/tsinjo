CREATE TABLE donor (
                       id VARCHAR(255) PRIMARY KEY,
                       email VARCHAR(255) NOT NULL,
                       full_name VARCHAR(255) NOT NULL
);

CREATE TABLE payment (
                         id VARCHAR(255) PRIMARY KEY,
                         date TIMESTAMP NOT NULL,
                         amount DECIMAL(10,2) NOT NULL,
                         payment_method VARCHAR(50) NOT NULL,
                         status VARCHAR(20) NOT NULL
);

CREATE TABLE donation (
                          id VARCHAR(255) PRIMARY KEY,
                          donor_id VARCHAR(255) NOT NULL REFERENCES donor(id),
                          payment_id VARCHAR(255) NOT NULL REFERENCES payment(id),
                          registration_date TIMESTAMP NOT NULL
);