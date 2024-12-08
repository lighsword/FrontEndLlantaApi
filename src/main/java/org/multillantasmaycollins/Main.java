package org.multillantasmaycollins;


import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            IniciarSesion login = new IniciarSesion();
            login.setVisible(true);  // Ahora esto funcionará
        });
    }
}