package mq;

import dr.C1772v;
import en.C2073f;
import uw.InterfaceC7559c;
import ww.AbstractC8193c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final class e0 extends AbstractC8193c {

    /* renamed from: a */
    public C2073f f24201a;

    /* renamed from: b */
    public /* synthetic */ Object f24202b;

    /* renamed from: c */
    public final /* synthetic */ C1772v f24203c;

    /* renamed from: d */
    public int f24204d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(C1772v c1772v, InterfaceC7559c interfaceC7559c) {
        super(interfaceC7559c);
        this.f24203c = c1772v;
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        this.f24202b = obj;
        this.f24204d |= Integer.MIN_VALUE;
        return this.f24203c.m5444c(null, this);
    }
}
