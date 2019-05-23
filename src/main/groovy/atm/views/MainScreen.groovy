package atm.views

import atm.Atm
import core.views.Screen

import javax.swing.JButton
import javax.swing.JLabel
import javax.swing.JTextField
import java.awt.event.ActionEvent
import java.awt.event.ActionListener

class MainScreen implements Screen {
    JTextField textField = new JTextField()
    JButton button = new JButton("button")
    JLabel label = new JLabel("Enter your ID")

    MainScreen() {
        textField.setBounds(200, 100, 100, 20)
        button.setBounds(50, 250, 50, 20)
        label.setBounds(50, 100, 100, 20)

        button.addActionListener(new ActionListener() {
            @Override
            void actionPerformed(ActionEvent e) {
                def id = textField.getText()
                if (new Atm().authorize(id)) {
                    print(id)
                } else {
                    println("error id")
                }
            }
        })

        jPanel.add(textField)
        jPanel.add(button)
        jPanel.add(label)
    }
}

