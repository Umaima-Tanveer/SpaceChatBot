import java.util.Scanner;
abstract class SpaceObject {
    public abstract void displayInfo();
    public abstract void askForMoreInfo();
    public abstract void moreInfo();
}
class Planet extends SpaceObject {
    @Override
    public void displayInfo() {
        System.out.println("Chatbot: A planet is a large celestial body that orbits a star, has a nearly spherical shape due to its gravity, and has cleared its orbit of other debris.\n");
    }
    @Override
    public void askForMoreInfo() {
        System.out.print("Would you like to know more about planets? (yes/no): \n");
    }
    @Override
    public void moreInfo() {
        System.out.println("Chatbot: The eight planets in our solar system are Mercury, Venus, Earth, Mars, Jupiter, Saturn, Uranus, and Neptune. They are divided into terrestrial planets (Mercury, Venus, Earth, Mars) and gas/ice giants (Jupiter, Saturn, Uranus, Neptune). Each planet is unique in size, atmosphere, and composition, playing a crucial role in the structure and dynamics of the solar system.\n");
    }
}
class Mercury extends SpaceObject {
    @Override
    public void displayInfo() {
        System.out.println("Chatbot: Mercury is the smallest planet and the closest to the Sun.\n");
    }
    @Override
    public void askForMoreInfo() {
        System.out.print("Would you like to know more about galaxies? (yes/no): \n");
    }
    @Override
    public void moreInfo() {
        System.out.println("Chatbot: Mercury has a very thin atmosphere, making it unable to retain heat. Its surface experiences extreme temperature variations, with scorching heat during the day and freezing cold at night. It completes an orbit around the Sun in just 88 Earth days.\n");
    }
}
class Venus extends SpaceObject {
    @Override
    public void displayInfo() {
        System.out.println("Chatbot:  Venus is the second planet from the Sun and is similar in size to Earth.\n");
    }
    @Override
    public void askForMoreInfo() {
        System.out.print("Would you like to know more about galaxies? (yes/no): \n");
    }
    @Override
    public void moreInfo() {
        System.out.println("Chatbot: Venus has a thick, toxic atmosphere primarily composed of carbon dioxide, which creates an intense greenhouse effect, making it the hottest planet in the solar system. Its surface temperature can reach up to 465°C (869°F), hotter than Mercury despite being farther from the Sun.\n");
    }
}
class Earth extends SpaceObject {
    @Override
    public void displayInfo() {
        System.out.println("Chatbot: Earth is the third planet from the Sun and the only known planet to support life.\n");
    }
    @Override
    public void askForMoreInfo() {
        System.out.print("Would you like to know more about galaxies? (yes/no): \n");
    }
    @Override
    public void moreInfo() {
        System.out.println("Chatbot: Earth has a balanced atmosphere with oxygen and nitrogen, and its surface is 70% water. It has a diverse climate and ecosystems, making it unique in its ability to sustain life.\n");
    }
}
class Mars extends SpaceObject {
    @Override
    public void displayInfo() {
        System.out.println("Chatbot:  Mars is the fourth planet from the Sun, often called the 'Red Planet' due to its iron oxide-rich soil.\n");
    }
    @Override
    public void askForMoreInfo() {
        System.out.print("Would you like to know more about galaxies? (yes/no): \n");
    }
    @Override
    public void moreInfo() {
        System.out.println("Chatbot: Mars has the largest volcano and canyon in the solar system, Olympus Mons and Valles Marineris. The planet has evidence of past water flow, suggesting it may have supported life in the distant past.\n");
    }
}
class Jupiter extends SpaceObject {
    @Override
    public void displayInfo() {
        System.out.println("Chatbot:Jupiter is the fifth and largest planet in the solar system, known for its Great Red Spot and many moons.\n");
    }
    @Override
    public void askForMoreInfo() {
        System.out.print("Would you like to know more about galaxies? (yes/no): \n");
    }
    @Override
    public void moreInfo() {
        System.out.println("Chatbot: Jupiter is a gas giant composed mainly of hydrogen and helium. Its magnetic field is the strongest of any planet in the solar system, and it has at least 79 known moons, including Ganymede, the largest moon in the solar system.\n");
    }
}
class Saturn extends SpaceObject {
    @Override
    public void displayInfo() {
        System.out.println("Chatbot: Saturn is the sixth planet from the Sun and is famous for its extensive ring system.\n");
    }
    @Override
    public void askForMoreInfo() {
        System.out.print("Would you like to know more about galaxies? (yes/no): \n");
    }
    @Override
    public void moreInfo() {
        System.out.println("Chatbot:Saturn is a gas giant with a composition similar to Jupiter. Its rings are made of ice and rock particles. Saturn has 83 known moons, with Titan being the largest and second-largest moon in the solar system.\n");
    }
}
class Uranus extends SpaceObject {
    @Override
    public void displayInfo() {
        System.out.println("Chatbot: Uranus is the seventh planet from the Sun and is unique for its tilted axis, which causes extreme seasonal changes.\n");
    }
    @Override
    public void askForMoreInfo() {
        System.out.print("Would you like to know more about galaxies? (yes/no): \n");
    }
    @Override
    public void moreInfo() {
        System.out.println("Chatbot: Uranus is an ice giant, with a composition that includes water, ammonia, and methane. It has a faint ring system and 27 known moons. The planet's axis is tilted by about 98 degrees, making its rotation appear almost sideways\n");
    }
}
class Neptune extends SpaceObject {
    @Override
    public void displayInfo() {
        System.out.println("Chatbot: Neptune is the eighth and farthest planet from the Sun, known for its striking blue color.\n");
    }
    @Override
    public void askForMoreInfo() {
        System.out.print("Would you like to know more about galaxies? (yes/no): \n");
    }
    @Override
    public void moreInfo() {
        System.out.println("Chatbot:Neptune is an ice giant with a similar composition to Uranus, with methane in its atmosphere giving it its blue appearance. It has 14 known moons, and its largest moon, Triton, orbits in the opposite direction of Neptune's rotation.\n");
    }
}
class Pluto extends SpaceObject {
    @Override
    public void displayInfo() {
        System.out.println("Chatbot: Pluto is a dwarf planet in the Kuiper Belt, a region of icy bodies beyond Neptune.\n");
    }
    @Override
    public void askForMoreInfo() {
        System.out.print("Would you like to know more about galaxies? (yes/no): \n");
    }
    @Override
    public void moreInfo() {
        System.out.println("Chatbot: Once considered the ninth planet, Pluto was reclassified as a dwarf planet in 2006 due to its inability to clear its orbital path of debris. It has a thin atmosphere of nitrogen, methane, and carbon monoxide, and its surface is composed of ice and rock. Pluto has five known moons, with Charon being the largest, almost forming a dual planetary system. Its highly elliptical orbit sometimes brings it closer to the Sun than Neptune.\n");
    }
}
class Moon extends SpaceObject {
    @Override
    public void displayInfo() {
        System.out.println("Chatbot: A moon is a natural satellite that orbits a planet or a dwarf planet.\n");
    }
    @Override
    public void askForMoreInfo() {
        System.out.print("Would you like to know more about galaxies? (yes/no): \n");
    }
    @Override
    public void moreInfo() {
        System.out.println("Chatbot: Earth's moon is the fifth-largest in the solar system and plays a crucial role in stabilizing Earth's rotation and affecting tides. It has no atmosphere and is covered with craters and basalt plains. Other planets also have moons, such as Jupiter’s Ganymede, the largest in the solar system, and Saturn’s Titan, which has a thick atmosphere. Moons vary widely in size, composition, and origin.\n");
    }
}
class BlackHole extends SpaceObject {
    @Override
    public void displayInfo() {
        System.out.println("Chatbot: A black hole is a region in space where gravity is so strong that nothing, not even light, can escape.\n");
    }
    @Override
    public void askForMoreInfo() {
        System.out.print("Would you like to know more about black holes? (yes/no):\n ");
    }
    @Override
    public void moreInfo() {
        System.out.println("Chatbot: Black holes form when massive stars collapse under their gravity at the end of their life cycles. They come in various sizes, from stellar black holes to supermassive ones found at the centers of galaxies. The event horizon is the boundary beyond which nothing can escape. Black holes play a crucial role in shaping galaxies and studying extreme physics.\n");
    }
}
class Galaxy extends SpaceObject {
    @Override
    public void displayInfo() {
        System.out.println("Chatbot: A galaxy is a vast system of stars, gas, dust, and dark matter bound together by gravity.\n");
    }
    @Override
    public void askForMoreInfo() {
        System.out.print("Would you like to know more about galaxies? (yes/no): \n");
    }
    @Override
    public void moreInfo() {
        System.out.println("Chatbot: Galaxies come in different shapes, including spiral, elliptical, and irregular. The Milky Way, our galaxy, is a barred spiral and contains billions of stars, including the Sun. Galaxies can range in size from dwarf galaxies with a few million stars to giants with trillions. They are the building blocks of the universe and often host supermassive black holes at their centers.\n");
    }
}
public class SpaceChatbot {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean moreinfo = true;
        System.out.println("Hello! I'm your Space Chatbot. Ask me anything about space.");
        System.out.println("Type 'exit' to exit the chat.");
        while (moreinfo) {
            System.out.print("You: ");
            String input = in.nextLine().toLowerCase();
            SpaceObject spaceObject = null;
            switch (input) {
                case "planet":
                    spaceObject = new Planet();
                    break;
                case "mercury":
                    spaceObject = new Mercury();
                    break;
                case "venus":
                    spaceObject = new Venus();
                    break;
                case "earth":
                    spaceObject = new Earth();
                    break;
                case "mars":
                    spaceObject = new Mars();
                    break;
                case "jupiter":
                    spaceObject = new Jupiter();
                    break;
                case "saturn":
                    spaceObject = new Saturn();
                    break;
                case "uranus":
                    spaceObject = new Uranus();
                    break;
                case "neptune":
                    spaceObject = new Neptune();
                    break;
                case "pluto":
                    spaceObject = new Pluto();
                    break;
                case "moon":
                    spaceObject = new Moon();
                    break;
                case "black hole":
                    spaceObject = new BlackHole();
                    break;
                case "galaxy":
                    spaceObject = new Galaxy();
                    break;
                case "exit":
                    System.out.println("Chatbot: Goodbye! Keep exploring and discovering new things!");
                    moreinfo = false;
                    break;
                default:
                    System.out.println("Chatbot: That’s a new one for me! I’ll have to study up on that.");
                    break;
            }
            if (spaceObject != null) {
                spaceObject.displayInfo();
                spaceObject.askForMoreInfo();
            }
             String userResponse = in.nextLine().toLowerCase();
            if (userResponse.equals("yes")) {
                spaceObject.moreInfo();
            } else {
                System.out.println("Chatbot: Okay! What would you like to know about next?");
            }
        }
    }
}
