package com.utp.comidaencasav1.helper

import androidx.fragment.app.FragmentActivity
import com.utp.comidaencasav1.model.Usuario
import io.mockk.every
import io.mockk.mockk
import io.mockk.mockkClass
import io.mockk.spyk
import org.junit.Assert.assertEquals
import org.junit.Before
import org.junit.Test

class ExtraHelperTest {
    private lateinit var helper: ExtraHelper
    private lateinit var fragmentActivity: FragmentActivity
    @Before
    fun before() {
        helper = mockk(relaxed = true)
        fragmentActivity = spyk(mockkClass(FragmentActivity::class))
    }

    @Test
    fun test_get_ext_usuario() {
        //arrange
        val usuario =
            Usuario(idUsuario = 1, nombre = "Test", idRol = 1, idCuenta = 1, idDocumento = "01")
        every { helper.getExtUsuario(any()) } returns usuario
        //act
        val result = helper.getExtUsuario(fragmentActivity)
        //assert
        assertEquals(usuario, result)
    }
}