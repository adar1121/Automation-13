import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.awt.*;
import java.awt.event.InputEvent;

public class RobotTest {

    public static void main(String[] args) throws AWTException {
        Robot robot = new Robot();

        robot.mouseMove(150,300);
        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        robot.delay(500);
        robot.mouseMove(150,330);
        robot.delay(500);
        robot.mouseMove(180,330);
        robot.delay(500);
        robot.mouseMove(180,300);
        robot.delay(500);
        robot.mouseMove(150,300);
        robot.delay(500);

        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
    }
}
