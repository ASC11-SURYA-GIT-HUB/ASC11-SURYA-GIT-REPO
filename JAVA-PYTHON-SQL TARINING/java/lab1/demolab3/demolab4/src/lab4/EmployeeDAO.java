package lab4;


import java.util.List;
import java.util.ArrayList;

import lab4.Employee;  // Assuming Employee.java is also in the lab4 package


public class EmployeeDAO {
    private List<Employee> employees = new ArrayList<>();

    // Add new employee
    public void addEmployee(Employee emp) {
        employees.add(emp);
    }

    // Get all employees
    public List<Employee> getAllEmployees() {
        return employees;
    }

    // Get by ID
    public Employee getEmployeeById(int empNo) {
        for (Employee emp : employees) {
            if (emp.getEmpNo() == empNo) return emp;
        }
        return null;
    }

    // Delete by ID
    public void deleteEmployee(int empNo) {
        employees.removeIf(emp -> emp.getEmpNo() == empNo);
    }

    // Update salary
    public void updateSalary(int empNo, double newSalary) {
        for (Employee emp : employees) {
            if (emp.getEmpNo() == empNo) {
                employees.set(employees.indexOf(emp),
                        new Employee(empNo, emp.getFirstName(), emp.getLastName(), emp.getCity(), newSalary));
                break;
            }
        }
    }
}

