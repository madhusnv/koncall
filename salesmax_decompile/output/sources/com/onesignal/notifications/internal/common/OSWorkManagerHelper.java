package com.onesignal.notifications.internal.common;

import android.content.Context;
import androidx.work.Configuration;
import androidx.work.WorkManager;
import com.onesignal.debug.internal.logging.Logging;
import p001o.sq8;

/* loaded from: classes6.dex */
public final class OSWorkManagerHelper {
    public static final OSWorkManagerHelper INSTANCE = new OSWorkManagerHelper();

    private OSWorkManagerHelper() {
    }

    private final void initializeWorkManager(Context context) {
        Configuration configurationBuild;
        try {
            Object applicationContext = context.getApplicationContext();
            Configuration.Provider provider = applicationContext instanceof Configuration.Provider ? (Configuration.Provider) applicationContext : null;
            if (provider == null || (configurationBuild = provider.getWorkManagerConfiguration()) == null) {
                configurationBuild = new Configuration.Builder().build();
            }
            sq8.m48648g(configurationBuild, "(context.applicationCont…uration.Builder().build()");
            WorkManager.initialize(context, configurationBuild);
        } catch (IllegalStateException e) {
            Logging.error("OSWorkManagerHelper initializing WorkManager failed: ", e);
        }
    }

    public final synchronized WorkManager getInstance(Context context) {
        WorkManager workManager;
        sq8.m48649h(context, "context");
        try {
            workManager = WorkManager.getInstance(context);
            sq8.m48648g(workManager, "{\n            WorkManage…stance(context)\n        }");
        } catch (IllegalStateException e) {
            Logging.error("OSWorkManagerHelper.getInstance failed, attempting to initialize: ", e);
            initializeWorkManager(context);
            workManager = WorkManager.getInstance(context);
            sq8.m48648g(workManager, "{\n            /*\n       …stance(context)\n        }");
        }
        return workManager;
    }
}
