package vn;

import a9.C0073l;
import mm.C4802m;
import ww.AbstractC8193c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: vn.b */
/* loaded from: classes3.dex */
public final class C7727b extends AbstractC8193c {

    /* renamed from: a */
    public C4802m f37274a;

    /* renamed from: b */
    public /* synthetic */ Object f37275b;

    /* renamed from: c */
    public final /* synthetic */ C0073l f37276c;

    /* renamed from: d */
    public int f37277d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7727b(C0073l c0073l, AbstractC8193c abstractC8193c) {
        super(abstractC8193c);
        this.f37276c = c0073l;
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        this.f37275b = obj;
        this.f37277d |= Integer.MIN_VALUE;
        return this.f37276c.m208R(null, this);
    }
}
