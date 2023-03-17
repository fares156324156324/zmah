pipeline {
    agent any
     tools { 
        maven 'maven-3.6.3'
    } 

    stages {
    stage('Build') {
      steps {
        sh 'mvn clean package -DskipTests=true'
        archiveArtifacts artifacts: 'SpringbBoot_Jenkins_test/target.jar', fingerprint: true
      }
    }
    
    stage('Dockerize') {
      steps {
        sh 'docker build -t fares123456/springbootapp:${BUILD_NUMBER} .'
        sh 'docker push fares123456/springbootapp:${BUILD_NUMBER}'
      }
    }
    
    stage('Deploy') {
      steps {
        sh 'docker-compose -f docker-compose.yml up -d'
      }
    }
  }
  
  post {
    always {
      cleanWs()
    }
  }
}
