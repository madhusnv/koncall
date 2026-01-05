package mw;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import aw.d0;
import ex.InterfaceC2141e;
import k2.w0;
import p3.InterfaceC5822t;
import qw.a0;
import tx.c0;
import uw.InterfaceC7559c;
import vw.EnumC7794a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: mw.j */
/* loaded from: classes3.dex */
public final class C4902j implements PointerInputEventHandler {

    /* renamed from: a */
    public final /* synthetic */ C4903k f24436a;

    /* renamed from: b */
    public final /* synthetic */ InterfaceC2141e f24437b;

    /* renamed from: c */
    public final /* synthetic */ w0 f24438c;

    public C4902j(C4903k c4903k, InterfaceC2141e interfaceC2141e, w0 w0Var) {
        this.f24436a = c4903k;
        this.f24437b = interfaceC2141e;
        this.f24438c = w0Var;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(InterfaceC5822t interfaceC5822t, InterfaceC7559c interfaceC7559c) {
        Object objM13488k = c0.m13488k(new d0(interfaceC5822t, this.f24436a, this.f24437b, this.f24438c, null, 11), interfaceC7559c);
        return objM13488k == EnumC7794a.COROUTINE_SUSPENDED ? objM13488k : a0.f30746a;
    }
}
