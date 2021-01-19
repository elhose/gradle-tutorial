package com.js.groovy

int product(int x=3, int y) {
    return x * y
}

println(product( 5))

//The same as above, but fully using groovy syntax
def productGroovy(x, y) {
    x*y //last expression is returned
}
result = productGroovy 10,5
println result

void display(Map product){
    product.each {k,v ->
        println("${k}: ${v}")
    }
}

display([name:'Urban Bike', color:"white"])