package code.cover.covermykotlincode

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View.GONE
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)

        fab.setOnClickListener { view ->
            view.visibility = GONE
        }
    }

}
