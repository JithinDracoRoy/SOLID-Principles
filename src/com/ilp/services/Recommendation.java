package com.ilp.services;

import java.util.ArrayList;
import java.util.List;
import com.ilp.entity.Watch;
import com.ilp.interfaces.WatchListInterface;

public class Recommendation implements WatchListInterface {

	List<Watch> recommendationList = new ArrayList<Watch>();
	
	@Override
	public void addWatch(Watch watch) {
		// TODO Auto-generated method stub
		System.out.println("Watch added to recommendation.");
		
	}

	@Override
	public void removeWatch(Watch watch) {
		// TODO Auto-generated method stub
		System.out.println("Watch removed from recommendation.");
	}

	public Recommendation(List<Watch> recommendationList) {
		super();
		this.recommendationList = recommendationList;
	}

	public List<Watch> getRecommendationList() {
		return recommendationList;
	}

	public void setRecommendationList(List<Watch> recommendationList) {
		this.recommendationList = recommendationList;
	}
	

}
