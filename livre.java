
public class livre {
	
	public String titre;
	public String auteur;
	public int année_publication;
	
	public livre(String titre,String auteur,int année_publication){
		this.titre=titre;
		this.auteur=auteur;
		this.année_publication=année_publication;
	}
	public void Afficher() {
	    System.out.println("Titre: " + titre);
	    System.out.println("Auteur: " + auteur);
	    System.out.println("Année de publication: " + année_publication);
	}
	
	

	
			

	

}
