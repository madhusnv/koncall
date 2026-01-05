package androidx.compose.foundation.selection;

import androidx.compose.foundation.AbstractC0240d;
import d4.C1580h;
import ex.InterfaceC2137a;
import ex.InterfaceC2142f;
import i0.m0;
import i1.p0;
import k2.C3961j;
import k2.C3966o;
import k2.InterfaceC3962k;
import kotlin.jvm.internal.AbstractC4155m;
import m1.InterfaceC4630l;
import w2.C7876o;
import w2.InterfaceC7879r;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: androidx.compose.foundation.selection.a */
/* loaded from: classes.dex */
public final class C0251a extends AbstractC4155m implements InterfaceC2142f {

    /* renamed from: a */
    public final /* synthetic */ p0 f2019a;

    /* renamed from: b */
    public final /* synthetic */ boolean f2020b;

    /* renamed from: c */
    public final /* synthetic */ boolean f2021c;

    /* renamed from: d */
    public final /* synthetic */ C1580h f2022d;

    /* renamed from: e */
    public final /* synthetic */ InterfaceC2137a f2023e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0251a(p0 p0Var, boolean z6, boolean z10, C1580h c1580h, InterfaceC2137a interfaceC2137a) {
        super(3);
        this.f2019a = p0Var;
        this.f2020b = z6;
        this.f2021c = z10;
        this.f2022d = c1580h;
        this.f2023e = interfaceC2137a;
    }

    @Override // ex.InterfaceC2142f
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        ((Number) obj3).intValue();
        C3966o c3966o = (C3966o) ((InterfaceC3962k) obj2);
        c3966o.m8607Y(-1525724089);
        Object objM8596M = c3966o.m8596M();
        if (objM8596M == C3961j.f20408a) {
            objM8596M = m0.m7389v(c3966o);
        }
        InterfaceC4630l interfaceC4630l = (InterfaceC4630l) objM8596M;
        InterfaceC7879r interfaceC7879rMo14852e = AbstractC0240d.m644a(C7876o.f37669a, interfaceC4630l, this.f2019a).mo14852e(new SelectableElement(this.f2020b, interfaceC4630l, null, this.f2021c, this.f2022d, this.f2023e));
        c3966o.m8623p(false);
        return interfaceC7879rMo14852e;
    }
}
