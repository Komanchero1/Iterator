public class Main {
    public static void main(String[] args) {
         int showingNumbers = 10;//задаем сколько чисел хотим просмотреть
        int count = 0;//счетчик чисел

        //создаем 100 рандомных числа
        for (int num:new Randoms(1,100)){
            count++;
            // пока счетчик не достиг желаемого количества чисел для просмотра
            if(count != showingNumbers){
                System.out.print(num + " : ");//выводим в консоль число
            }
            //если счетчик  достиг желаемого количества чисел для просмотра
            if (count == showingNumbers){
                System.out.print(num + ".");//выводим в консоль
                break;//завершаем цикл
            }
        }
    }
}