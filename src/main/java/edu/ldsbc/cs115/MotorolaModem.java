package edu.ldsbc.cs115;

import edu.ldsbc.types.Connection;

import java.util.UUID;

/**
 * Created by CSmith on 2/16/2017.
 * The method implementations in this class would be different from the implementations provided in LinksysModem class.
 * Each implementation would be specific to the modem manufacturer. Once we create such classes specific to each
 * modem manufacturer, we can develop our application software that interfaces easily with each of these modems.
 *
 * Finish implementing this class, look at all the method.
 */
public class MotorolaModem implements Modem {
  
  @Override
  public boolean open() {
    return false;
  }
  
  @Override
  public boolean close() {
    return false;
  }
  
  @Override
  public String read() {
    return null;
  }
  
  @Override
  public int write(String data) {
    return 0;
  }
}
