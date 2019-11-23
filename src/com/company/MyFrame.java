package com.company;

import javax.swing.*;
import javax.swing.border.MatteBorder;
import java.awt.*;

public class MyFrame extends JFrame
{
    public JLabel answersLabel1;
    public JLabel answersLabel2;
    public JLabel answersLabel3;
    public JFrame frame;
    public JPanel questionsPanel;
    public JPanel hypotesisPanel;
    public JPanel answeringPanel;
    public JLabel questionsLabel;
    public JLabel hypothesisLabel;
    public JLabel answersLabel;
    public JScrollPane q_scroll;
    public JScrollPane h_scroll;
    public JScrollPane a_scroll;
    public JTextArea textArea;
    public JButton btn;
    MyFrame()
    {
        frame =  new JFrame("Рукопашная МЭС");
        frame.setBounds(300, 300, 515, 700);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setVisible(true);
        //frame.setResizable(false);
        frame.setLayout(null);

        questionsPanel = new JPanel();
        hypotesisPanel = new JPanel();
        answeringPanel = new JPanel();
        questionsPanel.setBorder(new MatteBorder(2, 2, 2, 2,Color.red));
        hypotesisPanel.setBorder(new MatteBorder(2, 2, 2, 2, Color.green));
        answeringPanel.setBorder(new MatteBorder(2, 2, 2, 2, Color.blue));
        ///
        questionsPanel.setLayout(null);
        questionsPanel.setBounds(0,0, 250, 335);
        hypotesisPanel.setLayout(null);
        hypotesisPanel.setBounds(250,0, 250, 335);
        answeringPanel.setLayout(null);
        answeringPanel.setBounds(0,335, 500, 336);
        frame.add(questionsPanel);
        frame.add(hypotesisPanel);
        frame.add(answeringPanel);
        ///
        questionsLabel = new JLabel("Вопросы:");
        questionsLabel.setBounds(5, 5, 100, 20);
        questionsPanel.add(questionsLabel);
        q_scroll = new JScrollPane();
        q_scroll.setBounds(5,25 ,240,305);
        questionsPanel.add(q_scroll);
        ///
        hypothesisLabel = new JLabel("Гипотезы:");
        hypothesisLabel.setBounds(5, 5, 100, 20);
        hypotesisPanel.add(hypothesisLabel);
        h_scroll = new JScrollPane();
        h_scroll.setBounds(5,25 ,240,305);
        hypotesisPanel.add(h_scroll);
        ///
        answersLabel = new JLabel("Список ответов:");
        answersLabel.setBounds(5, 5, 100, 20);
        answeringPanel.add(answersLabel);
        a_scroll = new JScrollPane();
        a_scroll.setBounds(5,25 ,240,305);
        answeringPanel.add(a_scroll);
        answersLabel1 = new JLabel("Введите коэффициент уверенности:");
        answersLabel2 = new JLabel("ыы");
        answersLabel3 = new JLabel("ssss");
        answersLabel1.setBounds(255, 5, 240, 20);
        answeringPanel.add(answersLabel1);
        answersLabel2.setBounds(255, 20, 240, 20);
        answeringPanel.add(answersLabel2);
        answersLabel3.setBounds(255, 50, 240, 20);
        answeringPanel.add(answersLabel3);
        textArea = new JTextArea();
        textArea.setBounds(255, 90, 50,20);
        answeringPanel.add(textArea);
        btn =  new JButton("Ввод");
        btn.setBounds(325, 90, 100,20);
        answeringPanel.add(btn);
        frame.repaint();
    }

    void setBoundsForInput(double str1, double str2)
    {
        answersLabel2.setText("от "+str1+" до "+ str2);
    }
}
