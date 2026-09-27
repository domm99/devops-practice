plugins {
    id("org.danilopianini.gradle-pre-commit-git-hooks") version "2.1.25"
}

rootProject.name = "devops-practice"


gitHooks {
    commitMsg {
        conventionalCommits()
    }
    createHooks(true)
}