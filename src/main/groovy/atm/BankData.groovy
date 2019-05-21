package atm

import groovy.json.JsonSlurper
import groovy.json.JsonOutput

class BankData {
    def jsonSlurper = new JsonSlurper()
    def PATH_TO_DATA = "src/main/groovy/atm/data/bank-clientele-data.json"

    Map getData(String id) {
        def data = jsonSlurper.parse(new File(PATH_TO_DATA))
        data."$id"
    }

    String getParam(String id, String key) {
        def data = jsonSlurper.parse(new File(PATH_TO_DATA))
        data."$id"."$key"
    }

    void setData(String id, String key, String value) {
        def data = jsonSlurper.parse(new File(PATH_TO_DATA))
        data."$id"."$key" = value
        def json = JsonOutput.toJson(data)
        new File(PATH_TO_DATA).write(json)
    }
}