package simple

List strings = "this is a list of strings".split()
println strings

// Gava natural sort
Collections.sort(strings)
println strings

// Java 7 sort by length
Collections.sort(strings, new Comparator<String>() {
    int compare(String s1, String s2){
        s1.size() <=> s2.size()
    }
})
println strings
assert strings*.size() == [1, 2, 2, 4, 4, 7]

// Groovy natural sort
println strings.sort(false) // false => return instead of void

// Groovy length sort with Comparator
println strings.sort(false, new Comparator<String>() {
    int compare(String s1, String s2){
        s1.size() <=> s2.size()
    }
})

// Groovy reverse length sort with a 2-param closure
println strings.sort(false) {s1, s2 ->
    s2.size() <=> s1.size()
}

// Groovy reverse length sort with a 1-param closure
println strings.sort(false) { it.size() }

// Groovy sort by length and then reverse alphabetically
println strings.sort(false) { String s1, String s2 ->
    s1.size() <=> s2.size() ?: s2 <=> s1
}

