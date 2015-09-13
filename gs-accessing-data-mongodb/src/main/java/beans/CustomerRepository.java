package beans;

import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

/**
 * Created by vizewang on 2015/9/13.
 */
public interface CustomerRepository extends MongoRepository<Customer,String>{
    public Customer findByFirstName(String firstName);
    public List<Customer> findByLastName(String lastName);
}
