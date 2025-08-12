def call(String projectName, String imgTag, String dockerHubUser){
    sh "docker build -t ${dockerHubUser}/${projectName}:${imgTag} ."
}