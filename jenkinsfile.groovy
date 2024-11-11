pipeline {
    agent any

    environment {
        DOCKER_HUB_REPO = 'kesharmutale/ise3'  // Your Docker Hub repository
        DOCKER_HUB_CREDENTIALS_ID = 'docker'   // Jenkins credentials ID for Docker Hub
    }

    stages {
        stage('Clone Repository') {
            steps {
                // Clone the repository
                git branch: 'main', url: 'https://github.com/MK090311/ise3'
            }
        }

        stage('Build Docker Image') {
            steps {
                script {
                    // Build the Docker image using the Dockerfile in the repo
                }
            }
        }
    }
}
