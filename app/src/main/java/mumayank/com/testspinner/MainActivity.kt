package mumayank.com.testspinner

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import java.text.SimpleDateFormat
import android.content.DialogInterface
import android.support.v7.app.AlertDialog
import android.widget.Toast


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        editText.setOnClickListener {

            val alertDialogBuilder = AlertDialog.Builder(this)
            alertDialogBuilder.setTitle("Make a choice:")
            alertDialogBuilder.setMessage("Make a choice:")
            val charSequenceArray = arrayOf<CharSequence>("First", "Second", "Third")
            alertDialogBuilder.setSingleChoiceItems(charSequenceArray, 0) { d, selectedPosition ->
                Toast.makeText(this, selectedPosition.toString(), Toast.LENGTH_SHORT).show()
                d.dismiss()
            }
            alertDialogBuilder.setCancelable(false)
            alertDialogBuilder.setNeutralButton("CANCEL") { d, _ ->
                d.dismiss()
            }
            alertDialogBuilder.show()

        }
    }
}
