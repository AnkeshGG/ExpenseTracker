# Expense Tracker - Java Swing Application

## Overview

Expense Tracker is a **simple yet powerful** expense management application built using **Java Swing**. It helps users log, categorize, and visualize their spending habits efficiently. Designed with a **user-friendly interface**, the application ensures ease of use while leveraging database integration for persistent storage.

## Features

- ✔ **Intuitive UI:** A clean, modern interface built with **Java Swing**, ensuring a smooth user experience.
- ✔ **Expense Management:** Add, view, and delete expenses based on categories like **Food, Transport, Entertainment, and Utilities**.
- ✔ **Data Persistence:** Uses **SQLite** to store expenses in a local database (`expenses.db`).
- ✔ **Expense Visualization:** Generates pie charts using **JFreeChart** for better insights into spending patterns.
- ✔ **Dynamic Theming:** Theme properties (`theme.properties`) allow UI customization with colors, fonts, and layouts.
- ✔ **Error Handling:** Proper exception management for invalid inputs and database connection failures.

## Screenshots

*(Include images of your application's UI here!)*

## Technical Details

- 📌 **Programming Language:** Java
- 📌 **GUI Framework:** Java Swing
- 📌 **Database:** SQLite (`sqlite-jdbc-x.x.x.jar` required)
- 📌 **Charting Library:** JFreeChart (for visualizing expense data)
- 📌 **Layout Management:** `GridLayout` and `BoxLayout` for UI structuring
- 📌 **Event Handling:** ActionListeners for user interactions

## How to Run

### Prerequisites:

- ✔ Install **JDK (Java Development Kit)**
- ✔ Download required libraries (`sqlite-jdbc` & `jfreechart.jar`)

### Run the Application:

1️⃣ **Compile the source code:**
```sh
javac ExpenseTracker.java
```

2️⃣ **Execute the program:**
```sh
java ExpenseTracker
```

## Usage Guide

### Expense Management:
* **Adding Expenses:** Enter expense name, amount, select category, and click "Add Expense".
* **Viewing Expenses:** Click "View Expenses" to generate a **visual breakdown** using charts.
* **Deleting Expenses:** Select an entry from the table and remove it.

### Database Connectivity:
* The application automatically creates `expenses.db` upon first run.
* To manually check the database, open SQLite and run:
```sql
SELECT * FROM expenses;
```

## Design Highlights

### 🎨 **Theme Customization:**
* Configurable via `theme.properties`, allowing changes in **background color, button style, font, etc.**

### 📊 **Data Visualization:**
* Uses **JFreeChart** for generating Pie Charts based on spending categories.

## Future Enhancements

- 🔹 **Multi-user Support:** Different users can maintain their own expense records.
- 🔹 **Export Data:** CSV or PDF export functionality for reports.
- 🔹 **Budget Alerts:** Set spending limits and receive warnings.
- 🔹 **Customizable Themes:** More styling options for user personalization.

## About the Author

This project was developed by **Ankesh Kumar**, combining UI/UX principles with efficient **backend data management**. It serves as both a learning experience and a practical tool for financial tracking.

© 2025 Ankesh Kumar. All rights reserved.