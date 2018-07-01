//List nums = [1, 2, 3, 4, 5, 6]
//List results = []
//nums.each{
//    results << it * 2
//}
//List results = nums.collect { it * 2 }
//                    .findAll {it % 4 == 0}
//println results

//List strings = "this is a list of strings".split()
////strings.collect { it[0] }
//assert strings.collect { it.size() } == strings*.size()

def map = [a:1, b:2, c:3, 'p':0]
map.collect { k, v -> "$k-$v"}.join(' & ')
