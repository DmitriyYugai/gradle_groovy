package com.dima
c = { n = 1 ->
    println n + 10
}

c.call(10)
c.call()

6.times {n -> print n}
println()
5.times {print it}