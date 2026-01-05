package wx;

import kotlin.jvm.internal.C4168z;
import uw.InterfaceC7559c;
import vw.EnumC7794a;
import xx.AbstractC8496b;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: wx.h */
/* loaded from: classes3.dex */
public final class C8207h implements InterfaceC8209j {

    /* renamed from: a */
    public final InterfaceC8209j f39231a;

    public C8207h(InterfaceC8209j interfaceC8209j) {
        this.f39231a = interfaceC8209j;
    }

    @Override // wx.InterfaceC8209j
    public final Object collect(InterfaceC8210k interfaceC8210k, InterfaceC7559c interfaceC7559c) {
        C4168z c4168z = new C4168z();
        c4168z.f21164a = AbstractC8496b.f41395b;
        Object objCollect = this.f39231a.collect(new C8206g(this, c4168z, interfaceC8210k), interfaceC7559c);
        return objCollect == EnumC7794a.COROUTINE_SUSPENDED ? objCollect : qw.a0.f30746a;
    }
}
