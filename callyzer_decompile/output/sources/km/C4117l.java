package km;

import s6.C6765d;
import uw.InterfaceC7559c;
import ww.AbstractC8193c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: km.l */
/* loaded from: classes3.dex */
public final class C4117l extends AbstractC8193c {

    /* renamed from: a */
    public C6765d f21040a;

    /* renamed from: b */
    public /* synthetic */ Object f21041b;

    /* renamed from: c */
    public final /* synthetic */ C4120o f21042c;

    /* renamed from: d */
    public int f21043d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4117l(C4120o c4120o, InterfaceC7559c interfaceC7559c) {
        super(interfaceC7559c);
        this.f21042c = c4120o;
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        this.f21041b = obj;
        this.f21043d |= Integer.MIN_VALUE;
        return this.f21042c.m8886h(null, this);
    }
}
