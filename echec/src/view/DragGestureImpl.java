package view;


import java.awt.Cursor;
import java.awt.dnd.DnDConstants;
import java.awt.dnd.DragGestureEvent;
import java.awt.dnd.DragGestureListener;
import java.awt.dnd.DragSource;

import javax.swing.ImageIcon;


public class DragGestureImpl implements DragGestureListener{

	@Override
	public void dragGestureRecognized(DragGestureEvent event) {
		Cursor cursor = null;
		ImageLabel imglbl = (ImageLabel) event.getComponent();

		if (event.getDragAction() == DnDConstants.ACTION_COPY) {
			cursor = DragSource.DefaultCopyDrop;
		}
		ImageIcon img = imglbl.getImg();

		event.startDrag(cursor, new TransferablePiece(img));
	}

}
