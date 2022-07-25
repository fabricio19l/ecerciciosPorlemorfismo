package ex6;

import java.util.Scanner;

public class MP3 extends Arquivo{

	public MP3() {
		super();
	}
		
		private int downloads;

		public int getDownloads() {
			return downloads;
		}

		public void setDownloads(int downloads) {
			this.downloads = downloads;
		}
		public String getTipo() {
			return "MP3: ";
			
		}
      public String getDetalhes() {
    	  return super.getDetalhes() + "\n" + "numero de dowloads: " + downloads;
      }
		public void setDoeloads(int down) {
			downloads = down;
		}
		public void inserirDados() {
			
			
			super.inserirDados();
			Scanner sc = new Scanner(System.in);
			
			
			System.out.println("NUmero de dowloads: ");
			int down = sc.nextInt();
			
			setDownloads(down);
		}
	}

