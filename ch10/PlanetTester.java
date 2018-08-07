public class PlanetTester
{
    public static void main(String[] args)
    {
        Planet mercury = new Planet("Mercury");
        Planet venus = new Planet("Venus");
        Planet earth = new Planet("Earth");
        Planet mars = new Planet("Mars");
        Planet jupiter = new Planet("Jupiter");
        Planet saturn = new Planet("Saturn");
        Planet uranus = new Planet("Uranus");
        Planet neptune = new Planet("Neptune");
        Planet pluto = new Planet("Pluto");


        Planet[] namesOfPlanets = new Planet[9];
        namesOfPlanets[0] = mercury;
        namesOfPlanets[1] = venus;
        namesOfPlanets[2] = earth;
        namesOfPlanets[3] = mars;
        namesOfPlanets[4] = jupiter;
        namesOfPlanets[5] = saturn;
        namesOfPlanets[6] = uranus;
        namesOfPlanets[7] = neptune;
        namesOfPlanets[8] = pluto;

        for(Planet planet:namesOfPlanets)
        {
            System.out.println(planet.getName());
        }

        for(int i = 0; i < namesOfPlanets.length; i++)
        {
            System.out.println(namesOfPlanets[i].getName());
        }
    }
}
