package br.com.JosSousa.mwj.model;

import java.sql.Array;
import java.util.List;

public class Fields {
    
    private final int line;
    private final int column;
    
    private boolean open = false;
    private boolean mined = false;
    private boolean marked = false;

    private List<Fields> neighbors = new ArrayList<>();
    

    Fields(int line, int column) {
        this.line = line; 
        this.column = column;
    }
    
}
