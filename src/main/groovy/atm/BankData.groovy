package atm

import com.google.gson.JsonParser
import groovy.json.JsonSlurper

class BankData {

    void getData(String arg) {
        def jsonSlurper = new JsonSlurper()
        data = jsonSlurper.parse(new File("C:/projects/automated-teller-machine/src/main/groovy/atm/data/bank-clientele-data.json"))

    }

    void setData() {

    }
}
