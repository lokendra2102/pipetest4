
import java.util.logging.Level;
import java.util.logging.Logger;

import com.catalyst.Context;
import com.catalyst.cron.CRON_STATUS;
import com.catalyst.cron.CronRequest;
import com.catalyst.cron.CatalystCronHandler;

import com.zc.common.ZCProject;
import com.zc.component.cache.ZCCache;

public class Tess implements CatalystCronHandler {

	private static final Logger LOGGER = Logger.getLogger(Tess.class.getName());

	@Override
	public CRON_STATUS handleCronExecute(CronRequest request, Context arg1) throws Exception {
		try {
			ZCProject.initProject();
			Integer remainingExec = request.getRemainingExecutionCount();
			LOGGER.log(Level.SEVERE, "Remaining " + remainingExec);
			// Object eventData = request.getAllArgument();
			// LOGGER.log(Level.SEVERE, "Data is" + eventData.toString());
			LOGGER.log(Level.SEVERE, "Project Details " + request.getProjectDetails().toString());
			ZCCache.getInstance().putCacheValue("Tess", "Working", 1l);
			LOGGER.log(Level.SEVERE, "Inserted SucessFully:)");
		} catch (Exception e) {
			LOGGER.log(Level.SEVERE, "Exception in Cron Function", e);
			return CRON_STATUS.FAILURE;
		}
		return CRON_STATUS.SUCCESS;
	}

}
