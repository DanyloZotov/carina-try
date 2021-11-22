package onboarding.models;


public class User {

    public enum Gender {
        MALE,
        FEMALE
    }

    private Gender gender;
    private String name;
    private String password;

    public User(String name, String password, Gender gender) {
        this.name = name;
        this.password = password;
        this.gender = gender;
    }

    public Gender getGender() {
        return gender;
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }
}
