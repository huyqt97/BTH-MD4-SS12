package ss12.th.service;

import ss12.th.model.Customer;

import java.util.List;

public interface iGenericService {
    List<Customer> findAll();

    void save(Customer customer);

    Customer findById(int id);

    void update(int id, Customer customer);

    void remove(int id);

}
