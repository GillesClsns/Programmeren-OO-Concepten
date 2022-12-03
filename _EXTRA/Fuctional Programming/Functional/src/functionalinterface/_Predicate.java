package functionalinterface;

import java.util.function.Predicate;

public class _Predicate {

    public static void main(String[] args) {

        System.out.println("Without predicate:");
        System.out.println(isPhoneNumberValid("0468244664"));
        System.out.println(isPhoneNumberValid("04864668120"));

        System.out.println("With predicate:");
        System.out.println(numberValidation.test("0468244664"));
        System.out.println(numberValidation.test("04864668120"));

        System.out.println(
                "Is phone number valid and contains number 3 = " +
                numberValidation.and(containsNumber3).test("0468344664"));

        System.out.println(
                "Is phone number valid and contains number 3 = " +
                numberValidation.and(containsNumber3).test("0468244664"));

    }

    static Predicate<String> numberValidation = phoneNumber ->
            phoneNumber.startsWith("04") && phoneNumber.length() == 10;

    static Predicate<String> containsNumber3 = phoneNumber ->
            phoneNumber.contains("3");

    static boolean isPhoneNumberValid(String phoneNumber) {
        return phoneNumber.startsWith("04") && phoneNumber.length() == 10;
    }

}
