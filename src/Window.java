import javax.swing.*;

public class Window extends JFrame {

    public Window(){
        this.setSize(Constants.WIDTH,Constants.HEIGHT);
        this.setTitle("BMI Calculator");
        this.setLayout(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.add(new MainScene(0,0,Constants.WIDTH,Constants.HEIGHT));
        this.setVisible(true);
    }
}
