package com.onesignal.inAppMessages.internal.triggers.impl;

import com.onesignal.debug.internal.logging.Logging;
import java.util.Timer;
import java.util.TimerTask;
import p001o.sq8;

/* loaded from: classes6.dex */
public final class DynamicTriggerTimer {
    public static final DynamicTriggerTimer INSTANCE = new DynamicTriggerTimer();

    private DynamicTriggerTimer() {
    }

    public final void scheduleTrigger(TimerTask timerTask, String str, long j) {
        sq8.m48649h(str, "triggerId");
        Logging.debug$default("scheduleTrigger: " + str + " delay: " + j, null, 2, null);
        StringBuilder sb = new StringBuilder();
        sb.append("trigger_timer:");
        sb.append(str);
        new Timer(sb.toString()).schedule(timerTask, j);
    }
}
