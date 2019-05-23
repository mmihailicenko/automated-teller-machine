package atm

import atm.views.ApplicationWindow
import atm.views.MainScreen
import core.views.WindowModule
import com.google.inject.Guice

class Main {

    static void main(String[] Args) {
        def injector = Guice.createInjector(new WindowModule())
        def applicationWindow = injector.getInstance(ApplicationWindow)
        MainScreen mainScreen = new MainScreen()
        applicationWindow.showScreen(mainScreen)
    }
}