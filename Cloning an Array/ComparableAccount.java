import java.util.Comparator;
import java.util.Date;

public class ComparableAccount extends Account implements Comparable<ComparableAccount>, Cloneable {

	@Override
	public String toString() {
		return ("\t " + getId() + "\t " + getBalance() + " \t " + getDateCreated());
	}

	@Override
	public int compareTo(ComparableAccount cmpObj) {
		if (this.getBalance() == cmpObj.getBalance())
			return 0;
		else
			return (int) (this.getBalance() - cmpObj.getBalance());
	}
	
// Deep cloning
	@Override
	protected Object clone() throws CloneNotSupportedException {
		ComparableAccount accountClone = (ComparableAccount) super.clone();
		accountClone.setDateCreated((Date) this.getDateCreated().clone());
		return accountClone;
	}

}
