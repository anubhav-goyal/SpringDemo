import com.springSecurity.*
class BootStrap {

    def init = { servletContext ->

        Role roleUser=new Role(authority:"ROLE_USER").save()
        Role roleAdmin= new Role(authority:"ROLE_ADMIN").save()

        User userAdmin=new User(username: "admin",password: "123456")
        userAdmin.save()
        User user=new User(username: "user",password: "123456")
        user.save()


        UserRole.create(userAdmin,roleAdmin)
        UserRole.create(userAdmin,roleUser)
        UserRole.create(user,roleUser)
    }
    def destroy = {
    }
}
