package functions;

public class Messages {
    public static String ipAddress;
    public static int port;
    public static final String notAllFieldsError = "Пропущено одно или несколько полей. Проверьте данные.";
    public static final String validationFirstName = "Имя должно содержать только буквы в диапазоне от 2 до 20";
    public static final String validationLastName = "Фамилия должна содержать только буквы в диапазоне от 2 до 20";
    public static final String validationContactValue = "Номер телефона должен состоять только из '+' и цифр";
    public static final String validationPassword = "Пароль должен состоять из цифр и букв в диапазоне от 6 до 25";
    public static final String validationSecret = "Секретный код состоит из 4-х цифр";
    public static final String numberExist = "Данный номер уже используется в системе. Попробуйте войти в аккаунт";
    public static final String jsonError = "Ошибка отправки запроса";
    public static final String notFound = "Нет результата";
    public static final String contactOrPasswordError = "Неверный логин или пароль";
    public static final String contactAlreadyConfirmed = "Номер телефона уже подтвержден";
    public static final String unknownError = "Неизвестная ошибка";
    public static final String tokenInvalid = "Неверный токен";
    public static final String newPasswordEqualsNew = "Новый пароль не должен совпадать со старым";
    public static final String confirmationCodeSend = "Код подтверждения отпавлен на указанный номер телефона";
    public static final String confirmationCodeNotEquals = "Неверный код подтверждения";

}
