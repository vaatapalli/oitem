# Order-item


Technology Stack :
-----------------

* Java 8
* Apache Tomcat/9.0.37
* H2 db (H2 console available at '/h2-console'. Database available at 'jdbc:h2:mem:order_item')
    * user name : sa
    * password : ""
* Spring Boot 2.3.3.RELEASE

* @GetItems (each item assosiated with customer )
   http://localhost:8090/items

* @GetSelectedItems with respect to custermerName
   http://localhost:8090/items/{customerName}
   
* @GetAllItems irrespective of customerName
   http://localhost:8090/itemList

* @PostItem with customerName
   http://localhost:8090/items

Sample Request :
-------------
{
        "customerName": "customer",
              "items": [
							{
								"product_code": 550,
								"product_name": "product 1",
								"quantity": 1
							},
							{
								"product_code": 100,
								"product_name": "product 2",
								"quantity": 1
							}
						]
		
	
}
