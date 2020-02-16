package com.wc.ui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.wc.dao.UserDao;
import com.wc.domin.User;
import com.wc.utils.BeanFactory;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class LoginForm extends JFrame {

	private JPanel contentPane;
	private JTextField pwd;
	private JTextField name;
	private JTextField tips;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginForm frame = new LoginForm();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public LoginForm() {
		init();
	}
	private void display() {
		dispose();
	}
	private void init() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton button = new JButton("\u767B\u5F55");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String username=name.getText().trim();
				String password=pwd.getText().trim();
				User user=new User();
				UserDao cd=(UserDao) BeanFactory.getBean("UserDao");
				user=cd.findUser(username,password);
				if(user==null) {
					tips.setEnabled(true);
					tips.setText("登录失败，请检查用户名或密码");
				}
				else {
					tips.setEnabled(true);
					tips.setText("登录成功");
				}
			}
		});
		button.setBounds(77, 200, 93, 23);
		contentPane.add(button);
		
		JButton button_1 = new JButton("\u53D6\u6D88");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				display();
			}
		});
		button_1.setBounds(251, 200, 93, 23);
		contentPane.add(button_1);
		
		JLabel label = new JLabel("\u7528\u6237\u540D");
		label.setBounds(116, 63, 54, 15);
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("\u5BC6\u7801");
		label_1.setBounds(116, 111, 54, 15);
		contentPane.add(label_1);
		
		pwd = new JTextField();
		pwd.setBounds(180, 108, 100, 21);
		contentPane.add(pwd);
		pwd.setColumns(10);
		
		name = new JTextField();
		name.setBounds(180, 60, 100, 21);
		contentPane.add(name);
		name.setColumns(10);
		
		tips = new JTextField();
		tips.setEnabled(false);
		tips.setBounds(180, 230, 66, 21);
		contentPane.add(tips);
		tips.setColumns(10);
	}
}
