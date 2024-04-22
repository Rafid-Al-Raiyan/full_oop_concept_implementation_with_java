import java.util.Scanner;

public class History {

	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("Welcome to Historical Places In Bangladesh Application!");
		System.out.println("Here is the List of TOP 10 Historical Place In Bangladesh:");
		System.out.println("1. Lalbagh Fort.\n2. Ahsan Manzil.\n3. Panam City.\n4. Mahansthangarh.\n5. Shat Gambuj Mosque.\n6. Liberation War Museum.\n7. Mainamati.\n8. Star Mosque.\n9. Shaheed Minar.\n10. National Memorial.\n");

		while(true){
			System.out.println("===============MENU BOX===============");
			System.out.println("To know about Lalbagh Fort, Enter 1.");
			System.out.println("To know about Ahsan Manzil, Enter 2.");
			System.out.println("To know about Panam City, Enter 3.");
			System.out.println("To know about Mahansthangarh, Enter 4.");
			System.out.println("To know about Shat Gambuj Mosque, Enter 5.");
			System.out.println("To know about Liberation War Museum, Enter 6.");
			System.out.println("To know about Mainamati, Enter 7.");
			System.out.println("To know about Star Mosque, Enter 8.");
			System.out.println("To know about Shaheed Minar, Enter 9.");
			System.out.println("To know about National Memorial, Enter 10.");
			System.out.println("To Exit, Enter 0");

			System.out.println();
			System.out.println("Enter your choice::");
			int choice = scan.nextInt();

			switch(choice){
			case 1: System.out.println("History of Lalbagh Fort:");
			LalbaghFort();
			break;
			case 2: System.out.println("History of Ahsan Manzil:");
			AhsanManzil();
			break;
			case 3: System.out.println("History of Panam City:");
			PanamCity();
			break;
			case 4: System.out.println("History of Mahansthangarh:");
			Mahansthangarh();
			break;
			case 5: System.out.println("History of Shat Gambuj Mosque:");
			ShatGambujMosque();
			break;			
			case 6: System.out.println("History of Liberation War Museum:");
			LiberationWarMuseum();
			break;
			case 7: System.out.println("History of Mainamati:");
			Mainamati();
			break;
			case 8: System.out.println("History of Star Mosque:");
			StarMosque();
			break;
			case 9: System.out.println("History of Shaheed Minar:");
			ShaheedMinar();
			break;
			case 10: System.out.println("History of National Memorial:");
			NationalMemorial();
			break;
			case 0: System.out.println("Thanks for using this application. Visit again!");
			System.exit(0);
			break;
			default: System.out.println("Incorrect input!!! Please re-enter choice.");
			}
		}

	}

	public static void LalbaghFort(){
		System.out.println("The 17th century Mughal fort which stands by the Buriganga River is one of the oldest architecture of Bangladesh. \nIt was built by the then Mughal Subahdar Muhammad Azam Shah, son of Emperor Aurangzeb. \nIt is believed that the construction of the fort was never completed.");
		System.out.println("The fort consists of 3 frameworks – \n(i) ‘Diwan-I-Aam’ which was the residence of the Governor, \n(ii) a mosque and \n(iii) the tomb of Bibi Pari who was the daughter of Emperor Saista Khan.");
		System.out.println("Interestingly, there are some mysteries around this fort. There are tunnels underneath the fort which lead to the other side of the river. \nDuring the Sepoy Revolution of 1857, many soldiers tried to flee through those tunnels and died. \nFew British soldiers who followed them there, did not return. In fact, to investigate the situation, the researchers sent an elephant and a dog \nto those tunnels who didn’t come back as well. Soon after that horrific incident, the path was sealed.");
		System.out.println("Wikipedia: https://en.wikipedia.org/wiki/Lalbagh_Fort");
		System.out.println();

	}

	public static void AhsanManzil(){
		System.out.println("Initially, it was a vacation house for a Zamindar of Jamalpur district, Sheikh Enayet Ullah. \nAfter his death, his son sold this property to the French traders in 1740. \nThey dug a pond in front of the building where fresh water could be fetched. \nAfter having a great business in the subcontinent for almost a century, they surrendered under the full British power and sold all of their properties. \nSo, in 1830, Khwaja Alimullah – an established man in Dhaka bought the property. He added a mosque in this compound. \nAfter his death, his son Khwaja Abdul Gani made some progressive look to the property and named it “Ahsan Manzil” after his son Ahsan Ullah.");
		System.out.println("In 1985, Dhaka National Museum obtained this property and made it a museum after a long restoration process.");
		System.out.println("The Palace is divided into 2 sides. ‘Rangmahal’ is at the eastern side. \nIt was the entertainment spot where foreign and local girls used to dance and sing for the main owner Enayet Ullah. \nThe Ballroom was also there at this portion. The Western side has living room, dining room, a library, \ncard room and guest rooms. The Building is front-faced by the mighty Buriganga River. \nThe architecture and the decoration epitomize the Mughal taste perfectly.");
		System.out.println("Wikipedia: https://en.wikipedia.org/wiki/Ahsan_Manzil");
		System.out.println();
	}

	public static void PanamCity(){
		System.out.println("Panam City (also called Panam Nagar in Bengali) was an ancient city, the archaeological ruins of which is situated at Sonargaon, Narayanganj in Bangladesh. \nIt is one of the earliest cities in Bangladesh that is still standing.");
		System.out.println("Among the three cities of the time period: Boro nagar (Big City), Khas Nagar and Panam Nagar; Panam Nagar was the most attractive one. \nThe city area which covers roughly 20 square kilometres (7.7 sq mi), consists of several historical buildings built centuries ago connected with the history of Baro-Bhuyan. \nReportedly, this is one of the most visited tourist spots in Bangladesh.");
		System.out.println("As the capital of the fifteenth-century Bengal ruler Isa Khan, the city was once an important trading and political center. \nAlthough the buildings are now mostly in ruins, the historical city boasts architectural examples from the Sultanate, Mughal, and British Colonial periods.");
		System.out.println("The historic city, located near the present-day capital of Dhaka, includes several Mughal monuments—among them the Sonakanda \nRiver Fort, the Panch Pir Mazar Shrine, and Ibrahim's and Abdul Hamid's Mosque. British colonial architecture preserved in Sonargaon includes the Ananda Mohan \nPiddar House, and other street-front houses. For travelers making their way along the 2,500-kilometre-long (1,600 mi) Grand Trunk Road from Peshawar in the Hindu Kush, Sonargaon marked the end of the line.");
		System.out.println("Threats to the site include flooding, vandalism, unauthorized occupation, illegal development etc. \nThe historical buildings are increasingly becoming delapidated with age and there are no signs of any significant restoration attempts in order to preserve the site.");
		System.out.println("Wikipedia: https://en.wikipedia.org/wiki/Panam_Nagar");
		System.out.println();

	}

	public static void Mahansthangarh(){
		System.out.println("This place lies in a village of Bogra district called ‘Mahasthan.’ ‘Garh’ means fort, so ‘Mahasthangarh’ means fort of Mahasthan.");
		System.out.println("Francis Buchanan Hamilton, a Physician, first discovered this place in 1808. However, he made some significant contributions as a Geographer \nduring his stay in Indian subcontinent. It is the last remaining piece of a village ‘Pundranagara’ of that time. The village was alive until the 8th century AD.");
		System.out.println("This area is now preserved with nice natural hilly look to enjoy leisure. People from everywhere come to spend some quiet time here with natural serenity.");
		System.out.println("Wikipedia: https://en.wikipedia.org/wiki/Mahasthangarh");
		System.out.println();
	}

	public static void ShatGambujMosque(){
		System.out.println("Shat Gambuj Masjid or the Sixty Dome Mosque resides in the city of mosque, Bagerhat of Khulna division. It’s the largest mosque in Bangladesh and registered under the UNESCO World Heritage Site.");
		System.out.println("Prior to that Saint General Khan Jahan Ali introduced a Muslim Colony at the middle of 15th century and started building numerous mosques. \nEventually, this mosque was started building in 1442 and completed by 1459.");
		System.out.println("A tower is there on each side and 77 low domes are surrounded within those. There are also 60 stoned pillars to support the roof. \nAlong with that there is system for enough ventilation and light which gives a sound feeling.");
		System.out.println("Wikipedia: https://en.wikipedia.org/wiki/Sixty_Dome_Mosque");
		System.out.println();
	}

	public static void LiberationWarMuseum(){
		System.out.println("This museum is at Sher-E-Bangla Nagar, Dhaka. It is based on the liberation war and the independence of Bangladesh over Pakistan.");
		System.out.println("The committee under this authority collected the uniforms, clothes, weapons and documents from liberation war. Also some destroyed \nmachines, air-crafts and remains are there. Some historical letters, contracts are also found where the ‘surrender paper’ of Pakistan is one of those.");
		System.out.println("Galleries, the main attraction of the museum covers everything from prior to post independence. The language movement, the killing of \nlanguage martyrs, Mass Uprising of 1969 and then eventually the genocide of the 25th March which is labeled as a dark night in the \nhistory of Bangladesh. Pictures of the training of Mukti Bahini and then Mitro Bahini (Bangladesh-India joint force) are also found.");
		System.out.println("Wikipedia: https://en.wikipedia.org/wiki/Liberation_War_Museum");
		System.out.println();

	}
	public static void Mainamati(){
		System.out.println("It is the extinct Buddhist religious site in the district of Comilla. It serves a beautiful colonial cemetery as Comilla Cantonment is nearby. The Mainamati Cemetery is a historical memorial \nwith about thousands of graves from Second World War.");
		System.out.println("Mainamati was the name of a Chandra Queen, mother of Govindachandra who was a ruler of Chandra dynasty. Between the 10th and 11th century, they ruled the Samatata division of Bengal. Currently, \nthis is the part of Comilla, 114 km away from the capital, Dhaka. They used this place to perform their religious activities.");
		System.out.println("Wikipedia: https://en.wikipedia.org/wiki/Mainamati");
		System.out.println();

	}
	public static void StarMosque(){
		System.out.println("This mosque is based in Armanitola, Dhaka. A very antique mosque built by Mirza Golam Pir at 19th century.");
		System.out.println("Built in Mughal style, initially, it was a simple rectangular mosque. The roof was crowned by 3 domes and \ncovered with star shaped china clay tiles. These tiles are also seen in the exterior.");
		System.out.println("Later, on the 20th century, a local businessman named Ali Jahan Bepari renovated the mosque. Started by adding \na veranda, he repaired the tiles with mosaic.");
		System.out.println("It was popular decoration by that time. Along with the domes, the exterior and the interior are done with star shaped \ntiles. That is why the mosque is called Star mosque. In 1987, the Ministry of Religious Affairs of Bangladesh added a new prayer hall which eventually led to 2 additional domes in the mosque.");
		System.out.println("Wikipedia: https://en.wikipedia.org/wiki/Star_Mosque");
		System.out.println();

	}
	public static void ShaheedMinar(){
		System.out.println("Shaheed Minar or The Martyr Monument stands near Dhaka Medical College. It is the symbol to remember the language martyrs of 1952 language movement.");
		System.out.println("You can go flashback to that incident any time. In 1952, due to the more number of Bangla speakers, people protested to make ‘Bangla’ the state language \nover Urdu. In response, Pakistani police openly fired at the protesters to disassemble their movement. Agonizingly, few students among Dhaka University and Dhaka Medical College died.");
		System.out.println("Bangladesh sculptor Hamidur Rahman along with Novera Ahmed designed and built the modern Shaheed Minar.");
		System.out.println("Eventually, 21st February, the day of the barbaric incident, is declared as International Mother Language Day. \nPeople remember these national heroes with flowers in front of Shaheed Minar on this day.");
		System.out.println("Wikipedia: https://en.wikipedia.org/wiki/Shaheed_Minar,_Dhaka");
		System.out.println();

	}
	public static void NationalMemorial(){
		System.out.println("One of the most beautiful places in Savar, near Dhaka, is the National Memorial. It was founded to recall the memory of the 7 major War Heroes of the Liberation War in 1971.");
		System.out.println("Bangladeshi Structural Engineer and Architect Syed Mainul Hossain designed this remarkable memorial. The monument consists of 7 \ndifferent segments which are standing proudly together to represent the 7 War Heroes.");
		System.out.println("Staggeringly, the complex has the area of 84 acres. National Parade, Scouting Display, Liberation War songs and related programs are \ndisplayed here annually, on the victory day, 16th December. Besides, it’s a regular visiting spot for general people all of the time.");
		System.out.println("Wikipedia: https://en.wikipedia.org/wiki/National_Martyrs%27_Memorial");
		System.out.println();

	}

}