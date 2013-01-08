package view;


import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;

import javax.swing.ImageIcon;

public class TransferablePiece implements Transferable{
	ImageIcon image;
	DataFlavor dataFlavor;
	public TransferablePiece(ImageIcon img) {
		this.image = img;
		
		 this.dataFlavor = new DataFlavor(ImageIcon.class,
				ImageIcon.class.getSimpleName());
	}
	@Override
	public Object getTransferData(DataFlavor flavor)
			throws UnsupportedFlavorException, IOException {

		if (flavor.equals(dataFlavor))
			return image;
		else
			throw new UnsupportedFlavorException(flavor);
	}

	@Override
	public DataFlavor[] getTransferDataFlavors() {
		return new DataFlavor[] { dataFlavor };
	}

	@Override
	public boolean isDataFlavorSupported(DataFlavor flavor) {
		return flavor.equals(dataFlavor);
	}

}
