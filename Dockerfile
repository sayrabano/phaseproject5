From openjdk:8
Expose 8095
Add target/admin_login_form-0.0.1-SNAPSHOT.war admin_login_form-0.0.1-SNAPSHOT.war
ENTRYPOINT ["java","-jar","/admin_login_form-0.0.1-SNAPSHOT.war"]