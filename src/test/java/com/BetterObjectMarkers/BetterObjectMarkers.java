package com.BetterObjectMarkers;

import net.runelite.client.RuneLite;
import net.runelite.client.externalplugins.ExternalPluginManager;

public class BetterObjectMarkers
{
	public static void main(String[] args) throws Exception
	{
		ExternalPluginManager.loadBuiltin(BetterObjectMarkersPlugin.class);
		RuneLite.main(args);
	}
}