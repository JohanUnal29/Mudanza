//clase
class ProductManager {
  
    constructor() {
      this.products = [];
    }
    //Metódo
    getProducts = () => {
      return this.products;
    };

  
    //Metódo
    addProduct = (title, description, price, thumbnail , code, stock) => {
      if(!title || !description || !price || !thumbnail || !code || !stock){
        console.error("Error: Todos los campos son obligatorios");
      }else{  
      const product = this.products.find((product) => product.code === code);
      if (product) {
        console.log("Product already exists");
        return;
      }else{
  
      const newProduct = {
        id: this.products.length + 1,
        title: title,
        description: description,
        price: price,
        thumbnail: thumbnail,
        code: code,
        stock: stock,
      };
  
      this.products.push(newProduct);
      return;
      }
        }
    };

    getProductById = (id)=>{
        const product = this.products.find((product) => product.id === id);
        if(product){
            
            return console.log("Product found: ",product);
        }else{
            console.log("Product not found");
            return null;
        }

    }
  
    
  }
  
  const productManager = new ProductManager();
  
  
  productManager.addProduct("Tensor", "Tensor shimano m2000", 220000, "jssksksdjskds" , 2500, 1);

  productManager.addProduct("Suspensión", "Suspensión Fox", 2000000, "jssksksdjskds" , 2502, 2);
  
  console.log(productManager.getProducts());

  productManager.getProductById(2);