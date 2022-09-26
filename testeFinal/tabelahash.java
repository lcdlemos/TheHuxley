ppublic class HuxleyCode {
  public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int count = 0;
		LinkedList<Integer>[] table = new LinkedList[m];
		for (int i = 0; i < m; i++) {
			table[i] = new LinkedList<>();
		}
		String c = sc.nextLine();
		while (!c.equals("f")) {
			String[] line = c.split(" ");
			if (line[0].equals("a")) {
				int n = Integer.parseInt(line[1]);
				int key = Integer.parseInt(line[1]) % m;
				if (table[key].isEmpty()) {
					table[key].add(n);
				} else {
					int index = 0;
					while(index < table[key].size()) {
						if (table[key].get(index) >= n) {
							break;
						}
						index += 1;
					}
					table[key].add(index, n);
				}
				count ++;
			} else if (line[0].equals("r")) {
				int n = Integer.parseInt(line[1]);
				int key = Integer.parseInt(line[1]) % m;
				if (table[key].contains(n)) {
					table[key].remove(new Integer(n));
					count --;
				}
			} else if (line[0].equals("p")) {
				int n = Integer.parseInt(line[1]);
				int key = Integer.parseInt(line[1]) % m;
				System.out.println(String.format("BUSCA POR %d", n));
				System.out.println(String.format("numero de elementos da tabela hash: %d", count));
				boolean found = false;
				int access = 0;
				for (int e : table[key]) {
					if (e == n) {
						found = true;
						access ++;
						break;
					}
					access ++;
				}
				if (found) {
					System.out.println(String.format("elemento %d encontrado!", n));
				} else {
					System.out.println("elemento nao encontrado!");
				}
				System.out.println(String.format("numero de elementos acessados na tabela hash: %d", access));
			} else if (line[0].equals("i")) {
				System.out.println("imprimindo tabela hash:");
				int i = 0;
				for (LinkedList<Integer> l : table) {
					if (l.isEmpty()) {
						System.out.println(String.format("[%d]:Lista vazia!", i));
					} else {
						String elements = l.stream().map(Object::toString)
		                        .collect(Collectors.joining("=>"));
						System.out.println(String.format("[%d]:%s=>", i, elements));
					}
					i++;
				}
			}
			c = sc.nextLine();
		}
	}
}