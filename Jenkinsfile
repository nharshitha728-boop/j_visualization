pipeline {
    agent any
    
    stages {
        stage('Checkout') {
            steps {
                // This is more reliable than the 'git' command
                checkout scm
            }
        }
        
        stage('Build') {
            steps {
                echo 'Building the application...'
                // Changed 'sh' to 'bat' for Windows
                bat 'mvn clean package'
            }
        }
        
        stage('Test') {
            steps {
                echo 'Running Unit Tests...'
                // Changed 'sh' to 'bat' for Windows
                bat 'mvn test'
            }
            post {
                always {
                    // This works fine on Windows
                    junit '**/target/surefire-reports/*.xml'
                }
            }
        }
        
        stage('Deploy') {
            steps {
                echo 'Deploying artifact...'
            }
        }
    }
}
