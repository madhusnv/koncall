package xm;

import dy.InterfaceC1853a;
import ww.AbstractC8193c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: xm.x */
/* loaded from: classes3.dex */
public final class C8416x extends AbstractC8193c {

    /* renamed from: a */
    public InterfaceC1853a f40977a;

    /* renamed from: b */
    public int f40978b;

    /* renamed from: c */
    public /* synthetic */ Object f40979c;

    /* renamed from: d */
    public final /* synthetic */ C8418z f40980d;

    /* renamed from: e */
    public int f40981e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8416x(C8418z c8418z, AbstractC8193c abstractC8193c) {
        super(abstractC8193c);
        this.f40980d = c8418z;
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        this.f40979c = obj;
        this.f40981e |= Integer.MIN_VALUE;
        return this.f40980d.m15719i(this);
    }
}
