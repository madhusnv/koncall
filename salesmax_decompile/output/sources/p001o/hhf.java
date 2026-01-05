package p001o;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import com.facebook.C10773c;
import java.util.UUID;

/* loaded from: classes5.dex */
public final class hhf {

    /* renamed from: g */
    public static final C13971a f26995g = new C13971a(null);

    /* renamed from: a */
    public final Long f26996a;

    /* renamed from: b */
    public Long f26997b;

    /* renamed from: c */
    public UUID f26998c;

    /* renamed from: d */
    public int f26999d;

    /* renamed from: e */
    public Long f27000e;

    /* renamed from: f */
    public mzf f27001f;

    /* renamed from: o.hhf$a */
    public static final class C13971a {
        public C13971a() {
        }

        public /* synthetic */ C13971a(id5 id5Var) {
            this();
        }

        /* renamed from: a */
        public final void m30602a() {
            SharedPreferences.Editor editorEdit = PreferenceManager.getDefaultSharedPreferences(C10773c.m13019l()).edit();
            editorEdit.remove("com.facebook.appevents.SessionInfo.sessionStartTime");
            editorEdit.remove("com.facebook.appevents.SessionInfo.sessionEndTime");
            editorEdit.remove("com.facebook.appevents.SessionInfo.interruptionCount");
            editorEdit.remove("com.facebook.appevents.SessionInfo.sessionId");
            editorEdit.apply();
            mzf.f36139c.m39920a();
        }

        /* renamed from: b */
        public final hhf m30603b() {
            SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(C10773c.m13019l());
            long j = defaultSharedPreferences.getLong("com.facebook.appevents.SessionInfo.sessionStartTime", 0L);
            long j2 = defaultSharedPreferences.getLong("com.facebook.appevents.SessionInfo.sessionEndTime", 0L);
            String string = defaultSharedPreferences.getString("com.facebook.appevents.SessionInfo.sessionId", null);
            if (j == 0 || j2 == 0 || string == null) {
                return null;
            }
            hhf hhfVar = new hhf(Long.valueOf(j), Long.valueOf(j2), null, 4, null);
            hhfVar.f26999d = defaultSharedPreferences.getInt("com.facebook.appevents.SessionInfo.interruptionCount", 0);
            hhfVar.m30600l(mzf.f36139c.m39921b());
            hhfVar.m30597i(Long.valueOf(System.currentTimeMillis()));
            UUID uuidFromString = UUID.fromString(string);
            sq8.m48648g(uuidFromString, "fromString(sessionIDStr)");
            hhfVar.m30598j(uuidFromString);
            return hhfVar;
        }
    }

    public hhf(Long l, Long l2, UUID uuid) {
        sq8.m48649h(uuid, "sessionId");
        this.f26996a = l;
        this.f26997b = l2;
        this.f26998c = uuid;
    }

    /* renamed from: b */
    public final Long m30590b() {
        Long l = this.f27000e;
        if (l == null) {
            return 0L;
        }
        return l;
    }

    /* renamed from: c */
    public final int m30591c() {
        return this.f26999d;
    }

    /* renamed from: d */
    public final UUID m30592d() {
        return this.f26998c;
    }

    /* renamed from: e */
    public final Long m30593e() {
        return this.f26997b;
    }

    /* renamed from: f */
    public final long m30594f() {
        Long l;
        if (this.f26996a == null || (l = this.f26997b) == null) {
            return 0L;
        }
        if (l != null) {
            return l.longValue() - this.f26996a.longValue();
        }
        throw new IllegalStateException("Required value was null.".toString());
    }

    /* renamed from: g */
    public final mzf m30595g() {
        return this.f27001f;
    }

    /* renamed from: h */
    public final void m30596h() {
        this.f26999d++;
    }

    /* renamed from: i */
    public final void m30597i(Long l) {
        this.f27000e = l;
    }

    /* renamed from: j */
    public final void m30598j(UUID uuid) {
        sq8.m48649h(uuid, "<set-?>");
        this.f26998c = uuid;
    }

    /* renamed from: k */
    public final void m30599k(Long l) {
        this.f26997b = l;
    }

    /* renamed from: l */
    public final void m30600l(mzf mzfVar) {
        this.f27001f = mzfVar;
    }

    /* renamed from: m */
    public final void m30601m() {
        SharedPreferences.Editor editorEdit = PreferenceManager.getDefaultSharedPreferences(C10773c.m13019l()).edit();
        Long l = this.f26996a;
        editorEdit.putLong("com.facebook.appevents.SessionInfo.sessionStartTime", l != null ? l.longValue() : 0L);
        Long l2 = this.f26997b;
        editorEdit.putLong("com.facebook.appevents.SessionInfo.sessionEndTime", l2 != null ? l2.longValue() : 0L);
        editorEdit.putInt("com.facebook.appevents.SessionInfo.interruptionCount", this.f26999d);
        editorEdit.putString("com.facebook.appevents.SessionInfo.sessionId", this.f26998c.toString());
        editorEdit.apply();
        mzf mzfVar = this.f27001f;
        if (mzfVar == null || mzfVar == null) {
            return;
        }
        mzfVar.m39919a();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ hhf(Long l, Long l2, UUID uuid, int i, id5 id5Var) {
        if ((i & 4) != 0) {
            uuid = UUID.randomUUID();
            sq8.m48648g(uuid, "randomUUID()");
        }
        this(l, l2, uuid);
    }
}
