package Interfaz_Grafica;
import Logica.Accion;

import javax.swing.*;
import javax.swing.border.Border;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Menu extends JFrame {

    private JPanel MenuOriginal;
    public Menu() {
        getContentPane().setBackground(Color.orange);
        setTitle("Helicóptero");
        setSize(425, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(null);

        JButton botonAccion1 = new JButton("Agregar Helicóptero");
        botonAccion1.setBounds(135, 100, 150, 30);

        JButton botonAccion2 = new JButton("Agregar Condicion");
        botonAccion2.setBounds(135, 200, 150, 30);

        JButton botonAccion3 = new JButton("Salir");
        botonAccion3.setBounds(135, 300, 150, 30);

        JButton botonLimpiar = new JButton("Limpiar Ventana");
        botonLimpiar.setBounds(135, 400, 150, 30);

        buttonPanel.add(botonAccion1);
        buttonPanel.add(botonAccion2);
        buttonPanel.add(botonAccion3);
        buttonPanel.add(botonLimpiar);

        MenuOriginal=buttonPanel;

        botonLimpiar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                getContentPane().removeAll();
                getContentPane().setBackground(Color.RED);
                revalidate();
                repaint();
                JButton botonRestaurar = new JButton("Restaurar");
                botonRestaurar.setBounds(50, 200, 300, 30); // Ajusta las coordenadas
                add(botonRestaurar);
                botonRestaurar.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        // Restaura la ventana al estado original
                        getContentPane().removeAll();
                        getContentPane().setBackground(Color.orange);
                        MenuOriginal.setVisible(true);
                        add(MenuOriginal);
                        revalidate();
                        repaint();
                    }
                });
            }
        });
        MenuOriginal=buttonPanel;
        add(buttonPanel, BorderLayout.CENTER);
        setVisible(true);
    }

    public static void main(String[] args) {
        // Crea una instancia de la ventana
        Menu ventana = new Menu();
        
    }
}









    

