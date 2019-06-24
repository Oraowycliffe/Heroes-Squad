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
            String name = request.queryParams("name");
            int age = Integer.parseInt(request.queryParams("age"));
            String power = request.queryParams("strength");
            String weakness = request.queryParams("weakness");
            Hero newHero = new Hero(name, age, power, weakness);
            return new ModelAndView(model,"success-hero.hbs");
        }, new HandlebarsTemplateEngine());

        get("/squad/new", (request, response) -> {
            Map<String, Object> model = new HashMap<>();
            return new ModelAndView(model, "squad-form.hbs");
        },new HandlebarsTemplateEngine());

        post("/squad/success", (request, response) -> {
            Map <String, Object> model = new HashMap<>();
            String name =request.queryParams("squadName");
            int size = Integer.parseInt(request.queryParams("size"));
            String mission = request.queryParams("mission");
            Squad newSquad = new Squad(name,size,mission);
            return  new ModelAndView(model,"success-squad.hbs");
        },new HandlebarsTemplateEngine());


    }
}