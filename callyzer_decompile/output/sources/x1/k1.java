package x1;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import g2.p2;
import k1.i2;
import m1.InterfaceC4630l;
import p3.InterfaceC5822t;
import tx.InterfaceC7266z;
import uw.InterfaceC7559c;
import vw.EnumC7794a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class k1 implements PointerInputEventHandler {

    /* renamed from: a */
    public final /* synthetic */ InterfaceC7266z f39570a;

    /* renamed from: b */
    public final /* synthetic */ k2.w0 f39571b;

    /* renamed from: c */
    public final /* synthetic */ InterfaceC4630l f39572c;

    /* renamed from: d */
    public final /* synthetic */ k2.w0 f39573d;

    public k1(InterfaceC7266z interfaceC7266z, k2.w0 w0Var, InterfaceC4630l interfaceC4630l, k2.w0 w0Var2) {
        this.f39570a = interfaceC7266z;
        this.f39571b = w0Var;
        this.f39572c = interfaceC4630l;
        this.f39573d = w0Var2;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(InterfaceC5822t interfaceC5822t, InterfaceC7559c interfaceC7559c) {
        j1 j1Var = new j1(this.f39570a, this.f39571b, this.f39572c, null);
        p2 p2Var = new p2(this.f39573d, 6);
        k1.g0 g0Var = i2.f20132a;
        Object objM13488k = tx.c0.m13488k(new aw.d0(interfaceC5822t, j1Var, p2Var, new k1.a1(interfaceC5822t), (InterfaceC7559c) null), interfaceC7559c);
        EnumC7794a enumC7794a = EnumC7794a.COROUTINE_SUSPENDED;
        qw.a0 a0Var = qw.a0.f30746a;
        if (objM13488k != enumC7794a) {
            objM13488k = a0Var;
        }
        return objM13488k == enumC7794a ? objM13488k : a0Var;
    }
}
