

# Content negotiation:

## From client side by adding below property in request header to accept xml kind data

        Accept = application/xml
        Accept = application/json

![Image](https://github.com/user-attachments/assets/c4cce5cb-93ee-43dd-8b7f-6ffc73d47ee0)

## From server side by using consumes and produces keyword

![Image](https://github.com/user-attachments/assets/801ad9f2-0bc6-4952-88b4-9469cb145983)

# Path variable 
Path variable is used to pass data from url to controller method. and usually used with get request method

![Image](https://github.com/user-attachments/assets/d0168a1d-2239-4524-b010-c6345a4dd71c)

# Annotations:

1. @controller : to declare a class as a controller
2. @ResponseBody : to delcare that particular controller method should respond in JSON format
    ![Image](https://github.com/user-attachments/assets/72aed19f-5407-4867-b6a7-56a4ac9b5ace)
3. @RestController : to declare a class as a controller which contaions methods which returns JSON representation or other types but not views

    ![Image](https://github.com/user-attachments/assets/32d0fc5a-5134-4114-8617-08a4c2246f82)
4. @PathVariable : to pass data from url to controller method
    ![Image](https://github.com/user-attachments/assets/156f71e0-4c35-401f-a7c8-3f4e9a80b846) 
5. @RequestBody: When client do post request and sends a data in JSON or XML format not in form_data format at that time to map body content to controller methods we need to use this annotation
    ![Image](https://github.com/user-attachments/assets/e609b1be-2a86-43b5-8951-d6b9f16de3e7)
