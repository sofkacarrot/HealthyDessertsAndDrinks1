package com.example.healthydessertsanddrinks

import android.content.Intent
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.widget.EditText
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.bottomnavigation.BottomNavigationView

class MenuActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)

        val recyclerView = findViewById<RecyclerView>(R.id.recycler_view)
        val searchBar = findViewById<EditText>(R.id.search_bar)
        val iconAll = findViewById<ImageView>(R.id.icon_all)
        val iconDesserts = findViewById<ImageView>(R.id.icon_desserts)
        val iconDrinks = findViewById<ImageView>(R.id.icon_drinks)
        val bottomNavigation = findViewById<BottomNavigationView>(R.id.bottom_navigation)

        // Полный список карточек
        val allItems = listOf(
            DessertItem("Шоколадный хруст", 55, R.drawable.q),
            DessertItem("Ягодный шоколад", 120, R.drawable.w),
            DessertItem("Ягодный глянец", 130, R.drawable.e),
            DessertItem("Ягодный микс", 140, R.drawable.r),
            DessertItem("Клубничная мечта", 120, R.drawable.t),
            DessertItem("Клубничное облако", 130, R.drawable.y),
            DessertItem("Карамельная мечта", 140, R.drawable.u),
            DessertItem("Ореховая нежность", 120, R.drawable.i),
            DessertItem("Клубничный парфе", 150, R.drawable.o),
            DessertItem("Клубничная нежность", 90, R.drawable.p),
            DessertItem("Цитрусовый Взрыв", 80, R.drawable.f),
            DessertItem("Черничная Сладость", 70, R.drawable.g),
            DessertItem("Клубничный Шлейф", 85, R.drawable.h),
            DessertItem("Ягодный Взрыв", 90, R.drawable.j),
            DessertItem("Лимонный Детокс", 50, R.drawable.k),
            DessertItem("Клубничный Вздох", 60, R.drawable.l),
            DessertItem("Зеленый Фреш", 40, R.drawable.n),
            DessertItem("Манго Лайт", 75, R.drawable.x),
            DessertItem("Ягодный Лайт", 50, R.drawable.c),
            DessertItem("Ягодная Свежесть", 65, R.drawable.v)
        )

        // Список избранного
        val favoriteItems = mutableListOf<DessertItem>()

        // Настройка адаптера
        val adapter = ItemAdapter(allItems) { dessert ->
            val intent = Intent(this, RecipeDetailActivity::class.java)
            intent.putExtra("RECIPE_NAME", dessert.name)
            intent.putExtra("RECIPE_CALORIES", dessert.calories)
            intent.putExtra("RECIPE_IMAGE", dessert.imageResId)
            startActivity(intent)
        }
        recyclerView.layoutManager = GridLayoutManager(this, 2)
        recyclerView.adapter = adapter

        // Обработка кликов на сердечко
        adapter.onFavoriteClicked = { dessert ->
            if (dessert.isFavorite) {
                favoriteItems.add(dessert)
            } else {
                favoriteItems.remove(dessert)
            }
        }

        // Обработка поиска
        searchBar.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {}
            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {}
            override fun afterTextChanged(s: Editable?) {
                val query = s.toString().lowercase()
                val filteredList = allItems.filter { it.name.lowercase().contains(query) }
                adapter.updateItems(filteredList)
            }
        })

        // Настройка кнопок категорий
        fun resetCategoryColors() {
            iconAll.setColorFilter(ContextCompat.getColor(this, R.color.gray))
            iconDesserts.setColorFilter(ContextCompat.getColor(this, R.color.gray))
            iconDrinks.setColorFilter(ContextCompat.getColor(this, R.color.gray))
        }

        iconAll.setOnClickListener {
            resetCategoryColors()
            iconAll.setColorFilter(ContextCompat.getColor(this, R.color.button_color))
            adapter.updateItems(allItems)
        }

        iconDesserts.setOnClickListener {
            resetCategoryColors()
            iconDesserts.setColorFilter(ContextCompat.getColor(this, R.color.button_color))
            // Фильтрация по десертам с полными названиями
            adapter.updateItems(allItems.filter {
                it.name == "Шоколадный хруст" ||
                        it.name == "Ягодный шоколад" ||
                        it.name == "Ягодный глянец" ||
                        it.name == "Карамельная мечта" ||
                        it.name == "Клубничная мечта" ||
                        it.name == "Клубничное облако" ||
                        it.name == "Клубничный парфе" ||
                        it.name == "Ягодный микс" ||
                        it.name == "Клубничная нежность" ||
                        it.name == "Ореховая нежность"
            })
        }

        iconDrinks.setOnClickListener {
            resetCategoryColors()
            iconDrinks.setColorFilter(ContextCompat.getColor(this, R.color.button_color))
            // Фильтрация по напиткам с полными названиями
            adapter.updateItems(allItems.filter {
                it.name == "Цитрусовый Взрыв" ||
                        it.name == "Ягодный Взрыв" ||
                        it.name == "Лимонный Детокс" ||
                        it.name == "Зеленый Фреш" ||
                        it.name == "Манго Лайт" ||
                        it.name == "Ягодный Лайт" ||
                        it.name == "Черничная Сладость" ||
                        it.name == "Клубничный Шлейф" ||
                        it.name == "Клубничный Вздох" ||
                        it.name == "Ягодная Свежесть"
            })
        }

        bottomNavigation.setOnItemSelectedListener { item ->
            when (item.itemId) {
                R.id.menu_home -> {
                    startActivity(Intent(this, HomeActivity::class.java))
                    true
                }
                R.id.menu_favorites -> {
                    val intent = Intent(this, FavoritesActivity::class.java)
                    intent.putParcelableArrayListExtra("FAVORITES_LIST", ArrayList(favoriteItems))
                    startActivity(intent)
                    true
                }
                R.id.profile -> {
                    startActivity(Intent(this, ProfileActivity::class.java))
                    true
                }
                else -> false
            }
        }



    }
}