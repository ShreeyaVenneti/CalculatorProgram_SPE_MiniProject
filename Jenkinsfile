pipeline
{
    environment
    {
        DOCKERHUB_CREDENTIALS = credentials("docker_hub_id")
    }
    
    agent any
    stages
    {
        stage("Stage 1: Git Clone")
        {
            steps
            {
                git branch: 'master',
                url: 'https://github.com/ShreeyaVenneti/CalculatorProgram_SPE_MiniProject.git'
            }
        }
        
        stage("Stage 2: Maven Build")
        {
            steps
            {
                sh 'mvn clean install'
            }
        }
        
        stage("Stage 3: Build docker image")
        {
            steps
            {
                sh "docker build -t shreeyav/calculator:latest ."
            }
        }
        
        stage("Stage 4: Push docker image to DockerHub")
        {
            steps
            {
                sh 'echo $DOCKERHUB_CREDENTIALS_PSW | docker login -u $DOCKERHUB_CREDENTIALS_USR --password-stdin'
                sh "docker push shreeyav/calculator:latest"
            }
        }
        
        stage("Stage 5: Clean docker images")
        {
            steps
            {
                sh "docker container prune -f"
                sh "docker image prune -f"
            }
        }
        
        stage('Stage 6 : Pulling Image Using Ansible') 
        {
            steps 
            {
                ansiblePlaybook colorized: true,
                credentialsId: 'localhost',
                installation: 'Ansible',
                inventory: 'inventory',
                playbook: 'calculator.yml'
            }
        }
    }
}