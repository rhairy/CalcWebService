FROM tomcat:7
ADD target/CalcWebService.war /usr/local/tomcat/webapps
EXPOSE 8080
