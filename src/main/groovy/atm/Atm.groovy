package atm

class Atm {
    BankData bankData = new BankData()
    View view = new View()

    Boolean authorize(String id) {
        if (bankData.getData(id).toString()) {
            if (bankData.getParam(id, "status").toString() == "ACTIVE") {
                true
            } else {
                false
            }
        } else {
            false
        }
    }

    void showStatus(String id) {
        view.bankAccountStatus(bankData.getData(id))
    }

    void withdrawCash(String id) {
        view.withdrawalMenu()
        def withdrawAmount = System.in.newReader().readLine()
        def customerBalnce = bankData.getParam(id, 'balance')

        if (withdrawAmount <= bankData.getParam(id, 'balance')) {
            new BankData().setData(id, "balance", (customerBalnce.toBigDecimal() - withdrawAmount.toBigDecimal()).toString())
            view.withdrawSuccessful()
            view.withdrawalStatus(bankData.getData(id), withdrawAmount)
        } else {
            view.withdrawErrorNotEnoughMoney()
        }
    }
}