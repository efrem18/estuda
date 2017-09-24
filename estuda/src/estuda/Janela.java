
package estuda;

public class Janela {
    private boolean aberta;
    private String cor;
    private float dimX;
    private float dimY;
    
    public void abrir(float dimX,float dimY){
        this.dimX = dimX;
        this.dimY = dimY;
    }
    public void fechar(float dimX,float dimY){
        this.dimX = dimX;
        this.dimY = dimY;
 
    }
    public void pintar(){
        
    }
    public boolean estarAberta(){
        if (dimX == 0 && dimY == 0){
            return true;
        }else{
            return false;
        }
       
    }

    public boolean isAberta() {
        return aberta;
    }

    public void setAberta(boolean aberta) {
        this.aberta = aberta;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public float getDimX() {
        return dimX;
    }

    public void setDimX(float dimX) {
        this.dimX = dimX;
    }

    public float getDimY() {
        return dimY;
    }

    public void setDimY(float dimY) {
        this.dimY = dimY;
    }
}
