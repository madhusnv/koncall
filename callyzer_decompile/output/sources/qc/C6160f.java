package qc;

import ww.AbstractC8193c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: qc.f */
/* loaded from: classes.dex */
public final class C6160f extends AbstractC8193c {

    /* renamed from: a */
    public C6169o f30022a;

    /* renamed from: b */
    public /* synthetic */ Object f30023b;

    /* renamed from: c */
    public final /* synthetic */ C6161g f30024c;

    /* renamed from: d */
    public int f30025d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6160f(C6161g c6161g, AbstractC8193c abstractC8193c) {
        super(abstractC8193c);
        this.f30024c = c6161g;
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        this.f30023b = obj;
        this.f30025d |= Integer.MIN_VALUE;
        return this.f30024c.modifyBeforeSigning(null, this);
    }
}
