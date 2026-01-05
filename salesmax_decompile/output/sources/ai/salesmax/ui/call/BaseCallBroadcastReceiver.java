package ai.salesmax.ui.call;

import ai.salesmax.model.CallStateEvent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import j$.time.Instant;
import java.util.ArrayList;
import p001o.e7d;
import p001o.f02;
import p001o.j4d;
import p001o.sq8;

/* loaded from: classes.dex */
public abstract class BaseCallBroadcastReceiver extends BroadcastReceiver {

    /* renamed from: a */
    public long f444a = System.currentTimeMillis();

    /* renamed from: a */
    public final boolean m738a(Context context) {
        sq8.m48649h(context, "context");
        return j4d.m33212S(context);
    }

    /* renamed from: b */
    public final boolean m739b(Context context, Intent intent) {
        sq8.m48649h(context, "context");
        sq8.m48649h(intent, "intent");
        if (!m738a(context)) {
            return false;
        }
        ArrayList arrayList = new ArrayList();
        Bundle extras = intent.getExtras();
        if (extras != null) {
            arrayList = new ArrayList(extras.keySet());
            StringBuilder sb = new StringBuilder();
            sb.append("keys2 : ");
            sb.append(arrayList);
        }
        return arrayList.contains("incoming_number");
    }

    /* renamed from: c */
    public final void m740c(Context context, Intent intent) {
        sq8.m48649h(context, "context");
        sq8.m48649h(intent, "intent");
        String stringExtra = intent.getStringExtra("state");
        String stringExtra2 = intent.getStringExtra("incoming_number");
        String stringExtra3 = intent.getStringExtra("android.intent.extra.PHONE_NUMBER");
        if (stringExtra3 != null) {
            stringExtra2 = stringExtra3;
        } else if (stringExtra2 == null) {
            stringExtra2 = "";
        }
        if (!(stringExtra2.length() == 0)) {
            f02.f22467a.m25914a().m25906i(new CallStateEvent.Builder().state(stringExtra).number(e7d.m24492e(stringExtra2)).eventTime(Long.valueOf(Instant.now().toEpochMilli())).context(context).build());
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Invalid number provided ");
        sb.append(stringExtra2);
    }
}
