
In this project you are required to use control-flow testing to analyze a fault-seeded Java program **Printtokens.java**, write JUnit test methods to test the faulty program, and fix faults if found.

[Project slides](./project-slides.pdf)

The project can be divided into two major parts: 
- **preparing test cases**
- **writing test methods**

<hr>

## Test Case Preparation

### Create Control Flow Graph
   - Draw a control flow graph for each method
   - Example shown in [Video](https://youtu.be/lj7HY7ENU8Y)

### Design Test Cases 
   - Create test paths
   - Identity inputs and expected outputs
   - Example Given in [Video](https://youtu.be/xfANxegQJnQ)
   - Useful tool [**Oracle**](./oracle/Printtokens_Oracle.jar): provides the expected outputs for the given inputs. To open it, jre 8 is required.

## Test Method Writing

### Requirements

- [Eclipse IDE](https://riyagoel192.medium.com/how-to-download-eclipse-java-ide-on-windows-52608032d6d9) 
- [Git](https://www.howtogeek.com/832083/how-to-install-git-on-windows/)
- [Java 8](https://www.java.com/en/download/manual.jsp)

Note: you can use other IDEs like Visual Studio Code instead of Eclipse. 

### Write Test Methods with JUnit Locally

1. Launch Git Bash and navigate to the directory where you want to work on your project. 

2. Clone (download) your project.
- Generate a personal access token ([help](https://docs.github.com/en/enterprise-server@3.9/authentication/keeping-your-account-and-data-secure/managing-your-personal-access-tokens))
 
- Clone the project repository in Git Bash:
```
git clone https://<your GitHub access token>@github.com/cse4321/<your repository name>
E.g.: git clone https://ghp_zvmpaRAjpE8UPuxjCXf5Dg3lW11GpC2b@github.com/cse4321/PrinttokensTesting.git
```

3. Write test methods with JUnit in Eclipse IDE. 
- Launch Eclipse IDE and import the project (File -> Open Projects from File System -> select the project folder -> Finish)
- Configure the required JUnit-required jar files
- Study how to write test methods in Branch **eg_junit_tests** first

    - Switch to Branch eg_junit_tests in Git Bash 
    ```
    git checkout eg_junit_tests 
    ```
    - Study and explore how to write test methods in Eclipse IDE in Branch **eg_junit_tests** (resources:[Video](https://youtu.be/DuAqP8IRcbY) and [System Rules](https://stefanbirkner.github.io/system-rules/))

    - Switch to back to Branch **main** in Git Bash 
  ```
  git checkout main 
  ```
  
4. Write your test methods in Branch **main**.


5. Commit and push your work with Git Bash
    - Set up your Git user (if not already configured)
    ```
    git config user.name "your name"
    git config user.email "your email" 
    ```
   - Stage all modified files
    ```
    git add .
    ``` 
   - Commit the changes
    ```
    git commit -m "commit message"
    ``` 
   - push the changes to the project repository in GitHub
    ```
    git push origin main
    ``` 

### Submission
- Check all the deliverables in the [project slides](./project-slides.pdf).
- Put all the non-code files in Branch **main** in a folder "docs".
- Commit the changes before the deadline. 



<hr>

### Configure jar files
There are three jar files required to write JUnit test methods.


1. **Right-click** on the project name in the left pane of the IDE.
2. **Select** "*Build Path*" -> "*Configure Build Path*" to open the Java Build Path window.
3. In the "*Libraries*" tab, **select** "*Classpath*" and then **click** the "*Add External JARs*" button on the right.
4. **Navigate** to the folder that contains the jar files, **select** all of the jar files, and then click the "*Open*" button.
5. Now that all the jar files are added, **click** the "*Apply and Close*" button at the bottom to finish the configuration.



