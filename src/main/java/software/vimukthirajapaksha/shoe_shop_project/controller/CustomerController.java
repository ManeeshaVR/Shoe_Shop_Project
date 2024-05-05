package software.vimukthirajapaksha.shoe_shop_project.controller;

import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import software.vimukthirajapaksha.shoe_shop_project.dto.CustomerDTO;
import software.vimukthirajapaksha.shoe_shop_project.service.CustomerService;

import java.util.List;

@RestController
@RequestMapping("api/v1/customer")
@RequiredArgsConstructor
public class CustomerController {
    private static final Logger logger = LoggerFactory.getLogger(CustomerController.class);

    private final CustomerService customerService;

    @GetMapping("/check")
    public String checkTest(){
        logger.info("Customer Checked");
        return "Customer Check Test";
    }

    @PostMapping
    public CustomerDTO saveCustomer(@RequestBody CustomerDTO customer) {
        logger.info("Saving customer: {}", customer);
        return customerService.saveCustomer(customer);
    }

    @GetMapping
    public List<CustomerDTO> getAllCustomers() {
        logger.info("Fetching all customers");
        return customerService.getAllCustomers();
    }

    @GetMapping("/{id}")
    public CustomerDTO getCustomerById(@PathVariable String id) {
        logger.info("Fetching customer with ID: {}", id);
        return customerService.getSelectedCustomer(id);
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> updateCustomer(@PathVariable String id, @RequestBody CustomerDTO customerDTO) {
        logger.info("Updating customer with ID: {}", id);
        customerService.updateCustomer(id, customerDTO);
        return ResponseEntity.ok().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteCustomer(@PathVariable String id) {
        logger.info("Deleting customer with ID: {}", id);
        customerService.deleteCustomer(id);
        return ResponseEntity.ok().build();
    }
}
