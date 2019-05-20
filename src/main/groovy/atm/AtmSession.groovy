package atm

class AtmSession {

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
                        view.withdrawalStatus()
                        break
                    case "exit":
                        session = false
                        break
                    default :
                        println("Wrong response, please choose one of the options or type \"exit\" to log out")
                        break
                }
            }
        }
    }
}