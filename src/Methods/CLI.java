package Methods;

import GUI.Gui;

public class CLI implements Runnable {

    public CLI() {
        new Thread(this, "Command Line Interface").start();
    }

    @Override
    public void run() {
        Input in = new Input();
        Laboratory laboratory = new Laboratory();
        int mode;

        exit:
        for (; ; ) {
            do {
                System.out.println("\nВЫБЕРИТЕ ЛАБОРАТОРУЮ РАБОТУ ОТ 1-6:\n");
                System.out.println("1. ЛАБОРАТОРНАЯ РАБОТА № 1 А");
                System.out.println("2. ЛАБОРАТОРНАЯ РАБОТА № 1 Б");
                System.out.println("3. ЛАБОРАТОРНАЯ РАБОТА № 2 А");
                System.out.println("4. ЛАБОРАТОРНАЯ РАБОТА № 2 Б");
                System.out.println("5. ЛАБОРАТОРНАЯ РАБОТА № 3 А");
                System.out.println("6. ЛАБОРАТОРНАЯ РАБОТА № 3 Б");
                System.out.println("0. ВЫХОДА");

                mode = in.input("\nВЫБЕРИТЕ: > ");
            } while (mode > 7 || mode < 0);
            if (mode == 0)
                break;

            switch (mode) {
                case 1:
                    laboratory.solveLaboratory1A();
                    break;
                case 2:
                    laboratory.solveLaboratory1B();
                    break;
                case 3:
                    laboratory.solveLaboratory2A();
                    break;

                case 4:
                    laboratory.solveLaboratory2B();
                    break;
                case 5:
                    laboratory.solveLaboratory3A();
                    break;
                case 6:
                    laboratory.solveLaboratory3B();
                    break;
                case 7:
                    new Gui();
                    break exit;

            }
        }
    }
}