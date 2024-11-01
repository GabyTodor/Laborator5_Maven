package ex2_tema;

/**
 * @author Gaby
 * @version 1
 * @since 2024
 * clasa PerecheNumere care are variabile membre private doi întregi.
 */
public class PerecheNumere {
    private int a,b;

    /**
     * Constructorul clasei cu 2 parametrii(cei doi intregi)
     * @param a primul intreg
     * @param b al doilea intreg
     */
    public PerecheNumere(int a, int b) {
        this.a = a;
        this.b = b;
    }

    /**
     * Constructor simplu
     */
    public PerecheNumere() {}

    /**
     * getter pentru a
     */
    public int getA() {return a;}
    /**
     * getter pentru b
     */
    public int getB() {return b;}
    /**
     * setter pentru a
     */
    public void setA(int a) {this.a = a;}
    /**
     * setter pentru b
     */
    public void setB(int b) {this.b = b;}

    /**
     * suprascrierea metodei toString() din clasa Object
     * @return string cu cei 2 intregi
     */
    @Override
    public java.lang.String toString() {
        return a+" "+b+"\n";
    }

    /**
     * metoda care verifica daca cei 2 intregi sunt numere consecutive ale sirului lui fibbonacci
     * @return true/false
     */
    public boolean consecutive() {
        int x=0,y=1,z=1;
        while(y< a){
            x=y;
            y=z;
            z=x+y;
        }
        if (y==a && z==b) return true;
        return false;
    }

    /**
     * metoda pentru cel mai mare divizor comun al perechii de intregi
     * @return cmmdc(a,b)
     */
    public int cmmdc() {
        while(a!=b){
            if(a>b)
                a-=b;
            else
                b-=a;
        }
        return a;
    }

    /**
     * metoda pentru suma cifrelor unui numar si verificare dac cele 2 numere din pereche au suma egala
     * @return true/false
     */
    public boolean suma_cifre() {
        int sx=0,sy=0;
        while(a!=0){
            sx+=a%10;
            a/=10;
        }
        while(b!=0){
            sy+=b%10;
            b/=10;
        }
        if(sx==sy) return true;
        return false;
    }

    /**
     * metoda pentru verificarea daca cele 2 numere au un numar egal de cifre pare
     * @return true/false
     */
    public boolean paritate() {
        int kx=0,ky=0;
        while(a!=0){
            if(a%2==0)
                kx++;
            a/=10;
        }
        while(b!=0){
            if(b%2==0)
                ky++;
            b/=10;
        }
        if(kx==ky) return true;
        return false;
    }
}
