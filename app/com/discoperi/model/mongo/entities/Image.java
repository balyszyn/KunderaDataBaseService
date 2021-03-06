package com.discoperi.model.mongo.entities;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;


/**
 * Created by limpid on 5/1/17.
 */

@Entity
@Data
@Table( name = "images", schema = "play-db@mongoUnit" )
@NoArgsConstructor
@AllArgsConstructor
public class Image implements Serializable {


	@Id
	@Column( name = "image_id" )
	@GeneratedValue( strategy = GenerationType.AUTO )
	private String id;

	@Column( name = "name" )
	private String name;

	@Column( name = "slug" )
	private String slug;

	@OneToMany( fetch = FetchType.LAZY, cascade = CascadeType.ALL )
	private List< ImageSource > imageSources;


}
