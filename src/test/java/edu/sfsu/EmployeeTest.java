package edu.sfsu;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.OS;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("EmployeeTest")
class EmployeeTest {
    private final Employee employee = new Employee(12, "Accounting", "Mike", "Accountant");

    @Test
    @DisplayName("Check Reference Counter")
    @EnabledOnOs({OS.MAC})
    void getReferenceCounter() {
        assertEquals(3, new Employee(0, "Taxes", "Fred", "Engineer").getReferenceCounter());
    }

    @Test
    void testSetIdNumber() {
    }

    @Test
    @DisplayName("Retrieve ID Number")
    void getIdNumber() {
        assertEquals(12, employee.getIdNumber());
    }

    @Test
    void getDepartment() {
    }

    @Test
    void getName() {
        // Grouped Assertions
        assertAll("employee",
                ()-> assertEquals(12, employee.getIdNumber()),
                ()-> assertEquals("Mike", employee.getName()),
                ()-> assertEquals("Accountant", employee.getPosition()),
                ()-> assertEquals("Accounting", employee.getDepartment())
        );
    }

    @Test
    void getPosition() {
    }
}