package com.tienda.repository;

import com.tienda.domain.Producto;
import java.math.BigDecimal;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface ProductoRepository extends JpaRepository<Producto, Integer> {

    List<Producto> findByActivoTrue();

    List<Producto> findByCategoriaIdCategoriaAndActivoTrue(Integer idCategoria);

    // Consulta derivada: Spring Data JPA interpreta el nombre del método.
    List<Producto> findByPrecioBetweenOrderByPrecioAsc(BigDecimal precioInf, BigDecimal precioSup);

    // Consulta JPQL: usa la entidad Producto y sus atributos Java.
    @Query("SELECT p FROM Producto p WHERE p.precio BETWEEN :precioInf AND :precioSup ORDER BY p.precio ASC")
    List<Producto> consultaJPQL(@Param("precioInf") BigDecimal precioInf,
                                @Param("precioSup") BigDecimal precioSup);

    // Consulta SQL nativa: usa la tabla producto y columnas de MySQL.
    @Query(value = "SELECT * FROM producto p WHERE p.precio BETWEEN :precioInf AND :precioSup ORDER BY p.precio ASC",
           nativeQuery = true)
    List<Producto> consultaSQL(@Param("precioInf") BigDecimal precioInf,
                               @Param("precioSup") BigDecimal precioSup);

    // Práctica #2: consulta ampliada sobre producto usando relación con categoría.
    // Permite filtrar por categoría, texto en descripción, rango de precio,
    // existencia mínima y estado activo.
    @Query("SELECT p FROM Producto p "
            + "WHERE p.activo = true "
            + "AND (:idCategoria = 0 OR p.categoria.idCategoria = :idCategoria) "
            + "AND LOWER(p.descripcion) LIKE LOWER(CONCAT('%', :texto, '%')) "
            + "AND p.precio BETWEEN :precioInf AND :precioSup "
            + "AND p.existencias >= :existenciaMin "
            + "ORDER BY p.categoria.descripcion ASC, p.precio ASC, p.existencias DESC")
    List<Producto> consultaPractica2(@Param("idCategoria") Integer idCategoria,
                                     @Param("texto") String texto,
                                     @Param("precioInf") BigDecimal precioInf,
                                     @Param("precioSup") BigDecimal precioSup,
                                     @Param("existenciaMin") Integer existenciaMin);
}
