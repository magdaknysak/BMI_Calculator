package knysak.magdalena.bmicalculator


import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlin.text.*


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun onClick(view: View) {


                val editTextWeight = findViewById<View>(R.id.editTextWeight) as EditText
                val editTextHeight = findViewById<View>(R.id.editTextHeight) as EditText
                val textViewResult = findViewById<View>(R.id.textViewResult) as TextView
                val textViewRange = findViewById<View>(R.id.textViewRange) as TextView

                val weight = editTextWeight.text.toString().toInt()
                val height = editTextHeight.text.toString().toInt()
                val result = weight / (height * height * 0.0001)
                var range = " "
                if (result < 18.5) range = "underweight"
                if (result >= 18.5 && result < 25) range = "normal"
                if (result >= 25 && result < 30) range = "overweight"
                if (result >= 30 && result < 35) range = "obese class 1"
                if (result >= 35 && result < 40) range = "obese class 2"
                if (result >= 40) range = "obese class 3"

                textViewResult.text = result.toString()
                textViewRange.text = "You are in the range: $range"




    }



}
