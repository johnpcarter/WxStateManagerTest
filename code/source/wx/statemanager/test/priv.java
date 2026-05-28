package wx.statemanager.test;

// -----( IS Java Code Template v1.2

import com.wm.data.*;
import com.wm.util.Values;
import com.wm.app.b2b.server.Service;
import com.wm.app.b2b.server.ServiceException;
// --- <<IS-START-IMPORTS>> ---
import com.wm.app.b2b.server.ServerAPI;
import com.wm.data.IData;
import com.webmethods.is.util.IDataMap;
// --- <<IS-END-IMPORTS>> ---

public final class priv

{
	// ---( internal utility methods )---

	final static priv _instance = new priv();

	static priv _newInstance() { return new priv(); }

	static priv _cast(Object o) { return (priv)o; }

	// ---( server methods )---




	public static final void getHostName (IData pipeline)
        throws ServiceException
	{
		// --- <<IS-START(getHostName)>> ---
		// @sigtype java 3.5
		// [o] field:0:required hostname
		new IDataMap(pipeline).put("hostname", ServerAPI.getServerName());
		// --- <<IS-END>> ---

                
	}
}

