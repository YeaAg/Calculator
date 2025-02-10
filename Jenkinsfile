pipeline {
    agent any

    stages {
        stage("GIT Clone") {
            steps{
                git url: "https://github.com/YeaAg/Calculator.git", branch: 'main'
            }
        }
        stage("Package") {
            steps {
                steps "chmod 777 mvnw"
                sh "./mvnw package"
            }
        }
    }
}
