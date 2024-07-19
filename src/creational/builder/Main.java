package creational.builder;

import creational.builder.User.UserBuilder;

public class Main {
    public static void main(String[] args) {
        User user = new User.UserBuilder("Michael", "Ivanov")
                .withAge(23)
                .withPhoneNumber("12314").build();
        System.out.println(user);
    }

    ;
}
