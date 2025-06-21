package Dependency_Injection;


public class CustomerService {
    private final CustomerRepository customerRepository;


    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public void getCustomerDetails(String customerId) {
        String customer = customerRepository.findCustomerById(customerId);
        System.out.println("Fetched: " + customer);
    }
}
