package collections

list = [1,3,4,1,8,9,2,6]

//list.each {println "$it"}

//list.eachWithIndex { int entry, int i -> println "found $entry at index $i" }

//Trying to double each item in the list
doubled = []
list.each {item ->
    doubled << (item *= 2)
}
println "list = $list"
println "doubled = $doubled"

trippled = list.collect {
    it *= 3
}
println "trippled = $trippled"