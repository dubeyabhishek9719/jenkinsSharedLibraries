def call()
{
                 echo "Deploy section started"
                 sh "docker compose up -d"
                 echo "Deploy section ended"
}
