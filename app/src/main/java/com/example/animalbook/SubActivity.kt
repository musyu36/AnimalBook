package com.example.animalbook

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_sub.*

class SubActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sub)

        lionButton.setOnClickListener{
            val fragment = LionFragment()
            //FragmentManagerクラスのインスタンスを取得
            val fragmentManager = this.getSupportFragmentManager()
            //FragmentTransactionのインスタンスを取得
            val fragmentTransaction = fragmentManager.beginTransaction()
            //フラグメントの入れ替え, replace(格納するビューグループのID, 表示したいフラグメント)
            fragmentTransaction.replace(R.id.container, fragment)
                .addToBackStack(null) //バックスタックに保存して、戻るボタンで一つ前の状態を表示
                .commit() //フラグメントへの操作を確定

        }

        hippoButton.setOnClickListener{
            val fragment = HippoFragment()
            val fragmentManager = this.getSupportFragmentManager()
            val fragmentTransaction = fragmentManager.beginTransaction()
            fragmentTransaction.replace(R.id.container, fragment)
                .addToBackStack(null)
                .commit()
        }

        giraffeButton.setOnClickListener{
            val fragment = GiraffeFragment()
            val fragmentManager = this.getSupportFragmentManager()
            val fragmentTransaction = fragmentManager.beginTransaction()
            fragmentTransaction.replace(R.id.container, fragment)
                .addToBackStack(null)
                .commit()
        }

        val fragment = titleFragment as? TitleFragment
        fragment?.setTitle("図鑑画面")
    }
}
