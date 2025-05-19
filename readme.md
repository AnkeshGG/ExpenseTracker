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

![Screenshot 2025-05-19 123623](https://github.com/user-attachments/assets/44be6255-f351-40d0-b250-fce415c414a3)
![Screenshot 2025-05-19 123752](https://github.com/user-attachments/assets/caa2b5fa-1fb9-431a-a935-68a3ad6ca659)
![Screenshot 2025-05-19 123837](https://github.com/user-attachments/assets/9293a5da-0025-46cf-8240-314afaaaac52)
![Screenshot 2025-05-19 123936](https://github.com/user-attachments/assets/600c6402-d9de-4246-8148-d7c85650cbfb)
![Screenshot 2025-05-19 123945](https://github.com/user-attachments/assets/fbc4b0cb-ed1d-4071-b0ad-b45fd48d3dfc)

## Technical Details

- 📌 **Programming Language:** Java
- 📌 **GUI Framework:** Java Swing
- 📌 **Database:** SQLite (`sqlite-jdbc-3.49.1.0.jar` required)
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

---

© 2025 Ankesh Kumar. All rights reserved.
