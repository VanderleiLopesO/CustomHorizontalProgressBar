package com.example.myapplication

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.view.View
import androidx.constraintlayout.widget.ConstraintLayout

class LimitProgressBar @JvmOverloads constructor(
        context: Context,
        attrs: AttributeSet? = null
) : ConstraintLayout(context, attrs) {

    private val topBarGuideline: View by lazy {
        findViewById<View>(R.id.guideline)
    }

    init {
        LayoutInflater.from(context)
                .inflate(R.layout.limit_progress_bar, this, true)
    }

    fun setProgress(percentageParam: Float) {
        animate().alpha(0f)

        val percentage: Float = if (percentageParam > 100) 100f else percentageParam

        val layoutParams = (topBarGuideline.layoutParams as LayoutParams).apply {
            guidePercent = (percentage / 100)
        }

        topBarGuideline.layoutParams = layoutParams
        animate().alpha(1f)
    }

}