package kr.ac.kopo.ctc.kopo14.board.dao;

import java.util.ArrayList;
import java.util.List;

import kr.ac.kopo.ctc.kopo14.board.domain.Boarditem;

public class BoardItemDaoimpl implements BoardItemDao{

    public Boarditem create(String title, String content){
        Boarditem boarditem = new Boarditem();
        boarditem.setTitle(title);
        boarditem.setContent(content);
        
        // insert query
        
        return boarditem;
    }

    public Boarditem selectOne(int id){
        // .....

        Boarditem boarditem = new Boarditem();

        /// set

        return boarditem;
    }   

    public List<Boarditem> selectAll(){
        List<Boarditem> boarditem = new ArrayList<Boarditem>();
        
        // set
        // for () {
        //  Boarditem boarditem = new Boarditem();
        //  boarditem.add(boardItem)
        //}
        
        return boarditem;
    }   

    public Boarditem update(String title, String content){
        Boarditem boarditem = new Boarditem();
        boarditem.setTitle(title);
        boarditem.setContent(content);

        // update query

        return boarditem;
    }   
    
    public Boarditem delete(int id){
        Boarditem boarditem = new Boarditem();
        boarditem.setId(id);
        // delete query
        return boarditem;
    }    

}
