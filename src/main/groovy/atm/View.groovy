package atm

class View {

    static void showMainMenu() {
        println("---------------------------------------------------------")
        println("-----enter 1 to check bank account status----------------")
        println("-----enter 2 to withdraw cash----------------------------")
        println("---------------------------------------------------------")
        println("---------------------------------------------------------")
    }

    static void showStartup() {
        println("---------------------------------------------------------")
        println("---------------------enter your ID-----------------------")
        println("---------------------------------------------------------")
    }

    static void showBankAccountStatus() {
        println("---------------------------------------------------------")
        println("---------------------------------------------------------")
    }

    static void showWithdrawalStaus() {
        println("---------------------------------------------------------")
        println("---------------------------------------------------------")
    }

    static void showError() {
        println("---------------------------------------------------------")
        println("-----something went wrong, please contact your agent-----")
        println("---------------------------------------------------------")
    }
}