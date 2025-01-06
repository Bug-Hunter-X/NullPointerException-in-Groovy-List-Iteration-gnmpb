```groovy
def myMethod(List<Integer> numbers) {
    (numbers ?: []).each { number ->
        if (number % 2 == 0) {
            println "Even: $number"
        } else {
            println "Odd: $number"
        }
    }
}

myMethod(null)
myMethod([1,2,3,4,5])
```