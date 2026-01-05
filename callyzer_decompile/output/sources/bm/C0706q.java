package bm;

import b3.InterfaceC0579k;
import ex.InterfaceC2139c;
import kotlin.jvm.internal.AbstractC4154l;
import qw.a0;
import x1.s0;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: bm.q */
/* loaded from: classes.dex */
public final /* synthetic */ class C0706q implements InterfaceC2139c {

    /* renamed from: a */
    public final /* synthetic */ int f4460a;

    /* renamed from: b */
    public final /* synthetic */ InterfaceC0579k f4461b;

    public /* synthetic */ C0706q(InterfaceC0579k interfaceC0579k, int i10) {
        this.f4460a = i10;
        this.f4461b = interfaceC0579k;
    }

    @Override // ex.InterfaceC2139c
    public final Object invoke(Object obj) {
        switch (this.f4460a) {
            case 0:
                s0 KeyboardActions = (s0) obj;
                AbstractC4154l.m8923f(KeyboardActions, "$this$KeyboardActions");
                InterfaceC0579k.m1742a(this.f4461b);
                break;
            case 1:
                InterfaceC0579k.m1742a(this.f4461b);
                break;
            case 2:
                s0 KeyboardActions2 = (s0) obj;
                AbstractC4154l.m8923f(KeyboardActions2, "$this$KeyboardActions");
                InterfaceC0579k.m1742a(this.f4461b);
                break;
            default:
                InterfaceC0579k.m1742a(this.f4461b);
                break;
        }
        return a0.f30746a;
    }
}
