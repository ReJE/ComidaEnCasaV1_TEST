package com.utp.comidaencasav1.view.fragment.platos

import com.utp.comidaencasav1.model.Plato
import io.mockk.every
import io.mockk.mockk
import io.mockk.spyk
import org.junit.Assert.assertEquals
import org.junit.Before
import org.junit.Test

class PlatosAddUpdateFragmentTest {
    private lateinit var platosAddUpdate: PlatosAddUpdateFragment
    @Before
    fun before() {
        platosAddUpdate = mockk(relaxed = true)
    }

    @Test
    fun test_get_component_plato() {
        // Arrange
        val plato = Plato(
            idPlato = 1,
            preparacion = "test",
            nombre = "test",
            idCategoria = 1,
            estadoVisibilidad = true,
            idUsuarioCreador = 1,
            idDocumento = "test",
            estadoCategoriaSemanal = true
        )
        every { platosAddUpdate.getComponents() } returns plato
        // Act
        val result = platosAddUpdate.getComponents()
        // Assert
        assertEquals(plato, result)
    }
}