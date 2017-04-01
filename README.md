
# CodeU Coding Sample

This project allows students to express their coding skills before entering
CodeU. Students will complete this JSON-lite object and JSON-lite parser.

## DISCLAIMER

CODEU is a program created by Google to develop the skills of future software
engineers. This project is not an offical Google Product. This project allows
students to express their coding skills before entering CodeU.

## What is JSON-lite?

Well it doesn't really exists. For the purpose of this question we are defining
JSON-lite to be a stripped down version of JSON. In JSON-lite there are only
two variable types: STRINGS and OBJECTS.

A STRING is a series of characters starting with a " and ending with a ".
Inside of a string quotes (") and backslashes (\) must be escaped with a
back-slash (\). Some characters can be escaped to give them special meaning.
They are 't' and 'b'. If you are familiar with programming, you may know that
there are other escapable characters, but in JSON-lite they are not supported.

The following are all valid strings:
~~~~
 ""
 "abc"
 "\"a\tb\nc\""
~~~~

The following are all invalid strings:
~~~~
 """
 "\g"
~~~~

An OBJECT is a series of KEY-VALUE pairs starting with a { and ending with a }
and separated by commas. KEY-VALUE pairs are expressed as a KEY:VALUE where
the key must be a STRING and the value can be an OBJECT or STRING.

The following is a valid key-value pair:
~~~~
  "name":"sam doe"
~~~~

The following is invalid key-value pair:
~~~~
  name:"sam doe"
~~~~

The following are a valid objects:
~~~~
  {
    "first":"sam",
    "last":"doe"
  }

  { "first" : "sam", "last":"doe" }
~~~~

The following is an invalid object:
~~~~
  {
    "first":"sam"
    "last":"doe"
  }
~~~~

The following is a key-value pair where the value is an object:
~~~~
  "name": { "first":"sam", "last":"doe" }
~~~~

It should be noted that between the brances, commas, or colons can be any
number of whitespace characters.

## What do I need to do?

We want you to write a parser that can parse JSON-lite syntax and represent the
value in memory. What structures you use to hold the parsed data is up to you.
How you parsed the data is up to you. What is not up to you is the data that we
will test it with. To help you out we have supplied some samples of valid
JSON-lite objects:
~~~
  { }
  { "name": "sam doe" }
  { "name": { "first": "sam", "last": "doe" } }
~~~~

## What should my code look like?

We have provided the interfaces for you to implement. To make it even easier we
have created the skeleton code for you. You just need to fill in the methods in
MyJSON and MyJSONParser that have "TODO" written in them.

To make sure you are on the right track we have implemented a few tests you can
use to test your understanding. Keep in mind that the tests are just to help you
get started; they are not exhuastive. To make sure you code is correct, we
suggest you add some more tests.
