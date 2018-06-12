/*
 * Java
 *
 * Copyright 2018 IS2T. All rights reserved.
 * IS2T PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package page;

import ej.widget.basic.Label;
import ej.widget.composed.ButtonWrapper;
import ej.widget.container.List;
import ej.widget.container.Split;
import ej.widget.listener.OnClickListener;
import ej.widget.navigation.page.Page;

/**
 *
 */
public class Home extends Page {

	Split container = new Split(false, 0.15f);
	List btnList = new List(false);

	ButtonWrapper game = new ButtonWrapper();
	ButtonWrapper score = new ButtonWrapper();
	ButtonWrapper settings = new ButtonWrapper();

	public Home() {
		this.game.setWidget(new Label("Play")); //$NON-NLS-1$
		this.score.setWidget(new Label("Scores")); //$NON-NLS-1$
		this.settings.setWidget(new Label("Settings")); //$NON-NLS-1$

		this.btnList.add(this.game);
		this.btnList.add(this.score);
		this.btnList.add(this.settings);

		this.settings.addOnClickListener(new OnClickListener() {
			@Override
			public void onClick() {
				// TODO Auto-generated method stub

			}
		});

		this.container.setLast(this.btnList);
		this.setWidget(this.container);
	}
}
