package com.nadetdev.springangular.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Tutorial {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	@Column(name = "title")
	private String title;

	@Column(name = "description")
	private String description;

	@Column(name = "published")
	private boolean published;

	

	public Tutorial(String title, String description, boolean published) {
		this.title = title;
		this.description = description;
		this.published = published;
	}


	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Tutorial{");
		sb.append("id=").append(id);
		sb.append(", title=").append(title);
		sb.append(", description=").append(description);
		sb.append(", published=").append(published);
		sb.append('}');
		return sb.toString();
	}

}
