package core.views

import atm.views.ApplicationWindow
import com.google.inject.Binder
import com.google.inject.Module
import com.google.inject.Scopes

class WindowModule implements Module {
    void configure(Binder binder) {
        binder.bind(Window)
        .to(ApplicationWindow)
        .in(Scopes.SINGLETON)
    }
}
