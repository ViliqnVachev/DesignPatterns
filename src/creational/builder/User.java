package creational.builder;

public class User {
    private final String firstName;
    private final String lastName;
    private final int age;
    private final String phoneNumber;
    private final String address;

    private User(UserBuilder builder) {
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.age = builder.age;
        this.phoneNumber = builder.phoneNumber;
        this.address = builder.address;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Name: ").append(getFirstName()).append(" ").append(getLastName())
                .append(System.lineSeparator())
                .append("Address: ").append(getAddress()).append(System.lineSeparator())
                .append("Age: ").append(getAge()).append(System.lineSeparator())
                .append("Phone: ").append(getPhoneNumber());
        return sb.toString();
    }

    public static class UserBuilder {
        private final String firstName;
        private final String lastName;
        private int age;
        private String phoneNumber;
        private String address;

        public UserBuilder(String firstName, String lastName) {
            this.firstName = firstName;
            this.lastName = lastName;
        }

        public UserBuilder withAge(int age) {
            this.age = age;
            return this;
        }

        public UserBuilder withPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }

        public UserBuilder withAddress(String address) {
            this.address = address;
            return this;
        }

        public User build() {
            return new User(this);
        }
    }
}
