import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
public class QuizGame {
    static double userAnswer, correctAnswer;
    static String displayProblem = "";


    JPanel panel;
   JButton newProblemButton, checkAnswerButton;
   JTextField answerInput;
   JLabel showProblem;
    static JLabel showResults;
   JRadioButton addition, subtraction, multiplication, division;

    public static void main(String[] args) {
        new QuizGame();
       /* createProblem();
        getUserAnswer();
        checkAnswer();*/
    }

    public QuizGame(){

     JFrame frame = new JFrame("Quiz Game");
     frame.setSize(300, 450);
     frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     frame.setLocationRelativeTo(null);

     panel = new JPanel();
     addition = new JRadioButton("Addition");
     subtraction = new JRadioButton("Subtraction");
     multiplication = new JRadioButton("Multiplication");
     division = new JRadioButton("Division");
     ButtonGroup radios = new ButtonGroup();
     newProblemButton = new JButton("Gimme a problem");
     showProblem = new JLabel("PLACEHOLDER TEXT");
     checkAnswerButton = new JButton("Am I right?");
     showResults = new JLabel("PLACEHOLDER TEXT");
     answerInput = new JTextField(10);

     addition.setBounds(100, 10, 150, 25);
     subtraction.setBounds(100, 40, 150, 25);
     multiplication.setBounds(100, 70, 150, 25);
     division.setBounds(100, 100, 150, 25);
     newProblemButton.setBounds(75, 130, 150, 25);
     showProblem.setBounds(75, 160, 150, 25);
     answerInput.setBounds(75,190,150,25);
     checkAnswerButton.setBounds(75, 220, 150, 25);
     showResults.setBounds(75, 250, 150, 25);

     radios.add(addition);
     radios.add(subtraction);
     radios.add(multiplication);
     radios.add(division);

     newProblemButton.addActionListener(new ProblemChoiceListener());

     addition.setSelected(true);

     panel.add(addition);
     panel.add(subtraction);
     panel.add(multiplication);
     panel.add(division);
     panel.add(newProblemButton);
     panel.add(showProblem);
     panel.add(answerInput);
     panel.add(checkAnswerButton);
     panel.add(showResults);

     panel.setLayout(null);

     frame.add(panel);
     frame.setVisible(true);


    }

    private class ProblemChoiceListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent actionEvent) {
            if (addition.isSelected()){
                addProblem();
            }
            if (subtraction.isSelected()){
                subtProblem();
            }
            if (multiplication.isSelected()){
                multProblem();
            }
            if (division.isSelected()){
                divideProblem();
            }

            showProblem.setText(displayProblem);
            panel.remove(newProblemButton);
            panel.updateUI();
        }

    }

    private class CheckAnswerListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent actionEvent) {
            getUserAnswer();
            checkAnswer();
        }
    }

    public static void checkAnswer(){
        if (userAnswer == correctAnswer){
            showResults.setText("You are correct!");

        }else{
            showResults.setText("Incorrect, Try Again");
        }
    }
    public static void getUserAnswer(){
        userAnswer = input(displayProblem);
    }
    public static void createProblem(){
        int choice = Integer.parseInt(JOptionPane.showInputDialog("Choose: \nAddition(1), \nSubtraction(2), \nMultiplication(3), \nDivision(4)"));

        if(choice <= 4){
            if (choice >= 1){
                if (choice == 1) {
                    addProblem();
                }
                if (choice == 2){
                    subtProblem();
                }
                if (choice == 3){
                    multProblem();
                }
                if (choice == 4){
                    divideProblem();
                }
            }else{
                JOptionPane.showMessageDialog(null, "Invalid Input, run program again.");
                System.exit(0);
            }
        }else{
            JOptionPane.showMessageDialog(null, "Invalid Input, run program again.");
            System.exit(0);
        }
    }
    public static void addProblem(){
        int num1 = randomNum();
        int num2 = randomNum();

        correctAnswer = num1+num2;
        displayProblem = num1 + " + " + num2;
    }
    public static void subtProblem(){
        int num1 = randomNum();
        int num2 = randomNum();

        correctAnswer = num1-num2;
        displayProblem = num1 + " - " + num2;
    }
    public static void multProblem(){
        int num1 = randomNum();
        int num2 = randomNum();

        correctAnswer = num1*num2;
        displayProblem = num1 + " * " + num2;
    }
    public static void divideProblem(){
        int num1 = randomNum();
        int num2 = randomNum();

        correctAnswer = (double) num1/num2;

        correctAnswer = (Math.round(correctAnswer * 100))/100.0;
        System.out.println(correctAnswer);
        displayProblem = num1 + " / " + num2;
    }
    public static int randomNum(){
        Random random = new Random();
        return random.nextInt(20) + 1;
    }
    public static double input(String message){
        return Double.parseDouble(JOptionPane.showInputDialog(message));
    }
}