package w8;

import ak.CallableC0167f;
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import c9.C0912g;
import c9.C0914i;
import c9.C0915j;
import kotlin.jvm.internal.AbstractC4154l;
import nf.C5047i;
import qc.C6158d;
import t8.C7077w;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: w8.a */
/* loaded from: classes.dex */
public abstract class AbstractC7950a {

    /* renamed from: a */
    public static final /* synthetic */ int f38237a = 0;

    static {
        C7077w.m13372b("Alarms");
    }

    /* renamed from: a */
    public static void m15125a(Context context, C0915j c0915j, int i10) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        int i11 = C7951b.f38238f;
        Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_DELAY_MET");
        C7951b.m15128d(intent, c0915j);
        PendingIntent service = PendingIntent.getService(context, i10, intent, 603979776);
        if (service == null || alarmManager == null) {
            return;
        }
        C7077w c7077wM13371a = C7077w.m13371a();
        c0915j.toString();
        c7077wM13371a.getClass();
        alarmManager.cancel(service);
    }

    /* renamed from: b */
    public static void m15126b(Context context, WorkDatabase workDatabase, C0915j c0915j, long j6) {
        C0914i c0914iMo1372z = workDatabase.mo1372z();
        C0912g c0912gM2629i = c0914iMo1372z.m2629i(c0915j);
        if (c0912gM2629i != null) {
            int i10 = c0912gM2629i.f5583c;
            m15125a(context, c0915j, i10);
            AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
            int i11 = C7951b.f38238f;
            Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
            intent.setAction("ACTION_DELAY_MET");
            C7951b.m15128d(intent, c0915j);
            PendingIntent service = PendingIntent.getService(context, i10, intent, 201326592);
            if (alarmManager != null) {
                alarmManager.setExact(0, j6, service);
                return;
            }
            return;
        }
        Object objM16398u = workDatabase.m16398u(new C6158d(20, new CallableC0167f(2, new C5047i(workDatabase))));
        AbstractC4154l.m8922e(objM16398u, "workDatabase.runInTransa…NAGER_ID_KEY) }\n        )");
        int iIntValue = ((Number) objM16398u).intValue();
        c0914iMo1372z.m2631k(new C0912g(c0915j.f5589a, c0915j.f5590b, iIntValue));
        AlarmManager alarmManager2 = (AlarmManager) context.getSystemService("alarm");
        int i12 = C7951b.f38238f;
        Intent intent2 = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent2.setAction("ACTION_DELAY_MET");
        C7951b.m15128d(intent2, c0915j);
        PendingIntent service2 = PendingIntent.getService(context, iIntValue, intent2, 201326592);
        if (alarmManager2 != null) {
            alarmManager2.setExact(0, j6, service2);
        }
    }
}
