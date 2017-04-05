
# CodeU Coding Sample

This project allows students to demonstrate their coding skills before entering
CodeU. Students will complete this JSON-lite object and JSON-lite parser.

## DISCLAIMER

CODEU is an invitation-only program created by Google to develop the skills of
aspiring technologists. This project is not an offical Google Product. This
project allows students who have been invited to CodeU to demonstrate their
coding skills before entering the program.

## What is JSON-lite?

Well it doesn't really exists. For the purpose of this question we are defining
JSON-lite to be a stripped down version of JSON. In JSON-lite there are only
two variable types: STRINGS and OBJECTS.

A STRING is a series of characters starting with a `"` and ending with a `"`.
Inside of a string quotes (`"`) and backslashes (`\`) must be escaped with a
back-slash (`\`). Some characters can be escaped to give them special meaning.
They are `t` and `n`. If you are familiar with programming, you may know that
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

An OBJECT is a series of KEY-VALUE pairs starting with a `{` and ending with a
`}` and separated by commas. KEY-VALUE pairs are expressed as a KEY:VALUE where
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
`MyJSON` and `MyJSONParser` that have "TODO" written in them.

To make sure you are on the right track we have implemented a few tests you can
use to test your understanding. Keep in mind that the tests are just to help you
get started; they are not exhaustive. To make sure you code is correct, we
suggest you add some more tests.

## How do I submit my code?

You will be forking our repository, making a copy of your own, on which you will
then upload your solution.
Please follow carefully these steps, since we will not accept solutions
submitted in any other way. These instructions assume a basic familiarity with
the GitHub workflow. If you are new to GitHub, you can familiarize youself with
the interface and the workflow using one of the many tutorials available online.

 1. Click on the "Fork" button that you should see on the top right corner of
    the GitHub page for this repository (the page you are currently viewing).
 1. Follow the on screen instructions to fork this repository to your personal
    GitHub account.
 1. **Only now** clone the repository to your computer (if you use the
    command-line tool, use `git clone <repository URL>`, if you use another Git
    GUI follow the specific instructions for that client.
    + If you need the repository URL, you will find it by clicking on the green
      button that says "Clone or Download".
    + Please make sure that you are cloning your personal repository (the one
      you forked to), and not the original one we shared with you. You can
      easily confirm that by veryfing that in the address bar it says:
      ~~~
      <your_username>/<repository_name>
      ~~~
      and not:
      ~~~
      google/<repository_name>
      ~~~
 1. Working on the copy of your repository that you just cloned, Write and test
    your solution, you can use `git commit` to save your changes locally as many
    times as you want. When you are comfortable with your solution, go ahead and
    push it to the main repository:
    ~~~
    git push origin master
    ~~~
    + You can push as many intermediate solutions as you wish, we will only read
      your latest submission.
 1. Once you have pushed your solution, Copy and paste the link to your
    repository on your application form and proceed with the submission.

Please follow these steps precisely, and verify that your code is uploaded
correctly by checking it on the GitHub web interface before submitting.
**We cannot accept any other form of submission.**
