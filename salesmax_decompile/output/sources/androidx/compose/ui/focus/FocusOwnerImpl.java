package androidx.compose.ui.focus;

import android.view.KeyEvent;
import androidx.compose.ui.focus.C1928b;
import androidx.compose.ui.focus.C1931e;
import androidx.compose.ui.node.C1939a;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.ArrayList;
import org.objectweb.asm.Opcodes;
import p001o.alb;
import p001o.c77;
import p001o.d77;
import p001o.dge;
import p001o.h77;
import p001o.ilb;
import p001o.kf9;
import p001o.mfe;
import p001o.pue;
import p001o.qh9;
import p001o.r67;
import p001o.rk5;
import p001o.rue;
import p001o.sk5;
import p001o.sq8;
import p001o.szb;
import p001o.t67;
import p001o.td4;
import p001o.tq;
import p001o.uc9;
import p001o.xk7;
import p001o.zh9;
import p001o.zzb;

/* loaded from: classes2.dex */
public final class FocusOwnerImpl implements c77 {

    /* renamed from: a */
    public C1932f f6235a;

    /* renamed from: b */
    public final t67 f6236b;

    /* renamed from: c */
    public final alb f6237c;

    /* renamed from: d */
    public qh9 f6238d;

    /* renamed from: androidx.compose.ui.focus.FocusOwnerImpl$a */
    public /* synthetic */ class C1925a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f6239a;

        /* renamed from: b */
        public static final /* synthetic */ int[] f6240b;

        static {
            int[] iArr = new int[td4.values().length];
            try {
                iArr[td4.Redirected.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[td4.Cancelled.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[td4.RedirectCancelled.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[td4.None.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f6239a = iArr;
            int[] iArr2 = new int[h77.values().length];
            try {
                iArr2[h77.Active.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[h77.ActiveParent.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[h77.Captured.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[h77.Inactive.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            f6240b = iArr2;
        }
    }

    /* renamed from: androidx.compose.ui.focus.FocusOwnerImpl$b */
    public static final class C1926b extends kf9 implements xk7 {

        /* renamed from: a */
        public final /* synthetic */ C1932f f6241a;

        /* renamed from: b */
        public final /* synthetic */ int f6242b;

        /* renamed from: c */
        public final /* synthetic */ dge f6243c;

        /* renamed from: androidx.compose.ui.focus.FocusOwnerImpl$b$a */
        public /* synthetic */ class a {

            /* renamed from: a */
            public static final /* synthetic */ int[] f6244a;

            static {
                int[] iArr = new int[td4.values().length];
                try {
                    iArr[td4.Redirected.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[td4.Cancelled.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[td4.RedirectCancelled.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[td4.None.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                f6244a = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C1926b(C1932f c1932f, int i, dge dgeVar) {
            super(1);
            this.f6241a = c1932f;
            this.f6242b = i;
            this.f6243c = dgeVar;
        }

        @Override // p001o.xk7
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(C1932f c1932f) {
            alb.AbstractC12216c abstractC12216c;
            boolean zM4922i;
            C1939a c1939aM59428U;
            sq8.m48649h(c1932f, FirebaseAnalytics.Param.DESTINATION);
            if (sq8.m48644c(c1932f, this.f6241a)) {
                return Boolean.FALSE;
            }
            int iM60153a = zzb.m60153a(1024);
            if (!c1932f.mo17377h().m17361J()) {
                throw new IllegalStateException("visitAncestors called on an unattached node".toString());
            }
            alb.AbstractC12216c abstractC12216cM17358G = c1932f.mo17377h().m17358G();
            zh9 zh9VarM48436h = sk5.m48436h(c1932f);
            loop0: while (true) {
                abstractC12216c = null;
                zM4922i = true;
                if (zh9VarM48436h == null) {
                    break;
                }
                if ((zh9VarM48436h.m59428U().m4987k().m17352A() & iM60153a) != 0) {
                    while (abstractC12216cM17358G != null) {
                        if ((abstractC12216cM17358G.m17356E() & iM60153a) != 0) {
                            for (alb.AbstractC12216c abstractC12216cM48434f = abstractC12216cM17358G; abstractC12216cM48434f != null; abstractC12216cM48434f = sk5.m48434f(null)) {
                                if (abstractC12216cM48434f instanceof C1932f) {
                                    abstractC12216c = abstractC12216cM48434f;
                                    break loop0;
                                }
                                if ((abstractC12216cM48434f.m17356E() & iM60153a) != 0) {
                                }
                            }
                        }
                        abstractC12216cM17358G = abstractC12216cM17358G.m17358G();
                    }
                }
                zh9VarM48436h = zh9VarM48436h.m59431X();
                abstractC12216cM17358G = (zh9VarM48436h == null || (c1939aM59428U = zh9VarM48436h.m59428U()) == null) ? null : c1939aM59428U.m4991o();
            }
            if (abstractC12216c == null) {
                throw new IllegalStateException("Focus search landed at the root.".toString());
            }
            int i = a.f6244a[AbstractC1933g.m4921h(c1932f, this.f6242b).ordinal()];
            if (i != 1) {
                if (i == 2 || i == 3) {
                    this.f6243c.f19803a = true;
                } else {
                    if (i != 4) {
                        throw new szb();
                    }
                    zM4922i = AbstractC1933g.m4922i(c1932f);
                }
            }
            return Boolean.valueOf(zM4922i);
        }
    }

    public FocusOwnerImpl(xk7 xk7Var) {
        sq8.m48649h(xk7Var, "onRequestApplyChangesListener");
        this.f6235a = new C1932f();
        this.f6236b = new t67(xk7Var);
        this.f6237c = new ilb() { // from class: androidx.compose.ui.focus.FocusOwnerImpl$modifier$1
            public boolean equals(Object obj) {
                return obj == this;
            }

            @Override // p001o.ilb
            /* renamed from: f, reason: merged with bridge method [inline-methods] */
            public C1932f mo4865d() {
                return this.f6245b.m4861q();
            }

            @Override // p001o.ilb
            /* renamed from: g, reason: merged with bridge method [inline-methods] */
            public void mo4866e(C1932f c1932f) {
                sq8.m48649h(c1932f, "node");
            }

            public int hashCode() {
                return this.f6245b.m4861q().hashCode();
            }
        };
    }

    @Override // p001o.c77
    /* renamed from: a */
    public void mo4846a() {
        if (this.f6235a.g0() == h77.Inactive) {
            this.f6235a.j0(h77.Active);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v38 */
    /* JADX WARN: Type inference failed for: r1v39 */
    /* JADX WARN: Type inference failed for: r1v40 */
    /* JADX WARN: Type inference failed for: r1v41 */
    /* JADX WARN: Type inference failed for: r1v5, types: [o.alb$c] */
    /* JADX WARN: Type inference failed for: r1v7, types: [o.alb$c] */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v12, types: [o.alb$c] */
    /* JADX WARN: Type inference failed for: r8v17 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v3 */
    @Override // p001o.c77
    /* renamed from: b */
    public boolean mo4847b(rue rueVar) {
        pue pueVar;
        int size;
        C1939a c1939aM59428U;
        ?? M48434f;
        C1939a c1939aM59428U2;
        sq8.m48649h(rueVar, "event");
        C1932f c1932fM4927b = AbstractC1934h.m4927b(this.f6235a);
        if (c1932fM4927b != null) {
            int iM60153a = zzb.m60153a(Opcodes.ACC_ENUM);
            if (!c1932fM4927b.mo17377h().m17361J()) {
                throw new IllegalStateException("visitAncestors called on an unattached node".toString());
            }
            alb.AbstractC12216c abstractC12216cM17358G = c1932fM4927b.mo17377h().m17358G();
            zh9 zh9VarM48436h = sk5.m48436h(c1932fM4927b);
            loop0: while (true) {
                if (zh9VarM48436h == null) {
                    M48434f = 0;
                    break;
                }
                if ((zh9VarM48436h.m59428U().m4987k().m17352A() & iM60153a) != 0) {
                    while (abstractC12216cM17358G != null) {
                        if ((abstractC12216cM17358G.m17356E() & iM60153a) != 0) {
                            M48434f = abstractC12216cM17358G;
                            while (M48434f != 0) {
                                if (M48434f instanceof pue) {
                                    break loop0;
                                }
                                if ((M48434f.m17356E() & iM60153a) != 0) {
                                }
                                M48434f = sk5.m48434f(null);
                            }
                        }
                        abstractC12216cM17358G = abstractC12216cM17358G.m17358G();
                    }
                }
                zh9VarM48436h = zh9VarM48436h.m59431X();
                abstractC12216cM17358G = (zh9VarM48436h == null || (c1939aM59428U2 = zh9VarM48436h.m59428U()) == null) ? null : c1939aM59428U2.m4991o();
            }
            pueVar = (pue) M48434f;
        } else {
            pueVar = null;
        }
        if (pueVar != null) {
            int iM60153a2 = zzb.m60153a(Opcodes.ACC_ENUM);
            if (!pueVar.mo17377h().m17361J()) {
                throw new IllegalStateException("visitAncestors called on an unattached node".toString());
            }
            alb.AbstractC12216c abstractC12216cM17358G2 = pueVar.mo17377h().m17358G();
            zh9 zh9VarM48436h2 = sk5.m48436h(pueVar);
            ArrayList arrayList = null;
            while (zh9VarM48436h2 != null) {
                if ((zh9VarM48436h2.m59428U().m4987k().m17352A() & iM60153a2) != 0) {
                    while (abstractC12216cM17358G2 != null) {
                        if ((abstractC12216cM17358G2.m17356E() & iM60153a2) != 0) {
                            for (alb.AbstractC12216c abstractC12216cM48434f = abstractC12216cM17358G2; abstractC12216cM48434f != null; abstractC12216cM48434f = sk5.m48434f(null)) {
                                if (abstractC12216cM48434f instanceof pue) {
                                    if (arrayList == null) {
                                        arrayList = new ArrayList();
                                    }
                                    arrayList.add(abstractC12216cM48434f);
                                } else if ((abstractC12216cM48434f.m17356E() & iM60153a2) != 0) {
                                }
                            }
                        }
                        abstractC12216cM17358G2 = abstractC12216cM17358G2.m17358G();
                    }
                }
                zh9VarM48436h2 = zh9VarM48436h2.m59431X();
                abstractC12216cM17358G2 = (zh9VarM48436h2 == null || (c1939aM59428U = zh9VarM48436h2.m59428U()) == null) ? null : c1939aM59428U.m4991o();
            }
            if (arrayList != null && arrayList.size() - 1 >= 0) {
                while (true) {
                    int i = size - 1;
                    if (((pue) arrayList.get(size)).mo44214n(rueVar)) {
                        return true;
                    }
                    if (i < 0) {
                        break;
                    }
                    size = i;
                }
            }
            for (?? Mo17377h = pueVar.mo17377h(); Mo17377h != 0; Mo17377h = sk5.m48434f(null)) {
                if (Mo17377h instanceof pue) {
                    if (((pue) Mo17377h).mo44214n(rueVar)) {
                        return true;
                    }
                } else if ((Mo17377h.m17356E() & iM60153a2) != 0) {
                }
            }
            for (?? Mo17377h2 = pueVar.mo17377h(); Mo17377h2 != 0; Mo17377h2 = sk5.m48434f(null)) {
                if (Mo17377h2 instanceof pue) {
                    if (((pue) Mo17377h2).mo44213b(rueVar)) {
                        return true;
                    }
                } else if ((Mo17377h2.m17356E() & iM60153a2) != 0) {
                }
            }
            if (arrayList != null) {
                int size2 = arrayList.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    if (((pue) arrayList.get(i2)).mo44213b(rueVar)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // p001o.c77
    /* renamed from: c */
    public void mo4848c(boolean z, boolean z2) {
        h77 h77Var;
        if (!z) {
            int i = C1925a.f6239a[AbstractC1933g.m4918e(this.f6235a, C1928b.f6246b.m4887c()).ordinal()];
            if (i == 1 || i == 2 || i == 3) {
                return;
            }
        }
        h77 h77VarG0 = this.f6235a.g0();
        if (AbstractC1933g.m4916c(this.f6235a, z, z2)) {
            C1932f c1932f = this.f6235a;
            int i2 = C1925a.f6240b[h77VarG0.ordinal()];
            if (i2 == 1 || i2 == 2 || i2 == 3) {
                h77Var = h77.Active;
            } else {
                if (i2 != 4) {
                    throw new szb();
                }
                h77Var = h77.Inactive;
            }
            c1932f.j0(h77Var);
        }
    }

    @Override // p001o.c77
    /* renamed from: d */
    public void mo4849d(qh9 qh9Var) {
        sq8.m48649h(qh9Var, "<set-?>");
        this.f6238d = qh9Var;
    }

    @Override // p001o.u67
    /* renamed from: e */
    public boolean mo4850e(int i) {
        C1932f c1932fM4927b = AbstractC1934h.m4927b(this.f6235a);
        if (c1932fM4927b == null) {
            return false;
        }
        C1931e c1931eM4926a = AbstractC1934h.m4926a(c1932fM4927b, i, m4860p());
        C1931e.a aVar = C1931e.f6273b;
        if (c1931eM4926a != aVar.m4910b()) {
            return c1931eM4926a != aVar.m4909a() && c1931eM4926a.m4908c();
        }
        dge dgeVar = new dge();
        boolean zM4930e = AbstractC1934h.m4930e(this.f6235a, i, m4860p(), new C1926b(c1932fM4927b, i, dgeVar));
        if (dgeVar.f19803a) {
            return false;
        }
        return zM4930e || m4863s(i);
    }

    @Override // p001o.c77
    /* renamed from: f */
    public boolean mo4851f(KeyEvent keyEvent) {
        C1939a c1939aM59428U;
        sq8.m48649h(keyEvent, "keyEvent");
        C1932f c1932fM4927b = AbstractC1934h.m4927b(this.f6235a);
        if (c1932fM4927b != null) {
            int iM60153a = zzb.m60153a(Opcodes.ACC_DEPRECATED);
            if (!c1932fM4927b.mo17377h().m17361J()) {
                throw new IllegalStateException("visitAncestors called on an unattached node".toString());
            }
            alb.AbstractC12216c abstractC12216cM17358G = c1932fM4927b.mo17377h().m17358G();
            zh9 zh9VarM48436h = sk5.m48436h(c1932fM4927b);
            while (zh9VarM48436h != null) {
                if ((zh9VarM48436h.m59428U().m4987k().m17352A() & iM60153a) != 0) {
                    while (abstractC12216cM17358G != null) {
                        if ((abstractC12216cM17358G.m17356E() & iM60153a) != 0) {
                            for (alb.AbstractC12216c abstractC12216cM48434f = abstractC12216cM17358G; abstractC12216cM48434f != null; abstractC12216cM48434f = sk5.m48434f(null)) {
                                if ((abstractC12216cM48434f.m17356E() & iM60153a) != 0) {
                                }
                            }
                        }
                        abstractC12216cM17358G = abstractC12216cM17358G.m17358G();
                    }
                }
                zh9VarM48436h = zh9VarM48436h.m59431X();
                abstractC12216cM17358G = (zh9VarM48436h == null || (c1939aM59428U = zh9VarM48436h.m59428U()) == null) ? null : c1939aM59428U.m4991o();
            }
            tq.m50332a(null);
        }
        return false;
    }

    @Override // p001o.c77
    /* renamed from: g */
    public void mo4852g(d77 d77Var) {
        sq8.m48649h(d77Var, "node");
        this.f6236b.m49434g(d77Var);
    }

    @Override // p001o.c77
    /* renamed from: h */
    public void mo4853h(C1932f c1932f) {
        sq8.m48649h(c1932f, "node");
        this.f6236b.m49431d(c1932f);
    }

    @Override // p001o.c77
    /* renamed from: i */
    public alb mo4854i() {
        return this.f6237c;
    }

    @Override // p001o.c77
    /* renamed from: j */
    public void mo4855j(r67 r67Var) {
        sq8.m48649h(r67Var, "node");
        this.f6236b.m49433f(r67Var);
    }

    @Override // p001o.c77
    /* renamed from: k */
    public mfe mo4856k() {
        C1932f c1932fM4927b = AbstractC1934h.m4927b(this.f6235a);
        if (c1932fM4927b != null) {
            return AbstractC1934h.m4929d(c1932fM4927b);
        }
        return null;
    }

    @Override // p001o.c77
    /* renamed from: m */
    public void mo4857m() {
        AbstractC1933g.m4916c(this.f6235a, true, true);
    }

    @Override // p001o.u67
    /* renamed from: n */
    public void mo4858n(boolean z) {
        mo4848c(z, true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v3, types: [o.alb$c] */
    /* JADX WARN: Type inference failed for: r2v30 */
    /* JADX WARN: Type inference failed for: r2v31 */
    /* JADX WARN: Type inference failed for: r2v5, types: [o.alb$c] */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v14 */
    /* JADX WARN: Type inference failed for: r8v22 */
    /* JADX WARN: Type inference failed for: r8v23, types: [o.alb$c] */
    /* JADX WARN: Type inference failed for: r8v28 */
    @Override // p001o.c77
    /* renamed from: o */
    public boolean mo4859o(KeyEvent keyEvent) {
        int size;
        C1939a c1939aM59428U;
        ?? M48434f;
        C1939a c1939aM59428U2;
        sq8.m48649h(keyEvent, "keyEvent");
        C1932f c1932fM4927b = AbstractC1934h.m4927b(this.f6235a);
        if (c1932fM4927b == null) {
            throw new IllegalStateException("Event can't be processed because we do not have an active focus target.".toString());
        }
        alb.AbstractC12216c abstractC12216cM4862r = m4862r(c1932fM4927b);
        if (abstractC12216cM4862r == null) {
            int iM60153a = zzb.m60153a(8192);
            if (!c1932fM4927b.mo17377h().m17361J()) {
                throw new IllegalStateException("visitAncestors called on an unattached node".toString());
            }
            alb.AbstractC12216c abstractC12216cM17358G = c1932fM4927b.mo17377h().m17358G();
            zh9 zh9VarM48436h = sk5.m48436h(c1932fM4927b);
            loop0: while (true) {
                if (zh9VarM48436h == null) {
                    M48434f = 0;
                    break;
                }
                if ((zh9VarM48436h.m59428U().m4987k().m17352A() & iM60153a) != 0) {
                    while (abstractC12216cM17358G != null) {
                        if ((abstractC12216cM17358G.m17356E() & iM60153a) != 0) {
                            M48434f = abstractC12216cM17358G;
                            while (M48434f != 0) {
                                if (M48434f instanceof uc9) {
                                    break loop0;
                                }
                                if ((M48434f.m17356E() & iM60153a) != 0) {
                                }
                                M48434f = sk5.m48434f(null);
                            }
                        }
                        abstractC12216cM17358G = abstractC12216cM17358G.m17358G();
                    }
                }
                zh9VarM48436h = zh9VarM48436h.m59431X();
                abstractC12216cM17358G = (zh9VarM48436h == null || (c1939aM59428U2 = zh9VarM48436h.m59428U()) == null) ? null : c1939aM59428U2.m4991o();
            }
            uc9 uc9Var = (uc9) M48434f;
            abstractC12216cM4862r = uc9Var != null ? uc9Var.mo17377h() : null;
        }
        if (abstractC12216cM4862r != null) {
            int iM60153a2 = zzb.m60153a(8192);
            if (!abstractC12216cM4862r.mo17377h().m17361J()) {
                throw new IllegalStateException("visitAncestors called on an unattached node".toString());
            }
            alb.AbstractC12216c abstractC12216cM17358G2 = abstractC12216cM4862r.mo17377h().m17358G();
            zh9 zh9VarM48436h2 = sk5.m48436h(abstractC12216cM4862r);
            ArrayList arrayList = null;
            while (zh9VarM48436h2 != null) {
                if ((zh9VarM48436h2.m59428U().m4987k().m17352A() & iM60153a2) != 0) {
                    while (abstractC12216cM17358G2 != null) {
                        if ((abstractC12216cM17358G2.m17356E() & iM60153a2) != 0) {
                            for (alb.AbstractC12216c abstractC12216cM48434f = abstractC12216cM17358G2; abstractC12216cM48434f != null; abstractC12216cM48434f = sk5.m48434f(null)) {
                                if (abstractC12216cM48434f instanceof uc9) {
                                    if (arrayList == null) {
                                        arrayList = new ArrayList();
                                    }
                                    arrayList.add(abstractC12216cM48434f);
                                } else if ((abstractC12216cM48434f.m17356E() & iM60153a2) != 0) {
                                }
                            }
                        }
                        abstractC12216cM17358G2 = abstractC12216cM17358G2.m17358G();
                    }
                }
                zh9VarM48436h2 = zh9VarM48436h2.m59431X();
                abstractC12216cM17358G2 = (zh9VarM48436h2 == null || (c1939aM59428U = zh9VarM48436h2.m59428U()) == null) ? null : c1939aM59428U.m4991o();
            }
            if (arrayList != null && arrayList.size() - 1 >= 0) {
                while (true) {
                    int i = size - 1;
                    if (((uc9) arrayList.get(size)).mo51361m(keyEvent)) {
                        return true;
                    }
                    if (i < 0) {
                        break;
                    }
                    size = i;
                }
            }
            for (?? Mo17377h = abstractC12216cM4862r.mo17377h(); Mo17377h != 0; Mo17377h = sk5.m48434f(null)) {
                if (Mo17377h instanceof uc9) {
                    if (((uc9) Mo17377h).mo51361m(keyEvent)) {
                        return true;
                    }
                } else if ((Mo17377h.m17356E() & iM60153a2) != 0) {
                }
            }
            for (?? Mo17377h2 = abstractC12216cM4862r.mo17377h(); Mo17377h2 != 0; Mo17377h2 = sk5.m48434f(null)) {
                if (Mo17377h2 instanceof uc9) {
                    if (((uc9) Mo17377h2).mo51362q(keyEvent)) {
                        return true;
                    }
                } else if ((Mo17377h2.m17356E() & iM60153a2) != 0) {
                }
            }
            if (arrayList != null) {
                int size2 = arrayList.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    if (((uc9) arrayList.get(i2)).mo51362q(keyEvent)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* renamed from: p */
    public qh9 m4860p() {
        qh9 qh9Var = this.f6238d;
        if (qh9Var != null) {
            return qh9Var;
        }
        sq8.m48667z("layoutDirection");
        return null;
    }

    /* renamed from: q */
    public final C1932f m4861q() {
        return this.f6235a;
    }

    /* renamed from: r */
    public final alb.AbstractC12216c m4862r(rk5 rk5Var) {
        int iM60153a = zzb.m60153a(1024) | zzb.m60153a(8192);
        if (!rk5Var.mo17377h().m17361J()) {
            throw new IllegalStateException("visitLocalDescendants called on an unattached node".toString());
        }
        alb.AbstractC12216c abstractC12216cMo17377h = rk5Var.mo17377h();
        alb.AbstractC12216c abstractC12216c = null;
        if ((abstractC12216cMo17377h.m17352A() & iM60153a) != 0) {
            for (alb.AbstractC12216c abstractC12216cM17353B = abstractC12216cMo17377h.m17353B(); abstractC12216cM17353B != null; abstractC12216cM17353B = abstractC12216cM17353B.m17353B()) {
                if ((abstractC12216cM17353B.m17356E() & iM60153a) != 0) {
                    if ((zzb.m60153a(1024) & abstractC12216cM17353B.m17356E()) != 0) {
                        return abstractC12216c;
                    }
                    abstractC12216c = abstractC12216cM17353B;
                }
            }
        }
        return abstractC12216c;
    }

    /* renamed from: s */
    public final boolean m4863s(int i) {
        if (this.f6235a.g0().getHasFocus() && !this.f6235a.g0().isFocused()) {
            C1928b.a aVar = C1928b.f6246b;
            if (C1928b.m4881l(i, aVar.m4889e()) ? true : C1928b.m4881l(i, aVar.m4890f())) {
                mo4858n(false);
                if (this.f6235a.g0().isFocused()) {
                    return mo4850e(i);
                }
                return false;
            }
        }
        return false;
    }
}
