import java.util.logging.Logger;

import com.catalyst.integ.CatalystIntegFunctionHandler;
import com.catalyst.integ.ZCIntegRequest;
import com.catalyst.integ.ZCIntegResponse;
import com.zc.cliq.util.ZCCliqUtil;

public class IntegrationJava implements CatalystIntegFunctionHandler {
	Logger LOGGER = Logger.getLogger(IntegrationJava.class.getName());

	@Override
	public ZCIntegResponse runner(ZCIntegRequest req) throws Exception {
		try {
			//Code your app logic
			ZCIntegResponse resp =  ZCCliqUtil.executeHandler(req);
			return resp;  //Do not comment out or delete this line. 
		} catch(Exception ex) {
			//Code your error logic
			throw ex; //Do not comment out or delete this line. 
		}
	}
}
