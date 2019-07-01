# Contributing to project

Welcome to contributing the project! There are a few key ways you can help us improve our projects:

### Submitting Feedback, Requests, and Bugs

Our process for submitting feedback, feature requests, and reporting bugs usually begins by [GitHub issues](https://help.github.com/articles/about-issues/). Each project repository generally maintains its own set of issues:

        https://github.com/cn-guoziyang/<repository-name>/issues

Some projects have additional templates or sets of questions for each issue, which you will be prompted to fill out when creating one.

To know how to label an issue, have a look to https://help.github.com/articles/about-labels/.

### Submitting Code and Documentation Changes

Our process for accepting changes operates by [Pull Request (PR)](https://help.github.com/articles/about-pull-requests/) and has a few steps:

1.  If you haven't submitted anything before, and you aren't (yet!) a member of our organization, **fork and clone** the repo:

        $ git clone git@github.com:<your-username>/<repository-name>.git

    Organization members should clone the upsteam repo, instead of working from a personal fork:

        $ git clone git@github.com:cn-guoziyang/<repository-name>.git

1.  Create a **new branch** for the changes you want to work on. Choose a topic for your branch name that reflects the change:

        $ git checkout -b <branch-name>

1.  **Create or modify the files** with your changes. If you want to show other people work that isn't ready to merge in, commit your changes then create a pull request (PR) with _WIP_ or _Work In Progress_ in the title.

        https://github.com/cn-guoziyang/<repository-name>/pull/new/master

1.  Once your changes are ready for final review, commit your changes then modify or **create your pull request (PR)**, assign as a reviewer or ping (using "`@<username>`") a Lieutenant (someone able to merge in PRs) active on the project (all Lieutenants can be pinged via `@cn-guoziyang/lieutenants`)

1.  Allow others sufficient **time for review and comments** before merging. We make use of GitHub's review feature to comment in-line on PRs when possible. There may be some fixes or adjustments you'll have to make based on feedback.

1.  Once you have integrated comments, or waited for feedback, a Lieutenant should merge your changes in!

_These guidelines are based on [Kiwix](https://github.com/kiwix/overview/blob/master/CONTRIBUTING.md)'s._
