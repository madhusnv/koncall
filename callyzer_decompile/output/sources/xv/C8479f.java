package xv;

import dr.C1772v;
import im.EnumC3308j;
import uw.InterfaceC7559c;
import ww.AbstractC8193c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: xv.f */
/* loaded from: classes3.dex */
public final class C8479f extends AbstractC8193c {

    /* renamed from: a */
    public EnumC3308j f41304a;

    /* renamed from: b */
    public /* synthetic */ Object f41305b;

    /* renamed from: c */
    public final /* synthetic */ C1772v f41306c;

    /* renamed from: d */
    public int f41307d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8479f(C1772v c1772v, InterfaceC7559c interfaceC7559c) {
        super(interfaceC7559c);
        this.f41306c = c1772v;
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        this.f41305b = obj;
        this.f41307d |= Integer.MIN_VALUE;
        return this.f41306c.m5445d(null, this);
    }
}
