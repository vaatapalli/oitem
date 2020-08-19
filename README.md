# Order-item


Technology Stack :

Java 8

Apache Tomcat/9.0.37

H2 db (H2 console available at '/h2-console'. Database available at 'jdbc:h2:mem:order_item')

user name : sa

password : ""

Spring Boot 2.3.3.RELEASE

GetOrder
http://localhost:8090/get

@GetSelectedOrder
http://localhost:8090/get/{product_code}

@PostOrder 
http://localhost:8090/createitem

Sample body :
-------------

{
    "product_code": 51,
    "product_name": "nameee",
    "quantity": 5
}
