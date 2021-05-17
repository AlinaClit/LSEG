import org.springframework.stereotype.Service;

import java.util.LinkedList;
import java.util.List;

@Service
public class EmployeeService {

    public EmployeeService() {
    }

    public String getCommonManager(Employee employee1, Employee employee2) {
        List<Employee> managers1 = getManagersList(employee1);
        Employee manager2 = employee2.getManager();
        while(manager2 != null) {
            if (managers1.contains(manager2)) {
                return manager2.getName();
            } else {
                manager2 = manager2.getManager();
            }
        }
        return null;
    }

    private List<Employee> getManagersList(Employee employee) {
        List<Employee> managers = new LinkedList<>();
        while (employee != null) {
            managers.add(employee.getManager());
            employee = employee.getManager();
        }
        return managers;
    }
}