pipeline {
    agent any
    tools {
        jdk 'JDK17'
        maven 'Maven3'
    }
    stages {
        stage('Checkout') {
            steps {
                checkout scm
            }
        }
        stage('Build & Test with Coverage') {
            steps {
                // For Windows Jenkins agents, use 'bat' instead of 'sh'
                bat 'mvn clean test'
            }
        }
    }
    post {
        always {
            // Records JUnit test results
            junit '**/target/surefire-reports/*.xml'
            // Archives the JaCoCo HTML files for viewing
            archiveArtifacts artifacts: 'target/site/jacoco/**', fingerprint: true
        }
    }
}