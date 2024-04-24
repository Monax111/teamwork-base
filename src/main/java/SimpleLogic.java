public class SimpleLogic {
    boolean isAdult(Integer age) {
        if (age < 21) {
            System.out.println("Несовершеннолетний");
            return false;
        } else {
            System.out.println("Совершеннолетний");
            return true;
        }
    }
}
