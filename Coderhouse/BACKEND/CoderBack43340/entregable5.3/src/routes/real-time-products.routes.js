import { Router } from "express";
import ProductManager from "../manager/productManager.js";

// Manager y router
const productManager = new ProductManager();
export const routerViewProductsSocket = Router();

// Definir la función realTimeProducts
export const realTimeProducts = async (req, res) => {
  try {
    const allProducts = await productManager.getProducts(); 

    return res.render("realTimeProducts", {allProducts});
  } catch (error) {
    console.error(`Error al obtener los productos: ${error}`);
    return res.status(500).json({ error: "Error al obtener los productos" });
  }
};

// Exportar otras cosas si es necesario
