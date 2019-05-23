package atm.views

import core.views.Screen
import core.views.Window

import javax.inject.Inject

class ApplicationWindow implements Window {

    Window window

    @Inject
    ApplicationWindow(Window window) {
        this.window = window
    }

    static void showScreen(Screen screen) {
        applicationWindow.setVisible(true)
        applicationWindow.setSize(400, 350)
        applicationWindow.remove(screen.jPanel)
        applicationWindow.add(screen.jPanel)
        applicationWindow.revalidate()
    }

    static void hideScreen(Screen screen) {
        applicationWindow.revalidate()
    }
}
