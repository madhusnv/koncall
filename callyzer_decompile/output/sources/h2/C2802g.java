package h2;

import c9.C0925t;
import ww.AbstractC8193c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: h2.g */
/* loaded from: classes.dex */
public final class C2802g extends AbstractC8193c {

    /* renamed from: a */
    public C0925t f15707a;

    /* renamed from: b */
    public /* synthetic */ Object f15708b;

    /* renamed from: c */
    public final /* synthetic */ C0925t f15709c;

    /* renamed from: d */
    public int f15710d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2802g(C0925t c0925t, AbstractC8193c abstractC8193c) {
        super(abstractC8193c);
        this.f15709c = c0925t;
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        this.f15708b = obj;
        this.f15710d |= Integer.MIN_VALUE;
        return this.f15709c.m2674c(null, null, this);
    }
}
