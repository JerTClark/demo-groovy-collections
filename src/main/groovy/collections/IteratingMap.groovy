package collections

map = [Bob:"Minecraft", Joy:"Monster4x4", Jill:"Barleys (Barbies)"]

map.each {entry -> println "$entry.key loves playing $entry.value"}

map.each {key, value -> println "$key loves playing $value"}

println map.collect {key, value -> value.replaceAll("r", "RRR")}

println map.any {entry -> entry.key =~ "[aJ]"}

map = [Bob:"Minecraft", Joy:"Monster4x4", Jill:"Barleys (Barbies)",
    Daddy:"Learning", Mommy:"Being awesome"]

groupedByName = map.groupBy {it.key[0]}

groupedByName.each {println "$it"}
println groupedByName