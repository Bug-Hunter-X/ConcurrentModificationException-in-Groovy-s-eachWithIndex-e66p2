# ConcurrentModificationException in Groovy's eachWithIndex

This example demonstrates a common error when using Groovy's `eachWithIndex` method to iterate and modify a list simultaneously.  Removing elements from a list while iterating using `eachWithIndex` results in a `ConcurrentModificationException` because the index becomes invalid after the removal. 

The `bug.groovy` file contains the code that reproduces the error. The `bugSolution.groovy` file provides a corrected version.

## How to reproduce

1. Save the code in `bug.groovy`.
2. Run the script using Groovy.
3. Observe the `ConcurrentModificationException`.

## Solution

The solution uses an iterator to safely remove elements from the list while iterating. This avoids the `ConcurrentModificationException`.