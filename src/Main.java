public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1");
        int humanAge = 33;
        if (humanAge >= 2 && humanAge <= 6) {
            System.out.println("Если возраст человека равен " + humanAge + ", то ему нужно ходить в детский сад");
        } else if (humanAge >= 7 && humanAge <= 18) {
            System.out.println("Если возраст человека равен " + humanAge + ", то ему нужно ходить в школу");
        } else if (humanAge > 18 && humanAge < 24) {
            System.out.println("Если возраст человека равен " + humanAge + ", то его место в университете");
        } else {
            System.out.println("Если возраст человека равен " + humanAge + ", то ему пора ходить на работу");

        }

        System.out.println("Задание 2");

    }
}