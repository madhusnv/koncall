package xc;

import ww.AbstractC8193c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: xc.b */
/* loaded from: classes.dex */
public final class C8321b extends AbstractC8193c {

    /* renamed from: a */
    public int f39884a;

    /* renamed from: b */
    public /* synthetic */ Object f39885b;

    /* renamed from: c */
    public final /* synthetic */ C8322c f39886c;

    /* renamed from: d */
    public int f39887d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8321b(C8322c c8322c, AbstractC8193c abstractC8193c) {
        super(abstractC8193c);
        this.f39886c = c8322c;
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        this.f39885b = obj;
        this.f39887d |= Integer.MIN_VALUE;
        return this.f39886c.m15518c(null, this);
    }
}
