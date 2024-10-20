package org.csc133.a2.gameObjects;

import com.codename1.charts.util.ColorUtil;
import com.codename1.ui.Graphics;
import com.codename1.ui.geom.Dimension;
import com.codename1.ui.geom.Point;

public class River extends Fixed {

    public River(Dimension worldSize) {
        setWorldSize(worldSize);
        setDimension(new Dimension( worldSize.getWidth(),
                              worldSize.getHeight()/8));
        setLocation(new Point(0, worldSize.getHeight()/4));
        setColor(ColorUtil.BLUE);
        System.err.println(worldSize);
    }

    public int width() { return getDimension().getWidth(); }

    public int height() { return getDimension().getHeight(); }

    @Override
    public void draw(Graphics g, Point containerOrigin) {
        g.setColor(getColor());
        g.drawRect( containerOrigin.getX() + getLocation().getX(),
                    containerOrigin.getY() + getLocation().getY(),
                    width(), height());
    }
}
