public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double height = 1.87; // единица СИ: [м]
        double weight = 98; // единица СИ: [кг]
        int index = service.calculate(height, weight);
        System.out.println(index);
    }
}