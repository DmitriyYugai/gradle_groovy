package com.dima

int product(int x = 2, int y = 5) {
    return x * y;
}

rsl = product 2,3
println rsl
println product()

void display(Map map) {
    println map.name
    println map.surname
}

display ([name:"Dmitry", surname:"Yugay"])
display name:"Sergey", surname:"Ivanov"