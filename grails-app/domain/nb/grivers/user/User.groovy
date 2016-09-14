package nb.grivers.user

class User {

    static constraints = {
        username(blank: false, minSize: 3, maxNize: 20)
        name(blank: false, maxSize: 30)
        email(blank: false, email: true)
    }

    String username
    String name
    String email
}
