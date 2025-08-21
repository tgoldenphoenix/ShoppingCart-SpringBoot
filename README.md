# E-Commerce API Spring Boot MySQL

## ERD

![ERD Diagram](/screenshots/shopping-cart-erd.drawio.png "ERD Diagram")

## Technologies

mySQL, Spring Boot, Spring data JPA

Constructor injection of service classes via their Interface

DTO classes, custom request/response classes

normalize api response with a custom class `ApiResponse`

Try `ModelMapper` instead of `MapStruct`

## Product

One product can have many images. Store image as `blob`. Have urls to download images.

API to search product from DB based on different queries:

- Get product by id using `@PathVariable`
- Get products by category, by brand using `@RequestParam`
- Get products by category AND brand, 

Add product: If category not yet exist, create new category then add product to that category

Return product dto with image dto including image link and name

Create `AddProductRequest` & `ProductUpdateRequest` objects

## Product Image

- save & update image
- delete image
- get all image of a product

image is saved inside MySQL using `blob` data type

## Category

Basic crud apis

## Cart

One cart has multiple `CartItem`. Each `CartItem` is a `Product`

## Notes

- `@RequestParam` là `?brand=apple`; case in-sensitive, `Apple` hay `apple` both ok;
- `@PathVariable` là `product/{productId}`
- `RequestBody` là raw json inside body

## References

[video instruction](https://www.youtube.com/watch?v=oGhc5Z-WJSw)
