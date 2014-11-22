seq(githubPagesMavenPublishSettings: _*)

sbtPlugin := true

name := "github-maven-publish-plugin"

organization := "com.github.oxlade39"

version := "2.3"

scalaVersion := "2.10.4"

githubPagesCheckoutDir := Path.userHome / "proj" / "oxlade39.github.com" / "maven"

publishMavenStyle := true
