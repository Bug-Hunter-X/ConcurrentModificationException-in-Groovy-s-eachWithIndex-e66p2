```groovy
def myMethod(List<String> list) {
    def iterator = list.iterator()
    while (iterator.hasNext()) {
        def item = iterator.next()
        if (item == null) {
            println "Null item found"
            iterator.remove()
        }
    }
}

myMethod(['a', null, 'b', null, 'c'])
```