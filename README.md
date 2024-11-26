Project Overview
This project implements control flow testing on a string tokenizer program (Printtokens.java). The main objectives achieved include:

Created Control Flow Graphs (CFG) for all methods
Implemented edge coverage testing strategy
Detected and fixed multiple faults in the original code
Generated comprehensive test cases with JUnit
Achieved high code coverage using JaCoCo

Key Achievements

Successfully identified and fixed bugs in the original implementation
Developed separate test suites for main and non-main methods
Implemented thorough edge coverage testing
Created detailed documentation including CFGs and test cases
Maintained clean separation between original and fixed implementations

Project Structure
Copyproject-root/
├── src/
│   ├── main/java/
│   │   ├── Printtokens.java           # Original file with faults
│   │   └── FixedPrinttokens.java      # Fixed version
│   └── test/java/
│       ├── MainMethod.java            # Test cases for original main method
│       ├── NonMainMethods.java        # Test cases for original non-main methods
│       ├── FixedMainMethod.java       # Test cases for fixed main method
│       └── FixedNonMainMethods.java   # Test cases for fixed non-main methods
└── deliverables/
    ├── CFG.pdf                        # Control Flow Graphs for all methods
    ├── Test Cases.pdf                 # Detailed test cases documentation
    ├── Code Coverage Reports.zip      # JaCoCo coverage reports
    ├── Faults and Corrections.pdf     # Documentation of found and fixed faults
    ├── Summary and Discussion.pdf     # Project analysis and conclusions
    └── README.txt
Technical Implementation
Token Types Handled

Keywords (and, or, if, xor, lambda, =>)
Special Symbols ((, ), [, ], ', `, ,)
Identifiers (letter-based variables)
Number Constants
String Constants
Character Constants
Comments
Error handling

Testing Strategy

Unit Testing: Edge coverage for all non-main methods
Program Testing: Edge coverage for the main method
Comprehensive test cases for both original and fixed implementations
Integration of JaCoCo for code coverage analysis

Prerequisites

Java JDK 8 or higher
Maven
IntelliJ IDEA

Setting Up the Project

Clone the repository
Import as Maven project in IntelliJ:

File -> Open
Navigate to and select the project's root directory
Click 'Open as Project'
IntelliJ will automatically detect it as a Maven project and set it up



Running the Tests
Using IntelliJ

Right-click on the project in Project Explorer
Select Run 'All Tests'

OR
Run individual test classes:

Open the test file (e.g., MainMethod.java)
Click the green play button next to the class name
Select 'Run <TestClassName>'

OR
Run a specific test method:

Click the green play button next to the test method
Select 'Run <TestMethodName>'

Using Maven Command Line
Navigate to the project root directory and run:
bashCopymvn test
Viewing Code Coverage Reports
Using IntelliJ's Built-in Coverage

Right-click on the project/test file
Select 'More Run/Debug' -> 'Run with Coverage'
Coverage results will be displayed in the Coverage tool window

Using JaCoCo Reports

Run Maven test command:

bashCopymvn test

Find the generated reports in:

Copytarget/site/jacoco/index.html
Deliverables Description

CFG.pdf: Contains Control Flow Graphs for all methods with corresponding source code and basic block tables
Test Cases.pdf: Detailed documentation of test paths, test data, and expected outputs
Code Coverage Reports.zip: Complete coverage analysis for both unit and program-level testing
Faults and Corrections.pdf: Detailed analysis of detected faults and their fixes
Summary and Discussion.pdf: Project overview, challenges, and conclusions
README.txt: Project setup and execution instructions

Notes

All test cases are designed to achieve edge coverage
Test files are organized to separate main method and non-main method testing
Both original (faulty) and fixed versions are tested independently
Coverage reports are generated separately for unit tests and program-level tests
