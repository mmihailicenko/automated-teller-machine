package atm

class Atm {
    BankData bankData = new BankData()

    void authorize(String id) {
        if (bankData.getData(id)) {
            if (bankData.getParam(id, "status") == "ACTIVE") {
                true
            }
        }
        false
    }

    void showStatus() {

    }

    void withdrawCash(int amount) {

    }
}