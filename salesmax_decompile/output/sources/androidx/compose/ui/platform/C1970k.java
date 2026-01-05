package androidx.compose.ui.platform;

import android.view.View;
import androidx.compose.ui.platform.AndroidComposeView;
import androidx.lifecycle.AbstractC2139h;
import androidx.lifecycle.InterfaceC2142k;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Set;
import p001o.ap3;
import p001o.azh;
import p001o.go3;
import p001o.h84;
import p001o.jgg;
import p001o.jp3;
import p001o.k2e;
import p001o.k46;
import p001o.kf9;
import p001o.n64;
import p001o.nl7;
import p001o.pn3;
import p001o.rn3;
import p001o.s8e;
import p001o.sq8;
import p001o.un3;
import p001o.uq8;
import p001o.vj8;
import p001o.wre;
import p001o.xca;
import p001o.xk7;
import p001o.y3i;

/* renamed from: androidx.compose.ui.platform.k */
/* loaded from: classes2.dex */
public final class C1970k implements ap3, InterfaceC2142k {

    /* renamed from: a */
    public final AndroidComposeView f6520a;

    /* renamed from: b */
    public final ap3 f6521b;

    /* renamed from: c */
    public boolean f6522c;

    /* renamed from: d */
    public AbstractC2139h f6523d;

    /* renamed from: e */
    public nl7 f6524e;

    /* renamed from: androidx.compose.ui.platform.k$a */
    public static final class a extends kf9 implements xk7 {

        /* renamed from: b */
        public final /* synthetic */ nl7 f6526b;

        /* renamed from: androidx.compose.ui.platform.k$a$a, reason: collision with other inner class name */
        public static final class C19555a extends kf9 implements nl7 {

            /* renamed from: a */
            public final /* synthetic */ C1970k f6527a;

            /* renamed from: b */
            public final /* synthetic */ nl7 f6528b;

            /* renamed from: androidx.compose.ui.platform.k$a$a$a, reason: collision with other inner class name */
            public static final class C19556a extends jgg implements nl7 {

                /* renamed from: a */
                public int f6529a;

                /* renamed from: b */
                public final /* synthetic */ C1970k f6530b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C19556a(C1970k c1970k, n64 n64Var) {
                    super(2, n64Var);
                    this.f6530b = c1970k;
                }

                @Override // p001o.vb1
                public final n64 create(Object obj, n64 n64Var) {
                    return new C19556a(this.f6530b, n64Var);
                }

                @Override // p001o.vb1
                public final Object invokeSuspend(Object obj) {
                    Object objM51918f = uq8.m51918f();
                    int i = this.f6529a;
                    if (i == 0) {
                        wre.m54934b(obj);
                        AndroidComposeView androidComposeViewM5277x = this.f6530b.m5277x();
                        this.f6529a = 1;
                        if (androidComposeViewM5277x.m5046J(this) == objM51918f) {
                            return objM51918f;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        wre.m54934b(obj);
                    }
                    return y3i.f54824a;
                }

                @Override // p001o.nl7
                public final Object invoke(h84 h84Var, n64 n64Var) {
                    return ((C19556a) create(h84Var, n64Var)).invokeSuspend(y3i.f54824a);
                }
            }

            /* renamed from: androidx.compose.ui.platform.k$a$a$b */
            public static final class b extends kf9 implements nl7 {

                /* renamed from: a */
                public final /* synthetic */ C1970k f6531a;

                /* renamed from: b */
                public final /* synthetic */ nl7 f6532b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public b(C1970k c1970k, nl7 nl7Var) {
                    super(2);
                    this.f6531a = c1970k;
                    this.f6532b = nl7Var;
                }

                /* renamed from: a */
                public final void m5280a(un3 un3Var, int i) {
                    if ((i & 11) == 2 && un3Var.mo27201c()) {
                        un3Var.mo27211m();
                        return;
                    }
                    if (go3.m29189I()) {
                        go3.m29200T(-1193460702, i, -1, "androidx.compose.ui.platform.WrappedComposition.setContent.<anonymous>.<anonymous>.<anonymous> (Wrapper.android.kt:156)");
                    }
                    AbstractC1967h.m5249a(this.f6531a.m5277x(), this.f6532b, un3Var, 8);
                    if (go3.m29189I()) {
                        go3.m29199S();
                    }
                }

                @Override // p001o.nl7
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    m5280a((un3) obj, ((Number) obj2).intValue());
                    return y3i.f54824a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C19555a(C1970k c1970k, nl7 nl7Var) {
                super(2);
                this.f6527a = c1970k;
                this.f6528b = nl7Var;
            }

            /* renamed from: a */
            public final void m5279a(un3 un3Var, int i) {
                if ((i & 11) == 2 && un3Var.mo27201c()) {
                    un3Var.mo27211m();
                    return;
                }
                if (go3.m29189I()) {
                    go3.m29200T(-2000640158, i, -1, "androidx.compose.ui.platform.WrappedComposition.setContent.<anonymous>.<anonymous> (Wrapper.android.kt:141)");
                }
                Object tag = this.f6527a.m5277x().getTag(s8e.inspection_slot_table_set);
                Set set = azh.m18061n(tag) ? (Set) tag : null;
                if (set == null) {
                    Object parent = this.f6527a.m5277x().getParent();
                    View view = parent instanceof View ? (View) parent : null;
                    Object tag2 = view != null ? view.getTag(s8e.inspection_slot_table_set) : null;
                    set = azh.m18061n(tag2) ? (Set) tag2 : null;
                }
                if (set != null) {
                    set.add(un3Var.mo27209k());
                    un3Var.mo27205g();
                }
                k46.m34965b(this.f6527a.m5277x(), new C19556a(this.f6527a, null), un3Var, 72);
                jp3.m34192a(new k2e[]{vj8.m52890a().m28000c(set)}, pn3.m43903b(un3Var, -1193460702, true, new b(this.f6527a, this.f6528b)), un3Var, 56);
                if (go3.m29189I()) {
                    go3.m29199S();
                }
            }

            @Override // p001o.nl7
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                m5279a((un3) obj, ((Number) obj2).intValue());
                return y3i.f54824a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(nl7 nl7Var) {
            super(1);
            this.f6526b = nl7Var;
        }

        /* renamed from: a */
        public final void m5278a(AndroidComposeView.C1943b c1943b) {
            sq8.m48649h(c1943b, "it");
            if (C1970k.this.f6522c) {
                return;
            }
            AbstractC2139h lifecycle = c1943b.m5078a().getLifecycle();
            C1970k.this.f6524e = this.f6526b;
            if (C1970k.this.f6523d == null) {
                C1970k.this.f6523d = lifecycle;
                lifecycle.mo6521a(C1970k.this);
            } else if (lifecycle.mo6522b().isAtLeast(AbstractC2139h.b.CREATED)) {
                C1970k.this.m5276w().mo5275l(pn3.m43904c(-2000640158, true, new C19555a(C1970k.this, this.f6526b)));
            }
        }

        @Override // p001o.xk7
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m5278a((AndroidComposeView.C1943b) obj);
            return y3i.f54824a;
        }
    }

    public C1970k(AndroidComposeView androidComposeView, ap3 ap3Var) {
        sq8.m48649h(androidComposeView, "owner");
        sq8.m48649h(ap3Var, "original");
        this.f6520a = androidComposeView;
        this.f6521b = ap3Var;
        this.f6524e = rn3.f43831a.m46986a();
    }

    @Override // p001o.ap3
    public void dispose() {
        if (!this.f6522c) {
            this.f6522c = true;
            this.f6520a.getView().setTag(s8e.wrapped_composition_tag, null);
            AbstractC2139h abstractC2139h = this.f6523d;
            if (abstractC2139h != null) {
                abstractC2139h.mo6524d(this);
            }
        }
        this.f6521b.dispose();
    }

    @Override // p001o.ap3
    /* renamed from: l */
    public void mo5275l(nl7 nl7Var) {
        sq8.m48649h(nl7Var, FirebaseAnalytics.Param.CONTENT);
        this.f6520a.setOnViewTreeOwnersAvailable(new a(nl7Var));
    }

    @Override // androidx.lifecycle.InterfaceC2142k
    /* renamed from: o */
    public void mo3717o(xca xcaVar, AbstractC2139h.a aVar) {
        sq8.m48649h(xcaVar, "source");
        sq8.m48649h(aVar, "event");
        if (aVar == AbstractC2139h.a.ON_DESTROY) {
            dispose();
        } else {
            if (aVar != AbstractC2139h.a.ON_CREATE || this.f6522c) {
                return;
            }
            mo5275l(this.f6524e);
        }
    }

    /* renamed from: w */
    public final ap3 m5276w() {
        return this.f6521b;
    }

    /* renamed from: x */
    public final AndroidComposeView m5277x() {
        return this.f6520a;
    }
}
