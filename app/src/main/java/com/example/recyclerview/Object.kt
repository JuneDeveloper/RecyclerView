package com.example.recyclerview

import java.io.Serializable

class Object(val image:Int,val name:String,val description:String):Serializable {

    companion object {
        val cloth = mutableListOf(
            Object(R.drawable.nike_black_p,"Пуховик Nike(Черный)","Качественный пуховик для зимы"),
            Object(R.drawable.nike_blue_p,"Пуховик Nike(Синий)","Качественный пуховик для зимы"),
            Object(R.drawable.nike_green_p,"Пуховик Nike(Зеленый)","Качественный пуховик для зимы"),
            Object(R.drawable.nike_yellow_p,"Пуховик Nike(Желтый)","Качественный пуховик для зимы"),
            Object(R.drawable.nike_white_p,"Пуховик Nike(Белый)","Качественный пуховик для зимы"),
            Object(R.drawable.nike_white,"Футболка Nike(Белый)","Синтетическая футболка для бега"),
            Object(R.drawable.nike_yellow,"Футболка Nike(Желтый)","Синтетическая футболка для бега"),
            Object(R.drawable.nike_blue,"Футболка Nike(Синий)","Синтетическая футболка для бега"),
            Object(R.drawable.nike_black,"Футболка Nike(Черный)","Синтетическая футболка для бега"),
            Object(R.drawable.nike_red,"Футболка Nike(Красный)","Синтетическая футболка для бега"),
            Object(R.drawable.asics_black,"Шорты Asics(Черный)","Синтетические шорты для бега"),
            Object(R.drawable.asics_red,"Шорты Asics(Красный)","Синтетические шорты для бега"),
            Object(R.drawable.asics_blue,"Шорты Asics(Синий)","Синтетические шорты для бега"),
            Object(R.drawable.asics_white,"Шорты Asics(Белый)","Синтетические шорты для бега"),
            Object(R.drawable.asics_yellow,"Шорты Asics(Желтый)","Синтетические шорты для бега"),
            Object(R.drawable.columbia_grew,"Ботинки спортивные Columbia(Серые)","Демисезон + Зима(до-10гр.)"),
            Object(R.drawable.columbia_some,"Ботинки спортивные Columbia(Непонятно)","Демисезон + Зима(до-10гр.)"),
            Object(R.drawable.columbia_black,"Ботинки спортивные Columbia(Черный)","Демисезон + Зима(до-10гр.)"),
            Object(R.drawable.columbia_white,"Ботинки спортивные Columbia(Белый)","Демисезон + Зима(до-10гр.)"),
            Object(R.drawable.columbia_orange,"Ботинки спортивные Columbia(Оранжевый)","Демисезон + Зима(до-10гр.)")
        )
    }
}