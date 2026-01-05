package cd;

import ed.AbstractC2029e;
import ww.AbstractC8193c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: cd.c */
/* loaded from: classes.dex */
public final class C0948c extends AbstractC8193c {

    /* renamed from: a */
    public int f5714a;

    /* renamed from: b */
    public AbstractC2029e f5715b;

    /* renamed from: c */
    public /* synthetic */ Object f5716c;

    /* renamed from: d */
    public final /* synthetic */ C0951f f5717d;

    /* renamed from: e */
    public int f5718e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0948c(C0951f c0951f, AbstractC8193c abstractC8193c) {
        super(abstractC8193c);
        this.f5717d = c0951f;
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        this.f5716c = obj;
        this.f5718e |= Integer.MIN_VALUE;
        return this.f5717d.mo2715a(0, null, this);
    }
}
