import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class MainScene extends JPanel {
    private  JLabel personalData;
    private JLabel name;
    private JLabel lastName;
    private JLabel age;
    private JTextField nameBox;
    private JTextField ageBox;
    private JTextField lastNameBox;
    private JButton printButton;
    private JLabel gender;
    private JComboBox<String> genderSelection;
    private JSlider heightSlider;
    private JLabel height;
    private JLabel weight;
    private JTextField weightBox;
    private JLabel valueLabel;



    public MainScene(int x,int y, int width, int height){
        this.setLayout(null);
        this.setBounds(x,y,width,height);

         this.personalData =new JLabel("Personal Data");
        this.personalData.setBounds(x+10,y+80,80,50);
        this.add(this.personalData);

        this.name =new JLabel("Name:");
        this.name.setBounds(this.personalData.getX(),this.personalData.getY()+this.personalData.getHeight(),80,50);
        this.add(this.name);

        this.nameBox = new JTextField();
        this.nameBox.setBounds(this.name.getX() + this.name.getWidth(),this.name.getY()+10,80,30);
        this.add(this.nameBox);

        this.lastName=new JLabel("Last Name:");
        this.lastName.setBounds(this.name.getX(), this.name.getY()+this.name.getHeight(), 80, 50);
        this.add(this.lastName);

        this.lastNameBox= new JTextField();
        this.lastNameBox.setBounds(this.lastName.getX()+this.lastName.getWidth(), this.lastName.getY()+10, 80,30);
        this.add(this.lastNameBox);

        this.age= new JLabel("Age: ");
        this.age.setBounds(this.lastName.getX(),this.lastName.getY()+this.lastName.getHeight(),80,50);
        this.add(this.age);

        this.ageBox= new JTextField();
        this.ageBox.setBounds(this.age.getX()+this.age.getWidth(),this.age.getY()+10,80,30);
        this.add(this.ageBox);

        this.printButton = new JButton("Print");
        this.printButton.setBounds(this.age.getX(),this.age.getY()+this.age.getHeight()+10,80,30);
        this.add(this.printButton);

        this.gender= new JLabel("Gender: ");
        this.gender.setBounds(this.personalData.getX()+this.personalData.getWidth()+150,this.personalData.getY(),80,50);
        this.add(this.gender);

        this.genderSelection=new JComboBox<>(Constants.GENDER);
        this.genderSelection.setBounds(this.gender.getX(),this.gender.getY()+this.gender.getHeight()+10,100,30);
        this.add(this.genderSelection);

        this.height=new JLabel("Height: ");
        this.height.setBounds(this.gender.getX()+this.gender.getWidth()+100, this.gender.getY(), 80, 50);
        this.add(this.height);

        this.valueLabel=new JLabel("0");
        this.valueLabel.setBounds(this.genderSelection.getX()+this.genderSelection.getWidth()+35,this.genderSelection.getY()+80,60,30);
        this.add(this.valueLabel);

        this.heightSlider= new JSlider(JSlider.VERTICAL, 140,190,165);
        this.heightSlider.setBounds(this.height.getX(),this.height.getY()+this.height.getHeight()+10,100,200);
        this.heightSlider.setMinorTickSpacing(1);
        this.heightSlider.setMajorTickSpacing(10);
        this.heightSlider.setPaintTicks(true);
        this.heightSlider.setPaintLabels(true);
        this.add(heightSlider);

        this.heightSlider.addChangeListener(new ChangeListener() {
            public void stateChanged(ChangeEvent e) {
                JSlider source =(JSlider) e.getSource();
                int value = source.getValue();
                valueLabel.setText(value+ " cm");
            }
        });

       this.weight = new JLabel("Weight: ");
       this.weight.setBounds(this.height.getX()+this.height.getWidth()+50,this.height.getY(),80,50);
       this.add(this.weight);


               this.weightBox=new JTextField();
               this.weightBox.setBounds(this.weight.getX(), this.weight.getY()+this.weight.getHeight(),80,30);
               this.add(this.weightBox);

    }

}
