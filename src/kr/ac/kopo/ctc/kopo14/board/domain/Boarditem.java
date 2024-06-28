package kr.ac.kopo.ctc.kopo14.board.domain;

public class Boarditem {
    private int id;
    private String title;
    private String content;

    public int getID(){
        return id;
    }
    public String getTitle(){
        return title;
    }
    public String getContent(){
        return content;
    }
    
    public void setId(int id){
        this.id = id;
    }
    public void setTitle(String title){
        this.title = title;
    }
    public void setContent(String content){
        this.content = content;
    }
}
