# 🛒 DMart Billing System

A comprehensive Java-based billing system that simulates a retail store checkout experience with discount calculations, GST computation, and customer-friendly features.

![DMart Logo](dmart-logo.png)

## 📋 Table of Contents

- [Overview](#overview)
- [Features](#features)
- [Screenshots](#screenshots)
- [Getting Started](#getting-started)
- [Usage](#usage)
- [Discount Structure](#discount-structure)
- [System Requirements](#system-requirements)
- [Installation](#installation)
- [Contributing](#contributing)
- [License](#license)

## 🔍 Overview

The DMart Billing System is a console-based Java application that provides a complete retail billing experience. It handles customer information, item purchases, discount calculations, GST computation, and generates detailed bills with professional formatting.


## ✨ Features

### �️ Code Architecture

### Key Improvements

- **Array-Based Design**: Refactored from individual variables to efficient arrays
- **Loop-Based Processing**: Eliminated repetitive code with clean loops
- **Maintainable Structure**: Easy to modify and extend functionality

### Array Implementation

```java
// Clean array-based item management
int[] prices = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
int[] quantities = new int[10];
int[] totalPrices = new int[10];
double[] afterDiscountPrices = new double[10];

// Efficient loop-based processing
for (int i = 0; i < 10; i++) {
    // Single loop handles all items
    System.out.printf("%-10s", "Item-" + (i + 1) + ":");
    // Input validation and calculation
}
```

### Benefits of Array Design

- **95% Code Reduction**: Single loop replaces 10 repetitive blocks
- **Easier Maintenance**: Centralized logic for all items
- **Better Scalability**: Simple to add/remove items by changing array size
- **Improved Readability**: Clean, organized code structure

## �🎯 Core Features

- **Customer Management**: Collects customer name and gender information
- **Multi-Item Billing**: Supports 10 different items with individual pricing
- **Smart Discount System**: Automatic discounts based on quantity and total amount
- **Gender-Based Gifts**: Complimentary gifts based on customer gender
- **GST Calculation**: Automatic 10% GST computation
- **Carry Bag Option**: Optional carry bag with additional charge
- **Professional Bill Format**: Well-formatted bill with all details

### 🎨 User Experience

- **Colorful Interface**: Uses ANSI color codes for better visual experience
- **Input Validation**: Robust validation for all user inputs
- **Error Handling**: User-friendly error messages with retry options
- **Professional Layout**: Clean and organized bill presentation

### Item Selection Process

![Item Selection](item-selection.png)

### Generated Bill

![Generated Bill](generated-bill.png)

## 🚀 Getting Started

### Prerequisites

- Java Development Kit (JDK) 8 or higher
- Any Java IDE (Eclipse, IntelliJ IDEA, VS Code) or command line

### Quick Start

1. Clone or download the `DMartBillingSystem.java` file
2. Compile the Java file
3. Run the application
4. Follow the interactive prompts

## 💻 Usage

### Step-by-Step Process

1. **Customer Information**

   ```
   Enter name: [Customer Name]
   Enter gender (M/F): [M/F]
   ```

2. **Item Quantities**

   - Enter quantities for 10 different items (1-50 per item)
   - System validates input range automatically

3. **Additional Options**

   ```
   Carry Bag (Y/N): [Y/N]
   ```

4. **Bill Generation**
   - Automatic calculation of totals
   - Discount application
   - GST computation
   - Final bill display

## 💰 Discount Structure

### Item-Level Discounts

- **Items 1-4, 6-10**: 5% discount when quantity ≥ 5
- **Item 5**: Fixed 10% discount regardless of quantity

### Bill-Level Discounts

- **₹10,000+**: 15% additional discount on total bill
- **₹5,000-₹9,999**: 10% additional discount on total bill

### Gift System

- **Male Customers**: Complimentary Ladger Wallet
- **Female Customers**: Complimentary Cadeberry

## 🛠️ System Requirements

- **Java Version**: JDK 8 or higher
- **Operating System**: Windows, macOS, Linux
- **Memory**: Minimum 64MB RAM
- **Storage**: 10MB free space
- **Terminal**: ANSI color support recommended

## 📦 Installation

### Method 1: Command Line

```bash
# Navigate to the file directory
cd path/to/DMartBillingSystem.java

# Compile the Java file
javac DMartBillingSystem.java

# Run the application
java DMartBillingSystem
```

### Method 2: IDE

1. Open your preferred Java IDE
2. Import or open the `DMartBillingSystem.java` file
3. Build and run the project

### Key Components

- **Input Validation**: Robust validation for all user inputs
- **Discount Engine**: Sophisticated discount calculation logic
- **Bill Generator**: Professional bill formatting and display
- **Color Management**: ANSI color codes for enhanced UI

### Color Codes

```java
String RESET = "\u001B[0m";
String RED = "\u001B[31m";
String GREEN = "\u001B[32m";
```

## 🔧 Customization

### Adding ItemsBillingSystem

1. Declare priceBillingSystem variables
2. Add quantity validation loop
3. Include in total calculations
4. Update bill display format

### Modifying Discounts

- Edit discount percentages in the calculation logic
- Adjust threshold values for bill-level discounts
- Customize gift options

### Changing Colors

- Modify ANSI color codes for different themes
- Add colorBillingSystem constants as needed

## 🐛 Troubleshooting

### Common Issues

1. **Colors not displaying**: Terminal may not support ANSI colors
2. **Input validation errors**: Ensure correct input format
3. **Compilation errors**: Check Java version compatibility
