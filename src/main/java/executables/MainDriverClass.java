package executables;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;


import javafx.util.Pair;
import org.openjdk.jmh.annotations.*;
import org.openjdk.jmh.runner.RunnerException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

import elements.HomePageElements;
import elements.LoginPageElements;

@BenchmarkMode(Mode.AverageTime)
@OutputTimeUnit(TimeUnit.MILLISECONDS)
//@State(Scope.Benchmark)
//@Fork(value = 1, jvmArgs = {"-Xms2G", "-Xmx2G"})

public class MainDriverClass{

	static WebDriver driver;
	static WebDriverWait wait;
	static LoginPageElements loginPageElements;
	static Login login;
	static HomePageElements homePageElements;
	static Proposals proposals;

	static ArrayList<Pair> users;

	static int count = 0;

	public static void main(String[] args) {
		//System.setProperty("webdriver.chrome.driver", "chromedriver\\chromedriver.exe");
		//ChromeOptions options = new ChromeOptions();
		//options.setAcceptInsecureCerts(true);
		//options.setHeadless(true);
		
		//driver = new ChromeDriver(options);
		//driver.manage().window().maximize();
		
		//wait = new WebDriverWait(driver,10,1);
		
		//testLogin();
		//testRetrieveProposals();

		//users = new ArrayList<>();

		//get users
		readUsers();

		//Update here to reflect the number of users you are testing for
		int user_count = 4;
		
		for (int i=1; i<=user_count;i++) {
			Pair user = users.get(i-1);
			String username = String.valueOf(user.getKey());
			String password = String.valueOf(user.getValue());

			//testLogin().start();

			//testRetrieveProposals();
			//testRetrieveApprovedProposal();

			//testLogin();


			new Thread() {
				public void run() {
					try {
						testLogin();
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
			}.start();

			count = count + 1;
		}

	}

/*	@Override
	public void run() {
		Thread guruThread1 = new Thread("Guru1");
		Thread guruThread2 = new Thread("Guru2");
		guruThread1.start();
		guruThread2.start();


		int user_count = 4;

		for (int i=1; i<=user_count;i++) {
			Pair user = users.get(i-1);
			String username = String.valueOf(user.getKey());
			String password = String.valueOf(user.getValue());

			try {
				Thread new_test = testLogin();
				new_test.start();
			} catch (IOException e) {
				e.printStackTrace();
			}
			//testLogin().start();

			count = count + 1;
		}
	}*/

	//@Setup
	public static void readUsers(){
		String line = "";
		String split_by = ",";
		BufferedReader bufferedReader;

		users = new ArrayList<>();

		try {
			bufferedReader = new BufferedReader(new FileReader("users/users.csv"));
			line = bufferedReader.readLine();

			while ((line = bufferedReader.readLine()) != null) {
				String[] user_entry = line.split(split_by);
				Pair<String, String> user;
				String username = user_entry[2];
				String password  = user_entry[3];

				user = new Pair<>(username, password);
				users.add(user);

				//System.out.println(username +"  - -  "+password);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	
	//@Setup
	public static void initializeDriver() {
		System.setProperty("webdriver.chrome.driver", "chromedriver\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.setAcceptInsecureCerts(true);
		//options.setHeadless(true);
		
		driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		
		wait = new WebDriverWait(driver,10,1);
	}

	@Threads(3)
	@Benchmark
	@BenchmarkMode(Mode.All)
	public static boolean testLogin() throws IOException {

		String line = Files.readAllLines(Paths.get("users/users.csv")).get(count+1);

		String[] user_entry = line.split(",");
		Pair<String, String> user;
		String username = user_entry[2];
		String password  = user_entry[3];

		System.out.println(username+"  - -  "+password);
		count = count +1;

		initializeDriver();
		login = new Login(driver);
		login.login(username, password);

		driver.close();

		return true;
		//return null;
	}
	
	//@Benchmark
	public static void testRetrieveProposals(String username, String password) throws IOException {
		initializeDriver();
		
		testLogin();
		proposals = new Proposals(driver);
		proposals.retrieveProposals();
	}
	
	//@Benchmark
	public static void testRetrieveApprovedProposal(String username, String password) throws IOException {
		initializeDriver();
		
		testLogin();
		proposals = new Proposals(driver);
		proposals.retrieveApprovedProposal();
	}
}
