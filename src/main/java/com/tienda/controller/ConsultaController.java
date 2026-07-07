package com.tienda.controller;

import com.tienda.service.CategoriaService;
import com.tienda.service.ProductoService;
import java.math.BigDecimal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/consultas")
public class ConsultaController {

    private final ProductoService productoService;
    private final CategoriaService categoriaService;

    public ConsultaController(ProductoService productoService,
                              CategoriaService categoriaService) {
        this.productoService = productoService;
        this.categoriaService = categoriaService;
    }

    @GetMapping("/listado")
    public String listado(Model model) {
        model.addAttribute("productos", productoService.getProductos(false));
        agregarCategorias(model);
        return "consultas/listado";
    }

    @PostMapping("/consultaDerivada")
    public String consultaDerivada(@RequestParam BigDecimal precioInf,
                                   @RequestParam BigDecimal precioSup,
                                   Model model) {
        model.addAttribute("productos", productoService.consultaDerivada(precioInf, precioSup));
        model.addAttribute("precioInf", precioInf);
        model.addAttribute("precioSup", precioSup);
        model.addAttribute("tipoConsulta", "Consulta derivada");
        agregarCategorias(model);
        return "consultas/listado";
    }

    @PostMapping("/consultaJPQL")
    public String consultaJPQL(@RequestParam BigDecimal precioInf,
                               @RequestParam BigDecimal precioSup,
                               Model model) {
        model.addAttribute("productos", productoService.consultaJPQL(precioInf, precioSup));
        model.addAttribute("precioInf", precioInf);
        model.addAttribute("precioSup", precioSup);
        model.addAttribute("tipoConsulta", "Consulta JPQL");
        agregarCategorias(model);
        return "consultas/listado";
    }

    @PostMapping("/consultaSQL")
    public String consultaSQL(@RequestParam BigDecimal precioInf,
                              @RequestParam BigDecimal precioSup,
                              Model model) {
        model.addAttribute("productos", productoService.consultaSQL(precioInf, precioSup));
        model.addAttribute("precioInf", precioInf);
        model.addAttribute("precioSup", precioSup);
        model.addAttribute("tipoConsulta", "Consulta SQL nativa");
        agregarCategorias(model);
        return "consultas/listado";
    }

    @PostMapping("/practica2")
    public String practica2(@RequestParam(defaultValue = "0") Integer idCategoria,
                            @RequestParam(defaultValue = "") String texto,
                            @RequestParam BigDecimal precioInf,
                            @RequestParam BigDecimal precioSup,
                            @RequestParam Integer existenciaMin,
                            Model model) {

        model.addAttribute("productos", productoService.consultaPractica2(
                idCategoria,
                texto,
                precioInf,
                precioSup,
                existenciaMin));

        model.addAttribute("idCategoria", idCategoria);
        model.addAttribute("texto", texto);
        model.addAttribute("precioInf", precioInf);
        model.addAttribute("precioSup", precioSup);
        model.addAttribute("existenciaMin", existenciaMin);
        model.addAttribute("tipoConsulta", "Práctica #2: productos por categoría, descripción, precio y existencia");
        agregarCategorias(model);

        return "consultas/listado";
    }

    private void agregarCategorias(Model model) {
        model.addAttribute("categorias", categoriaService.getCategorias(true));
    }
}
