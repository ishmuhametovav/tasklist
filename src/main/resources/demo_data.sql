insert into users(name, username, password)
values ('John Doe', 'john.doe', '$2a$10$rvzfZ6UphqXMy2mCSbf7ueKsOL5X3Lt8hlhGNsIm6LS8g2pkUZ/OW'),
       ('Jane Doe', 'jane.doe', '$2a$10$WRfanw0gggQ8YjKzWri27eOfJQ/XAcK7Y5aTGl5eKKCxCt8IFt0Eu');

insert into tasks(title, description, status, expiration_date)
values ('Task 1', 'Description for task 1', 'TODO', '2026-07-01 12:00:00'),
       ('Task 2', 'Description for task 2', 'IN_PROGRESS', '2026-07-02 14:00:00'),
       ('Task 3', 'Description for task 3', 'DONE', '2026-07-03 16:00:00'),
       ('Task 4', 'Description for task 4', 'TODO', '2026-07-04 18:00:00');

insert into users_tasks(task_id, user_id)
values (1, 1),
       (2, 1),
       (3, 2),
       (4, 2);

insert into users_roles(user_id, role)
values (1, 'ROLE_ADMIN'),
       (1, 'ROLE_USER'),
       (2, 'ROLE_USER');
