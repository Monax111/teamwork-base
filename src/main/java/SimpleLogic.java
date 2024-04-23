public class SimpleLogic {
    boolean isAdult(Integer age) {
        if (age < 18) {
            System.out.println("Несовершеннолетний");
            return false;
        } else {
            System.out.println("Совершеннолетний");
            return true;
        }
    }
}
