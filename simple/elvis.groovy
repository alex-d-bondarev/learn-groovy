
String name
//String n = ( name!= null && name.size() > 0 ? name : "World")
//n = name ? name : 'World'
n = name ?: 'World'

println "Hello, $n!"
