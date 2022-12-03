package functionalinterface;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class _Consumer {

    public static void main(String[] args) {

        Customer gilles = new Customer("Gilles", "99999");
        greetCustomer(gilles);

        greetCustomerConsumer.accept(gilles);

        greetCustomerConsumerV2.accept(gilles, false);
    }

    static Consumer<Customer> greetCustomerConsumer = customer ->
            System.out.printf("\nHello %s, thanks for registering. Phone number: %s", customer.customerName, customer.customerPhoneNumber);

    static BiConsumer<Customer, Boolean> greetCustomerConsumerV2 = (customer, showPhoneNumber) ->

            System.out.printf("\nHello %s, thanks for registering. Phone number: %s", customer.customerName,
                    (showPhoneNumber ? customer.customerPhoneNumber
                            : "*".repeat(customer.customerPhoneNumber.length())));

    static void greetCustomer(Customer customer) {

        System.out.printf("\nHello %s, thanks for registering. Phone number: %s", customer.customerName, customer.customerPhoneNumber);
    }

    static class Customer {

        private final String customerName;
        private final String customerPhoneNumber;

        public Customer(String customerName, String customerPhoneNumber) {

            this.customerName = customerName;
            this.customerPhoneNumber = customerPhoneNumber;

        }

    }

}
