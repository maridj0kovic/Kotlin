package com.example.restaurante

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.restaurante.databinding.ActivityPedidoBinding

class PedidoActivity : AppCompatActivity() {
    // Declara a variável binding do tipo ActivityPedidoBinding
    private lateinit var binding: ActivityPedidoBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        // Atribui a variável binding no ActivityPedidoBinding
        binding = ActivityPedidoBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
    // Está dizendo ao Android para usar o layout especificado pelo binding.root para exibir a interface do usuário da atividade atual
        setContentView(binding.root)

        // Declara os valores passados pela intent
        val i = intent
        // Extrai a quantidade de pizzas, saladas e hambúrgueres do intent
        val quantidadePizza = i.getStringExtra("quantidadePizza").toString().toInt()
        val quantidadeSalada = i.getStringExtra("quantidadeSalada").toString().toInt()
        val quantidadeHamburguer = i.getStringExtra("quantidadeHamburguer").toString().toInt()

        // Cria uma string que contém um resumo do pedido, com informações sobre a quantidade e o preço de pizza, salada e hambúrguer.
        val texto = "Resumo do Pedido\n" +
                "Pizza: $quantidadePizza Preço: ${quantidadePizza*8}\n" +
                "Salada: $quantidadeSalada Preço: ${quantidadeSalada*10}\n" +
                "Hamburguer: $quantidadeHamburguer Preço: ${quantidadeHamburguer*12}\n"

        // Atribui o texto do "Resumo do Pedido" na variável
        binding.textResumo.text = texto

    }
}
