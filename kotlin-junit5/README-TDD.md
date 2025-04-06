# Detailed notes for Example Solution

I'm documenting how I stepped through this example solution here to give you a better understand 
of my thought process when I'm doing TDD. This is more or less the same through process I use in
both solo TDD and pair/ensemble/mob TDD situations, although obviously, the conversation is much
richer in the latter settings.

Note that I will be using Arlo Belshee's Commit Message Notation, which you can find at
https://github.com/RefactoringCombos/ArlosCommitNotation

I'm working on a Macbook Pro, using IntelliJ IDEA, so all the keyboard shortcuts I mention here
will using key names like CMD, Option, CTRL.

## Step 1 - Enable first test and see it fail

This is fairly straightforward: I go to the test file and delete the @Disabled annotation on the first test. 

IDEA has a feature that reruns tests automatically. This is a great convenience, especially if you're doing TDD. Eliminating a manual step in my development process, even if it's one as trivial as pressing CTRL+Shift+R to run all tests, helps reduce toil and improves my TDD workflow. 

I go to the Run dialog (CMD-4) and hit the "Rerun Automatically" button in the dialog menu.

I see the test fails. 

Success! 

Now to commit my change. As noted previously, I'm using Arlo Belshee's commit message annotation so I prefix the commit comment with ". t" to signify that I modified a test. 

Notes about each step I make during this exercise will be added and committed along with the relevant code change. I won't be making separate documentation-only commits with the ". d" prefix if this is the only documentation that changes.

## Step 2 - Make the test pass

The test that fails covers the case where the input to the `nomalize` method is an empty string. The expected result is also an empty string.

What's the simplest thing that could possibly work? Well, if we return the same string, that would work, and it's pretty simple.

So, I make the function return the same value that was passed in. Now the test passes. Great. We're green now. Let's commit the change, using a ". F" prefix since I have only changed one behavior and it was an intended change that was covered by a test.