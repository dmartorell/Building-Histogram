public class Main {

    // Método Creación de array con números aleatorios del 1-10.
    
    public static int[] array(int size) {
        int[] array = new int[size];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10) + 1;
        }

        return array;
    }

    // Método creación array con histograma por notas. En el índice 0 aparecen el número de alumnos con esa nota; 
    en el índice 1, el número de alumnos con esa nota, etc.
    
    public static int[] notas (int [] array) {
        int [] notas = new int[array.length+1];
        for (int i = 0; i < array.length; i++) {
            int indice = array[i];
            notas[indice] = notas[indice] + 1;
            }
        return notas;
    }

    public static void main(String[] args) {

        int[] array = array (10);
        int[] notas = notas(array);
        System.out.println(Arrays.toString(array));
        System.out.println();
        System.out.println(Arrays.toString(notas));
        }

}
