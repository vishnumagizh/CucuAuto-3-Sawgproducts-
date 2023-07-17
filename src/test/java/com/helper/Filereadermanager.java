package com.helper;

import java.io.IOException;

public class Filereadermanager {
	private Filereadermanager()
	{
		
	}

	public static Filereadermanager getInstance()
	{
	Filereadermanager frm = new Filereadermanager();
	return frm;
	}

	public Configurationreader getcrinstance() throws IOException 
	{ 
		Configurationreader con= new Configurationreader();
		return con;
}
}


