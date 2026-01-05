package jy;

import fy.InterfaceC2401a;
import hy.InterfaceC3055f;
import iy.InterfaceC3364a;
import iy.InterfaceC3365b;
import iy.InterfaceC3367d;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC4154l;
import ly.C4597u;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: jy.n */
/* loaded from: classes3.dex */
public abstract class AbstractC3877n extends AbstractC3864a {

    /* renamed from: a */
    public final InterfaceC2401a f19929a;

    public AbstractC3877n(InterfaceC2401a interfaceC2401a) {
        this.f19929a = interfaceC2401a;
    }

    @Override // jy.AbstractC3864a
    /* renamed from: f */
    public void mo8411f(InterfaceC3364a interfaceC3364a, int i10, Object obj) {
        mo8417i(i10, obj, interfaceC3364a.mo7689u(getDescriptor(), i10, this.f19929a, null));
    }

    /* renamed from: i */
    public abstract void mo8417i(int i10, Object obj, Object obj2);

    @Override // fy.InterfaceC2401a
    public void serialize(InterfaceC3367d interfaceC3367d, Object obj) {
        int iMo8409d = mo8409d(obj);
        InterfaceC3055f descriptor = getDescriptor();
        AbstractC4154l.m8923f(descriptor, "descriptor");
        InterfaceC3365b interfaceC3365bMo7711c = ((C4597u) interfaceC3367d).mo7711c(descriptor);
        Iterator itMo8408c = mo8408c(obj);
        for (int i10 = 0; i10 < iMo8409d; i10++) {
            ((C4597u) interfaceC3365bMo7711c).m9443v(getDescriptor(), i10, this.f19929a, itMo8408c.next());
        }
        interfaceC3365bMo7711c.mo7693b(descriptor);
    }
}
