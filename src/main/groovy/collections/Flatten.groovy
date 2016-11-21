package collections

list = ["Groovy", "Java", "JavaScript"]
list[0] = ["Spring", "JSP", "Angular"]

println list.flatten().size()
println list.flatten()*.size()

println "$list"
println "${list.flatten()}"
println "${list.flatten() - ["Angular", "JavaScript"]}"