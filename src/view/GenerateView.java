package src.view;

import javax.swing.*;
import java.awt.*;

public class GenerateView extends JFrame {

    private static final long serialVersionUID = 1L;

    public GenerateView() {

        this.setTitle("Quizz"); // Titre de la fenêtre.
        this.setSize(1500,1000); // Taille de la fenêtre. (Longueur, Hauteur)
        this.setMinimumSize(new Dimension(1286,829)); // Taille minimale de la fenêtre.
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Lorsque l'on clique sur fermer, la fenetre se ferme.
        this.setResizable(true); // Permet de resize la fenêtre.

        this.setVisible(true); //permet que la fenetre soit visible

    }
}