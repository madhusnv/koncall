package ht;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import p3.InterfaceC5822t;
import p3.h0;
import qw.a0;
import uw.InterfaceC7559c;
import vw.EnumC7794a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ht.i */
/* loaded from: classes3.dex */
public final class C3034i implements PointerInputEventHandler {

    /* renamed from: a */
    public static final C3034i f16360a = new C3034i();

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(InterfaceC5822t interfaceC5822t, InterfaceC7559c interfaceC7559c) {
        Object objL0 = ((h0) interfaceC5822t).L0(new C3033h(2, null), interfaceC7559c);
        return objL0 == EnumC7794a.COROUTINE_SUSPENDED ? objL0 : a0.f30746a;
    }
}
