

## PrinttokensTesting

In this project you are required to use control-flow testing to analyze a fault-seeded Java program **Printtokens.java**, write JUnit test methods to test the faulty program, and fix faults if found.  


### Preparation
- Create a Github account ([help](https://docs.github.com/en/get-started/quickstart/creating-an-account-on-github)).
- Generate a personal access token for Github account ([help](https://docs.github.com/en/enterprise-server@3.9/authentication/keeping-your-account-and-data-secure/managing-your-personal-access-tokens)).
- Install [Eclipse IDE](https://riyagoel192.medium.com/how-to-download-eclipse-java-ide-on-windows-52608032d6d9), [Git](https://www.howtogeek.com/832083/how-to-install-git-on-windows/), and [Java 8](https://www.java.com/en/download/manual.jsp). You can use other IDEs like Visual Studio Code instead of Eclipse. 



### Clone a Private Project 

1. Launch Git Bash in Windows or a terminal in Linux with git installed.

2. Navigate to the desired directory where you want your project resides. 

3. Clone your project:

```
git clone https://<your GitHub access token>@github.com/cse4321/<your repository name>
E.g.:https://ghp_zvmpaRAjpE8UPuxjCXf5Dg3lW11GpC2b@github.com/cse4321/cloudstorage_test.git
```

4. Go inside the project root folder where the main branch by default is downloaded. You can start to write JUnit test methods for the methods in *Printtokens.java* on the main branch. 

5. You can study how to write JUnit test methods by working on the provided example in the branch: eg_junit_tests.

```
git checkout eg_junit_tests
```




### Resources
**Videos**. The recorded videos show the steps to work on this project with examples.
- [Drawing Control Flow Graph](https://youtu.be/lj7HY7ENU8Y)

- [Creating Test Paths, Identifying Test Inputs and Expected Outputs](https://youtu.be/xfANxegQJnQ)

- [Writing Tests and Debugging in Java](https://youtu.be/DuAqP8IRcbY)
 
**Oracle**. [*Printtokens_Oracle.jar*](./oracle/Printtokens_Oracle.jar) an executable jar file that provides the execpted output for the methods in *Printtokens.java* when giving inputs. To run the tool, you need to have jre 8 installed.


**Links**: 
- [System Rules](https://stefanbirkner.github.io/system-rules/)
- [Running and debugging Java](https://code.visualstudio.com/docs/java/java-debugging)

### Configure jar files
There are three jar files required to write JUnit test methods.


1. **Right-click** on the project name in the left pane of the IDE.
2. **Select** "*Build Path*" -> "*Configure Build Path*" to open the Java Build Path window.
3. In the "*Libraries*" tab, **select** "*Classpath*" and then **click** the "*Add External JARs*" button on the right.
4. **Navigate** to the folder that contains the jar files, **select** all of the jar files, and then click the "*Open*" button.
5. Now that all the jar files are added, **click** the "*Apply and Close*" button at the bottom to finish the configuration.



