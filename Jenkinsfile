@Library('shared_library') _
import me.danellegilliam.*

pipeline {
    agent any
    stages {
        stage("Init") {
            steps {
                script {
                    def git = new Git(credential = "github", repo = "danellegilliam/test-pipeline.git")
                }
            }
        }
    }
}
