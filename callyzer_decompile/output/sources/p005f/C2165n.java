package p005f;

import b2.y0;
import ex.InterfaceC2141e;
import k2.C3953b;
import k2.InterfaceC3962k;
import kotlin.jvm.internal.AbstractC4155m;
import og.le;
import qw.a0;
import x1.r0;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: f.n */
/* loaded from: classes.dex */
public final class C2165n extends AbstractC4155m implements InterfaceC2141e {

    /* renamed from: a */
    public final /* synthetic */ int f10025a = 1;

    /* renamed from: b */
    public final /* synthetic */ boolean f10026b;

    /* renamed from: c */
    public final /* synthetic */ int f10027c;

    /* renamed from: d */
    public final /* synthetic */ Object f10028d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2165n(y0 y0Var, boolean z6, int i10) {
        super(2);
        this.f10028d = y0Var;
        this.f10026b = z6;
        this.f10027c = i10;
    }

    @Override // ex.InterfaceC2141e
    public final Object invoke(Object obj, Object obj2) {
        int i10 = this.f10025a;
        InterfaceC3962k interfaceC3962k = (InterfaceC3962k) obj;
        ((Number) obj2).intValue();
        switch (i10) {
            case 0:
                le.m10750a(this.f10026b, (InterfaceC2141e) this.f10028d, interfaceC3962k, C3953b.m8496A(this.f10027c | 1));
                break;
            default:
                r0.m15451k((y0) this.f10028d, this.f10026b, interfaceC3962k, C3953b.m8496A(this.f10027c | 1));
                break;
        }
        return a0.f30746a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2165n(boolean z6, InterfaceC2141e interfaceC2141e, int i10) {
        super(2);
        this.f10026b = z6;
        this.f10028d = interfaceC2141e;
        this.f10027c = i10;
    }
}
