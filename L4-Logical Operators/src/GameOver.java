import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GameOver {

    JPanel panel;
    JLabel clickCountLabel, time, results;
    JButton clicker, go;
    int clickCount = 0;
    int maxSeconds = 5;
    int seconds = maxSeconds;
    Timer timer;

    public static void main(String[] args) {
        new GameOver();
    }

    public GameOver(){

        JFrame frame = new JFrame("Clicker Game");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 150);
        frame.setLocationRelativeTo(null);

        clickCountLabel = new JLabel();
        time = new JLabel();
        results = new JLabel();

        go = new JButton("Click to Start");
        clicker = new JButton("CLICK!!");

        timer = new Timer(1000, new SecondsListener());
        panel = new JPanel();

        go.addActionListener(new StartListener());
        clicker.addActionListener(new ClickListener());

        panel.add(go);

        frame.add(panel);
        frame.setVisible(true);
    }

    private class StartListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent actionEvent) {
            clickCountLabel.setText(Integer.toString(clickCount));
            time.setText(Integer.toString(seconds));
            results.setText("");
            panel.remove(go);
            panel.add(clickCountLabel);
            panel.add(time);
            panel.add(results);
            panel.add(clicker);
            panel.updateUI();
            timer.start();
        }
    }

    private class ClickListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent actionEvent) {
            clickCount++;
            clickCountLabel.setText(Integer.toString(clickCount));
        }
    }

    private class SecondsListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent actionEvent) {
            seconds--;
            time.setText(Integer.toString(seconds));

            //Add a GAME OVER check. The game is over if the player get 20 or more clicks, or the timer runs out.
            //After the game ends, we need to reinitialize the frame, reinitialize our variables and output some details
            //to the player.


        }
    }
}
