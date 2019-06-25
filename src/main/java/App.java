import models.Hero;
import models.Squad;
import spark.ModelAndView;
import spark.template.handlebars.HandlebarsTemplateEngine;
import java.util.HashMap;
import java.util.Map;

import static spark.Spark.*;

public class App {

    public static void main(String[] args) {
        ProcessBuilder processBuilder = new ProcessBuilder();

        Integer port;

        if (processBuilder.environment().get("PORT") != null) {
            port = Integer.parseInt(processBuilder.environment().get("PORT"));
        } else {
            port = 4567; //return default port if heroku-port isn't set (i.e. on localhost)
        }
        port(port);

        staticFileLocation("/public");

        get("/", (request, response) -> {
            Map<String, Object> model = new HashMap<>();
            return new ModelAndView(model, "index.hbs");
        }, new HandlebarsTemplateEngine());

        get("/hero/form", (request, response) -> {
            Map<String, Object> model = new HashMap<>();
            return new ModelAndView(model, "hero-form.hbs");
        }, new HandlebarsTemplateEngine());

        post("/hero/new", (request, response) -> {
            Map<String, Object> model = new HashMap<>();
            String name = request.queryParams("name");
            int age = Integer.parseInt(request.queryParams("age"));
            String strength = request.queryParams("strength");
            String weakness = request.queryParams("weakness");
            Hero newHero = new Hero(name, age, strength, weakness);
            model.put("name", name);
            int heroId = newHero.getId();
            model.put("id", heroId);
            return new ModelAndView(model, "success-hero.hbs");
        }, new HandlebarsTemplateEngine());



        get("/hero/details/:id", (request, response) ->{
            Map<String, Object> model = new HashMap<>();
            int idOfHero = Integer.parseInt(request.params(":id"));
            Hero newHeroe = Hero.find(idOfHero);
            model.put("thisHero", newHeroe);
            model.put("name", newHeroe.getName());
            model.put("age", newHeroe.getAge());
            model.put("strength", newHeroe.getStrength());
            model.put("weakness", newHeroe.getWeakness());
            System.out.print(newHeroe);
            return new ModelAndView(model, "hero.hbs");
        },new HandlebarsTemplateEngine());
        get("/squad/form", (request, response) -> {
            Map<String, Object> model = new HashMap<>();
            return new ModelAndView(model, "squad-form.hbs");
        }, new HandlebarsTemplateEngine());


        post("/squad/new", (request, response) -> {
            Map<String, Object> model = new HashMap<>();
            String name = request.queryParams("squadName");
            int size = Integer.parseInt(request.queryParams("size"));
            String reason= request.queryParams("reason");
            Squad newSquad = new Squad(name, size,reason);
            model.put("squadName", name);
            int squadId = newSquad.getId();
            model.put("id", squadId);
            return new ModelAndView(model, "success-squad.hbs");
    }, new HandlebarsTemplateEngine());


        get("/squad/details/:id", (request, response) ->{
            Map<String, Object> model = new HashMap<>();
            int idOfSquad = Integer.parseInt(request.params(":id"));
            Squad newSquad = Squad.find(idOfSquad);
            model.put("thisSquad", newSquad);
            model.put("squadName", newSquad.getName());
            model.put("size", newSquad.getSize());
            model.put("reason", newSquad.getReason());
            System.out.print(newSquad);
            return new ModelAndView(model, "squad.hbs");
        },new HandlebarsTemplateEngine());
}
}