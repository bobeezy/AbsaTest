package testSuites;

/**
 * @author lionel.mangoua
 * date: 03/07/20
 */

import main.java.Engine.DriverFactory;
import main.java.api.TaskOneMethods;
import org.testng.annotations.Test;
import ru.yandex.qatools.allure.annotations.Description;
import ru.yandex.qatools.allure.annotations.Features;
import ru.yandex.qatools.allure.annotations.Stories;

public class TaskOneTest extends DriverFactory {

    TaskOneMethods taskOne = new TaskOneMethods();

    @Features("ABSA Task 1")
    @Description("Perform an API request to produce a list of all dog breeds")
    @Stories("Task 1.a")
    @Test(priority = 0)
    public void GetListOfAllBreeds() {

        response = taskOne.getListOfAllBreeds();
        taskOne.validateGetListOfAllBreeds(response, 200);

        System.out.println("\n=============== GetListOfAllBreeds test executed successfully ===============\n");
    }

    @Features("ABSA Task 1")
    @Description("Verify “retriever” breed is within the list")
    @Stories("Task 1.b")
    @Test(priority = 1)
    public void VerifyRetriever() {

        response = taskOne.getListOfAllBreeds();
        taskOne.validateVerifyRetriever(response, 200);

        System.out.println("\n=============== VerifyRetriever test executed successfully ===============\n");
    }

    @Features("ABSA Task 1")
    @Description("Perform an API request to produce a list of sub-breeds for “retriever”")
    @Stories("Task 1.c")
    @Test(priority = 2)
    public void GetListOfSubBreeds() {

        response = taskOne.getListOfSubBreeds();
        taskOne.validateGetListOfSubBreeds(response, 200);

        System.out.println("\n=============== GetListOfSubBreeds test executed successfully ===============\n");
    }

    @Features("ABSA Task 1")
    @Description("Perform an API request to random image/link for the sub-breed “golden”")
    @Stories("Task 1.d")
    @Test(priority = 3)
    public void GetImageRandom() {

        response = taskOne.getImageRandom();
        taskOne.validateGetImageRandom(response, 200);

        System.out.println("\n=============== GetImageRandom test executed successfully ===============\n");
    }
}
