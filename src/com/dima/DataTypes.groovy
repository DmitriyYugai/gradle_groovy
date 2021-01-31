package com.dima

float a = 10;

println a
println a.class
println a.getClass()

s = 'Hello'
println s

name = "Dmitry"
s = "Hello ${name}"
println s

s = '''
Dmitry
Yugay
Valerevich
'''
println s

emailPattern = /[a-zA-Z0-9_.+-]+@[a-zA-Z0-9-]+\.[a-zA-Z0-9-.]+/
println emailPattern.class
println "dmitry_yugay@mail.ru" ==~ emailPattern