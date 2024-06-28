package kr.ac.kopo.ctc.kopo14.board.dao;

import org.junit.jupiter.api.Test;

import kr.ac.kopo.ctc.kopo14.board.domain.Boarditem;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class BoardItemDaoTest{

    private BoardItemDao  boardItemDao = new BoardItemDaoimpl();
    
    @Test
    void create(){
        boardItemDao.create("title1", "content1");
        // assertEquals(5, result);
    }

    @Test
    void selectOne(){
        Boarditem boardItem = boardItemDao.selectOne(1);
        assertEquals(1, boardItem.getID());
        // assertEquals(5, result);
    }

    @Test
    void selectAll(){
       int result = 2 + 3;
       assertEquals(5, result);
    }

    @Test
    void update(){
        int result = 2 + 3;
       assertEquals(5, result);
    }

    @Test
    void delete(){
        int result = 2 + 3;
       assertEquals(5, result);
    }
}
