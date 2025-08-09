# Shopping Cart API

[video instruction](https://www.youtube.com/watch?v=oGhc5Z-WJSw)

## Technologies

mySQL, Spring Boot, Spring data JPA

## Product

One product can have many images. Store image as `blob`. Have urls to download images.

API to search product from DB based on different queries:

- Get products by category, by brand
- Get products by category AND brand, 

Add product: If category not exist, create new category then add product to that category

Create `AddProductRequest` & `ProductUpdateRequest` objects