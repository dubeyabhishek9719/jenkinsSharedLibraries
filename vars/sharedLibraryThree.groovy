def call(String imageName)
{
                 echo "Build section started"
                 sh "docker build -t ${imageName} ."
                 echo "Build section ended"
}
