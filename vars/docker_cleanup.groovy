def call(String project, String imgTag, String dockerHubUser){
   sh "docker rmi ${dockerHubUser}/${project}:${imgTag} || true"
}