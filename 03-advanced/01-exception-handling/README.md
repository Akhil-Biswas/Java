# Exception Handling

## Overview

Exception handling is a mechanism to handle runtime errors, maintaining the normal flow of the application. Java provides a robust exception handling mechanism through try-catch blocks.

## Topics

1. **Exception Hierarchy**
   - Throwable class
   - Exception vs Error
   - Checked vs Unchecked exceptions

2. **Try-Catch-Finally**
   - try block
   - catch block
   - finally block
   - Multiple catch blocks
   - Try-with-resources

3. **Throw and Throws**
   - `throw` keyword - throwing exceptions
   - `throws` keyword - declaring exceptions

4. **Custom Exceptions**
   - Creating user-defined exceptions
   - When to create custom exceptions
   - Best practices

5. **Common Exceptions**
   - NullPointerException
   - ArrayIndexOutOfBoundsException
   - NumberFormatException
   - IOException
   - IllegalArgumentException

6. **Best Practices**
   - Catch specific exceptions
   - Don't catch Error
   - Always clean up resources
   - Provide meaningful error messages
   - Log exceptions appropriately

## Example

```java
try {
    // code that may throw exception
} catch (SpecificException e) {
    // handle specific exception
} catch (Exception e) {
    // handle general exception
} finally {
    // cleanup code (always executes)
}
```

## Notes

Add your notes, code examples, and exercises in this directory.
