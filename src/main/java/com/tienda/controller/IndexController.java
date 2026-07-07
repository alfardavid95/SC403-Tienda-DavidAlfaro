package com.tienda.controller;

import com.tienda.service.CategoriaService;
import com.tienda.service.ProductoService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class IndexController {

    private final ProductoService productoService;
    private final CategoriaService categoriaService;

    public IndexController(ProductoService productoService, CategoriaService categoriaService) {
        this.productoService = productoService;
        this.categoriaService = categoriaService;
    }

    @GetMapping("/")
    public String cargarPaginaInicio(Model model) {
        model.addAttribute("productos", productoService.getProductos(true));
        model.addAttribute("categorias", categoriaService.getCategorias(true));
        model.addAttribute("idCategoriaActual", 0);
        return "index";
    }

    @GetMapping("/consultas/{idCategoria}")
    public String productosPorCategoria(@PathVariable("idCategoria") Integer idCategoria, Model model) {
        model.addAttribute("productos", productoService.getProductosPorCategoria(idCategoria));
        model.addAttribute("categorias", categoriaService.getCategorias(true));
        model.addAttribute("idCategoriaActual", idCategoria);
        return "index";
    }
}
