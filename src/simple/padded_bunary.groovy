package simple

(0..15).each {
    println Integer.toBinaryString(it).padLeft(4, '0')
}
