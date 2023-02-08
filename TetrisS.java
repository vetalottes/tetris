import javax.swing.*;
import java.awt.*;

public class TetrisS extends JFrame {

    private JLabel statusBar;

    public TetrisS() {
        statusBar = new JLabel("0");
        add(statusBar, BorderLayout.SOUTH);
        Board board = new Board(this);
        add(board);
        board.start();
        setSize(200, 400);
        setTitle("My Tetris");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public JLabel getStatusBar() {
        return statusBar;
    }

    public static void main(String[] args) {
        TetrisS myTetris = new TetrisS();
        myTetris.setLocationRelativeTo(null);
        myTetris.setVisible(true);
    }
}
