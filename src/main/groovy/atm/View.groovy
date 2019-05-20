package atm

class View {


    void showStartup() {

        Atm atm = new Atm()
        println("Enter your ID")
        String id = System.in.newReader().readLine()
        atm.authorize(id)
    }

    void mainMenu() {
        println("you are in the main menu")

    }

    void showBankAccountStatus() {

    }

    void showWithdrawalStaus() {

    }

    void showError() {

    }

    void login(int id) {
        atm.authorize(id)
    }

}
