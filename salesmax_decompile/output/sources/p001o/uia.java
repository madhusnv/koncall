package p001o;

import com.google.firebase.crashlytics.FirebaseCrashlytics;
import com.onesignal.core.internal.database.impl.OneSignalDbContract;
import com.onesignal.session.internal.outcomes.impl.OutcomeEventsTable;
import java.util.Map;

/* loaded from: classes.dex */
public final class uia {

    /* renamed from: a */
    public static final uia f48971a = new uia();

    /* renamed from: b */
    public static /* synthetic */ void m51627b(uia uiaVar, String str, String str2, Throwable th, Map map, int i, Object obj) {
        if ((i & 4) != 0) {
            th = null;
        }
        if ((i & 8) != 0) {
            map = isa.m32681h();
        }
        uiaVar.m51629a(str, str2, th, map);
    }

    /* renamed from: d */
    public static /* synthetic */ void m51628d(uia uiaVar, String str, String str2, Throwable th, Map map, int i, Object obj) {
        if ((i & 4) != 0) {
            th = null;
        }
        if ((i & 8) != 0) {
            map = isa.m32681h();
        }
        uiaVar.m51630c(str, str2, th, map);
    }

    /* renamed from: a */
    public final void m51629a(String str, String str2, Throwable th, Map map) {
        sq8.m48649h(str, "tag");
        sq8.m48649h(str2, OneSignalDbContract.NotificationTable.COLUMN_NAME_MESSAGE);
        sq8.m48649h(map, OutcomeEventsTable.COLUMN_NAME_PARAMS);
        m51631e(str, str2, th, map);
    }

    /* renamed from: c */
    public final void m51630c(String str, String str2, Throwable th, Map map) {
        sq8.m48649h(str, "tag");
        sq8.m48649h(str2, OneSignalDbContract.NotificationTable.COLUMN_NAME_MESSAGE);
        sq8.m48649h(map, OutcomeEventsTable.COLUMN_NAME_PARAMS);
        m51631e(str, str2, th, map);
    }

    /* renamed from: e */
    public final void m51631e(String str, String str2, Throwable th, Map map) {
        sq8.m48649h(str, "tag");
        sq8.m48649h(str2, OneSignalDbContract.NotificationTable.COLUMN_NAME_MESSAGE);
        sq8.m48649h(map, OutcomeEventsTable.COLUMN_NAME_PARAMS);
        lgd.f33763a.m37156a();
        y3i y3iVar = null;
        if (sq8.m48644c(null, Boolean.TRUE)) {
            FirebaseCrashlytics firebaseCrashlytics = FirebaseCrashlytics.getInstance();
            for (Map.Entry entry : map.entrySet()) {
                firebaseCrashlytics.setCustomKey((String) entry.getKey(), (String) entry.getValue());
            }
            if (th != null) {
                firebaseCrashlytics.recordException(th);
                y3iVar = y3i.f54824a;
            }
            if (y3iVar == null) {
                firebaseCrashlytics.recordException(new RuntimeException(str + ": " + str2));
            }
        }
    }
}
