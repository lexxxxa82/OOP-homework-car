public class Main {
    public static void main(String[] args) {
        Car car = new Car("Lada", "Granta", 1.7,"" , -1, "Россия");
        Car car1 = new Car("Audi", "A8 50 L TDI quattro", 3.0, "черный", 2020, "Германия");
        Car car2 = new Car("BMW", "Z8", 3.0, "черный", -1, "Германия");
        Car car3 = new Car("Kia", "Sportage 4-го поколения", 2.4, "красный", 2018, "Южная Корея");
        Car car4 = new Car("Hyundai", "Avante", 1.6, "оранжевый", 2016, "Южная Корея");

        System.out.println(car);
        System.out.println(car1);
    }
}