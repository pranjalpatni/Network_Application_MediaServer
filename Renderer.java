/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fireplay;
import java.io.*;
import java.net.*;
import java.io.*;
import java.awt.*;
import java.awt.Robot.*;
import java.awt.event.KeyEvent;
//import java.util.Scanner;

public class Renderer {
   
    public static void main(String[] args) throws IOException, AWTException {
	try
{
        //if(args.length != 4) throw new IllegalArgumentException();
        String host = "192.168.1.113";
        int port = 9666;
        String host2 = "192.168.1.71";
        int port2 = 12345;
	System.out.println("Renderer started at IPAddress: " +host+ " and port number: " +port+ "...waiting for controller...");
        for(;;)
        {
            try (ServerSocket serverSocket = new ServerSocket(port)) {
                Socket socket = serverSocket.accept();
                System.out.println("Controller connected...");
                //1st read and display incoming message
                BufferedReader bufferedReader= new BufferedReader(new InputStreamReader(socket.getInputStream()));
                String messageInput= bufferedReader.readLine();
                System.out.println("The following URL is received from client:"+messageInput);
                System.out.println("Requesting media server...");
                if (messageInput.equals("pause"))
                {
                    go_pause();
                    
                }
                else if (messageInput.equals("play"))
                {
                    go_play();
                    
                }
                else if (messageInput.equals("stop"))
                {
                    go_stop();
                    
                }
                else if (messageInput.equals("forward"))
                {
                    go_forward();
                    
                }
                else if (messageInput.equals("reverse"))
                {
                    go_reverse();
                    
                }
                else if (!messageInput.equals("play") ||!messageInput.equals("pause")||!messageInput.equals("stop")||!messageInput.equals("forward")||!messageInput.equals("reverse"))
                {
                //runMediaServer(messageInput); http://192.168.1.71:12345/Addicted.mp3
                String wmplayer_path="C:\\Program Files (x86)\\VideoLAN\\VLC\\vlc.exe \"http://";
                String full_path = wmplayer_path + host2+ ":" +port2+ "/"+ messageInput;
                System.out.println(full_path);
		Runtime.getRuntime().exec(full_path);
                //Runtime.getRuntime().exec("C:\\Program Files\\Windows Media Player\\wmplayer.exe \"C:\\Users\\Chirag\\Desktop\\Sunny.mp3\"");
        }
            }
}
}
catch(IllegalArgumentException e1) {
			System.err.println("Use: java Renderer <Local IPAddress> <Localport> <Remote IPAddress> <Remote Port>");
		}
	}

    private static void go_pause()throws AWTException { //To change body of generated methods, choose Tools | Templates.
try{
    Robot robot = new Robot();
         
       robot.keyPress(KeyEvent.VK_SPACE);
        robot.keyRelease(KeyEvent.VK_SPACE);
}
    catch(IllegalArgumentException e1) {
			System.err.println("Use: java Renderer <Local IPAddress> <Localport> <Remote IPAddress> <Remote Port>");
		}

    }
    private static void go_play()throws AWTException { //To change body of generated methods, choose Tools | Templates.
try{
    Robot robot = new Robot();
         
       robot.keyPress(KeyEvent.VK_SPACE);
        robot.keyRelease(KeyEvent.VK_SPACE);
}
    catch(IllegalArgumentException e1) {
			System.err.println("Use: java Renderer <Local IPAddress> <Localport> <Remote IPAddress> <Remote Port>");
		}

    }
    private static void go_stop()throws AWTException { //To change body of generated methods, choose Tools | Templates.
try{
    Robot robot = new Robot();
         
    robot.keyPress(KeyEvent.VK_S);
        robot.keyPress(KeyEvent.VK_S);
}
    catch(IllegalArgumentException e1) {
			System.err.println("Use: java Renderer <Local IPAddress> <Localport> <Remote IPAddress> <Remote Port>");
		}

    }
    private static void go_forward()throws AWTException { //To change body of generated methods, choose Tools | Templates.
try{
    Robot robot = new Robot();
         
         robot.keyPress(KeyEvent.VK_ALT);
        robot.keyPress(KeyEvent.VK_RIGHT);
        robot.keyRelease(KeyEvent.VK_RIGHT);
        robot.keyRelease(KeyEvent.VK_ALT);
}
    catch(IllegalArgumentException e1) {
			System.err.println("Use: java Renderer <Local IPAddress> <Localport> <Remote IPAddress> <Remote Port>");
		}

    }
    private static void go_reverse()throws AWTException { //To change body of generated methods, choose Tools | Templates.
try{
    Robot robot = new Robot();
         
       robot.keyPress(KeyEvent.VK_ALT);
        robot.keyPress(KeyEvent.VK_LEFT);
        robot.keyRelease(KeyEvent.VK_LEFT);
        robot.keyRelease(KeyEvent.VK_ALT);
}
    catch(IllegalArgumentException e1) {
			System.err.println("Use: java Renderer <Local IPAddress> <Localport> <Remote IPAddress> <Remote Port>");
		}

    }
}