🔐 Password Pro
A modern, lightweight GUI-based password generator and password strength checker built with Java Swing. Password Pro helps you create secure passwords and validate their strength with an intuitive, user-friendly interface.

🎯 Overview
Password Pro is a desktop application designed to tackle two critical security challenges: generating strong passwords and evaluating password strength. Whether you're setting up new accounts or reviewing existing passwords, this tool provides real-time feedback and a seamless experience.

✨ Features
🔑 Password Generator
Customizable Length: Set your desired password length

Batch Generation: Create multiple passwords at once

Flexible Options:

Lowercase letters

Uppercase letters

Numbers

Special symbols

Real-time Strength Indicator: Visual feedback bar showing password security level

Save to File: Export generated passwords to passwords.txt for easy reference

🔍 Password Strength Checker
Custom Password Analysis: Enter any password to evaluate its strength

Comprehensive Evaluation Criteria:

Length analysis

Character variety (lowercase, uppercase, numbers, symbols)

Pattern detection

Strength Ratings:

Weak

Moderate

Strong

Very Strong 💪

Visual Feedback: Color-coded strength bar for quick assessment

## 🖥️ Application UI Screenshots  

### 🔹 Main Interface  
 <img width="526" height="589" alt="image" src="https://github.com/user-attachments/assets/d78feb60-0e1d-4d55-93c1-7540476834be" />


### 🔹 Password Generation  
<img width="526" height="586" alt="image" src="https://github.com/user-attachments/assets/72fdac9a-04e7-4267-b1bf-a90b222711de" />


### 🔹 Saved Passwords  
<img width="1027" height="454" alt="image" src="https://github.com/user-attachments/assets/ce4a1891-a7ad-49e2-9a49-8f289254ddcb" />



---

## 📁 Project Structure

SAIPASSWORDGUI/
│
├── src/
│   └── com/sai/passwordgui/
│       ├── Main.java                 # Application entry point
│       ├── PasswordGUI.java          # Main UI controller
│       ├── PasswordGenerator.java    # Password gen



---

## 🛠️ Technologies Used
- **Java 17**
- **Swing (GUI)**
- **SecureRandom** for cryptographic password generation
- **JProgressBar** for strength meter UI

---

## ⚙️ How to Run the Project

### **1. Compile**
```bash
cd src
javac com/sai/passwordgui/*.java
2. Run
bash
Copy code
java com.sai.passwordgui.Main
