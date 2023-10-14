import task5.VerticalLayout;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Task15 {

    private void calculator(){
        JFrame frame = new JFrame("Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400,400);
        JPanel panel = new JPanel();
        panel.setPreferredSize(new Dimension(400,400));
        panel.setLayout(new VerticalLayout());
        JTextField num1 = new JTextField(15);
        JTextField num2 = new JTextField(15);
        JButton ac1 = new JButton("Сложить");
        JButton ac2 = new JButton("Умножить");
        JButton ac3 = new JButton("Разделить");
        panel.add(num1);
        panel.add(num2);
        panel.add(ac1);
        panel.add(ac2);
        panel.add(ac3);
        ac1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double sum = Double.parseDouble(num1.getText().trim()) + Double.parseDouble(num2.getText().trim());
                    JOptionPane.showMessageDialog(null, "Результат = "+sum, "Result",JOptionPane.INFORMATION_MESSAGE);
                }catch(Exception ex){
                    JOptionPane.showMessageDialog(null, "Введено не число", "Error",JOptionPane.ERROR_MESSAGE);
                }

            }
        });
        ac2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double sum = Double.parseDouble(num1.getText().trim()) * Double.parseDouble(num2.getText().trim());
                    JOptionPane.showMessageDialog(null, "Результат = "+sum, "Result",JOptionPane.INFORMATION_MESSAGE);
                }catch(Exception ex){
                    JOptionPane.showMessageDialog(null, "Введено не число", "Error",JOptionPane.ERROR_MESSAGE);
                }

            }
        });
        ac3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double sum = Double.parseDouble(num1.getText().trim()) / Double.parseDouble(num2.getText().trim());
                    JOptionPane.showMessageDialog(null, "Результат = "+sum, "Result",JOptionPane.INFORMATION_MESSAGE);
                }catch(Exception ex){
                    JOptionPane.showMessageDialog(null, "Введено не число", "Error",JOptionPane.ERROR_MESSAGE);
                }

            }
        });
        frame.getContentPane().add(panel);
        frame.setVisible(true);
    }
    private void selectionbox(){
        JFrame frame = new JFrame("Selection Box");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400,400);
        JPanel panel = new JPanel();
        panel.setPreferredSize(new Dimension(400,400));
        panel.setLayout(new VerticalLayout());
        String[] cntrs = {"---", "Australia", "China", "England", "Russia"};
        JComboBox<String> countries = new JComboBox<>(cntrs);
        JTextArea info = new JTextArea(0,30);
        info.setLineWrap(true);
        info.setEnabled(false);
        info.setDisabledTextColor(Color.BLACK);
        countries.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int cntr = countries.getSelectedIndex();
                switch (cntr){
                    case 0:
                        info.setText("");
                        break;
                    case 1:
                        info.setText("Австра́лия (англ. Australia, МФА: [əˈstreɪljə], от лат. austrālis — «южный»), официальная форма — Австрали́йский Сою́з," +
                                " или Содру́жество Австра́лии (англ. Commonwealth of Australia, МФА: [ˈkɒm.ənˌwɛlθ əv əˈstreɪljə]) — государство в Южном полушарии," +
                                " занимающее одноимённый материк, остров Тасмания и несколько других островов Индийского и Тихого океанов; является шестым государством" +
                                " по площади в мире. К северу от Австралийского Союза расположены Восточный Тимор, Индонезия и Папуа — Новая Гвинея, к северо-востоку — Вануату," +
                                " Новая Каледония и Соломоновы Острова, к юго-востоку — Новая Зеландия. От главного острова Папуа — Новой Гвинеи материковая часть Австралийского Союза" +
                                " отделена Торресовым проливом минимальной шириной около 150 км, а расстояние от австралийского острова Боигу до Папуа — Новой Гвинеи составляет около 5 километров" +
                                ". Население на 30 июня 2022 года оценивалось в 25 978 935 человек, большинство из которых проживает в городах на восточном побережье.");
                        break;
                    case 2:
                        info.setText("Кита́й (кит. трад. 中國, упр. 中国, пиньинь Zhōngguó, палл. Чжунго), официальное название" +
                                " — Кита́йская Наро́дная Респу́блика (сокр. КНР), (кит. трад. 中華人民共和國, упр. 中华人民共和国, пиньинь" +
                                " Zhōnghuá Rénmín Gònghéguó, палл. Чжунхуа Жэньминь Гунхэго) — государство в Восточной Азии. Занимает " +
                                "4-е место в мире по территории среди государств (9 598 962 км2), уступая России, Канаде и США, а по" +
                                " численности населения — 1 411 750 000 жителей (без Тайваня, Гонконга и Макао) — второе после Индии" +
                                ". Уровень урбанизации равен 65 %. Большинство населения — этнические китайцы, самоназвание — хань.");
                        break;
                    case 3:
                        info.setText("А́нглия (англ. England [ˈɪŋɡlənd]) — страна, являющаяся крупнейшей административно-политической частью" +
                                " Соединённого Королевства Великобритании и Северной Ирландии. Население Англии составляет 84 % от общего числа" +
                                " населения Великобритании. Столица — Лондон, крупнейший город Великобритании.");
                        break;
                    case 4:
                        info.setText("Росси́я, или Росси́йская Федера́ция (сокр. РФ), — государство в Восточной Европе и Северной Азии." +
                                " Россия — крупнейшее государство в мире, её территория в международно признанных границах составляет" +
                                " 17 098 246 км².Перейти к разделу «#Географическое положение» Население страны в составляет 146 447 424 чел. (2023; 9-е место в мире).");
                        break;
                }
            }
        });
        panel.add(countries);
        panel.add(info);
        frame.getContentPane().add(panel);
        frame.setVisible(true);
    }
    public void doThing(){
        //Задание 1
        //calculator();
        selectionbox();
    }
}
