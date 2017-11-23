package tres;
public class Matriz {
    private Double[][] valor;

    public Matriz(Double[][] entrada){
        setValor(entrada);
    }

    public Matriz() {
    }

    public Double[][] getValor() {
        return valor;
    }

    public void setValor(Double[][] valor) {
        this.valor = valor;
    }


    public static Matriz mais(Matriz x, Matriz r){
        Double[][] test = new Double[3][3];
        int i, j;
        for (i=0; i<3; i++){
            for (j=0; j<3; j++) {
                test[i][j] = x.valor[i][j] + r.valor[i][j];
            }
        }
        Matriz result = new Matriz(test);
        result.mostrarMatriz(result);
        return result;
    }

    public static Matriz menos(Matriz x, Matriz r){
        Double[][] test = new Double[3][3];
        int i, j;
        for (i=0; i<3; i++){
            for (j=0; j<3; j++){
                test[i][j] = x.valor[i][j] - r.valor[i][j];
            }
        }
        Matriz result = new Matriz(test);
        result.mostrarMatriz(result);
        return result;
    }

    public void mostrarMatriz(Matriz x){
        int i, j;
        for (i=0; i<3; i++){
            for (j=0; j<3; j++){
                System.out.print( "\t" + x.valor[i][j] + "\t");
            }
            System.out.println();
        }
    }
}