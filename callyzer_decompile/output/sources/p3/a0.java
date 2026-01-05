package p3;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import ex.InterfaceC2141e;
import kotlin.jvm.internal.AbstractC4154l;
import kotlin.jvm.internal.InterfaceC4149g;
import qw.InterfaceC6355e;
import uw.InterfaceC7559c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final /* synthetic */ class a0 implements PointerInputEventHandler, InterfaceC4149g {

    /* renamed from: a */
    public final /* synthetic */ InterfaceC2141e f28409a;

    public a0(InterfaceC2141e interfaceC2141e) {
        this.f28409a = interfaceC2141e;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof PointerInputEventHandler) || !(obj instanceof InterfaceC4149g)) {
            return false;
        }
        return AbstractC4154l.m8918a(this.f28409a, ((InterfaceC4149g) obj).getFunctionDelegate());
    }

    @Override // kotlin.jvm.internal.InterfaceC4149g
    public final InterfaceC6355e getFunctionDelegate() {
        return this.f28409a;
    }

    public final int hashCode() {
        return this.f28409a.hashCode();
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final /* synthetic */ Object invoke(InterfaceC5822t interfaceC5822t, InterfaceC7559c interfaceC7559c) {
        return this.f28409a.invoke(interfaceC5822t, interfaceC7559c);
    }
}
