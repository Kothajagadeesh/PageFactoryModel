# README

**Tools used**

- TestNg -> Unit Testing Framework
- Maven -> Build Tool
- ReportNG -> For HTML Report Generations
- Log4j -> logging for Java
- Git -> Version control
- Application -> [Automation Practice](http://automationpractice.com/index.php)

**How to Execute**
1. Download the Framework from GIT
2. Intellij -> View Tool Windows -> Maven -> Select Desired profile (prod-local-chrome)
3. prod -> Environment (stag, qa, prod)
4. local -> Execution type (local, grid, saucelabs, browser stack)
5. chrome -> Browser type

We can update the profile length with as many values as we can

*Terminal*
- install mvn from Terminal
- navigate to project path from Terminal
- Type "mvn clean install -Denv=prod-chrome-local"  (without quotes) and press enter

**Reports**
- Reports will be generate under test-output folder after execution

**Doc**
Can view the project doc under doc -> index.html

**Tests**
Read TESTCASES.MD
