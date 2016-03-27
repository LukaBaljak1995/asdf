
public class Proba {

	int[] niz;
	int brEleme;

	public Proba(int kapacitet) {
		niz = new int[kapacitet];
	}

	public void dodajRastuci(int broj) throws RuntimeException {
		if (brEleme == niz.length)
			throw new RuntimeException();
		else {
			for (int i = 0; i < niz.length; i++) {
				if (broj > niz[i]) {
					for (int j = brEleme; j >i; j--) {
						niz[j] = niz[j - 1];
					}
					niz[i] = broj;
					brEleme++;
					break;
				}
			}
		}
	}

	public void ispisi() {
		for (int i = 0; i < niz.length; i++) {
			if (niz[i] != 0)
				System.out.println(niz[i]);
		}
	}

	public static void main(String[] args) {
		Proba p = new Proba(10);
		p.dodajRastuci(7);
		p.dodajRastuci(6);
		p.dodajRastuci(889);
		p.dodajRastuci(56);
		p.ispisi();
	}

}
