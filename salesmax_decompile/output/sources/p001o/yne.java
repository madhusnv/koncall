package p001o;

import com.onesignal.core.internal.database.impl.OneSignalDbContract;

/* loaded from: classes.dex */
public final class yne {

    /* renamed from: e */
    public static final C18447a f55736e = new C18447a(null);

    /* renamed from: f */
    public static final int f55737f = 8;

    /* renamed from: a */
    public final q5g f55738a;

    /* renamed from: b */
    public final Object f55739b;

    /* renamed from: c */
    public final String f55740c;

    /* renamed from: d */
    public final Throwable f55741d;

    /* renamed from: o.yne$a */
    public static final class C18447a {
        public C18447a() {
        }

        public /* synthetic */ C18447a(id5 id5Var) {
            this();
        }

        /* renamed from: b */
        public static /* synthetic */ yne m58027b(C18447a c18447a, Object obj, String str, Throwable th, int i, Object obj2) {
            if ((i & 4) != 0) {
                th = null;
            }
            return c18447a.m58028a(obj, str, th);
        }

        /* renamed from: a */
        public final yne m58028a(Object obj, String str, Throwable th) {
            sq8.m48649h(str, OneSignalDbContract.NotificationTable.COLUMN_NAME_MESSAGE);
            return new yne(q5g.ERROR, obj, str, th);
        }

        /* renamed from: c */
        public final yne m58029c(Object obj) {
            return new yne(q5g.LOADING, obj, null, null, 8, null);
        }

        /* renamed from: d */
        public final yne m58030d(Object obj) {
            return new yne(q5g.SUCCESS, obj, null, null, 8, null);
        }
    }

    public yne(q5g q5gVar, Object obj, String str, Throwable th) {
        sq8.m48649h(q5gVar, "status");
        this.f55738a = q5gVar;
        this.f55739b = obj;
        this.f55740c = str;
        this.f55741d = th;
    }

    /* renamed from: a */
    public final Object m58023a() {
        return this.f55739b;
    }

    /* renamed from: b */
    public final String m58024b() {
        return this.f55740c;
    }

    /* renamed from: c */
    public final q5g m58025c() {
        return this.f55738a;
    }

    /* renamed from: d */
    public final Throwable m58026d() {
        return this.f55741d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yne)) {
            return false;
        }
        yne yneVar = (yne) obj;
        return this.f55738a == yneVar.f55738a && sq8.m48644c(this.f55739b, yneVar.f55739b) && sq8.m48644c(this.f55740c, yneVar.f55740c) && sq8.m48644c(this.f55741d, yneVar.f55741d);
    }

    public int hashCode() {
        int iHashCode = this.f55738a.hashCode() * 31;
        Object obj = this.f55739b;
        int iHashCode2 = (iHashCode + (obj == null ? 0 : obj.hashCode())) * 31;
        String str = this.f55740c;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        Throwable th = this.f55741d;
        return iHashCode3 + (th != null ? th.hashCode() : 0);
    }

    public String toString() {
        return "Resource(status=" + this.f55738a + ", data=" + this.f55739b + ", message=" + this.f55740c + ", throwable=" + this.f55741d + ")";
    }

    public /* synthetic */ yne(q5g q5gVar, Object obj, String str, Throwable th, int i, id5 id5Var) {
        this(q5gVar, obj, str, (i & 8) != 0 ? null : th);
    }
}
