
//Gagandeep Singh
//2016037
package ap;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveAction;


public class Pascal extends RecursiveAction{
	private static Map<String, Pascal> instances =
	        new HashMap<String, Pascal>();
	    public static Pascal getInstance(int x, int y)
	    {
	        String key = x + ", " + y;
	        if (!instances.containsKey(key)) {
	            instances.put(key, new Pascal(x, y));
	        }
	        return instances.get(key);
	    }
	private final int n,k;
	int ans;  
	public int getN() {
		return n;
	}
	public int getK() {
		return k;
	}
	private Pascal(int n, int k) {
		super();
		this.n = n;
		this.k = k;
	}
	int   recurse(int   n,   int   k)   
	{
		if   (n   ==   0   ||   k   ==   0   ||   n   ==   k)   {
		return   1; }
		int   left   =   recurse(n   -   1,   k   -   1); 
		int   right   =   recurse(n   -   1,   k);
		return   (left   +   right); 
	}
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		int b=s.nextInt();
		//without pool
		Pascal p1=new Pascal(a,b);
		long start1=System.currentTimeMillis();
		int p=p1.recurse(a,b);
		long end1=System.currentTimeMillis();
		long time1= end1-start1;
		System.out.println(time1);
		
		//pool of 1 thred
		ForkJoinPool pool1 = new ForkJoinPool(1);
		Pascal p2=new Pascal(a,b);
		long start2=System.currentTimeMillis();
		pool1.invoke(p2);
		long end2=System.currentTimeMillis();;
		long time2=end2-start2;
		int result1=p2.ans;
		System.out.println(time2/time1);
		System.out.println(result1);
		
		
		//pool of 2 threads
		ForkJoinPool pool2 = new ForkJoinPool(2);
		Pascal p3=new Pascal(a,b);
		long start3=System.currentTimeMillis();
		pool2.invoke(p3);
		long end3=System.currentTimeMillis();;
		long time3=end3-start3;
		int result2=p3.ans;
		System.out.println(time3/time1);
		System.out.println(result2);
		
		
		//pool of 3 threads
				ForkJoinPool pool3 = new ForkJoinPool(3);
				Pascal p4=new Pascal(a,b);
				long start4=System.currentTimeMillis();
				pool3.invoke(p4);
				long end4=System.currentTimeMillis();;
				long time4=end4-start4;
		
		
				int result3=p4.ans;
				System.out.println(time4/time1);
				System.out.println(result3);

	}
//	@Override
	public void compute() {
		// TODO Auto-generated method stub
		if   (n==0 || k==0 || n==k)
		{
			this.ans=1; 
			return;
		}
		Pascal p1=new Pascal(this.n-1,this.k-1);
		Pascal p2=new Pascal(this.n-1,this.k);
		p1.fork();
		p2.compute();
		p1.join();
		this.ans=p1.ans+p2.ans;
	}

}
//1
//1 1
//1 2 1
//1 3 3  1
//1 4 6  4  1
//1 5 10 10 5  1
//1 6 15 20 15 6 1




//import javafx.fxml.FXML;
//import javafx.fxml.FXMLLoader;
//import javafx.scene.Scene;
//import javafx.scene.layout.AnchorPane;
//import javafx.event.ActionEvent;
//import javafx.event.EventHandler;
//import javafx.scene.paint.Color;
//import javafx.stage.Modality;
//import javafx.stage.Stage;
//
//import java.io.IOException;
//import java.nio.file.Files;
//import java.nio.file.Path;
//import java.nio.file.Paths;
//
//public class MainController {
//
//  public static Stage stage;
//  SettingsController settingsController=new SettingsController();
//  Color[] colours=new Color[8];
//  public Color[] getColours() {
//      return colours;
//  }
//  @FXML
//  private AnchorPane rootPane;
//
//  @FXML
//  void clickPlayGame(ActionEvent event) throws IOException {
////      settingsController.initialize();
//      colours=MainPage.getColours();
//      Path path= Paths.get("game.dat");
//      AnchorPane pane;
//      if(Files.exists(path)) {
//           pane = FXMLLoader.load(getClass().getResource("fxml_files/sample_newgame.fxml"));
//      }
//      else
//      {
//           pane = FXMLLoader.load(getClass().getResource("fxml_files/newGame2.fxml"));
//
//      }
//      rootPane.getChildren().setAll(pane);
//  }
//  
//
//  @FXML
//  void clickQuit(ActionEvent event) throws IOException {
//      stage=new Stage();
//      stage.initModality(Modality.APPLICATION_MODAL);
//      stage.setTitle("Quit");
//      AnchorPane pane=FXMLLoader.load(getClass().getResource("fxml_files/quitGame.fxml"));
//      stage.setScene(new Scene(pane));
//      stage.show();
////      MainPage.window.close();
//  }
//
//  @FXML
//  void clickSettings(ActionEvent event) throws IOException{
//      AnchorPane pane=FXMLLoader.load(getClass().getResource("fxml_files/settings.fxml"));
//      rootPane.getChildren().setAll(pane);
//  }
//
//}