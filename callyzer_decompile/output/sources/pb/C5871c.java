package pb;

import bd.C0645a;
import pc.C5884l;
import ww.AbstractC8193c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: pb.c */
/* loaded from: classes.dex */
public final class C5871c extends AbstractC8193c {

    /* renamed from: a */
    public C0645a f28648a;

    /* renamed from: b */
    public C5884l f28649b;

    /* renamed from: c */
    public /* synthetic */ Object f28650c;

    /* renamed from: d */
    public final /* synthetic */ C5872d f28651d;

    /* renamed from: e */
    public int f28652e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5871c(C5872d c5872d, AbstractC8193c abstractC8193c) {
        super(abstractC8193c);
        this.f28651d = c5872d;
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        this.f28650c = obj;
        this.f28652e |= Integer.MIN_VALUE;
        return this.f28651d.m11500b(null, null, this);
    }
}
