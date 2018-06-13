CREATE TABLE section
(
  id SERIAL PRIMARY KEY,
  layout_info VARCHAR(255) NOT NULL,
  name VARCHAR(100) NOT NULL
);

CREATE TABLE seat
(
  id SERIAL PRIMARY KEY,
  available boolean,
  name VARCHAR(100) NOT NULL,
  section_id INTEGER REFERENCES section(id)
);