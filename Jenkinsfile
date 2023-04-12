@Library('shared_library') _
import me.danellegilliam.*

pipeline {
    agent any
    stages {
        stage("Init") {
            steps {
                script {
                    def git = new Git("main", "github", "danellegilliam/test-pipeline.git")
                }
            }
        }
    }
}
