package example_skill;

import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.imageio.ImageIO;

public class Example_Skill {

    public static void main(String[] args) throws java.lang.Exception {
        System.out.println("Кофе-машина");
        int moneyAmount = 10;
        boolean asdf = false;

        String[] drinks = {"Экспрессо", "Капучинно", "Вода"};
        int[] drinkPrices = {80, 150, 20};
        System.out.println("У вас в наличии " + moneyAmount + "руб.");

        for (int i = 0; i < drinks.length; i++) {
            System.out.print(drinks[i] + " стоит " + drinkPrices[i] + "руб.");
            if (moneyAmount >= drinkPrices[i]) {
                asdf = true;
                System.out.println(" Вы можете купить " + drinks[i] + ".");
            } else {
                System.out.println(" У вас недостаточно средств для покупки " + drinks[i] + ".");
            }
        }
        
        
        DateFormat dateFormat = new SimpleDateFormat("yyyyMMdd_HHmmss");
        String now = dateFormat.format(new Date());
        System.out.println("Current time: " + now);
        
        BufferedImage image = new Robot().createScreenCapture(new Rectangle(Toolkit.getDefaultToolkit().getScreenSize()));
        System.out.println("Resolution is: " + image.getWidth() + "*" + image.getHeight());
        ImageIO.write(image, "jpg", new File("screenshoot.jpg")); // сделать скриншот и отправить в чат в телеграмм с хештегом люблюджаву  

        //20190520_214722

        
    }
}
