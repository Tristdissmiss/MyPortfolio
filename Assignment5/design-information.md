Class Descriptions
User
Role: Represents a general system user.
Functions:
search(productName: string): Product[] - Searches for products based on a specified name.
Employee
Inherits from: User
Role: A user with permissions to manage products.
Functions:
addProduct(product: Product): void - Adds new products to the system.
removeProduct(productId: int): void - Deletes a specified product from the system.
editProduct(productId: int, updatedProduct: Product): void - Modifies details of a given product.
Database
Role: Manages inventory, including adding, editing, and removing products.
Functions:
add(product: Product): void - Inserts a new product into the database.
remove(productId: int): void - Deletes a product from the database using its ID.
edit(productId: int, updatedProduct: Product): void - Updates product details.
getProducts(): Product[] - Fetches the list of all products.
Product (Abstract Base Class)
Role: Acts as a generic model for products.
Attributes:
name: string - The product’s name.
color: string - Product color.
size: string - Product size.
brand: string - Brand name.
price: float - Product price.
Specific Product Classes
Tile

Attributes:
material: string - Material type (e.g., porcelain, ceramic, resin).
Stone

Attributes:
material: string - Material type (e.g., marble, pebble, slate).
Wood

Attributes:
type: string - Type (e.g., solid, engineered, bamboo).
species: string - Species (e.g., oak, hickory, maple).
Laminate

Attributes:
type: string - Type (e.g., regular, water-resistant).
Vinyl

Attributes:
type: string - Type (e.g., water-resistant, waterproof).
Category
Role: Provides a filtering structure for the products.
Functions:
filter(products: Product[]): Product[] - Returns products filtered by category criteria.
Search
Role: Allows users to locate products within the system.
Functions:
search(productName: string): Product[] - Finds products by name.
UI
Role: Represents the system's user interface, giving users and employees access to search and inventory functions.
Functions:
accessSearch(search: Search): void - Enables product search functionality for users.
accessInventory(employee: Employee): void - Grants employees access to inventory management.
