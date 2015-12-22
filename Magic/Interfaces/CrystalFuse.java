package Reika.ChromatiCraft.Magic.Interfaces;

import Reika.ChromatiCraft.Registry.CrystalElement;


public interface CrystalFuse extends CrystalNetworkTile {

	/** Non-fuse tiles have a failure weight of 1. */
	public float getFailureWeight(CrystalElement e);

	public void overload(CrystalElement e);

}