package atm

class View {
    static void mainMenu() {
        println("---------------------------------------------------------")
        println("enter 1 to check bank account status")
        println("enter 2 to withdraw cash")
        println("enter 3 to logout")
        print(":")
    }

    static void welcomeMessage() {
        println("---------------------------------------------------------")
        println("enter your ID")
        print(":")
    }

    static void bankAccountStatus(Map customerData) {
        println("---------------------------------------------------------")
        println("| Name Surname: $customerData.name")
        println("| Bank Account Number: $customerData.bankAccountNumber")
        println("| Bank Account Balance: $customerData.balance")

    }

    static void withdrawalStatus(Map customerData, String withdrawAmount) {
        println("---------------------------------------------------------")
        println("| Bank Account Number: $customerData.bankAccountNumber")
        println("| Bank Account Balnce: $customerData.balance")
        println("| Withrawed Amount: $withdrawAmount")
    }

    static void withdrawalMenu() {
        println("---------------------------------------------------------")
        println("Enter amount you want to withdraw")
        print(":")
    }

    static void withdrawSuccessful() {
        println("---------------------------------------------------------")
        println("Withdraw was successful")
    }

    static void withdrawErrorNotEnoughMoney() {
        println("**ERROR**")
        println("Not enough money on your bank account")
    }

    static void errorMessageInvalidOption() {
        println("**ERROR**")
        println("Wrong response, please choose one of the options or type \"3\" to log out")
    }

    static void errorMessageBankAccountStatusIsNotActive(){
        println("**ERROR**")
        println("Your Bank Account Is Not Active")
    }

    static void errorMessageInvalidClientID() {
        println("**ERROR**")
        println("Your ID is not valid")
    }
}