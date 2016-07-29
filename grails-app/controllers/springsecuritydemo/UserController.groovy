package springsecuritydemo

import com.springSecurity.User
import grails.plugin.springsecurity.annotation.Secured


@Secured(["ROLE_USER","ROLE_ADMIN"])
class UserController {
    def springSecurityService

    def index() {
User user=springSecurityService.currentUser
        [user:user]
    }
}
