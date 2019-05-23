package atm

import atm.views.ApplicationWindow
import atm.views.CustomerMenuScreen
import atm.views.MainScreen
import core.views.WindowModule
import com.google.inject.Guice

class Atm {

    BankData bankData = new BankData()
    CustomerMenuScreen customerMenuScreen = new CustomerMenuScreen()
    MainScreen mainScreen = new MainScreen()

    def injector = Guice.createInjector(new WindowModule())
    def applicationWindow = injector.getInstance(ApplicationWindow)

    Boolean authorize(String id) {
        if (bankData.checkKey(id)) {
            if (bankData.getParam(id, "status").toString() == "ACTIVE") {
                applicationWindow.hideScreen(mainScreen)
                applicationWindow.showScreen(customerMenuScreen)
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