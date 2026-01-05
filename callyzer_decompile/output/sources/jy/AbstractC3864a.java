package jy;

import fy.InterfaceC2401a;
import iy.InterfaceC3364a;
import iy.InterfaceC3366c;
import java.util.Iterator;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: jy.a */
/* loaded from: classes3.dex */
public abstract class AbstractC3864a implements InterfaceC2401a {
    /* renamed from: a */
    public abstract Object mo8406a();

    /* renamed from: b */
    public abstract int mo8407b(Object obj);

    /* renamed from: c */
    public abstract Iterator mo8408c(Object obj);

    /* renamed from: d */
    public abstract int mo8409d(Object obj);

    @Override // fy.InterfaceC2401a
    public Object deserialize(InterfaceC3366c interfaceC3366c) {
        return m8410e(interfaceC3366c);
    }

    /* renamed from: e */
    public final Object m8410e(InterfaceC3366c interfaceC3366c) {
        Object objMo8406a = mo8406a();
        int iMo8407b = mo8407b(objMo8406a);
        InterfaceC3364a interfaceC3364aMo7699c = interfaceC3366c.mo7699c(getDescriptor());
        while (true) {
            int iMo7685o = interfaceC3364aMo7699c.mo7685o(getDescriptor());
            if (iMo7685o == -1) {
                interfaceC3364aMo7699c.mo7680b(getDescriptor());
                return mo8413h(objMo8406a);
            }
            mo8411f(interfaceC3364aMo7699c, iMo7685o + iMo8407b, objMo8406a);
        }
    }

    /* renamed from: f */
    public abstract void mo8411f(InterfaceC3364a interfaceC3364a, int i10, Object obj);

    /* renamed from: g */
    public abstract Object mo8412g(Object obj);

    /* renamed from: h */
    public abstract Object mo8413h(Object obj);
}
