package edu.ldsbc.cs115;

/**
 * Created by CSmith on 2/16/2017.
 *
 * In this assignment you need to develop communication software such as an FTP (File Transfer Protocol)
 * or Telnet program that uses a modem(yes modem are still used). Our program must work with a variety of different modems.
 * Although all the modems provide the same functionality, their implementations are quite different.
 * Obviously, it would be inadvisable to create multiple versions of our application to interface with each
 * of the modems available on the market because the code maintenance and application upgrades would
 * be too much work. For this reason, we will use an interface that specifies the method signatures
 * our application uses for interfacing with the modem. This would provide a uniform programming interface
 * to all the modems. This way, the application that uses a modem would not break even if the implementations
 * in the methods of the modem change in future.
 
 Typically, we would have open, close, read, and write operations that our application would invoke on a modem.
 Our interface has declare these methods as follows:
 */
public interface Modem {
  public boolean open();
  public boolean close();
  public String read ();
  public int write(String data);
}
