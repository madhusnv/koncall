package vc;

import qd.C6185e;
import sb.C6780g;
import ww.AbstractC8193c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: vc.d */
/* loaded from: classes.dex */
public final class C7701d extends AbstractC8193c {

    /* renamed from: a */
    public C6185e f37206a;

    /* renamed from: b */
    public /* synthetic */ Object f37207b;

    /* renamed from: c */
    public final /* synthetic */ C6780g f37208c;

    /* renamed from: d */
    public int f37209d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7701d(C6780g c6780g, AbstractC8193c abstractC8193c) {
        super(abstractC8193c);
        this.f37208c = c6780g;
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        this.f37207b = obj;
        this.f37209d |= Integer.MIN_VALUE;
        return C6780g.m12973h(this.f37208c, null, this);
    }
}
