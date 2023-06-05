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
        costs.put("Grooming", 20.00);
        costs.put("Walking", 10.00);
        costs.put("sitting", 30.00);

        Customer Bernie = new Customer("Bernie", "Chamber");

        assertEquals("Total cost should be 30.00", 20.00+10.00+30.00, Bernie.getBalanceDue(costs), 0.001);

        assertEquals("Total should be 25", 20.00+5.00+30.00, Dave.getBalanceDue(costs), 0.001);



    }
}
