package fv;

import om.C5414p;
import ww.AbstractC8193c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: fv.j */
/* loaded from: classes3.dex */
public final class C2385j extends AbstractC8193c {

    /* renamed from: a */
    public C5414p f10847a;

    /* renamed from: b */
    public /* synthetic */ Object f10848b;

    /* renamed from: c */
    public final /* synthetic */ C2386k f10849c;

    /* renamed from: d */
    public int f10850d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2385j(C2386k c2386k, AbstractC8193c abstractC8193c) {
        super(abstractC8193c);
        this.f10849c = c2386k;
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        this.f10848b = obj;
        this.f10850d |= Integer.MIN_VALUE;
        return C2386k.m6068m(this.f10849c, null, this);
    }
}
