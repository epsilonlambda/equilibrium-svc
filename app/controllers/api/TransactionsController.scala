package controllers.api

import play.api.libs.json._
import play.api._
import play.api.mvc._

class TransactionsController extends Controller {
    def index = Action {
        Ok(Json.toJson(Array(0)))
    }
}