package models;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import static functions.Messages.*;

public class SignUpAccount {

    @NotNull(message = notAllFieldsError)
    @Pattern(regexp = "[a-zA-Zа-яА-Я]{2,20}+", message = validationFirstName)
    private final String firstName;

    @NotNull(message = notAllFieldsError)
    @Pattern(regexp = "[a-zA-Zа-яА-Я]{2,20}+", message = validationLastName)
    private final String lastName;

    @NotNull(message = notAllFieldsError)
    @Pattern(regexp = "[+0-9]{12,13}+", message = validationContactValue)
    private final String phone;

    public SignUpAccount(String firstName, String lastName, String phone, String password) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPhone() {
        return phone;
    }

}
