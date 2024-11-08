# AssignmentJava

A simple Java console application to perform various calculations and conversions. The application provides a menu interface, allowing users to select a calculation type and input necessary values. Each calculation type is implemented in its own class, making the code modular and easy to extend.

## Table of Contents

- [Features](#features)
- [Setup and Installation](#setup-and-installation)
- [Usage](#usage)
- [Available Calculations](#available-calculations)
- [Project Structure](#project-structure)
- [Contributing](#contributing)
- [License](#license)

## Features

- Modular design with each calculation implemented in its own class
- Simple, interactive console interface
- Uses Java enums and method references for streamlined execution
- Includes various calculations for common mathematical and conversion tasks

## Setup and Installation

### Prerequisites

- Java 8 or higher
- Maven (optional, for dependency management)

### Installation

1. **Clone the repository**:
    ```bash
    git clone https://github.com/LilithyTv/AssignmentJava.git
    cd AssignmentJava
    ```

2. **Build the project**:
   - If using an IDE (e.g., IntelliJ IDEA or Eclipse), open the project and allow it to load dependencies (if using Maven).
   - If using Maven from the command line:
     ```bash
     mvn clean install
     ```

3. **Run the Application**:
   - From the command line:
     ```bash
     java -cp target/classes com.calculatorapp.CalculatorApp
     ```

   - Or, run the `CalculatorApp` main class from your IDE.

## Usage

After starting the application, you’ll see a menu with a list of calculations. Each option has a corresponding number. To use the application:

1. Enter the number for the calculation you want to perform.
2. Follow the prompts to input the required values.
3. View the result, and repeat or exit as needed.

### Example

```plaintext
Select a calculation:
1. Square of a number
2. Calculate salesperson's salary
3. Convert hours to minutes and seconds
...
Enter your choice: 1
Enter a number: 5
Square: 25
