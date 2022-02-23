package pro.sky.skypro.spring.calc;

public interface CalcService {
    String calcGreet ();
    int calcPlus (int num1, int num2);
    int calcMinus (int num1, int num2);
    double calcMultiply (int num1, int num2);
    double calcDivide (int num1, int num2);
}
