```groovy
def myMethod(List<String> list) {
    list.eachWithIndex { item, index ->
        if (item == null) {
            println "Null item found at index: $index"
            //This will throw an exception if you try to access the list
            // after removing an element.
            list.remove(index)
        }
    }
}

myMethod(['a', null, 'b', null, 'c']) 
```