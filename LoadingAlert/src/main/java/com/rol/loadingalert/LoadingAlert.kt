package com.rol.loadingalert

import android.app.AlertDialog
import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.ProgressBar
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout

class LoadingAlert @JvmOverloads constructor(
    context: Context,
    attrs:AttributeSet? = null,
    defStyle: Int = 0,
    defStyleRes: Int = 0
): ConstraintLayout(context, attrs, defStyle, defStyleRes) {

    private var dialog: AlertDialog? = null
    private val progressBar: ProgressBar
    private val textView: TextView

    init {
        LayoutInflater.from(context).inflate(R.layout.component_loading_alert, this, true)
        progressBar = findViewById(R.id.progressBar)
        textView = findViewById(R.id.textView)
    }

    fun startAlertDialog() {
        val builder = AlertDialog.Builder(context)
        builder.setView(this)
        builder.setCancelable(true)

        dialog = builder.create()
        dialog?.show()
    }

    fun closeAlertDialog() {
        dialog?.dismiss()
    }
}