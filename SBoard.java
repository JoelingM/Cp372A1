import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
public class SBoard{

    public static void main (String args[]){
        System.out.println("The Board is currently running.");
        int clientNumber = 0;
        ServerSocket listener = new ServerSocket(9898);
        try {
            while (true) {
                new Capitalizer(listener.accept(), clientNumber++).start();
            }
        } finally {
            listener.close();
        }
    }

    private static class Note {
        private int x_beg = 0 ; 
        private int y_beg = 0 ; 
        private int y_end = 0; 
        private int x_end = 0; 
        private String color = ""; 
        private String content = ""; 

        private Note(int x_beg , int y_beg ,int  width ,int  height , String color, String content ){
            this.x_beg = x_beg;
            this.y_beg = y_beg; 
            this.x_end = x_beg + width; 
            this.y_end = y_end + height; 
            this.color = color; 
            this.content = content; 
        }
    }
    

}