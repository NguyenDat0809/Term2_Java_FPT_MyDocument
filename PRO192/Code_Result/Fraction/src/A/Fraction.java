/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package A;

/**
 *
 * @author 84859
 */
public class Fraction {
    private int num;    //tu so
    private int deno;   //mau so
    public Fraction(){}
    public Fraction(int num, int deno){
        this. num = num;
        this.deno = deno;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public int getDeno() {
        return deno;
    }

    public void setDeno(int deno) {
        if(deno != 0)
            this.deno = deno;
    }
    //ADDING 2 Fractions
    public Fraction add(int num, int deno){ //normal
        int tmp1 = this.num * deno + this.deno * num;
        int tmp2 = this.deno * deno;
        Fraction x = new Fraction(tmp1, tmp2);  //không in ra kiểu số thập phân
                                                // nên ta trả về 1 đối tượng lưu tử và mẫu
        return x;
    }

    public Fraction add(Fraction B){    //object
        int tmp1 = this.num * B.getDeno() + this.deno * B.getNum();
        int tmp2 = this.deno * B.getDeno();
        Fraction x = new Fraction(tmp1, tmp2);
        return x;
    }
    //SUB
    public Fraction sub(int num, int deno){ //normal
        int tmp1 = this.num * deno - this.deno * num;
        int tmp2 = this.deno * deno;
        Fraction x = new Fraction(tmp1, tmp2);  //không in ra kiểu số thập phân
        // nên ta trả về 1 đối tượng lưu tử và mẫu
        return x;
    }

    public Fraction sub(Fraction B){    //object
        int tmp1 = this.num * B.getDeno() - this.deno * B.getNum();
        int tmp2 = this.deno * B.getDeno();
        Fraction x = new Fraction(tmp1, tmp2);
        return x;
    }

    //MULTIPLE
    public Fraction mul(int num, int deno){ //normal
        int tmp1 = this.num * num;
        int tmp2 = this.deno * deno;
        Fraction x = new Fraction(tmp1, tmp2);
        return x;
    }

    public Fraction mul(Fraction B){ //object
        int tmp1 = this.num * B.getNum();
        int tmp2 = this.deno * B.getDeno();
        Fraction x = new Fraction(tmp1, tmp2);
        return x;
    }
    //DIVIDE
    public Fraction div(int num, int deno){ //normal
        int tmp1 = this.num * deno;
        int tmp2 = this.deno * num;
        Fraction x = new Fraction(tmp1, tmp2);
        return x;
    }

    public Fraction div(Fraction B){ //object
        int tmp1 = this.num * B.getDeno();
        int tmp2 = this.deno * B.getNum();
        Fraction x = new Fraction(tmp1, tmp2);
        return x;
    }

    private int findUSCLN(int a, int b){
        if(a < 0)   a = -a;
        if(b < 0)   b = -b;
        while (a != b){
            if (a > b)  a = a -b;
            if(b > a)   b = b - a;
        }
        return a;
    }
    public Fraction shorten(){
        int USCLN = findUSCLN(this.getNum(), this.getDeno());
        int tmp1 = this.getNum() / USCLN;
        int tmp2 = this.getDeno() / USCLN;
        Fraction kq = new Fraction(tmp1, tmp2);
        return  kq;
    }

}
