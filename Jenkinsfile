@Library('shared_library')_

pipeline {
    agent any
    dev git = new Git(credential = "github", repo = "danellegilliam/test-pipeline.git")
    stages {
        stage("Init") {
            steps {
                sh "ls -ltr"
            }
        }
    }
}
