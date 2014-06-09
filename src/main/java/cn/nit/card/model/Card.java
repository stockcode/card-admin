package cn.nit.card.model;

import org.hibernate.validator.constraints.NotEmpty;
import org.lightadmin.api.config.annotation.FileReference;
import org.springframework.util.Assert;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "cards")
public class Card extends AbstractEntity {

    @NotEmpty
    @Column(unique = true)
	private String word;

    @FileReference
    private String imgURL1;

    @FileReference
    private String imgURL2;

    @FileReference
    private String imgURL3;

    private Date created;

    private Integer choice;

	public Card(String word) {
		Assert.hasText( word, "word must not be null or empty!" );

		this.word = word;
	}

	public Card() {

	}

	public Card getCopy() {
		return new Card( this.word);
	}

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public String getImgURL1() {
        return imgURL1;
    }

    public void setImgURL1(String imgURL1) {
        this.imgURL1 = imgURL1;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public String getImgURL2() {
        return imgURL2;
    }

    public void setImgURL2(String imgURL2) {
        this.imgURL2 = imgURL2;
    }

    public String getImgURL3() {
        return imgURL3;
    }

    public void setImgURL3(String imgURL3) {
        this.imgURL3 = imgURL3;
    }

    public Integer getChoice() {
        return choice;
    }

    public void setChoice(Integer choice) {
        this.choice = choice;
    }
}