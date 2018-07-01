package simple

import groovy.transform.*

//@ToString(includeNames = true) @EqualsAndHashCode
//@TupleConstructor
@Canonical
class Person {
    String first
    String last

//    void setLast(String last){
//        println("inside setLast()")
//        this.last = last
//    }

//    String toString() { "$first $last" }
}

Person p1 = new Person(first: 'Hanley', last: 'Ramirez')
//p.setFirst("Peter")
p1.last = "Ortiz"
println("${p1.getFirst()} ${p1.last}")
println p1.toString()
Person p2 = new Person(first: 'Hanley', last: 'Ortiz')
Person p3 = new Person(first: 'David', last: 'Ortiz')
Person p4 = new Person('David', 'Ortiz')

println p1 == p2
println p1 != p3

Set people = [p1, p2, p3, p4]
