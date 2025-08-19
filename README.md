# Shopping Cart API

## ERD

![ERD Diagram](/screenshots/shopping-cart-erd.drawio.png "ERD Diagram")

## Technologies

mySQL, Spring Boot, Spring data JPA

Constructor injection of service classes via their Interface

DTO classes, custom request/response classes

normalize api response with a custom class `ApiResponse`

## Product

One product can have many images. Store image as `blob`. Have urls to download images.

API to search product from DB based on different queries:

- Get products by category, by brand
- Get products by category AND brand, 

Add product: If category not exist, create new category then add product to that category

Create `AddProductRequest` & `ProductUpdateRequest` objects

## Product Image

- save & update image
- delete image
- get all image of a product

## Category

i

## References

[video instruction](https://www.youtube.com/watch?v=oGhc5Z-WJSw)
