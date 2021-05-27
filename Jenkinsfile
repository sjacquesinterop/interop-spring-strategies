def deploymentPath = "src-infra/sample-strategies-spring-boot.yaml"

pipeline {
	agent any
	stages {
		stage('preamble') {
			steps{
				script {
                			openshift.withCluster() {
                    			openshift.withProject("${params.project_name}") {
                        		echo "Using project: ${openshift.project()}"
                    	        }
                            }
                }
			}
		}
		stage('deploy') {
        			steps{
        				script {
                        			openshift.withCluster() {
                            			openshift.withProject("${params.project_name}") {
											def data = readFile(file: deploymentPath).replaceAll("branch_name", "${params.branch_name}")
                                		    echo "Creating artifacts"
                                		    openshift.apply(data);
                            	        }
                                    }
                        }
        			}
        		}
	}
 }