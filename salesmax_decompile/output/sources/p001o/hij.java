package p001o;

import android.content.Context;
import android.content.IntentFilter;

/* loaded from: classes3.dex */
public final class hij extends pjj {
    public hij(Context context) {
        super(new sjj("AppUpdateListenerRegistry"), new IntentFilter("com.google.android.play.core.install.ACTION_INSTALL_STATUS"), context);
    }
}
