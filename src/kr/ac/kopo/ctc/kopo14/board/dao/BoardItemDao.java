package kr.ac.kopo.ctc.kopo14.board.dao;

import java.util.List;

import kr.ac.kopo.ctc.kopo14.board.domain.Boarditem;

public interface BoardItemDao {
    Boarditem create(String title, String content);
    Boarditem selectOne(int id);
    List<Boarditem> selectAll();
    Boarditem update(String title, String content);
    Boarditem delete(int id);
}
