# spring-jersey-postgresql-basic-auth

This project provides support for using Spring Security with Basic Auth in a Spring boot Jersey application using PostgreSQL database. 

# Getting Started
<a href="https://github.com/sreenudooosari/spring-jersey-postgresql-basic-auth/archive/master.zip">Download</a> or clone from GIT and then use Maven (3.*) and Java (1.7 or better).

# Basic Auth.
  The basic access authentication is a method designed to allow a web browser, or other client program, to provide credentials in the form   of a user name and password  when making a request. <br><br> Before transmission, the user name is appended with a colon and concatenated with the password. The resulting string is encoded with the Base64 algorithm. <br> <br>
 One thing I would like to mention regarding Basic Auth is :
 <i><strong> Security is not the intent of the encoding step in Basic Auth. Rather, the intent of the encoding is to encode non-HTTP-compatible characters that   may be in the user name or password into those that are HTTP-compatible.</strong></i>
 
# How Secure is a Basic Auth ?

The Basic Auth mechanism provides no confidentiality protection for the transmitted credentials. They are merely encoded with Base64 in transit, but not encrypted or hashed in any way. <strong> HTTPS </strong> is, therefore, typically preferred to use in conjunction with Basic Authentication.

# Tech Stack
 <strong>SpringBoot </strong>, makes it easy to create stand-alone, production-grade Spring based Applications.<br>
 <strong>Jersey</strong>, one of the leading frameworks to develop RESTful Web services.<br>
 <strong>PostgreSQL</strong>, popular opensource DB.
 
 # Test
The DB Script is provided in the resources package.<br>
Secured URI :  http://localhost:8080/products/secure <br>
Open/Public URI : http://localhost:8080/products <br>
