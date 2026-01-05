package wx;

import b8.C0614i;
import uw.InterfaceC7559c;
import ww.AbstractC8193c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final class c0 extends AbstractC8193c {

    /* renamed from: a */
    public /* synthetic */ Object f39194a;

    /* renamed from: b */
    public final /* synthetic */ C0614i f39195b;

    /* renamed from: c */
    public int f39196c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(C0614i c0614i, InterfaceC7559c interfaceC7559c) {
        super(interfaceC7559c);
        this.f39195b = c0614i;
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        this.f39194a = obj;
        this.f39196c |= Integer.MIN_VALUE;
        return this.f39195b.emit(null, this);
    }
}
