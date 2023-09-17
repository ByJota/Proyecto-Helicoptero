package Gui;

import javax.swing.*;
import javax.swing.border.Border;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Menu extends JFrame {
    public Menu(){
        getContentPane().setBackground(Color.orange);
        setTitle("Helicoptero");
        setSize(425, 500);
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  
        setLayout(null);
      
        


        JButton botonAccion1= new JButton("Agregar Helicoptero");
        botonAccion1.setBounds(135, 100, 150, 30);

        JButton botonAccion2= new JButton("Agregar Condicion");
        botonAccion2.setBounds(135, 200, 150, 30);

        JButton botonAccion3= new JButton("Salir");
        botonAccion3.setBounds(135, 300, 150, 30);

        add(botonAccion1);
        add(botonAccion2);
        add(botonAccion3);

        setVisible(true);
    }

     public static void main(String[] args) {
        // Crea una instancia de la ventana
        Menu ventana = new Menu();
        
        // Hacer visible la ventana
    }


}
