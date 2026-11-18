package SeventhPractice.Contacts;

import java.util.Objects;

public class Contact {
    public String name;
    public String telephone;

    public Contact() {
        this.name = null;
        this.telephone = null;
    }
    
    public Contact(String name, String telephone) {
        this.name = name;
        this.telephone = telephone;
    }


    @Override    
    public int hashCode() {
        return Objects.hash(this.name, this.telephone);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || obj.getClass() != this.getClass()) return false;
        Contact contact = (Contact) obj;
        return Objects.equals(this.name, contact.name) && Objects.equals(this.telephone, contact.telephone);
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("(");
        stringBuilder.append(this.name);
        stringBuilder.append(", ");
        stringBuilder.append(this.telephone);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}
