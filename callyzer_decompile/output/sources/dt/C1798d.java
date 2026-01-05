package dt;

import dr.C1772v;
import uw.InterfaceC7559c;
import ww.AbstractC8193c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: dt.d */
/* loaded from: classes3.dex */
public final class C1798d extends AbstractC8193c {

    /* renamed from: a */
    public /* synthetic */ Object f8701a;

    /* renamed from: b */
    public final /* synthetic */ C1772v f8702b;

    /* renamed from: c */
    public int f8703c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1798d(C1772v c1772v, InterfaceC7559c interfaceC7559c) {
        super(interfaceC7559c);
        this.f8702b = c1772v;
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        this.f8701a = obj;
        this.f8703c |= Integer.MIN_VALUE;
        return this.f8702b.m5446e(null, this);
    }
}
