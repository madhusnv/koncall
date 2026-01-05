package h2;

import aw.C0462b;
import uw.InterfaceC7559c;
import ww.AbstractC8193c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class e0 extends AbstractC8193c {

    /* renamed from: a */
    public /* synthetic */ Object f15696a;

    /* renamed from: b */
    public int f15697b;

    /* renamed from: c */
    public final /* synthetic */ C0462b f15698c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(C0462b c0462b, InterfaceC7559c interfaceC7559c) {
        super(interfaceC7559c);
        this.f15698c = c0462b;
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        this.f15696a = obj;
        this.f15697b |= Integer.MIN_VALUE;
        return this.f15698c.emit(null, this);
    }
}
