package Gui;
import javax.swing.*;
import javax.swing.border.Border;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Interfaz extends JFrame{

    public Interfaz(){
        
        getContentPane().setBackground(Color.orange);
        setTitle("Helicoptero");
        setSize(800, 500);
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  
        setLayout(null);
        JTextArea cuadroTexto = new JTextArea();
        cuadroTexto.setRows(5);
        cuadroTexto.setColumns(40);
        cuadroTexto.setEnabled(false);
        cuadroTexto.setBounds(486,1,300,400);
        cuadroTexto.setText("Hola");
        Border border = BorderFactory.createLineBorder(Color.BLACK);
        cuadroTexto.setBorder(border);
        


        JButton botonAccion= new JButton("Iniciar programa");
        botonAccion.setBounds(565, 425, 150, 30);

        add(cuadroTexto);
        add(botonAccion);

        setVisible(true);
    }

    public static void main(String[] args) {
        // Crea una instancia de la ventana
        Interfaz ventana = new Interfaz();
        
        // Hacer visible la ventana
    }
}

