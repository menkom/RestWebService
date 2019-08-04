package info.mastera;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Main part with @RestController
 */
@RestController
public class CustomerController {

    @RequestMapping("/customer")
    public Customer get() {
        Customer customer = new Customer();
        customer.setId(1);
        customer.setCustomerName("customer name");
        customer.setTelephone("telephone");
        return customer;
    }
}