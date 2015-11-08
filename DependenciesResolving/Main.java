package depedenciesResolving;

import java.util.HashMap;
import java.util.Map;

public class Main {

	public static void main(String[] args) {
		Map<String, Object> allPackages = new HashMap<>();
		allPackages.put("backbone", "jQuery,underscore");
		allPackages.put("jQuery", "queryJ");
		allPackages.put("underscore", "lodash");
		allPackages.put("queryJ", "[]");
		allPackages.put("lodash", "[]");

		HashMap<String, Object> dependencies = new HashMap<>();
		dependencies.put("projectName", "[Test0000]");
		dependencies.put("dependencies", "backbone");

		InstallDependencies.installModule("backbone", allPackages);

		System.out.println("All done.");
	}
}
