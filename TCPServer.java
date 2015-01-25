import java.io.*;
import java.net.*;
//import java.util.Scanner;

public class TCPServer {
   public static void main(String[] args) throws IOException {
	
try
{
        if(args.length != 1) throw new IllegalArgumentException();
        System.out.println("Media Server started...waiting for controller...");
        int port = Integer.parseInt(args[0]);
	for(;;)
        {
            try (ServerSocket serverSocket = new ServerSocket(port)) {
                Socket socket = serverSocket.accept();
                System.out.println("Controller connected...");
                //1st read and display incoming message
                BufferedReader bufferedReader= new BufferedReader(new InputStreamReader(socket.getInputStream()));
                String messageInput= bufferedReader.readLine();
                String messageOutput = null;
                System.out.println("The following message was received from client:" + messageInput);
                System.out.println("Reply sent...");
                server mv=new server();
                if(messageInput.contains("movies"))
                {
                    messageOutput = mv.movies(messageInput);
                    
                }
                //Respond to client echoing back the incoming client message
                // an object mv of class server is created
                // stores return of songs method in server class
                
                if(messageInput.contains("songs"))
                {
                    messageOutput = mv.songs(messageInput);
                }
                PrintWriter printWriter= new PrintWriter(socket.getOutputStream(),true);
                printWriter.println(messageOutput.substring(1));
            }
}
}
catch(IllegalArgumentException e1) {
			System.err.println("Use: java TCPServer <localport>");
		}
	}

}
