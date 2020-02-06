import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        ArrayList<Song> songs = new ArrayList<>();
        for (int i = 0; i< 3;i++){
            System.out.print("Enter an artist: ");
            String artist = in.nextLine();//modify program to prompt user for an artist
            System.out.print("Enter an title: ");
            String title = in.nextLine(); //modify program to prompt user for a title
            Song s = new Song();
            s.setArtist(artist);
            s.setTitle(title);
            songs.add(s);
        }

        //print all the songs in the array list
        for(Song xxxx: songs){
            System.out.println(xxxx.display());
        }

        //look for blue and print if found
        String titleToFind = "blue";
        for (Song xxxx: songs){
            if (xxxx.getTitle().equals(titleToFind)){
                System.out.printf("I found %s \r\n", xxxx.display());
            }
        }
    }
}