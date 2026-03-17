pipeline {

    agent any

    stages {

        stage('Checkout') {
            steps {
                git 'https://github.com/ntdidcam-del/atm-simulator.git'
            }
        }

        stage('Build') {
            steps {
                sh 'mvn clean compile'
            }
        }

        stage('Test') {
            steps {
                sh 'mvn test'
            }
        }

        stage('Package') {
            steps {
                sh 'mvn package'
            }
        }
    }
}
