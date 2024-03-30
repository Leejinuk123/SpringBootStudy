package woogie.study;

import jakarta.persistence.*;

import java.util.Date;


@Entity
public class StudyDatabase {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY) //strategy -> 방법에서 생성타입을 아이텐티티로.
    Integer id;

    @Column(columnDefinition = "TEXT")
    public String content;
    Date date;
}
