package ru.netology.persons;

public class Main {

    public static void main(String[] args) {

        Post post = new Post();

        post.name = "Денис";
        post.surname = "Сергеев";
        post.patronymic = "Валериевич";
        post.password = "5456 № 213412";
        post.phone = "89000000001";
        post.subscription = true;
        post.birthday.day = 8;
        post.birthday.month = 5;
        post.birthday.year = 1989;
    }
}