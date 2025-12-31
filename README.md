# Cardio Web Application

## Location
The source code is located in: `c:\Users\user\Desktop\Deepak`

## Prerequisites
1.  **Java Requirement**: You already have Java 25 installed, which is perfect.
2.  **Maven Requirement**: You need **Apache Maven** to run this project.
    *   Download it from: [https://maven.apache.org/download.cgi](https://maven.apache.org/download.cgi)
    *   Extract the zip file.
    *   Add the `bin` folder from the extracted files to your System Environment Variables (Path).

## How to Run

### Option 1: Command Line (Terminal)
1.  Open your terminal (Command Prompt or PowerShell).
2.  Navigate to the project folder:
    ```powershell
    cd c:\Users\user\Desktop\Deepak
    ```
3.  Run the application:
    ```powershell
    mvn spring-boot:run
    ```
4.  Once started, open your browser and go to:
    [http://localhost:8080](http://localhost:8080)

### Option 2: Using an IDE (Easier)
1.  Download **IntelliJ IDEA** (Community Edition is free) or **Eclipse**.
2.  Open the IDE and select "Open Project".
3.  Select the `c:\Users\user\Desktop\Deepak` folder.
4.  The IDE will automatically detect the `pom.xml` and set up Maven for you.
5.  Locate `src/main/java/com/medical/cardio/CardioApplication.java`, right-click it, and select "Run".
