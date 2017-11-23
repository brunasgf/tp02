package tres;
public class AdapterMatriz extends Matriz {
    private Matriz x;

    public AdapterMatriz(Matriz x) {
        setX(x);
    }

    public Matriz getX() {
        return x;
    }

    public void setX(Matriz x) {
        this.x = x;
    }

    //Método como o cliente deseja
    public static Matriz somar(Matriz x, Matriz r){
        Double[][] num = new Double[3][3];
        Matriz resultado = new Matriz(num);
        resultado.mais(x, r);
        return resultado;
    }

    //Método como o cliente deseja
    public static Matriz subtrair(Matriz x, Matriz r){
        Double[][] num = new Double[3][3];
        Matriz resultado = new Matriz(num);
        resultado.menos(x, r);
        return resultado;
    }


    @Override
    public void mostrarMatriz(Matriz x) {
        super.mostrarMatriz(x);
    }
}

