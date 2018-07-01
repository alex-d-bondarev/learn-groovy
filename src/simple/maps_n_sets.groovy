package simple

def map = [a:1, b:2, c:3, 'p':0]
map.put('d', 4)
map['e'] = 5
println map
println map.getClass().name

def list = [1, 2, 3, 4, 5, 1, 1] as LinkedList
println list
println list.class.name

def set = [1, 1, 3, 4, 5, 2, 1] as SortedSet
println set.descendingSet()
println set.class.name

//def strings = "this is a list of strings".split()
List strings = "this is a list of strings".split()
println strings
println strings.class.name

List<Integer> integers = [1, 2, 3, 4, 'abc']
integers << new Date()
println integers
println integers.class.name
