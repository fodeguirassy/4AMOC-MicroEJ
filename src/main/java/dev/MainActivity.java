/*
 * Java
 *
 * Copyright 2018 IS2T. All rights reserved.
 * IS2T PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package dev;

import ej.microui.MicroUI;
import ej.microui.display.Colors;
import ej.microui.display.GraphicsContext;
import ej.mwt.Desktop;
import ej.mwt.MWT;
import ej.mwt.Panel;
import ej.style.Stylesheet;
import ej.style.background.SimpleRoundedPlainBackground;
import ej.style.outline.SimpleOutline;
import ej.style.selector.TypeSelector;
import ej.style.selector.combinator.ChildCombinator;
import ej.style.util.EditableStyle;
import ej.style.util.StyleHelper;
import ej.wadapps.app.Activity;
import ej.widget.basic.Label;
import ej.widget.composed.ButtonWrapper;
import ej.widget.container.transition.SlideScreenshotTransitionContainer;
import ej.widget.container.transition.TransitionContainer;
import ej.widget.navigation.page.Page;
import page.Home;

/**
 *
 */
public class MainActivity implements Activity {

	public static TransitionContainer transition;

	@Override
	public String getID() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void onCreate() {
		// TODO Auto-generated method stub
	}

	@Override
	public void onRestart() {
		// TODO Auto-generated method stub

	}

	@Override
	public void onStart() {
		MicroUI.start();

		initializeStyle();

		Panel panel = new Panel();
		Desktop desktop = new Desktop();
		transition = new SlideScreenshotTransitionContainer(MWT.LEFT, false, false);
		transition.show(new Home(), false);
		panel.setWidget(transition);
		panel.showFullScreen(desktop);
		desktop.show();

	}

	private void initializeStyle() {

		Stylesheet stylesheet = StyleHelper.getStylesheet();

		EditableStyle btnStyle = new EditableStyle();
		btnStyle.setMargin(new SimpleOutline(5));
		btnStyle.setPadding(new SimpleOutline(0));
		btnStyle.setBackground(new SimpleRoundedPlainBackground(13));
		btnStyle.setBackgroundColor(Colors.MAROON);
		btnStyle.setForegroundColor(Colors.WHITE);
		btnStyle.setAlignment(GraphicsContext.HCENTER | GraphicsContext.VCENTER);

		// TODO style for labels
		EditableStyle labelStyle = new EditableStyle();

		TypeSelector lblSel = new TypeSelector(Label.class);
		TypeSelector btnSel = new TypeSelector(ButtonWrapper.class);

		ChildCombinator parentBtnSel = new ChildCombinator(btnSel, lblSel);
		stylesheet.addRule(parentBtnSel, btnStyle);
		stylesheet.addRule(parentBtnSel, labelStyle);
	}

	public static void show(Page page) {
		transition.show(page, true);
	}

	public static void home() {
		transition.show(new Home(), false);
	}

	@Override
	public void onResume() {
		// TODO Auto-generated method stub
	}

	@Override
	public void onPause() {
		// TODO Auto-generated method stub

	}

	@Override
	public void onStop() {
		// TODO Auto-generated method stub

	}

	@Override
	public void onDestroy() {
		// TODO Auto-generated method stub

	}

}
