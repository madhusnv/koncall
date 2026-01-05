package p001o;

import java.util.ArrayList;
import java.util.List;
import p001o.vre;

/* loaded from: classes2.dex */
public final class dh9 {

    /* renamed from: a */
    public final Object f19836a = new Object();

    /* renamed from: b */
    public List f19837b = new ArrayList();

    /* renamed from: c */
    public List f19838c = new ArrayList();

    /* renamed from: d */
    public boolean f19839d = true;

    /* renamed from: o.dh9$a */
    public static final class C12912a extends kf9 implements xk7 {

        /* renamed from: b */
        public final /* synthetic */ xb2 f19841b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C12912a(xb2 xb2Var) {
            super(1);
            this.f19841b = xb2Var;
        }

        @Override // p001o.xk7
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return y3i.f54824a;
        }

        public final void invoke(Throwable th) {
            Object obj = dh9.this.f19836a;
            dh9 dh9Var = dh9.this;
            xb2 xb2Var = this.f19841b;
            synchronized (obj) {
                dh9Var.f19837b.remove(xb2Var);
                y3i y3iVar = y3i.f54824a;
            }
        }
    }

    /* renamed from: c */
    public final Object m23093c(n64 n64Var) {
        if (m23095e()) {
            return y3i.f54824a;
        }
        zb2 zb2Var = new zb2(tq8.m50336c(n64Var), 1);
        zb2Var.m59116E();
        synchronized (this.f19836a) {
            this.f19837b.add(zb2Var);
        }
        zb2Var.mo48694y(new C12912a(zb2Var));
        Object objM59140v = zb2Var.m59140v();
        if (objM59140v == uq8.m51918f()) {
            n75.m40201c(n64Var);
        }
        return objM59140v == uq8.m51918f() ? objM59140v : y3i.f54824a;
    }

    /* renamed from: d */
    public final void m23094d() {
        synchronized (this.f19836a) {
            this.f19839d = false;
            y3i y3iVar = y3i.f54824a;
        }
    }

    /* renamed from: e */
    public final boolean m23095e() {
        boolean z;
        synchronized (this.f19836a) {
            z = this.f19839d;
        }
        return z;
    }

    /* renamed from: f */
    public final void m23096f() {
        synchronized (this.f19836a) {
            if (m23095e()) {
                return;
            }
            List list = this.f19837b;
            this.f19837b = this.f19838c;
            this.f19838c = list;
            this.f19839d = true;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                n64 n64Var = (n64) list.get(i);
                vre.C17665a c17665a = vre.f50797b;
                n64Var.resumeWith(vre.m53351b(y3i.f54824a));
            }
            list.clear();
            y3i y3iVar = y3i.f54824a;
        }
    }
}
