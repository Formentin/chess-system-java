package boardgame;

public class BoardExpception extends RuntimeException{
    private static final long serialVersionUID = 1L;
    public BoardExpception(String msg){
        super(msg);
    }
}
