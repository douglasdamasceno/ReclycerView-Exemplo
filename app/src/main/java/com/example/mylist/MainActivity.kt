package com.example.mylist

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}

git init
git add README.md
git commit -m "first commit"
git branch -M main
git remote add origin git@github.com:douglasdamasceno/ReclycerView-Exemplo.git
git push -u origin main