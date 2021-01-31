package com.dima
HashSet set = [1, 2, 3] as HashSet

println set
println set.class
println()

TreeMap map = [name:"Dima", salary:100000]

println map
println map.getClass()
map.each {k,v ->
    print k + " - " + v
    println()
}

println()
println map.name;
println map['salary']
println map.get('name')

map.name = 'Sergey'
map['salary'] = 50000
println map

map.put("surname", "Ivanov");
println map
