package lab7;

import java.awt.List;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Scanner;
class SongNotFoundException extends Exception
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	SongNotFoundException(String s)
	{
		super(s);
	}
}
 class Music implements Serializable
{

	private static final long serialVersionUID = 42L;
	private String name;
	private final String singer;
	private final int duration;
	public Music(String name, String singer, int duration) {
		super();
		this.name = name;
		this.singer = singer;
		this.duration = duration;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSinger() {
		return singer;
	}

	public float getDuration() {
		return duration;
	}
//	public void add()
	
	
}
public class lab7 {
	private static Scanner s;
//	private static Main m=new Main();
	public static void add(Music m,String playlist) throws IOException, ClassNotFoundException 
	{
		ObjectOutputStream out = null;
		ObjectInputStream in = null;
		boolean flag=true;
		try {
              out = new ObjectOutputStream (
                    new FileOutputStream("./src/temp"));
              in= new ObjectInputStream (
                      new FileInputStream("./src/"+playlist));
//              out.writeObject(m);
              int i=0;
//              ArrayList<Music> l=new ArrayList<Music>();
             
              while(flag)
              {
	              Music m1;
	              try{
	            		  m1=(Music)in.readObject();
	            		  out.writeObject(m1);
	              }
	              catch(EOFException e)
	              {
	            	  out.writeObject(m);
	            	  flag=false;
	              }
              }
              
           	} finally {
           		in.close();
              out.close();
           	}
		
			File oldfile=new File("./src/temp");
			File newfile=new File("./src/"+playlist);
			newfile.delete();
			oldfile.renameTo(newfile);
	}
	public static boolean delete(String str,String playlist) throws IOException, ClassNotFoundException 
	{
		ObjectInputStream in = null;
		ObjectOutputStream out=null;
		boolean flag=false;
		boolean f=true;
		try 
		{
		    in =  new ObjectInputStream (
		           new FileInputStream("./src/"+playlist));
		    out =  new ObjectOutputStream (
			           new FileOutputStream("./src/temp"));
		    Music m;
		    
		    while(f)//(m=(Music) in.readObject())!=null
		    {
		    	try
		    	{
		    		m=(Music) in.readObject();
		    		if(!m.getName().equals(str))
				    {
				    	out.writeObject(m);
				    }
		    		else
		    		{
		    			flag=true;
		    		}
		    	}
			    catch(EOFException e)
		    	{
			    	f=false;
		    	}    
		    }
		    
		    
		} 
		finally {
		    in.close();
		    out.close();
		    
		}
		File oldfile=new File("./src/temp");
		File newfile=new File("./src/"+playlist);
		newfile.delete();
		oldfile.renameTo(newfile);
		return flag;
	}
	public static void show(String playlist) throws FileNotFoundException, IOException, ClassNotFoundException
	{
		ObjectInputStream in = null;
		ObjectOutputStream out=null;
		boolean flag=true;
		
		try 
		{
		    in =  new ObjectInputStream (
		           new FileInputStream("./src/"+playlist));
		    out =  new ObjectOutputStream (
			           new FileOutputStream("./src/temp"));
		    Music m;
		    while(flag)
		    {
		    	try
		    	{
			    	m=(Music)in.readObject();
			    	System.out.println(m.getName()+"-"+m.getSinger()+"-"+m.getDuration());
			    	out.writeObject(m);
		    	}
		    	catch(EOFException e)
		    	{
		    		flag=false;
		    	}
		    }
		}
		finally
		{
			in.close();
		    out.close();
		    
		}
		File oldfile=new File("./src/temp");
		File newfile=new File("./src/"+playlist);
		newfile.delete();
		oldfile.renameTo(newfile);
	}
	public static void search(String str,String playlist) throws IOException, ClassNotFoundException, SongNotFoundException
	{
		ObjectInputStream in = null;
		ObjectOutputStream out=null;
		boolean flag=false;
		boolean f=true;
		try
		{
			in =  new ObjectInputStream (
			           new FileInputStream("./src/"+playlist));
			out =  new ObjectOutputStream (
						new FileOutputStream("./src/temp"));
			Music m;
			while(f)
		    {
				try
				{
					m=(Music)in.readObject();
					
				    if(m.getName().equals(str))
				    {
				    	System.out.println(m.getName()+"-"+m.getSinger()+"-"+m.getDuration());
				    	flag=true;
				    }
				    out.writeObject(m);
				}
				catch(EOFException e)
				{
					f=false;
				}   
		    }
			if(flag==false)
			{
				try
				{throw new SongNotFoundException("Song does not exist!!");
				
				}
				catch(SongNotFoundException e)
				{
					System.out.println(e);
				}
			}
		}
		
		finally
		{
			in.close();
			out.close();
	
		}
		File oldfile=new File("./src/temp");
		File newfile=new File("./src/"+playlist);
		newfile.delete();
		oldfile.renameTo(newfile);
		
	}
	public static int no_of_songs(String playlist) throws IOException, ClassNotFoundException
	{
		int num=0;
		ObjectInputStream in = null;
		boolean f=true;
		boolean flag=true;
		ObjectOutputStream out = null;
		try 
		{
		    in =  new ObjectInputStream (
		           new FileInputStream("./src/"+playlist));
		    out = new ObjectOutputStream (
                    new FileOutputStream("./src/temp"));
		    Music m;
		    while(flag)
		    {
		    	try {
					m=(Music)in.readObject();
		              out.writeObject(m);
		           	}
				catch(EOFException e)
				{
					flag=false;
				}
		    	finally
		    	{
		    		num++;
		    	}
		    }
		}
		finally
		{
			in.close();
			out.close();
			
		}
		File oldfile=new File("./src/temp");
		File newfile=new File("./src/"+playlist);
		oldfile.delete();
		oldfile.renameTo(newfile);
		return num-1;
	}
	public static void showmenu()
	{
		System.out.println("MENU");
		System.out.println(" 1. Add");
		System.out.println(" 2. Delete");
		System.out.println(" 3. Search");
		System.out.println(" 4. Show");
		System.out.println(" 5. Back To Menu");
		System.out.println(" 6. Exit");
	}
	private static void getAllFiles(File curDir) {

	        File[] filesList = curDir.listFiles();
	        for(File f : filesList){
	            if(f.isDirectory())
	                getAllFiles(f);
	            if(f.isFile()){
	                System.out.println(f.getName());
	            }
	        }
	   }
	        
	public static void main(String[] args) throws IOException, ClassNotFoundException, SongNotFoundException {
		s = new Scanner(System.in);
		System.out.print("Enter number of playlists:");
		int x=s.nextInt();//number of playlists initiallly in folder
		for(int i=0;i<x;i++)
		{
//			Main.serialize(i);//making the playlists
		}	
		System.out.println();
		File curDir = new File("./src");
        getAllFiles(curDir);
        System.out.println("Select the playlist:");
        String str=s.next();
        
		showmenu();
		int option=s.nextInt();
		
		while(option!=6)
		{
			
			if(option==1)
			{
				String name=s.next();
				name=name+s.nextLine();
				String singer=s.next();
				singer=singer+s.nextLine();
				int duration=s.nextInt();
				Music m=new Music(name,singer,duration);
				add(m,str);
				System.out.println(no_of_songs(str));
			}
			else if(option==2)
			{
				String name=s.next();
				name=name+s.nextLine();
				boolean f=delete(name,str);
				if(f)
				{
					System.out.println(no_of_songs(str));
				}
				else
				{
					System.out.println("Song does not exist!!");
				}
			}
			else if(option==3)
			{
				String name=s.next();
				name=name+s.nextLine();
				search(name,str);
			}
			else if(option==4)
			{
				if(no_of_songs(str)==0)
				{
					try
					{
						throw new SongNotFoundException("No Song Exists");
					}
					catch(SongNotFoundException e)
					{
						System.out.println(e);
					}
				}
				else
				{
					show(str);
				}
			}
			else if(option==5)
			{
				getAllFiles(curDir);
		        System.out.print("Select the playlist:");
		        str=s.next();
		        System.out.println();
			}
			else if(option==6)
			{
				break;
			}
			else
			{
				System.out.println("Wrong option!!");
			}
			showmenu();
			option=s.nextInt();
		}	
	}
}
