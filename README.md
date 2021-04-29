# accessing-mongo-data-rest

# Add people data in mongoDB
curl -i -X POST -H "Content-Type:application/json" -d "{  \"firstName\" : \"Micky\",  \"lastName\" : \"Mouse\" }" http://localhost:8080/people

curl -i -X POST -H "Content-Type:application/json" -d "{  \"firstName\" : \"Foo\",  \"lastName\" : \"Bags\" }" http://localhost:8080/people  
