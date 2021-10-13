package com.example.mylist

import com.example.mylist.models.Live

class DataSource {
    companion object{
        fun createDataSet():ArrayList<Live>{
            val list = ArrayList<Live>()
            list.add(
                Live(
                    "SOU EU NA VIDA 271 QUANDO FALAM Q VÃO DAR EM CIMA DO MEU NAMORADO VIDEOS ENGRAÇADOS - TENTE NÃO RIR",
                    "Douglas Damasceno",
                    "https://img.youtube.com/vi/vxMOqWSZbQo/maxresdefault.jpg",
                    "https://www.youtube.com/watch?v=vxMOqWSZbQo",
                )
            )
            list.add(
                Live(
                    "SOU EU NA VIDA 281 COMO SÃO AS MENINAS DAS ESCOLAS MEME - OS MELHORES MEMES DO DOUGCENA MEMES",
                    "Douglas Damasceno",
                    "https://img.youtube.com/vi/v8fXG4NoflY/maxresdefault.jpg",
                    "https://www.youtube.com/watch?v=v8fXG4NoflY",
                )
            )
            return list
        }
    }
}