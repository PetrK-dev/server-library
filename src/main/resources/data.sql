-- Vložení rolí
INSERT INTO role (name) VALUES ('USER');
INSERT INTO role (name) VALUES ('ADMIN');

-- Vložení uživatelů
INSERT INTO user_ (username, password, email) VALUES ('user1', 'password1', 'user1@example.com');
INSERT INTO user_ (username, password, email) VALUES ('admin', 'password2', 'admin@example.com');
INSERT INTO user_ (username, password, email) VALUES ('user2', 'password3', 'user2@example.com');
INSERT INTO user_ (username, password, email) VALUES ('user3', 'password4', 'user3@example.com');
INSERT INTO user_ (username, password, email) VALUES ('user4', 'password5', 'user4@example.com');
INSERT INTO user_ (username, password, email) VALUES ('user5', 'password6', 'user5@example.com');
INSERT INTO user_ (username, password, email) VALUES ('user6', 'password7', 'user6@example.com');
INSERT INTO user_ (username, password, email) VALUES ('user7', 'password8', 'user7@example.com');
INSERT INTO user_ (username, password, email) VALUES ('user8', 'password9', 'user8@example.com');
INSERT INTO user_ (username, password, email) VALUES ('user9', 'password10', 'user9@example.com');
INSERT INTO user_ (username, password, email) VALUES ('user10', 'password11', 'user10@example.com');

-- Přiřazení rolí uživatelům
INSERT INTO user_roles (user_id, role_id) VALUES ((SELECT id FROM user_ WHERE username = 'user1'), (SELECT id FROM role WHERE name = 'USER'));
INSERT INTO user_roles (user_id, role_id) VALUES ((SELECT id FROM user_ WHERE username = 'admin'), (SELECT id FROM role WHERE name = 'ADMIN'));
INSERT INTO user_roles (user_id, role_id) VALUES ((SELECT id FROM user_ WHERE username = 'user2'), (SELECT id FROM role WHERE name = 'USER'));
INSERT INTO user_roles (user_id, role_id) VALUES ((SELECT id FROM user_ WHERE username = 'user3'), (SELECT id FROM role WHERE name = 'USER'));
INSERT INTO user_roles (user_id, role_id) VALUES ((SELECT id FROM user_ WHERE username = 'user4'), (SELECT id FROM role WHERE name = 'USER'));
INSERT INTO user_roles (user_id, role_id) VALUES ((SELECT id FROM user_ WHERE username = 'user5'), (SELECT id FROM role WHERE name = 'USER'));
INSERT INTO user_roles (user_id, role_id) VALUES ((SELECT id FROM user_ WHERE username = 'user6'), (SELECT id FROM role WHERE name = 'USER'));
INSERT INTO user_roles (user_id, role_id) VALUES ((SELECT id FROM user_ WHERE username = 'user7'), (SELECT id FROM role WHERE name = 'USER'));
INSERT INTO user_roles (user_id, role_id) VALUES ((SELECT id FROM user_ WHERE username = 'user8'), (SELECT id FROM role WHERE name = 'USER'));
INSERT INTO user_roles (user_id, role_id) VALUES ((SELECT id FROM user_ WHERE username = 'user9'), (SELECT id FROM role WHERE name = 'USER'));
INSERT INTO user_roles (user_id, role_id) VALUES ((SELECT id FROM user_ WHERE username = 'user10'), (SELECT id FROM role WHERE name = 'USER'));

-- Vložení autorů
INSERT INTO author (name, biography) VALUES ('Author One', 'Biography of Author One');
INSERT INTO author (name, biography) VALUES ('Author Two', 'Biography of Author Two');
INSERT INTO author (name, biography) VALUES ('Author Three', 'Biography of Author Three');
INSERT INTO author (name, biography) VALUES ('Author Four', 'Biography of Author Four');
INSERT INTO author (name, biography) VALUES ('Author Five', 'Biography of Author Five');
INSERT INTO author (name, biography) VALUES ('Author Six', 'Biography of Author Six');
INSERT INTO author (name, biography) VALUES ('Author Seven', 'Biography of Author Seven');
INSERT INTO author (name, biography) VALUES ('Author Eight', 'Biography of Author Eight');
INSERT INTO author (name, biography) VALUES ('Author Nine', 'Biography of Author Nine');
INSERT INTO author (name, biography) VALUES ('Author Ten', 'Biography of Author Ten');

-- Vložení kategorií
INSERT INTO category (name, description) VALUES ('Fiction', 'Fictional books');
INSERT INTO category (name, description) VALUES ('Science', 'Scientific books');
INSERT INTO category (name, description) VALUES ('Fantasy', 'Fantasy books');
INSERT INTO category (name, description) VALUES ('History', 'Historical books');
INSERT INTO category (name, description) VALUES ('Biography', 'Biographical books');
INSERT INTO category (name, description) VALUES ('Horror', 'Horror books');
INSERT INTO category (name, description) VALUES ('Romance', 'Romantic books');
INSERT INTO category (name, description) VALUES ('Mystery', 'Mystery books');
INSERT INTO category (name, description) VALUES ('Thriller', 'Thriller books');
INSERT INTO category (name, description) VALUES ('Non-Fiction', 'Non-fictional books');

-- Vložení knih
INSERT INTO book (title, isbn, published_date, status) VALUES ('Book One', '1234567890123', '2022-01-01', 'AVAILABLE');
INSERT INTO book (title, isbn, published_date, status) VALUES ('Book Two', '1234567890124', '2022-02-01', 'BORROWED');
INSERT INTO book (title, isbn, published_date, status) VALUES ('Book Three', '1234567890125', '2022-03-01', 'AVAILABLE');
INSERT INTO book (title, isbn, published_date, status) VALUES ('Book Four', '1234567890126', '2022-04-01', 'AVAILABLE');
INSERT INTO book (title, isbn, published_date, status) VALUES ('Book Five', '1234567890127', '2022-05-01', 'BORROWED');
INSERT INTO book (title, isbn, published_date, status) VALUES ('Book Six', '1234567890128', '2022-06-01', 'AVAILABLE');
INSERT INTO book (title, isbn, published_date, status) VALUES ('Book Seven', '1234567890129', '2022-07-01', 'AVAILABLE');
INSERT INTO book (title, isbn, published_date, status) VALUES ('Book Eight', '1234567890130', '2022-08-01', 'BORROWED');
INSERT INTO book (title, isbn, published_date, status) VALUES ('Book Nine', '1234567890131', '2022-09-01', 'AVAILABLE');
INSERT INTO book (title, isbn, published_date, status) VALUES ('Book Ten', '1234567890132', '2022-10-01', 'AVAILABLE');

-- Přiřazení autorů knihám
INSERT INTO book_authors (book_id, author_id) VALUES ((SELECT id FROM book WHERE title = 'Book One'), (SELECT id FROM author WHERE name = 'Author One'));
INSERT INTO book_authors (book_id, author_id) VALUES ((SELECT id FROM book WHERE title = 'Book Two'), (SELECT id FROM author WHERE name = 'Author Two'));
INSERT INTO book_authors (book_id, author_id) VALUES ((SELECT id FROM book WHERE title = 'Book Three'), (SELECT id FROM author WHERE name = 'Author Three'));
INSERT INTO book_authors (book_id, author_id) VALUES ((SELECT id FROM book WHERE title = 'Book Four'), (SELECT id FROM author WHERE name = 'Author Four'));
INSERT INTO book_authors (book_id, author_id) VALUES ((SELECT id FROM book WHERE title = 'Book Five'), (SELECT id FROM author WHERE name = 'Author Five'));
INSERT INTO book_authors (book_id, author_id) VALUES ((SELECT id FROM book WHERE title = 'Book Six'), (SELECT id FROM author WHERE name = 'Author Six'));
INSERT INTO book_authors (book_id, author_id) VALUES ((SELECT id FROM book WHERE title = 'Book Seven'), (SELECT id FROM author WHERE name = 'Author Seven'));
INSERT INTO book_authors (book_id, author_id) VALUES ((SELECT id FROM book WHERE title = 'Book Eight'), (SELECT id FROM author WHERE name = 'Author Eight'));
INSERT INTO book_authors (book_id, author_id) VALUES ((SELECT id FROM book WHERE title = 'Book Nine'), (SELECT id FROM author WHERE name = 'Author Nine'));
INSERT INTO book_authors (book_id, author_id) VALUES ((SELECT id FROM book WHERE title = 'Book Ten'), (SELECT id FROM author WHERE name = 'Author Ten'));

-- Přiřazení kategorií knihám
INSERT INTO book_categories (book_id, category_id) VALUES ((SELECT id FROM book WHERE title = 'Book One'), (SELECT id FROM category WHERE name = 'Fiction'));
INSERT INTO book_categories (book_id, category_id) VALUES ((SELECT id FROM book WHERE title = 'Book Two'), (SELECT id FROM category WHERE name = 'Science'));
INSERT INTO book_categories (book_id, category_id) VALUES ((SELECT id FROM book WHERE title = 'Book Three'), (SELECT id FROM category WHERE name = 'Fantasy'));
INSERT INTO book_categories (book_id, category_id) VALUES ((SELECT id FROM book WHERE title = 'Book Four'), (SELECT id FROM category WHERE name = 'History'));
INSERT INTO book_categories (book_id, category_id) VALUES ((SELECT id FROM book WHERE title = 'Book Five'), (SELECT id FROM category WHERE name = 'Biography'));
INSERT INTO book_categories (book_id, category_id) VALUES ((SELECT id FROM book WHERE title = 'Book Six'), (SELECT id FROM category WHERE name = 'Horror'));
INSERT INTO book_categories (book_id, category_id) VALUES ((SELECT id FROM book WHERE title = 'Book Seven'), (SELECT id FROM category WHERE name = 'Romance'));
INSERT INTO book_categories (book_id, category_id) VALUES ((SELECT id FROM book WHERE title = 'Book Eight'), (SELECT id FROM category WHERE name = 'Mystery'));
INSERT INTO book_categories (book_id, category_id) VALUES ((SELECT id FROM book WHERE title = 'Book Nine'), (SELECT id FROM category WHERE name = 'Thriller'));
INSERT INTO book_categories (book_id, category_id) VALUES ((SELECT id FROM book WHERE title = 'Book Ten'), (SELECT id FROM category WHERE name = 'Non-Fiction'));

-- Vložení záznamů o vypůjčení
INSERT INTO borrow_record (book_id, user_id, borrow_date, return_date) VALUES ((SELECT id FROM book WHERE title = 'Book Two'), (SELECT id FROM user_ WHERE username = 'user1'), '2022-03-01', '2022-03-15');
INSERT INTO borrow_record (book_id, user_id, borrow_date, return_date) VALUES ((SELECT id FROM book WHERE title = 'Book Five'), (SELECT id FROM user_ WHERE username = 'user2'), '2022-06-01', '2022-06-15');
INSERT INTO borrow_record (book_id, user_id, borrow_date, return_date) VALUES ((SELECT id FROM book WHERE title = 'Book Eight'), (SELECT id FROM user_ WHERE username = 'user3'), '2022-09-01', '2022-09-15');