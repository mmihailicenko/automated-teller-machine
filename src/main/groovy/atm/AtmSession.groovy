package atm

class AtmSession {

    static void main(String[] Args) {
        View view = new View()
        Atm atm = new Atm()
        def session = true
        view.showStartup()

        while (session) {
            def response = System.in.newReader().readLine()
        }
    }
}