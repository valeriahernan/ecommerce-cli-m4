ecommerce-cli-m4

Aplicación de consola desarrollada en Java que simula un sistema básico de e-commerce,
Incluye la selección de productos, carrito de compras y confirmación de órdenes
mediante flujo Administrador y Usuario.

--------------------------------------------------
EJECUCIÓN DEL PROYECTO ദ്ദി(˵ •̀ ᴗ - ˵ ) ✧
--------------------------------------------------

1. Compilar

javac src/**/*.java


2. Ejecutar

java Main


--------------------------------------------------
FUNCIONALIDADES ദ്ദി(˵ •̀ ᴗ - ˵ ) ✧
--------------------------------------------------

ADMIN
- Listar productos
- Crear productos
- Editar productos
- Eliminar productos
- Buscar por nombre o categoría

USUARIO
- Listar productos disponibles
- Buscar productos
- Agregar productos al carrito
- Quitar productos del carrito
- Visualizar carrito y subtotales
- Confirmar compra!


--------------------------------------------------
SISTEMA DE DESCUENTOS ദ്ദി(˵ •̀ ᴗ - ˵ ) ✧
--------------------------------------------------

Los descuentos se aplican automáticamente al confirmar la compra:

- Descuento por monto:
  Se aplica cuando el total de compra supera un mínimo definido.

- Descuento por categoría:
  Se aplica si el carrito contiene productos de una categoría específica.

El sistema muestra:
- Total base
- Descuentos aplicados
- Total final


--------------------------------------------------
CÁLCULOS ദ്ദി(˵ •̀ ᴗ - ˵ ) ✧
--------------------------------------------------

subtotal = precio × cantidad
totalBase = suma de subtotales
totalFinal = totalBase − descuentos que se aplican


--------------------------------------------------
VALIDACIONES IMPLEMENTADAS ദ്ദി(˵ •̀ ᴗ - ˵ ) ✧
--------------------------------------------------

- ID de producto existente
- Cantidad mayor a 0
- Precio válido (> 0)
- No permite confirmar compra con carrito vacío :)
- Excepción personalizada:
  CantidadInvalidaException


--------------------------------------------------
PRUEBAS UNITARIAS ദ്ദി(˵ •̀ ᴗ - ˵ ) ✧
--------------------------------------------------

El proyecto incluye pruebas JUnit:

- Cálculo total del carrito
- Validación de cantidad inválida
- Aplicación de descuentos


--------------------------------------------------
ESTRUCTURA DEL PROYECTO ദ്ദി(˵ •̀ ᴗ - ˵ ) ✧
--------------------------------------------------

src/
 |-- model
 |-- service
 |-- descuento
 |-- exception
 |-- ui
 |-- Main.java


--------------------------------------------------
EJEMPLO DE UNA COMPRA ദ്ദി(˵ •̀ ᴗ - ˵ ) ✧
--------------------------------------------------

1. El admin crea productos.
2. El usuario visualiza catálogo.
3. Usuario agrega productos al carrito.
4. Se muestran descuentos activos.
5. Usuario confirma compra.
6. El sistema aplica descuentos automáticamente.
7. Se genera una orden y el carrito se vacía.


--------------------------------------------------
REPOSITORIO GITHUB
--------------------------------------------------

https://github.com/valeriahernan/ecommerce-cli-m4

