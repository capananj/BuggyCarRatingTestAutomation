Selenium-Java-Cucumber-Gradle test automation framework to test Buggy Car Ratings

**Top Five Functionalities Covered:**

1. Register
2. Login
3. Vote
4. View Profile
5. Logout


**Tools Required:** JDK 1.8, Intellij/Eclipse, Cucumber, Gherkin, Gradle, Chrome Browser, ChromeDriver compatible with the installed chrome version(latest version is preferable)

**How to run the test ?**
- Create a directory
- Use commandline or terminal or git bash and go to the directory location 
- Go to the repository location in Github and copy the https github link to clone this repo (You can find it by clicking "Code" button inside the repository )
- Run the command:  git clone <copiedlink>
- Once you see 100% and done, the project has completed downloading
- Now open the project using intellij
- In BaseClass.java line 12: change the location of the chrome driver to the one on your machine
- Create a new Junit Run/Debug config in intellij or eclipse with following
    Name: TestRunnerConfig
    Class: TestRunner.testbuggycarratingrunner
    Working directory: \$MODULE_WORKING_DIR\$
    Classpath of module: buggycarsrating-automation.test
- Click apply
- Run "TestRunnerConfig" by clicking the run symbol in Intellij  **(OR)** 
  Open the testbuggycarratingrunner.java file, right click and select  Run'testbuggycarratingrunner'




