package atm

class Atm {
    BankData bankData = new BankData()
    View view = new View()

    Boolean authorize(String id) {
        if (bankData.checkKey(id)) {
            if (bankData.getParam(id, "status").toString() == "ACTIVE") {
                true
            } else {
                view.errorMessageBankAccountStatusIsNotActive()
                false
            }
        } else {
            view.errorMessageInvalidClientID()
            false
        }
    }

    void showStatus(String id) {
        view.bankAccountStatus(bankData.getData(id))
    }

    void withdrawCash(String id) {
        view.withdrawalMenu()
        def withdrawAmount = System.in.newReader().readLine()
        def customerBalance = bankData.getParam(id, 'balance')
        withdrawAmount = withdrawAmount.toBigDecimal()
        customerBalance = customerBalance.toBigDecimal()

        if (withdrawAmount <= customerBalance) {
            String newBalance = (customerBalance - withdrawAmount).toString()
            new BankData().setData(id, "balance", newBalance)
            view.withdrawSuccessful()
            view.withdrawalStatus(bankData.getData(id), withdrawAmount.toString())
        } else {
            view.withdrawErrorNotEnoughMoney()
        }
    }
}