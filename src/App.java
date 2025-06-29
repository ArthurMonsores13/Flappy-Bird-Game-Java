import javax.swing.*;

public class App {
    public static void main(String[] args) {
        int larguraBorda = 360; 
        int alturaBorda = 640;  

        JFrame janela = new JFrame("Flappy Bird");
        FlappyBird flappyBird = new FlappyBird();
        janela.add(flappyBird);
        janela.pack(); 
        janela.setLocationRelativeTo(null);
        janela.setResizable(false);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setVisible(true); 
    }
}