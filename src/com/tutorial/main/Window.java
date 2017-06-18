package com.tutorial.main;

import java.awt.Canvas;
import java.awt.Dimension;

import javax.swing.JFrame;

public class Window extends Canvas{

	private static final long serialVersionUID = -240840600533728354L;

	public Window(int width, int height, String title){
		JFrame frame = new JFrame(title);
		
		frame.setPreferredSize(new Dimension(width, height));
		
		
	}
}
