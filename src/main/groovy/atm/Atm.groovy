package atm

class Atm {

    View view = new View()
    BankData bankData = new BankData()

    void authorize(String id) {
        if(checkClientData(id)){
            view.mainMenu()
        } else {
            view.showError()
        }
    }

    Boolean checkClientData(String id) {
        bankData.getData(id)
        if (id) {
            String status = bankData.getData("STATUS")
            if (status == "ACTIVE") {
                return(true)
            }
        }
        return(false)
    }

    void showStatus() {

    }

    void withdrawCash(int amount) {

    }
}
