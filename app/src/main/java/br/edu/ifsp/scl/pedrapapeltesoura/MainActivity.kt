package br.edu.ifsp.scl.pedrapapeltesoura

import android.os.Bundle
import android.view.View
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import kotlin.random.Random
import android.widget.TextView


class MainActivity : AppCompatActivity() {

    private lateinit var userInputTV: TextView
    private lateinit var cpuInputTV: TextView
    private lateinit var resultTV: TextView



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        userInputTV = findViewById(R.id.userInputTV)
        cpuInputTV = findViewById(R.id.cpuInputTV)
        resultTV = findViewById(R.id.resultTV)



        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }

    fun paperButtonClicked(view: View) {
        val cpuChoice = Random.nextInt(until = 2)
        userInputTV.text = "Você escolheu papel"
        when (cpuChoice) {
           0 -> cpuInputTV.text = "O computador escolheu pedra"
           1 -> cpuInputTV.text = "O computador escolheu papel"
           2 -> cpuInputTV.text = "O computador escolheu tesoura"
        }
        when(cpuChoice) {
            0 -> resultTV.text = "Você ganhou!"
            1 -> resultTV.text = "Empate!"
            2 -> resultTV.text = "Você perdeu!"
        }

    }

    fun rockButtonClicked(view: View) {
        val cpuChoice = Random.nextInt(until = 2)
        userInputTV.text = "Você escolheu pedra"
        when (cpuChoice) {
            0 -> {
                cpuInputTV.text = "O computador escolheu pedra"
                resultTV.text = "Empate!"
            }
            1 -> {
                cpuInputTV.text = "O computador escolheu papel"
                resultTV.text = "Você perdeu!"
            }
            2 -> {
                cpuInputTV.text = "O computador escolheu tesoura"
                resultTV.text = "Você ganhou!"
            }
        }
    }

    fun scissorsButtonClicked(view: View) {
        val cpuChoice = Random.nextInt(until = 2)
        userInputTV.text = "Você escolheu tesoura"
        when (cpuChoice) {
            0 -> {
                cpuInputTV.text = "O computador escolheu pedra"
                resultTV.text = "Você perdeu!"
            }
            1 -> {
                cpuInputTV.text = "O computador escolheu papel"
                resultTV.text = "Você ganhou!"
            }
            2 -> {
                cpuInputTV.text = "O computador escolheu tesoura"
                resultTV.text = "Empate!"
            }
        }
    }

    fun restartButtonClicked(view: View) {

        userInputTV.text = "Faça sua escolha"
        cpuInputTV.text = ""
        resultTV.text = "Resultado"
    }


}
