package com.example.provaac1

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.core.view.isInvisible
import androidx.core.view.isVisible
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun ValidarDesempenho(view: View) {
        val nomeTexto = Inserir_Nome.text
        val metaCorrida = valor_meta.text.toString().toInt()
        val correu= valor_km.text.toString().toInt()
        val meta= metaCorrida.toString()


        if (nomeTexto.length == 0){
            texto_respsota.text="Digite Seu Nome!"
            texto_respsota.setTextColor(Color.parseColor("#ff0d00"))
            texto_respsota.visibility=view.visibility
        }

        else  if (metaCorrida <=0 || correu <=0){
            Toast.makeText(this,"Sua Meta e Km Percorridos tem que ser maior que 0",Toast.LENGTH_SHORT).show()

        }

       else if (metaCorrida == correu){
            texto_respsota.text="${nomeTexto}, Você chegou ao seu objetivo!"
            texto_respsota.setTextColor(Color.parseColor("#b8860b"))
            texto_respsota.visibility=view.visibility
        }
        else if (correu > metaCorrida){
            texto_respsota.text="Parabéns ${nomeTexto}, você Ultrapassou sua meta..Continue assim!"
            texto_respsota.setTextColor(Color.parseColor("#0000ff"))
            texto_respsota.visibility=view.visibility

        }
        else if (correu<metaCorrida){
            texto_respsota.text="Vish ${nomeTexto}, Ainda Falta ${metaCorrida - correu}Km para chegar ao seu objetivo.."
            texto_respsota.setTextColor(Color.parseColor("#8a2be2"))
            texto_respsota.visibility=view.visibility

        }
        else if (correu == 0){
            texto_respsota.text=" Você precisa correr!! #sedentarismo"
            texto_respsota.setTextColor(Color.parseColor("#8a2be2"))
            texto_respsota.visibility=view.visibility

        }
        else if (meta == null){
            Toast.makeText(this,"Informe sua meta!!",Toast.LENGTH_SHORT).show()

        }

        else{
            Toast.makeText(this,"Você Não Inseriu Nenhum Valor!!",Toast.LENGTH_SHORT).show()
        }


    }


}