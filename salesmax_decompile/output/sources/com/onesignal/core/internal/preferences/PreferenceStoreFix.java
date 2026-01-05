package com.onesignal.core.internal.preferences;

import android.content.Context;
import com.onesignal.debug.LogLevel;
import com.onesignal.debug.internal.logging.Logging;
import java.io.File;
import p001o.a07;
import p001o.sq8;

/* loaded from: classes6.dex */
public final class PreferenceStoreFix {
    public static final PreferenceStoreFix INSTANCE = new PreferenceStoreFix();

    private PreferenceStoreFix() {
    }

    public final void ensureNoObfuscatedPrefStore(Context context) {
        File[] fileArrListFiles;
        sq8.m48649h(context, "context");
        try {
            File file = new File(context.getDataDir(), "shared_prefs");
            File file2 = new File(file, "OneSignal.xml");
            if (!file.exists() || !file.isDirectory() || file2.exists() || (fileArrListFiles = file.listFiles()) == null) {
                return;
            }
            for (File file3 : fileArrListFiles) {
                sq8.m48648g(file3, "prefsFile");
                if (context.getSharedPreferences(a07.m16289l(file3), 0).contains(PreferenceOneSignalKeys.PREFS_LEGACY_PLAYER_ID)) {
                    file3.renameTo(file2);
                    return;
                }
            }
        } catch (Throwable th) {
            Logging.log(LogLevel.ERROR, "error attempting to fix obfuscated preference store", th);
        }
    }
}
