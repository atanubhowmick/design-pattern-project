/*
 * 
 */
package dev.atanu.design.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Atanu Bhowmick
 * 
 */
public class BrushFactory {
	private static final Map<String, Brush> BRUSH_MAP_CACHE = new HashMap<>();

	public static Brush getThickBrush(String color) {
		String key = color + "-THICK";
		Brush brush = BRUSH_MAP_CACHE.get(key);

		if (brush == null) {
			brush = new ThickBrush();
			brush.setColor(color);
			BRUSH_MAP_CACHE.put(key, brush);
		}
		return brush;
	}

	public static Brush getThinBrush(String color) {
		String key = color + "-THIN";
		Brush brush = BRUSH_MAP_CACHE.get(key);

		if (brush == null) {
			brush = new ThinBrush();
			brush.setColor(color);
			BRUSH_MAP_CACHE.put(key, brush);
		}
		return brush;
	}

	public static Brush getMediumBrush(String color) {
		String key = color + "-MEDIUM";
		Brush brush = BRUSH_MAP_CACHE.get(key);

		if (brush == null) {
			brush = new MediumBrush();
			brush.setColor(color);
			BRUSH_MAP_CACHE.put(key, brush);
		}

		return brush;
	}
}
