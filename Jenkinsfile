#!/usr/bin/env groovy
//^ enable syntax highlighting in many editors
import hudson.EnvVars

def shellOutput( cmd ) {
  return sh(returnStdout: true, script: cmd).trim()
}

stage('Init'){
  node {
    def branch = env.JOB_NAME.replaceFirst('.+/', '')

    try {
      def jenkins_container_id = sh(returnStdout: true, script: "cat /proc/self/cgroup | grep -o  -e 'docker.*' | head -n 1 | sed 's#docker/\\(.*\\)#\\1#'").trim()

      stage 'Checkout'

      // get our code from the repository
      checkout scm
    } catch (err) {
      currentBuild.result = "FAILURE"

      throw err
    }
  }
}


stage('Domain') {
  node {
    stage 'Clean'
    sh "mvn -f domain/pom.xml clean"
    
    stage 'Build'

    sh "mvn -f domain/pom.xml package"
  }
}

stage('api'){
  node{
    stage 'Clean'
    sh "mvn -f api/pom.xml clean"
    
    stage 'Build'

    sh "mvn -f api/pom.xml package"
  }
}