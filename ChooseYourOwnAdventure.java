/*
 * Fei Z
 */
import java.util.Scanner;
 class CYOA {
 public static void main (String[] Args) 
 {
    Scanner keyboard = new Scanner(System.in);
    System.out.println("Welcome to the game of choosing your own adventure!");
    System.out.println("\n");
    System.out.println("You woke up in Fantasy Land. What do you think is your career?\nYour options are \"Warrior\",\"Sorcerer\", or \"Merchant\". Please enter your selection below:");

    String career = keyboard.nextLine(); 

//Compound Boolean + while loop to error-check user input
    while(!career.equalsIgnoreCase("Warrior") && !career.equalsIgnoreCase("Sorcerer") && !career.equalsIgnoreCase("Merchant")) {
        System.out.println("Invalid selection. Your options are \"Warrior\",\"Sorcerer\", or \"Merchant\". Please enter your selection below:");
        career = keyboard.nextLine(); 
    }

//Player chooses to be a Warrior + string comparison
    if (career.equalsIgnoreCase("Warrior")){
        System.out.println("You are the srongest fighter of the Land and none are your match. One day, a war broke out between the country you reside and the neighboring one. The ruler of your kingdom calls on you to fight for your country. Would you go to war?\nEnter \"y\" or \"n\" below:");

        String choice = keyboard.nextLine();
        if (choice.equalsIgnoreCase("y")){
            System.out.println("You quickly assembled and built an army of yours, and they fought with you valiantly. One night, your spy in the enemy's camp informed you that there apprears to be a child being held hostage in the enemy's fortress. Given that the fortress is one of the strongholds of the enemy, would you risk to save the child?\nEnter \"y\" or \"n\"below:" );
            choice = keyboard.nextLine();
            if (choice.equalsIgnoreCase("y")){
                System.out.println("You teamed up with the assasins of your army, penetrated the fortress, and saved the child. It turns out the boy is an Elf Prince: the enemy are holding him hostage to pressure the Elf King to send their troop. Now that the prince is freed, the Elf King shows his gratitude by having his troop to fight alongside your army instead of the enemy's. With the help of the Elves, the war ended quickly. You restored the peace of the Land, became a close friend of the Elves, and went down into history as a forever legend.\nENGDING 1");
                System.exit(0);
            }
            else{
                System.out.println("It was a long and hard war for the enemy has Elven troops, who were usually neutral in the conflicts of Humans, in their asssistance. You watched your comarades die and soon began doubting the purpose of the war. You miss everything back home and indulge yourself in alchohol. The war outlasted both your strength and will to fight, and you were slain by enemy's weapons. \nENGDING 2");
                System.exit(0);
            }
        }
    else{
        System.out.println("You choose to enjoy your own peace of mind, built a new residence in the forest away from the war. You started a martial arts academy in the forest, teaching war orphans from near-by village the skills to protect themselves and providing them with food and shelter. Many of the kids grew up to be great fighters with not only immense powers but also hearts of gold. Seeing the Land troubled by endless wars, your students took it upon themselves, mediated the hostile parties, and restored the peace of the land. You were forever remembered as the Master of these great figures.\nENDING 3");
        System.exit(0);
     }
    }
    
//Player chooses to be a Sorcerer 
    else if (career.equalsIgnoreCase("Sorcerer")){
        System.out.println("With your outstanding talent, you have mastered the art of the magics of the Land. One evening, a merchant knocked on your door and showed you a book that they recently came across. The merchant had no idea what the book was about as it was written in an ancient rune, yet upon reading you realized that the book was on the powerful yet dangerous Dark Magic. Would you purchase the book and practice Dark Magic?\nEnter \"y\" or \"n\" below:");

        String choice = keyboard.nextLine();
        if (choice.equalsIgnoreCase("n")){
            System.out.println("You bought the book but destoyed it upon the merchant's leave. You did not want to peek into the world of Dark Power or seeing it held by someone else. Couple days later, an old frend found you at the tavern you always spend time in. She invited you to join her in the practice of alchemy. She had been practising secretly as it is a dishonorable trick in common belief, but she has made great fortune. Would you join her in practicing alchemy?\nEnter \"y\" or \"n\" below:" );
            choice = keyboard.nextLine();
            if (choice.equalsIgnoreCase("y")){
                System.out.println("Your friend was very happy that you choose to join her, and brought you to her studio. Seeing all her shining pieces of gold and silver, you became even more eager to practce the art of alchemy. Your friend told you that in order for the magic to work, you do need to sacrifice a couple pieces of real gold, so you gave her all the golds you have on you. She told you to come back tomorow moring to see the full process, and you gladly went home. When you came back the next day, the entire house was gone along with her and your golds. You wanted to ask for help but felt too embarassed as you did not want to damage your reputation as a wise sorcerer, so the affair became something that goes into the grave with you.\nENGDING 4");
                System.exit(0);
            }
            else{
                System.out.println("You passed the opportunity, thinking that you could use the magic for the better, and you did. A war broke out between nearby kingdoms, and your magic were a major reason behind the many lives saved. You were known as the kind sorcerer who saves lives and were loved by the people of the Land, and you liked that. Wanting to be a better healer, you mastered herbology along with many other healing methods, and traveled almost every where of the Land to cure those who are sick. Seeing the great work you do, the Coucil of Magic awarded you the title as the Supreme Healer, and you became part of the many tales of the Land.\nENGDING 5");
                System.exit(0);
            }}
    else{
        System.out.println("You read through the book, and learned everything about Dark Magic. A war broke out in nearby kingdoms, and your magic were a major reason behind the many lives lost. You were known as the evil sorcer who terrorizes the land and were feared by many due to your distructive power, and you liked that. Wanting to level up your sorcery even more, you built a high tower and confined yourself inside. Yet, days went by, and no obvious progress has been made. Seeing so, you became hasty and made a detrimental mistake in making a spell - with that, you lost yourself to the abyss of dark power.\nENDING 6");
        System.exit(0);
     }
    }

//Player chooses to be a Merchant 
    else if (career.equalsIgnoreCase("Merchant")){
        System.out.println("Being resourseful and witty, you are one of the most popular marchant of the Land and has a solid business. One day, a war broke out in the near-by kingdoms. When you are drinking at the tavern, the tavern owner passed you a piece of message left by someone else. They wanted to contract you to sell the weapons they produce and make a fortune from the war. Would you become a arms dealer?\nEnter \"y\" or\"n\" below:");

        String choice = keyboard.nextLine();
        if (choice.equalsIgnoreCase("n")){
            System.out.println("You did not want to get your fingers dirty, so you turned down the offer. Days later, a strange group of customers came to your shop. Made of 13 dwarves and a Jobbit, they asked for donations as they are on a journey to slain the evil dragon of the north and take back the treasure of their ancestor. The leader of the Dwarves, Sorin, promised that they will repay 10 times of your donation. Having only 10 gold to spare, how much would you gift them?\nEnter a whole number of golds ranged from 0 to 10 below:" );
            Integer golds = keyboard.nextInt();
//Numeric comparison
            if (golds >= 2){
                System.out.println("The group thanked your generosity, bought some other items from you, and headed out. Months has passed since the day they came, but you finally got the news: they had sucessfully recovered the lost treasure. Sorin himself delivered you " + golds*10 + " pieces of gold as promised, plus some exotic crafts of the Dwarfs. You officially became a friend of the Dwarves and a certain Jobbit, and this fun fact was passed down in your family generations after generations.\nENGDING 7");
                System.exit(0);
            }
            else{
                System.out.println("The group thanked you, bought some other items from you, and headed out. Months has passed since the day they came and you finally got the news: the group failed in recovering the treasure. They even lost a few brave souls in fighting with the dragon. The remained ones, unable to pay you back, offered to make it up to you, yet were dismissed by you. You spend the rest of your years regretting, thinking about the what-ifs had you been more generous that day when all of them were live infront of you.\nENGDING 8");
                System.exit(0);
            }}
    else{
        System.out.println("You gladly accepted the offer and after some negotiations, you became an arms dealer. During the years of war, you sold weapons form large to small to anyone who can make a valid offer and profited greatly. One day, the war was over, and the order of the Land was restored. The Queen's advisors started studying the war and its damage, and came to find out that you were one of the reasons behind the lengthy and destructive war. You tried to argue that you were just the middle-person, yet as they could not track your shadow partner, you were thrown in jail, lost everything, and spent the rest of your years behind bars. If it makes you feel better, you did improved the efficiency of the goods exchanging system in the prison, and you were well-liked by your jail mates. \nENDING 9");
        System.exit(0);
     }
    }
}
}


