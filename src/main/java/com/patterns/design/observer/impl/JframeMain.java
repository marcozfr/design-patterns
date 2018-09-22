package com.patterns.design.observer.impl;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class JframeMain {
	
	public static void main(String[] args) {
		JFrame jframe = new JFrame("My Frame");
		JButton button1 = new JButton("Go");
		button1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("Just a button being clicked.");
			}
		});
		button1.setBounds(10, 10, 100, 20);
		jframe.getContentPane().add(BorderLayout.CENTER,button1);
		jframe.setVisible(true);
		
	}

}
