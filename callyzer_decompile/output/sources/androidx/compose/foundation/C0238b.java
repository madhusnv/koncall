package androidx.compose.foundation;

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
/* renamed from: androidx.compose.foundation.b */
/* loaded from: classes.dex */
public final class C0238b extends AbstractC4155m implements InterfaceC2142f {

    /* renamed from: a */
    public final /* synthetic */ p0 f1917a;

    /* renamed from: b */
    public final /* synthetic */ boolean f1918b;

    /* renamed from: c */
    public final /* synthetic */ String f1919c;

    /* renamed from: d */
    public final /* synthetic */ C1580h f1920d;

    /* renamed from: e */
    public final /* synthetic */ InterfaceC2137a f1921e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0238b(p0 p0Var, boolean z6, String str, C1580h c1580h, InterfaceC2137a interfaceC2137a) {
        super(3);
        this.f1917a = p0Var;
        this.f1918b = z6;
        this.f1919c = str;
        this.f1920d = c1580h;
        this.f1921e = interfaceC2137a;
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
        InterfaceC7879r interfaceC7879rMo14852e = AbstractC0240d.m644a(C7876o.f37669a, interfaceC4630l, this.f1917a).mo14852e(new ClickableElement(interfaceC4630l, null, this.f1918b, this.f1919c, this.f1920d, this.f1921e));
        c3966o.m8623p(false);
        return interfaceC7879rMo14852e;
    }
}
