package Jan6;

import java.util.Map;

public class Test {

    public static void main(String[] args) {

        EmployeeService service = new EmployeeServiceImpl();
        Map<Integer, Employee> employees = service.getEmployees();
        for(Map.Entry<Integer, Employee> entry : employees.entrySet()) {
         System.out.println("Key (ID): " + entry.getKey());
         System.out.println("Value: " + entry.getValue());
         System.out.println("---");
        }
    }
}
