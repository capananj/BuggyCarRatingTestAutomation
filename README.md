Selenium-Java-Cucumber test automation framework to test Buggy Car Ratings

**Top Five Functionalities Covered:**

1. Register
2. Login
3. Vote
4. View Profile
5. Logout


**Tools Required:** JDK 1.8, Intellij/Eclipse, ChromeDriver compatible with browser version

**How to run the test ?**
- Create a directory
- Use commandline, terminal or git bash to go to the directory location 
- Go to the repository location in Github and copy the https github link to clone this repo (You can find it by clicking "Code" button inside the repository )
- Run the command:  git clone <copiedlink>
- Once you see 100% and done, the project has completed downloading
- Now open the project using intellij
- In BaseClass.java line 12: change the location of the chrome driver to the one on your machine
- Create a new Junit Run/Debug config in intellij with following
    Name: TestRunnerConfig
    Class: TestRunner.testbuggycarratingrunner
    Working directory: \$MODULE_WORKING_DIR\$
    Classpath of module: buggycarsrating-automation.test
- Click apply
- Run this config by clicking the run symbol in Intellij  **(OR)** 
  Open the testbuggycarratingrunner.java file and right click and choose Run 'testbuggycarratingrunner'




