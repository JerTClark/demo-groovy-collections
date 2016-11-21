package collections

list = [4,3,1,2,4,1,8,9,2,6]
println "${list.find { it == (10 - 2 + 1) }}"

fours = list.findAll({it == 4})
println "$fours"

println "${list.findIndexOf {it == 2}}"

println "${list.findAll{it==2}.sum()}"

println "${list.sum()}"
println "${list.inject(100) {carryOver, element -> element += carryOver}}"