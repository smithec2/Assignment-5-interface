package edu.ldsbc.cs115;

/**
 * Created by CSmith on 2/16/2017.
 
 * The only difference between the segment A and segment B is in the class instantiation(LinksysModem vs MotorolaModem).
 * In the first case we use LinksysModem and in the latter case we use MotorolaModem.
 * The rest of the code remains the same. This is the greatest advantage of creating
 * interfaces—we don’t need to change much of the code even when we change modems.
 * This makes it easier to write an application that works with a lot of different modems.
 * Here, we can see that the problem of how to provide a different implementation
 * for each modem and yet maintaining a single interface to access them is easily resolved using an interface.
 *
 */
public class Main {
  
  public static void main(String arg[]){
    
    //segment A
    Modem modem = new LinksysModem(); // LinksysModem
    modem.open();
    modem.write("send this data");
    String data = modem.read();
    modem.close();
  
    //segment B
    modem = new MotorolaModem(); // now using MotorolaModem
    modem.open();
    modem.write("send this data");
    data = modem.read();
    modem.close();
  }
}
