package atm.views

import atm.Atm
import core.views.Screen

import javax.swing.*
import java.awt.event.ActionEvent
import java.awt.event.ActionListener

class CustomerMenuScreen implements Screen {
    JButton button = new JButton("Bank Account Information")
    JLabel label = new JLabel("Show Bank Account Information")

    CustomerMenuScreen() {
        button.setBounds(50, 250, 50, 20)
        label.setBounds(50, 100, 100, 20)

        button.addActionListener(new ActionListener() {
            @Override
            void actionPerformed(ActionEvent e) {
                println("test")
            }
        })

        jPanel.add(button)
        jPanel.add(label)
    }
}

