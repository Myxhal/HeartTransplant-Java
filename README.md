# HeartTransplant (Java)

## 📝 Description  
This Java application models a **heart transplant selection system** by analyzing patient data and survival statistics to determine the most suitable candidates for a heart transplant. The program reads from a dataset of patient records and survivability rates, creates objects representing each patient and their associated medical data, and calculates survival likelihoods based on age and cause of heart condition.

Through the use of **object-oriented programming (OOP)**, the system organizes complex data into modular classes such as **Patient**, **SurvivabilityByAge**, and **SurvivabilityByCause**, making the program scalable and maintainable. It performs detailed analysis by comparing patient data against survivability metrics and outputs prioritized transplant candidates. 

This project demonstrates real-world problem-solving through data-driven decision logic, advanced **file I/O handling**, and the integration of health-related statistical modeling. It simulates a critical process in the healthcare field, applying algorithmic thinking to prioritize patient care and optimize transplant outcomes.

---

## 🛠️ Technologies  
- Java  
- StdIn / StdOut (for input/output handling)  
- File I/O  
- Object-Oriented Programming (OOP)  

---

## 🚀 How to Run  

1. **Ensure you have all required files** in the same directory:  
   - `HeartTransplant.java`  
   - `HeartTransplantDriver.java`  
   - `Patient.java`  
   - `SurvivabilityByAge.java`  
   - `SurvivabilityByCause.java`  
   - `StdIn.java`  
   - `StdOut.java`  
   - `StdRandom.java`  
   - `data.txt`  

2. **Compile the program**:  
   ```bash  
   javac HeartTransplant.java HeartTransplantDriver.java Patient.java SurvivabilityByAge.java SurvivabilityByCause.java  StdIn.java StdOut.java StdRandom.java
   
3. **Run the program**:  
   ```bash  
   java HeartTransplantDriver  
