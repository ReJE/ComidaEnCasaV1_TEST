package com.utp.comidaencasav1.view.fragment.categoria

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.utp.comidaencasav1.R

class CategoriaFragment : Fragment() {

    companion object {
        fun newInstance() = CategoriaFragment()
    }

    private lateinit var viewModel: CategoriaViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_categoria, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(CategoriaViewModel::class.java)
        // TODO: Use the ViewModel
    }

}