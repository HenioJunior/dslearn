package com.crystaldata.dslearn.observers;

import com.crystaldata.dslearn.entities.Deliver;

public interface DeliverRevisionObserver {
	
	void onSaveRevision(Deliver deliver);

}
