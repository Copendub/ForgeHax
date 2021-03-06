package com.matt.forgehax.gui.elements;

import com.matt.forgehax.util.Utils;
import com.matt.forgehax.util.mod.BaseMod;

/** Created by Babbaj on 9/5/2017. */
public class GuiButton {

  private final BaseMod mod;

  public static final int COLOR_ENABLED = Utils.toRGBA(65, 65, 65, 200);
  public static final int COLOR_DISABLED = Utils.toRGBA(100, 100, 100, 150);

  public int width;
  public static final int height = 15;

  public int x, y; // used to get the area they can be clicked in

  public GuiButton(BaseMod modIn) {
    this.mod = modIn;
  }

  public void setCoords(int xIn, int yIn) {
    this.x = xIn;
    this.y = yIn;
  }

  public boolean isModEnabled() {
    return mod.isEnabled();
  }

  public void toggleMod() {
    if (!mod.isEnabled()) mod.enable();
    else mod.disable();
  }

  public String getName() {
    return mod.getModName();
  }

  public BaseMod getMod() {
    return this.mod;
  }

  public int getColor() {
    return isModEnabled() ? COLOR_ENABLED : COLOR_DISABLED;
  }
}
