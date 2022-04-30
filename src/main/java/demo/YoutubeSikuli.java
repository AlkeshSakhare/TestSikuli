package demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

import io.github.bonigarcia.wdm.WebDriverManager;

public class YoutubeSikuli {

	public static void main(String[] args) throws FindFailed {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.youtube.com/watch?v=07R_gvjIjdA");

		Screen screen = new Screen();

		Pattern pause = new Pattern("D:\\Alkesh\\Course\\Adv Java\\TestSikuli\\pause.png");
		screen.wait(pause, 2000);
		screen.click();
		screen.click();

		Pattern play = new Pattern("D:\\Alkesh\\Course\\Adv Java\\TestSikuli\\play.png");
		screen.wait(play, 2000);
		screen.click();
		screen.click();

		Pattern settings = new Pattern("D:\\Alkesh\\Course\\Adv Java\\TestSikuli\\settings.png");
		screen.wait(settings, 2000);
		screen.click();

		Pattern Auto360 = new Pattern("D:\\Alkesh\\Course\\Adv Java\\TestSikuli\\Auto 360.png");
		screen.wait(Auto360, 2000);
		screen.click();

		Pattern Auto244 = new Pattern("D:\\Alkesh\\Course\\Adv Java\\TestSikuli\\244.png");
		screen.wait(Auto244, 2000);
		screen.click();
	}

}
