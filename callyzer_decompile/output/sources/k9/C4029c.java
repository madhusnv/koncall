package k9;

import l4.C4367l;
import ww.AbstractC8193c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: k9.c */
/* loaded from: classes.dex */
public final class C4029c extends AbstractC8193c {

    /* renamed from: a */
    public C4028b f20811a;

    /* renamed from: b */
    public C4367l f20812b;

    /* renamed from: c */
    public C4031e f20813c;

    /* renamed from: d */
    public /* synthetic */ Object f20814d;

    /* renamed from: e */
    public final /* synthetic */ C4030d f20815e;

    /* renamed from: f */
    public int f20816f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4029c(C4030d c4030d, AbstractC8193c abstractC8193c) {
        super(abstractC8193c);
        this.f20815e = c4030d;
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        this.f20814d = obj;
        this.f20816f |= Integer.MIN_VALUE;
        return this.f20815e.m8830h(null, null, this);
    }
}
