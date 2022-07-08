package com.utp.comidaencasav1.helper

import android.os.Bundle
import androidx.core.os.bundleOf
import com.utp.comidaencasav1.model.Plato
import com.utp.comidaencasav1.model.Usuario
import java.io.Serializable

class ArgumentoHelper {
    fun setArgPlato(plato: Plato?): Bundle {
        //Declarar argumento a otro fragment
        return bundleOf("arg_plato" to plato)
    }

    fun getArgPlato(arguments: Bundle?): Serializable? {
        //Recuperar el item
        return if (arguments != null) {
            arguments.getSerializable("arg_plato")
        } else {
            null
        }
    }

    fun setArgUsuario(usuario: Usuario?): Bundle {
        return bundleOf("arg_usuario" to usuario)
    }
}