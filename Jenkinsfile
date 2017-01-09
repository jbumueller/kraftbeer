#!/usr/bin/env groovy
//^ enable syntax highlighting in many editors
import hudson.EnvVars

def shellOutput( cmd ) {
  return sh(returnStdout: true, script: cmd).trim()
}

node {

  def branch = env.JOB_NAME.replaceFirst('.+/', '')

  try {
    def jenkins_container_id = sh(returnStdout: true, script: "cat /proc/self/cgroup | grep -o  -e 'docker.*' | head -n 1 | sed 's#docker/\\(.*\\)#\\1#'").trim()

    stage 'Checkout'

    // get our code from the repository
    checkout scm

    stage 'Clean'
    sh "cd api/"
    sh "mvn clean"
    sh "cd .."
    
    stage 'Build'

    sh "cd api/"
    sh "mvn package"
    sh "cd .."
  } catch (err) {
    currentBuild.result = "FAILURE"

    throw err
  }
}

