package oop_113652_GeraldFedorian.week08.LatihanTerbimbing

class NotificationService {
    fun sendEmail(emailAddress: String) {
        println("Mengirim email ke: $emailAddress")
    }

    fun processUser(user: UserProfile){
        if (user.email != null){
            sendEmail(user.email)
        } else{
            println("User ${user.name} tidak memiliki email")
        }
    }
}