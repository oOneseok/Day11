import javax.swing.*;
import java.awt.*;
import java.util.*;

public class Project extends JFrame {
    private JButton a1, a2, a3, c1;
    private JLabel[] b;
    private JTextField c;
    private Random random = new Random();

    public Project() {
        setTitle("여러 개의 패널을 가진 프레임");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        a1 = new JButton("열기");
        a2 = new JButton("닫기");
        a3 = new JButton("나가기");
        c1 = new JButton("Word Input");

        setLayout(new BorderLayout());

        JPanel Uptable = new JPanel(); // 상단 패널
        Uptable.add(a1);
        Uptable.add(a2);
        Uptable.add(a3);
        Uptable.setBackground(Color.GRAY);
        add(Uptable, BorderLayout.NORTH);

        JPanel Midletalble = new JPanel();  //중앙 패널
        Midletalble.setLayout(null);
        Midletalble.setBackground(Color.WHITE);
        add(Midletalble, BorderLayout.CENTER);

        b = new JLabel[10];  

        for (int i = 0; i < 10; i++) {
            b[i] = new JLabel("*");
            b[i].setForeground(Color.RED);
            int x = random.nextInt(260);
            int y = random.nextInt(260);
            b[i].setBounds(x, y, 50, 50);
            Midletalble.add(b[i]);
        }

        JPanel Downtalbe = new JPanel(); //하단 패널
        Downtalbe.setBackground(Color.YELLOW);
        Downtalbe.setLayout(new BorderLayout());

        c = new JTextField(15);
        Downtalbe.add(c, BorderLayout.CENTER);
        Downtalbe.add(c1, BorderLayout.WEST);

        add(Downtalbe, BorderLayout.SOUTH);

        setSize(300, 300);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Project();
    }
}