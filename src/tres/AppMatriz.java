package tres;

public class AppMatriz {
    public static void main(String[] args){
        Double[][] test = new Double[3][3];
        Double[][] entrada = {{10.0, 20.0, 30.0}, {40.0, 50.0, 60.0}, {70.0, 80.0, 90.0}};
        Double[][] entradaII = {{20.0, 10.0, 0.0}, {-10.0, -20.0, -30.0}, {-40.0, -50.0, -60.0}};
        Matriz x = new Matriz(entrada);
        Matriz y = new Matriz(entradaII);
        Matriz z = new Matriz(test);
/*
        z.mais(x, y);
        System.out.println(z);
        z.menos(x, y);
        System.out.println(z);
*/

        System.out.println("Chamada dos métodos como o cliente deseja");
        AdapterMatriz a = new AdapterMatriz(z);
        a.somar(x, y);
        System.out.println(a);
        a.subtrair(x, y);
        System.out.println(a);

    }
}
