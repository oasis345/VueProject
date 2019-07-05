DROP table users;
CREATE TABLE users(
    id INT AUTO_INCREMENT PRIMARY KEY,
    user_id VARCHAR(20) UNIQUE,
    user_name VARCHAR(20) NOT NULL,
    password VARCHAR(20) NOT NULL,
    email VARCHAR(20) NOT NULL 
)DEFAULT CHARSET=utf8;
commit;