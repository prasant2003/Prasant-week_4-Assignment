package Assignment4;

import java.util.HashMap;
import java.util.Map;

public class EmployeeManager {
    private HashMap<Integer, Employee> employeeMap;

    // Constructor
    public EmployeeManager() {
        employeeMap = new HashMap<>();
    }

    
    public void addEmployee(Employee employee) {
        employeeMap.put(employee.getId(), employee);
    }

   
    public Employee getEmployee(int id) {
        return employeeMap.get(id);
    }

    // Method to display all employees
    public void displayAllEmployees() {
        for (Map.Entry<Integer, Employee> entry : employeeMap.entrySet()) {
            System.out.println(entry.getValue());
        }
    }

    public static void main(String[] args) {
        EmployeeManager manager = new EmployeeManager();

   
        manager.addEmployee(new Employee("Madhusmita", 101, 10000.56));
        manager.addEmployee(new Employee("Kajal", 102,50000.646));
        manager.addEmployee(new Employee("Hari", 103, 150000.36));

      
        Employee emp = manager.getEmployee(102);
        if (emp != null) {
            System.out.println("Retrieved Employee: " + emp);
        } else {
            System.out.println("Employee not found.");
        }

        // Displaying all employees
        System.out.println("All Employees:");
        manager.displayAllEmployees();
    }
}