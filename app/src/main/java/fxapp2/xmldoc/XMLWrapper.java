package fxapp2.xmldoc;

import java.io.File;


/**
  Interface for XML parsers used in app to be able to switch to other implementation like DOM4J 
*/
public interface XMLWrapper {

    public void readNode();


  

/*
  DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
  DocumentBuilder db = dbf.newDocumentBuilder(); 
  Document doc = db.parse(new File(filename));
*/




}
