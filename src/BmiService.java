public class BmiService {
    public int calculate(int weight, double height) {
        int res;
        res = (int) ( weight / (height * height) );
        return res;
    }
}
