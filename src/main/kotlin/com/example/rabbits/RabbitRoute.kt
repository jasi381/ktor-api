package com.example.rabbits

import com.example.data.Rabbit
import io.ktor.http.*
import io.ktor.server.response.*
import io.ktor.server.routing.*


private const val BASE_URL ="http://192.168.29.137:8101"

private val rabbits = listOf(
    Rabbit(
        name = "American Fuzzy",
        description = "The American Fuzzy is a small, compact rabbit known for its soft wool-like fur. Popular for its gentle temperament, it’s often a favorite for both pet owners and fiber enthusiasts due to its cuddly appearance and friendly nature.",
        imgUrl = "$BASE_URL/rabbits/americanFuzzy.jpeg"
    ),
    Rabbit(
        name = "Cotton Tail",
        description = "The Cottontail rabbit is a wild species native to North America, easily recognizable by its fluffy white tail. Known for its agility and alertness, the Cottontail is often spotted in forests and meadows, quickly darting away when approached.",
        imgUrl = "$BASE_URL/rabbits/cottonTail.jpeg"
    ),
    Rabbit(
        name = "European Fuzzy",
        description = "The European Fuzzy rabbit is a variation of the angora breed, characterized by its dense, woolly fur. Highly prized in Europe for its soft wool, this rabbit is a calm and easy-going pet, requiring regular grooming to maintain its luxurious coat.",
        imgUrl = "$BASE_URL/rabbits/europeanFuzzy.jpeg"
    ),
    Rabbit(
        name = "Flemish Giant",
        description = "The Flemish Giant is one of the largest rabbit breeds, often weighing over 15 pounds. Despite its imposing size, it’s known for being a gentle giant, friendly and social, making it a popular choice among rabbit enthusiasts for companionship.",
        imgUrl = "$BASE_URL/rabbits/flemishGiant.jpeg"
    ),
    Rabbit(
        name = "Holland Lop",
        description = "The Holland Lop is a small, compact breed with floppy ears that give it a distinctive and adorable look. Known for its playful and affectionate demeanor, it’s one of the most popular rabbit breeds worldwide, especially as a family pet.",
        imgUrl = "$BASE_URL/rabbits/hollandLop.jpeg"
    ),
    Rabbit(
        name = "Mini Lop",
        description = "The Mini Lop is a dwarf breed with a stocky build and long, floppy ears. Its curious and social personality makes it an ideal pet for rabbit lovers, as it enjoys interacting with humans and hopping around playfully.",
        imgUrl = "$BASE_URL/rabbits/miniLop.jpeg"
    ),
    Rabbit(
        name = "Lionhead Rabbit",
        description = "The Lionhead rabbit is a small breed known for its distinctive mane of long fur around its head, resembling a lion. Playful and friendly, Lionheads are popular pets and require regular grooming to prevent their fur from matting.",
        imgUrl = "https://placehold.co/600x400/808080/FFF"
    ),
    Rabbit(
        name = "Netherland Dwarf",
        description = "The Netherland Dwarf is one of the smallest rabbit breeds, weighing less than 2.5 pounds. Despite its tiny size, this breed is known for its bold and energetic personality, making it a charming and curious companion.",
        imgUrl = "https://placehold.co/600x400/808080/FFF"
    ),
    Rabbit(
        name = "English Angora",
        description = "The English Angora rabbit is known for its long, silky fur, which is often harvested for spinning into wool. These rabbits require frequent grooming, but their calm and gentle nature makes them ideal pets for those willing to care for their luxurious coats.",
        imgUrl = "https://placehold.co/600x400/808080/FFF"
    ),
    Rabbit(
        name = "Rex Rabbit",
        description = "The Rex rabbit is famous for its short, velvety fur, which is incredibly soft to the touch. Known for being calm and friendly, Rex rabbits are a popular choice among pet owners and also admired for their unique fur texture.",
        imgUrl = "https://placehold.co/600x400/808080/FFF"
    ),
    Rabbit(
        name = "French Lop",
        description = "The French Lop is a large, laid-back rabbit breed with lop ears that give it a charming appearance. Despite their size, they are known for their calm and affectionate temperament, making them a great choice for families.",
        imgUrl = "https://placehold.co/600x400/808080/FFF"
    ),
    Rabbit(
        name = "Silver Marten",
        description = "The Silver Marten rabbit has a striking appearance with its black fur and silver-tipped guard hairs. Known for being active and intelligent, these rabbits enjoy interaction and playtime, making them great companions for rabbit enthusiasts.",
        imgUrl = "https://placehold.co/600x400/808080/FFF"
    ),
    Rabbit(
        name = "Harlequin Rabbit",
        description = "The Harlequin rabbit is easily recognizable by its unique, striking coloration patterns. Known for its playful and friendly personality, the Harlequin enjoys attention and is a great choice for families looking for an interactive pet.",
        imgUrl = "https://placehold.co/600x400/808080/FFF"
    ),
    Rabbit(
        name = "Californian Rabbit",
        description = "The Californian rabbit is a medium-sized breed with distinctive markings: a white body with dark ears, nose, and feet. Calm and friendly, this breed is often used in showing and makes a great pet for families.",
        imgUrl = "https://placehold.co/600x400/808080/FFF"
    )
)




fun Route.randomRabbit(){
    get("/randomrabbit"){
//        //for getting a query param
//        call.parameters["rabbitId"]

        call.respond(
            HttpStatusCode.OK,
            rabbits.random()
        )


    }
}
fun Route.getAllRabbits() {
    get("/rabbits") {
        call.respond(
            HttpStatusCode.OK,
            rabbits
        )
    }
}
