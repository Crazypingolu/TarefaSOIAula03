package view;

import controller.KillController;

public class Main {
    public static void main(String[] args) {
        KillController met = new KillController();
        // met.processos();
        // met.mataPID(valor);
        met.mataNome("notepad.exe");
    }
}
