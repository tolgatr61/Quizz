package src.view;

import src.modele.*;
import javax.swing.*;
import java.awt.*;

public class GenerateView extends JFrame {

    private static final long serialVersionUID = 1L;

    public GenerateView(State state) {

        this.setTitle("Quizz"); // Titre de la fenêtre.
        this.setSize(600,400); // Taille de la fenêtre. (Longueur, Hauteur)
        this.setMinimumSize(new Dimension(400,400)); // Taille minimale de la fenêtre.
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Lorsque l'on clique sur fermer, la fenetre se ferme.
        this.setResizable(true); // Permet de resize la fenêtre.

        this.setLayout(new BorderLayout());
        this.add(new PanelNord(state), BorderLayout.NORTH);
        this.add(new PanelCenter(state), BorderLayout.CENTER);
        this.add(new PanelSud(state), BorderLayout.SOUTH);
        this.add(new PanelEast(state), BorderLayout.WEST);

        this.setVisible(true); //permet que la fenetre soit visible

    }
}