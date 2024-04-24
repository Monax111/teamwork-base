public class SimpleLogic {

    boolean isAdult(Integer age) {
        if (age < 21) {
            System.out.println("Несовершеннолетний клиент");
            return false;
        } else {
            System.out.println("Совершеннолетний");
            return true;
        }
    }

}
