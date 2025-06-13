
package com.ecommerceSpringBoot.controller;

import com.ecommerceSpringBoot.model.Producto;
import java.util.ArrayList;
import java.util.List;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RequestMapping("/api")
@RestController
@CrossOrigin (origins = "http://127.0.0.1:5500") //url del visual ,del front
public class ProductoController {
    public List <Producto> productos = new ArrayList<>();
    
 
    public ProductoController () {
    productos.add(new Producto(1L,"Mouse Gamer","Mouse con RGB", 10000.00,"assets/mouse.jpg"));
    productos.add(new Producto(2L,"Teclado Mecanico Redragon","Teclado retroiluminado",20000.00,"assets/teclado.jpg"));
    productos.add(new Producto(3L,"Auriculares","Headset con cancelacion de ruido",25000.00,"assets/auris.jpg"));
    productos.add(new Producto(4L,"Camara web Soul","Webcam hd 720p USB ",12000.50,"assets/webcam.jpg"));
    productos.add(new Producto(5L,"Placa de video","RTX 3060 Ventus MSI", 150000.00,"assets/rtx3060.jpg"));
    productos.add(new Producto(6L,"Teclado Mecanico Redragon","Teclado retroiluminado",20000.00,"assets/teclado.jpg"));
    productos.add(new Producto(7L,"Gamepad Logitech","Logitech F710 inalambrico",30000.00,"assets/gplogitech.jpg"));
    productos.add(new Producto(8L,"Audifono inalambrico","Audifonos inalambricos con orejas Led M11 bluetooth 5.2",18000.50,"assets/auriInalambrico.jpg"));
    productos.add(new Producto(9L,"Mouse Gamer","Mouse con RGB", 10.000,"assets/mouse.jpg"));
    productos.add(new Producto(10L,"SSD ","Disco solido Kingston 480gb",60000.00,"assets/ssdkingston.jpg"));
    productos.add(new Producto(11L,"Auriculares","Headset con cancelacion de ruido",25000.00,"assets/auris.jpg"));
    productos.add(new Producto(12L,"Camara web Soul","Webcam hd 720p USB ",12000.50,"assets/webcam.jpg"));
    productos.add(new Producto(13L,"Mouse Gamer","Mouse con RGB", 10.000,"assets/mouse.jpg"));
    productos.add(new Producto(14L,"Teclado Mecanico Redragon","Teclado retroiluminado",20000.00,"assets/teclado.jpg"));
    productos.add(new Producto(15L,"Auriculares","Headset con cancelacion de ruido",25000.00,"assets/auris.jpg"));
    productos.add(new Producto(16L,"Camara web Soul","Webcam hd 720p USB ",12000.50,"assets/webcam.jpg"));
    productos.add(new Producto(17L,"Mouse Gamer","Mouse con RGB", 10.000,"assets/mouse.jpg"));
    productos.add(new Producto(18L,"Teclado Mecanico Redragon","Teclado retroiluminado",20000.00,"assets/teclado.jpg"));
    productos.add(new Producto(19L,"Auriculares","Headset con cancelacion de ruido",25000.00,"assets/auris.jpg"));
    productos.add(new Producto(20L,"Camara web Soul","Webcam hd 720p USB ",12000.50,"assets/webcam.jpg"));
    productos.add(new Producto(21L,"Mouse Gamer","Mouse con RGB", 10000.00,"assets/mouse.jpg"));
    productos.add(new Producto(22L,"Teclado Mecanico Redragon","Teclado retroiluminado",20000.00,"assets/teclado.jpg"));
    productos.add(new Producto(23L,"Auriculares","Headset con cancelacion de ruido",25000.00,"assets/auris.jpg"));
    productos.add(new Producto(24L,"Camara web Soul","Webcam hd 720p USB ",12000.50,"assets/webcam.jpg"));
    productos.add(new Producto(25L,"Mouse Gamer","Mouse con RGB", 10000.00,"assets/mouse.jpg"));
    productos.add(new Producto(26L,"Teclado Mecanico Redragon","Teclado retroiluminado",20000.00,"assets/teclado.jpg"));
    productos.add(new Producto(27L,"Auriculares","Headset con cancelacion de ruido",25000.00,"assets/auris.jpg"));
    productos.add(new Producto(28L,"Camara web Soul","Webcam hd 720p USB ",12000.50,"assets/webcam.jpg"));
    productos.add(new Producto(29L,"Mouse Gamer","Mouse con RGB", 10000.00,"assets/mouse.jpg"));
    productos.add(new Producto(30L,"Teclado Mecanico Redragon","Teclado retroiluminado",20000.00,"assets/teclado.jpg"));
    productos.add(new Producto(31L,"Auriculares","Headset con cancelacion de ruido",25000.00,"assets/auris.jpg"));
    productos.add(new Producto(32L,"Camara web Soul","Webcam hd 720p USB ",12000.50,"assets/webcam.jpg"));
      
}
    
    @GetMapping("/productos") 
    public List<Producto> traerProductos() {
        
        return productos;
    }
    //Mapeo para acceder a detalle.html/js
    
    
    @GetMapping("/productos/{id}")
    public ResponseEntity<Producto> getProductoPorId (@PathVariable Long id) {
        for (Producto produ : productos) {
            if (produ.getId().equals(id)) {
                return ResponseEntity.ok(produ);
            }
        }
        return ResponseEntity.notFound().build();
    }
    
    
    
    

    
    
}
