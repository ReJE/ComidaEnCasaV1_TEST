package com.utp.comidaencasav1.repository.implement

import com.google.common.collect.Maps
import com.utp.comidaencasav1.model.Plato
import com.utp.comidaencasav1.presenter.interfaces.PlatoPresenter
import io.mockk.*
import org.junit.Assert.*
import org.junit.Before
import org.junit.Test

class PlatoRepositoryImplTest{

    private lateinit var platoRepository: PlatoRepositoryImpl

    @Before
    fun before(){
       platoRepository = mockk()
    }

    @Test
    fun test_get_count_platos() {
        //Arrange
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
        val platos:ArrayList<Plato> = arrayListOf(plato)
        every {platoRepository.getCountIdPlatos(any()) } returns 2
        //Act
        val result = platoRepository.getCountIdPlatos(platos)
        //Assert
        assertEquals( 2,  result)
    }
}