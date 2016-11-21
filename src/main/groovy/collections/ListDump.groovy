package collections

list = [1,3,4,1,8,9,2,6]

sublist = list[2..5]
println sublist.dump()
sublist[0] = 55
println "After sublist[0] = 55, list = $list"