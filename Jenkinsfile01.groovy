properties([pipelineTriggers([pollSCM('* * * * *')])])
node("edi"){
    stage("clone"){
        git branch: 'develop', url: 'https://github.com/EduardUsatchev/class_7-new.git'

    }
    stage("execute"){
        sh "ls -l"
        sh "/Users/e0u00jg/anaconda3/bin/python3 disk_resizer.py"
    }
}