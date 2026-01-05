package p001o;

import android.content.Context;
import android.provider.Settings;
import com.amplifyframework.datastore.generated.model.AccountMembership;
import com.google.android.gms.tasks.Task;
import com.google.firebase.installations.FirebaseInstallations;
import java.util.List;
import java.util.UUID;

/* loaded from: classes2.dex */
public final class s07 {

    /* renamed from: b */
    public static Context f44360b;

    /* renamed from: a */
    public static final s07 f44359a = new s07();

    /* renamed from: c */
    public static final int f44361c = 8;

    /* renamed from: o.s07$a */
    public static final class C16700a {

        /* renamed from: a */
        public static final C16700a f44362a = new C16700a();

        /* renamed from: o.s07$a$a */
        public static final class a extends jgg implements nl7 {

            /* renamed from: a */
            public int f44363a;

            /* renamed from: b */
            public final /* synthetic */ AccountMembership f44364b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(AccountMembership accountMembership, n64 n64Var) {
                super(2, n64Var);
                this.f44364b = accountMembership;
            }

            @Override // p001o.vb1
            public final n64 create(Object obj, n64 n64Var) {
                return new a(this.f44364b, n64Var);
            }

            @Override // p001o.vb1
            public final Object invokeSuspend(Object obj) {
                Object objM51918f = uq8.m51918f();
                int i = this.f44363a;
                if (i == 0) {
                    wre.m54934b(obj);
                    s07 s07Var = s07.f44359a;
                    AccountMembership accountMembership = this.f44364b;
                    this.f44363a = 1;
                    obj = s07Var.m47382k(accountMembership, this);
                    if (obj == objM51918f) {
                        return objM51918f;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    wre.m54934b(obj);
                }
                return obj;
            }

            @Override // p001o.nl7
            public final Object invoke(h84 h84Var, n64 n64Var) {
                return ((a) create(h84Var, n64Var)).invokeSuspend(y3i.f54824a);
            }
        }

        /* renamed from: a */
        public static final boolean m47387a(AccountMembership accountMembership) {
            sq8.m48649h(accountMembership, "am");
            return ((Boolean) qm1.m45641b(null, new a(accountMembership, null), 1, null)).booleanValue();
        }
    }

    /* renamed from: o.s07$b */
    public static final class C16701b {

        /* renamed from: a */
        public final String f44365a;

        /* renamed from: b */
        public final String f44366b;

        /* renamed from: c */
        public final String f44367c;

        public C16701b(String str, String str2, String str3) {
            sq8.m48649h(str, "firebaseId");
            sq8.m48649h(str3, "fallbackId");
            this.f44365a = str;
            this.f44366b = str2;
            this.f44367c = str3;
        }

        /* renamed from: a */
        public final String m47388a() {
            return this.f44366b;
        }

        /* renamed from: b */
        public final String m47389b() {
            return this.f44367c;
        }

        /* renamed from: c */
        public final String m47390c() {
            return this.f44365a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C16701b)) {
                return false;
            }
            C16701b c16701b = (C16701b) obj;
            return sq8.m48644c(this.f44365a, c16701b.f44365a) && sq8.m48644c(this.f44366b, c16701b.f44366b) && sq8.m48644c(this.f44367c, c16701b.f44367c);
        }

        public int hashCode() {
            int iHashCode = this.f44365a.hashCode() * 31;
            String str = this.f44366b;
            return ((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.f44367c.hashCode();
        }

        public String toString() {
            return "DeviceIds(firebaseId=" + this.f44365a + ", androidId=" + this.f44366b + ", fallbackId=" + this.f44367c + ")";
        }
    }

    /* renamed from: o.s07$c */
    public static final class C16702c extends o64 {

        /* renamed from: a */
        public /* synthetic */ Object f44368a;

        /* renamed from: c */
        public int f44370c;

        public C16702c(n64 n64Var) {
            super(n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            this.f44368a = obj;
            this.f44370c |= Integer.MIN_VALUE;
            return s07.this.m47375d(this);
        }
    }

    /* renamed from: o.s07$d */
    public static final class C16703d extends o64 {

        /* renamed from: a */
        public Object f44371a;

        /* renamed from: b */
        public /* synthetic */ Object f44372b;

        /* renamed from: d */
        public int f44374d;

        public C16703d(n64 n64Var) {
            super(n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            this.f44372b = obj;
            this.f44374d |= Integer.MIN_VALUE;
            return s07.this.m47376e(this);
        }
    }

    /* renamed from: o.s07$e */
    public static final class C16704e extends o64 {

        /* renamed from: a */
        public Object f44375a;

        /* renamed from: b */
        public /* synthetic */ Object f44376b;

        /* renamed from: d */
        public int f44378d;

        public C16704e(n64 n64Var) {
            super(n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            this.f44376b = obj;
            this.f44378d |= Integer.MIN_VALUE;
            return s07.this.m47378g(this);
        }
    }

    /* renamed from: o.s07$f */
    public static final class C16705f extends o64 {

        /* renamed from: a */
        public Object f44379a;

        /* renamed from: b */
        public /* synthetic */ Object f44380b;

        /* renamed from: d */
        public int f44382d;

        public C16705f(n64 n64Var) {
            super(n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            this.f44380b = obj;
            this.f44382d |= Integer.MIN_VALUE;
            return s07.this.m47382k(null, this);
        }
    }

    /* renamed from: b */
    public final String m47373b() {
        String str = "fallback_" + UUID.randomUUID();
        m47386o("fallbackUUID_", str);
        return str;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0020  */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String m47374c() {
        String string;
        try {
            Context context = f44360b;
            if (context == null) {
                sq8.m48667z("appContext");
                context = null;
            }
            string = Settings.Secure.getString(context.getContentResolver(), "android_id");
        } catch (Exception unused) {
        }
        if (string != null) {
            if (!f44359a.m47383l(string)) {
                string = null;
            }
        }
        if (string == null) {
            return null;
        }
        f44359a.m47386o("android_id", string);
        return string;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m47375d(n64 n64Var) {
        C16702c c16702c;
        if (n64Var instanceof C16702c) {
            c16702c = (C16702c) n64Var;
            int i = c16702c.f44370c;
            if ((i & Integer.MIN_VALUE) != 0) {
                c16702c.f44370c = i - Integer.MIN_VALUE;
            } else {
                c16702c = new C16702c(n64Var);
            }
        }
        Object objM47376e = c16702c.f44368a;
        Object objM51918f = uq8.m51918f();
        int i2 = c16702c.f44370c;
        boolean z = true;
        if (i2 == 0) {
            wre.m54934b(objM47376e);
            c16702c.f44370c = 1;
            objM47376e = m47376e(c16702c);
            if (objM47376e == objM51918f) {
                return objM51918f;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            wre.m54934b(objM47376e);
        }
        C16701b c16701b = (C16701b) objM47376e;
        if (c16701b.m47390c().length() > 0) {
            return c16701b.m47390c();
        }
        String strM47388a = c16701b.m47388a();
        if (strM47388a != null && strM47388a.length() != 0) {
            z = false;
        }
        return !z ? c16701b.m47388a() : c16701b.m47389b();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m47376e(n64 n64Var) {
        C16703d c16703d;
        s07 s07Var;
        if (n64Var instanceof C16703d) {
            c16703d = (C16703d) n64Var;
            int i = c16703d.f44374d;
            if ((i & Integer.MIN_VALUE) != 0) {
                c16703d.f44374d = i - Integer.MIN_VALUE;
            } else {
                c16703d = new C16703d(n64Var);
            }
        }
        Object objM47378g = c16703d.f44372b;
        Object objM51918f = uq8.m51918f();
        int i2 = c16703d.f44374d;
        if (i2 == 0) {
            wre.m54934b(objM47378g);
            c16703d.f44371a = this;
            c16703d.f44374d = 1;
            objM47378g = m47378g(c16703d);
            if (objM47378g == objM51918f) {
                return objM51918f;
            }
            s07Var = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s07Var = (s07) c16703d.f44371a;
            wre.m54934b(objM47378g);
        }
        return new C16701b((String) objM47378g, s07Var.m47374c(), s07Var.m47377f());
    }

    /* renamed from: f */
    public final String m47377f() {
        String strM47379h = m47379h("fallbackUUID_");
        return strM47379h == null ? m47373b() : strM47379h;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:33:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m47378g(n64 n64Var) {
        C16704e c16704e;
        s07 s07Var;
        if (n64Var instanceof C16704e) {
            c16704e = (C16704e) n64Var;
            int i = c16704e.f44378d;
            if ((i & Integer.MIN_VALUE) != 0) {
                c16704e.f44378d = i - Integer.MIN_VALUE;
            } else {
                c16704e = new C16704e(n64Var);
            }
        }
        Object objM20151a = c16704e.f44376b;
        Object objM51918f = uq8.m51918f();
        int i2 = c16704e.f44378d;
        if (i2 == 0) {
            wre.m54934b(objM20151a);
            try {
                Task<String> id = FirebaseInstallations.getInstance().getId();
                sq8.m48648g(id, "getId(...)");
                c16704e.f44375a = this;
                c16704e.f44378d = 1;
                objM20151a = c2h.m20151a(id, c16704e);
                if (objM20151a == objM51918f) {
                    return objM51918f;
                }
                s07Var = this;
            } catch (Exception unused) {
                s07Var = this;
                String strM47379h = s07Var.m47379h("firebase_id");
                if (strM47379h != null) {
                }
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s07Var = (s07) c16704e.f44375a;
            try {
                wre.m54934b(objM20151a);
            } catch (Exception unused2) {
                String strM47379h2 = s07Var.m47379h("firebase_id");
                return strM47379h2 != null ? s07Var.m47373b() : strM47379h2;
            }
        }
        String str = (String) objM20151a;
        s07 s07Var2 = f44359a;
        sq8.m48646e(str);
        s07Var2.m47386o("firebase_id", str);
        sq8.m48646e(objM20151a);
        return (String) objM20151a;
    }

    /* renamed from: h */
    public final String m47379h(String str) {
        Context context = f44360b;
        if (context == null) {
            sq8.m48667z("appContext");
            context = null;
        }
        return context.getSharedPreferences("device_identity", 0).getString(str, null);
    }

    /* renamed from: i */
    public final boolean m47380i(String str) {
        Context context = f44360b;
        if (context == null) {
            sq8.m48667z("appContext");
            context = null;
        }
        return context.getSharedPreferences("device_identity", 0).getBoolean("migrated_" + str, false);
    }

    /* renamed from: j */
    public final void m47381j(Context context) {
        sq8.m48649h(context, "context");
        Context applicationContext = context.getApplicationContext();
        sq8.m48648g(applicationContext, "getApplicationContext(...)");
        f44360b = applicationContext;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: k */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m47382k(AccountMembership accountMembership, n64 n64Var) {
        C16705f c16705f;
        if (n64Var instanceof C16705f) {
            c16705f = (C16705f) n64Var;
            int i = c16705f.f44382d;
            if ((i & Integer.MIN_VALUE) != 0) {
                c16705f.f44382d = i - Integer.MIN_VALUE;
            } else {
                c16705f = new C16705f(n64Var);
            }
        }
        Object objM47376e = c16705f.f44380b;
        Object objM51918f = uq8.m51918f();
        int i2 = c16705f.f44382d;
        if (i2 == 0) {
            wre.m54934b(objM47376e);
            c16705f.f44379a = accountMembership;
            c16705f.f44382d = 1;
            objM47376e = m47376e(c16705f);
            if (objM47376e == objM51918f) {
                return objM51918f;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            accountMembership = (AccountMembership) c16705f.f44379a;
            wre.m54934b(objM47376e);
        }
        C16701b c16701b = (C16701b) objM47376e;
        List<String> allowedDeviceId = accountMembership.getAllowedDeviceId();
        if (!(allowedDeviceId == null || allowedDeviceId.isEmpty())) {
            if (accountMembership.getAllowedDeviceId().contains(c16701b.m47390c())) {
                return ml1.m39301a(true);
            }
            String strM47388a = c16701b.m47388a();
            if (strM47388a != null && accountMembership.getAllowedDeviceId().contains(strM47388a)) {
                f44359a.m47385n(strM47388a, c16701b.m47390c());
                return ml1.m39301a(true);
            }
        }
        return ml1.m39301a(false);
    }

    /* renamed from: l */
    public final boolean m47383l(String str) {
        return (str.length() > 0) && !sq8.m48644c(str, "9774d56d682e549c");
    }

    /* renamed from: m */
    public final void m47384m(String str) {
        Context context = f44360b;
        if (context == null) {
            sq8.m48667z("appContext");
            context = null;
        }
        context.getSharedPreferences("device_identity", 0).edit().putBoolean("migrated_" + str, true).apply();
    }

    /* renamed from: n */
    public final void m47385n(String str, String str2) {
        if (m47380i(str)) {
            return;
        }
        try {
            m47384m(str);
        } catch (Exception unused) {
        }
    }

    /* renamed from: o */
    public final void m47386o(String str, String str2) {
        Context context = f44360b;
        if (context == null) {
            sq8.m48667z("appContext");
            context = null;
        }
        context.getSharedPreferences("device_identity", 0).edit().putString(str, str2).apply();
    }
}
