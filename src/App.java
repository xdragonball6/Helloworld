import java.util.List;

import kr.ac.kopo.ctc.kopo14.board.dao.BoardItemDao;
import kr.ac.kopo.ctc.kopo14.board.dao.BoardItemDaoimpl;
import kr.ac.kopo.ctc.kopo14.board.domain.Boarditem;

public class App {
    public static void main(String[] args) throws Exception {
        BoardItemDao boardItemDao = new BoardItemDaoimpl();

        
        List<Boarditem> boarditems = boardItemDao.selectAll();
        
        for(Boarditem boarditem: boarditems){
            System.out.println(boarditem.getID());
            System.out.println(boarditem.getTitle());
            System.out.println(boarditem.getContent());
        }
    }
}
