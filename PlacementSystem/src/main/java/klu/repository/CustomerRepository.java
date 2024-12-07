package klu.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import klu.entity.Customer;


@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
