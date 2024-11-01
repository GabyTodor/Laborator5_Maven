package ex2_tema;

public class PerecheNumere {
    private int a,b;
    public PerecheNumere(int a, int b) {
        this.a = a;
        this.b = b;
    }
    public PerecheNumere() {}
    public int getA() {return a;}
    public int getB() {return b;}
    public void setA(int a) {this.a = a;}
    public void setB(int b) {this.b = b;}

    @Override
    public java.lang.String toString() {
        return a+" "+b+"\n";
    }
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
    public int cmmdc() {
        while(a!=b){
            if(a>b)
                a-=b;
            else
                b-=a;
        }
        return a;
    }
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
