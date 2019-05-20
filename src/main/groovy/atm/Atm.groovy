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

    void withdrawCash(int amount) {

    }
}