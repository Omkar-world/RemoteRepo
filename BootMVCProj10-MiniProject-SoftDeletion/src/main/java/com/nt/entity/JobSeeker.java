package com.nt.entity;

import org.hibernate.annotations.JoinColumnOrFormula;
import org.hibernate.annotations.SQLDelete;
import org.hibernate.annotations.SQLRestriction;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="JOB_SEEKER")
@Data
@NoArgsConstructor
@AllArgsConstructor
@SQLDelete(sql="UPDATE JOB_SEEKER SET STATUS='INACTIVE' WHERE js_id=?")
@SQLRestriction("STATUS <>  'INACTIVE' ")
public class JobSeeker{
@Id
@SequenceGenerator(name="gen1",sequenceName = "js_seq1",initialValue =1005,allocationSize = 1)
@GeneratedValue(generator = "gen1",strategy = GenerationType.SEQUENCE)
@Column(name="js_id")
private Integer jsid;
@Column(length=30,name="js_name")
private String jsname;
@Column(length = 30,name="js_adress")
private String jsadress;
@Column(name="js_percentage")
private Integer jspercentage;
@Column(length = 30)
private String status="Active";
}
