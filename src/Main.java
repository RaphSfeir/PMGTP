import java.util.Vector;

import java.io.*;

public class Main {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Processeur d'images binaires");
		try {
			String ligne;
			FileInputStream image_content = new FileInputStream("image.pgm");
			InputStreamReader isr_img = new InputStreamReader(image_content);
			BufferedReader BR_img = new BufferedReader(isr_img);
			
			String introduction = BR_img.readLine();
			System.out.println("Introduction is P2, always... -> " + introduction);
			
			String comments = BR_img.readLine();
			System.out.println("Comments -> " + comments);
			
			String size = BR_img.readLine();
			System.out.println("Size (width height) -> " + size);
			
			System.out.println("Reading image data, stored in variable img_data ");
			/*while ((ligne = BR_img.readLine()) != null)
			{
				System.out.println(ligne);
			}*/
			String[][] img_data = new String[512][512];
			int i = 0;
			int j = 0;
			for (i = 0 ; i < 512 ; i++)
			{
				for (j = 0 ; j< 512 ; j++)
				{
					img_data[j][i] = BR_img.readLine();
				}
			}
		}
		catch (Exception e) {
			System.out.println("Erreur : " + e.toString());
		}
	}
}
