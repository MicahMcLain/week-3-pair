package com.techelevator.crm;
import static org.junit.Assert.assertEquals;

import com.techelevator.hr.Employee;
import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class EmployeeBalanceTest {
    @Test
    public void test_getBalanceDue() {
        Employee Dave = new Employee("Dave", "Barn");
        Map<String, Double> costs = new HashMap<>();
        costs.put("Grooming", 10.00);
        costs.put("Walking", 10.00);
        costs.put("sitting", 10.00);

        System.out.println(Dave.getBalanceDue(costs));
        Customer Bernie = new Customer("Bernie", "Chamber");
        System.out.println((Bernie.getBalanceDue(costs)));
        assertEquals("Total cost should be 30.00", 30.0, Bernie.getBalanceDue(costs), 0.001);

        assertEquals("Total should be 25", 25.0, Dave.getBalanceDue(costs), 0.001);



    }
}
