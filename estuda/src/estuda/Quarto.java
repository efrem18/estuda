
package estuda;

/**
 *
 * @author efrem
 */
public class Quarto {
    private String cor;
    private Janela janela1;
    private Janela janela2;
    
    public void pintar(){
        
    }
    public int quantasPortasEstasAberta(){
        int qntd = 0;
        if(this.janela1.estarAberta()){
            qntd++;
        }
        if(this.janela2.estarAberta()){
           qntd++;
        }
        return qntd;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public Janela getJanela1() {
        return janela1;
    }

    public void setJanela1(Janela janela1) {
        this.janela1 = janela1;
    }

    public Janela getJanela2() {
        return janela2;
    }

    public void setJanela2(Janela janela2) {
        this.janela2 = janela2;
    }
}
