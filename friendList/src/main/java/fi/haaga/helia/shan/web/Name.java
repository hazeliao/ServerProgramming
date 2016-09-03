package fi.haaga.helia.shan.web;

import javax.validation.constraints.NotNull;

public class Name {
	@NotNull
	public String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Name [name=" + name + "]";
	}
}
