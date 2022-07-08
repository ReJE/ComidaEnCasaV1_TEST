package com.utp.comidaencasav1.view.activity

import com.utp.comidaencasav1.model.Cuenta
import io.mockk.every
import io.mockk.mockk
import io.mockk.verify
import org.junit.Assert.assertEquals
import org.junit.Before
import org.junit.Test

class CuentaAddActivityTest {
    private lateinit var cuentaAddActivity: CuentaAddActivity

    @Before
    fun before() {
        cuentaAddActivity = mockk()
    }

    @Test
    fun test_get_componentes_cuenta() {
        // Arrange
        val cuenta = Cuenta(idCuenta = 1,
            idDocumento = "idTest",
            correo = "correo",
            contrasena = "pass",
            familiaNombre = "nombre")
        every { cuentaAddActivity.getComponents() } returns cuenta
        // Act
        val result = cuentaAddActivity.getComponents()
        // Assert
        assertEquals(cuenta, result)
    }

}
