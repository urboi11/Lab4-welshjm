create table Profiles(
    id BIGINT,
    bio TEXT,
    phone_number VARCHAR(15),
    date_of_birth DATE,
    loyality_points INT UNSIGNED DEFAULT 0,
    Primary Key(id),
    Foreign Key(id) REFERENCES Users(id)
)