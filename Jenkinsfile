pipeline {

    agent any

    stages {
        stage('clone') {
            steps {
                git 'https://github.com/notnaveedkhan/demo.git'
            }
        }
        stage('clean') {
            steps {
                sh 'mvn clean'
            }
        }
        stage('test') {
            steps {
                sh 'mvn test'
            }
        }
        stage('build') {
            steps {
                sh 'mvn package -DskipTests'
            }
        }
        stage('deploy') {
            steps {
                deploy adapters: [tomcat8(credentialsId: 'tomcat-creds', path: '', url: 'http://127.0.0.1/manager/text')], contextPath: '/', war: 'target/*.war'
            }
        }
    }
}
