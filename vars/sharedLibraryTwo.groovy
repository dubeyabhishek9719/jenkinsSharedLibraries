def call(String url,String branchName){
        echo "Code section started"
        git branch: "${branchName}", url: "${url}"
        echo "Code section ended"
}
