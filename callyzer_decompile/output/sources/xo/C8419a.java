package xo;

import c9.C0908c;
import ww.AbstractC8193c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: xo.a */
/* loaded from: classes3.dex */
public final class C8419a extends AbstractC8193c {

    /* renamed from: a */
    public /* synthetic */ Object f41101a;

    /* renamed from: b */
    public final /* synthetic */ C0908c f41102b;

    /* renamed from: c */
    public int f41103c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8419a(C0908c c0908c, AbstractC8193c abstractC8193c) {
        super(abstractC8193c);
        this.f41102b = c0908c;
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        this.f41101a = obj;
        this.f41103c |= Integer.MIN_VALUE;
        return this.f41102b.m2574s(this);
    }
}
