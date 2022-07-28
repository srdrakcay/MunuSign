package com.serdar.finalproject.model.horoscope

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.serdar.finalproject.databinding.ActivityDailyBinding
import com.serdar.finalproject.model.api.ApiService
import com.serdar.finalproject.model.api.Retrofit
import com.serdar.finalproject.model.api.daily.DailyModel
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class DailyActivity : AppCompatActivity() {
    private lateinit var binding:ActivityDailyBinding
    private lateinit var postServiceDaily: ApiService

    override fun onCreate(savedInstanceState: Bundle?) {
        binding=ActivityDailyBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)



        binding.lovestone.setOnClickListener {
            postServiceDaily = Retrofit.getClientDaily().create(ApiService::class.java)
            val post = postServiceDaily.listPostDaily()
            post.enqueue(object : Callback<DailyModel> {

                override fun onFailure(call: Call<DailyModel>, t: Throwable) {
                    Toast.makeText(this@DailyActivity, t.message.toString(), Toast.LENGTH_LONG).show()
                }
                override fun onResponse(call: Call<DailyModel>, responseDaily: Response<DailyModel>) {
                    if (responseDaily.isSuccessful ) {
                        val result=responseDaily.body()
                        binding.daily.text=result?.slip?.advice

                    }
                    else{
                        Toast.makeText(this@DailyActivity,"No INTERNET CONNECTION", Toast.LENGTH_SHORT)
                    }
                }
            })
        }
        binding.lifestone.setOnClickListener {

            postServiceDaily = Retrofit.getClientDaily().create(ApiService::class.java)
            val post = postServiceDaily.listPostDaily()
            post.enqueue(object : Callback<DailyModel> {

                override fun onFailure(call: Call<DailyModel>, t: Throwable) {
                    Toast.makeText(this@DailyActivity, t.message.toString(), Toast.LENGTH_LONG).show()
                }
                override fun onResponse(call: Call<DailyModel>, responseDaily: Response<DailyModel>) {
                    if (responseDaily.isSuccessful ) {
                        val result=responseDaily.body()
                        binding.daily.text=result?.slip?.advice

                    }
                    else{
                        Toast.makeText(this@DailyActivity,"No INTERNET CONNECTION", Toast.LENGTH_SHORT)
                    }
                }
            })

        }
        binding.luckystone.setOnClickListener {
            postServiceDaily = Retrofit.getClientDaily().create(ApiService::class.java)
            val post = postServiceDaily.listPostDaily()
            post.enqueue(object : Callback<DailyModel> {

                override fun onFailure(call: Call<DailyModel>, t: Throwable) {
                    Toast.makeText(this@DailyActivity, t.message.toString(), Toast.LENGTH_LONG).show()
                }
                override fun onResponse(call: Call<DailyModel>, responseDaily: Response<DailyModel>) {
                    if (responseDaily.isSuccessful ) {
                        val result=responseDaily.body()
                        binding.daily.text=result?.slip?.advice

                    }
                    else{
                        Toast.makeText(this@DailyActivity,"No INTERNET CONNECTION", Toast.LENGTH_SHORT)
                    }
                }
            })
        }
    }

}