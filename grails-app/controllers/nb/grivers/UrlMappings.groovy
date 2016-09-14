package nb.grivers

class UrlMappings {

    static mappings = {
        "/$controller/$action?/$id?(.$format)?"{
            constraints {
                // apply constraints here
            }
        }

        "/"(view:"/club/index")
        "500"(view:'/error')
        "404"(view:'/notFound')
    }
}