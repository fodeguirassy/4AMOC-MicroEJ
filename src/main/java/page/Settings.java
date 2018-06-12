/*
 * Java
 *
 * Copyright 2018 IS2T. All rights reserved.
 * IS2T PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package page;

import ej.widget.composed.ButtonWrapper;
import ej.widget.container.List;
import ej.widget.container.Split;
import ej.widget.navigation.page.Page;

/**
 *
 */
public class Settings extends Page {

	Split container = new Split(false, 0.15f);
	List btnList = new List(false);
	ButtonWrapper game = new ButtonWrapper();

	public Settings() {

	}
}
