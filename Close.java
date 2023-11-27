//Creates button for closing code snippet
		Button brexit= new Button("EXIT");
		brexit.setBounds(130,50,100,40); //x, y, w, h 
		brexit.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		
