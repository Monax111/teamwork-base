public class SimpleLogic {

    boolean isAdult(Integer age) {
        if (age < 18) {
            System.out.println("Несовершеннолетний клиент");
            return false;
        } else {
            System.out.println("Совершеннолетний клиент");
            return true;
        }
    }

}
