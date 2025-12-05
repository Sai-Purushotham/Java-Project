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
![Main UI](screenshots/ui-1.png<img width="526" height="589" alt="image" src="https://github.com/user-attachments/assets/c6259cd4-196b-4c6b-aeb0-c0ba3befdb2c" />
)

### 🔹 Password Generation  
![Password Generation](screenshots/ui-2.png)

### 🔹 Saved Passwords  
![Saved File](screenshots/ui-3.png)

> ⚠️ **NOTE:**  
Place your screenshots inside a folder called **`screenshots/`** in your GitHub repo, and rename them to:  
`ui-1.png`, `ui-2.png`, `ui-3.png`  
(or update the paths in README)

---

## 📁 Project Structure

SAIPASSWORDGUI/
│
├── src/
│ └── com/sai/passwordgui/
│ ├── Main.java
│ ├── PasswordGUI.java
│ ├── PasswordGenerator.java
│ ├── PasswordStrengthChecker.java
│
├── passwords.txt (auto-generated after saving)
└── README.md

yaml
Copy code

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
