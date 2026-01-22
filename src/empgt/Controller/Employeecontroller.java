
package empgt.Controller;


public class Employeecontroller {
     public Employee create(Employee e){
        EmployeeService es = new EmployeeService();
        Employee emp = es.save(e);
        return emp;
    }
}


