package androidx.navigation;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.lifecycle.AbstractC2139h;
import androidx.lifecycle.InterfaceC2142k;
import androidx.navigation.AbstractC2333d;
import androidx.navigation.AbstractC2341h;
import androidx.navigation.AbstractC2348o;
import androidx.navigation.C2332c;
import androidx.navigation.C2334e;
import androidx.navigation.C2345l;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import p001o.azh;
import p001o.bh3;
import p001o.bmf;
import p001o.cg0;
import p001o.ch3;
import p001o.cqb;
import p001o.csb;
import p001o.dbc;
import p001o.dge;
import p001o.dh3;
import p001o.e47;
import p001o.ege;
import p001o.gi9;
import p001o.gp0;
import p001o.hh3;
import p001o.hsa;
import p001o.hve;
import p001o.id5;
import p001o.ief;
import p001o.ih3;
import p001o.in1;
import p001o.kf9;
import p001o.kge;
import p001o.kh3;
import p001o.kxi;
import p001o.kyg;
import p001o.led;
import p001o.ob9;
import p001o.oef;
import p001o.oo0;
import p001o.q4g;
import p001o.qef;
import p001o.qo0;
import p001o.r37;
import p001o.s4g;
import p001o.si9;
import p001o.sq8;
import p001o.uff;
import p001o.uk7;
import p001o.v37;
import p001o.vrb;
import p001o.vyh;
import p001o.wca;
import p001o.wl1;
import p001o.xca;
import p001o.xk7;
import p001o.xsb;
import p001o.y3i;
import p001o.yrb;
import p001o.zpb;

/* renamed from: androidx.navigation.d */
/* loaded from: classes2.dex */
public abstract class AbstractC2333d {

    /* renamed from: H */
    public static final a f9451H = new a(null);

    /* renamed from: I */
    public static boolean f9452I = true;

    /* renamed from: A */
    public xk7 f9453A;

    /* renamed from: B */
    public final Map f9454B;

    /* renamed from: C */
    public int f9455C;

    /* renamed from: D */
    public final List f9456D;

    /* renamed from: E */
    public final gi9 f9457E;

    /* renamed from: F */
    public final zpb f9458F;

    /* renamed from: G */
    public final v37 f9459G;

    /* renamed from: a */
    public final Context f9460a;

    /* renamed from: b */
    public Activity f9461b;

    /* renamed from: c */
    public C2344k f9462c;

    /* renamed from: d */
    public C2342i f9463d;

    /* renamed from: e */
    public Bundle f9464e;

    /* renamed from: f */
    public Parcelable[] f9465f;

    /* renamed from: g */
    public boolean f9466g;

    /* renamed from: h */
    public final oo0 f9467h;

    /* renamed from: i */
    public final cqb f9468i;

    /* renamed from: j */
    public final q4g f9469j;

    /* renamed from: k */
    public final cqb f9470k;

    /* renamed from: l */
    public final q4g f9471l;

    /* renamed from: m */
    public final Map f9472m;

    /* renamed from: n */
    public final Map f9473n;

    /* renamed from: o */
    public final Map f9474o;

    /* renamed from: p */
    public final Map f9475p;

    /* renamed from: q */
    public xca f9476q;

    /* renamed from: r */
    public C2334e f9477r;

    /* renamed from: s */
    public final CopyOnWriteArrayList f9478s;

    /* renamed from: t */
    public AbstractC2139h.b f9479t;

    /* renamed from: u */
    public final wca f9480u;

    /* renamed from: v */
    public final dbc f9481v;

    /* renamed from: w */
    public boolean f9482w;

    /* renamed from: x */
    public C2349p f9483x;

    /* renamed from: y */
    public final Map f9484y;

    /* renamed from: z */
    public xk7 f9485z;

    /* renamed from: androidx.navigation.d$a */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(id5 id5Var) {
            this();
        }
    }

    /* renamed from: androidx.navigation.d$b */
    public final class b extends xsb {

        /* renamed from: g */
        public final AbstractC2348o f9486g;

        /* renamed from: h */
        public final /* synthetic */ AbstractC2333d f9487h;

        /* renamed from: androidx.navigation.d$b$a */
        public static final class a extends kf9 implements uk7 {

            /* renamed from: b */
            public final /* synthetic */ C2332c f9489b;

            /* renamed from: c */
            public final /* synthetic */ boolean f9490c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(C2332c c2332c, boolean z) {
                super(0);
                this.f9489b = c2332c;
                this.f9490c = z;
            }

            @Override // p001o.uk7
            public /* bridge */ /* synthetic */ Object invoke() {
                m68702invoke();
                return y3i.f54824a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m68702invoke() {
                b.super.mo8622h(this.f9489b, this.f9490c);
            }
        }

        public b(AbstractC2333d abstractC2333d, AbstractC2348o abstractC2348o) {
            sq8.m48649h(abstractC2348o, "navigator");
            this.f9487h = abstractC2333d;
            this.f9486g = abstractC2348o;
        }

        @Override // p001o.xsb
        /* renamed from: a */
        public C2332c mo8620a(AbstractC2341h abstractC2341h, Bundle bundle) {
            sq8.m48649h(abstractC2341h, FirebaseAnalytics.Param.DESTINATION);
            return C2332c.a.m8562b(C2332c.f9433M, this.f9487h.m8589E(), abstractC2341h, bundle, this.f9487h.m8594J(), this.f9487h.f9477r, null, null, 96, null);
        }

        @Override // p001o.xsb
        /* renamed from: e */
        public void mo8621e(C2332c c2332c) {
            C2334e c2334e;
            sq8.m48649h(c2332c, "entry");
            boolean zM48644c = sq8.m48644c(this.f9487h.f9454B.get(c2332c), Boolean.TRUE);
            super.mo8621e(c2332c);
            this.f9487h.f9454B.remove(c2332c);
            if (this.f9487h.f9467h.contains(c2332c)) {
                if (m56785d()) {
                    return;
                }
                this.f9487h.F0();
                this.f9487h.f9468i.mo17498b(kh3.T0(this.f9487h.f9467h));
                this.f9487h.f9470k.mo17498b(this.f9487h.s0());
                return;
            }
            this.f9487h.E0(c2332c);
            if (c2332c.getLifecycle().mo6522b().isAtLeast(AbstractC2139h.b.CREATED)) {
                c2332c.m8560l(AbstractC2139h.b.DESTROYED);
            }
            oo0 oo0Var = this.f9487h.f9467h;
            boolean z = true;
            if (!(oo0Var instanceof Collection) || !oo0Var.isEmpty()) {
                Iterator<E> it = oo0Var.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    } else if (sq8.m48644c(((C2332c) it.next()).m8554f(), c2332c.m8554f())) {
                        z = false;
                        break;
                    }
                }
            }
            if (z && !zM48644c && (c2334e = this.f9487h.f9477r) != null) {
                c2334e.m8643g(c2332c.m8554f());
            }
            this.f9487h.F0();
            this.f9487h.f9470k.mo17498b(this.f9487h.s0());
        }

        @Override // p001o.xsb
        /* renamed from: h */
        public void mo8622h(C2332c c2332c, boolean z) throws Resources.NotFoundException {
            sq8.m48649h(c2332c, "popUpTo");
            AbstractC2348o abstractC2348oM8956d = this.f9487h.f9483x.m8956d(c2332c.m8553e().m8755F());
            this.f9487h.f9454B.put(c2332c, Boolean.valueOf(z));
            if (!sq8.m48644c(abstractC2348oM8956d, this.f9486g)) {
                Object obj = this.f9487h.f9484y.get(abstractC2348oM8956d);
                sq8.m48646e(obj);
                ((b) obj).mo8622h(c2332c, z);
            } else {
                xk7 xk7Var = this.f9487h.f9453A;
                if (xk7Var == null) {
                    this.f9487h.k0(c2332c, new a(c2332c, z));
                } else {
                    xk7Var.invoke(c2332c);
                    super.mo8622h(c2332c, z);
                }
            }
        }

        @Override // p001o.xsb
        /* renamed from: i */
        public void mo8623i(C2332c c2332c, boolean z) {
            sq8.m48649h(c2332c, "popUpTo");
            super.mo8623i(c2332c, z);
        }

        @Override // p001o.xsb
        /* renamed from: j */
        public void mo8624j(C2332c c2332c) {
            sq8.m48649h(c2332c, "entry");
            super.mo8624j(c2332c);
            if (!this.f9487h.f9467h.contains(c2332c)) {
                throw new IllegalStateException("Cannot transition entry that is not in the back stack");
            }
            c2332c.m8560l(AbstractC2139h.b.STARTED);
        }

        @Override // p001o.xsb
        /* renamed from: k */
        public void mo8625k(C2332c c2332c) {
            sq8.m48649h(c2332c, "backStackEntry");
            AbstractC2348o abstractC2348oM8956d = this.f9487h.f9483x.m8956d(c2332c.m8553e().m8755F());
            if (!sq8.m48644c(abstractC2348oM8956d, this.f9486g)) {
                Object obj = this.f9487h.f9484y.get(abstractC2348oM8956d);
                if (obj != null) {
                    ((b) obj).mo8625k(c2332c);
                    return;
                }
                throw new IllegalStateException(("NavigatorBackStack for " + c2332c.m8553e().m8755F() + " should already be created").toString());
            }
            xk7 xk7Var = this.f9487h.f9485z;
            if (xk7Var != null) {
                xk7Var.invoke(c2332c);
                m8626o(c2332c);
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("Ignoring add of destination ");
                sb.append(c2332c.m8553e());
                sb.append(" outside of the call to navigate(). ");
            }
        }

        /* renamed from: o */
        public final void m8626o(C2332c c2332c) {
            sq8.m48649h(c2332c, "backStackEntry");
            super.mo8625k(c2332c);
        }
    }

    /* renamed from: androidx.navigation.d$c */
    public interface c {
        /* renamed from: a */
        void mo74a(AbstractC2333d abstractC2333d, AbstractC2341h abstractC2341h, Bundle bundle);
    }

    /* renamed from: androidx.navigation.d$d */
    public static final class d extends kf9 implements xk7 {

        /* renamed from: a */
        public static final d f9491a = new d();

        public d() {
            super(1);
        }

        @Override // p001o.xk7
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Context invoke(Context context) {
            sq8.m48649h(context, "it");
            if (context instanceof ContextWrapper) {
                return ((ContextWrapper) context).getBaseContext();
            }
            return null;
        }
    }

    /* renamed from: androidx.navigation.d$e */
    public static final class e extends kf9 implements xk7 {

        /* renamed from: a */
        public static final e f9492a = new e();

        public e() {
            super(1);
        }

        /* renamed from: a */
        public final void m8628a(C2346m c2346m) {
            sq8.m48649h(c2346m, "$this$navOptions");
            c2346m.m8831g(true);
        }

        @Override // p001o.xk7
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m8628a((C2346m) obj);
            return y3i.f54824a;
        }
    }

    /* renamed from: androidx.navigation.d$f */
    public static final class f extends kf9 implements xk7 {

        /* renamed from: a */
        public final /* synthetic */ dge f9493a;

        /* renamed from: b */
        public final /* synthetic */ dge f9494b;

        /* renamed from: c */
        public final /* synthetic */ AbstractC2333d f9495c;

        /* renamed from: d */
        public final /* synthetic */ boolean f9496d;

        /* renamed from: e */
        public final /* synthetic */ oo0 f9497e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(dge dgeVar, dge dgeVar2, AbstractC2333d abstractC2333d, boolean z, oo0 oo0Var) {
            super(1);
            this.f9493a = dgeVar;
            this.f9494b = dgeVar2;
            this.f9495c = abstractC2333d;
            this.f9496d = z;
            this.f9497e = oo0Var;
        }

        /* renamed from: a */
        public final void m8629a(C2332c c2332c) {
            sq8.m48649h(c2332c, "entry");
            this.f9493a.f19803a = true;
            this.f9494b.f19803a = true;
            this.f9495c.q0(c2332c, this.f9496d, this.f9497e);
        }

        @Override // p001o.xk7
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m8629a((C2332c) obj);
            return y3i.f54824a;
        }
    }

    /* renamed from: androidx.navigation.d$g */
    public static final class g extends kf9 implements xk7 {

        /* renamed from: a */
        public static final g f9498a = new g();

        public g() {
            super(1);
        }

        @Override // p001o.xk7
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final AbstractC2341h invoke(AbstractC2341h abstractC2341h) {
            sq8.m48649h(abstractC2341h, FirebaseAnalytics.Param.DESTINATION);
            C2342i c2342iM8756G = abstractC2341h.m8756G();
            boolean z = false;
            if (c2342iM8756G != null && c2342iM8756G.e0() == abstractC2341h.m8753A()) {
                z = true;
            }
            if (z) {
                return abstractC2341h.m8756G();
            }
            return null;
        }
    }

    /* renamed from: androidx.navigation.d$h */
    public static final class h extends kf9 implements xk7 {
        public h() {
            super(1);
        }

        @Override // p001o.xk7
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(AbstractC2341h abstractC2341h) {
            sq8.m48649h(abstractC2341h, FirebaseAnalytics.Param.DESTINATION);
            return Boolean.valueOf(!AbstractC2333d.this.f9474o.containsKey(Integer.valueOf(abstractC2341h.m8753A())));
        }
    }

    /* renamed from: androidx.navigation.d$i */
    public static final class i extends kf9 implements xk7 {

        /* renamed from: a */
        public static final i f9500a = new i();

        public i() {
            super(1);
        }

        @Override // p001o.xk7
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final AbstractC2341h invoke(AbstractC2341h abstractC2341h) {
            sq8.m48649h(abstractC2341h, FirebaseAnalytics.Param.DESTINATION);
            C2342i c2342iM8756G = abstractC2341h.m8756G();
            boolean z = false;
            if (c2342iM8756G != null && c2342iM8756G.e0() == abstractC2341h.m8753A()) {
                z = true;
            }
            if (z) {
                return abstractC2341h.m8756G();
            }
            return null;
        }
    }

    /* renamed from: androidx.navigation.d$j */
    public static final class j extends kf9 implements xk7 {
        public j() {
            super(1);
        }

        @Override // p001o.xk7
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(AbstractC2341h abstractC2341h) {
            sq8.m48649h(abstractC2341h, FirebaseAnalytics.Param.DESTINATION);
            return Boolean.valueOf(!AbstractC2333d.this.f9474o.containsKey(Integer.valueOf(abstractC2341h.m8753A())));
        }
    }

    /* renamed from: androidx.navigation.d$k */
    public static final class k extends kf9 implements xk7 {

        /* renamed from: a */
        public final /* synthetic */ dge f9502a;

        /* renamed from: b */
        public final /* synthetic */ List f9503b;

        /* renamed from: c */
        public final /* synthetic */ ege f9504c;

        /* renamed from: d */
        public final /* synthetic */ AbstractC2333d f9505d;

        /* renamed from: e */
        public final /* synthetic */ Bundle f9506e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(dge dgeVar, List list, ege egeVar, AbstractC2333d abstractC2333d, Bundle bundle) {
            super(1);
            this.f9502a = dgeVar;
            this.f9503b = list;
            this.f9504c = egeVar;
            this.f9505d = abstractC2333d;
            this.f9506e = bundle;
        }

        /* renamed from: a */
        public final void m8634a(C2332c c2332c) {
            List listM21246k;
            sq8.m48649h(c2332c, "entry");
            this.f9502a.f19803a = true;
            int iIndexOf = this.f9503b.indexOf(c2332c);
            if (iIndexOf != -1) {
                int i = iIndexOf + 1;
                listM21246k = this.f9503b.subList(this.f9504c.f21602a, i);
                this.f9504c.f21602a = i;
            } else {
                listM21246k = ch3.m21246k();
            }
            this.f9505d.m8610p(c2332c.m8553e(), this.f9506e, c2332c, listM21246k);
        }

        @Override // p001o.xk7
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m8634a((C2332c) obj);
            return y3i.f54824a;
        }
    }

    /* renamed from: androidx.navigation.d$l */
    public static final class l extends kf9 implements xk7 {

        /* renamed from: a */
        public final /* synthetic */ AbstractC2341h f9507a;

        /* renamed from: b */
        public final /* synthetic */ AbstractC2333d f9508b;

        /* renamed from: androidx.navigation.d$l$a */
        public static final class a extends kf9 implements xk7 {

            /* renamed from: a */
            public static final a f9509a = new a();

            public a() {
                super(1);
            }

            /* renamed from: a */
            public final void m8636a(cg0 cg0Var) {
                sq8.m48649h(cg0Var, "$this$anim");
                cg0Var.m21136e(0);
                cg0Var.m21137f(0);
            }

            @Override // p001o.xk7
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                m8636a((cg0) obj);
                return y3i.f54824a;
            }
        }

        /* renamed from: androidx.navigation.d$l$b */
        public static final class b extends kf9 implements xk7 {

            /* renamed from: a */
            public static final b f9510a = new b();

            public b() {
                super(1);
            }

            /* renamed from: a */
            public final void m8637a(led ledVar) {
                sq8.m48649h(ledVar, "$this$popUpTo");
                ledVar.m37042c(true);
            }

            @Override // p001o.xk7
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                m8637a((led) obj);
                return y3i.f54824a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(AbstractC2341h abstractC2341h, AbstractC2333d abstractC2333d) {
            super(1);
            this.f9507a = abstractC2341h;
            this.f9508b = abstractC2333d;
        }

        /* renamed from: a */
        public final void m8635a(C2346m c2346m) {
            boolean z;
            sq8.m48649h(c2346m, "$this$navOptions");
            c2346m.m8825a(a.f9509a);
            AbstractC2341h abstractC2341h = this.f9507a;
            boolean z2 = false;
            if (abstractC2341h instanceof C2342i) {
                ief iefVarM8776c = AbstractC2341h.f9602x.m8776c(abstractC2341h);
                AbstractC2333d abstractC2333d = this.f9508b;
                Iterator it = iefVarM8776c.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        z = true;
                        break;
                    }
                    AbstractC2341h abstractC2341h2 = (AbstractC2341h) it.next();
                    AbstractC2341h abstractC2341hM8591G = abstractC2333d.m8591G();
                    if (sq8.m48644c(abstractC2341h2, abstractC2341hM8591G != null ? abstractC2341hM8591G.m8756G() : null)) {
                        z = false;
                        break;
                    }
                }
                if (z) {
                    z2 = true;
                }
            }
            if (z2 && AbstractC2333d.f9452I) {
                c2346m.m8827c(C2342i.f9625X.m8788b(this.f9508b.m8593I()).m8753A(), b.f9510a);
            }
        }

        @Override // p001o.xk7
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m8635a((C2346m) obj);
            return y3i.f54824a;
        }
    }

    /* renamed from: androidx.navigation.d$m */
    public static final class m extends kf9 implements xk7 {

        /* renamed from: a */
        public static final m f9511a = new m();

        public m() {
            super(1);
        }

        @Override // p001o.xk7
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Integer invoke(AbstractC2341h abstractC2341h) {
            sq8.m48649h(abstractC2341h, "it");
            return Integer.valueOf(abstractC2341h.m8753A());
        }
    }

    /* renamed from: androidx.navigation.d$n */
    public static final class n extends kf9 implements uk7 {
        public n() {
            super(0);
        }

        @Override // p001o.uk7
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C2344k invoke() {
            C2344k c2344k = AbstractC2333d.this.f9462c;
            return c2344k == null ? new C2344k(AbstractC2333d.this.m8589E(), AbstractC2333d.this.f9483x) : c2344k;
        }
    }

    /* renamed from: androidx.navigation.d$o */
    public static final class o extends kf9 implements xk7 {

        /* renamed from: a */
        public final /* synthetic */ dge f9513a;

        /* renamed from: b */
        public final /* synthetic */ AbstractC2333d f9514b;

        /* renamed from: c */
        public final /* synthetic */ AbstractC2341h f9515c;

        /* renamed from: d */
        public final /* synthetic */ Bundle f9516d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(dge dgeVar, AbstractC2333d abstractC2333d, AbstractC2341h abstractC2341h, Bundle bundle) {
            super(1);
            this.f9513a = dgeVar;
            this.f9514b = abstractC2333d;
            this.f9515c = abstractC2341h;
            this.f9516d = bundle;
        }

        /* renamed from: a */
        public final void m8640a(C2332c c2332c) {
            sq8.m48649h(c2332c, "it");
            this.f9513a.f19803a = true;
            AbstractC2333d.m8584q(this.f9514b, this.f9515c, this.f9516d, c2332c, null, 8, null);
        }

        @Override // p001o.xk7
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m8640a((C2332c) obj);
            return y3i.f54824a;
        }
    }

    /* renamed from: androidx.navigation.d$p */
    public static final class p extends dbc {
        public p() {
            super(false);
        }

        @Override // p001o.dbc
        /* renamed from: d */
        public void mo940d() {
            AbstractC2333d.this.f0();
        }
    }

    /* renamed from: androidx.navigation.d$q */
    public static final class q extends kf9 implements xk7 {

        /* renamed from: a */
        public final /* synthetic */ String f9518a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public q(String str) {
            super(1);
            this.f9518a = str;
        }

        @Override // p001o.xk7
        public final Boolean invoke(String str) {
            return Boolean.valueOf(sq8.m48644c(str, this.f9518a));
        }
    }

    public AbstractC2333d(Context context) {
        Object next;
        sq8.m48649h(context, "context");
        this.f9460a = context;
        Iterator it = oef.m42147f(context, d.f9491a).iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (((Context) next) instanceof Activity) {
                    break;
                }
            }
        }
        this.f9461b = (Activity) next;
        this.f9467h = new oo0();
        cqb cqbVarM47838a = s4g.m47838a(ch3.m21246k());
        this.f9468i = cqbVarM47838a;
        this.f9469j = e47.m24268b(cqbVarM47838a);
        cqb cqbVarM47838a2 = s4g.m47838a(ch3.m21246k());
        this.f9470k = cqbVarM47838a2;
        this.f9471l = e47.m24268b(cqbVarM47838a2);
        this.f9472m = new LinkedHashMap();
        this.f9473n = new LinkedHashMap();
        this.f9474o = new LinkedHashMap();
        this.f9475p = new LinkedHashMap();
        this.f9478s = new CopyOnWriteArrayList();
        this.f9479t = AbstractC2139h.b.INITIALIZED;
        this.f9480u = new InterfaceC2142k() { // from class: o.xrb
            @Override // androidx.lifecycle.InterfaceC2142k
            /* renamed from: o */
            public final void mo3717o(xca xcaVar, AbstractC2139h.a aVar) {
                AbstractC2333d.m8568R(this.f54172a, xcaVar, aVar);
            }
        };
        this.f9481v = new p();
        this.f9482w = true;
        this.f9483x = new C2349p();
        this.f9484y = new LinkedHashMap();
        this.f9454B = new LinkedHashMap();
        C2349p c2349p = this.f9483x;
        c2349p.m8954b(new C2343j(c2349p));
        this.f9483x.m8954b(new C2330a(this.f9460a));
        this.f9456D = new ArrayList();
        this.f9457E = si9.m48360a(new n());
        zpb zpbVarM19385b = bmf.m19385b(1, 0, wl1.DROP_OLDEST, 2, null);
        this.f9458F = zpbVarM19385b;
        this.f9459G = e47.m24267a(zpbVarM19385b);
    }

    /* renamed from: A */
    public static /* synthetic */ AbstractC2341h m8567A(AbstractC2333d abstractC2333d, AbstractC2341h abstractC2341h, int i2, boolean z, AbstractC2341h abstractC2341h2, int i3, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: findDestinationComprehensive");
        }
        if ((i3 & 4) != 0) {
            abstractC2341h2 = null;
        }
        return abstractC2333d.m8618z(abstractC2341h, i2, z, abstractC2341h2);
    }

    /* renamed from: R */
    public static final void m8568R(AbstractC2333d abstractC2333d, xca xcaVar, AbstractC2139h.a aVar) {
        sq8.m48649h(abstractC2333d, "this$0");
        sq8.m48649h(xcaVar, "<anonymous parameter 0>");
        sq8.m48649h(aVar, "event");
        abstractC2333d.f9479t = aVar.getTargetState();
        if (abstractC2333d.f9463d != null) {
            Iterator it = kh3.T0(abstractC2333d.f9467h).iterator();
            while (it.hasNext()) {
                ((C2332c) it.next()).m8557i(aVar);
            }
        }
    }

    public static /* synthetic */ boolean j0(AbstractC2333d abstractC2333d, String str, boolean z, boolean z2, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: popBackStack");
        }
        if ((i2 & 4) != 0) {
            z2 = false;
        }
        return abstractC2333d.i0(str, z, z2);
    }

    public static /* synthetic */ boolean p0(AbstractC2333d abstractC2333d, int i2, boolean z, boolean z2, int i3, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: popBackStackInternal");
        }
        if ((i3 & 4) != 0) {
            z2 = false;
        }
        return abstractC2333d.m0(i2, z, z2);
    }

    /* renamed from: q */
    public static /* synthetic */ void m8584q(AbstractC2333d abstractC2333d, AbstractC2341h abstractC2341h, Bundle bundle, C2332c c2332c, List list, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addEntryToBackStack");
        }
        if ((i2 & 8) != 0) {
            list = ch3.m21246k();
        }
        abstractC2333d.m8610p(abstractC2341h, bundle, c2332c, list);
    }

    public static /* synthetic */ void r0(AbstractC2333d abstractC2333d, C2332c c2332c, boolean z, oo0 oo0Var, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: popEntryFromBackStack");
        }
        if ((i2 & 2) != 0) {
            z = false;
        }
        if ((i2 & 4) != 0) {
            oo0Var = new oo0();
        }
        abstractC2333d.q0(c2332c, z, oo0Var);
    }

    /* renamed from: y */
    public static /* synthetic */ AbstractC2341h m8585y(AbstractC2333d abstractC2333d, int i2, AbstractC2341h abstractC2341h, int i3, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: findDestination");
        }
        if ((i3 & 2) != 0) {
            abstractC2341h = null;
        }
        return abstractC2333d.m8617x(i2, abstractC2341h);
    }

    public void A0(xca xcaVar) {
        AbstractC2139h lifecycle;
        sq8.m48649h(xcaVar, "owner");
        if (sq8.m48644c(xcaVar, this.f9476q)) {
            return;
        }
        xca xcaVar2 = this.f9476q;
        if (xcaVar2 != null && (lifecycle = xcaVar2.getLifecycle()) != null) {
            lifecycle.mo6524d(this.f9480u);
        }
        this.f9476q = xcaVar;
        xcaVar.getLifecycle().mo6521a(this.f9480u);
    }

    /* renamed from: B */
    public final String m8586B(int[] iArr) {
        C2342i c2342i;
        C2342i c2342i2 = this.f9463d;
        int length = iArr.length;
        int i2 = 0;
        while (true) {
            AbstractC2341h abstractC2341hM8784W = null;
            if (i2 >= length) {
                return null;
            }
            int i3 = iArr[i2];
            if (i2 == 0) {
                C2342i c2342i3 = this.f9463d;
                sq8.m48646e(c2342i3);
                if (c2342i3.m8753A() == i3) {
                    abstractC2341hM8784W = this.f9463d;
                }
            } else {
                sq8.m48646e(c2342i2);
                abstractC2341hM8784W = c2342i2.m8784W(i3);
            }
            if (abstractC2341hM8784W == null) {
                return AbstractC2341h.f9602x.m8775b(this.f9460a, i3);
            }
            if (i2 != iArr.length - 1 && (abstractC2341hM8784W instanceof C2342i)) {
                while (true) {
                    c2342i = (C2342i) abstractC2341hM8784W;
                    sq8.m48646e(c2342i);
                    if (!(c2342i.m8784W(c2342i.e0()) instanceof C2342i)) {
                        break;
                    }
                    abstractC2341hM8784W = c2342i.m8784W(c2342i.e0());
                }
                c2342i2 = c2342i;
            }
            i2++;
        }
    }

    public void B0(kxi kxiVar) {
        sq8.m48649h(kxiVar, "viewModelStore");
        C2334e c2334e = this.f9477r;
        C2334e.b bVar = C2334e.f9519c;
        if (sq8.m48644c(c2334e, bVar.m8644a(kxiVar))) {
            return;
        }
        if (!this.f9467h.isEmpty()) {
            throw new IllegalStateException("ViewModelStore should be set before setGraph call".toString());
        }
        this.f9477r = bVar.m8644a(kxiVar);
    }

    /* renamed from: C */
    public final String m8587C(Object obj) {
        AbstractC2341h abstractC2341hM8567A = m8567A(this, m8593I(), hve.m31222b(uff.m51545a(kge.m35689b(obj.getClass()))), true, null, 4, null);
        if (abstractC2341hM8567A == null) {
            throw new IllegalArgumentException(("Destination with route " + kge.m35689b(obj.getClass()).mo26337d() + " cannot be found in navigation graph " + this.f9463d).toString());
        }
        Map mapM8772w = abstractC2341hM8567A.m8772w();
        LinkedHashMap linkedHashMap = new LinkedHashMap(hsa.m31055e(mapM8772w.size()));
        for (Map.Entry entry : mapM8772w.entrySet()) {
            linkedHashMap.put(entry.getKey(), ((C2331b) entry.getValue()).m8539a());
        }
        return hve.m31223c(obj, linkedHashMap);
    }

    public final boolean C0() throws Resources.NotFoundException {
        int i2 = 0;
        if (!this.f9466g) {
            return false;
        }
        Activity activity = this.f9461b;
        sq8.m48646e(activity);
        Intent intent = activity.getIntent();
        Bundle extras = intent.getExtras();
        sq8.m48646e(extras);
        int[] intArray = extras.getIntArray("android-support-nav:controller:deepLinkIds");
        sq8.m48646e(intArray);
        List listG0 = gp0.G0(intArray);
        ArrayList parcelableArrayList = extras.getParcelableArrayList("android-support-nav:controller:deepLinkArgs");
        if (listG0.size() < 2) {
            return false;
        }
        int iIntValue = ((Number) hh3.m30449I(listG0)).intValue();
        if (parcelableArrayList != null) {
        }
        AbstractC2341h abstractC2341hM8567A = m8567A(this, m8593I(), iIntValue, false, null, 4, null);
        if (abstractC2341hM8567A instanceof C2342i) {
            iIntValue = C2342i.f9625X.m8788b((C2342i) abstractC2341hM8567A).m8753A();
        }
        AbstractC2341h abstractC2341hM8591G = m8591G();
        if (!(abstractC2341hM8591G != null && iIntValue == abstractC2341hM8591G.m8753A())) {
            return false;
        }
        C2340g c2340gM8613t = m8613t();
        Bundle bundleM32435b = in1.m32435b(vyh.m53620a("android-support-nav:controller:deepLinkIntent", intent));
        Bundle bundle = extras.getBundle("android-support-nav:controller:deepLinkExtras");
        if (bundle != null) {
            bundleM32435b.putAll(bundle);
        }
        c2340gM8613t.m8744e(bundleM32435b);
        for (Object obj : listG0) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                ch3.m21256u();
            }
            c2340gM8613t.m8740a(((Number) obj).intValue(), parcelableArrayList != null ? (Bundle) parcelableArrayList.get(i2) : null);
            i2 = i3;
        }
        c2340gM8613t.m8741b().m36338p();
        Activity activity2 = this.f9461b;
        if (activity2 != null) {
            activity2.finish();
        }
        return true;
    }

    /* renamed from: D */
    public C2332c m8588D(int i2) {
        Object objPrevious;
        oo0 oo0Var = this.f9467h;
        ListIterator<E> listIterator = oo0Var.listIterator(oo0Var.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                objPrevious = null;
                break;
            }
            objPrevious = listIterator.previous();
            if (((C2332c) objPrevious).m8553e().m8753A() == i2) {
                break;
            }
        }
        C2332c c2332c = (C2332c) objPrevious;
        if (c2332c != null) {
            return c2332c;
        }
        throw new IllegalArgumentException(("No destination with ID " + i2 + " is on the NavController's back stack. The current destination is " + m8591G()).toString());
    }

    public final boolean D0() {
        AbstractC2341h abstractC2341hM8591G = m8591G();
        sq8.m48646e(abstractC2341hM8591G);
        int iM8753A = abstractC2341hM8591G.m8753A();
        for (C2342i c2342iM8756G = abstractC2341hM8591G.m8756G(); c2342iM8756G != null; c2342iM8756G = c2342iM8756G.m8756G()) {
            if (c2342iM8756G.e0() != iM8753A) {
                Bundle bundle = new Bundle();
                Activity activity = this.f9461b;
                if (activity != null) {
                    sq8.m48646e(activity);
                    if (activity.getIntent() != null) {
                        Activity activity2 = this.f9461b;
                        sq8.m48646e(activity2);
                        if (activity2.getIntent().getData() != null) {
                            Activity activity3 = this.f9461b;
                            sq8.m48646e(activity3);
                            bundle.putParcelable("android-support-nav:controller:deepLinkIntent", activity3.getIntent());
                            C2342i c2342iM8598N = m8598N(this.f9467h);
                            Activity activity4 = this.f9461b;
                            sq8.m48646e(activity4);
                            Intent intent = activity4.getIntent();
                            sq8.m48648g(intent, "activity!!.intent");
                            AbstractC2341h.b bVarG0 = c2342iM8598N.g0(new yrb(intent), true, true, c2342iM8598N);
                            if ((bVarG0 != null ? bVarG0.m8780d() : null) != null) {
                                bundle.putAll(bVarG0.m8779c().m8768n(bVarG0.m8780d()));
                            }
                        }
                    }
                }
                C2340g.m8739g(new C2340g(this), c2342iM8756G.m8753A(), null, 2, null).m8744e(bundle).m8741b().m36338p();
                Activity activity5 = this.f9461b;
                if (activity5 != null) {
                    activity5.finish();
                }
                return true;
            }
            iM8753A = c2342iM8756G.m8753A();
        }
        return false;
    }

    /* renamed from: E */
    public final Context m8589E() {
        return this.f9460a;
    }

    public final C2332c E0(C2332c c2332c) {
        sq8.m48649h(c2332c, "child");
        C2332c c2332c2 = (C2332c) this.f9472m.remove(c2332c);
        if (c2332c2 == null) {
            return null;
        }
        AtomicInteger atomicInteger = (AtomicInteger) this.f9473n.get(c2332c2);
        Integer numValueOf = atomicInteger != null ? Integer.valueOf(atomicInteger.decrementAndGet()) : null;
        if (numValueOf != null && numValueOf.intValue() == 0) {
            b bVar = (b) this.f9484y.get(this.f9483x.m8956d(c2332c2.m8553e().m8755F()));
            if (bVar != null) {
                bVar.mo8621e(c2332c2);
            }
            this.f9473n.remove(c2332c2);
        }
        return c2332c2;
    }

    /* renamed from: F */
    public C2332c m8590F() {
        return (C2332c) this.f9467h.m42469G();
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00c9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void F0() {
        q4g q4gVarM56784c;
        Set set;
        List<C2332c> listT0 = kh3.T0(this.f9467h);
        if (listT0.isEmpty()) {
            return;
        }
        AbstractC2341h abstractC2341hM8553e = ((C2332c) kh3.r0(listT0)).m8553e();
        ArrayList arrayList = new ArrayList();
        if (abstractC2341hM8553e instanceof r37) {
            Iterator it = kh3.B0(listT0).iterator();
            while (it.hasNext()) {
                AbstractC2341h abstractC2341hM8553e2 = ((C2332c) it.next()).m8553e();
                arrayList.add(abstractC2341hM8553e2);
                if (!(abstractC2341hM8553e2 instanceof r37) && !(abstractC2341hM8553e2 instanceof C2342i)) {
                    break;
                }
            }
        }
        HashMap map = new HashMap();
        for (C2332c c2332c : kh3.B0(listT0)) {
            AbstractC2139h.b bVarM8555g = c2332c.m8555g();
            AbstractC2341h abstractC2341hM8553e3 = c2332c.m8553e();
            if (abstractC2341hM8553e != null && abstractC2341hM8553e3.m8753A() == abstractC2341hM8553e.m8753A()) {
                AbstractC2139h.b bVar = AbstractC2139h.b.RESUMED;
                if (bVarM8555g != bVar) {
                    b bVar2 = (b) this.f9484y.get(m8596L().m8956d(c2332c.m8553e().m8755F()));
                    if (sq8.m48644c((bVar2 == null || (q4gVarM56784c = bVar2.m56784c()) == null || (set = (Set) q4gVarM56784c.getValue()) == null) ? null : Boolean.valueOf(set.contains(c2332c)), Boolean.TRUE)) {
                        map.put(c2332c, AbstractC2139h.b.STARTED);
                    } else {
                        AtomicInteger atomicInteger = (AtomicInteger) this.f9473n.get(c2332c);
                        if (!(atomicInteger != null && atomicInteger.get() == 0)) {
                            map.put(c2332c, bVar);
                        }
                    }
                }
                AbstractC2341h abstractC2341h = (AbstractC2341h) kh3.h0(arrayList);
                if (abstractC2341h != null && abstractC2341h.m8753A() == abstractC2341hM8553e3.m8753A()) {
                    hh3.m30448H(arrayList);
                }
                abstractC2341hM8553e = abstractC2341hM8553e.m8756G();
            } else if ((true ^ arrayList.isEmpty()) && abstractC2341hM8553e3.m8753A() == ((AbstractC2341h) kh3.f0(arrayList)).m8753A()) {
                AbstractC2341h abstractC2341h2 = (AbstractC2341h) hh3.m30448H(arrayList);
                if (bVarM8555g == AbstractC2139h.b.RESUMED) {
                    c2332c.m8560l(AbstractC2139h.b.STARTED);
                } else {
                    AbstractC2139h.b bVar3 = AbstractC2139h.b.STARTED;
                    if (bVarM8555g != bVar3) {
                        map.put(c2332c, bVar3);
                    }
                }
                C2342i c2342iM8756G = abstractC2341h2.m8756G();
                if (c2342iM8756G != null && !arrayList.contains(c2342iM8756G)) {
                    arrayList.add(c2342iM8756G);
                }
            } else {
                c2332c.m8560l(AbstractC2139h.b.CREATED);
            }
        }
        for (C2332c c2332c2 : listT0) {
            AbstractC2139h.b bVar4 = (AbstractC2139h.b) map.get(c2332c2);
            if (bVar4 != null) {
                c2332c2.m8560l(bVar4);
            } else {
                c2332c2.m8561m();
            }
        }
    }

    /* renamed from: G */
    public AbstractC2341h m8591G() {
        C2332c c2332cM8590F = m8590F();
        if (c2332cM8590F != null) {
            return c2332cM8590F.m8553e();
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x000e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void G0() {
        boolean z;
        dbc dbcVar = this.f9481v;
        if (this.f9482w) {
            z = m8592H() > 1;
        }
        dbcVar.m22749j(z);
    }

    /* renamed from: H */
    public final int m8592H() {
        oo0 oo0Var = this.f9467h;
        int i2 = 0;
        if (!(oo0Var instanceof Collection) || !oo0Var.isEmpty()) {
            Iterator<E> it = oo0Var.iterator();
            while (it.hasNext()) {
                if ((!(((C2332c) it.next()).m8553e() instanceof C2342i)) && (i2 = i2 + 1) < 0) {
                    ch3.m21255t();
                }
            }
        }
        return i2;
    }

    /* renamed from: I */
    public C2342i m8593I() {
        C2342i c2342i = this.f9463d;
        if (c2342i == null) {
            throw new IllegalStateException("You must call setGraph() before calling getGraph()".toString());
        }
        sq8.m48647f(c2342i, "null cannot be cast to non-null type androidx.navigation.NavGraph");
        return c2342i;
    }

    /* renamed from: J */
    public final AbstractC2139h.b m8594J() {
        return this.f9476q == null ? AbstractC2139h.b.CREATED : this.f9479t;
    }

    /* renamed from: K */
    public C2344k m8595K() {
        return (C2344k) this.f9457E.getValue();
    }

    /* renamed from: L */
    public C2349p m8596L() {
        return this.f9483x;
    }

    /* renamed from: M */
    public C2332c m8597M() {
        Object next;
        Iterator it = kh3.B0(this.f9467h).iterator();
        if (it.hasNext()) {
            it.next();
        }
        Iterator it2 = oef.m42144c(it).iterator();
        while (true) {
            if (!it2.hasNext()) {
                next = null;
                break;
            }
            next = it2.next();
            if (!(((C2332c) next).m8553e() instanceof C2342i)) {
                break;
            }
        }
        return (C2332c) next;
    }

    /* renamed from: N */
    public final C2342i m8598N(oo0 oo0Var) {
        AbstractC2341h abstractC2341hM8553e;
        C2332c c2332c = (C2332c) oo0Var.m42469G();
        if (c2332c == null || (abstractC2341hM8553e = c2332c.m8553e()) == null) {
            abstractC2341hM8553e = this.f9463d;
            sq8.m48646e(abstractC2341hM8553e);
        }
        if (abstractC2341hM8553e instanceof C2342i) {
            return (C2342i) abstractC2341hM8553e;
        }
        C2342i c2342iM8756G = abstractC2341hM8553e.m8756G();
        sq8.m48646e(c2342iM8756G);
        return c2342iM8756G;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0076  */
    /* renamed from: O */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean m8599O(Intent intent) throws Resources.NotFoundException {
        int[] intArray;
        int[] iArr;
        AbstractC2341h abstractC2341hM8784W;
        C2342i c2342i;
        Bundle bundle;
        int i2 = 0;
        if (intent == null) {
            return false;
        }
        Bundle extras = intent.getExtras();
        if (extras != null) {
            try {
                intArray = extras.getIntArray("android-support-nav:controller:deepLinkIds");
            } catch (Exception unused) {
                StringBuilder sb = new StringBuilder();
                sb.append("handleDeepLink() could not extract deepLink from ");
                sb.append(intent);
            }
        } else {
            intArray = null;
        }
        ArrayList parcelableArrayList = extras != null ? extras.getParcelableArrayList("android-support-nav:controller:deepLinkArgs") : null;
        Bundle bundle2 = new Bundle();
        Bundle bundle3 = extras != null ? extras.getBundle("android-support-nav:controller:deepLinkExtras") : null;
        if (bundle3 != null) {
            bundle2.putAll(bundle3);
        }
        if (intArray == null) {
            C2342i c2342iM8598N = m8598N(this.f9467h);
            AbstractC2341h.b bVarG0 = c2342iM8598N.g0(new yrb(intent), true, true, c2342iM8598N);
            if (bVarG0 != null) {
                AbstractC2341h abstractC2341hM8779c = bVarG0.m8779c();
                int[] iArrM8752p = AbstractC2341h.m8752p(abstractC2341hM8779c, null, 1, null);
                Bundle bundleM8768n = abstractC2341hM8779c.m8768n(bVarG0.m8780d());
                if (bundleM8768n != null) {
                    bundle2.putAll(bundleM8768n);
                }
                iArr = iArrM8752p;
                parcelableArrayList = null;
            } else {
                iArr = intArray;
            }
        } else if (intArray.length == 0) {
        }
        if (iArr != null) {
            if (!(iArr.length == 0)) {
                String strM8586B = m8586B(iArr);
                if (strM8586B != null) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Could not find destination ");
                    sb2.append(strM8586B);
                    sb2.append(" in the navigation graph, ignoring the deep link from ");
                    sb2.append(intent);
                    return false;
                }
                bundle2.putParcelable("android-support-nav:controller:deepLinkIntent", intent);
                int length = iArr.length;
                Bundle[] bundleArr = new Bundle[length];
                for (int i3 = 0; i3 < length; i3++) {
                    Bundle bundle4 = new Bundle();
                    bundle4.putAll(bundle2);
                    if (parcelableArrayList != null && (bundle = (Bundle) parcelableArrayList.get(i3)) != null) {
                        bundle4.putAll(bundle);
                    }
                    bundleArr[i3] = bundle4;
                }
                int flags = intent.getFlags();
                int i4 = 268435456 & flags;
                if (i4 != 0 && (flags & 32768) == 0) {
                    intent.addFlags(32768);
                    kyg kygVarM36331d = kyg.m36329j(this.f9460a).m36331d(intent);
                    sq8.m48648g(kygVarM36331d, "create(context).addNextI…ntWithParentStack(intent)");
                    kygVarM36331d.m36338p();
                    Activity activity = this.f9461b;
                    if (activity != null) {
                        activity.finish();
                        activity.overridePendingTransition(0, 0);
                    }
                    return true;
                }
                if (i4 != 0) {
                    if (!this.f9467h.isEmpty()) {
                        C2342i c2342i2 = this.f9463d;
                        sq8.m48646e(c2342i2);
                        p0(this, c2342i2.m8753A(), true, false, 4, null);
                    }
                    while (i2 < iArr.length) {
                        int i5 = iArr[i2];
                        int i6 = i2 + 1;
                        Bundle bundle5 = bundleArr[i2];
                        AbstractC2341h abstractC2341hM8585y = m8585y(this, i5, null, 2, null);
                        if (abstractC2341hM8585y == null) {
                            throw new IllegalStateException("Deep Linking failed: destination " + AbstractC2341h.f9602x.m8775b(this.f9460a, i5) + " cannot be found from the current destination " + m8591G());
                        }
                        m8608Y(abstractC2341hM8585y, bundle5, csb.m21707a(new l(abstractC2341hM8585y, this)), null);
                        i2 = i6;
                    }
                    this.f9466g = true;
                    return true;
                }
                C2342i c2342i3 = this.f9463d;
                int length2 = iArr.length;
                for (int i7 = 0; i7 < length2; i7++) {
                    int i8 = iArr[i7];
                    Bundle bundle6 = bundleArr[i7];
                    if (i7 == 0) {
                        abstractC2341hM8784W = this.f9463d;
                    } else {
                        sq8.m48646e(c2342i3);
                        abstractC2341hM8784W = c2342i3.m8784W(i8);
                    }
                    if (abstractC2341hM8784W == null) {
                        throw new IllegalStateException("Deep Linking failed: destination " + AbstractC2341h.f9602x.m8775b(this.f9460a, i8) + " cannot be found in graph " + c2342i3);
                    }
                    if (i7 == iArr.length - 1) {
                        C2345l.a aVar = new C2345l.a();
                        C2342i c2342i4 = this.f9463d;
                        sq8.m48646e(c2342i4);
                        m8608Y(abstractC2341hM8784W, bundle6, C2345l.a.m8813k(aVar, c2342i4.m8753A(), true, false, 4, null).m8815b(0).m8816c(0).m8814a(), null);
                    } else if (abstractC2341hM8784W instanceof C2342i) {
                        while (true) {
                            c2342i = (C2342i) abstractC2341hM8784W;
                            sq8.m48646e(c2342i);
                            if (!(c2342i.m8784W(c2342i.e0()) instanceof C2342i)) {
                                break;
                            }
                            abstractC2341hM8784W = c2342i.m8784W(c2342i.e0());
                        }
                        c2342i3 = c2342i;
                    }
                }
                this.f9466g = true;
                return true;
            }
        }
        return false;
    }

    /* renamed from: P */
    public final List m8600P(oo0 oo0Var) throws Resources.NotFoundException {
        AbstractC2341h abstractC2341hM8593I;
        ArrayList arrayList = new ArrayList();
        C2332c c2332c = (C2332c) this.f9467h.m42469G();
        if (c2332c == null || (abstractC2341hM8593I = c2332c.m8553e()) == null) {
            abstractC2341hM8593I = m8593I();
        }
        if (oo0Var != null) {
            Iterator<E> it = oo0Var.iterator();
            while (it.hasNext()) {
                NavBackStackEntryState navBackStackEntryState = (NavBackStackEntryState) it.next();
                AbstractC2341h abstractC2341hM8567A = m8567A(this, abstractC2341hM8593I, navBackStackEntryState.m8522a(), true, null, 4, null);
                if (abstractC2341hM8567A == null) {
                    throw new IllegalStateException(("Restore State failed: destination " + AbstractC2341h.f9602x.m8775b(this.f9460a, navBackStackEntryState.m8522a()) + " cannot be found from the current destination " + abstractC2341hM8593I).toString());
                }
                arrayList.add(navBackStackEntryState.m8524c(this.f9460a, abstractC2341hM8567A, m8594J(), this.f9477r));
                abstractC2341hM8593I = abstractC2341hM8567A;
            }
        }
        return arrayList;
    }

    /* renamed from: Q */
    public final boolean m8601Q(AbstractC2341h abstractC2341h, Bundle bundle) {
        int iNextIndex;
        AbstractC2341h abstractC2341hM8553e;
        C2332c c2332cM8590F = m8590F();
        oo0 oo0Var = this.f9467h;
        ListIterator<E> listIterator = oo0Var.listIterator(oo0Var.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                iNextIndex = -1;
                break;
            }
            if (((C2332c) listIterator.previous()).m8553e() == abstractC2341h) {
                iNextIndex = listIterator.nextIndex();
                break;
            }
        }
        if (iNextIndex == -1) {
            return false;
        }
        if (abstractC2341h instanceof C2342i) {
            List listM45302A = qef.m45302A(qef.m45319v(C2342i.f9625X.m8787a((C2342i) abstractC2341h), m.f9511a));
            if (this.f9467h.size() - iNextIndex != listM45302A.size()) {
                return false;
            }
            oo0 oo0Var2 = this.f9467h;
            List listSubList = oo0Var2.subList(iNextIndex, oo0Var2.size());
            ArrayList arrayList = new ArrayList(dh3.m23088v(listSubList, 10));
            Iterator it = listSubList.iterator();
            while (it.hasNext()) {
                arrayList.add(Integer.valueOf(((C2332c) it.next()).m8553e().m8753A()));
            }
            if (!sq8.m48644c(arrayList, listM45302A)) {
                return false;
            }
        } else if (!((c2332cM8590F == null || (abstractC2341hM8553e = c2332cM8590F.m8553e()) == null || abstractC2341h.m8753A() != abstractC2341hM8553e.m8753A()) ? false : true)) {
            return false;
        }
        oo0<C2332c> oo0Var3 = new oo0();
        while (ch3.m21248m(this.f9467h) >= iNextIndex) {
            C2332c c2332c = (C2332c) hh3.m30449I(this.f9467h);
            E0(c2332c);
            oo0Var3.m42480j(new C2332c(c2332c, c2332c.m8553e().m8768n(bundle)));
        }
        for (C2332c c2332c2 : oo0Var3) {
            C2342i c2342iM8756G = c2332c2.m8553e().m8756G();
            if (c2342iM8756G != null) {
                m8602S(c2332c2, m8588D(c2342iM8756G.m8753A()));
            }
            this.f9467h.add(c2332c2);
        }
        for (C2332c c2332c3 : oo0Var3) {
            this.f9483x.m8956d(c2332c3.m8553e().m8755F()).mo8716g(c2332c3);
        }
        return true;
    }

    /* renamed from: S */
    public final void m8602S(C2332c c2332c, C2332c c2332c2) {
        this.f9472m.put(c2332c, c2332c2);
        if (this.f9473n.get(c2332c2) == null) {
            this.f9473n.put(c2332c2, new AtomicInteger(0));
        }
        Object obj = this.f9473n.get(c2332c2);
        sq8.m48646e(obj);
        ((AtomicInteger) obj).incrementAndGet();
    }

    /* renamed from: T */
    public void m8603T(int i2) {
        m8604U(i2, null);
    }

    /* renamed from: U */
    public void m8604U(int i2, Bundle bundle) {
        m8605V(i2, bundle, null);
    }

    /* renamed from: V */
    public void m8605V(int i2, Bundle bundle, C2345l c2345l) {
        m8606W(i2, bundle, c2345l, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0117  */
    /* renamed from: W */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void m8606W(int i2, Bundle bundle, C2345l c2345l, AbstractC2348o.a aVar) throws Resources.NotFoundException {
        int iM53346b;
        Bundle bundle2;
        AbstractC2341h abstractC2341hM8553e = this.f9467h.isEmpty() ? this.f9463d : ((C2332c) this.f9467h.last()).m8553e();
        if (abstractC2341hM8553e == null) {
            throw new IllegalStateException("No current destination found. Ensure a navigation graph has been set for NavController " + this + '.');
        }
        vrb vrbVarM8771v = abstractC2341hM8553e.m8771v(i2);
        if (vrbVarM8771v != null) {
            if (c2345l == null) {
                c2345l = vrbVarM8771v.m53347c();
            }
            iM53346b = vrbVarM8771v.m53346b();
            Bundle bundleM53345a = vrbVarM8771v.m53345a();
            if (bundleM53345a != null) {
                bundle2 = new Bundle();
                bundle2.putAll(bundleM53345a);
            }
            if (bundle != null) {
                if (bundle2 == null) {
                    bundle2 = new Bundle();
                }
                bundle2.putAll(bundle);
            }
            if (iM53346b != 0 && c2345l != null && (c2345l.m8805e() != -1 || c2345l.m8806f() != null || c2345l.m8807g() != null)) {
                if (c2345l.m8806f() != null) {
                    String strM8806f = c2345l.m8806f();
                    sq8.m48646e(strM8806f);
                    j0(this, strM8806f, c2345l.m8809i(), false, 4, null);
                    return;
                } else if (c2345l.m8807g() != null) {
                    ob9 ob9VarM8807g = c2345l.m8807g();
                    sq8.m48646e(ob9VarM8807g);
                    g0(hve.m31222b(uff.m51545a(ob9VarM8807g)), c2345l.m8809i());
                    return;
                } else {
                    if (c2345l.m8805e() != -1) {
                        g0(c2345l.m8805e(), c2345l.m8809i());
                        return;
                    }
                    return;
                }
            }
            if (iM53346b == 0) {
                throw new IllegalArgumentException("Destination id == 0 can only be used in conjunction with a valid navOptions.popUpTo".toString());
            }
            AbstractC2341h abstractC2341hM8585y = m8585y(this, iM53346b, null, 2, null);
            if (abstractC2341hM8585y != null) {
                m8608Y(abstractC2341hM8585y, bundle2, c2345l, aVar);
                return;
            }
            AbstractC2341h.a aVar2 = AbstractC2341h.f9602x;
            String strM8775b = aVar2.m8775b(this.f9460a, iM53346b);
            if (vrbVarM8771v == null) {
                throw new IllegalArgumentException("Navigation action/destination " + strM8775b + " cannot be found from the current destination " + abstractC2341hM8553e);
            }
            throw new IllegalArgumentException(("Navigation destination " + strM8775b + " referenced from action " + aVar2.m8775b(this.f9460a, i2) + " cannot be found from the current destination " + abstractC2341hM8553e).toString());
        }
        iM53346b = i2;
        bundle2 = null;
        if (bundle != null) {
        }
        if (iM53346b != 0) {
        }
        if (iM53346b == 0) {
        }
    }

    /* renamed from: X */
    public void m8607X(Uri uri) {
        sq8.m48649h(uri, "deepLink");
        m8609Z(new yrb(uri, null, null));
    }

    /* renamed from: Y */
    public final void m8608Y(AbstractC2341h abstractC2341h, Bundle bundle, C2345l c2345l, AbstractC2348o.a aVar) throws Resources.NotFoundException {
        boolean z;
        boolean z2;
        boolean zM0;
        Iterator it = this.f9484y.values().iterator();
        while (it.hasNext()) {
            ((b) it.next()).m56789m(true);
        }
        dge dgeVar = new dge();
        if (c2345l == null) {
            z = false;
        } else {
            if (c2345l.m8806f() != null) {
                String strM8806f = c2345l.m8806f();
                sq8.m48646e(strM8806f);
                zM0 = o0(strM8806f, c2345l.m8809i(), c2345l.m8811k());
            } else if (c2345l.m8807g() != null) {
                ob9 ob9VarM8807g = c2345l.m8807g();
                sq8.m48646e(ob9VarM8807g);
                zM0 = m0(hve.m31222b(uff.m51545a(ob9VarM8807g)), c2345l.m8809i(), c2345l.m8811k());
            } else if (c2345l.m8808h() != null) {
                Object objM8808h = c2345l.m8808h();
                sq8.m48646e(objM8808h);
                zM0 = n0(objM8808h, c2345l.m8809i(), c2345l.m8811k());
            } else {
                if (c2345l.m8805e() != -1) {
                    zM0 = m0(c2345l.m8805e(), c2345l.m8809i(), c2345l.m8811k());
                }
                z = false;
            }
            z = zM0;
        }
        Bundle bundleM8768n = abstractC2341h.m8768n(bundle);
        if ((c2345l != null && c2345l.m8812l()) && this.f9474o.containsKey(Integer.valueOf(abstractC2341h.m8753A()))) {
            dgeVar.f19803a = v0(abstractC2341h.m8753A(), bundleM8768n, c2345l, aVar);
            z2 = false;
        } else {
            z2 = (c2345l != null && c2345l.m8810j()) && m8601Q(abstractC2341h, bundle);
            if (!z2) {
                c0(this.f9483x.m8956d(abstractC2341h.m8755F()), bh3.m18963e(C2332c.a.m8562b(C2332c.f9433M, this.f9460a, abstractC2341h, bundleM8768n, m8594J(), this.f9477r, null, null, 96, null)), c2345l, aVar, new o(dgeVar, this, abstractC2341h, bundleM8768n));
            }
        }
        G0();
        Iterator it2 = this.f9484y.values().iterator();
        while (it2.hasNext()) {
            ((b) it2.next()).m56789m(false);
        }
        if (z || dgeVar.f19803a || z2) {
            m8614u();
        } else {
            F0();
        }
    }

    /* renamed from: Z */
    public void m8609Z(yrb yrbVar) throws Resources.NotFoundException {
        sq8.m48649h(yrbVar, "request");
        a0(yrbVar, null);
    }

    public void a0(yrb yrbVar, C2345l c2345l) throws Resources.NotFoundException {
        sq8.m48649h(yrbVar, "request");
        b0(yrbVar, c2345l, null);
    }

    public void b0(yrb yrbVar, C2345l c2345l, AbstractC2348o.a aVar) throws Resources.NotFoundException {
        sq8.m48649h(yrbVar, "request");
        if (this.f9463d == null) {
            throw new IllegalArgumentException(("Cannot navigate to " + yrbVar + ". Navigation graph has not been set for NavController " + this + '.').toString());
        }
        C2342i c2342iM8598N = m8598N(this.f9467h);
        AbstractC2341h.b bVarG0 = c2342iM8598N.g0(yrbVar, true, true, c2342iM8598N);
        if (bVarG0 == null) {
            throw new IllegalArgumentException("Navigation destination that matches request " + yrbVar + " cannot be found in the navigation graph " + this.f9463d);
        }
        Bundle bundleM8768n = bVarG0.m8779c().m8768n(bVarG0.m8780d());
        if (bundleM8768n == null) {
            bundleM8768n = new Bundle();
        }
        AbstractC2341h abstractC2341hM8779c = bVarG0.m8779c();
        Intent intent = new Intent();
        intent.setDataAndType(yrbVar.m58140c(), yrbVar.m58139b());
        intent.setAction(yrbVar.m58138a());
        bundleM8768n.putParcelable("android-support-nav:controller:deepLinkIntent", intent);
        m8608Y(abstractC2341hM8779c, bundleM8768n, c2345l, aVar);
    }

    public final void c0(AbstractC2348o abstractC2348o, List list, C2345l c2345l, AbstractC2348o.a aVar, xk7 xk7Var) {
        this.f9485z = xk7Var;
        abstractC2348o.mo8714e(list, c2345l, aVar);
        this.f9485z = null;
    }

    public boolean d0() {
        Intent intent;
        if (m8592H() != 1) {
            return f0();
        }
        Activity activity = this.f9461b;
        Bundle extras = (activity == null || (intent = activity.getIntent()) == null) ? null : intent.getExtras();
        return (extras != null ? extras.getIntArray("android-support-nav:controller:deepLinkIds") : null) != null ? C0() : D0();
    }

    public final void e0(Bundle bundle) throws Resources.NotFoundException {
        Activity activity;
        ArrayList<String> stringArrayList;
        Bundle bundle2 = this.f9464e;
        if (bundle2 != null && (stringArrayList = bundle2.getStringArrayList("android-support-nav:controller:navigatorState:names")) != null) {
            Iterator<String> it = stringArrayList.iterator();
            while (it.hasNext()) {
                String next = it.next();
                C2349p c2349p = this.f9483x;
                sq8.m48648g(next, "name");
                AbstractC2348o abstractC2348oM8956d = c2349p.m8956d(next);
                Bundle bundle3 = bundle2.getBundle(next);
                if (bundle3 != null) {
                    abstractC2348oM8956d.mo8717h(bundle3);
                }
            }
        }
        Parcelable[] parcelableArr = this.f9465f;
        boolean z = false;
        if (parcelableArr != null) {
            for (Parcelable parcelable : parcelableArr) {
                sq8.m48647f(parcelable, "null cannot be cast to non-null type androidx.navigation.NavBackStackEntryState");
                NavBackStackEntryState navBackStackEntryState = (NavBackStackEntryState) parcelable;
                AbstractC2341h abstractC2341hM8585y = m8585y(this, navBackStackEntryState.m8522a(), null, 2, null);
                if (abstractC2341hM8585y == null) {
                    throw new IllegalStateException("Restoring the Navigation back stack failed: destination " + AbstractC2341h.f9602x.m8775b(this.f9460a, navBackStackEntryState.m8522a()) + " cannot be found from the current destination " + m8591G());
                }
                C2332c c2332cM8524c = navBackStackEntryState.m8524c(this.f9460a, abstractC2341hM8585y, m8594J(), this.f9477r);
                AbstractC2348o abstractC2348oM8956d2 = this.f9483x.m8956d(abstractC2341hM8585y.m8755F());
                Map map = this.f9484y;
                Object bVar = map.get(abstractC2348oM8956d2);
                if (bVar == null) {
                    bVar = new b(this, abstractC2348oM8956d2);
                    map.put(abstractC2348oM8956d2, bVar);
                }
                this.f9467h.add(c2332cM8524c);
                ((b) bVar).m8626o(c2332cM8524c);
                C2342i c2342iM8756G = c2332cM8524c.m8553e().m8756G();
                if (c2342iM8756G != null) {
                    m8602S(c2332cM8524c, m8588D(c2342iM8756G.m8753A()));
                }
            }
            G0();
            this.f9465f = null;
        }
        Collection collectionValues = this.f9483x.m8957e().values();
        ArrayList<AbstractC2348o> arrayList = new ArrayList();
        for (Object obj : collectionValues) {
            if (!((AbstractC2348o) obj).m8950c()) {
                arrayList.add(obj);
            }
        }
        for (AbstractC2348o abstractC2348o : arrayList) {
            Map map2 = this.f9484y;
            Object bVar2 = map2.get(abstractC2348o);
            if (bVar2 == null) {
                bVar2 = new b(this, abstractC2348o);
                map2.put(abstractC2348o, bVar2);
            }
            abstractC2348o.mo8715f((b) bVar2);
        }
        if (this.f9463d == null || !this.f9467h.isEmpty()) {
            m8614u();
            return;
        }
        if (!this.f9466g && (activity = this.f9461b) != null) {
            sq8.m48646e(activity);
            if (m8599O(activity.getIntent())) {
                z = true;
            }
        }
        if (z) {
            return;
        }
        C2342i c2342i = this.f9463d;
        sq8.m48646e(c2342i);
        m8608Y(c2342i, bundle, null, null);
    }

    public boolean f0() {
        if (this.f9467h.isEmpty()) {
            return false;
        }
        AbstractC2341h abstractC2341hM8591G = m8591G();
        sq8.m48646e(abstractC2341hM8591G);
        return g0(abstractC2341hM8591G.m8753A(), true);
    }

    public boolean g0(int i2, boolean z) {
        return h0(i2, z, false);
    }

    public boolean h0(int i2, boolean z, boolean z2) {
        return m0(i2, z, z2) && m8614u();
    }

    public final boolean i0(String str, boolean z, boolean z2) {
        sq8.m48649h(str, "route");
        return o0(str, z, z2) && m8614u();
    }

    public final void k0(C2332c c2332c, uk7 uk7Var) throws Resources.NotFoundException {
        sq8.m48649h(c2332c, "popUpTo");
        sq8.m48649h(uk7Var, "onComplete");
        int iIndexOf = this.f9467h.indexOf(c2332c);
        if (iIndexOf < 0) {
            StringBuilder sb = new StringBuilder();
            sb.append("Ignoring pop of ");
            sb.append(c2332c);
            sb.append(" as it was not found on the current back stack");
            return;
        }
        int i2 = iIndexOf + 1;
        if (i2 != this.f9467h.size()) {
            m0(((C2332c) this.f9467h.get(i2)).m8553e().m8753A(), true, false);
        }
        r0(this, c2332c, false, null, 6, null);
        uk7Var.invoke();
        G0();
        m8614u();
    }

    public final void l0(AbstractC2348o abstractC2348o, C2332c c2332c, boolean z, xk7 xk7Var) {
        this.f9453A = xk7Var;
        abstractC2348o.mo8719j(c2332c, z);
        this.f9453A = null;
    }

    public final boolean m0(int i2, boolean z, boolean z2) throws Resources.NotFoundException {
        AbstractC2341h abstractC2341hM8553e;
        if (this.f9467h.isEmpty()) {
            return false;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = kh3.B0(this.f9467h).iterator();
        while (true) {
            if (!it.hasNext()) {
                abstractC2341hM8553e = null;
                break;
            }
            abstractC2341hM8553e = ((C2332c) it.next()).m8553e();
            AbstractC2348o abstractC2348oM8956d = this.f9483x.m8956d(abstractC2341hM8553e.m8755F());
            if (z || abstractC2341hM8553e.m8753A() != i2) {
                arrayList.add(abstractC2348oM8956d);
            }
            if (abstractC2341hM8553e.m8753A() == i2) {
                break;
            }
        }
        if (abstractC2341hM8553e != null) {
            return m8615v(arrayList, abstractC2341hM8553e, z, z2);
        }
        String strM8775b = AbstractC2341h.f9602x.m8775b(this.f9460a, i2);
        StringBuilder sb = new StringBuilder();
        sb.append("Ignoring popBackStack to destination ");
        sb.append(strM8775b);
        sb.append(" as it was not found on the current back stack");
        return false;
    }

    public final boolean n0(Object obj, boolean z, boolean z2) {
        return o0(m8587C(obj), z, z2);
    }

    public final boolean o0(String str, boolean z, boolean z2) {
        Object objPrevious;
        if (this.f9467h.isEmpty()) {
            return false;
        }
        ArrayList arrayList = new ArrayList();
        oo0 oo0Var = this.f9467h;
        ListIterator<E> listIterator = oo0Var.listIterator(oo0Var.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                objPrevious = null;
                break;
            }
            objPrevious = listIterator.previous();
            C2332c c2332c = (C2332c) objPrevious;
            boolean zM8759L = c2332c.m8553e().m8759L(str, c2332c.m8551c());
            if (z || !zM8759L) {
                arrayList.add(this.f9483x.m8956d(c2332c.m8553e().m8755F()));
            }
            if (zM8759L) {
                break;
            }
        }
        C2332c c2332c2 = (C2332c) objPrevious;
        AbstractC2341h abstractC2341hM8553e = c2332c2 != null ? c2332c2.m8553e() : null;
        if (abstractC2341hM8553e != null) {
            return m8615v(arrayList, abstractC2341hM8553e, z, z2);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Ignoring popBackStack to route ");
        sb.append(str);
        sb.append(" as it was not found on the current back stack");
        return false;
    }

    /* renamed from: p */
    public final void m8610p(AbstractC2341h abstractC2341h, Bundle bundle, C2332c c2332c, List list) {
        boolean z;
        oo0<C2332c> oo0Var;
        AbstractC2341h abstractC2341h2;
        C2332c c2332c2;
        Bundle bundle2;
        Object objPrevious;
        C2342i c2342i;
        Object objPrevious2;
        List list2;
        Bundle bundle3;
        Bundle bundle4 = bundle;
        C2332c c2332c3 = c2332c;
        List list3 = list;
        AbstractC2341h abstractC2341hM8553e = c2332c.m8553e();
        if (!(abstractC2341hM8553e instanceof r37)) {
            while (!this.f9467h.isEmpty() && (((C2332c) this.f9467h.last()).m8553e() instanceof r37) && p0(this, ((C2332c) this.f9467h.last()).m8553e().m8753A(), true, false, 4, null)) {
            }
        }
        oo0 oo0Var2 = new oo0();
        boolean z2 = true;
        Object obj = null;
        if (abstractC2341h instanceof C2342i) {
            AbstractC2341h abstractC2341h3 = abstractC2341hM8553e;
            while (true) {
                sq8.m48646e(abstractC2341h3);
                C2342i c2342iM8756G = abstractC2341h3.m8756G();
                if (c2342iM8756G != null) {
                    ListIterator listIterator = list3.listIterator(list.size());
                    while (true) {
                        if (listIterator.hasPrevious()) {
                            objPrevious2 = listIterator.previous();
                            if (sq8.m48644c(((C2332c) objPrevious2).m8553e(), c2342iM8756G)) {
                                break;
                            }
                        } else {
                            objPrevious2 = null;
                            break;
                        }
                    }
                    C2332c c2332cM8562b = (C2332c) objPrevious2;
                    if (c2332cM8562b == null) {
                        abstractC2341h2 = abstractC2341hM8553e;
                        list2 = list3;
                        bundle3 = bundle4;
                        c2332c2 = c2332c3;
                        c2332cM8562b = C2332c.a.m8562b(C2332c.f9433M, this.f9460a, c2342iM8756G, bundle, m8594J(), this.f9477r, null, null, 96, null);
                    } else {
                        abstractC2341h2 = abstractC2341hM8553e;
                        list2 = list3;
                        c2332c2 = c2332c3;
                        bundle3 = bundle4;
                    }
                    oo0Var2.m42480j(c2332cM8562b);
                    if ((this.f9467h.isEmpty() ^ z2) && ((C2332c) this.f9467h.last()).m8553e() == c2342iM8756G) {
                        list3 = list2;
                        bundle2 = bundle3;
                        c2342i = c2342iM8756G;
                        z = z2;
                        oo0Var = oo0Var2;
                        r0(this, (C2332c) this.f9467h.last(), false, null, 6, null);
                    } else {
                        list3 = list2;
                        bundle2 = bundle3;
                        c2342i = c2342iM8756G;
                        z = z2;
                        oo0Var = oo0Var2;
                    }
                } else {
                    c2342i = c2342iM8756G;
                    z = z2;
                    oo0Var = oo0Var2;
                    abstractC2341h2 = abstractC2341hM8553e;
                    c2332c2 = c2332c3;
                    bundle2 = bundle4;
                }
                if (c2342i == null || c2342i == abstractC2341h) {
                    break;
                }
                abstractC2341h3 = c2342i;
                z2 = z;
                oo0Var2 = oo0Var;
                bundle4 = bundle2;
                abstractC2341hM8553e = abstractC2341h2;
                c2332c3 = c2332c2;
            }
        } else {
            z = true;
            oo0Var = oo0Var2;
            abstractC2341h2 = abstractC2341hM8553e;
            c2332c2 = c2332c3;
            bundle2 = bundle4;
        }
        AbstractC2341h abstractC2341hM8553e2 = oo0Var.isEmpty() ? abstractC2341h2 : ((C2332c) oo0Var.first()).m8553e();
        while (abstractC2341hM8553e2 != null && m8617x(abstractC2341hM8553e2.m8753A(), abstractC2341hM8553e2) != abstractC2341hM8553e2) {
            abstractC2341hM8553e2 = abstractC2341hM8553e2.m8756G();
            if (abstractC2341hM8553e2 != null) {
                boolean z3 = false;
                if (bundle2 != null && bundle.isEmpty() == z) {
                    z3 = z;
                }
                Bundle bundle5 = z3 ? null : bundle2;
                ListIterator listIterator2 = list3.listIterator(list.size());
                while (true) {
                    if (listIterator2.hasPrevious()) {
                        objPrevious = listIterator2.previous();
                        if (sq8.m48644c(((C2332c) objPrevious).m8553e(), abstractC2341hM8553e2)) {
                            break;
                        }
                    } else {
                        objPrevious = null;
                        break;
                    }
                }
                C2332c c2332cM8562b2 = (C2332c) objPrevious;
                if (c2332cM8562b2 == null) {
                    c2332cM8562b2 = C2332c.a.m8562b(C2332c.f9433M, this.f9460a, abstractC2341hM8553e2, abstractC2341hM8553e2.m8768n(bundle5), m8594J(), this.f9477r, null, null, 96, null);
                }
                oo0Var.m42480j(c2332cM8562b2);
            }
        }
        AbstractC2341h abstractC2341hM8553e3 = oo0Var.isEmpty() ? abstractC2341h2 : ((C2332c) oo0Var.first()).m8553e();
        while (!this.f9467h.isEmpty() && (((C2332c) this.f9467h.last()).m8553e() instanceof C2342i)) {
            AbstractC2341h abstractC2341hM8553e4 = ((C2332c) this.f9467h.last()).m8553e();
            sq8.m48647f(abstractC2341hM8553e4, "null cannot be cast to non-null type androidx.navigation.NavGraph");
            if (((C2342i) abstractC2341hM8553e4).c0().m22184f(abstractC2341hM8553e3.m8753A()) != null) {
                break;
            } else {
                r0(this, (C2332c) this.f9467h.last(), false, null, 6, null);
            }
        }
        C2332c c2332c4 = (C2332c) this.f9467h.m42467B();
        if (c2332c4 == null) {
            c2332c4 = (C2332c) oo0Var.m42467B();
        }
        if (!sq8.m48644c(c2332c4 != null ? c2332c4.m8553e() : null, this.f9463d)) {
            ListIterator listIterator3 = list3.listIterator(list.size());
            while (true) {
                if (!listIterator3.hasPrevious()) {
                    break;
                }
                Object objPrevious3 = listIterator3.previous();
                AbstractC2341h abstractC2341hM8553e5 = ((C2332c) objPrevious3).m8553e();
                C2342i c2342i2 = this.f9463d;
                sq8.m48646e(c2342i2);
                if (sq8.m48644c(abstractC2341hM8553e5, c2342i2)) {
                    obj = objPrevious3;
                    break;
                }
            }
            C2332c c2332cM8562b3 = (C2332c) obj;
            if (c2332cM8562b3 == null) {
                C2332c.a aVar = C2332c.f9433M;
                Context context = this.f9460a;
                C2342i c2342i3 = this.f9463d;
                sq8.m48646e(c2342i3);
                C2342i c2342i4 = this.f9463d;
                sq8.m48646e(c2342i4);
                c2332cM8562b3 = C2332c.a.m8562b(aVar, context, c2342i3, c2342i4.m8768n(bundle2), m8594J(), this.f9477r, null, null, 96, null);
            }
            oo0Var.m42480j(c2332cM8562b3);
        }
        for (C2332c c2332c5 : oo0Var) {
            Object obj2 = this.f9484y.get(this.f9483x.m8956d(c2332c5.m8553e().m8755F()));
            if (obj2 == null) {
                throw new IllegalStateException(("NavigatorBackStack for " + abstractC2341h.m8755F() + " should already be created").toString());
            }
            ((b) obj2).m8626o(c2332c5);
        }
        this.f9467h.addAll(oo0Var);
        this.f9467h.add(c2332c2);
        for (C2332c c2332c6 : kh3.y0(oo0Var, c2332c2)) {
            C2342i c2342iM8756G2 = c2332c6.m8553e().m8756G();
            if (c2342iM8756G2 != null) {
                m8602S(c2332c6, m8588D(c2342iM8756G2.m8753A()));
            }
        }
    }

    public final void q0(C2332c c2332c, boolean z, oo0 oo0Var) {
        C2334e c2334e;
        q4g q4gVarM56784c;
        Set set;
        C2332c c2332c2 = (C2332c) this.f9467h.last();
        if (!sq8.m48644c(c2332c2, c2332c)) {
            throw new IllegalStateException(("Attempted to pop " + c2332c.m8553e() + ", which is not the top of the back stack (" + c2332c2.m8553e() + ')').toString());
        }
        hh3.m30449I(this.f9467h);
        b bVar = (b) this.f9484y.get(m8596L().m8956d(c2332c2.m8553e().m8755F()));
        boolean z2 = true;
        if (!((bVar == null || (q4gVarM56784c = bVar.m56784c()) == null || (set = (Set) q4gVarM56784c.getValue()) == null || !set.contains(c2332c2)) ? false : true) && !this.f9473n.containsKey(c2332c2)) {
            z2 = false;
        }
        AbstractC2139h.b bVarMo6522b = c2332c2.getLifecycle().mo6522b();
        AbstractC2139h.b bVar2 = AbstractC2139h.b.CREATED;
        if (bVarMo6522b.isAtLeast(bVar2)) {
            if (z) {
                c2332c2.m8560l(bVar2);
                oo0Var.m42480j(new NavBackStackEntryState(c2332c2));
            }
            if (z2) {
                c2332c2.m8560l(bVar2);
            } else {
                c2332c2.m8560l(AbstractC2139h.b.DESTROYED);
                E0(c2332c2);
            }
        }
        if (z || z2 || (c2334e = this.f9477r) == null) {
            return;
        }
        c2334e.m8643g(c2332c2.m8554f());
    }

    /* renamed from: r */
    public void m8611r(c cVar) {
        sq8.m48649h(cVar, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        this.f9478s.add(cVar);
        if (!this.f9467h.isEmpty()) {
            C2332c c2332c = (C2332c) this.f9467h.last();
            cVar.mo74a(this, c2332c.m8553e(), c2332c.m8551c());
        }
    }

    /* renamed from: s */
    public final boolean m8612s(int i2) {
        Iterator it = this.f9484y.values().iterator();
        while (it.hasNext()) {
            ((b) it.next()).m56789m(true);
        }
        boolean zV0 = v0(i2, null, csb.m21707a(e.f9492a), null);
        Iterator it2 = this.f9484y.values().iterator();
        while (it2.hasNext()) {
            ((b) it2.next()).m56789m(false);
        }
        return zV0 && m0(i2, true, false);
    }

    public final List s0() {
        ArrayList arrayList = new ArrayList();
        Iterator it = this.f9484y.values().iterator();
        while (it.hasNext()) {
            Iterable iterable = (Iterable) ((b) it.next()).m56784c().getValue();
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : iterable) {
                C2332c c2332c = (C2332c) obj;
                if ((arrayList.contains(c2332c) || c2332c.m8555g().isAtLeast(AbstractC2139h.b.STARTED)) ? false : true) {
                    arrayList2.add(obj);
                }
            }
            hh3.m30441A(arrayList, arrayList2);
        }
        oo0 oo0Var = this.f9467h;
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : oo0Var) {
            C2332c c2332c2 = (C2332c) obj2;
            if (!arrayList.contains(c2332c2) && c2332c2.m8555g().isAtLeast(AbstractC2139h.b.STARTED)) {
                arrayList3.add(obj2);
            }
        }
        hh3.m30441A(arrayList, arrayList3);
        ArrayList arrayList4 = new ArrayList();
        for (Object obj3 : arrayList) {
            if (!(((C2332c) obj3).m8553e() instanceof C2342i)) {
                arrayList4.add(obj3);
            }
        }
        return arrayList4;
    }

    /* renamed from: t */
    public C2340g m8613t() {
        return new C2340g(this);
    }

    public void t0(c cVar) {
        sq8.m48649h(cVar, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        this.f9478s.remove(cVar);
    }

    /* renamed from: u */
    public final boolean m8614u() {
        while (!this.f9467h.isEmpty() && (((C2332c) this.f9467h.last()).m8553e() instanceof C2342i)) {
            r0(this, (C2332c) this.f9467h.last(), false, null, 6, null);
        }
        C2332c c2332c = (C2332c) this.f9467h.m42469G();
        if (c2332c != null) {
            this.f9456D.add(c2332c);
        }
        this.f9455C++;
        F0();
        int i2 = this.f9455C - 1;
        this.f9455C = i2;
        if (i2 == 0) {
            List<C2332c> listT0 = kh3.T0(this.f9456D);
            this.f9456D.clear();
            for (C2332c c2332c2 : listT0) {
                Iterator it = this.f9478s.iterator();
                while (it.hasNext()) {
                    ((c) it.next()).mo74a(this, c2332c2.m8553e(), c2332c2.m8551c());
                }
                this.f9458F.mo17498b(c2332c2);
            }
            this.f9468i.mo17498b(kh3.T0(this.f9467h));
            this.f9470k.mo17498b(s0());
        }
        return c2332c != null;
    }

    public void u0(Bundle bundle) {
        if (bundle == null) {
            return;
        }
        bundle.setClassLoader(this.f9460a.getClassLoader());
        this.f9464e = bundle.getBundle("android-support-nav:controller:navigatorState");
        this.f9465f = bundle.getParcelableArray("android-support-nav:controller:backStack");
        this.f9475p.clear();
        int[] intArray = bundle.getIntArray("android-support-nav:controller:backStackDestIds");
        ArrayList<String> stringArrayList = bundle.getStringArrayList("android-support-nav:controller:backStackIds");
        if (intArray != null && stringArrayList != null) {
            int length = intArray.length;
            int i2 = 0;
            int i3 = 0;
            while (i2 < length) {
                this.f9474o.put(Integer.valueOf(intArray[i2]), stringArrayList.get(i3));
                i2++;
                i3++;
            }
        }
        ArrayList<String> stringArrayList2 = bundle.getStringArrayList("android-support-nav:controller:backStackStates");
        if (stringArrayList2 != null) {
            for (String str : stringArrayList2) {
                Parcelable[] parcelableArray = bundle.getParcelableArray("android-support-nav:controller:backStackStates:" + str);
                if (parcelableArray != null) {
                    Map map = this.f9475p;
                    sq8.m48648g(str, OutcomeConstants.OUTCOME_ID);
                    oo0 oo0Var = new oo0(parcelableArray.length);
                    Iterator itM45707a = qo0.m45707a(parcelableArray);
                    while (itM45707a.hasNext()) {
                        Parcelable parcelable = (Parcelable) itM45707a.next();
                        sq8.m48647f(parcelable, "null cannot be cast to non-null type androidx.navigation.NavBackStackEntryState");
                        oo0Var.add((NavBackStackEntryState) parcelable);
                    }
                    map.put(str, oo0Var);
                }
            }
        }
        this.f9466g = bundle.getBoolean("android-support-nav:controller:deepLinkHandled");
    }

    /* renamed from: v */
    public final boolean m8615v(List list, AbstractC2341h abstractC2341h, boolean z, boolean z2) {
        dge dgeVar = new dge();
        oo0 oo0Var = new oo0();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AbstractC2348o abstractC2348o = (AbstractC2348o) it.next();
            dge dgeVar2 = new dge();
            l0(abstractC2348o, (C2332c) this.f9467h.last(), z2, new f(dgeVar2, dgeVar, this, z2, oo0Var));
            if (!dgeVar2.f19803a) {
                break;
            }
        }
        if (z2) {
            if (!z) {
                for (AbstractC2341h abstractC2341h2 : qef.m45322y(oef.m42147f(abstractC2341h, g.f9498a), new h())) {
                    Map map = this.f9474o;
                    Integer numValueOf = Integer.valueOf(abstractC2341h2.m8753A());
                    NavBackStackEntryState navBackStackEntryState = (NavBackStackEntryState) oo0Var.m42467B();
                    map.put(numValueOf, navBackStackEntryState != null ? navBackStackEntryState.m8523b() : null);
                }
            }
            if (!oo0Var.isEmpty()) {
                NavBackStackEntryState navBackStackEntryState2 = (NavBackStackEntryState) oo0Var.first();
                Iterator it2 = qef.m45322y(oef.m42147f(m8585y(this, navBackStackEntryState2.m8522a(), null, 2, null), i.f9500a), new j()).iterator();
                while (it2.hasNext()) {
                    this.f9474o.put(Integer.valueOf(((AbstractC2341h) it2.next()).m8753A()), navBackStackEntryState2.m8523b());
                }
                if (this.f9474o.values().contains(navBackStackEntryState2.m8523b())) {
                    this.f9475p.put(navBackStackEntryState2.m8523b(), oo0Var);
                }
            }
        }
        G0();
        return dgeVar.f19803a;
    }

    public final boolean v0(int i2, Bundle bundle, C2345l c2345l, AbstractC2348o.a aVar) {
        if (!this.f9474o.containsKey(Integer.valueOf(i2))) {
            return false;
        }
        String str = (String) this.f9474o.get(Integer.valueOf(i2));
        hh3.m30446F(this.f9474o.values(), new q(str));
        return m8616w(m8600P((oo0) azh.m18051d(this.f9475p).remove(str)), bundle, c2345l, aVar);
    }

    /* renamed from: w */
    public final boolean m8616w(List list, Bundle bundle, C2345l c2345l, AbstractC2348o.a aVar) {
        C2332c c2332c;
        AbstractC2341h abstractC2341hM8553e;
        ArrayList<List> arrayList = new ArrayList();
        ArrayList<C2332c> arrayList2 = new ArrayList();
        for (Object obj : list) {
            if (!(((C2332c) obj).m8553e() instanceof C2342i)) {
                arrayList2.add(obj);
            }
        }
        for (C2332c c2332c2 : arrayList2) {
            List list2 = (List) kh3.s0(arrayList);
            if (sq8.m48644c((list2 == null || (c2332c = (C2332c) kh3.r0(list2)) == null || (abstractC2341hM8553e = c2332c.m8553e()) == null) ? null : abstractC2341hM8553e.m8755F(), c2332c2.m8553e().m8755F())) {
                list2.add(c2332c2);
            } else {
                arrayList.add(ch3.m21252q(c2332c2));
            }
        }
        dge dgeVar = new dge();
        for (List list3 : arrayList) {
            c0(this.f9483x.m8956d(((C2332c) kh3.f0(list3)).m8553e().m8755F()), list3, c2345l, aVar, new k(dgeVar, list, new ege(), this, bundle));
        }
        return dgeVar.f19803a;
    }

    public Bundle w0() {
        Bundle bundle;
        ArrayList<String> arrayList = new ArrayList<>();
        Bundle bundle2 = new Bundle();
        for (Map.Entry entry : this.f9483x.m8957e().entrySet()) {
            String str = (String) entry.getKey();
            Bundle bundleMo8718i = ((AbstractC2348o) entry.getValue()).mo8718i();
            if (bundleMo8718i != null) {
                arrayList.add(str);
                bundle2.putBundle(str, bundleMo8718i);
            }
        }
        if (!arrayList.isEmpty()) {
            bundle = new Bundle();
            bundle2.putStringArrayList("android-support-nav:controller:navigatorState:names", arrayList);
            bundle.putBundle("android-support-nav:controller:navigatorState", bundle2);
        } else {
            bundle = null;
        }
        if (!this.f9467h.isEmpty()) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            Parcelable[] parcelableArr = new Parcelable[this.f9467h.size()];
            Iterator<E> it = this.f9467h.iterator();
            int i2 = 0;
            while (it.hasNext()) {
                parcelableArr[i2] = new NavBackStackEntryState((C2332c) it.next());
                i2++;
            }
            bundle.putParcelableArray("android-support-nav:controller:backStack", parcelableArr);
        }
        if (!this.f9474o.isEmpty()) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            int[] iArr = new int[this.f9474o.size()];
            ArrayList<String> arrayList2 = new ArrayList<>();
            int i3 = 0;
            for (Map.Entry entry2 : this.f9474o.entrySet()) {
                int iIntValue = ((Number) entry2.getKey()).intValue();
                String str2 = (String) entry2.getValue();
                iArr[i3] = iIntValue;
                arrayList2.add(str2);
                i3++;
            }
            bundle.putIntArray("android-support-nav:controller:backStackDestIds", iArr);
            bundle.putStringArrayList("android-support-nav:controller:backStackIds", arrayList2);
        }
        if (!this.f9475p.isEmpty()) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            ArrayList<String> arrayList3 = new ArrayList<>();
            for (Map.Entry entry3 : this.f9475p.entrySet()) {
                String str3 = (String) entry3.getKey();
                oo0 oo0Var = (oo0) entry3.getValue();
                arrayList3.add(str3);
                Parcelable[] parcelableArr2 = new Parcelable[oo0Var.size()];
                int i4 = 0;
                for (Object obj : oo0Var) {
                    int i5 = i4 + 1;
                    if (i4 < 0) {
                        ch3.m21256u();
                    }
                    parcelableArr2[i4] = (NavBackStackEntryState) obj;
                    i4 = i5;
                }
                bundle.putParcelableArray("android-support-nav:controller:backStackStates:" + str3, parcelableArr2);
            }
            bundle.putStringArrayList("android-support-nav:controller:backStackStates", arrayList3);
        }
        if (this.f9466g) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putBoolean("android-support-nav:controller:deepLinkHandled", this.f9466g);
        }
        return bundle;
    }

    /* renamed from: x */
    public final AbstractC2341h m8617x(int i2, AbstractC2341h abstractC2341h) {
        AbstractC2341h abstractC2341hM8553e;
        C2342i c2342i = this.f9463d;
        if (c2342i == null) {
            return null;
        }
        sq8.m48646e(c2342i);
        if (c2342i.m8753A() == i2) {
            if (abstractC2341h == null) {
                return this.f9463d;
            }
            if (sq8.m48644c(this.f9463d, abstractC2341h) && abstractC2341h.m8756G() == null) {
                return this.f9463d;
            }
        }
        C2332c c2332c = (C2332c) this.f9467h.m42469G();
        if (c2332c == null || (abstractC2341hM8553e = c2332c.m8553e()) == null) {
            abstractC2341hM8553e = this.f9463d;
            sq8.m48646e(abstractC2341hM8553e);
        }
        return m8618z(abstractC2341hM8553e, i2, false, abstractC2341h);
    }

    public void x0(int i2) throws Resources.NotFoundException {
        z0(m8595K().m8794b(i2), null);
    }

    public void y0(int i2, Bundle bundle) throws Resources.NotFoundException {
        z0(m8595K().m8794b(i2), bundle);
    }

    /* renamed from: z */
    public final AbstractC2341h m8618z(AbstractC2341h abstractC2341h, int i2, boolean z, AbstractC2341h abstractC2341h2) {
        C2342i c2342i;
        sq8.m48649h(abstractC2341h, "<this>");
        if (abstractC2341h.m8753A() == i2 && (abstractC2341h2 == null || (sq8.m48644c(abstractC2341h, abstractC2341h2) && sq8.m48644c(abstractC2341h.m8756G(), abstractC2341h2.m8756G())))) {
            return abstractC2341h;
        }
        if (abstractC2341h instanceof C2342i) {
            c2342i = (C2342i) abstractC2341h;
        } else {
            C2342i c2342iM8756G = abstractC2341h.m8756G();
            sq8.m48646e(c2342iM8756G);
            c2342i = c2342iM8756G;
        }
        return c2342i.a0(i2, c2342i, z, abstractC2341h2);
    }

    public void z0(C2342i c2342i, Bundle bundle) throws Resources.NotFoundException {
        sq8.m48649h(c2342i, "graph");
        if (!(this.f9467h.isEmpty() || m8594J() != AbstractC2139h.b.DESTROYED)) {
            throw new IllegalStateException("You cannot set a new graph on a NavController with entries on the back stack after the NavController has been destroyed. Please ensure that your NavHost has the same lifetime as your NavController.".toString());
        }
        if (!sq8.m48644c(this.f9463d, c2342i)) {
            C2342i c2342i2 = this.f9463d;
            if (c2342i2 != null) {
                for (Integer num : new ArrayList(this.f9474o.keySet())) {
                    sq8.m48648g(num, OutcomeConstants.OUTCOME_ID);
                    m8612s(num.intValue());
                }
                p0(this, c2342i2.m8753A(), true, false, 4, null);
            }
            this.f9463d = c2342i;
            e0(bundle);
            return;
        }
        int iM22193p = c2342i.c0().m22193p();
        for (int i2 = 0; i2 < iM22193p; i2++) {
            AbstractC2341h abstractC2341h = (AbstractC2341h) c2342i.c0().m22194q(i2);
            C2342i c2342i3 = this.f9463d;
            sq8.m48646e(c2342i3);
            int iM22189k = c2342i3.c0().m22189k(i2);
            C2342i c2342i4 = this.f9463d;
            sq8.m48646e(c2342i4);
            c2342i4.c0().m22192n(iM22189k, abstractC2341h);
        }
        for (C2332c c2332c : this.f9467h) {
            List<AbstractC2341h> listM32128P = ih3.m32128P(qef.m45302A(AbstractC2341h.f9602x.m8776c(c2332c.m8553e())));
            AbstractC2341h abstractC2341hM8784W = this.f9463d;
            sq8.m48646e(abstractC2341hM8784W);
            for (AbstractC2341h abstractC2341h2 : listM32128P) {
                if (!sq8.m48644c(abstractC2341h2, this.f9463d) || !sq8.m48644c(abstractC2341hM8784W, c2342i)) {
                    if (abstractC2341hM8784W instanceof C2342i) {
                        abstractC2341hM8784W = ((C2342i) abstractC2341hM8784W).m8784W(abstractC2341h2.m8753A());
                        sq8.m48646e(abstractC2341hM8784W);
                    }
                }
            }
            c2332c.m8559k(abstractC2341hM8784W);
        }
    }
}
