package androidx.work;

import android.content.Context;
import androidx.work.Configuration;
import java.util.Collections;
import java.util.List;
import p001o.pi8;

/* loaded from: classes2.dex */
public final class WorkManagerInitializer implements pi8 {
    private static final String TAG = Logger.tagWithPrefix("WrkMgrInitializer");

    @Override // p001o.pi8
    public List<Class<? extends pi8>> dependencies() {
        return Collections.emptyList();
    }

    @Override // p001o.pi8
    public WorkManager create(Context context) {
        Logger.get().debug(TAG, "Initializing WorkManager with default configuration.");
        WorkManager.initialize(context, new Configuration.Builder().build());
        return WorkManager.getInstance(context);
    }
}
