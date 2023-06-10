const express = require("express");
const app = express();
const port = 8080;

app.get("/", (req, res) => {
  res.send("Hello World!");
});

app.get("/boca", (req, res) => {
  res.send("el mejor cuadro del mundo");
});

app.get("*", (req, res) => {
  res.send("error esa ruta no existe");
});

app.listen(port, () => {
  console.log(`Example app listening on port ${port}`);
});