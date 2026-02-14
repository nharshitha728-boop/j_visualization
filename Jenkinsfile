pipeline {
    agent any
    
    stages {
        stage('Checkout') {
            steps {
                git 'https://github.com/nharshitha728-boop/j_visualization.git'
            }
        }
        
        stage('Build') {
            steps {
                echo 'Building the application...'
                sh 'mvn clean package'
            }
        }
        
        stage('Test') {
            steps {
                echo 'Running Unit Tests...'
                sh 'mvn test'
            }
            post {
                always {
                    junit '**/target/surefire-reports/*.xml'
                }
            }
        }
        
        stage('Deploy') {
            steps {
                echo 'Deploying artifact...'
                // Add deployment scripts here
            }
        }
    }
}
