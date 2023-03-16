// Создать класс Notebook с полями:
// 1. Стоимость (int)
// 2. Оперативная память (int)
// Нагенерить объектов этого класса, создать список и отсортировать его в трех вариантах:
// 1. По возрастанию цены
// 2. По убыванию цены
// 3. По оперативке по убыванию. Если оперативки равны - по убыванию цены.
// 4.+ придумать свои параметры и отсортировать по ним

import java.util.*;

public class Notebook {
    private int price;
    private int ram;
    private int diskSize;
    private String brand;

    public Notebook(int price, int ram, int diskSize, String brand) {
        this.price = price;
        this.ram = ram;
        this.diskSize = diskSize;
        this.brand = brand;
    }

    public int getPrice() {
        return price;
    }

    public int getRam() {
        return ram;
    }

    public int getDiskSize() {
        return diskSize;
    }

    public String getBrand() {
        return brand;
    }

    public static void main(String[] args) {
        Notebook[] notebooks = {
                new Notebook(500, 4, 256, "Lenovo"),
                new Notebook(800, 8, 512, "Dell"),
                new Notebook(300, 4, 128, "Asus"),
                new Notebook(1200, 16, 1024, "Apple"),
                new Notebook(700, 8, 256, "HP"),
                new Notebook(900, 16, 512, "Acer")
        };
        Arrays.sort(notebooks, Comparator.comparing(Notebook::getPrice));
        System.out.println("Сортировка по возрастанию цены:");
        for (Notebook notebook : notebooks) {
            System.out.println("Цена: " + notebook.getPrice() + ", ОЗУ: " + notebook.getRam());
        }
        System.out.println();

        Arrays.sort(notebooks, Comparator.comparing(Notebook::getPrice).reversed());
        System.out.println("Сортировка по убыванию цены:");
        for (Notebook notebook : notebooks) {
            System.out.println("Цена: " + notebook.getPrice() + ", ОЗУ: " + notebook.getRam());
        }
        System.out.println();

        Arrays.sort(notebooks, Comparator.comparing(Notebook::getRam).reversed().thenComparing(Comparator.comparing(Notebook::getPrice).reversed()));
        System.out.println("Сортировка по оперативке по убыванию, а если оперативки равны - по убыванию цены:");
        for (Notebook notebook : notebooks) {
            System.out.println("Цена: " + notebook.getPrice() + ", ОЗУ: " + notebook.getRam());
        }
        System.out.println();
    
        Arrays.sort(notebooks, Comparator.comparing(Notebook::getDiskSize));
        System.out.println("Сортировка по возрастанию размера диска:");
        for (Notebook notebook : notebooks) {
            System.out.println("Цена: " + notebook.getPrice() + ", ОЗУ: " + notebook.getRam() + ", Размер диска: " + notebook.getDiskSize() + ", Марка: " + notebook.getBrand());
        }
        System.out.println();
    
        Arrays.sort(notebooks, Comparator.comparing(Notebook::getBrand));
        System.out.println("Сортировка по названию марки ноутбука:");
        for (Notebook notebook : notebooks) {
            System.out.println("Цена: " + notebook.getPrice() + ", ОЗУ: " + notebook.getRam() + ", Размер диска: " + notebook.getDiskSize() + ", Марка: " + notebook.getBrand());
        }
        System.out.println();
    }
}