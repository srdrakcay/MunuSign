package com.serdar.finalproject.model.horoscope

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.serdar.finalproject.R
import com.serdar.finalproject.databinding.ActivityDetailBinding
import com.serdar.finalproject.model.api.ApiService
import com.serdar.finalproject.model.api.Retrofit
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class DetailActivity : AppCompatActivity() {
    private lateinit var binding: ActivityDetailBinding
    private lateinit var postService: ApiService
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityDetailBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        // When you learn the different way to write the code change this page

        binding.imageView1.setOnClickListener {
            val horoscope = "aries"
            postService = Retrofit.getClient().create(ApiService::class.java)
            val post = postService.listPost(
                "$horoscope",
                "today",
                "apikey"
            )

            post.enqueue(object : Callback<HoroscopeModel> {

                override fun onFailure(call: Call<HoroscopeModel>, t: Throwable) {
                    Toast.makeText(this@DetailActivity, t.message.toString(), Toast.LENGTH_LONG)
                        .show()
                }

                override fun onResponse(
                    call: Call<HoroscopeModel>,
                    response: Response<HoroscopeModel>
                ) {

                    if (response.isSuccessful) {

                        val result = response.body()
                        binding.description.text = result?.description
                        binding.color.text = result?.color
                        binding.compatibility.text = result?.compatibility
                        binding.currentDate.text = result?.current_date
                        binding.dateRange.text = result?.date_range
                        binding.luckyNumber.text = result?.lucky_number
                        binding.luckyTime.text = result?.lucky_time
                        binding.mood.text = result?.mood


                    } else {
                        Toast.makeText(
                            this@DetailActivity,
                            "No INTERNET CONNECTION",
                            Toast.LENGTH_SHORT
                        )
                    }
                }
            })

        }
        binding.imageView2.setOnClickListener {
            val horoscope = "taurus"
            postService = Retrofit.getClient().create(ApiService::class.java)
            val post = postService.listPost(
                "$horoscope",
                "today",
                "apikey"
            )

            post.enqueue(object : Callback<HoroscopeModel> {

                override fun onFailure(call: Call<HoroscopeModel>, t: Throwable) {
                    Toast.makeText(this@DetailActivity, t.message.toString(), Toast.LENGTH_LONG)
                        .show()
                }

                override fun onResponse(
                    call: Call<HoroscopeModel>,
                    response: Response<HoroscopeModel>
                ) {

                    if (response.isSuccessful) {

                        val result = response.body()
                        binding.description.text = result?.description
                        binding.color.text = result?.color
                        binding.compatibility.text = result?.compatibility
                        binding.currentDate.text = result?.current_date
                        binding.dateRange.text = result?.date_range
                        binding.luckyNumber.text = result?.lucky_number
                        binding.luckyTime.text = result?.lucky_time
                        binding.mood.text = result?.mood


                    } else {
                        Toast.makeText(
                            this@DetailActivity,
                            "No INTERNET CONNECTION",
                            Toast.LENGTH_SHORT
                        )
                    }
                }
            })

        }
        binding.imageView3.setOnClickListener {
            val horoscope = "gemini"
            postService = Retrofit.getClient().create(ApiService::class.java)
            val post = postService.listPost(
                "$horoscope",
                "today",
                "apikey"
            )

            post.enqueue(object : Callback<HoroscopeModel> {

                override fun onFailure(call: Call<HoroscopeModel>, t: Throwable) {
                    Toast.makeText(this@DetailActivity, t.message.toString(), Toast.LENGTH_LONG)
                        .show()
                }

                override fun onResponse(
                    call: Call<HoroscopeModel>,
                    response: Response<HoroscopeModel>
                ) {

                    if (response.isSuccessful) {

                        val result = response.body()
                        binding.description.text = result?.description
                        binding.color.text = result?.color
                        binding.compatibility.text = result?.compatibility
                        binding.currentDate.text = result?.current_date
                        binding.dateRange.text = result?.date_range
                        binding.luckyNumber.text = result?.lucky_number
                        binding.luckyTime.text = result?.lucky_time
                        binding.mood.text = result?.mood

                    } else {
                        Toast.makeText(this@DetailActivity, "sa", Toast.LENGTH_SHORT)
                    }
                }
            })

        }
        binding.imageView4.setOnClickListener {
            val horoscope = "cancer"
            postService = Retrofit.getClient().create(ApiService::class.java)
            val post = postService.listPost(
                "$horoscope",
                "today",
                "apikey"
            )

            post.enqueue(object : Callback<HoroscopeModel> {

                override fun onFailure(call: Call<HoroscopeModel>, t: Throwable) {
                    Toast.makeText(this@DetailActivity, t.message.toString(), Toast.LENGTH_LONG)
                        .show()
                }

                override fun onResponse(
                    call: Call<HoroscopeModel>,
                    response: Response<HoroscopeModel>
                ) {

                    if (response.isSuccessful) {

                        val result = response.body()
                        binding.description.text = result?.description
                        binding.color.text = result?.color
                        binding.compatibility.text = result?.compatibility
                        binding.currentDate.text = result?.current_date
                        binding.dateRange.text = result?.date_range
                        binding.luckyNumber.text = result?.lucky_number
                        binding.luckyTime.text = result?.lucky_time
                        binding.mood.text = result?.mood


                    } else {
                        Toast.makeText(
                            this@DetailActivity,
                            "No INTERNET CONNECTION",
                            Toast.LENGTH_SHORT
                        )
                    }
                }
            })

        }
        binding.imageView5.setOnClickListener {
            val horoscope = "virgo"
            postService = Retrofit.getClient().create(ApiService::class.java)
            val post = postService.listPost(
                "$horoscope",
                "today",
                "apikey"
            )

            post.enqueue(object : Callback<HoroscopeModel> {

                override fun onFailure(call: Call<HoroscopeModel>, t: Throwable) {
                    Toast.makeText(this@DetailActivity, t.message.toString(), Toast.LENGTH_LONG)
                        .show()
                }

                override fun onResponse(
                    call: Call<HoroscopeModel>,
                    response: Response<HoroscopeModel>
                ) {

                    if (response.isSuccessful) {

                        val result = response.body()
                        binding.description.text = result?.description
                        binding.color.text = result?.color
                        binding.compatibility.text = result?.compatibility
                        binding.currentDate.text = result?.current_date
                        binding.dateRange.text = result?.date_range
                        binding.luckyNumber.text = result?.lucky_number
                        binding.luckyTime.text = result?.lucky_time
                        binding.mood.text = result?.mood


                    } else {
                        Toast.makeText(
                            this@DetailActivity,
                            "No INTERNET CONNECTION",
                            Toast.LENGTH_SHORT
                        )
                    }
                }
            })

        }
        binding.imageView6.setOnClickListener {
            val horoscope = "leo"
            postService = Retrofit.getClient().create(ApiService::class.java)
            val post = postService.listPost(
                "$horoscope",
                "today",
                "apikey"
            )

            post.enqueue(object : Callback<HoroscopeModel> {

                override fun onFailure(call: Call<HoroscopeModel>, t: Throwable) {
                    Toast.makeText(this@DetailActivity, t.message.toString(), Toast.LENGTH_LONG)
                        .show()
                }

                override fun onResponse(
                    call: Call<HoroscopeModel>,
                    response: Response<HoroscopeModel>
                ) {

                    if (response.isSuccessful) {

                        val result = response.body()
                        binding.description.text = result?.description
                        binding.color.text = result?.color
                        binding.compatibility.text = result?.compatibility
                        binding.currentDate.text = result?.current_date
                        binding.dateRange.text = result?.date_range
                        binding.luckyNumber.text = result?.lucky_number
                        binding.luckyTime.text = result?.lucky_time
                        binding.mood.text = result?.mood


                    } else {
                        Toast.makeText(this@DetailActivity, "sa", Toast.LENGTH_SHORT)
                    }
                }
            })

        }
        binding.imageView7.setOnClickListener {
            val horoscope = "libra"
            postService = Retrofit.getClient().create(ApiService::class.java)
            val post = postService.listPost(
                "$horoscope",
                "today",
                "apikey"
            )

            post.enqueue(object : Callback<HoroscopeModel> {

                override fun onFailure(call: Call<HoroscopeModel>, t: Throwable) {
                    Toast.makeText(this@DetailActivity, t.message.toString(), Toast.LENGTH_LONG)
                        .show()
                }

                override fun onResponse(
                    call: Call<HoroscopeModel>,
                    response: Response<HoroscopeModel>
                ) {

                    if (response.isSuccessful) {

                        val result = response.body()
                        binding.description.text = result?.description
                        binding.color.text = result?.color
                        binding.compatibility.text = result?.compatibility
                        binding.currentDate.text = result?.current_date
                        binding.dateRange.text = result?.date_range
                        binding.luckyNumber.text = result?.lucky_number
                        binding.luckyTime.text = result?.lucky_time
                        binding.mood.text = result?.mood

                    } else {
                        Toast.makeText(
                            this@DetailActivity,
                            "No INTERNET CONNECTION",
                            Toast.LENGTH_SHORT
                        )
                    }
                }
            })

        }
        binding.imageView8.setOnClickListener {
            val horoscope = "scorpio"
            postService = Retrofit.getClient().create(ApiService::class.java)
            val post = postService.listPost(
                "$horoscope",
                "today",
                "apikey"
            )

            post.enqueue(object : Callback<HoroscopeModel> {

                override fun onFailure(call: Call<HoroscopeModel>, t: Throwable) {
                    Toast.makeText(this@DetailActivity, t.message.toString(), Toast.LENGTH_LONG)
                        .show()
                }

                override fun onResponse(
                    call: Call<HoroscopeModel>,
                    response: Response<HoroscopeModel>
                ) {

                    if (response.isSuccessful) {

                        val result = response.body()
                        binding.description.text = result?.description
                        binding.color.text = result?.color
                        binding.compatibility.text = result?.compatibility
                        binding.currentDate.text = result?.current_date
                        binding.dateRange.text = result?.date_range
                        binding.luckyNumber.text = result?.lucky_number
                        binding.luckyTime.text = result?.lucky_time
                        binding.mood.text = result?.mood

                    } else {
                        Toast.makeText(
                            this@DetailActivity,
                            "No INTERNET CONNECTION",
                            Toast.LENGTH_SHORT
                        )
                    }
                }
            })

        }
        binding.imageView9.setOnClickListener {
            val horoscope = "sagittarius"
            postService = Retrofit.getClient().create(ApiService::class.java)
            val post = postService.listPost(
                "$horoscope",
                "today",
                "apikey"
            )

            post.enqueue(object : Callback<HoroscopeModel> {

                override fun onFailure(call: Call<HoroscopeModel>, t: Throwable) {
                    Toast.makeText(this@DetailActivity, t.message.toString(), Toast.LENGTH_LONG)
                        .show()
                }

                override fun onResponse(
                    call: Call<HoroscopeModel>,
                    response: Response<HoroscopeModel>
                ) {

                    if (response.isSuccessful) {

                        val result = response.body()
                        binding.description.text = result?.description
                        binding.color.text = result?.color
                        binding.compatibility.text = result?.compatibility
                        binding.currentDate.text = result?.current_date
                        binding.dateRange.text = result?.date_range
                        binding.luckyNumber.text = result?.lucky_number
                        binding.luckyTime.text = result?.lucky_time
                        binding.mood.text = result?.mood

                    } else {
                        Toast.makeText(
                            this@DetailActivity,
                            "No INTERNET CONNECTION",
                            Toast.LENGTH_SHORT
                        )
                    }
                }
            })

        }
        binding.imageView10.setOnClickListener {
            val horoscope = "capricorn"
            postService = Retrofit.getClient().create(ApiService::class.java)
            val post = postService.listPost(
                "$horoscope",
                "today",
                "apikey"
            )

            post.enqueue(object : Callback<HoroscopeModel> {

                override fun onFailure(call: Call<HoroscopeModel>, t: Throwable) {
                    Toast.makeText(this@DetailActivity, t.message.toString(), Toast.LENGTH_LONG)
                        .show()
                }

                override fun onResponse(
                    call: Call<HoroscopeModel>,
                    response: Response<HoroscopeModel>
                ) {

                    if (response.isSuccessful) {

                        val result = response.body()
                        binding.description.text = result?.description
                        binding.color.text = result?.color
                        binding.compatibility.text = result?.compatibility
                        binding.currentDate.text = result?.current_date
                        binding.dateRange.text = result?.date_range
                        binding.luckyNumber.text = result?.lucky_number
                        binding.luckyTime.text = result?.lucky_time
                        binding.mood.text = result?.mood

                    } else {
                        Toast.makeText(
                            this@DetailActivity,
                            "No INTERNET CONNECTION",
                            Toast.LENGTH_SHORT
                        )
                    }
                }
            })

        }
        binding.imageView11.setOnClickListener {
            val horoscope = "aquarius"
            postService = Retrofit.getClient().create(ApiService::class.java)
            val post = postService.listPost(
                "$horoscope",
                "today",
                "apikey"
            )

            post.enqueue(object : Callback<HoroscopeModel> {

                override fun onFailure(call: Call<HoroscopeModel>, t: Throwable) {
                    Toast.makeText(this@DetailActivity, t.message.toString(), Toast.LENGTH_LONG)
                        .show()
                }

                override fun onResponse(
                    call: Call<HoroscopeModel>,
                    response: Response<HoroscopeModel>
                ) {

                    if (response.isSuccessful) {

                        val result = response.body()
                        binding.description.text = result?.description
                        binding.color.text = result?.color
                        binding.compatibility.text = result?.compatibility
                        binding.currentDate.text = result?.current_date
                        binding.dateRange.text = result?.date_range
                        binding.luckyNumber.text = result?.lucky_number
                        binding.luckyTime.text = result?.lucky_time
                        binding.mood.text = result?.mood

                    } else {
                        Toast.makeText(
                            this@DetailActivity,
                            "No INTERNET CONNECTION",
                            Toast.LENGTH_SHORT
                        )
                    }
                }
            })

        }
        binding.imageView12.setOnClickListener {
            val horoscope = "pisces"
            postService = Retrofit.getClient().create(ApiService::class.java)
            val post = postService.listPost(
                "$horoscope",
                "today",
                "apikey"
            )

            post.enqueue(object : Callback<HoroscopeModel> {

                override fun onFailure(call: Call<HoroscopeModel>, t: Throwable) {
                    Toast.makeText(this@DetailActivity, t.message.toString(), Toast.LENGTH_LONG)
                        .show()
                }

                override fun onResponse(
                    call: Call<HoroscopeModel>,
                    response: Response<HoroscopeModel>
                ) {

                    if (response.isSuccessful) {

                        val result = response.body()
                        binding.description.text = result?.description
                        binding.color.text = result?.color
                        binding.compatibility.text = result?.compatibility
                        binding.currentDate.text = result?.current_date
                        binding.dateRange.text = result?.date_range
                        binding.luckyNumber.text = result?.lucky_number
                        binding.luckyTime.text = result?.lucky_time
                        binding.mood.text = result?.mood

                    } else {
                        Toast.makeText(
                            this@DetailActivity,
                            "No INTERNET CONNECTION",
                            Toast.LENGTH_SHORT
                        )
                    }
                }
            })

        }
    }
}