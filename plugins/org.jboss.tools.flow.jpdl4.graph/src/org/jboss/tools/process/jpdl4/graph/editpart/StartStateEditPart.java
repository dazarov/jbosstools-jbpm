package org.jboss.tools.process.jpdl4.graph.editpart;

import org.eclipse.draw2d.IFigure;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.graphics.Image;
import org.jboss.tools.flow.editor.editpart.ElementEditPart;
import org.jboss.tools.flow.editor.figure.RectangleElementFigure;
import org.jboss.tools.process.jpdl4.graph.Activator;

public class StartStateEditPart extends ElementEditPart {

    private static final Image ICON = ImageDescriptor.createFromURL(
        Activator.getDefault().getBundle().getEntry("icons/start.gif")).createImage();
    
    protected IFigure createFigure() {
        RectangleElementFigure figure = new RectangleElementFigure();
        figure.setIcon(ICON);
        return figure;
    }

}
