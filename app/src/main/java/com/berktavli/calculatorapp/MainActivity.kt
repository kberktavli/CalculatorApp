package com.berktavli.calculatorapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import com.berktavli.calculatorapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        /*
        binding.zero.setOnClickListener {}
        binding.one.setOnClickListener {  }
        binding.two.setOnClickListener {  }
        binding.three.setOnClickListener {  }
        binding.four.setOnClickListener {  }
        binding.five.setOnClickListener {  }
        binding.six.setOnClickListener {  }
        binding.seven.setOnClickListener {  }
        binding.eight.setOnClickListener {  }
        binding.nine.setOnClickListener {  }

        binding.plus.setOnClickListener{}
        binding.mines.setOnClickListener {  }
        binding.divide.setOnClickListener {  }
        binding.multiply.setOnClickListener {  }

         */

       fun addValue(button : Button, value : String){
           button.setOnClickListener{
               val currentValue = binding.tvResult.text.toString()
               binding.tvResult.setText("${currentValue}$value")
           }
       }


        addValue(binding.zero,"0")
        addValue(binding.one,"1")
        addValue(binding.two,"2")
        addValue(binding.three,"3")
        addValue(binding.four,"4")
        addValue(binding.five,"5")
        addValue(binding.six,"6")
        addValue(binding.seven,"7")
        addValue(binding.eight,"8")
        addValue(binding.nine,"9")
        addValue(binding.plus,"+")

        binding.equal.setOnClickListener {
            val currentValue = binding.tvResult.text.toString()
            val arrayProcess = currentValue.split("+").toTypedArray()
            var total = 0
            for(i in arrayProcess){
                if(i == ""){
                    total += 0
                }
                else {
                    total += i.toInt()
                }
                binding.tvResult.setText(total.toString())
            }
        }
        binding.clear.setOnClickListener {
            binding.tvResult.setText("")
        }

    }




}