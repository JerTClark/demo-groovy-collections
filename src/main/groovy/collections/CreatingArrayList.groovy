package collections

list = [1,3,4,1,8,9,2,6]

println "$list"
println "${list.getClass().name}"

println "${list[0]}"
println "${list[list.size() - 1]}"

println "${list[-1]}"
println "${list[-2]}"

println "${list[2..5]}"

println list[-6..-3]