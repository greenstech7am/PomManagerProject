package org.managers;

import org.utilities.FBLoginPojo;

public class PageObjectManager {

	public static PageObjectManager manager;
	FBLoginPojo fbLoginPage;

	private PageObjectManager() {

	}

	public static PageObjectManager getInstance() {

		if (manager == null) {

			manager = new PageObjectManager();
		}

		return manager;
	}

	public FBLoginPojo getFbLoginPage() {
		return(fbLoginPage==null)? fbLoginPage = new FBLoginPojo():fbLoginPage;
	}
	
	

	

}
