# name-normalizer

TDD Paint-by-Numbers exercise: Name Normalizer

The "paint-by-numbers" means you get to color in-between lines already drawn for you. In the case of TDD, that means the tests. **These are intended to be first TDD exercises.**

This is a great introductory way to learn about the incremental growth aspect of TDD (which isn't all that TDD is) by working through a family-friendly sequence of tests already specified for you. Thanks to James Grenning for the technique!

The primary things to focus on:

- Write no more code than needed to pass a test.
- If the test passes immediately, it's likely you wrote too much code in a prior step. (Or maybe you just forgot something silly, such as not compiling things.) If so, go back to the _beginning of the prior step._ Discard that effort, and think hard about a smaller implementation that would meet only the needs of the current set of tests.
- Refactor, refactor, refactor. With each passing test, ensure that you clean the code up and make it as readable as possible. If all your code ends up in the normalize method, chances are you can improve on it significantly. If you feel you need comments to explain the logic bits, chances are even better that you have code-focused opportunities for improvement.

Here is the complete set of instructions:

1. Ensure that the topmost test is enabled (i.e. ensure that it is not commented out, disabled, or otherwise marked as ignored).
1. Run your unit testing tool (e.g. JUnit, NUnit, xUnit.NET, CppUTest) against _all_ tests in the project.
1. Did the test you just enabled fail? If not: You built too much code in a prior step. Undo work for prior tests and try again.
1. Make sure you are clear on why the test failed.
1. Write only enough code to make that failing test pass (and not break any other tests).
   Did you write too much? Is there a simpler way to get that test to pass???
1. Clean up whatever messes you made. Refactor. Ensure tests still pass.
1. If there is a second commented-out assertion in any test (rare!), uncomment it. It should fail. If not, return to step 5.
1. Repeat prior steps until no more test methods exist.

Currently this repo contains implementations in the following languages (contributor in parentheses):

- [C#](https://github.com/jlangr/name-normalizer/tree/all-solutions/csharp) (Jeff Langr)
- [C++ (gcc)](https://github.com/jlangr/name-normalizer/tree/all-solutions/cpp-gcc) (Jeff Langr)
- [Clojure](https://github.com/jlangr/name-normalizer/tree/all-solutions/clojure) (Jeff Langr)
- [Elixir](https://github.com/jlangr/name-normalizer/tree/all-solutions/elixir) (Kerry Buckley)
- [Go](https://github.com/jlangr/name-normalizer/tree/all-solutions/golang) (Akeshihiro)
- [Java](https://github.com/jlangr/name-normalizer/tree/all-solutions/java) (Jeff Langr)
- [JavaScript](https://github.com/jlangr/name-normalizer/tree/all-solutions/js) (Jeff Langr)
- [Kotlin](https://github.com/jlangr/name-normalizer/tree/all-solutions/kotlin) (Jon Reid)
- [Kotlin/JUnit5](https://github.com/jlangr/name-normalizer/tree/all-solutions/kotlin-junit5) (Junilu Lacar)
- [Objective-C](https://github.com/jlangr/name-normalizer/tree/all-solutions/objc) (Jon Reid)
- [Python](https://github.com/jlangr/name-normalizer/tree/all-solutions/python) (Chad Gorshing)
- [Ruby](https://github.com/jlangr/name-normalizer/tree/all-solutions/ruby) (Jeff Langr)
- [Rust](https://github.com/jlangr/name-normalizer/tree/all-solutions/rust) (Akeshihiro)
- [Swift](https://github.com/jlangr/name-normalizer/tree/all-solutions/swift) (Jon Reid)
- [TypeScript](https://github.com/jlangr/name-normalizer/tree/all-solutions/typescript) (Cameron Presley)

You can watch me derive a solution for the Java project at https://www.youtube.com/watch?v=OECwGP-bOwU.

You can find solutions for most of these in the `all-solutions` branch.

Missing your favorite language? Please submit a pull request minimally containing the starter code. Code a solution in the `all-solutions` branch if you can. Conspicuously missing: Python. (Let me know if you would like to pair on a solution for Python or Scala; I could use a pair.)

Think you have a better solution for a language? I'm happy to see alternate approaches. If you have an incremental improvement, submit a PR.
