/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jurnalmod3;

/**
 *
 * @author adityakp
 */
public class PosisiKarakterGame {
    private String state = "Berdiri";
    public void game(String command) {
        command = command.toLowerCase();
        switch (command) {
            case "s":
                this.state = "posisi standby";
                break;
            case "w":
                this.state = "posisi istirahat";
                break;
           
        }
    }
    public String getState(){
        return this.state;
        
    }
}