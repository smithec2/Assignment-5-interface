package edu.ldsbc.cs115;

import edu.ldsbc.types.Connection;

import java.util.UUID;

/**
 * Created by CSmith on 2/16/2017.
 * To use the LinksysModem class, we would use code similar to the following:
 * Modem modem = new LinksysModem();
 * modem.open();
 * modem.write(buffer);
 * modem.read();
 * modem.close();
 *
 * Finish implementing this class, look at close and write
 */
public class LinksysModem implements Modem {
  Connection connectionState = Connection.CLOSED;
  @Override
  public boolean open() {
    boolean retValue = false;
    if(connectionState == Connection.CLOSED)
    {
      this.connectionState = Connection.OPEN;
      retValue = false;
    }
    return retValue;
  }
  
  @Override
  public boolean close() {
    // set connectionState to closed if open and return true otherwise return false
    return false;
  }
  
  @Override
  public String read() {
    String readVal = null;
    if(this.connectionState == Connection.OPEN)
    {
      readVal = UUID.randomUUID().toString();
    }
      return  readVal;
  }
  
  @Override
  public int write(String data) {
    // return length of data being written
    return 0;
  }
}
