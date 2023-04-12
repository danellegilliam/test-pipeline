package me.danellegilliam

class Git {
    def httpCheckout(Map gitParams) {
        checkout scmGit(
            branches: [[name: "${gitParams.branch}"]],
            userRemoteConfigs: [[credentialsId: "${gitParams.credential}",
            url: "https://github.com/${gitParams.repo}"]])              
    }
}