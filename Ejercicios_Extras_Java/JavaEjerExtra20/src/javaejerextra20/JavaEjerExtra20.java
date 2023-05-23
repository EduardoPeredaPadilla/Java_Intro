
package javaejerextra20;

public class JavaEjerExtra20 {

    public static void main(String[] args) {
        
        int N = 4;
        int [ ] vector = new int [ N ];
        int [ ] vectorR = LlenarVector(vector , N);
        
        Imprimir(vectorR, N);
        
    }
    
    public static int [ ] LlenarVector(int vector [ ], int N) {
        
        for (int i = 0; i < N; i++) {
            vector[ i ] = (int) (Math.random()*5+1);
        }
        
        return vector;
    }
    
    public static void Imprimir(int [ ] vectorR, int N) {
        
        for (int i = 0; i < N; i++) {
            System.out.print("[ " + vectorR[ i ] + " ]");
        }
        
    }
    
}
