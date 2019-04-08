# Demo serenity-cucumber automation framework using java

The framework is a serenity-cucumber based BDD framework written in Java and has 1 cucumber feature file with 1 scenario. The scenario automates the registration process of facebook using randomly generated data. The framework uses the page object design pattern and is divided into four layers for ease of development and maintenance.

    1. Feature file
    2. Step definitions file
    3. Steps file
    4. Page file


## Prerequisite

1. Make sure Java and Maven has been configured on the system where the test would be executed.
2. Before executing the tests make sure webdriver-manager is installed and up and listening on port 4444 on local machine. The tests were run on webdriver-manager version 12.1.1. Webdriver-manager can be installed using npm package manager
3. The test is designed to run on chrome by default and were run on near latest version of chrome 73.0.3683.86. Tests can also be made to run on firefox from the MyRemoteDriver class by simple setting up desired capabilities to firefox in MyRemoteDriver class.

## Executing the test

To run the demo project, clone it and use below maven command from the command line in the project directory.
```python
mvn clean verify serenity:aggregate
```

## Features
1. BDD framework which provides living documentation
2. Cucumber allows variable data to be inserted for the same scenario in the form of data tables for flexible tests using scenario outline
3. The framework can be easily modified to run tests in parallel by modifying fork counts in the pom.xml file.
4. Very detailed report generated with screenshots are provided for each step of the tests and can be modified easily to capture screenshots only on failure.
5. Various Java libraries like pom.xml makes the framework flexible to extend frameworks to feed data from excel sheets.
6. Can be easily made to run on docker containers
7. serenity.properties file allows user to input various important parameters.

## Report
The final report will be generated on the following path
```python
\\serenitycucumberdemo\target\site\serenity\index.html
```

Below is few screenshots of the report

![image](https://user-images.githubusercontent.com/28183478/55725018-06d4be80-5a50-11e9-92fe-3299806df909.png)
![image](https://user-images.githubusercontent.com/28183478/55724909-be1d0580-5a4f-11e9-8b88-b3f5c2beb0ff.png)


