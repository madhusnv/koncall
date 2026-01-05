package com.onesignal.notifications.internal.badges.impl.shortcutbadger;

import android.content.ComponentName;
import android.content.Context;
import java.util.List;

/* loaded from: classes6.dex */
public interface Badger {
    void executeBadge(Context context, ComponentName componentName, int i);

    List<String> getSupportLaunchers();
}
