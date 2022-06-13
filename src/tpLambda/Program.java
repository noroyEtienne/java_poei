package tpLambda;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Program {

	public static List<Personne> listPers;

	public static void main(String[] args) {

		listPers = new ArrayList<>();
		Personne P1 = new Personne(001, "JEAN", 30, "M");
		Personne P2 = new Personne(003, "CHARLY", 25, "M");
		Personne P3 = new Personne(002, "MARIE", 32, "F");
		Personne P4 = new Personne(004, "YVETTE", 33, "F");
		Personne P5 = new Personne(005, "THOMAS", 40, "M");

		listPers.add(P1);
		listPers.add(P2);
		listPers.add(P3);
		listPers.add(P4);
		listPers.add(P5);

		TransformToPersonneDTO();
		System.out.println("******************************************");
		TransformToPersonneDTOLambda();
		System.out.println("******************************************");
		TransformToPersonneDTOFilter();

	}

	/**
	 * Transfoms the list of Personne to another list of PersonneDTO.
	 */
	private static void TransformToPersonneDTO() {
		List<PersonneDTO> newList = new ArrayList<>();

		for (Personne p : listPers) {
			newList.add(new PersonneDTO(p.getCode(), p.getNom(), p.getAge(), p.getGenre()));
		}

		System.out.println(newList);
	}

	/**
	 * Transfoms the list of Personne to another list of PersonneDTO using stream.
	 */
	private static void TransformToPersonneDTOLambda() {

		listPers.stream().map(p -> new PersonneDTO(p.getCode(), p.getNom(), p.getAge(), p.getGenre()))
				.forEach(System.out::println);
		
		List<PersonneDTO> list = listPers.stream().map(p -> new PersonneDTO(p.getCode(), p.getNom(), p.getAge(), p.getGenre()))
		.collect(Collectors.toList());
	}
	
	/* Other methods with the creation of a list.
	 
	 List<PersonneDTO> list = listPers.stream().map(p -> new PersonneDTO(p.getCode(), p.getNom(), p.getAge(), p.getGenre()))
		.collect(Collectors.toList());
		
		System.out.println(list);
	 */
	

	/**
	 * Transfoms the list of Personne to another list of PersonneDTO using stream with filter.
	 */
	private static void TransformToPersonneDTOFilter() {

		listPers.stream().filter(p -> p.getAge() > 32 && p.getGenre() == "F")
				.map(p -> new PersonneDTO(p.getCode(), p.getNom(), p.getAge(), p.getGenre()))
				.forEach(System.out::println);
	}

}
