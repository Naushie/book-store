**Architecture**

Layered Architecture was used.

Database used is MySql

Database changes are managed by Liquibase.

**Terraform and AWS** 

Files can be found at src\main\resources\terraform
Had to create an inbound rule to add ssh as well as open port 8080, Terraform does not allow it by default.
Had to supply a key pair as well so that I could ssh easily.

**github Worflow**

A github runner, is installed on the server to simplify deployment.

File can be found at: .github\workflows\maven.yml

set up to deploy on push to **main** branch, there is also a manual trigger.

**Assumptions:**

To keep it simple and concentrate on new technologies the following assumptions were made:
One title per order. 
Unlimited books, So no BookEntity


**API's**

Two API's were added, one secured and one not.

**Secured:**

Test API
http://ec2-13-244-243-186.af-south-1.compute.amazonaws.com:8080/secured/book-order/test

Book Order List (GET)
http://ec2-13-244-243-186.af-south-1.compute.amazonaws.com:8080/secured/book-order

Order Book (POST)
http://ec2-13-244-243-186.af-south-1.compute.amazonaws.com:8080/secured/book-order
Expects objects below:

new object
`{
    "isbn": "",
    "quantity": 0
}`
update existing
`{
    "id": "",
    "version": "",
    "isbn": "",
    "quantity": 0
}`

**Unsecured:**

Test API
http://ec2-13-244-243-186.af-south-1.compute.amazonaws.com:8080/unsecured/book-order/test

Book Order List (GET)
http://ec2-13-244-243-186.af-south-1.compute.amazonaws.com:8080/unsecured/book-order

Order Book (POST)
http://ec2-13-244-243-186.af-south-1.compute.amazonaws.com:8080/unsecured/book-order
Expects objects below:

new object
`{
    "isbn": "",
    "quantity": 0
}`

update existing
`{
    "id": "",
    "version": "",
    "isbn": "",
    "quantity": 0
}`