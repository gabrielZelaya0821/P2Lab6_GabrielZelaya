package p2lab6_gabrielzelaya;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import lanzamientos.Album;
import lanzamientos.Cancion;
import lanzamientos.Lanzamiento;
import modelos.Artista;
import modelos.Cliente;
import modelos.Usuario;

/**
 *
 * @author gabri
 */
public class Spotify extends javax.swing.JFrame {

    public Spotify() {
        initComponents();

        ff_password.setText("");
        ff_password2.setText("");
        bg_singup.setVisible(false);
        bg_artista.setVisible(false);
        bg_oyente.setVisible(false);
        bg_crearLanzamiento.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg_login = new javax.swing.JPanel();
        img_spotify = new javax.swing.JLabel();
        tf_username = new javax.swing.JTextField();
        txt_username = new javax.swing.JLabel();
        txt_password = new javax.swing.JLabel();
        btn_login = new javax.swing.JButton();
        txt_signUp = new javax.swing.JLabel();
        ff_password = new javax.swing.JPasswordField();
        bg_singup = new javax.swing.JPanel();
        img_spotify2 = new javax.swing.JLabel();
        tf_username2 = new javax.swing.JTextField();
        txt_username2 = new javax.swing.JLabel();
        txt_password2 = new javax.swing.JLabel();
        btn_signup = new javax.swing.JButton();
        txt_age = new javax.swing.JLabel();
        edadSpinner = new javax.swing.JSpinner();
        ff_password2 = new javax.swing.JPasswordField();
        cb_tipoUsuario = new javax.swing.JComboBox<>();
        bg_artista = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tree_lanzamientos = new javax.swing.JTree();
        btn_agregar = new javax.swing.JButton();
        btn_eliminar = new javax.swing.JButton();
        bg_oyente = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        playlist = new javax.swing.JList<>();
        jScrollPane3 = new javax.swing.JScrollPane();
        likedSongs = new javax.swing.JList<>();
        txt_likedSongs = new javax.swing.JLabel();
        txt_playlists = new javax.swing.JLabel();
        bg_crearLanzamiento = new javax.swing.JPanel();
        txt_title = new javax.swing.JLabel();
        tf_title = new javax.swing.JTextField();
        txt_fecha = new javax.swing.JLabel();
        escogerFecha = new com.toedter.calendar.JDateChooser();
        txt_canciones = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        lista_cancionesAlbum = new javax.swing.JList<>();
        btn_agregarCancion = new javax.swing.JButton();
        btn_eliminarCancion = new javax.swing.JButton();
        btn_crearLanzamiento = new javax.swing.JButton();
        bg_crearCancion = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Spotify");

        bg_login.setBackground(new java.awt.Color(0, 0, 0));

        img_spotify.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/spotify logo.png"))); // NOI18N
        img_spotify.setText("jLabel1");

        tf_username.setBackground(new java.awt.Color(51, 51, 51));
        tf_username.setForeground(new java.awt.Color(204, 255, 255));

        txt_username.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        txt_username.setForeground(new java.awt.Color(204, 255, 255));
        txt_username.setText("Username:");

        txt_password.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        txt_password.setForeground(new java.awt.Color(204, 255, 255));
        txt_password.setText("Password:");

        btn_login.setBackground(new java.awt.Color(30, 215, 96));
        btn_login.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        btn_login.setText("LOG IN");
        btn_login.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_loginMouseClicked(evt);
            }
        });

        txt_signUp.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        txt_signUp.setForeground(new java.awt.Color(204, 255, 255));
        txt_signUp.setText("Don't have an account? SIGN UP");
        txt_signUp.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txt_signUp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txt_signUpMouseClicked(evt);
            }
        });

        ff_password.setBackground(new java.awt.Color(51, 51, 51));
        ff_password.setForeground(new java.awt.Color(204, 255, 255));
        ff_password.setText("jPasswordField1");

        javax.swing.GroupLayout bg_loginLayout = new javax.swing.GroupLayout(bg_login);
        bg_login.setLayout(bg_loginLayout);
        bg_loginLayout.setHorizontalGroup(
            bg_loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bg_loginLayout.createSequentialGroup()
                .addGroup(bg_loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bg_loginLayout.createSequentialGroup()
                        .addGap(146, 146, 146)
                        .addGroup(bg_loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txt_username)
                            .addComponent(txt_password))
                        .addGap(18, 18, 18)
                        .addGroup(bg_loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tf_username)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bg_loginLayout.createSequentialGroup()
                                .addComponent(txt_signUp)
                                .addGap(18, 18, 18)
                                .addComponent(btn_login))
                            .addComponent(ff_password, javax.swing.GroupLayout.DEFAULT_SIZE, 364, Short.MAX_VALUE)))
                    .addGroup(bg_loginLayout.createSequentialGroup()
                        .addGap(293, 293, 293)
                        .addComponent(img_spotify, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(206, Short.MAX_VALUE))
        );
        bg_loginLayout.setVerticalGroup(
            bg_loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bg_loginLayout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addGroup(bg_loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(bg_loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btn_login)
                        .addComponent(txt_signUp))
                    .addGroup(bg_loginLayout.createSequentialGroup()
                        .addComponent(img_spotify)
                        .addGap(33, 33, 33)
                        .addGroup(bg_loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_username)
                            .addComponent(tf_username, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(bg_loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_password)
                            .addComponent(ff_password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(53, 53, 53)))
                .addContainerGap(192, Short.MAX_VALUE))
        );

        bg_singup.setBackground(new java.awt.Color(0, 0, 0));

        img_spotify2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/spotify logo.png"))); // NOI18N
        img_spotify2.setText("jLabel1");

        tf_username2.setBackground(new java.awt.Color(51, 51, 51));
        tf_username2.setForeground(new java.awt.Color(204, 255, 255));

        txt_username2.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        txt_username2.setForeground(new java.awt.Color(204, 255, 255));
        txt_username2.setText("Username:");

        txt_password2.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        txt_password2.setForeground(new java.awt.Color(204, 255, 255));
        txt_password2.setText("Password:");

        btn_signup.setBackground(new java.awt.Color(30, 215, 96));
        btn_signup.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        btn_signup.setText("SIGN UP");
        btn_signup.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_signupMouseClicked(evt);
            }
        });

        txt_age.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        txt_age.setForeground(new java.awt.Color(204, 255, 255));
        txt_age.setText("Age:");

        edadSpinner.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N

        ff_password2.setBackground(new java.awt.Color(51, 51, 51));
        ff_password2.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        ff_password2.setForeground(new java.awt.Color(204, 255, 255));
        ff_password2.setText("jPasswordField1");

        cb_tipoUsuario.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Artista", "Oyente" }));

        javax.swing.GroupLayout bg_singupLayout = new javax.swing.GroupLayout(bg_singup);
        bg_singup.setLayout(bg_singupLayout);
        bg_singupLayout.setHorizontalGroup(
            bg_singupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bg_singupLayout.createSequentialGroup()
                .addGroup(bg_singupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bg_singupLayout.createSequentialGroup()
                        .addGap(146, 146, 146)
                        .addGroup(bg_singupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txt_username2)
                            .addComponent(txt_password2)
                            .addComponent(txt_age, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(18, 18, 18)
                        .addGroup(bg_singupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tf_username2, javax.swing.GroupLayout.DEFAULT_SIZE, 364, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bg_singupLayout.createSequentialGroup()
                                .addComponent(edadSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(37, 37, 37)
                                .addComponent(cb_tipoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btn_signup))
                            .addComponent(ff_password2)))
                    .addGroup(bg_singupLayout.createSequentialGroup()
                        .addGap(293, 293, 293)
                        .addComponent(img_spotify2, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(194, Short.MAX_VALUE))
        );
        bg_singupLayout.setVerticalGroup(
            bg_singupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bg_singupLayout.createSequentialGroup()
                .addGap(99, 99, 99)
                .addComponent(img_spotify2)
                .addGap(33, 33, 33)
                .addGroup(bg_singupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_username2)
                    .addComponent(tf_username2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(bg_singupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_password2)
                    .addComponent(ff_password2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(bg_singupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bg_singupLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(bg_singupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(edadSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_age)
                            .addComponent(cb_tipoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(bg_singupLayout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(btn_signup)))
                .addContainerGap(159, Short.MAX_VALUE))
        );

        bg_artista.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.tree.DefaultMutableTreeNode treeNode1 = new javax.swing.tree.DefaultMutableTreeNode("Lanzamientos");
        javax.swing.tree.DefaultMutableTreeNode treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Albums");
        treeNode1.add(treeNode2);
        treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Singles");
        treeNode1.add(treeNode2);
        tree_lanzamientos.setModel(new javax.swing.tree.DefaultTreeModel(treeNode1));
        jScrollPane1.setViewportView(tree_lanzamientos);

        btn_agregar.setBackground(new java.awt.Color(30, 215, 96));
        btn_agregar.setText("Agregar");
        btn_agregar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_agregarMouseClicked(evt);
            }
        });

        btn_eliminar.setBackground(new java.awt.Color(30, 215, 96));
        btn_eliminar.setText("Eliminar");
        btn_eliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_eliminarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout bg_artistaLayout = new javax.swing.GroupLayout(bg_artista);
        bg_artista.setLayout(bg_artistaLayout);
        bg_artistaLayout.setHorizontalGroup(
            bg_artistaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bg_artistaLayout.createSequentialGroup()
                .addGroup(bg_artistaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bg_artistaLayout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 625, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(bg_artistaLayout.createSequentialGroup()
                        .addGap(149, 149, 149)
                        .addComponent(btn_agregar)
                        .addGap(18, 18, 18)
                        .addComponent(btn_eliminar)))
                .addContainerGap(96, Short.MAX_VALUE))
        );
        bg_artistaLayout.setVerticalGroup(
            bg_artistaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bg_artistaLayout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(bg_artistaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_agregar)
                    .addComponent(btn_eliminar))
                .addContainerGap(33, Short.MAX_VALUE))
        );

        bg_oyente.setBackground(new java.awt.Color(0, 0, 0));

        jScrollPane2.setViewportView(playlist);

        jScrollPane3.setViewportView(likedSongs);

        txt_likedSongs.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        txt_likedSongs.setForeground(new java.awt.Color(204, 255, 255));
        txt_likedSongs.setText("Liked Songs");

        txt_playlists.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        txt_playlists.setForeground(new java.awt.Color(204, 255, 255));
        txt_playlists.setText("Playlists");

        javax.swing.GroupLayout bg_oyenteLayout = new javax.swing.GroupLayout(bg_oyente);
        bg_oyente.setLayout(bg_oyenteLayout);
        bg_oyenteLayout.setHorizontalGroup(
            bg_oyenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bg_oyenteLayout.createSequentialGroup()
                .addGap(106, 106, 106)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(163, 163, 163)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(167, Short.MAX_VALUE))
            .addGroup(bg_oyenteLayout.createSequentialGroup()
                .addGap(157, 157, 157)
                .addComponent(txt_likedSongs)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txt_playlists)
                .addGap(241, 241, 241))
        );
        bg_oyenteLayout.setVerticalGroup(
            bg_oyenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bg_oyenteLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(bg_oyenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_likedSongs)
                    .addComponent(txt_playlists))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(bg_oyenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 381, Short.MAX_VALUE)
                    .addComponent(jScrollPane2))
                .addContainerGap(58, Short.MAX_VALUE))
        );

        bg_crearLanzamiento.setBackground(new java.awt.Color(0, 0, 0));

        txt_title.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        txt_title.setForeground(new java.awt.Color(204, 255, 255));
        txt_title.setText("Title:");

        txt_fecha.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        txt_fecha.setForeground(new java.awt.Color(204, 255, 255));
        txt_fecha.setText("Fecha:");

        txt_canciones.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        txt_canciones.setForeground(new java.awt.Color(204, 255, 255));
        txt_canciones.setText("Canciones:");

        lista_cancionesAlbum.setModel(new DefaultListModel());
        jScrollPane4.setViewportView(lista_cancionesAlbum);

        btn_agregarCancion.setText("Agregar");
        btn_agregarCancion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_agregarCancionMouseClicked(evt);
            }
        });

        btn_eliminarCancion.setText("Eliminar");

        btn_crearLanzamiento.setBackground(new java.awt.Color(30, 215, 96));
        btn_crearLanzamiento.setText("Crear");
        btn_crearLanzamiento.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_crearLanzamientoMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout bg_crearLanzamientoLayout = new javax.swing.GroupLayout(bg_crearLanzamiento);
        bg_crearLanzamiento.setLayout(bg_crearLanzamientoLayout);
        bg_crearLanzamientoLayout.setHorizontalGroup(
            bg_crearLanzamientoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bg_crearLanzamientoLayout.createSequentialGroup()
                .addGroup(bg_crearLanzamientoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bg_crearLanzamientoLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(bg_crearLanzamientoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(bg_crearLanzamientoLayout.createSequentialGroup()
                                .addComponent(txt_fecha)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(escogerFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(bg_crearLanzamientoLayout.createSequentialGroup()
                                .addComponent(txt_title)
                                .addGap(18, 18, 18)
                                .addComponent(tf_title, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(bg_crearLanzamientoLayout.createSequentialGroup()
                        .addGroup(bg_crearLanzamientoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bg_crearLanzamientoLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(btn_eliminarCancion))
                            .addGroup(bg_crearLanzamientoLayout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addGroup(bg_crearLanzamientoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_canciones)
                                    .addComponent(btn_agregarCancion))))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(505, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bg_crearLanzamientoLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btn_crearLanzamiento)
                .addGap(14, 14, 14))
        );
        bg_crearLanzamientoLayout.setVerticalGroup(
            bg_crearLanzamientoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bg_crearLanzamientoLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(bg_crearLanzamientoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_title)
                    .addComponent(tf_title, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(bg_crearLanzamientoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_fecha)
                    .addComponent(escogerFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(bg_crearLanzamientoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bg_crearLanzamientoLayout.createSequentialGroup()
                        .addComponent(txt_canciones)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_agregarCancion)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_eliminarCancion))
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addComponent(btn_crearLanzamiento)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        bg_crearCancion.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout bg_crearCancionLayout = new javax.swing.GroupLayout(bg_crearCancion);
        bg_crearCancion.setLayout(bg_crearCancionLayout);
        bg_crearCancionLayout.setHorizontalGroup(
            bg_crearCancionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 800, Short.MAX_VALUE)
        );
        bg_crearCancionLayout.setVerticalGroup(
            bg_crearCancionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 500, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg_login, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(bg_singup, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(bg_artista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(bg_oyente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(bg_crearLanzamiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(bg_crearCancion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(bg_login, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 29, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(10, 10, 10)
                    .addComponent(bg_singup, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(19, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(bg_artista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(bg_oyente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(bg_crearLanzamiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(bg_crearCancion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_loginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_loginMouseClicked
        ArrayList<String> users = leerArchivo();

        for (String u : users) {
            String[] datos = u.split("\\|");
            if (datos[0].equals(tf_username.getText())
                    && datos[1].equals(String.valueOf(ff_password.getPassword()))) {
                //si datos en la posici??n 3 no es null significa que es tipo artista
                if (datos[2] != null) {
                    bg_artista.setVisible(true);
                    bg_login.setVisible(false);
                } else {
                    bg_oyente.setVisible(true);
                    bg_login.setVisible(false);
                }
            }
        }
    }//GEN-LAST:event_btn_loginMouseClicked

    private void btn_signupMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_signupMouseClicked
        Artista artista = new Artista();
        Cliente cliente = new Cliente();

        if (cb_tipoUsuario.getSelectedItem().equals("Artista")) {
            artista = new Artista(JOptionPane.showInputDialog("Ingrese su nombre de usuario"),
                    tf_username2.getText(), String.valueOf(ff_password2.getPassword()), (int) edadSpinner.getValue());
        } else {
            cliente = new Cliente(tf_username2.getText(), String.valueOf(ff_password2.getPassword()), (int) edadSpinner.getValue());
        }

        boolean existe = false;
        for (Usuario u : usuarios) {
            if (artista.getUser().equals(u.getUser()) || cliente.getUser().equals(u.getUser())) {
                JOptionPane.showMessageDialog(bg_singup, "Usuario inv??lido");
                existe = true;
            }
        }
        if (!existe) {
            if (artista.getUser() != null) {
                usuarios.add(artista);
                escribirArchivo(artista.toString());
            } else {
                usuarios.add(cliente);
                escribirArchivo(cliente.toString());
            }
        }
        tf_username2.setText("");
        ff_password2.setText("");
        edadSpinner.setValue(0);

        bg_singup.setVisible(false);
        bg_login.setVisible(true);
    }//GEN-LAST:event_btn_signupMouseClicked

    private void txt_signUpMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_signUpMouseClicked
        bg_login.setVisible(false);
        bg_singup.setVisible(true);
    }//GEN-LAST:event_txt_signUpMouseClicked

    private void btn_eliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_eliminarMouseClicked
        DefaultTreeModel modelo = (DefaultTreeModel) tree_lanzamientos.getModel();
        DefaultMutableTreeNode raiz = (DefaultMutableTreeNode) modelo.getRoot();
        for (int i = 0; i < raiz.getChildCount(); i++) {

        }
    }//GEN-LAST:event_btn_eliminarMouseClicked

    private void btn_agregarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_agregarMouseClicked
        int x = JOptionPane.showConfirmDialog(this, "Desea crear un single?", "Crear", JOptionPane.YES_NO_OPTION);

        if (x == JOptionPane.YES_OPTION) {
            txt_canciones.setVisible(false);
            jScrollPane4.setVisible(false);
            btn_agregarCancion.setVisible(false);
            btn_eliminarCancion.setVisible(false);

        }
        bg_crearLanzamiento.setVisible(true);
        bg_artista.setVisible(false);
    }//GEN-LAST:event_btn_agregarMouseClicked

    private void btn_crearLanzamientoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_crearLanzamientoMouseClicked
        DefaultListModel modelo = (DefaultListModel) lista_cancionesAlbum.getModel();
        
        if(modelo.getSize() > 0){
            ArrayList<Cancion> canciones = new ArrayList<>();
            for (int i = 0; i < modelo.getSize(); i++) {
                canciones.add( (Cancion) modelo.getElementAt(i));
            }
            Album album = new Album(canciones, tf_title.getText(),escogerFecha.getDate());
            lanzamientos.add(album);
            agregarArbol(album);
        }else{
            Lanzamiento lanzamiento = new Lanzamiento(tf_title.getText(), escogerFecha.getDate());
            lanzamientos.add(lanzamiento);
            agregarArbol(lanzamiento);
        }
        bg_crearLanzamiento.setVisible(false);
        bg_artista.setVisible(true);
    }//GEN-LAST:event_btn_crearLanzamientoMouseClicked

    private void btn_agregarCancionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_agregarCancionMouseClicked
        
    }//GEN-LAST:event_btn_agregarCancionMouseClicked

    private void agregarArbol(Lanzamiento lanzamiento){
        DefaultTreeModel modelo = (DefaultTreeModel) tree_lanzamientos.getModel();
        DefaultMutableTreeNode raiz = (DefaultMutableTreeNode) modelo.getRoot();
        DefaultMutableTreeNode node;
        String[] datos = lanzamiento.toString().split("\\|");

        for (int i = 0; i < raiz.getChildCount(); i++) {
            if (raiz.getChildAt(i).toString().
                        equals("Albums")) {
                if(lanzamiento instanceof Album){
                node = new DefaultMutableTreeNode(lanzamiento);
                ((DefaultMutableTreeNode) raiz.getChildAt(i)).add(node);
                }
            }else if(datos.length == 2){
                node = new DefaultMutableTreeNode(lanzamiento);
                ((DefaultMutableTreeNode) raiz.getChildAt(i)).add(node);
            }
        }
    }
    
    
    private void escribirArchivo(String contenido) {
        try {
            PrintWriter salida = new PrintWriter(new FileWriter(usuariosFile, true));
            salida.println(contenido);
            salida.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace(System.out);
        } catch (IOException e) {
            e.printStackTrace(System.out);
        }
    }

    public ArrayList<String> leerArchivo() {
        ArrayList<String> lectura = new ArrayList<>();
        try {
            BufferedReader entrada = new BufferedReader(new FileReader(usuariosFile));
            String leer = entrada.readLine();
            while (leer != null) {
                lectura.add(leer);
                leer = entrada.readLine();
            }
            entrada.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace(System.out);
        } catch (IOException e) {
            e.printStackTrace(System.out);
        }
        return lectura;
    }

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(() -> {
            new Spotify().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bg_artista;
    private javax.swing.JPanel bg_crearCancion;
    private javax.swing.JPanel bg_crearLanzamiento;
    private javax.swing.JPanel bg_crearLanzamiento1;
    private javax.swing.JPanel bg_crearLanzamiento2;
    private javax.swing.JPanel bg_login;
    private javax.swing.JPanel bg_oyente;
    private javax.swing.JPanel bg_singup;
    private javax.swing.JButton btn_agregar;
    private javax.swing.JButton btn_agregarCancion;
    private javax.swing.JButton btn_agregarCancion1;
    private javax.swing.JButton btn_agregarCancion2;
    private javax.swing.JButton btn_crearLanzamiento;
    private javax.swing.JButton btn_crearLanzamiento1;
    private javax.swing.JButton btn_crearLanzamiento2;
    private javax.swing.JButton btn_eliminar;
    private javax.swing.JButton btn_eliminarCancion;
    private javax.swing.JButton btn_eliminarCancion1;
    private javax.swing.JButton btn_eliminarCancion2;
    private javax.swing.JButton btn_login;
    private javax.swing.JButton btn_signup;
    private javax.swing.JComboBox<String> cb_tipoUsuario;
    private javax.swing.JSpinner edadSpinner;
    private com.toedter.calendar.JDateChooser escogerFecha;
    private com.toedter.calendar.JDateChooser escogerFecha1;
    private com.toedter.calendar.JDateChooser escogerFecha2;
    private javax.swing.JPasswordField ff_password;
    private javax.swing.JPasswordField ff_password2;
    private javax.swing.JLabel img_spotify;
    private javax.swing.JLabel img_spotify2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JList<String> likedSongs;
    private javax.swing.JList<String> lista_cancionesAlbum;
    private javax.swing.JList<String> lista_cancionesAlbum1;
    private javax.swing.JList<String> lista_cancionesAlbum2;
    private javax.swing.JList<String> playlist;
    private javax.swing.JTextField tf_title;
    private javax.swing.JTextField tf_title1;
    private javax.swing.JTextField tf_title2;
    private javax.swing.JTextField tf_username;
    private javax.swing.JTextField tf_username2;
    private javax.swing.JTree tree_lanzamientos;
    private javax.swing.JLabel txt_age;
    private javax.swing.JLabel txt_canciones;
    private javax.swing.JLabel txt_canciones1;
    private javax.swing.JLabel txt_canciones2;
    private javax.swing.JLabel txt_fecha;
    private javax.swing.JLabel txt_fecha1;
    private javax.swing.JLabel txt_fecha2;
    private javax.swing.JLabel txt_likedSongs;
    private javax.swing.JLabel txt_password;
    private javax.swing.JLabel txt_password2;
    private javax.swing.JLabel txt_playlists;
    private javax.swing.JLabel txt_signUp;
    private javax.swing.JLabel txt_title;
    private javax.swing.JLabel txt_title1;
    private javax.swing.JLabel txt_title2;
    private javax.swing.JLabel txt_username;
    private javax.swing.JLabel txt_username2;
    // End of variables declaration//GEN-END:variables

    private ArrayList<Lanzamiento> lanzamientos = new ArrayList<>();
    private ArrayList<Usuario> usuarios = new ArrayList<>();
    private File usuariosFile = new File("./Usuarios.txt");
}
