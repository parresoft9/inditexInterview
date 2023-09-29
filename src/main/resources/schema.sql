DROP TABLE IF EXISTS tutorials;
CREATE TABLE tutorials (
                                id LONG NOT NULL,
                                title VARCHAR2(20) NOT NULL,
                                description VARCHAR2(20) NOT NULL,
                                published boolean NOT NULL,
                                firstfecha TIMESTAMP NOT NULL,
                                secondfecha TIMESTAMP NOT NULL,
                                priority LONG NOT NULL,
                                CONSTRAINT PRICES_PK PRIMARY KEY (id)
);
