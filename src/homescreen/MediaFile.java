/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/

package homescreen;

import java.io.File;
import java.sql.ResultSet;
import java.sql.Time;

/**
 *
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class MediaFile {
    int count_played;
    String last_played;
    int duration;
    String pathName;
    String songTitle,album,artist;
//       String type;
    
  /* public MediaFile(String songTitle, String album, String artist, String type, int count_played, int last_played, int duration, File pathName) {
        this.songTitle = songTitle;
        this.album = album;
        this.artist = artist;
//        this.type = type;
        this.count_played = count_played;
        this.last_played = last_played;
        this.duration = duration;
        this.pathName = pathName;
    }
    */
    public void add(String songTitle, String album, String artist, int count_played,String last_played, int duration, String pathName) {
        this.songTitle = songTitle;
        this.album = album;
        this.artist = artist;
//        this.type = type;
        this.count_played = count_played;
        this.last_played = last_played;
        this.duration = duration;
        this.pathName = pathName;
//        System.out.println(songTitle+album+artist+count_played+last_played+duration+pathName);
    }
    
   
}
