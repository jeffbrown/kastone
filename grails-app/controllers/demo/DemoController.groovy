package demo

import org.springframework.http.HttpStatus

class DemoController {

    // this line breaks something...
    // the model variables in the view don't get populated
    //static responseFormats = ['json']

    def index() {
        respond([firstName: 'Jeff', submissionPackageId: 42l], status: HttpStatus.CREATED)
    }
}
