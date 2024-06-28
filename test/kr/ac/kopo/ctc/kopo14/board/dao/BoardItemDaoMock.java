package kr.ac.kopo.ctc.kopo14.board.dao;

import java.util.ArrayList;
import java.util.List;

import kr.ac.kopo.ctc.kopo14.board.domain.Boarditem;

public class BoardItemDaoMock implements BoardItemDao {
    public Boarditem create(String title, String content){
        Boarditem boardItem = new Boarditem();
        boardItem.setTitle(title);
        boardItem.setContent(content);
        return boardItem;
    }

    public Boarditem selectOne(int id){
        Boarditem boardItem = new Boarditem();
        boardItem.setTitle("title");
        boardItem.setContent("content");
        return boardItem;
    }

    public List<Boarditem> selectAll(){
        Boarditem boarditem1 = new Boarditem();
        boarditem1.setTitle("title1");
        boarditem1.setContent("content1");

        Boarditem boarditem2 = new Boarditem();
        boarditem2.setTitle("title2");
        boarditem2.setContent("content2");

        List<Boarditem> boarditems = new ArrayList<Boarditem>();
        boarditems.add(boarditem1);
        boarditems.add(boarditem2);
        return boarditems;
    }

    public Boarditem update(String title, String content){
        Boarditem boarditem = new Boarditem();
        boarditem.setTitle(title);
        boarditem.setContent(content);
        return boarditem;
    }
    
    public Boarditem delete(int id){
        Boarditem boarditem = new Boarditem();
        return boarditem;
    }
}