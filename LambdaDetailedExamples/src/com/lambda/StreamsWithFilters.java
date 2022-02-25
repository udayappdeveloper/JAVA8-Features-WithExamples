package com.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamsWithFilters {

	public static void main(String[] args) {
		// findEvenNumbers();
		// findEvenNumbersList();
		// findEvenNumbersSquresList();
		// sortedStream();
		// sortedStreamWithReverseComparator();
		// sortOnMutipleFileds();
		// findMax();
		// stringToMapConversion();
		usersBasedOnCity();
	}

	private static void findEvenNumbers() {

		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

		list.stream().filter(n -> n % 2 == 0).forEach(System.out::println);

	}

	private static void findEvenNumbersList() {

		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

		List<Integer> evenNumbers = list.stream().filter(n -> n % 2 == 0).collect(Collectors.toList());

		System.out.println(evenNumbers);

	}

	private static void findEvenNumbersSquresList() {

		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

		List<Integer> evenNumbers = list.stream().filter(n -> n % 2 == 0).map(n -> n * n).collect(Collectors.toList());

		System.out.println(evenNumbers);

	}

	private static void sortedStream() {

		List<Integer> list = Arrays.asList(2, 4, 1, 3, 7, 5, 9, 6, 8);

		List<Integer> sortedList = list.stream().sorted().collect(Collectors.toList());

		System.out.println(sortedList);

	}

	private static void sortedStreamWithReverseComparator() {

		List<Integer> list = Arrays.asList(2, 4, 1, 3, 7, 5, 9, 6, 8);

		Comparator<Integer> reverseComparator = new Comparator<Integer>() {
			@Override
			public int compare(Integer i1, Integer i2) {
				return i2.compareTo(i1);
			}
		};

		List<Integer> sortedList = list.stream()
				// .sorted(reverseComparator) //by using comparator
				.sorted((i1, i2) -> i2.compareTo(i1)) // by using lambda
				.collect(Collectors.toList());

		System.out.println(sortedList);

	}

	private static void sortOnMutipleFileds() {

		ArrayList<Employee> employees = getUnsortedEmployeeList();

		// Compare by first name and then last name
		Comparator<Employee> compareByName = Comparator.comparing(Employee::getFirstName)
				.thenComparing(Employee::getLastName);

		List<Employee> sortedEmployees = employees.stream().sorted(compareByName).collect(Collectors.toList());

		System.out.println(sortedEmployees);

	}

	private static ArrayList<Employee> getUnsortedEmployeeList() {
		ArrayList<Employee> list = new ArrayList<>();
		list.add(new Employee(21, "Lokesh", "Gupta"));
		list.add(new Employee(11, "Alex", "Gussin"));
		list.add(new Employee(41, "Brian", "Sux"));
		list.add(new Employee(52, "Neon", "Piper"));
		list.add(new Employee(31, "David", "Beckham"));
		list.add(new Employee(71, "Alex", "Beckham"));
		list.add(new Employee(61, "Brian", "Suxena"));
		list.add(new Employee(71, "uday", "kumar"));
		list.add(new Employee(61, "uday", "kalluri"));
		return list;
	}

	private static void findMax() {

		List<Integer> list = Arrays.asList(2, 4, 1, 3, 7, 5, 55, 6, 8);
		Integer maxNumber = list.stream().max((i1, i2) -> i1.compareTo(i2)).get();
		System.out.println("Max number is:" + maxNumber);
	}

	private static void stringToMapConversion() {
		String input = "This is uday kumar Kalluri";
		Map<String, Integer> map = Arrays.stream(input.split(" "))
				.collect(Collectors.toMap(value -> value, value -> value.length()));

		System.out.println(map);
	}

	private static void usersBasedOnCity() {

		User user1 = new User(1, "User1", "Pune");
		User user2 = new User(2, "User2", "Mumbai");
		User user3 = new User(3, "User3", "Nagpur");
		User user4 = new User(4, "User4", "Pune");
		User user5 = new User(5, "User5", "Mumbai");

		Map<String, List<User>> cityUserListMap = Arrays.asList(user1, user2, user3, user4, user5).stream()
				.collect(Collectors.groupingBy(User::getCity));

		System.out.println(cityUserListMap);
	}

}
