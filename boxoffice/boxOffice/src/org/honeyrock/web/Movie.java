package org.honeyrock.web;

import java.util.Date;

import lombok.Data;


@Data
public class Movie {
	private Integer rank;
	private String movieNm;
	private Date openDt;
	private Integer audiCnt;
	private Integer showCnt;
	private Integer salesAcc;
}
