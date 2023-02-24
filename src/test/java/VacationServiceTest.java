import org.example.VacationService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class VacationServiceTest {
    @Test

    public void monthCalculatVacation() {
        VacationService service = new VacationService();
        // int income = 10_000;
        //int expenses = 3000;
        //int threshold = 20_000;
        int expected = 3;
        int actual = service.calculate(10_000, 3000, 20_000);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void monthCalculatVacationTest() {
        VacationService service = new VacationService();
        // int income = 10_000;
        //int expenses = 3000;
        //int threshold = 20_000;
        int expected = 2;
        int actual = service.calculate(100_000, 60_000, 150_000);
        Assertions.assertEquals(expected, actual);
    }


}

// [INFO]  T E S T S
//[INFO] -------------------------------------------------------
//[INFO] Running VacationServiceTest
//[INFO] Tests run: 2, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.178 s - in VacationServiceTest
//[INFO]
//[INFO] Results:
//[INFO]
//[INFO] Tests run: 2, Failures: 0, Errors: 0, Skipped: 0
//[INFO]
//[INFO] ------------------------------------------------------------------------
//[INFO] BUILD SUCCESS
//[INFO] ------------------------------------------------------------------------
//[INFO] Total time:  18.155 s
//[INFO] Finished at: 2023-02-25T01:35:54+03:00
//[INFO] ------------------------------------------------------------------------
//
//Process finished with exit code 0