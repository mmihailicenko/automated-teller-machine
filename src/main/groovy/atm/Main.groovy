package atm

class Main {

    static void main(String[] Args) {
        View view = new View()
        Atm atm = new Atm()
        boolean session
        while (true) {
            session = false
            view.welcomeMessage()
            def customerId = System.in.newReader().readLine()

            if (atm.authorize(customerId)) {
                session = true
            } else {
                view.errorMessageInvalidClientID()
            }

            while (session) {
                view.mainMenu()
                def response = System.in.newReader().readLine()

                switch (response) {
                    case '1':
                        atm.showStatus(customerId)
                        break
                    case '2':
                        atm.withdrawCash(customerId)
                        break
                    case '3':
                        session = false
                        break
                    default :
                        println("**ERROR**")
                        println("Wrong response, please choose one of the options or type \"3\" to log out")
                        break
                }
            }
        }
    }
}