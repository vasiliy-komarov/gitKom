package matrix;

public class ArrayInit
{
    public static void main(String[] args) {
        // Создание одномерного массива чисел
        int[] a = {1, 2, 56, 78, 34, 12, 89};
 
        // Создание двумерного массива символов
        // Обратите внимание на фигурные скобки для выделения
        // массивов внутри массива. Второй массив - пустой
        char[][] graph = {{'1', 'R', 'H', '&', '5', '@'}, {}, {'L', '0', 'I'}};
 
        // Печать массива символов через конструкцию foraech
        // Проходим по элементам массива массивов - т.е. получаем 
        // одномерный массив при каждом цикле
        for(char[] g1 : graph) {
            for(char g2 : g1) {
                // Печатаем строку из массивов
                System.out.print(g2);
            }
            // Переходим на следующую строку
            System.out.println();
        }
    }
}