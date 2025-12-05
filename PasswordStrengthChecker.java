package com.sai.passwordgui;

public class PasswordStrengthChecker {

    public String checkStrength(String password) {
        int score = 0;

        if (password.length() >= 8) score++;
        if (password.length() >= 12) score++;
        if (password.matches(".*[a-z].*")) score++;
        if (password.matches(".*[A-Z].*")) score++;
        if (password.matches(".*[0-9].*")) score++;
        if (password.matches(".*[!@#$%^&*()\\-_=+\\[\\]{}<>?/].*")) score++;

        if (score <= 2) return "Weak";
        if (score <= 4) return "Moderate";
        if (score == 5) return "Strong";
        return "Very Strong 💪";
    }
}
