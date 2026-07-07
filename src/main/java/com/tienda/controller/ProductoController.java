package com.tienda.controller;

import com.tienda.domain.Categoria;
import com.tienda.domain.Producto;
import com.tienda.service.CategoriaService;
import com.tienda.service.ProductoService;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/producto")
public class ProductoController {

    private final ProductoService productoService;
    private final CategoriaService categoriaService;

    public ProductoController(ProductoService productoService, CategoriaService categoriaService) {
        this.productoService = productoService;
        this.categoriaService = categoriaService;
    }

    @GetMapping("/listado")
    public String listado(Model model) {
        model.addAttribute("productos", productoService.getProductos(false));
        Producto producto = new Producto();
        producto.setCategoria(new Categoria());
        model.addAttribute("producto", producto);
        model.addAttribute("categorias", categoriaService.getCategorias(true));
        return "producto/listado";
    }

    @PostMapping("/guardar")
    public String guardar(@Valid Producto producto, BindingResult errores, Model model) {
        if (errores.hasErrors()) {
            model.addAttribute("productos", productoService.getProductos(false));
            model.addAttribute("categorias", categoriaService.getCategorias(true));
            return "producto/listado";
        }
        productoService.save(producto);
        return "redirect:/producto/listado";
    }

    @GetMapping("/modificar/{idProducto}")
    public String modificar(@PathVariable Integer idProducto, Model model) {
        var producto = productoService.getProducto(idProducto).orElse(new Producto());
        if (producto.getCategoria() == null) {
            producto.setCategoria(new Categoria());
        }
        model.addAttribute("producto", producto);
        model.addAttribute("productos", productoService.getProductos(false));
        model.addAttribute("categorias", categoriaService.getCategorias(true));
        return "producto/listado";
    }

    @GetMapping("/eliminar/{idProducto}")
    public String eliminar(@PathVariable Integer idProducto) {
        productoService.delete(idProducto);
        return "redirect:/producto/listado";
    }
}
