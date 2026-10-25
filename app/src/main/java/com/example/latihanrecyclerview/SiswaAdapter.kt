
package com.example.latihanrecyclerview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView

class SiswaAdapter(
    private val daftarSiswa: List<Siswa>
) : RecyclerView.Adapter<SiswaAdapter.SiswaViewHolder>() {

    class SiswaViewHolder(itemView: View) :
        RecyclerView.ViewHolder(itemView) {

        val tvNama: TextView =
            itemView.findViewById(R.id.tvNama)

        val tvKelas: TextView =
            itemView.findViewById(R.id.tvKelas)

        val tvHobi: TextView =
            itemView.findViewById(R.id.tvHobi)
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): SiswaViewHolder {

        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_siswa, parent, false)

        return SiswaViewHolder(view)
    }

    override fun onBindViewHolder(
        holder: SiswaViewHolder,
        position: Int
    ) {

        val siswa = daftarSiswa[position]

        holder.tvNama.text = siswa.nama
        holder.tvKelas.text = siswa.kelas
        holder.tvHobi.text = "Hobi: ${siswa.hobi}"

        holder.itemView.setOnClickListener {
            Toast.makeText(
                holder.itemView.context,
                "${siswa.nama} - ${siswa.kelas}",
                Toast.LENGTH_SHORT
            ).show()
        }
    }

    override fun getItemCount(): Int {
        return daftarSiswa.size
    }
}
