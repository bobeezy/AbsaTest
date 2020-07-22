# ABSA Assessment Automation framework#

## FEATURES ##

The **ABSA Assessment Automation framework** implements a 'Page Object Model' approach.

Page Object Model(POM) Framework has recently become a very popular test automation framework since it enables easy test maintenance 
and reduces the duplication of code ie. maximizes re-usabilty of code.
The main advantage of POM is that if the UI changes for any page, no tests need to be updated.  
Instead, we just need to change only the code within the page objects ie. only at one place.

Another new feature is the implementation of a new build system called Gradle which replaces 'Ant'.
Gradle nicely combines both Ant and Maven, taking the best from both tools. 
Flexibility from Ant and convention over configuration, dependency management and plugins from Maven.

This Automation framework allows you to run tests on almost any browser and OS. 

It also provides the ability to run locally on Windows, Mac, Ubuntu with minimal changes to any config files.

## TOOLS USED ##

IntelliJ IDE, Java(version 14), Gradle(version 5.2.1), RestAssured, Allure Report, TestNG, SDK(1.8).

---

## FRAMEWORK STRUCTURE ##

### build.gradle files ###
The build.gradle file found on the **Automation framework root folder** contains all the common dependencies that are used in the project

### Engine ###
Contains functionality that form the backbone of the framework
**DriverFactory.java**
- contains configurations to setup and connect to webdriver locally
- specifies the desired capabilities for each browser instance i.e. Browser version, OS/Platform, timeouts etc
- functionality to quit browser/app on completion or failure of a test

### pageObjects ###
- provides the base structure and properties of a page object which extend onto the tests

### utils ###
Contains logic or functionality needed to run tests with efficiency:

**PropertyFileReader.java** - reads element id's, xpaths and other identifier types that are specified in the ".properties" files

**SeleniumUtility.java** - where the custom action methods are stored

---

## EXECUTING TEST SUITE ##
1. Go to top menu bar and navigate to Run > Edit Configurations...
2. On the 'Run/Debug Configurations' window, 'Add New Configuration' by clicking the (+) at the top-left corner
3. Select 'Gradle'
4. Then fill in the fields below:
	* Gradle projects: AbsaTest (Navigate to the project location)
	* Tasks: clean run_test
	* Arguments: --stacktrace
5. Press 'Apply', then 'Ok' button
6. Finally to run the test
	* Press the Green Play button
	* Or navigate to Run > Run 'AbsaTest [clean run_test]'
	
## GENERATE ALLURE REPORT on Mac ##
Reference: https://docs.qameta.io/allure/

1. Execute a test

2. From the terminal, navigate to the project root:

	e.g. $ cd ~/Documents/Projects/Java/AbsaTest
	
3. Execute the terminal command: 

	$ allure serve ./build/allure-results/ 
