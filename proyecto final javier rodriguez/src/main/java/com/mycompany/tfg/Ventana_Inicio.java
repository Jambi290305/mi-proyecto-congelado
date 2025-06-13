/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.tfg;

import static com.mycompany.tfg.AccesoBarpibas.buscarProductoPorNombre;
import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author isard
 */
public class Ventana_Inicio extends javax.swing.JFrame {

    /**
     * Creates new form Ventana_Inicio
     */
    public Ventana_Inicio() {
        initComponents();
        ImageIcon imagen = new ImageIcon(getClass().getResource("/carrito.jpg"));
        Icon icono = new ImageIcon(imagen.getImage().getScaledInstance(jLabelCarrito.getWidth(), jLabelCarrito.getHeight(), Image.SCALE_DEFAULT));
        jLabelCarrito.setIcon(icono);
        
        ImageIcon imagen1 = new ImageIcon(getClass().getResource("/blancoluna.png"));
        Icon icono1 = new ImageIcon(imagen1.getImage().getScaledInstance(jLabelInicio.getWidth(), jLabelInicio.getHeight(), Image.SCALE_DEFAULT));
        jLabelPintura1.setIcon(icono1);
        
        ImageIcon imagen2 = new ImageIcon(getClass().getResource("/negro.png"));
        Icon icono2 = new ImageIcon(imagen2.getImage().getScaledInstance(jLabelInicio.getWidth(), jLabelInicio.getHeight(), Image.SCALE_DEFAULT));
        jLabelPintura2.setIcon(icono2);
        
        ImageIcon imagen3 = new ImageIcon(getClass().getResource("/esmaltealuminio.png"));
        Icon icono3 = new ImageIcon(imagen3.getImage().getScaledInstance(jLabelInicio.getWidth(), jLabelInicio.getHeight(), Image.SCALE_DEFAULT));
        jLabelPintura3.setIcon(icono3);
        
        ImageIcon imagen4 = new ImageIcon(getClass().getResource("/rodillo.jpg"));
        Icon icono4 = new ImageIcon(imagen4.getImage().getScaledInstance(jLabelInicio.getWidth(), jLabelInicio.getHeight(), Image.SCALE_DEFAULT));
        jLabelHerramienta1.setIcon(icono4);
        
        ImageIcon imagen5 = new ImageIcon(getClass().getResource("/llanamaestra.jpg"));
        Icon icono5 = new ImageIcon(imagen5.getImage().getScaledInstance(jLabelInicio.getWidth(), jLabelInicio.getHeight(), Image.SCALE_DEFAULT));
        jLabelHerramienta2.setIcon(icono5);
        
        ImageIcon imagen6 = new ImageIcon(getClass().getResource("/brochapremiumprensada.jpg"));
        Icon icono6 = new ImageIcon(imagen6.getImage().getScaledInstance(jLabelInicio.getWidth(), jLabelInicio.getHeight(), Image.SCALE_DEFAULT));
        jLabelHerramienta3.setIcon(icono6);
        
        ImageIcon imagen7 = new ImageIcon(getClass().getResource("/iniciosesion.jpg"));
        Icon icono7 = new ImageIcon(imagen7.getImage().getScaledInstance(jLabelInicio.getWidth(), jLabelInicio.getHeight(), Image.SCALE_DEFAULT));
        jLabelInicio.setIcon(icono7);
        
        ImageIcon imagen8 = new ImageIcon(getClass().getResource("/esmaltealuminio.png"));
        Icon icono8 = new ImageIcon(imagen8.getImage().getScaledInstance(jLabelInicio.getWidth(), jLabelInicio.getHeight(), Image.SCALE_DEFAULT));
        jLabelMasvendido1.setIcon(icono8);
        
        ImageIcon imagen9 = new ImageIcon(getClass().getResource("/rodillo.jpg"));
        Icon icono9 = new ImageIcon(imagen9.getImage().getScaledInstance(jLabelInicio.getWidth(), jLabelInicio.getHeight(), Image.SCALE_DEFAULT));
        jLabelMasvendido2.setIcon(icono9);
        
        ImageIcon imagen10 = new ImageIcon(getClass().getResource("/blancoluna.png"));
        Icon icono10 = new ImageIcon(imagen10.getImage().getScaledInstance(jLabelInicio.getWidth(), jLabelInicio.getHeight(), Image.SCALE_DEFAULT));
        jLabelMasvendido3.setIcon(icono10);
        
        ImageIcon imagen11 = new ImageIcon(getClass().getResource("/menu.png"));
        Icon icono11 = new ImageIcon(imagen11.getImage().getScaledInstance(jLabelInicio.getWidth(), jLabelInicio.getHeight(), Image.SCALE_DEFAULT));
        jLabelMenu.setIcon(icono11);
        
        ImageIcon imagen12 = new ImageIcon(getClass().getResource("/lupa.png"));
        Icon icono12 = new ImageIcon(imagen12.getImage().getScaledInstance(jLabelInicio.getWidth(), jLabelInicio.getHeight(), Image.SCALE_DEFAULT));
        jLabelLupa.setIcon(icono12);
      
    }
    public String correoUsuario;
    Ventana_Inicio(String correo) {
        initComponents();
        this.correoUsuario = correo;
        ImageIcon imagen = new ImageIcon(getClass().getResource("/carrito.jpg"));
        Icon icono = new ImageIcon(imagen.getImage().getScaledInstance(jLabelCarrito.getWidth(), jLabelCarrito.getHeight(), Image.SCALE_DEFAULT));
        jLabelCarrito.setIcon(icono);
        
        ImageIcon imagen1 = new ImageIcon(getClass().getResource("/blancoluna.png"));
        Icon icono1 = new ImageIcon(imagen1.getImage().getScaledInstance(jLabelInicio.getWidth(), jLabelInicio.getHeight(), Image.SCALE_DEFAULT));
        jLabelPintura1.setIcon(icono1);
        
        ImageIcon imagen2 = new ImageIcon(getClass().getResource("/negro.png"));
        Icon icono2 = new ImageIcon(imagen2.getImage().getScaledInstance(jLabelInicio.getWidth(), jLabelInicio.getHeight(), Image.SCALE_DEFAULT));
        jLabelPintura2.setIcon(icono2);
        
        ImageIcon imagen3 = new ImageIcon(getClass().getResource("/esmaltealuminio.png"));
        Icon icono3 = new ImageIcon(imagen3.getImage().getScaledInstance(jLabelInicio.getWidth(), jLabelInicio.getHeight(), Image.SCALE_DEFAULT));
        jLabelPintura3.setIcon(icono3);
        
        ImageIcon imagen4 = new ImageIcon(getClass().getResource("/rodillo.jpg"));
        Icon icono4 = new ImageIcon(imagen4.getImage().getScaledInstance(jLabelInicio.getWidth(), jLabelInicio.getHeight(), Image.SCALE_DEFAULT));
        jLabelHerramienta1.setIcon(icono4);
        
        ImageIcon imagen5 = new ImageIcon(getClass().getResource("/llanamaestra.jpg"));
        Icon icono5 = new ImageIcon(imagen5.getImage().getScaledInstance(jLabelInicio.getWidth(), jLabelInicio.getHeight(), Image.SCALE_DEFAULT));
        jLabelHerramienta2.setIcon(icono5);
        
        ImageIcon imagen6 = new ImageIcon(getClass().getResource("/brochapremiumprensada.jpg"));
        Icon icono6 = new ImageIcon(imagen6.getImage().getScaledInstance(jLabelInicio.getWidth(), jLabelInicio.getHeight(), Image.SCALE_DEFAULT));
        jLabelHerramienta3.setIcon(icono6);
        
        ImageIcon imagen7 = new ImageIcon(getClass().getResource("/iniciosesion.jpg"));
        Icon icono7 = new ImageIcon(imagen7.getImage().getScaledInstance(jLabelInicio.getWidth(), jLabelInicio.getHeight(), Image.SCALE_DEFAULT));
        jLabelInicio.setIcon(icono7);
        
        ImageIcon imagen8 = new ImageIcon(getClass().getResource("/esmaltealuminio.png"));
        Icon icono8 = new ImageIcon(imagen8.getImage().getScaledInstance(jLabelInicio.getWidth(), jLabelInicio.getHeight(), Image.SCALE_DEFAULT));
        jLabelMasvendido1.setIcon(icono8);
        
        ImageIcon imagen9 = new ImageIcon(getClass().getResource("/rodillo.jpg"));
        Icon icono9 = new ImageIcon(imagen9.getImage().getScaledInstance(jLabelInicio.getWidth(), jLabelInicio.getHeight(), Image.SCALE_DEFAULT));
        jLabelMasvendido2.setIcon(icono9);
        
        ImageIcon imagen10 = new ImageIcon(getClass().getResource("/blancoluna.png"));
        Icon icono10 = new ImageIcon(imagen10.getImage().getScaledInstance(jLabelInicio.getWidth(), jLabelInicio.getHeight(), Image.SCALE_DEFAULT));
        jLabelMasvendido3.setIcon(icono10);
        
        ImageIcon imagen11 = new ImageIcon(getClass().getResource("/menu.png"));
        Icon icono11 = new ImageIcon(imagen11.getImage().getScaledInstance(jLabelInicio.getWidth(), jLabelInicio.getHeight(), Image.SCALE_DEFAULT));
        jLabelMenu.setIcon(icono11);
        
        ImageIcon imagen12 = new ImageIcon(getClass().getResource("/lupa.png"));
        Icon icono12 = new ImageIcon(imagen12.getImage().getScaledInstance(jLabelInicio.getWidth(), jLabelInicio.getHeight(), Image.SCALE_DEFAULT));
        jLabelLupa.setIcon(icono12);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelInicio = new javax.swing.JLabel();
        jLabelCarrito = new javax.swing.JLabel();
        jTextFieldBuscar = new javax.swing.JTextField();
        jLabelMenu = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabelLupa = new javax.swing.JLabel();
        jLabelPintura = new javax.swing.JLabel();
        jLabelPintura1 = new javax.swing.JLabel();
        jLabelPintura2 = new javax.swing.JLabel();
        jLabelPintura3 = new javax.swing.JLabel();
        jButtonPintura = new javax.swing.JButton();
        jLabelHerramienta1 = new javax.swing.JLabel();
        jLabelHerramienta2 = new javax.swing.JLabel();
        jLabelHerramienta3 = new javax.swing.JLabel();
        jLabelMasvendido1 = new javax.swing.JLabel();
        jLabelMasvendido2 = new javax.swing.JLabel();
        jLabelMasvendido3 = new javax.swing.JLabel();
        jButtonMasvendido = new javax.swing.JButton();
        jButtonHerramienta = new javax.swing.JButton();
        jLabelHerramienta = new javax.swing.JLabel();
        jLabelMasvendido = new javax.swing.JLabel();
        jLabelLuzdeLuna = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabelLuzdeLuna1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabelInicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iniciosesion.jpg"))); // NOI18N
        jLabelInicio.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabelInicio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelInicioMouseClicked(evt);
            }
        });

        jLabelCarrito.setIcon(new javax.swing.ImageIcon(getClass().getResource("/carrito.jpg"))); // NOI18N
        jLabelCarrito.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabelCarrito.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelCarritoMouseClicked(evt);
            }
        });

        jTextFieldBuscar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextFieldBuscar.setToolTipText("Buscar...");
        jTextFieldBuscar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTextFieldBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldBuscarActionPerformed(evt);
            }
        });

        jLabelMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/menu.png"))); // NOI18N
        jLabelMenu.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabelMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelMenuMouseClicked(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setText("Busque su producto");

        jLabelLupa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lupa.png"))); // NOI18N

        jLabelPintura.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabelPintura.setText("BOTES DE PINTURA");

        jLabelPintura1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/blancoluna.png"))); // NOI18N
        jLabelPintura1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelPintura1MouseClicked(evt);
            }
        });

        jLabelPintura2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/negro.png"))); // NOI18N
        jLabelPintura2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelPintura2MouseClicked(evt);
            }
        });

        jLabelPintura3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/esmaltealuminio.png"))); // NOI18N
        jLabelPintura3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelPintura3MouseClicked(evt);
            }
        });

        jButtonPintura.setText("VER MAS");
        jButtonPintura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPinturaActionPerformed(evt);
            }
        });

        jLabelHerramienta1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rodillo.jpg"))); // NOI18N
        jLabelHerramienta1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelHerramienta1MouseClicked(evt);
            }
        });

        jLabelHerramienta2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/llanamaestra.jpg"))); // NOI18N
        jLabelHerramienta2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelHerramienta2MouseClicked(evt);
            }
        });

        jLabelHerramienta3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/brochapremiumprensada.jpg"))); // NOI18N
        jLabelHerramienta3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelHerramienta3MouseClicked(evt);
            }
        });

        jLabelMasvendido1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/esmaltealuminio.png"))); // NOI18N
        jLabelMasvendido1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelMasvendido1MouseClicked(evt);
            }
        });

        jLabelMasvendido2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rodillo.jpg"))); // NOI18N
        jLabelMasvendido2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelMasvendido2MouseClicked(evt);
            }
        });

        jLabelMasvendido3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/blancoluna.png"))); // NOI18N
        jLabelMasvendido3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelMasvendido3MouseClicked(evt);
            }
        });

        jButtonMasvendido.setText("VER MAS");

        jButtonHerramienta.setText("VER MAS");
        jButtonHerramienta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonHerramientaActionPerformed(evt);
            }
        });

        jLabelHerramienta.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabelHerramienta.setText("HERRAMIENTAS");

        jLabelMasvendido.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabelMasvendido.setText("MÁS VENDIDO");

        jLabelLuzdeLuna.setText("Blanco Luna");

        jLabel2.setText("Negro Mate");

        jLabel3.setText("Esmalte Aluminio");

        jLabel4.setText("Rodillo");

        jLabel5.setText("LLana");

        jLabel6.setText("Brocha");

        jLabelLuzdeLuna1.setText("Blanco Luna");

        jLabel7.setText("Rodillo");

        jLabel8.setText("Esmalte Aluminio");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(116, 116, 116)
                        .addComponent(jLabelPintura2, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabelHerramienta1, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(110, 110, 110)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addComponent(jLabelMasvendido2, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(13, 13, 13)
                        .addComponent(jLabelMasvendido3, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(210, 210, 210)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(jLabelMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabelLuzdeLuna1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(335, 335, 335)
                        .addComponent(jLabelInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(290, 290, 290)
                        .addComponent(jButtonHerramienta))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(201, 201, 201)
                        .addComponent(jLabelPintura3, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(110, 110, 110)
                        .addComponent(jLabelHerramienta))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(200, 200, 200)
                        .addComponent(jLabelLuzdeLuna, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(286, 286, 286)
                        .addComponent(jButtonPintura))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(265, 265, 265)
                        .addComponent(jLabelCarrito, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jLabelPintura1, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(200, 200, 200)
                        .addComponent(jLabelHerramienta3, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(220, 220, 220)
                        .addComponent(jLabelLupa, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(101, 101, 101)
                        .addComponent(jLabelPintura))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addComponent(jLabelHerramienta2, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabelMasvendido1, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(290, 290, 290)
                        .addComponent(jButtonMasvendido))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addComponent(jLabelMasvendido))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addComponent(jTextFieldBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(23, 23, 23))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(117, 117, 117)
                        .addComponent(jLabelPintura2, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(76, 76, 76)
                        .addComponent(jLabelHerramienta1, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(9, 9, 9)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(54, 54, 54)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelMasvendido2, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelMasvendido3, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(13, 13, 13)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(190, 190, 190)
                        .addComponent(jLabel8))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabelMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(190, 190, 190)
                        .addComponent(jLabelLuzdeLuna1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabelInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(260, 260, 260)
                        .addComponent(jButtonHerramienta, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(117, 117, 117)
                        .addComponent(jLabelPintura3, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(230, 230, 230)
                        .addComponent(jLabelHerramienta, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(490, 490, 490)
                        .addComponent(jLabelLuzdeLuna, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(117, 117, 117)
                        .addComponent(jButtonPintura, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabelCarrito, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(490, 490, 490)
                        .addComponent(jLabel3))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(117, 117, 117)
                        .addComponent(jLabelPintura1, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(260, 260, 260)
                        .addComponent(jLabelHerramienta3, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(336, 336, 336)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabelLupa, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addComponent(jLabelPintura, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(260, 260, 260)
                        .addComponent(jLabelHerramienta2, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(410, 410, 410)
                        .addComponent(jLabelMasvendido1, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(410, 410, 410)
                        .addComponent(jButtonMasvendido, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(370, 370, 370)
                        .addComponent(jLabelMasvendido, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jTextFieldBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(190, 190, 190)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(17, 17, 17))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabelInicioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelInicioMouseClicked
        Ventana_InicioSesion vis = new Ventana_InicioSesion();
        vis.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jLabelInicioMouseClicked

    private void jLabelCarritoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelCarritoMouseClicked
        Ventana_Carrito vc = new Ventana_Carrito(correoUsuario);
        vc.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jLabelCarritoMouseClicked

    private void jTextFieldBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldBuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldBuscarActionPerformed

    private void jLabelMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelMenuMouseClicked
        Ventana_Menu vm = new Ventana_Menu(correoUsuario);
        vm.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jLabelMenuMouseClicked

    private void jButtonPinturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPinturaActionPerformed
        
    }//GEN-LAST:event_jButtonPinturaActionPerformed

    private void jButtonHerramientaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonHerramientaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonHerramientaActionPerformed

    private void jLabelPintura1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelPintura1MouseClicked

            Ventana_Pintura1 vp = new Ventana_Pintura1(correoUsuario);
            vp.setVisible(true);
            this.setVisible(false);
        
    
        
    }//GEN-LAST:event_jLabelPintura1MouseClicked

    private void jLabelPintura2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelPintura2MouseClicked
        Ventana_Pintura2 vp = new Ventana_Pintura2(correoUsuario);
            vp.setVisible(true);
            this.setVisible(false);
        
    }//GEN-LAST:event_jLabelPintura2MouseClicked

    private void jLabelPintura3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelPintura3MouseClicked
        Ventana_Pintura3 vp = new Ventana_Pintura3(correoUsuario);
            vp.setVisible(true);
            this.setVisible(false);
        
    }//GEN-LAST:event_jLabelPintura3MouseClicked

    private void jLabelMasvendido2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelMasvendido2MouseClicked
        Ventana_Herramienta1 vp = new Ventana_Herramienta1(correoUsuario);
            vp.setVisible(true);
            this.setVisible(false);

    }//GEN-LAST:event_jLabelMasvendido2MouseClicked

    private void jLabelMasvendido3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelMasvendido3MouseClicked
        Ventana_Pintura1 vp = new Ventana_Pintura1(correoUsuario);
            vp.setVisible(true);
            this.setVisible(false);
        
    }//GEN-LAST:event_jLabelMasvendido3MouseClicked

    private void jLabelHerramienta3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelHerramienta3MouseClicked
        Ventana_Herramienta3 vp = new Ventana_Herramienta3(correoUsuario);
            vp.setVisible(true);
            this.setVisible(false);
        
    }//GEN-LAST:event_jLabelHerramienta3MouseClicked

    private void jLabelMasvendido1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelMasvendido1MouseClicked
            // Abre el JFrame de detalles y pasa el producto
            Ventana_Pintura3 vp = new Ventana_Pintura3(correoUsuario);
            vp.setVisible(true);
            this.setVisible(false);
        
        
    }//GEN-LAST:event_jLabelMasvendido1MouseClicked

    private void jLabelHerramienta1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelHerramienta1MouseClicked
        Ventana_Herramienta1 vp = new Ventana_Herramienta1(correoUsuario);
            vp.setVisible(true);
            this.setVisible(false);
        
    }//GEN-LAST:event_jLabelHerramienta1MouseClicked

    private void jLabelHerramienta2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelHerramienta2MouseClicked
        Ventana_Herramienta2 vp = new Ventana_Herramienta2(correoUsuario);
            vp.setVisible(true);
            this.setVisible(false);
        
    }//GEN-LAST:event_jLabelHerramienta2MouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Ventana_Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana_Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana_Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana_Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana_Inicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonHerramienta;
    private javax.swing.JButton jButtonMasvendido;
    private javax.swing.JButton jButtonPintura;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabelCarrito;
    private javax.swing.JLabel jLabelHerramienta;
    private javax.swing.JLabel jLabelHerramienta1;
    private javax.swing.JLabel jLabelHerramienta2;
    private javax.swing.JLabel jLabelHerramienta3;
    private javax.swing.JLabel jLabelInicio;
    private javax.swing.JLabel jLabelLupa;
    public javax.swing.JLabel jLabelLuzdeLuna;
    public javax.swing.JLabel jLabelLuzdeLuna1;
    private javax.swing.JLabel jLabelMasvendido;
    private javax.swing.JLabel jLabelMasvendido1;
    private javax.swing.JLabel jLabelMasvendido2;
    private javax.swing.JLabel jLabelMasvendido3;
    private javax.swing.JLabel jLabelMenu;
    private javax.swing.JLabel jLabelPintura;
    private javax.swing.JLabel jLabelPintura1;
    private javax.swing.JLabel jLabelPintura2;
    private javax.swing.JLabel jLabelPintura3;
    private javax.swing.JTextField jTextFieldBuscar;
    // End of variables declaration//GEN-END:variables
}
