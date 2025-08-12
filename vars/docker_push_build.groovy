def call(String repoUrl, String branch = 'main', String targetDir = 'checkout') {
   withCredentials([usernamePassword(credentialsId: 'git-credentials', usernameVariable: 'GIT_USERNAME', passwordVariable: 'GIT_PASSWORD')]) {
       sh """
           git clone -b ${branch} ${repoUrl} ${targetDir}
           cd ${targetDir}
           git config user.name "${GIT_USERNAME}"
           git config user.email "${
}


   }