CREATE TABLE item
(
    item_id BIGINT NOT NULL,
    item_name VARCHAR(500) NOT NULL,
    item_description VARCHAR(500) NOT NULL,
    item_category BIGINT NOT NULL,
    item_price FLOAT NOT NULL,
    CONSTRAINT item_id_pkey PRIMARY KEY (item_id),
    CONSTRAINT item_category_fkey FOREIGN KEY (item_category)
    REFERENCES category(category_id)
)