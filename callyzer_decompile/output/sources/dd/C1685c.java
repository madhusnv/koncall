package dd;

import dy.InterfaceC1853a;
import ww.AbstractC8193c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: dd.c */
/* loaded from: classes.dex */
public final class C1685c extends AbstractC8193c {

    /* renamed from: a */
    public int f8239a;

    /* renamed from: b */
    public int f8240b;

    /* renamed from: c */
    public InterfaceC1853a f8241c;

    /* renamed from: d */
    public /* synthetic */ Object f8242d;

    /* renamed from: e */
    public final /* synthetic */ C1687e f8243e;

    /* renamed from: f */
    public int f8244f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1685c(C1687e c1687e, AbstractC8193c abstractC8193c) {
        super(abstractC8193c);
        this.f8243e = c1687e;
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        this.f8242d = obj;
        this.f8244f |= Integer.MIN_VALUE;
        return this.f8243e.m5384a(0, this);
    }
}
