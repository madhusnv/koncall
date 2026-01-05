package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Base64;
import df.RunnableC1702a;
import df.RunnableC1706e;
import hf.AbstractC2919a;
import io.C3328c;
import java.util.concurrent.Executor;
import ug.C7439j;
import xe.C8357i;
import xe.C8365q;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public class AlarmManagerSchedulerBroadcastReceiver extends BroadcastReceiver {

    /* renamed from: a */
    public static final /* synthetic */ int f5956a = 0;

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        String queryParameter = intent.getData().getQueryParameter("backendName");
        String queryParameter2 = intent.getData().getQueryParameter("extras");
        int iIntValue = Integer.valueOf(intent.getData().getQueryParameter("priority")).intValue();
        int i10 = intent.getExtras().getInt("attemptNumber");
        C8365q.m15537b(context);
        C7439j c7439jM15532a = C8357i.m15532a();
        c7439jM15532a.m13997C(queryParameter);
        c7439jM15532a.f35539d = AbstractC2919a.m7026b(iIntValue);
        if (queryParameter2 != null) {
            c7439jM15532a.f35537b = Base64.decode(queryParameter2, 0);
        }
        C3328c c3328c = C8365q.m15536a().f40023d;
        ((Executor) c3328c.f17613e).execute(new RunnableC1706e(c3328c, c7439jM15532a.m14003n(), i10, new RunnableC1702a(0)));
    }
}
