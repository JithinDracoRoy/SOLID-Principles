package com.ilp.utility;
import java.util.ArrayList;
import java.util.Scanner;
import com.ilp.entity.Watch;
import com.ilp.interfaces.DateInterface;
import com.ilp.interfaces.TimeInterface;
import com.ilp.services.AnalogWatch;
import com.ilp.services.BrochureServices;
import com.ilp.services.Cart;
import com.ilp.services.QRCodeServices;
import com.ilp.services.Recommendation;
import com.ilp.services.SmartWatch;
import com.ilp.services.Wishlist;
public class WishlistUtility {

    public static void main(String[] args) {
		AnalogWatch analogWatch = new AnalogWatch(1, "Rolex Submariner");		
		SmartWatch smartWatch = new SmartWatch(2, "Rolex DateJust");
		ArrayList<Watch> watchList = new ArrayList<Watch>();
        Wishlist wishlist = new Wishlist(watchList);
        Cart cart = new Cart(watchList);
        BrochureServices brochureService = new BrochureServices();
        QRCodeServices qrCodeService = new QRCodeServices();
        Recommendation recommendation = new Recommendation(watchList);

        char repeatChoice;
        do {
            displayMenu();
            int mainChoice = getUserChoice();

            switch (mainChoice) {
				case 1 : wishlist.addWatch(smartWatch);
					break;
				case 2 : wishlist.removeWatch(smartWatch);
					break;
        		case 3 : cart.addWatch(analogWatch);
    				break;	
    			case 4 : cart.removeWatch(analogWatch);
    				break;
    			case 5 : brochureService.downloadBrochure(smartWatch);
    				break;
    			case 6 : qrCodeService.displayQRCode(wishlist.getWishlist());
    				break;
    			case 7 : qrCodeService.hideQRCode(wishlist.getWishlist());
    				break; 
    			case 8 : recommendation.getRecommendationList();
    				break;
    			case 9 : displayWatchTime(smartWatch);
    					 displayWatchTime(analogWatch);
    				break;
    			case 10 : displayWatchDate(smartWatch);
    				break;
                default: System.out.println("Invalid Input.");
            }

            System.out.println("Do You Want To Continue (y/n) : ");
            repeatChoice = getUserChoiceChar();
        } while (Character.toLowerCase(repeatChoice) == 'y');
    }

    private static void displayMenu() {
        System.out.println("******YOUR FAVOURITES******");
		System.out.println("1.Add To Wishlist.\n"
		+ "2.Remove from Wishlist.\n"
		+ "3.Add To Cart.\n"
		+ "4.Remove From Cart.\n"
		+ "5.Download Brochure.\n"
		+ "6.Show QR Code.\n"
		+ "7.Hide QR Code.\n"
		+ "8.Show Reccomendations.\n"
		+ "9.Display Time."
		+ "10.Display Date");	
    }

    @SuppressWarnings("resource")
	private static int getUserChoice() {
        System.out.println("Choose the operation.");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }
    @SuppressWarnings("resource")
	private static char getUserChoiceChar() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine().charAt(0);
    }
    private static void displayWatchTime(TimeInterface watch) {
        watch.displayTime();
    }
    private static void displayWatchDate(DateInterface watch) {
    	watch.displayDate();
    }
}
