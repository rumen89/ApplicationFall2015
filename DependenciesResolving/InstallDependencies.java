package DependenciesResolving;

import java.io.File;
import java.io.IOException;
import java.util.Map;

public class InstallDependencies {

	public static void installModule(String moduleName,
			Map<String, Object> json) {
		if (json.get(moduleName) == "[]") {
			if (isModuleInPackages(moduleName)) {
				System.out.println(moduleName + " is already installed.");
			} else {
				createPackage(moduleName);
				System.out.println("Installing " + moduleName);
			}
		} else {
			Object module = json.get(moduleName);
			String nextModule = (String) module;
			System.out.println("Installing " + moduleName);
			if (nextModule.contains(",")) {
				String[] splitName = nextModule.split(",");
				String nameOne = splitName[0];
				String nameTwo = splitName[1];
				System.out.println("In order to install " + moduleName
								+ " you need to install " + nameOne + " and "
								+ nameTwo);
				installModule(nameOne, json);
				installModule(nameTwo, json);
			} else {
				System.out.println("In order to install " + moduleName
						+ " you need to install " + nextModule);
				installModule(nextModule, json);
			}
		}
	}

	private static boolean isModuleInPackages(String module) {
		File file = new File(
				"D:\\Documents\\HackBulgaria\\ApplicationFall2015\\src\\installed_modules");
		File[] listOfFiles = file.listFiles();
		for (int i = 0; i < listOfFiles.length; i++) {
			if (listOfFiles[i].isFile()) {
				if (listOfFiles[i].getName().equals(module)) {
					return true;
				}
			} else {
				return false;
			}
		}
		return false;
	}

	private static void createPackage(Object object) {
		String nameNewFile = "D:\\Documents\\HackBulgaria\\ApplicationFall2015\\src\\installed_modules\\"
				+ object;
		File newModule = new File(nameNewFile);
		try {
			if (newModule.createNewFile()) {
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
