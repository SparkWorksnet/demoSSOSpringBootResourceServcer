# demoSSOSpringBootResourceServcer
Spring Boot Demo Application for Accessing SparkWorks SSO

[![Build Status](https://travis-ci.org/SparkWorksnet/demoSSOSpringBootResourceServcer.svg?branch=master)](https://travis-ci.org/SparkWorksnet/demoSSOSpringBootResourceServcer)

### Requirements

+ Java 1.8+
+ Maven 3+
+ Sparks [Account](https://sso.sparkworks.net/aa/registration) with Developer access
+ Sparks Client from [Sparks Accounts](https://accounts.sparkworks.net/dev/client/create)

### Steps

+ Clone code from Github
+ Update application.yml by adding your ClientId (`security.oauth2.client.clientId`) and ClientSecret (`security.oauth2.client.clientSecret`)
+ Run the example using `mvn clean spring-boot:run`