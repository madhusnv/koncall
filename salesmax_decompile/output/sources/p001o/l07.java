package p001o;

import com.google.firebase.crashlytics.FirebaseCrashlytics;
import com.onesignal.core.internal.database.impl.OneSignalDbContract;
import com.onesignal.session.internal.outcomes.impl.OutcomeEventsTable;
import java.util.Map;

/* loaded from: classes.dex */
public final class l07 {

    /* renamed from: a */
    public static final l07 f32907a = new l07();

    /* renamed from: c */
    public static /* synthetic */ void m36402c(l07 l07Var, String str, Throwable th, Map map, int i, Object obj) {
        if ((i & 4) != 0) {
            map = isa.m32681h();
        }
        l07Var.m36404a(str, th, map);
    }

    /* renamed from: d */
    public static /* synthetic */ void m36403d(l07 l07Var, String str, Map map, int i, Object obj) {
        if ((i & 2) != 0) {
            map = isa.m32681h();
        }
        l07Var.m36405b(str, map);
    }

    /* renamed from: a */
    public final void m36404a(String str, Throwable th, Map map) {
        sq8.m48649h(str, OneSignalDbContract.NotificationTable.COLUMN_NAME_MESSAGE);
        sq8.m48649h(th, "exception");
        sq8.m48649h(map, OutcomeEventsTable.COLUMN_NAME_PARAMS);
        FirebaseCrashlytics firebaseCrashlytics = FirebaseCrashlytics.getInstance();
        for (Map.Entry entry : map.entrySet()) {
            String str2 = (String) entry.getKey();
            String str3 = (String) entry.getValue();
            if (str3 != null) {
                firebaseCrashlytics.setCustomKey(str2, str3);
            }
        }
        firebaseCrashlytics.recordException(new RuntimeException(str, th));
    }

    /* renamed from: b */
    public final void m36405b(String str, Map map) {
        sq8.m48649h(str, OneSignalDbContract.NotificationTable.COLUMN_NAME_MESSAGE);
        sq8.m48649h(map, OutcomeEventsTable.COLUMN_NAME_PARAMS);
        FirebaseCrashlytics firebaseCrashlytics = FirebaseCrashlytics.getInstance();
        for (Map.Entry entry : map.entrySet()) {
            String str2 = (String) entry.getKey();
            String str3 = (String) entry.getValue();
            if (str3 != null) {
                firebaseCrashlytics.setCustomKey(str2, str3);
            }
        }
        firebaseCrashlytics.recordException(new RuntimeException(str));
    }
}
