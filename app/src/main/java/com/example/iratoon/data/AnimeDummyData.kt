package com.example.iratoon.data

import com.example.iratoon.R
import com.example.iratoon.model.AnimeDetail
import com.example.iratoon.model.AnimePopular
import com.example.iratoon.model.AnimeTerbaru

object AnimeDummyData {
    val AnimeDetail = listOf(
        AnimeDetail(
            title = "One Peace",
            image = R.drawable.onepeace,
            episode = "Episode 5",
            genre = "Action, Adventure, Fantasy",
            sinopsis = "Monkey D. Luffy ingin menjadi Raja Bajak Laut. Ia tidak peduli aturan dunia, hanya kebebasan yang ia kejar. Luffy berlayar ke lautan luas untuk mencari harta karun legendaris bernama One Piece. Dalam perjalanannya, ia mengumpulkan kru yang kuat dan setia. Bersama Bajak Laut Topi Jerami, Luffy menantang musuh-musuh terkuat dan mengguncang dunia.",
            rating = "8.55"
        ),
        AnimeDetail(
            title = "Boruto: Naruto",
            image = R.drawable.boruto,
            episode = "Episode 5",
            genre = "Action, Adventure, Fantasy",
            sinopsis = "Boruto Uzumaki adalah anak dari Naruto Uzumaki, Hokage Ketujuh Desa Konoha. Ia tidak ingin hidup di bawah bayang-bayang ayahnya dan memilih jalan ninja versinya sendiri. Boruto berlatih dan bertarung untuk membuktikan kemampuannya. Bersama teman-temannya, ia menghadapi ancaman baru yang muncul di dunia ninja. Perlahan, Boruto membangun takdirnya sendiri dan melindungi masa depan desa.",
            rating = "8.55"
        ),
        AnimeDetail(
            title = "Oshi No Ko",
            image = R.drawable.oshi_no_ko,
            episode = "Episode 5",
            genre = "Drama, Psychological, Mystery",
            sinopsis = "Oshi no Ko menceritakan tentang dunia hiburan Jepang yang penuh gemerlap namun menyimpan sisi gelap. Cerita berfokus pada Aqua dan Ruby, dua anak yang terlahir kembali sebagai anak dari idol terkenal. Mereka tumbuh di tengah industri hiburan yang keras dan penuh tekanan. Di balik popularitas dan ketenaran, tersimpan rahasia, kebohongan, dan ambisi. Kisah ini mengungkap perjuangan, pengorbanan, serta luka yang tersembunyi di balik panggung hiburan.",
            rating = "8.55"
        )
    )

    val animePopular = listOf(
        AnimePopular(
            titlePopular = "One Peace",
            imgPopular = R.drawable.onepeace
        ),
        AnimePopular(
            titlePopular = "Boruto : Naruto",
            imgPopular = R.drawable.boruto
        ),
        AnimePopular(
            titlePopular = "Oshi No Ko",
            imgPopular = R.drawable.oshi_no_ko
        ),
    )

    val animeTerbaru = listOf(
        AnimeTerbaru(
            titleTerbaru = "Slime Taoshite 300-nen Season 2",
            imgTerbaru = R.drawable.slime,
            ratingTerbaru = "8.55",
            episodeTerbaru = "Episode 2"
        ),
        AnimeTerbaru(
            titleTerbaru = "Shin Samurai-den Yaiba",
            imgTerbaru = R.drawable.yaiba,
            ratingTerbaru = "8.55",
            episodeTerbaru = "Episode 2"
        ),
        AnimeTerbaru(
            titleTerbaru = "Nazotoki wa Dinner no Ato de",
            imgTerbaru = R.drawable.nozotoki,
            ratingTerbaru = "8.55",
            episodeTerbaru = "Episode 2"
        ),
        AnimeTerbaru(
            titleTerbaru = "Teogonia",
            imgTerbaru = R.drawable.teogonia,
            ratingTerbaru = "8.55",
            episodeTerbaru = "Episode 2"
        ),
        AnimeTerbaru(
            titleTerbaru = "Enen no Shouboutai S3",
            imgTerbaru = R.drawable.enen_no_shouboutai,
            ratingTerbaru = "8.55",
            episodeTerbaru = "Episode 2"
        ),
        AnimeTerbaru(
            titleTerbaru = "Bye Bye, Earth Season 2",
            imgTerbaru = R.drawable.bye_bye_earth,
            ratingTerbaru = "8.55",
            episodeTerbaru = "Episode 2"
        ),
        AnimeTerbaru(
            titleTerbaru = "Ameku M.D.: Doctor Detective",
            imgTerbaru = R.drawable.ameku,
            ratingTerbaru = "8.55",
            episodeTerbaru = "Episode 2"
        ),
        AnimeTerbaru(
            titleTerbaru = "Blue Exorcist : Beyond The Snow Saga",
            imgTerbaru = R.drawable.blueexorsist,
            ratingTerbaru = "8.55",
            episodeTerbaru = "Episode 2"
        ),
        AnimeTerbaru(
            titleTerbaru = "Demonslayer Season 2",
            imgTerbaru = R.drawable.demonslayer,
            ratingTerbaru = "8.55",
            episodeTerbaru = "Episode 2"
        ),
    )
}