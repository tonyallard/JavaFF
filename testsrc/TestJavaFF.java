import java.io.File;

import javaff.JavaFF;
import javaff.data.Plan;

import org.junit.Test;

public class TestJavaFF {

	private static final String DRIVER_LOG_PATH = "./problems/driverlog/";
	private static final String DEPOTS_PATH = "./problems/depots/";
	private static final String ROVERS_PATH = "./problems/rovers/";

	private static final String DOMAIN_FILE = "domain.pddl";

	/**
	 * Run JavaFF on IPC3 Driver Log Domain problems
	 */
	@Test
	public void testDriverLog() {
		File domainFile = new File(DRIVER_LOG_PATH + DOMAIN_FILE);
		File dir = new File(DRIVER_LOG_PATH);
		File[] directoryListing = dir.listFiles();
		if (directoryListing != null) {
			for (File problemFile : directoryListing) {
				if (!problemFile.getName().endsWith(DOMAIN_FILE)) {
					Plan plan = JavaFF.plan(domainFile, problemFile);
					plan.print(System.out);
				}
			}
		}
	}
	
	/**
	 * Run JavaFF on IPC3 Depots Domain problems
	 */
	@Test
	public void testDepots() {
		File domainFile = new File(DEPOTS_PATH + DOMAIN_FILE);
		File dir = new File(DEPOTS_PATH);
		File[] directoryListing = dir.listFiles();
		if (directoryListing != null) {
			for (File problemFile : directoryListing) {
				if (!problemFile.getName().endsWith(DOMAIN_FILE)) {
					Plan plan = JavaFF.plan(domainFile, problemFile);
					plan.print(System.out);
				}
			}
		}
	}
	
	/**
	 * Run JavaFF on IPC3 Rovers Domain problems
	 */
	@Test
	public void testRovers() {
		File domainFile = new File(ROVERS_PATH + DOMAIN_FILE);
		File dir = new File(ROVERS_PATH);
		File[] directoryListing = dir.listFiles();
		if (directoryListing != null) {
			for (File problemFile : directoryListing) {
				if (!problemFile.getName().endsWith(DOMAIN_FILE)) {
					Plan plan = JavaFF.plan(domainFile, problemFile);
					plan.print(System.out);
				}
			}
		}
	}
}
