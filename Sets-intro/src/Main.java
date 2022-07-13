import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {

        private static Map<String,HeavenlyBody> solarSystem=new HashMap<>();
        private static Set<HeavenlyBody> planets=new HashSet<>();

    public static void main(String[] args) {
        HeavenlyBody temp=new HeavenlyBody("Mercury",88);
        solarSystem.put(temp.getName(),temp);
        planets.add(temp);

        temp=new HeavenlyBody("Venus",225);
        solarSystem.put(temp.getName(), temp);
        planets.add(temp);

        temp=new HeavenlyBody("Earth",365);
        solarSystem.put(temp.getName(),temp);
        planets.add(temp);

        HeavenlyBody tempMoon=new HeavenlyBody("Moon",27);
        solarSystem.put(temp.getName(), tempMoon);
        temp.addMoon(tempMoon);

        temp=new HeavenlyBody("Mars",687);
        solarSystem.put(temp.getName(),temp);
        planets.add(temp);

        tempMoon=new HeavenlyBody("Deimos",1.3);
        solarSystem.put(temp.getName(),temp);
        temp.addMoon(tempMoon);

        tempMoon=new HeavenlyBody("Phobos",0.3);
        solarSystem.put(temp.getName(),temp);
        temp.addMoon(tempMoon);

        temp=new HeavenlyBody("Jupiter",7.1);
        solarSystem.put(temp.getName(),temp);
        planets.add(temp);

        System.out.println("Planets");
        for(HeavenlyBody Planet:planets){
            System.out.println("\t"+Planet.getName());
        }

        HeavenlyBody body=solarSystem.get("Mars");
        System.out.println("Moons of "+body.getName());
        for(HeavenlyBody marsMoon: body.getSatellites()){
            System.out.println("\t"+marsMoon.getName());
        }
        Set<HeavenlyBody> moons=new HashSet<>();
        for(HeavenlyBody planet:planets){
            moons.addAll(planet.getSatellites());// union basically
        }
        System.out.println("All moons");
        for(HeavenlyBody moon:moons){
            System.out.println("\t" + moon.getName());
        }
        HeavenlyBody Mercury=new HeavenlyBody("Mercury",88);
        planets.add(Mercury);

        for(HeavenlyBody planet:planets){
            System.out.println(planet.getName()+": "+planet.getOrbitalPeriod());

        }
    }

}
