package p001o;

import com.google.firebase.analytics.FirebaseAnalytics;

/* loaded from: classes3.dex */
public abstract class s9 implements qja {

    /* renamed from: b */
    public final vja f45000b;

    /* renamed from: o.s9$a */
    public /* synthetic */ class C16785a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f45001a;

        static {
            int[] iArr = new int[fja.values().length];
            try {
                iArr[fja.Trace.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[fja.Debug.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[fja.Info.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[fja.Warning.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[fja.Error.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f45001a = iArr;
        }
    }

    public s9(vja vjaVar) {
        sq8.m48649h(vjaVar, "delegate");
        this.f45000b = vjaVar;
    }

    @Override // p001o.qja
    /* renamed from: b */
    public void mo18185b(Throwable th, uk7 uk7Var) {
        sq8.m48649h(uk7Var, "msg");
        if (mo18188e(fja.Info)) {
            if (th != null) {
                this.f45000b.mo20735h((String) uk7Var.invoke(), th);
            } else {
                this.f45000b.info((String) uk7Var.invoke());
            }
        }
    }

    @Override // p001o.qja
    /* renamed from: c */
    public void mo18186c(Throwable th, uk7 uk7Var) {
        sq8.m48649h(uk7Var, "msg");
        if (mo18188e(fja.Warning)) {
            if (th != null) {
                this.f45000b.warn((String) uk7Var.invoke(), th);
            } else {
                this.f45000b.warn((String) uk7Var.invoke());
            }
        }
    }

    @Override // p001o.qja
    /* renamed from: d */
    public void mo18187d(Throwable th, uk7 uk7Var) {
        sq8.m48649h(uk7Var, "msg");
        if (mo18188e(fja.Debug)) {
            if (th != null) {
                this.f45000b.mo20729b((String) uk7Var.invoke(), th);
            } else {
                this.f45000b.debug((String) uk7Var.invoke());
            }
        }
    }

    @Override // p001o.qja
    /* renamed from: e */
    public boolean mo18188e(fja fjaVar) {
        sq8.m48649h(fjaVar, FirebaseAnalytics.Param.LEVEL);
        int i = C16785a.f45001a[fjaVar.ordinal()];
        if (i == 1) {
            return this.f45000b.isTraceEnabled();
        }
        if (i == 2) {
            return this.f45000b.isDebugEnabled();
        }
        if (i == 3) {
            return this.f45000b.isInfoEnabled();
        }
        if (i == 4) {
            return this.f45000b.isWarnEnabled();
        }
        if (i == 5) {
            return this.f45000b.isErrorEnabled();
        }
        throw new szb();
    }

    @Override // p001o.qja
    /* renamed from: f */
    public void mo18189f(Throwable th, uk7 uk7Var) {
        sq8.m48649h(uk7Var, "msg");
        if (mo18188e(fja.Trace)) {
            if (th != null) {
                this.f45000b.mo20736i((String) uk7Var.invoke(), th);
            } else {
                this.f45000b.mo20739l((String) uk7Var.invoke());
            }
        }
    }

    /* renamed from: g */
    public void m48028g(Throwable th, uk7 uk7Var) {
        sq8.m48649h(uk7Var, "msg");
        if (mo18188e(fja.Error)) {
            if (th != null) {
                this.f45000b.error((String) uk7Var.invoke(), th);
            } else {
                this.f45000b.error((String) uk7Var.invoke());
            }
        }
    }

    /* renamed from: h */
    public final vja m48029h() {
        return this.f45000b;
    }
}
