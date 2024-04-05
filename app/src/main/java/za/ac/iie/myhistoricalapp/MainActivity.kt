package za.ac.iie.myhistoricalapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val generatehistoryButton = findViewById<Button>(R.id.generatehistoryButton)
        val clearButton = findViewById<Button>(R.id.clearButton)
        val editTextNumber = findViewById<EditText>(R.id.editTextNumber)
        val resultTextView = findViewById<TextView>(R.id.resultTextView)
        generatehistoryButton.setOnClickListener {

            /* if else statement */
            val age = editTextNumber.text.toString().toIntOrNull()
            if (age == null) {
                resultTextView.text = "Please enter a valid age"


            } else {
                if (age < 20 || age > 100) {
                    resultTextView.text = "Please enter a valid age between 20 and 100"
                    editTextNumber.text.clear()
                } else {
                    /* 10 Dead famous people i chose to display */
                    val result = when (age) {
                        91 -> "Harriet Tubman was a Abolitionist and political activist."
                        95 -> "Nelson Mandela was the first black South African president."
                        78 -> "Mahatma Gandhi was famous for his promoting of non-violence actions and that inspired civil rights leaders across the world"
                        52 -> "William Shakespeare was famous for his English writing. He was the greatest English writer"
                        30 -> "Steve Biko was an anti-apartheid activist in South Africa and also founded te Black Consciousness Movement."
                        81 -> "Winne Mandela was an anti-apartheid activist and a politician, as well as Nelson Mandela's second wife."
                        78 -> "Hugh Masekela was a pioneer of the music genre, jazz in South Africa. He was a trumpeter, bandleader, singer and etc."
                        90 -> "Desmond Tutu was one of the most well-known human rights activist in South Africa."
                        51 -> "Chris Hani was a charismatic leader."
                        48 -> "Cecil Rhodes was the prime minister of Cape Colony."


                        else -> "There is no Historical Figure identified that died at the age you entered. Try Again."

                    }
                    resultTextView.text = result
                }
                clearButton.setOnClickListener {
                    editTextNumber.text.clear()
                    resultTextView.text = ""
                }


            }


        }
    }
}


