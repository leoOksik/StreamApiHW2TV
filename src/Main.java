
import java.time.Year;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        /* TODO:
            Создайте класс Телевизор. Он должен хранить информацию о названии модели, год выпуска, цена,
            диагональ, производитель. Нужно создать набор телевизоров и выполнить следующие задачи:
              1. Показать все телевизоры;
              2. Показать телевизоры с заданной диагональю;
              3. Показать все телевизоры одного производителя;
              4. Показать все телевизоры текущего года;
              5. Показать все телевизоры дороже заданной цены;
              6. Показать все телевизоры, отсортированные по цене по возрастанию;
              7. Показать все телевизоры, отсортированные по цене по убыванию.
              8. Показать все телевизоры, отсортированные по диагонали по возрастанию;
              9. Показать все телевизоры, отсортированные по диагонали по убыванию.
         */

        List<TV> tvList = Arrays.asList(
                new TV("UE43AU8000UXRU", 2022,53956,43,"Samsung"),
                new TV("OLED55B2RLA", 2020,135990,55,"LG"),
                new TV ("48OLED936", 2021,158500,46,"Sony"),
                new TV ("67HDTYY", 2020,19900,24,"Hyundai"),
                new TV ("48OLED936", 2019,167350,43,"Philips"),
                new TV ("OLED544B2RLA", 2022,100990,32,"LG"),
                new TV ("OLED54KLR", 2018,15700,27,"Sony"),
                new TV ("OLED55B2RLA", 2018,27300,24,"Samsung"));


        System.out.println("1");
        showAllTV (tvList);

        System.out.println("2");
        showTVSetDiagonal(tvList, 43);

        System.out.println("3");
        showTVOneVendor (tvList, "LG");

        System.out.println("4");
        showTVCurrentYear (tvList, Year.now().getValue());

        System.out.println("5");
        showTVMorePrice (tvList, 50000);

        System.out.println("6");
        sortTVPriceASC (tvList);

        System.out.println("7");
        sortTVPriceDESC (tvList);

        System.out.println("8");
        sortTVDiagonalASC(tvList);

        System.out.println("9");
        sortTVDiagonalDESC(tvList);

    }

    public static <T> void showAllTV (List <T> tvList) {

        tvList.forEach(System.out::println);
    }
    public static void showTVSetDiagonal (List <TV> tvList, double diagonal) {

        tvList.stream().filter((d)->(d.getDiagonal() == diagonal)).forEach(System.out::println);
    }

    public static void showTVOneVendor (List <TV> tvList, String vendor) {

        tvList.stream().filter((v)->(v.getVendor().equals(vendor))).forEach(System.out::println);
    }
    public static void showTVCurrentYear (List <TV> tvList, int year) {

        tvList.stream().filter((y)->(y.getYearRelease() == year)).forEach(System.out::println);
    }
    public static void showTVMorePrice (List <TV> tvList, int price) {

        tvList.stream().filter((p)->(p.getPrice() > price)).forEach(System.out::println);
    }

    public static void sortTVPriceASC (List <TV> tvList) {

        tvList.stream().sorted(Comparator.comparingInt(TV::getPrice)).forEach(System.out::println);
    }
    public static void sortTVPriceDESC (List <TV> tvList) {

        tvList.stream().sorted((o1, o2) -> o2.getPrice() - o1.getPrice()).forEach(System.out::println);
    }
    public static void sortTVDiagonalASC (List <TV> tvList) {

        tvList.stream().sorted(new Comparator<TV>() {
            @Override
            public int compare(TV o1, TV o2) {
                return (int) (o1.getDiagonal() - o2.getDiagonal());
            }
        }).forEach(System.out::println);
    }
    public static void sortTVDiagonalDESC (List <TV> tvList) {

        tvList.stream().sorted(Comparator.comparing(TV::getDiagonal).reversed()).forEach(System.out::println);
    }
}