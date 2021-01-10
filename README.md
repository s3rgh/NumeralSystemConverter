#Work on project. Stage 3/6: Convert decimals
##Description

Now let's implement a simple converter. It will convert the given decimal number to the given [radix](https://en.wikipedia.org/wiki/Radix). You should support three radices with prefixes:

- binary (0b);
- octal (0);
- hexadecimal (0x).

To get a string with the answer, use the ```Long.toString(sourceNumber, destinationRadix)``` expression. Note that the expected output is a String, because Java implicitly converts 0/0b/0x concatenated numbers to their decimal representation.

This stage is auto-graded. The grader will input two lines (a number and a radix) and check that your output is the correct number representation in the given radix. Don't forget about the prefix!

**Examples:**

Example 1:

Input:

    8
    16

Output:

    0x8

Example 2:

Input:

    101
    2

Output:

    0b1100101

Example 3:

Input:

    103
    8

Output:

    0147