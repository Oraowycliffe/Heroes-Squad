import models.Hero;
import models.Squad;
import spark.ModelAndView;
import spark.template.handlebars.HandlebarsTemplateEngine;
import java.util.HashMap;
import java.util.Map;

import static spark.Spark.*;

public class App {
    public static void main(String[] args) {
        staticFileLocation("/public");

        get("/", (request, response) -> {
            Map<String, Object> model = new HashMap<>();
            return new ModelAndView(model, "index.hbs");
        }, new HandlebarsTemplateEngine());

        get("/hero/form", (request, response) -> {
            Map<String, Object> model = new HashMap<String, Object>();
            return new ModelAndView(model, "hero-form.hbs");
        }, new HandlebarsTemplateEngine());

        post("/heroes/new", (request, response) -> {
            Map<String, Object> model = new HashMap<String, Object>();
//            Squad squad = Squad.find(Integer.parseInt(request.queryParams("squadId")));
            String name = request.queryParams("name");
            int age = Integer.parseInt(request.queryParams("age"));
            String power = request.queryParams("strength");
            String weakness = request.queryParams("weakness");
            Hero newHero = new Hero(name, age, power, weakness);
//            model.put("squad", squad);
//            model.put("template", "templates/squad-heroes-success.hbs");
            return new ModelAndView(model,"success-hero.hbs");
        }, new HandlebarsTemplateEngine());


    }
}