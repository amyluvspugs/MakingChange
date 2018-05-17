# Notes For AmyLuvsPugs

IMPORTANT: The most important thing about your code is that it
*works*. Everything else after that is... well, it's not trivial. And there's a
lot of it. But *none* of it matters if you can't write code that works. And
you've nailed that. That's key. WELL DONE!

That said, let's talk about "all the other stuff" that's out there. You need
exactly NONE of this stuff to launch your career. In ten years, you'll proabbly
be a master of ALL of these things. PLEASE don't feel overwhelmed or criticized!
Consider this all feedback you can use to make your code better, but NONE of it
is critique that your code is not good enough!

## Some High-Level Tips To Start

First and most important, we are NOT going to dive into better algorithms to
solve this problem. They exist and some of them are fun and some of them are
hard and all of them are interesting, but none of them is as important as the
second-most important thing in programming:

Every part of writing software is about communicating with people, not
computers. The *compiler* will do that part for you. Martin Fowler famously
said, "Any idiot can write code a computer can understand. Good programmers
write code that other people can understand."

So we'll talk about readability and style in your code a bit. But it goes way
beyond just code style. Let's take a few minutes and talk about:

* Coding style
  * Braces and whitespace: Learn to work in and read K&R Style and Allman style
    code. They comprise 99% of the code you'll see out there.
  * Get in the habit of writing out variable and method names. A moment's extra
    typing will save you so much grief when you have to maintain the code later.
  * That said, Java in particular is prone to long names already and that cause
    a problem where you end up with insanely long lines of code. That's bad,
    too. But try to avoid this by redesigning your code rather than encrypting
    your variable and method names.
* Github Style
  * Project names, descriptions, and README's are the first introduction a new
    coder will have to your project. The money problem didn't need any of those
    trappings, but I find myself writing short blurbs even on throwaway
    projects.
  * Commit messages. Ohhhhh, the rules for commit messages!
    * Should complete the sentence, "If I merge this commit into my project, it
      will {commit message}". For example, "Fix broken test" and "Add support
      for foreign currencies".
    * Use present verb tense. Your commit message tells the reader what your
      commit will do for them, not what you did IN the commit. The difference is
      subtle but important: remember you are talking TO another human, not about
      yourself. E.g. "fixed broken test" is not great; "fix broken test" is
      better.
    * First line summarizes what you did in 50 characters or fewer, starts with
      a capital (this is debatable, many programmers use all lowercase), uses
      lowercase everywhere else, and does not end in punctuation. "Replace loop
      with recursion" is more effective communication. "fix tests." is less
      effective.
    * Try to keep your individual commits very small, and make many of
      them. That way you don't need more details. If you DO need more details,
      there is a format for that, too:
      * Double-space between the summary line and the details.
      * Each detail begins with a bullet point (asterisk) and is a single
        sentence describing one detail of what was done in the commit
      * Detail bullets wrap at 70 columns
      * Wrapped lines are indented 2 spaces so the bullets stand out
      * Double-space between bullet points
      * Bullet points do not end in punctuation. (Details with more than one
        statement in them should have valid punctuation inside the bullet. It
        looks weird at first but you get used to it.)
      * Use bullet points to explain your commit, specifically things that you
        can't get from reading the summary line or the code.

## Example Good Commit Message

```
Rename Zip class to ZipCode

* PHP already has a Zip class; it performs zip *compression* rather than
  handling postal codes

* All current users of the Address class are updated to pass zipCode instead of
  zip. Future maintainers will have to be aware of this going forward

* John proposed we just delete the zip libraries from all of our production
  servers instead, but we took his keyboard away ;-)
```

This is actually a bit wordier than I would normally be, but the point is that
here you can see the double spacing, the short summary line, the indented text
in the first two bullets, and you can note that the summary says what my commit
will do for you if you merge my PR into your codebase. The bullet points all
call out subtle details that you wouldn't know from reading the code: the
existence of a different class with the same name, a warning to future
maintainers about the variable change (though I would probably omit this from a
real commit since future maintainers will get an immediate syntax error if they
type address.zip, and after a quick look at the Address class they'll instantly
know what changed.) The first two bullets demonstrate joining phrases with
semicolons and periods, note that the overall message still ends without
punctuation. The last bullet point is to make it clear that you can be
professional and still have fun.

And yes, this is a real-world example. There really was a John and this really
was his suggestion.

## Unit Testing!

Or, "can I just run a thing and prove that all your code works and doesn't break
any of my stuff?" Yes! YES YOU CAN.

## Notes to self:
- Can I break Amy's code with, e.g. 52 cents? (Two quarters, but then SKIP dimes
  and nickels?)
