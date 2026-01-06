
package Jan6;

import java.util.HashMap;
import java.util.Map;

public class EmployeeServiceImpl implements EmployeeService{
    @Override
    public Map<Integer, Employee> getEmployees() {

        Map<Integer, Employee> map = new HashMap<>();
        map.put(101, new Employee(101, "Sania", 30000, 25));
        map.put(102, new Employee(102, "Afrin", 35000, 28));
        map.put(103, new Employee(103, "Swarna", 40000, 30));
        map.put(104, new Employee(104, "Nadia", 45000, 32));

        return map;
    }
}
    
