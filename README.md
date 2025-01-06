# Groovy NullPointerException in List Iteration

This repository demonstrates a common NullPointerException in Groovy when attempting to iterate over a list that might be null.  The `myMethod` function iterates over a list of integers, printing whether each number is even or odd. However, if a null list is passed, a `NullPointerException` occurs.

The solution showcases safe null handling using the Groovy safe navigation operator (`?.`) and the elvis operator (`?:`)

## How to Reproduce

1. Clone this repository.
2. Run `bug.groovy`. You will observe a `NullPointerException`.
3. Run `bugSolution.groovy` to see the corrected code.