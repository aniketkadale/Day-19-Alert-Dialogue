package com.example.day19_alertdialogue

import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import com.example.day19_alertdialogue.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btn1.setOnClickListener {
            val builder1 = AlertDialog.Builder(this)
            builder1.setTitle("Are you sure?")
            builder1.setMessage("Do you really want to close the app?")
            builder1.setIcon(R.drawable.baseline_exit_to_app_24)

            builder1.setPositiveButton("Yes", DialogInterface.OnClickListener { dialogInterface, i ->
                // What should happen when "Yes" is clicked
                finish()
            })

            builder1.setNegativeButton("No", DialogInterface.OnClickListener { dialogInterface, i ->
                // What should happen when "No" is clicked
            })

            builder1.show()
        }

        binding.btn2.setOnClickListener {
            var sweetOptions = arrayOf("Kaju Katli", "Gulab Jamun", "Barfi", "Pedha", "Rasmalai")
            val builder2 = AlertDialog.Builder(this)
            builder2.setTitle("What's your favorite sweet dish")
            builder2.setSingleChoiceItems(sweetOptions, 0, DialogInterface.OnClickListener { dialog, which ->
                Toast.makeText(this, "${sweetOptions[which]}", Toast.LENGTH_SHORT).show()
            })

            builder2.setPositiveButton("Accept", DialogInterface.OnClickListener { dialogInterface, i ->
                // What should happen when "Yes" is clicked

            })

            builder2.setNegativeButton("Decline", DialogInterface.OnClickListener { dialogInterface, i ->
                // What should happen when "No" is clicked
            })

            builder2.show()
        }

        binding.btn3.setOnClickListener {
            var sweetOptions = arrayOf("Kaju Katli", "Gulab Jamun", "Barfi", "Pedha", "Rasmalai")
            val builder3 = AlertDialog.Builder(this)
            builder3.setTitle("What's your favorite sweet dish")

            builder3.setMultiChoiceItems(sweetOptions, null, DialogInterface.OnMultiChoiceClickListener { dialogInterface, i, b ->
                Toast.makeText(this, "You checked ${sweetOptions[i]}", Toast.LENGTH_SHORT).show()
            })

            builder3.setPositiveButton("Accept", DialogInterface.OnClickListener { dialogInterface, i ->
                // What should happen when "Yes" is clicked

            })

            builder3.setNegativeButton("Decline", DialogInterface.OnClickListener { dialogInterface, i ->
                // What should happen when "No" is clicked
            })

            builder3.show()
        }
    }
}