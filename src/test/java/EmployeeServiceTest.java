import org.junit.jupiter.api.Test;
import org.springframework.util.Assert;

public class EmployeeServiceTest {

    private EmployeeService employeeService = new EmployeeService();

    @Test
    public void testGetCommonManager() {
        Employee emp50 = new Employee(50, "E50", "", 5, null);
        Employee emp40 = new Employee(40, "E41", "", 4, emp50);
        Employee emp41 = new Employee(41, "E41", "", 4, emp50);
        Employee emp30 = new Employee(30, "E30", "", 3, emp40);
        Employee emp31 = new Employee(31, "E31", "", 3, emp40);
        Employee emp32 = new Employee(32, "E32", "", 3, emp41);
        Employee emp20 = new Employee(20, "E20", "", 2, emp30);
        Employee emp21 = new Employee(21, "E21", "", 2, emp30);
        Employee emp22 = new Employee(22, "E22", "", 2, emp31);
        Employee emp23 = new Employee(23, "E23", "", 2, emp32);
        Employee emp11 = new Employee(11, "E11", "", 1, emp20);
        Employee emp12 = new Employee(12, "E12", "", 1, emp21);
        Employee emp13 = new Employee(13, "E13", "", 1, emp22);
        Employee emp14 = new Employee(14, "E14", "", 1, emp22);
        Employee emp15 = new Employee(15, "E15", "", 1, emp23);

        Assert.isTrue(employeeService.getCommonManager(emp11, emp32).equals("E50"), "test1");
    }
}
