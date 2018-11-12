package Aula2;
public class Pilha {
    
    public int[] pilha;
    public int posicaoPilha;
 
    public Pilha() {
        this.posicaoPilha = -1;
// indica que esta nula, vazia, pois posição um indica que contém informação
        this.pilha = new int[10];
// criando uma pilha com 1000 posições
    }
 
    public boolean pilhaVazia() {
        //isEmpty
        if (this.posicaoPilha == -1) {
            return true;
        }
        return false;
    }
 
    public int tamanho() {
        //is
        if (this.pilhaVazia()) {
            return 0;
        }
        return this.posicaoPilha + 1;
    }
 
    public int exibeUltimoValor() {
        //top
        if (this.pilhaVazia()) {
            return 0;
        }
        return this.pilha[this.posicaoPilha];
    }
 
    public Object desempilhar() {
        //pop
        if (pilhaVazia()) {
            return null;
        }
        return this.pilha[this.posicaoPilha--];
    }
 
    public void empilhar(int valor) {
        // push
        if (this.posicaoPilha < this.pilha.length - 1) {
            this.pilha[++posicaoPilha] = valor;
        }
    }
 
    
}