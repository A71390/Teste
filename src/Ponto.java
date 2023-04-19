public class Ponto {
    int x, y, size;

    public Ponto( int x, int y){
        this.x = x;
        this.y = y;
        size++;
    }

    public void printPonto(){
        System.out.println("("+this.x+", "+this.y+")");
    }
}
