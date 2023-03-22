package FractionalKnapsack;

import java.util.Arrays;
import java.util.Comparator;

// Нужно получить максимальную ценность в протфеле. Продукты можно делить
public class Main {
    public static void main(String[] args) {
        final int W = 7; // вместимость рюкзака
        final Item item1 = new Item(4, 20);
        final Item item2 = new Item(3, 18);
        final Item item3 = new Item(2,14);

        final Item[] items = {item1, item2, item3};
        Arrays.sort(items, Comparator.comparingDouble(Item::valuePerUnitOfWeight).reversed());
        System.out.println(Arrays.toString(items));

        int weight = 0;
        int value = 0;
        int currentItem = 0; // эти переменные нужны для подсчёта в рюкзак
        while (currentItem < items.length && weight != W) {
            if (weight + items[currentItem].getWeight() <= W) {
                // складываем целиком
                value += items[currentItem].getValue();
                weight += items[currentItem].getWeight();
            } else {
                // часть объекта
                value += ((W - weight) / (double) items[currentItem].getWeight()) * items[currentItem].getValue();
                weight = W; // рюкзак стал полным
            }
            currentItem++;
        }
        System.out.println("Максимальная ценность рюкзака с этими объектами: " + value);
    }
}
class Item {
        private int weight;
        private int value;
        public Item(int weight, int value) {
            this.weight = weight;
            this.value = value;
        }
        public double valuePerUnitOfWeight() {
            return value / (double) weight;
        }
        public int getWeight() {
            return weight;
        }
        public int getValue() {
            return value;
        }

        @Override
        public String toString() {
            return "{w= " + weight + ", v= " + value + "} = " + value / (double) weight;
        }
}
