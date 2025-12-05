# 🔐 Sai Password Pro  
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
🛠️ Tech Stack
Language: Java 17

GUI Framework: Swing

Security: SecureRandom for cryptographic password generation

UI Components: JProgressBar for visual strength indicators

🚀 Getting Started
Prerequisites
Java 17 or higher installed

Basic command-line knowledge

Installation & Running
Step 1: Navigate to source directory

bash
cd src
Step 2: Compile the project

bash
javac com/sai/passwordgui/*.java
Step 3: Run the application

bash
java com.sai.passwordgui.Main
The application window will open immediately, and you're ready to generate and check passwords!

💡 Usage Guide
Generating Passwords
Open the Password Generator tab

Set your desired password length

Select which character types to include

Click "Generate" to create passwords

Review the strength indicator

Click "Save" to store passwords in passwords.txt

Checking Password Strength
Switch to the Password Strength Checker tab

Enter your password in the input field

View the instant strength analysis

Check the color-coded strength bar for visual feedback

🔒 Security Considerations
Uses SecureRandom for cryptographically secure password generation

Passwords are stored locally in passwords.txt (consider encrypting sensitive data)

No external dependencies or internet connection required

All processing happens on your machine

🎨 UI/UX Features
Clean, intuitive interface with tabbed navigation

Real-time feedback and instant calculations

Color-coded strength indicators for quick visual assessment

Responsive design that works across different screen sizes

Lightweight and fast performance

📋 Requirements
Java: Version 17 or higher

RAM: Minimal (< 50MB)

Disk Space: < 5MB

🤝 Contributing
Found a bug or have a feature suggestion? Feel free to open an issue or submit a pull request!

📝 License
This project is open-source and available under the MIT License.

📧 Contact & Support
For questions or feedback about Password Pro, feel free to reach out or open an issue on the repository.
