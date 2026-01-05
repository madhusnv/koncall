package jo;

import cj.C0979e;
import rt.C6617a;
import ww.AbstractC8193c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: jo.j */
/* loaded from: classes3.dex */
public final class C3814j extends AbstractC8193c {

    /* renamed from: a */
    public C6617a f19734a;

    /* renamed from: b */
    public /* synthetic */ Object f19735b;

    /* renamed from: c */
    public final /* synthetic */ C0979e f19736c;

    /* renamed from: d */
    public int f19737d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3814j(C0979e c0979e, AbstractC8193c abstractC8193c) {
        super(abstractC8193c);
        this.f19736c = c0979e;
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        this.f19735b = obj;
        this.f19737d |= Integer.MIN_VALUE;
        return this.f19736c.m2778l(null, null, this);
    }
}
