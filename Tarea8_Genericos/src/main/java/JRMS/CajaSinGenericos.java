package JRMS;

import java.util.Arrays;

public class CajaSinGenericos {
    Object[] content;

    public CajaSinGenericos() {
    }

    public CajaSinGenericos(Object[] content) {
        this.content = content;
    }

    public Object[] getContent() {
        return content;
    }

    public void setContent(Object[] content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "CajaSinGenericos{" +
                "content=" + Arrays.toString(content) +
                '}';
    }
    public void add(int posicion, Object objeto){
        content[posicion] = objeto;
    }

    public Object get(int posicion){
        return content[posicion];
    }
}
