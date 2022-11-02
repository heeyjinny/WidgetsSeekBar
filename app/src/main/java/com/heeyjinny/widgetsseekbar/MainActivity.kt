package com.heeyjinny.widgetsseekbar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.SeekBar
import com.heeyjinny.widgetsseekbar.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    //뷰바인딩
    val binding:ActivityMainBinding by lazy { ActivityMainBinding.inflate(layoutInflater)}

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //뷰바인딩
        setContentView(binding.root)

        //시크바가 사용할 수 있는 리스너 한 가지 : 인터페이스 3개 메서드 생성
        binding.seekBar.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener{

            //첫 번째 파라미터 : 리스너가 동작하고 있는 시크바 위젯
            //두 번째 파라미터 : 현재 시크바의 값
            //세 번째 파라미터 : 사용자 터치 여부(사용자 터치에 의해 동작 인지를 알기위함)
            override fun onProgressChanged(p0: SeekBar?, p1: Int, p2: Boolean) {
                //텍스트뷰에 현재 시크바의 값 입력 : 텍스트뷰는 문자열만 입력이 가능해 $사용하여 변수 입력
                binding.textView.text = "$p1"
            }

            override fun onStartTrackingTouch(p0: SeekBar?) {
            }

            override fun onStopTrackingTouch(p0: SeekBar?) {
            }

        })

    }//onCreate

}//MainActivity