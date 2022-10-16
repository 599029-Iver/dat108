package oppgave1.handleliste.model;

import java.util.Objects;

public class ListeItem {
    private String name;
    private int quantity;
    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;

    }

    public void changeQuantity(int n) {
    	quantity += n;
    }

    @Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ListeItem other = (ListeItem) obj;
		return Objects.equals(name, other.name);
	}

    

}