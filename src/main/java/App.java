import models.Hero;
import models.Squad;
import spark.ModelAndView;
import spark.template.handlebars.HandlebarsTemplateEngine;
import java.util.HashMap;
import java.util.Map;

import static spark.Spark.*;

public class App {
    public static  void main(String[] args) {
        staticFileLocation("/public");

        get("/", (request, response) -> {
            Map<String, Object> model = new HashMap<>();
            return new ModelAndView(model, "index.hbs");
        }, new HandlebarsTemplateEngine());

        get("/heroes", (request, response) -> {
            Map<String, Object> model = new HashMap<String, Object>();
            return new ModelAndView(model, "heroes.hbs");
        }, new HandlebarsTemplateEngine());


        post("/squads", (request, response) -> {
            Map<String, Object> model = new HashMap<String, Object>();
            String name = request.queryParams("name");
            int size = Integer.parseInt(request.queryParams("size"));
            String cause = request.queryParams("reason");
            Squad newSquad= new Squad(name,size,cause);
            model.put("template", "templates/squad-success.hbs");
            return new ModelAndView(model, "success.hbs");
        }, new HandlebarsTemplateEngine());
    }

}
