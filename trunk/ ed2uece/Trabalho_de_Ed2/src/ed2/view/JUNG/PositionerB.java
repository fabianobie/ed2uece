package ed2.view.JUNG;

import java.awt.geom.Point2D;
import java.util.List;

import ed2.view.BGUI;
import edu.uci.ics.jung.algorithms.layout.StaticLayout;
import edu.uci.ics.jung.visualization.VisualizationViewer;

public class PositionerB {
	
	public static void setVerticesPositions(StaticLayout<String, String> staticLayout, 
											VisualizationViewer<String, String> bVV,
											List<String> vertices) 
	{
		Point2D center = new Point2D.Double(bVV.getCenter().getX()/2, bVV.getCenter().getY());
		String vertex = null;
		Point2D point = null;
		
		for (int i = 0; i < vertices.size(); i++) {
			vertex = vertices.get(i);
			if (i ==0) {
				if (vertex != null) {
					point = center;
					if (point != null)
						staticLayout.setLocation(vertex, point);
				}
			} else {
				point = new Point2D.Double(staticLayout.getX(vertices.get(i-1))+BGUI.VERTEX_WIDTH+2, 
												   staticLayout.getY(vertices.get(i-1)));
				if (point != null)
					staticLayout.setLocation(vertex, point);
				
			}
			point = null;
		}
		staticLayout.lock(true);
	}

}
