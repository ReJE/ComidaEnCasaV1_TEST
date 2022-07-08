package com.utp.comidaencasav1.helper

import android.os.Bundle
import androidx.fragment.app.FragmentActivity
import io.mockk.every
import io.mockk.mockk
import io.mockk.verify
import org.junit.Assert.assertEquals
import org.junit.Before
import org.junit.Test

class OperacionHelperTest {
    private lateinit var operacionHelper: OperacionHelper

    @Before
    fun before() {
        operacionHelper = mockk()
    }

    @Test
    fun test_operacion_helper() {
        val fragmentActivity: FragmentActivity = mockk()
        val bundle: Bundle = mockk()
        every { operacionHelper.getBundle(any()) } returns bundle

        val respuesta = operacionHelper.getBundle(fragmentActivity)

        verify(exactly = 1) { operacionHelper.getBundle(fragmentActivity) }
        assertEquals(bundle, respuesta)
    }

}