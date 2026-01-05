package wx;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import tx.InterfaceC7266z;
import uw.C7565i;
import uw.InterfaceC7559c;
import uw.InterfaceC7564h;
import vw.EnumC7794a;
import vx.EnumC7799a;
import vx.InterfaceC7819u;
import vx.InterfaceC7821w;
import xx.AbstractC8499e;
import xx.C8516v;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: wx.d */
/* loaded from: classes3.dex */
public final class C8203d extends AbstractC8499e {

    /* renamed from: f */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f39200f = AtomicIntegerFieldUpdater.newUpdater(C8203d.class, "consumed$volatile");
    private volatile /* synthetic */ int consumed$volatile;

    /* renamed from: d */
    public final InterfaceC7821w f39201d;

    /* renamed from: e */
    public final boolean f39202e;

    public /* synthetic */ C8203d(InterfaceC7821w interfaceC7821w, boolean z6) {
        this(interfaceC7821w, z6, C7565i.f36440a, -3, EnumC7799a.SUSPEND);
    }

    @Override // xx.AbstractC8499e, wx.InterfaceC8209j
    public final Object collect(InterfaceC8210k interfaceC8210k, InterfaceC7559c interfaceC7559c) throws Throwable {
        if (this.f41404b == -3) {
            boolean z6 = this.f39202e;
            if (z6 && f39200f.getAndSet(this, 1) == 1) {
                throw new IllegalStateException("ReceiveChannel.consumeAsFlow can be collected just once");
            }
            Object objM15383n = c1.m15383n(interfaceC8210k, this.f39201d, z6, interfaceC7559c);
            if (objM15383n == EnumC7794a.COROUTINE_SUSPENDED) {
                return objM15383n;
            }
        } else {
            Object objCollect = super.collect(interfaceC8210k, interfaceC7559c);
            if (objCollect == EnumC7794a.COROUTINE_SUSPENDED) {
                return objCollect;
            }
        }
        return qw.a0.f30746a;
    }

    @Override // xx.AbstractC8499e
    /* renamed from: d */
    public final String mo15391d() {
        return "channel=" + this.f39201d;
    }

    @Override // xx.AbstractC8499e
    /* renamed from: e */
    public final Object mo15368e(InterfaceC7819u interfaceC7819u, InterfaceC7559c interfaceC7559c) throws Throwable {
        Object objM15383n = c1.m15383n(new C8516v(interfaceC7819u), this.f39201d, this.f39202e, interfaceC7559c);
        return objM15383n == EnumC7794a.COROUTINE_SUSPENDED ? objM15383n : qw.a0.f30746a;
    }

    @Override // xx.AbstractC8499e
    /* renamed from: f */
    public final AbstractC8499e mo15369f(InterfaceC7564h interfaceC7564h, int i10, EnumC7799a enumC7799a) {
        return new C8203d(this.f39201d, this.f39202e, interfaceC7564h, i10, enumC7799a);
    }

    @Override // xx.AbstractC8499e
    /* renamed from: g */
    public final InterfaceC8209j mo15392g() {
        return new C8203d(this.f39201d, this.f39202e);
    }

    @Override // xx.AbstractC8499e
    /* renamed from: h */
    public final InterfaceC7821w mo15393h(InterfaceC7266z interfaceC7266z) {
        if (this.f39202e && f39200f.getAndSet(this, 1) == 1) {
            throw new IllegalStateException("ReceiveChannel.consumeAsFlow can be collected just once");
        }
        return this.f41404b == -3 ? this.f39201d : super.mo15393h(interfaceC7266z);
    }

    public C8203d(InterfaceC7821w interfaceC7821w, boolean z6, InterfaceC7564h interfaceC7564h, int i10, EnumC7799a enumC7799a) {
        super(interfaceC7564h, i10, enumC7799a);
        this.f39201d = interfaceC7821w;
        this.f39202e = z6;
    }
}
