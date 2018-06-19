/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package web_server;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import models.ServicesDataCenter;
import models.Song;
import models.SongResult;
import org.apache.thrift.TException;
import org.apache.thrift.protocol.TBinaryProtocol;
import org.apache.thrift.protocol.TMultiplexedProtocol;
import org.apache.thrift.protocol.TProtocol;
import org.apache.thrift.transport.TSocket;
import org.apache.thrift.transport.TTransport;
import thrift_services.SongServices;

/**
 *
 * @author cpu11165-local
 */
public class LyricsServlet extends HttpServlet{

    private final int port = 8001;
    private final String host = "localhost";
    
    
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
  
        String page = req.getParameter("page");
        String id = req.getParameter("id");
        Integer current_page = 0;
         
        try{
            current_page = Integer.parseInt(page);
        }catch(Exception ex){
            ex.printStackTrace();
        }
        
        resp.setStatus(HttpServletResponse.SC_OK);
        resp.setContentType("text/plain;charset=UTF-8");
        PrintWriter out = resp.getWriter();
        
        String lyric = this.getLyricsByName(id, current_page);
        out.println(lyric);
    }
    
    
    private String getLyricsByName(String id, int page){
        String lyric = "";
        try{
            TSocket transport  = new TSocket(host, port);
            transport.open();
            
            TBinaryProtocol protocol = new TBinaryProtocol(transport);
            TMultiplexedProtocol mpLyricServices = new TMultiplexedProtocol(protocol, "LyricServices");
            SongServices.Client lyricServices = new SongServices.Client(mpLyricServices);

            transport.close(); 
        }catch(TException ex){
            ex.printStackTrace();
        }  
        return lyric;
    } 
}
