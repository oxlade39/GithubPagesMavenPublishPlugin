seq(githubPagesMavenPublishSettings: _*)

sbtPlugin := true

name := "github-maven-publish-plugin"

organization := "com.github.oxlade39"

version := "1.0"

githubPagesCheckoutDir := Path.userHome / "proj" / "oxlade39.github.com" / "_site" / "maven"

publishMavenStyle := true