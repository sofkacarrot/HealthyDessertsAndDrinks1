package com.example.healthydessertsanddrinks

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar

class RecipeDetailActivity : AppCompatActivity() {

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recipe_detail)

        // Инициализация Toolbar
        val toolbar = findViewById<Toolbar>(R.id.toolbar)
        setSupportActionBar(toolbar)
        supportActionBar?.setDisplayHomeAsUpEnabled(true) // Включаем кнопку "Назад"

        // Обработка клика на кнопку "Назад"
        toolbar.setNavigationOnClickListener {
            finish() // Закрыть текущую Activity и вернуться на предыдущий экран
        }

        // Инициализация остальных View
        val recipeImage = findViewById<ImageView>(R.id.recipe_image)
        val recipeName = findViewById<TextView>(R.id.recipe_name)
        val recipeCalories = findViewById<TextView>(R.id.recipe_calories)
        val recipeDetails = findViewById<TextView>(R.id.recipe_details)

        // Получение данных из Intent
        val name = intent.getStringExtra("RECIPE_NAME")
        val calories = intent.getIntExtra("RECIPE_CALORIES", 0)
        val imageResId = intent.getIntExtra("RECIPE_IMAGE", 0)

        // Установка данных
        recipeImage.setImageResource(imageResId)
        recipeName.text = name
        recipeCalories.text = "Калории: $calories ккал"

        // Добавьте текст рецепта, если требуется (как в вашем предыдущем коде)

        when (name) {

            "Шоколадный хруст" -> {

                recipeDetails.text = """ 

                    Рецепт "Фитнес-печенье" (низкокалорийный вариант)

                    Ингредиенты (на 12 штук):

                    - 1 спелый банан (примерно 120 г)

                    - 100 г овсяных хлопьев

                    - 30 г темного шоколада (70% какао, нарезанного кусочками)

                    - 1 ч. л. ванильного экстракта

                    - Щепотка соли

                    - 1 ч. л. разрыхлителя

                    Приготовление:

                    1. Разомните банан вилкой до состояния пюре.

                    2. Добавьте овсяные хлопья, разрыхлитель, ванильный экстракт и щепотку соли. Перемешайте.

                    3. Добавьте нарезанный шоколад и перемешайте.

                    4. На противень выложите тесто ложкой, формируя круглые печенья.

                    5. Выпекайте при 180°C 12-15 минут до золотистого цвета.

                    Питательная ценность (на 1 штуку):

                    - Калории: 55 ккал

                    - Белки: 1.2 г (9%)

                    - Жиры: 1.5 г (25%)

                    - Углеводы: 10 г (66%)

                """.trimIndent()

            }

            "Ягодный шоколад" -> {

                recipeDetails.text = """ 

                    Рецепт "Ягодный Шоколад"

                    Ингредиенты:

                    Для основы:

                    - 100 г овсяного печенья (низкокалорийного)

                    Для начинки:

                    - 250 г обезжиренного творога

                    - 150 г греческого йогурта (0-2% жирности)

                    - 2 ст. л. какао-порошка (без сахара)

                    - 50 г темного шоколада (70-85% какао, без сахара)

                    - 50 мл молока (1,5% жирности)

                    - 2 ст. л. эритрита или стевии (для сладости)

                    - 10 г желатина + 50 мл воды

                    Для украшения:

                    - Несколько свежих ягод (клубника, голубика)

                    Приготовление:

                    1. Основа: Измельчите овсяное печенье в крошку, смешайте с растопленным кокосовым маслом. Уплотните массу на дне формы (диаметр 18-20 см). Охладите в холодильнике.

                    2. Начинка: Желатин замочите в воде, затем нагрейте до растворения. Растопите шоколад на водяной бане, добавьте молоко и какао, перемешайте. Взбейте творог, йогурт и подсластитель до однородной массы. Добавьте растопленный шоколад и желатин, снова взбейте.

                    3. Охлаждение: Вылейте начинку на основу и поставьте в холодильник на 4-6 часов до застывания.

                    4. Украшение: Украсьте свежими ягодами перед подачей.

                    Пищевая ценность (на 100 г):

                    - Белки: 8%

                    - Жиры: 5%

                    - Углеводы: 10%

                    - Калорийность: ~120 ккал

                """.trimIndent()

            }

            "Ягодный глянец" -> {

                recipeDetails.text = """ 

                    Рецепт "Ягодный глянец" (низкокалорийный вариант)

                    Ингредиенты (на 6 порций):

                    Для основы:

                    - 80 г овсяного печенья (низкокалорийного)

                    - 2 ст. л. обезжиренного мягкого масла или кокосового масла

                    Для крема:

                    - 300 г обезжиренного творога (0%)

                    - 150 г греческого йогурта (0%)

                    - 2 ст. л. меда (или подсластителя)

                    - 150 мл вишневого сока (натурального, без сахара)

                    - 10 г желатина

                    - 100 мл воды

                    Для украшения:

                    - 100 г вишни (свежей или замороженной)

                    - 20 г горького шоколада (70% какао)

                    - 6 ягод голубики

                    Приготовление:

                    1. Основа: Размельчите овсяное печенье в крошку, смешайте с растопленным маслом. Уложите смесь в форму и утрамбуйте. Поставьте в холодильник.

                    2. Крем: Замочите желатин в воде на 5-10 минут. Затем нагрейте до растворения. Смешайте творог, йогурт, мед и вишневый сок до однородной консистенции. Добавьте растворенный желатин и тщательно перемешайте.

                    3. Сборка: Залейте крем на основу и добавьте вишню внутрь слоя. Разровняйте поверхность и отправьте в холодильник на 4 часа для застывания.

                    4. Украшение: Покройте верхний слой тертым шоколадом, добавьте голубику и оставьте в холодильнике еще на 30 минут.

                    Питательная ценность (на 1 порцию):

                    - Калории: 130 ккал

                    - Белки: 7 г (23%)

                    - Жиры: 5 г (35%)

                    - Углеводы: 15 г (42%)

                """.trimIndent()

            }

            "Ягодный микс" -> {

                recipeDetails.text = """ 

                    Рецепт "Ягодный микс" (низкокалорийный вариант)
                    Ингредиенты (на 2 порции):
                    150 г обезжиренного натурального йогурта (0% жирности)
                    30 г овсяных хлопьев
                    50 мл миндального молока (несладкого)
                    50 г малины (свежей или замороженной)
                    50 г черники
                    50 г клубники (нарезанной кусочками)
                    1 ст. л. меда (или подсластителя)
                    Щепотка корицы (по желанию)

                    Приготовление:
                    1. Подготовка овсянки:

                    Смешайте овсяные хлопья с миндальным молоком. Дайте постоять 5-10 минут для размягчения.

                    2. Сборка:

                    В миску выложите слой размягченной овсянки.
                    Добавьте слой натурального йогурта.
                    Равномерно распределите ягоды (малину, чернику и клубнику) поверх йогурта.

                    3. Украшение:

                    Полейте десерт медом.
                    По желанию посыпьте щепоткой корицы для аромата

                    4. Подача:

                    Подайте сразу или охладите в холодильнике перед подачей, чтобы десерт был еще освежающим.

                    Питательная ценность (на 1 порцию):
                    Калории: 140 ккал
                    Белки: 6 г (20%)
                    Жиры: 2 г (13%)
                    Углеводы: 27 г (67%)

                """.trimIndent()

            }
            "Клубничная мечта" -> {

                recipeDetails.text = """ 
                    
                    Рецепт "Клубничный чизкейк с шоколадной крошкой" (низкокалорийный вариант)
                    Ингредиенты (на 6 порций):
                    Для основы:
                    100 г овсяного печенья (низкокалорийного)
                    2 ст. л. кокосового масла (или обезжиренного мягкого масла)
                    Для крема:
                    300 г обезжиренного творога (0%)
                    200 г греческого йогурта (0% жирности)
                    2 ст. л. натурального меда (или подсластителя)
                    2 ч. л. желатина
                    100 мл воды
                    Для украшения:
                    150 г свежей клубники
                    10 г горького шоколада (70% какао, тертого)
                    Приготовление:
                    1. Основа:

                    Размельчите овсяное печенье в крошку. Смешайте его с растопленным кокосовым маслом. Уложите смесь на дно формы для выпечки, утрамбуйте и отправьте в холодильник.

                    2. Крем:

                    Замочите желатин в холодной воде на 5-10 минут, затем нагрейте до растворения.
                    Смешайте творог, йогурт и мед в блендере до однородной массы. Добавьте растворенный желатин и перемешайте.

                    3. Сборка:

                    Вылейте кремовую массу на основу. Разровняйте и отправьте в холодильник на 3-4 часа, чтобы десерт застыл.

                    4. Украшение:

                    Украсьте готовый чизкейк свежей клубникой и посыпьте тертым горьким шоколадом.

                    Питательная ценность (на 1 порцию):
                    Калории: 120 ккал
                    Белки: 8 г (27%)
                    Жиры: 4 г (30%)
                    Углеводы: 14 г (43%)

                    

                """.trimIndent()

            }

            "Клубничное облако" -> {

                recipeDetails.text = """ 
                    
                    Рецепт низкокалорийного клубничного тарта:
                    Ингредиенты:
                    Основа:
                    Овсяные хлопья — 100 г
                    Обезжиренный йогурт — 50 г
                    Мед — 1 ст. ложка (или подсластитель)
                    Крем:
                    Обезжиренный творог — 200 г
                    Обезжиренный греческий йогурт — 100 г
                    Подсластитель — по вкусу
                    Ванильный экстракт — 1 ч. ложка
                    Украшение:
                    Свежая клубника — 50 г

                    Приготовление:
                    1. Основа: 

                    Измельчите овсяные хлопья в блендере до состояния муки. Смешайте с йогуртом и медом до однородной массы. Утрамбуйте смесь в форму для выпечки и поставьте в холодильник на 30 минут.

                    2. Крем:

                    Смешайте творог, греческий йогурт, подсластитель и ванильный экстракт. Взбейте до кремовой консистенции.

                    3. Сборка: 

                    Достаньте основу из холодильника, выложите на нее крем. Украсьте свежей клубникой.

                    4. Охлаждение:

                    Поставьте тарт в холодильник на 1 час для охлаждения.

                    Пищевая ценность (на порцию, около 200 г):
                    Белки: ~10%
                    Жиры: ~3%
                    Углеводы: ~87%
                """.trimIndent()

            }

            "Карамельная мечта" -> {

                recipeDetails.text = """ 
                    
                    Рецепт "Карамельная мечта"(низкокалорийный вариант)
                    Ингредиенты:
                    Для основы:
                    100 г овсяного печенья (низкокалорийного)
                    30 г кокосового масла
                    Для начинки:
                    300 г обезжиренного творога
                    150 г натурального йогурта (0% жирности)
                    2 ст. л. кукурузного крахмала
                    3 ст. л. эритрита или стевии
                    1 ч. л. ванильного экстракта
                    Для карамельного слоя:
                    150 мл кокосового молока (лайт)
                    2 ст. л. сиропа из топинамбура или кленового сиропа
                    1 ст. л. эритрита
                    Щепотка соли
                    Для украшения:
                    Свежая черника или другие ягоды
                    Листики мяты

                    Приготовление:
                    1. Основа: 

                    Измельчите овсяное печенье и смешайте с растопленным кокосовым маслом. Распределите массу по дну формы (диаметр 18-20 см) и охладите в холодильнике.

                    2. Начинка: 

                    Взбейте творог, йогурт, эритрит, ваниль и крахмал до однородной массы. Вылейте начинку на основу и выпекайте при 160°C 30-35 минут. Дайте остыть.

                    3. Карамельный слой:

                    Смешайте кокосовое молоко, сироп, эритрит и щепотку соли в кастрюле. Нагревайте на среднем огне, помешивая, пока смесь не загустеет (~5-7 минут). Остудите.
                    Вылейте карамель на остывший торт и разровняйте.

                    4. Украшение:

                    Добавьте ягоды и листики мяты.

                    5. Охлаждение:

                    Охладите в холодильнике 4-6 часов перед подачей.

                    Пищевая ценность (на 100 г):
                    Белки: 9%
                    Жиры: 6%
                    Углеводы: 11%
                    Калорийность: ~140 ккал
                """.trimIndent()

            }

            "Ореховая нежность" -> {

                recipeDetails.text = """ 
                    
                    Рецепт: "Ореховая нежность"
                    Ингредиенты (на 8 порций):
                    Нежирный творог (5%) – 400 г
                    Йогурт без сахара (2%) – 200 г
                    Желатин – 10 г
                    Подсластитель – по вкусу
                    Какао-порошок (без сахара) – 15 г
                    Вишня свежая или замороженная (без косточек) – 150 г
                    Овсяные хлопья – 100 г
                    Миндальное молоко – 50 мл
                    Чёрный шоколад (с содержанием какао 85%) – 30 г

                    Приготовление:
                    1. Основа:
                    Измельчите овсяные хлопья в крошку, добавьте миндальное молоко, тщательно перемешайте. Утрамбуйте смесь на дно формы и уберите в холодильник на 20 минут.

                    2. Кремовая часть:

                    Взбейте творог, йогурт и подсластитель до однородной массы. Растворите желатин в 50 мл воды, дайте ему набухнуть, затем нагрейте (не кипятить) и добавьте в творожную массу. Перемешайте.

                    3. Слои:

                    Разделите массу на 2 части: в одну добавьте какао, в другую оставьте белой. На основу вылейте сначала белую часть, затем шоколадную. Выложите вишни и кусочки шоколада слоями.

                    4. Украшение:

                    Поставьте в холодильник на 3-4 часа до полного застывания. Перед подачей украсьте вишней и каплей йогурта.

                    Питательная ценность на 1 порцию:
                    Белки: 10 г
                    Жиры: 4 г
                    Углеводы: 16 г
                    Калорийность: 120 ккал

                    Процентное соотношение БЖУ:
                    Белки: 33%
                    Жиры: 12%
                    Углеводы: 55%
                """.trimIndent()

            }

            "Клубничный парфе" -> {

                recipeDetails.text = """ 
                    
                    Рецепт "Клубничный парфе" (низкокалорийный вариант)
                    Ингредиенты (на 2 порции):
                    100 г обезжиренного греческого йогурта (0% жирности)
                    50 г овсяных хлопьев
                    100 мл миндального молока (несладкого)
                    1 ст. л. меда (или подсластителя)
                    100 г свежей клубники (нарезанной кусочками)
                    Щепотка ванили (по желанию)

                    Приготовление:
                    1. Подготовка овсянки:

                    Смешайте овсяные хлопья с миндальным молоком в небольшой миске. Оставьте на 10 минут для размягчения.

                    2. Приготовление слоев:

                    В прозрачный стакан или баночку выложите слой размягченной овсянки.
                    Добавьте слой йогурта, затем слой нарезанной клубники.
                    Повторите слои, чередуя овсянку, йогурт и клубнику, пока не заполните баночку.

                    3. Украшение:

                    Завершите парфе слоем клубники. По желанию добавьте щепотку ванили или немного меда для сладости.

                    4. Охлаждение:

                    Поставьте в холодильник на 15-20 минут для охлаждения перед подачей.

                    Питательная ценность (на 1 порцию):
                    Калории: 150 ккал
                    Белки: 8 г (21%)
                    Жиры: 3 г (18%)
                    Углеводы: 25 г (61%)
                """.trimIndent()

            }

            "Клубничная нежность" -> {

                recipeDetails.text = """ 
                    
                    Рецепт "Клубничная нежность" (низкокалорийный вариант)
                    Ингредиенты (на 4 порции):
                    200 г обезжиренного творога (0%)
                    150 г греческого йогурта (0% жирности)
                    2 ст. л. меда (или подсластителя)
                    1 ч. л. ванильного экстракта
                    50 г клубники (для украшения)
                    Щепотка сушеной малины (для декора, опционально)

                    Приготовление 
                    1. Подготовка крема:

                    В глубокой миске смешайте творог, йогурт, мед и ванильный экстракт.
                    Взбейте смесь блендером до получения кремообразной и однородной консистенции.

                    2. Сборка:

                    Разлейте приготовленный крем по небольшим мискам или стаканам.

                    3. Украшение:

                    Украсьте каждую порцию свежей клубникой.
                    По желанию посыпьте десерт сушеной малиной для яркого акцента.

                    4. Охлаждение:

                    Поставьте готовый десерт в холодильник на 15-20 минут перед подачей, чтобы он стал более освежающим.

                    Питательная ценность (на 1 порцию):
                    Калории: 90 ккал
                    Белки: 8 г (36%)
                    Жиры: 1 г (10%)
                    Углеводы: 11 г (54%)
                """.trimIndent()

            }

            "Цитрусовый Взрыв" -> {

                recipeDetails.text = """ 
                    
                    Рецепт: "Цитрусовый Взрыв"
                    Ингредиенты:
                    Апельсин — 1 штука
                    Лимон — 1/2 штуки (сок)
                    Минеральная вода (без газа) — 150 мл
                    Мед или стевия — 1 ч.л. (по желанию)
                    Лед — по желанию
                    Ломтик лимона для украшения

                    Приготовление:
                    1. Подготовка ингредиентов:

                    Апельсин: очистите его от кожуры и уберите косточки, если они есть. Нарежьте дольки, чтобы блендеру было проще справляться Лимон: разрежьте пополам и выжмите сок из одной половины.

                    2. Смешивание:

                    В чашу блендера добавьте апельсиновые дольки и лимонный сок.
                    Если хотите более сладкий вкус, добавьте 1 ч.л. меда или немного стевии.
                    Взбейте ингредиенты на средней скорости до получения однородной массы.

                    3. Добавление воды:

                    Влейте 150 мл минеральной воды и аккуратно перемешайте напиток.

                    4. Подача:

                    Перелейте напиток в стакан.
                    Добавьте лед, если хотите более освежающий эффект.
                    Украсьте стакан ломтиком лимона, закрепив его на краю стакана.

                    БЖУ и калорийность:
                    Белки: 1 г (3%)
                    Жиры: 0.2 г (1%)
                    Углеводы: 9 г (96%)
                    Калорийность: 45 ккал на порцию.
                """.trimIndent()

            }

            "Черничная Сладость" -> {

                recipeDetails.text = """ 
                    
                    Рецепт: "Черничная Слабость"
                    Ингредиенты:
                    Черника (свежая или замороженная) — 100 г
                    Клубника — 50 г
                    Обезжиренное молоко — 150 мл
                    Греческий йогурт (0–2%) — 50 мл
                    Мед или стевия — 1 ч.л. (по желанию)
                    Клубника для украшения

                    Приготовление:
                    1. Подготовка ингредиентов:

                    Черника: промойте свежую ягоду под проточной водой или дайте замороженной слегка разморозиться.
                    Клубника: удалите зеленые хвостики, промойте и нарежьте крупные ягоды пополам.

                    2. Смешивание:

                    Поместите в блендер чернику, клубнику, молоко и йогурт.
                    Если хотите, чтобы напиток был чуть слаще, добавьте 1 ч.л. меда или немного стевии.
                    Взбейте смесь на высокой скорости до получения однородной и гладкой консистенции.

                    3. Подача:

                    Перелейте напиток в высокий стакан.
                    Украсьте стакан ломтиком клубники, прикрепив его к краю, и подавайте с трубочкой.

                    БЖУ и калорийность:
                    Белки: 6 г (15%)
                    Жиры: 1.2 г (5%)
                    Углеводы: 15 г (80%)
                    Калорийность: 90 ккал на порцию.
                """.trimIndent()

            }

            "Клубничный Шлейф" -> {

                recipeDetails.text = """ 
                    
                    Рецепт: "Клубничный Шлейф"
                    Ингредиенты:
                    Клубника — 150 г
                    Минеральная вода (с газом или без) — 200 мл
                    Лимонный сок — 1 ч.л.
                    Мед или стевия — 1 ч.л. (по желанию)
                    Лед — по желанию
                    Клубника и листик мяты для украшения

                    Приготовление:
                    1. Подготовка ингредиентов:

                    Клубнику промойте под проточной водой. Удалите зеленые хвостики и, если ягоды крупные, разрежьте их пополам.
                    Если используете мед, убедитесь, что он жидкий, чтобы легко смешался с остальными ингредиентами.

                    2. Смешивание:

                    Поместите клубнику в блендер и взбейте до состояния пюре. Если блендера нет, можно размять клубнику вилкой или толкушкой.
                    Добавьте 1 ч.л. лимонного сока и мед/стевию. Тщательно перемешайте, чтобы смесь стала однородной.

                    3. Добавление воды:

                    Влейте минеральную воду (200 мл) в смесь клубничного пюре и аккуратно перемешайте.
                    Попробуйте напиток на вкус. Если хочется более выраженной сладости, добавьте еще немного меда или стевии.

                    4. Подача:

                    Перелейте напиток в высокий стакан.
                    Добавьте кубики льда для охлаждения.
                    Украсьте стакан ломтиком клубники, прикрепив его к краю стакана, и добавьте листик мяты сверху.

                    БЖУ и калорийность:
                    Белки: 1 г (3%)
                    Жиры: 0.1 г (1%)
                    Углеводы: 8 г (96%)
                    Калорийность: 35 ккал на порцию.
                """.trimIndent()

            }

            "Ягодный Взрыв" -> {

                recipeDetails.text = """ 
                    
                    Рецепт: "Ягодный Взрыв"
                    Ингредиенты:
                    Клубника — 100 г
                    Черника — 50 г
                    Минеральная вода (без газа) — 200 мл
                    Лимонный сок — 1 ч.л.
                    Мед или стевия — 1 ч.л. (по желанию)
                    Листочки мяты — для украшения

                    Приготовление:
                    1. Подготовка ингредиентов:

                    Клубника: тщательно промойте и удалите зеленые хвостики. Если ягоды крупные, разрежьте их на половинки.
                    Черника: промойте под проточной водой.
                    Лимонный сок: выжмите сок из свежего лимона (1 ч.л. хватит для легкой кислинки).

                    2. Смешивание:

                    Поместите клубнику и чернику в блендер.
                    Добавьте лимонный сок и 1 ч.л. меда или немного стевии, если хотите сделать напиток сладким.
                    Залейте ингредиенты минералкой (200 мл) и взбивайте на средней скорости до получения однородной консистенции.

                    3. Подача:

                    Перелейте напиток в высокий стакан.
                    Украсьте напиток клубникой, прикрепив ее к краю стакана, добавьте несколько черничек и листик мяты.

                    БЖУ и калорийность:
                    Белки: 1 г (4%)
                    Жиры: 0.2 г (1%)
                    Углеводы: 8 г (95%)
                    Калорийность: 40 ккал на порцию.
                """.trimIndent()

            }

            "Лимонный Детокс" -> {

                recipeDetails.text = """ 
                    
                    Рецепт: "Лимонный Детокс"
                    Ингредиенты:
                    Лимон — 1 кружок для украшения, сок 1/2 лимона
                    Огурец — 1/2 среднего (около 100 г)
                    Листья мяты — 5–6 штук
                    Киви — 1 штука (около 80 г)
                    Вода (охлажденная) — 200 мл
                    Лед — по желанию

                    Приготовление:
                    1. Подготовка ингредиентов:

                    Киви: Очистите его от кожуры и нарежьте на небольшие кусочки. Это придаст напитку легкую сладость и экзотический вкус.
                    Огурец: Хорошо промойте и нарежьте тонкими кружочками. Если кожура огурца мягкая, ее можно не снимать.
                    Лимон: Разрежьте пополам, выжмите сок из одной половины, а другую часть нарежьте кружочком для украшения.
                    Листья мяты: Промойте их под проточной водой.

                    2. Смешивание:

                    Сложите в чашу блендера киви, огурец и листья мяты.
                    Добавьте выжатый лимонный сок и 200 мл охлажденной воды.
                    Включите блендер на средней скорости и взбивайте 1–2 минуты, пока смесь не станет однородной.

                    3. Подача:

                    Перелейте напиток в высокий стакан.
                    Добавьте кубики льда, если хотите, чтобы напиток был освежающим.
                    Украсьте кружком лимона, закрепив его на краю стакана, и добавьте несколько листиков мяты сверху.

                    БЖУ и калорийность:
                    Белки: 1 г (5%)
                    Жиры: 0.2 г (1%)
                    Углеводы: 6 г (94%)
                    Калорийность: 30 ккал на порцию.
                """.trimIndent()

            }

            "Клубничный Вздох" -> {

                recipeDetails.text = """ 
                    
                    Рецепт: "Клубничный Вздох"
                    Ингредиенты:
                    Клубника (свежая или замороженная) — 150 г
                    Обезжиренное молоко — 100 мл
                    Обезжиренный греческий йогурт — 50 мл
                    Мед или стевия — 1 ч.л. (по желанию)
                    Листочек мяты для украшения

                    Приготовление:
                    1. Подготовка ингредиентов:

                    Если используете свежую клубнику, тщательно промойте ее под холодной водой и удалите зеленые хвостики. 
                    Если клубника замороженная, дайте ей слегка разморозиться, чтобы она легче измельчалась.
                    Отмерьте 100 мл обезжиренного молока и 50 мл обезжиренного греческого йогурта.

                    2. Добавление в блендер:

                    Поместите клубнику в чашу блендера.
                    Залейте ее молоком и добавьте йогурт.
                    Если хотите более сладкий вкус, добавьте 1 ч.л. меда или немного стевии.

                    3. Взбивание:

                    Закройте крышку блендера и включите его на высокой скорости.
                    Взбивайте 1–2 минуты, пока смесь не станет полностью гладкой и кремообразной. Если есть мелкие кусочки, продолжайте взбивать.

                    4. Подача:

                    Перелейте напиток в высокий стакан.
                    Украсьте половинкой клубники, прикрепив ее к краю стакана, и добавьте листик мяты для свежего аромата.

                    БЖУ и калорийность:
                    Белки: 6 г (12%)
                    Жиры: 1 г (5%)
                    Углеводы: 15 г (83%)
                    Калорийность: 90 ккал на порцию.
                """.trimIndent()

            }

            "Зеленый Фреш" -> {

                recipeDetails.text = """ 
                    
                    Рецепт: "Зелёный Фреш"
                    Ингредиенты:
                    Киви — 1 штука (около 80 г)
                    Огурец — 1/2 среднего (около 100 г)
                    Листья шпината — 1 горсть (около 30 г)
                    Лайм — 1/2 штуки (сок)
                    Вода — 100 мл
                    Стевия или мед — 1/2 ч.л. (по желанию)
                    Листья мяты — для украшения

                    Приготовление:
                    1. Подготовка ингредиентов:

                    Очистите киви, чтобы не осталось волосков от кожуры. Нарежьте его на 4–6 частей, чтобы блендеру было проще измельчить.
                    Огурец можно использовать с кожурой, если она мягкая. Нарежьте его кольцами или кубиками.
                    Листья шпината промойте под проточной водой и обсушите, чтобы убрать лишнюю влагу.

                    2. Смешивание:

                    Поместите в чашу блендера нарезанный киви, огурец и листья шпината.
                    Добавьте сок половины лайма для свежести и воду. Если хотите немного сладости, добавьте 1/2 ч.л. меда или стевии.
                    Закройте крышку блендера и включите его на средней или высокой скорости. Взбивайте до получения полностью однородной консистенции (1–2 минуты).  

                    3. Подача:

                    Перелейте напиток в высокий стакан.
                    Украсьте листиками мяты или ломтиком киви для эстетичности.
                    Напиток можно подавать сразу, добавив несколько кубиков льда, если хочется освежающего эффекта.

                    БЖУ и калорийность:
                    Белки: 2 г (10%)
                    Жиры: 0.3 г (2%)
                    Углеводы: 8 г (88%)
                    Калорийность: 50 ккал на порцию
                """.trimIndent()

            }

            "Манго Лайт" -> {

                recipeDetails.text = """ 
                    
                    Рецепт: "Манго Лайт"
                    Ингредиенты:
                    Замороженное или свежее манго — 100 г
                    Апельсиновый сок (свежевыжатый или без сахара) — 150 мл
                    Обезжиренный йогурт — 50 мл
                    Листья мяты — для украшения
                    Мед или стевия — 1 ч.л. (по желанию)

                    Приготовление:
                    1. Подготовка ингредиентов:

                    Если используете свежее манго, очистите его от кожуры и нарежьте мякоть на небольшие кубики (около 100 г). Если манго замороженное, дайте ему слегка разморозиться (3–5 минут при комнатной температуре), чтобы блендеру было легче справиться.
                    Выжмите апельсиновый сок (150 мл), если используете свежие апельсины. Это примерно 1,5 среднего апельсина. Если нет возможности выжать сок, возьмите покупной сок без добавления сахара.
                    Отмерьте 50 мл обезжиренного йогурта — он добавит кремообразности и легкой кислинки.

                    2. Добавление в блендер:

                    Поместите нарезанное манго в чашу блендера.
                    Залейте манго апельсиновым соком и добавьте 50 мл обезжиренного йогурта.
                    Если хотите сделать напиток немного сладче, добавьте 1 ч.л. меда или щепотку стевии. Это по желанию — манго и так достаточно сладкий фрукт.

                    3. Взбивание:

                    Закройте блендер крышкой, чтобы избежать разбрызгивания.
                    Включите блендер на средней или высокой скорости. Взбивайте 1–2 минуты, пока масса не станет полностью однородной и гладкой. Если заметите кусочки манго, продолжайте взбивать еще 20–30 секунд.

                    4. Подача:

                    Перелейте готовый напиток в красивый стакан.
                    Для украшения добавьте несколько свежих листиков мяты — они придадут аромата и свежести.
                    При желании можно положить сверху кусочек манго или ягоду, например, клубнику, чтобы напиток выглядел эффектно.
                    Если хотите, чтобы напиток был охлажденным, добавьте несколько кубиков льда перед подачей.

                    БЖУ и калорийность:
                    Белки: 2 г (4%)
                    Жиры: 0.5 г (1%)
                    Углеводы: 20 г (95%)
                    Калорийность: 95 ккал на порцию
                """.trimIndent()

            }

            "Ягодный Лайт" -> {

                recipeDetails.text = """ 
                    
                    Рецепт: "Ягодный Лайт" 
                    Ингредиенты:
                    Замороженная клубника — 100 г
                    Замороженная малина — 50 г
                    Обезжиренный греческий йогурт (2% жирности) — 150 мл
                    Миндальное молоко (несладкое) — 100 мл
                    Мед (или заменитель, например, стевия) — 1 ч.л. (по желанию)

                    Приготовление:
                    1. Подготовка ингредиентов:

                    Возьмите замороженную клубнику и малину. Если ягоды слишком твердые, дайте им немного разморозиться (3–5 минут при комнатной температуре).
                    Отмерьте 150 мл обезжиренного греческого йогурта и 100 мл несладкого миндального молока.
                    При желании добавьте 1 ч.л. меда или стевии для сладости.

                    2. Смешивание ингредиентов:

                    Поместите клубнику и малину в чашу блендера.
                    Залейте ягоды греческим йогуртом и миндальным молоком.
                    Если вы хотите, чтобы напиток был более густым, уменьшите количество миндального молока. Для более жидкой текстуры, наоборот, добавьте чуть больше молока.

                    3. Взбивание:

                    Закройте крышку блендера плотно.
                    Включите блендер на средней или высокой скорости. Взбивайте 1–2 минуты, пока смесь не станет полностью однородной и кремообразной. Если вы видите кусочки ягод, продолжайте взбивать.

                    4. Подача:

                    Перелейте готовый напиток в стакан или банку.
                    При желании добавьте несколько кубиков льда, чтобы напиток стал освежающим.
                    Можно украсить напиток целой ягодой клубники или веточкой мяты сверху для красивой подачи.

                    БЖУ и калорийность:
                    Белки: 6 г (15%)
                    Жиры: 3 г (10%)
                    Углеводы: 16 г (75%)
                    Калорийность: 120 ккал
                """.trimIndent()

            }

            "Ягодная Свежесть" -> {

                recipeDetails.text = """ 
                    
                    Рецепт: "Ягодная Свежесть"
                    Ингредиенты:
                    Смесь ягод (малина, черника, клубника) — 100 г
                    Обезжиренный кефир или йогурт — 150 мл
                    Листья мяты — 3–4 штуки (плюс для украшения)
                    Мед или стевия — 1 ч.л. (по желанию)
                    Вода — 50 мл (для регулировки густоты)
                    Лед — по желанию

                    Приготовление:
                    1. Подготовка ингредиентов:

                    Смесь ягод: если ягоды свежие, промойте их под проточной водой и обсушите. Замороженные ягоды можно оставить размораживаться на 3–5 минут.
                    Кефир или йогурт: используйте обезжиренный продукт, чтобы снизить калорийность.
                    Мята: выберите свежие листья, промойте их и отложите несколько для украшения.

                    2. Смешивание:

                    Сложите в блендер ягоды, обезжиренный кефир (или йогурт), несколько листиков мяты.
                    Если хотите сладости, добавьте 1 ч.л. меда или щепотку стевии.
                    Взбивайте 1–2 минуты до получения однородной массы. При необходимости добавьте немного воды, чтобы сделать напиток более жидким.

                    3. Подача:

                    Перелейте смузи в стакан.
                    Украсьте напиток листиком мяты для аромата и свежести.
                    Если хотите охлаждающий эффект, добавьте кубики льда.

                    БЖУ и калорийность:
                    Белки: 5 г (15%)
                    Жиры: 0.5 г (2%)
                    Углеводы: 12 г (83%)
                    Калорийность: 70 ккал на порцию
                """.trimIndent()
            }

        }





    }

}