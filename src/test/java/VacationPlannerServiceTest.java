import org.junit.Test;
import org.junit. jupiter .api. Assertions;
import ru.netology.package_1.javaqamvn.services.VacationPlannerService;

public class VacationPlannerServiceTest {
    VacationPlannerService plannerService = new VacationPlannerService();

    @Test
    public void testVacationPlannerServiceWithThreeMonthsOfRest(){
        int vacations = plannerService.calculateVacationMonths(10000, 3000, 20000);
        Assertions.assertEquals(3, vacations);
    }

    @Test
    public void testVacationPlannerServiceWithTwoMonthsOfRest(){
        int vacations = plannerService.calculateVacationMonths(100000, 60000, 150000);
        System.out.println(vacations);
        Assertions.assertEquals(2, vacations);
    }
}
