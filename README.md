# 🔐 Password Pro  
A modern, lightweight, GUI-based password generator and password strength checker built using **Java Swing**.  
This project allows users to generate secure passwords, check password strength, and save generated passwords to a file — all with a clean and user-friendly interface.

---

## 🚀 Features

### ✅ Password Generator
- Choose password length  
- Generate multiple passwords at once  
- Options:  
  - ✔ Lowercase  
  - ✔ Uppercase  
  - ✔ Numbers  
  - ✔ Symbols  
- Real-time **strength indicator bar**  
- Save passwords to `passwords.txt`

### 🔍 Password Strength Checker
- Enter any custom password  
- Checks strength based on:  
  - Length  
  - Lowercase  
  - Uppercase  
  - Numbers  
  - Symbols  
- Displays rating:  
  - Weak  
  - Moderate  
  - Strong  
  - Very Strong 💪  
- Also shows bottom **strength bar** with color coding

---

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
