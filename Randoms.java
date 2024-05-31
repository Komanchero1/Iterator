import java.util.Iterator;
import java.util.Random;

public class Randoms implements Iterable<Integer> {
    int min;
    int max;
    protected Random random;

    //конструктор
    public Randoms(int min, int max) {
        this.min = min;
        this.max = max;
    }
       //реализация метода интерфейса Iterator
    @Override
    public Iterator<Integer> iterator() {
        return new RandomsNumber();//возвращаем объект типа инт
    }

    //вспомогательный класс для реализации методов интерфейса  Iterator
   private class RandomsNumber implements Iterator<Integer> {

        //создаем экземпляр класса Random
        private Random random = new Random();


        //реализация метода интерфейса Iterator
        @Override
        public boolean hasNext() {
            return true;//бесконечная последовательность
        }


        //реализация метода интерфейса Iterator
        @Override
        public Integer next() {
            //генерируем случайное целое число от "0" до max - min + 1
            //+ min сдвигаем диапозон генерируемых чисел
            // так чтобы они начинались с min
            return random.nextInt(max - min + 1) + min;
        }
    }

}
