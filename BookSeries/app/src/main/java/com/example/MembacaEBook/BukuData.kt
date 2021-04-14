package com.example.MembacaEBook

object BukuData {
 val list: ArrayList<Book>
    get(){
        val list: ArrayList<Book> = arrayListOf()

        list.add(Book(
                nama = "Nol",
                petikan = "Bukankah salah satu hal penting dalam hidup ini adalah proses belajar?",
                url = "https://medium.com/@dynurhutami/nol-semua-pengetahuan-berawal-dari-ketidaktahuan-21ab994aacb2",
                gambar = R.drawable.nol
        ))

        list.add(Book(
                nama = "Temu",
                petikan = "Kita telah melewati berbagai peran yang diberikan oleh Tuhan pada skenario terbaiknya. Pernah melewati luka, melewati rindu yang perihnya minta ampun. Entah bagaimana bisa, hanya kamu yang tetap menjadi sosok penyusun definisi bahagia untukku",
                url = "https://mizanstore.com/temu_64469#tab-2",
                gambar = R.drawable.temu
        ))

        list.add(Book(
                nama = "Hujan",
                petikan = "Kesibukan  adalah  cara terbaik melupakan banyak hal, membuat waktu melesat tanpa terasa",
                url = "https://aisaidluv.com/2018/06/06/novel-hujan-by-tere-liye/",
                gambar = R.drawable.hujan
        ))

        list.add(Book(
                nama = "Hidup",
                petikan = "Tuhan tak pernah salah merencanakan apa pun. Selalu ada kebaikan di sana, meski terkadang harus ada luka dan air mata.",
                url = "https://mizanstore.com/hidup_64827#tab-2",
                gambar = R.drawable.hidup
        ))

        list.add(Book(
                nama = "Titik Nol",
                petikan = "Agustinus telah menarik cakrawala yang jauh pada penulisan perjalanan (travel writing) di Indonesia. Penulisan yang dalam, pengalaman yang luar biasa, membuat tulisan ini seperti buku kehidupan. Titik Nol merupakan cara bertutur yang benar-benar baru dalam travel writing di negeri ini.",
                url = "https://www.goodreads.com/book/show/17253247-titik-nol",
                gambar = R.drawable.titiknol
        ))

        list.add(Book(
                nama = "Bintang",
                petikan = "Ini ternyata bukan akhir petualangan, ini justru awal dari semuanya…",
                url = "https://www.goodreads.com/book/show/35278713-bintang",
                gambar = R.drawable.bintang
        ))

        list.add(Book(
                nama = "Nebulaaaa",
                petikan = "Tapi ada satuaa hal yang berbeda darimu, dan semoga itu membuat jalan hidupmu juga berbeda. Kamu memiliki teman. Teman-teman terbaik. Ah, di dunia ini, teman sejati adalah harta karun terbaik.",
                url = "https://www.gramedia.com/blog/sinopsis-novel-nebula-tere-liye/#gref",
                gambar = R.drawable.nebula

        ))

        return list
    }
}