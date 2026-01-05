package xx;

import uw.InterfaceC7559c;
import ww.AbstractC8193c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: xx.m */
/* loaded from: classes3.dex */
public final class C8507m extends AbstractC8193c {

    /* renamed from: a */
    public /* synthetic */ Object f41425a;

    /* renamed from: b */
    public final /* synthetic */ C8508n f41426b;

    /* renamed from: c */
    public int f41427c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8507m(C8508n c8508n, InterfaceC7559c interfaceC7559c) {
        super(interfaceC7559c);
        this.f41426b = c8508n;
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        this.f41425a = obj;
        this.f41427c |= Integer.MIN_VALUE;
        return this.f41426b.emit(null, this);
    }
}
