package atm

class View {
    static void mainMenu() {
        println("---------------------------------------------------------")
        println("-----enter 1 to check bank account status----------------")
        println("-----enter 2 to withdraw cash----------------------------")
        println("---------------------------------------------------------")
        println("---------------------------------------------------------")
    }

    static void welcomeMessage() {
        println("---------------------------------------------------------")
        println("---------------------enter your ID-----------------------")
        println("---------------------------------------------------------")
    }

    static void bankAccountStatus(Map customerData) {
        println("---------------------------------------------------------")
        println("-------------$customerData.name--------------------------")
        println("-------------$customerData.bankAccountNumber-------------")
        println("-------------$customerData.balance-----------------------")
        println("-------------$customerData.status------------------------")
        println("---------------------------------------------------------")

    }

    static void withdrawalStatus() {
        println("---------------------------------------------------------")
        println("---------------------------------------------------------")
    }

    static void errorMessageInvalidClientID() {
        println("---------------------------------------------------------")
        println("-----Your ID is not valid-----")
        println("---------------------------------------------------------")
    }
}