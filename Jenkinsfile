/* Requires the Docker Pipeline plugin */
pipeline {
    agent any
    tools {
        maven "maven"
    }
    stages {
        stage('build') {
            steps {
                sh 'mvn clean package'
            }
        }
    }
}
