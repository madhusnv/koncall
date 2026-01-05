package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Base64;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.AlarmManagerSchedulerBroadcastReceiver;
import p001o.cxh;
import p001o.iid;
import p001o.qwh;

/* loaded from: classes5.dex */
public class AlarmManagerSchedulerBroadcastReceiver extends BroadcastReceiver {
    /* renamed from: b */
    public static /* synthetic */ void m13640b() {
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        String queryParameter = intent.getData().getQueryParameter("backendName");
        String queryParameter2 = intent.getData().getQueryParameter("extras");
        int iIntValue = Integer.valueOf(intent.getData().getQueryParameter("priority")).intValue();
        int i = intent.getExtras().getInt("attemptNumber");
        cxh.m22043f(context);
        qwh.AbstractC16484a abstractC16484aMo45900d = qwh.m45891a().mo45898b(queryParameter).mo45900d(iid.m32180b(iIntValue));
        if (queryParameter2 != null) {
            abstractC16484aMo45900d.mo45899c(Base64.decode(queryParameter2, 0));
        }
        cxh.m22041c().m22046e().m52448v(abstractC16484aMo45900d.mo45897a(), i, new Runnable() { // from class: o.l90
            @Override // java.lang.Runnable
            public final void run() {
                AlarmManagerSchedulerBroadcastReceiver.m13640b();
            }
        });
    }
}
