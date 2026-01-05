package qc;

import ww.AbstractC8193c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: qc.x */
/* loaded from: classes.dex */
public final class C6178x extends AbstractC8193c {

    /* renamed from: a */
    public /* synthetic */ Object f30132a;

    /* renamed from: b */
    public final /* synthetic */ C6179y f30133b;

    /* renamed from: c */
    public int f30134c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6178x(C6179y c6179y, AbstractC8193c abstractC8193c) {
        super(abstractC8193c);
        this.f30133b = c6179y;
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        this.f30132a = obj;
        this.f30134c |= Integer.MIN_VALUE;
        return this.f30133b.read(null, 0L, this);
    }
}
