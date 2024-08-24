package com.example.restaurante

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.restaurante.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity() {
// Criação da variável binding que servirá para manipular a tela.
    private lateinit var binding:ActivityLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Define o layout de Login e a atribui a variável binding.
        binding = ActivityLoginBinding.inflate(layoutInflater)
       // Está dizendo ao Android para usar o layout especificado pelo binding.root para exibir a interface do usuário da atividade atual
        setContentView(binding.root)

        // Define um OnClicklistener para o botão "Entrar".
        binding.buttonEntrar.setOnClickListener {

            // Define os valores da variável para o Username e a Senha inserida pelo usuário, converte para String e remove os espaços em branco.
            val username = binding.editUsername.text.toString().trim()
            val password = binding.editPassword.text.toString().trim()

            // Checa se o username e a senha inserido pelo usuário estão corretos.
            if (username.equals("abc") && password.equals("123")) {
                // Cria um Intent para iniciar o MainActivity
                val i = Intent(this, MainActivity::class.java)
                // Adiciona o username como extra para a intent 
                i.putExtra("username", username)
              // Inicia o MainActivity
                startActivity(i)
               // Finaliza o LoginActivity
                finish()
            } else {
                // Se o usuário e a senha estiverem incorretos, exibe uma mensagem de erro.
                Toast.makeText(applicationContext, "Errou", Toast.LENGTH_LONG).show()
            }
        }

    }
}
