
create table genre (
    id serial PRIMARY KEY ,
    genre_name CHARACTER VARYING(255)
);

create table radio_program_type (
    id serial PRIMARY KEY ,
    radio_program_type_name CHARACTER VARYING(255)
);

create table person (
    id serial PRIMARY KEY ,
    person_name CHARACTER VARYING(50) NOT NULL
);

create table song (
    id serial PRIMARY KEY ,
    song_name CHARACTER VARYING(50) NOT NULL,
    author_id integer,
    singer_id integer NOT NULL,
    rating real CHECK (rating <= 5 and rating > 0),
    duration real CHECK (duration > 0),
    album_name  CHARACTER VARYING(50),
    release_date DATE NOT NULL,
    FOREIGN KEY (author_id) REFERENCES person (id),
    FOREIGN KEY (singer_id) REFERENCES person (id)
);

create table proposal (
    id serial PRIMARY KEY ,
    song_name CHARACTER VARYING(50) NOT NULL,
    singer_name CHARACTER VARYING(50) NOT NULL,
    proposal_author_id  integer,
    FOREIGN KEY (proposal_author_id) REFERENCES person (id)
);

create table radio_program (
    id serial PRIMARY KEY,
    radio_program_name CHARACTER VARYING(50) NOT NULL,
    genre_id integer,
    radio_program_type_id integer,
    duration real CHECK (duration > 0),
    FOREIGN KEY (genre_id) REFERENCES genre(id),
    FOREIGN KEY (radio_program_type_id) REFERENCES radio_program_type(id)
);
/*
CREATE TABLE participation (
    id serial PRIMARY KEY ,
    radio_program_id integer NOT NULL,
    song_id integer NOT NULL,
    proposal_id integer,
    FOREIGN KEY (radio_program_id) REFERENCES radio_program(id),
    FOREIGN KEY (song_id) REFERENCES song(id),
    FOREIGN KEY (proposal_id) REFERENCES proposal(id)
);
*/
CREATE TABLE participation(
    radio_program_id integer,
    song_id integer,
    proposal_id integer,
    PRIMARY KEY (radio_program_id,song_id),
    FOREIGN KEY (radio_program_id) REFERENCES radio_program (id),
    FOREIGN KEY (song_id) REFERENCES song (id),
    FOREIGN KEY (proposal_id) REFERENCES proposal (id)
);

INSERT INTO genre(genre_name)
VALUES
('FOLK'),
('COUNTRY'),
('BLUES'),
('JAZZ'),
('CHANSON'),
('ELECTRONIC'),
('ROCK'),
('HIP_HOP'),
('REGGAE'),
('POP')
;

INSERT INTO radio_program_type(radio_program_type_name)
VALUES
('Hit Parade'),
('Proposals Parade')
;

INSERT INTO person(person_name)
VALUES
('Freddie Mercury'),
('Mick Jagger'),
('Adele'),
('Katy Perry'),
('Harry Styles'),
('Polina')
;

INSERT INTO song( song_name, author_id, singer_id, rating, duration, album_name, release_date)
VALUES
('Bohemian Rhapsody', 1, 1, 4.71, 200, 'Live Killers',  '1979-03-01'),
('Show must go on', 1, 1, 4.86, 205, 'Live Killers',  '1979-11-04'),

('God Gave Me Everything', 2, 2, 3.71, 245, 'Goddess in the Doorway',  '2001-03-01'),
('Dancing In The Street', 2, 2, 3.86, 227, 'The Singles Collection',  '1993-11-04'),

('Hello', 3, 3, 4.71, 245, '25',  '2011-07-01'),
('When We Were Young', 3, 3, 4.86, 227, '25', '2011-07-01'),

('Firework', 4, 4, 3.79, 239, 'Teenage Dream',  '2010-11-08'),
('California Gurls', 4, 4, 4.09, 240, 'Teenage Dream',  '2010-06-12'),

('Golden', 5, 5, 4.89, 208, 'Fine Line',  '2019-05-25'),
('Watermelon Sugar', 5, 5, 4.99, 208, 'Fine Line',  '2019-05-25')
;

INSERT INTO proposal( song_name, singer_name, proposal_author_id)
VALUES
('Bohemian Rhapsody', 'Freddie Mercury',6),
('Firework', 'Katy Perry',6)
;

INSERT INTO radio_program (radio_program_name, Genre_Id ,radio_program_type_id ,duration )
VALUES
('Morning', 2, 1, 447),
('Evening', 7, 2, 405)
;

INSERT INTO participation (radio_program_id, song_id, proposal_id)
VALUES
(1, 1, 1),
(1, 7, 2),
(2, 9, null),
(2, 10, null)
;