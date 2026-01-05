package wx;

import aw.C0462b;
import uw.InterfaceC7559c;
import ww.AbstractC8193c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final class i1 extends AbstractC8193c {

    /* renamed from: a */
    public /* synthetic */ Object f39239a;

    /* renamed from: b */
    public final /* synthetic */ C0462b f39240b;

    /* renamed from: c */
    public int f39241c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i1(C0462b c0462b, InterfaceC7559c interfaceC7559c) {
        super(interfaceC7559c);
        this.f39240b = c0462b;
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        this.f39239a = obj;
        this.f39241c |= Integer.MIN_VALUE;
        return this.f39240b.m1464c(0, this);
    }
}
