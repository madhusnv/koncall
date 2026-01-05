package androidx.compose.ui.focus;

import p001o.alb;
import p001o.f77;
import p001o.fqb;
import p001o.id5;
import p001o.kf9;
import p001o.sk5;
import p001o.sq8;
import p001o.xk7;
import p001o.zzb;

/* renamed from: androidx.compose.ui.focus.e */
/* loaded from: classes2.dex */
public final class C1931e {

    /* renamed from: b */
    public static final a f6273b = new a(null);

    /* renamed from: c */
    public static final C1931e f6274c = new C1931e();

    /* renamed from: d */
    public static final C1931e f6275d = new C1931e();

    /* renamed from: a */
    public final fqb f6276a = new fqb(new f77[16], 0);

    /* renamed from: androidx.compose.ui.focus.e$a */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(id5 id5Var) {
            this();
        }

        /* renamed from: a */
        public final C1931e m4909a() {
            return C1931e.f6275d;
        }

        /* renamed from: b */
        public final C1931e m4910b() {
            return C1931e.f6274c;
        }
    }

    /* renamed from: androidx.compose.ui.focus.e$b */
    public static final class b extends kf9 implements xk7 {

        /* renamed from: a */
        public static final b f6277a = new b();

        public b() {
            super(1);
        }

        @Override // p001o.xk7
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(C1932f c1932f) {
            sq8.m48649h(c1932f, "it");
            return Boolean.valueOf(AbstractC1933g.m4923j(c1932f));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:68:0x0064, code lost:
    
        continue;
     */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m4908c() {
        a aVar = f6273b;
        if (!(this != aVar.m4910b())) {
            throw new IllegalStateException("\n    Please check whether the focusRequester is FocusRequester.Cancel or FocusRequester.Default\n    before invoking any functions on the focusRequester.\n".toString());
        }
        if (!(this != aVar.m4909a())) {
            throw new IllegalStateException("\n    Please check whether the focusRequester is FocusRequester.Cancel or FocusRequester.Default\n    before invoking any functions on the focusRequester.\n".toString());
        }
        if (!this.f6276a.m27357r()) {
            throw new IllegalStateException("\n   FocusRequester is not initialized. Here are some possible fixes:\n\n   1. Remember the FocusRequester: val focusRequester = remember { FocusRequester() }\n   2. Did you forget to add a Modifier.focusRequester() ?\n   3. Are you attempting to request focus during composition? Focus requests should be made in\n   response to some event. Eg Modifier.clickable { focusRequester.requestFocus() }\n".toString());
        }
        fqb fqbVar = this.f6276a;
        int iM27354o = fqbVar.m27354o();
        if (iM27354o <= 0) {
            return false;
        }
        Object[] objArrM27353n = fqbVar.m27353n();
        int i = 0;
        boolean z = false;
        do {
            f77 f77Var = (f77) objArrM27353n[i];
            int iM60153a = zzb.m60153a(1024);
            if (!f77Var.mo17377h().m17361J()) {
                throw new IllegalStateException("visitChildren called on an unattached node".toString());
            }
            fqb fqbVar2 = new fqb(new alb.AbstractC12216c[16], 0);
            alb.AbstractC12216c abstractC12216cM17353B = f77Var.mo17377h().m17353B();
            if (abstractC12216cM17353B == null) {
                sk5.m48431c(fqbVar2, f77Var.mo17377h());
            } else {
                fqbVar2.m27344c(abstractC12216cM17353B);
            }
            while (true) {
                if (!fqbVar2.m27357r()) {
                    break;
                }
                alb.AbstractC12216c abstractC12216cM48434f = (alb.AbstractC12216c) fqbVar2.m27361v(fqbVar2.m27354o() - 1);
                if ((abstractC12216cM48434f.m17352A() & iM60153a) == 0) {
                    sk5.m48431c(fqbVar2, abstractC12216cM48434f);
                } else {
                    while (true) {
                        if (abstractC12216cM48434f == null) {
                            break;
                        }
                        if ((abstractC12216cM48434f.m17356E() & iM60153a) != 0) {
                            while (abstractC12216cM48434f != null) {
                                if (abstractC12216cM48434f instanceof C1932f) {
                                    C1932f c1932f = (C1932f) abstractC12216cM48434f;
                                    if (c1932f.e0().mo4900j() ? AbstractC1933g.m4923j(c1932f) : AbstractC1936j.m4953k(c1932f, C1928b.f6246b.m4886b(), b.f6277a)) {
                                        z = true;
                                        break;
                                    }
                                } else if ((abstractC12216cM48434f.m17356E() & iM60153a) != 0) {
                                }
                                abstractC12216cM48434f = sk5.m48434f(null);
                            }
                        } else {
                            abstractC12216cM48434f = abstractC12216cM48434f.m17353B();
                        }
                    }
                }
            }
            i++;
        } while (i < iM27354o);
        return z;
    }
}
