package atm

import groovy.json.JsonSlurper
import groovy.json.JsonOutput

class BankData {
    def jsonSlurper = new JsonSlurper()
    def PATH_TO_DATA = "src/main/groovy/atm/data/bank-clientele-data.json"
    def data = jsonSlurper.parse(new File(PATH_TO_DATA))

    Map getData(String id) {
        data."$id"
    }

    String getParam(String id, String key) {
        data."$id"."$key"
    }

    void setData(String id, String key, String value) {
        data."$id"."$key" = value
        def json = JsonOutput.toJson(data)
        new File(PATH_TO_DATA).write(json)
    }
}