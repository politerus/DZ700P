package hm3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.SortedMap;

public class Price implements Comparable<Price>{
    private String productName;
    private String store;
    private String price;

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getStore() {
        return store;
    }

    public void setStore(String store) {
        this.store = store;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    @Override
    public int compareTo(Price o) {return this.store.compareTo(o.getStore());}

    @Override
    public String toString() {
        return "" +
                "Название продукта " + productName + ";" +
                ", магазин -" + store + ';' +
                ", цена ='" + price + "UAH;";
    }

    public Price(String productName, String store, String price) {
        this.productName = productName;
        this.store = store;
        this.price = price;
    }
}

class Main{

    public static void main(String[] args) {
        ArrayList<Price> priceList = new ArrayList<>();

        for (int i = 0; i < 2; i++) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Введите название продукта:");
            String productName = sc.nextLine();
            System.out.println("Введите название магазина:");
            String store = sc.nextLine();
            System.out.println("Введите цену в гривнах:");
            String price = sc.nextLine();

            priceList.add(new Price(productName, store, price));
        }

        Collections.sort(priceList);
        System.out.println(priceList.toString());

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите магазин, который вы ищете:");
        String storeName = sc.nextLine();

        boolean flag = false;
        for (Price temp : priceList) {

            if (storeName.equalsIgnoreCase(temp.getStore())){
                System.out.println("Товары в этом магазине: " + temp.getProductName());
                flag = true;

            }
        }

        if(flag == false){
            try{
                throw new Exception();
            }
            catch (Exception e){
                System.out.println("Нет такого магазина!");
            }
        }

    }

}
/*
Створіть проект за допомогою IntelliJ IDEA. Потрібно: Описати клас з іменем Price, що містить такі поля:

  назву товару;

  назву магазину, в якому продається товар;

  вартість товару у гривнях.

 Написати програму, яка виконує такі дії:

  введення з клавіатури даних до масиву, що складається з двох елементів типу Price
 (записи мають бути впорядковані в алфавітному порядку за назвами магазинів);

  виведення на екран інформації про товари, що продаються в магазині, назва якого
 введена з клавіатури (якщо такого магазину немає, вивести виняток).
 */
