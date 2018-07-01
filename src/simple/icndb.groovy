package simple

import groovy.json.*

String baseURL = "http://api.icndb.com/jokes/random?"
def queryString = [limitTo:'[nerdy]', firstName:'Guillaume', lastName:'Laforge']
        .collect { k, v -> "$k=$v" }
        .join('&')

String jsonText = "$baseURL$queryString".toURL().text
def json = new JsonSlurper().parseText(jsonText)
println json.value.joke
