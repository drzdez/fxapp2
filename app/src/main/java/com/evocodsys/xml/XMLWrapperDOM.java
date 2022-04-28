package com.evocodsys.xml;

// These classes read the sample XML file and manage output:

// These are the JAXP APIs used by DOMEcho:

// package dom;
import javax.xml.parsers.DocumentBuilder; 
import javax.xml.parsers.DocumentBuilderFactory;

// These classes are for the exceptions that can be thrown when the XML document is parsed:

import org.xml.sax.ErrorHandler;
import org.xml.sax.SAXException; 
import org.xml.sax.SAXParseException;
import org.xml.sax.helpers.*;

// These classes read the sample XML file and manage output:

import java.io.File;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

// Finally, import the W3C definitions for a DOM, DOM exceptions, entities and nodes:

import org.w3c.dom.Document;
import org.w3c.dom.DocumentType;
import org.w3c.dom.Entity;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;


/**
  Implementation of XMLWrapper by standard java DOM
*/
  
public class XMLWrapperDOM implements XMLWrapper {

  private Document xmldoc = null;

  // Constructors 
  public XMLWrapperDOM(File aFile)throws Exception{
      privXMLDocLoad(aFile);
  }

  public XMLWrapperDOM(String astrFileName)throws Exception{
      privXMLDocLoad(new File(astrFileName));
  }


  /** 
      document load
  */
  private void privXMLDocLoad(File aFile) throws Exception {
      DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
      DocumentBuilder db = dbf.newDocumentBuilder(); 
      xmldoc = db.parse(aFile);
  }
 


  public void readNode(){
 
     String lstrNodeName;

     lstrNodeName = xmldoc.getFirstChild().getNodeName();


     System.out.println(lstrNodeName);


/*
      for (Node child = n.getFirstChild(); child != null;
      child = child.getNextSibling()) {
      echo(child);
      }
*/
      return;
  }
  
  




}
