package com.dima
LinkedList l = ['first', 'second', "third"]
println l
println l.getClass()

l << 'fourth'
println l

println l + ['fifth']
println l - ['first']

l.each {println it}
println()
l.reverseEach {println it}