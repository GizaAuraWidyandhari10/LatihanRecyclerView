package com.example.latihanrecyclerview

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class DaftarSiswaFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return inflater.inflate(
            R.layout.fragment_daftar_siswa,
            container,
            false
        )
    }

    override fun onViewCreated(
        view: View,
        savedInstanceState: Bundle?
    ) {
        super.onViewCreated(view, savedInstanceState)

        val rvSiswa = view.findViewById<RecyclerView>(R.id.rvSiswa)

        rvSiswa.layoutManager = LinearLayoutManager(requireContext())
        rvSiswa.adapter = SiswaAdapter(getDataSiswa())
    }

    private fun getDataSiswa(): List<Siswa> {
        return listOf(
            Siswa("Akmal Ashfihany Muzaki", "XI PPLG 5", "Membaca"),
            Siswa("Akmal Rizki Priya Aji", "XI PPLG 5", "Bermain game"),
            Siswa("Al Viyasatya Yusuf Javaz", "XI PPLG 5", "Olahraga"),
            Siswa("Arnity Nella Syafiani", "XI PPLG 5", "Memasak"),
            Siswa("Ashvi Raffi Arbany", "XI PPLG 5", "Bermain musik"),
            Siswa("Ataya Fathan Permana", "XI PPLG 5", "Sepak bola"),
            Siswa("Avicenna Embun Salsa Bila", "XI PPLG 5", "Menggambar"),
            Siswa("Bima Arya Dilaga", "XI PPLG 5", "Membaca"),
            Siswa("Calvin Juni Prianton", "XI PPLG 5", "Bermain game"),
            Siswa("Giza Aura Widyandhari", "XI PPLG 5", "Desain")
        )
    }
}