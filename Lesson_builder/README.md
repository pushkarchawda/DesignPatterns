This is the solution of the tasked taken from below URL and mentioned below

// https://www.jobreadyprogrammer.com/blog/5893/oop-api-assignment


This assignment is going to be a challenging one and will really test & train your Object Orientation skills. I'd say work on this for 2 - 3 weeks. If you're having trouble don't quit keep working at it. Remember it doesn't matter if you get this right or wrong. The whole point is for you to get practice solving practical assignments and improve your PRACTICAL coding skills. Think of this as a real world project in which you have been hired to write some software and you have 1 month to complete this. Plenty of time! So take your time and workout the best solution you possibly can.

To be able to solve this assignment, I expect you to already have completed my "Master Object Oriented Design in Java" course available on Udemy as well as my site: http://www.jobreadyprogrammer.com

Review the lecture on the builder pattern as well as the lecture where we go over a pom.xml file since you'll need to import a java library from the internet called Jackson.

------------------------------- ASSIGNMENT ----------------------------------

Your task is to use the builder design pattern for creating a Java API (Application Programming Interface) that clients can use to create a particular kind of JSON structure. 

You do need to understand JSON Syntax. Its not hard to learn. This is an example json structure:

{
"name" : { "first" : "Imtiaz", "last" : "Ahmad" },
"gender" : "MALE",
"verified" : true,
"age" : 36,
"owns" : ["tv", "computer", "house" "sixpack", "car", "skates", "snowboard"]
}

Plugin the above json into this handy online json editor to understand the structure: http://www.jsoneditoronline.org
Play around with the structure and create your own until you understand how the syntax works. 
Then proceed with the assignment.

Business Requirement:

You have been hired as a consultant to complete a 1 month project. Developers in our company need a handy java API they can use to interact with a searchengine. You'll need to use the builder pattern to create the below JSON structure. This json structure is actually a query that can be submitted to a searchengine called elasticsearch. 
Elasticsearch is an opensource tool one can download and use but that's not important. 
All your work will be in Java. Developers in our company using your builder API should be able to create json requests like this.


{
"query": { 
"bool": { 

"must": [
{ "match": { "item": "Milk" }}, 
{ "match": { "item_type": "Dairy" }} 
],

"should": [
{ "match": { "product_location": "New Mexico" }}, 
{ "match": { "warehouse_number": 37 }} 
]
}
}
}

Here are the rules for the JSON structure. You can have a single must or should section inside a bool section as shown. But keep in mind that inside of each one of these musts or shoulds, you can have nested bool sections. The match section is simple, you can have any attribute name and it's value. For example, the above json query is filtering for ONLY those items that are "Milk". 
And the "item_type" attribute has the value "Dairy". The product_location should be "New Mexico" with warehouse_number: 37. 


You'll need to create a few java classes that will represent this JSON structure when they are converted to a JSON format.
Create the classes called Query, Bool, Must, Match and Test. You may also need a class called QueryBuilder, or whatever you want to name it. The Test class will contain the main method in which you will invoke the builder methods to create the instances of the Musts, Shoulds etc. and print out the composed objects json format to prove that the API works as expected. Here is an example of how a developer expects to use the API:

QueryBuilder builder = new QueryBuilder();
builder.bool().mustMatch("item", "Milk").mustMatch("item_type", "Dairy");
builder.bool().shouldMatch("product_location", "New Mexico").shouldMatch("warehouse_number", 37);

Remember the developers need to be able to nest bools inside of musts or shoulds if needed. So here's the case for a nested bool containing a must inside of an existing should section. The developers expect to use the api like this:

builder.bool().shouldMatch("lot_number", 307).bool().mustMatch("expiry_date", "Jan 2020");


To convert your classes into json you'll have to use an external java library called Jackson. You can learn more about it here: http://www.mkyong.com/java/how-to-convert-java-obj...

Best of luck on this project. I know you can do it. Never underestimate yourself! You got this! :)
