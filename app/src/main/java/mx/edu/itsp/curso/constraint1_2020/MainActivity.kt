package mx.edu.itsp.curso.constraint1_2020

import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.Toast
import androidx.appcompat.widget.Toolbar



import androidx.annotation.RequiresApi
import androidx.cardview.widget.CardView
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {


    @RequiresApi(Build.VERSION_CODES.LOLLIPOP)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val toolbar=findViewById<Toolbar>(R.id.toolbar)
        toolbar.title="mi tool bar"
        setSupportActionBar(toolbar)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val Fab=findViewById<FloatingActionButton>(R.id.FABAccion)
        Fab.setOnClickListener({
            Toast.makeText(applicationContext,"pulsado el boton FAB",
                Toast.LENGTH_LONG).show()
        })
        // traer la referencia a CardView
        val card:CardView =findViewById(R.id.card_img)
        card.setOnClickListener({
            Snackbar.make(it,"click sobre el card",Snackbar.LENGTH_LONG).show()
        })

    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_toolbar,menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem?): Boolean {
        val id= item?.itemId
        when(id){
            R.id.item1->Toast.makeText(applicationContext,"seleccionaste opcion 1",Toast.LENGTH_LONG).show()
            R.id.item2->Toast.makeText(applicationContext,"opcion 2",Toast.LENGTH_LONG).show()
        }
        return super.onOptionsItemSelected(item)
    }
}
