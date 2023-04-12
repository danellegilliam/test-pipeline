package me.danellegilliam

class Git {

    def httpCheckout(String branch = "main", String credential, String repo) {
        checkout scmGit(
            branches: [[name: "${branch}"]],
            userRemoteConfigs: [[credentialsId: "${credential}",
            url: "https://github.com/${repo}"]])              
    }
}