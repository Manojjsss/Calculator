class BasicCalculator{
    float addition (float num_1,float num_2){
        return(num_1 + num_2);
    }
    float substraction (float num_1,float num_2){
        return(num_1 - num_2);
    }
    float multiplication (float num_1,float num_2){
        return(num_1 * num_2);
    }
    float division (float num_1,float num_2){
        return(num_1 / num_2);
    }
    
    public float square(float x) {
        return (x * x);
    }

    public float cube(float x) {
        return (x * x * x);
    }
    public static void main(String[] args) {
        float num_1 =10;
        float num_2 = 5;
        BasicCalculator calc = new BasicCalculator();
        float add_result = calc.addition(num_1, num_2);
        System.out.println("Result of Addition is :" + add_result);
        float sub_result = calc.substraction(num_1, num_2);
        System.out.println("Result of Addition is :" + sub_result);
        float mul_result = calc.multiplication(num_1, num_2);
        System.out.println("Result of Addition is :" + mul_result);
        float div_result = calc.division(num_1, num_2);
        System.out.println("Result of Addition is :" + div_result);
        System.out.print("\nSquare of " + num_1+ " is: " + calc.square(num_1));
        System.out.print("\nCube of " + num_1 + " is: " + calc.cube(num_1));

    }
}