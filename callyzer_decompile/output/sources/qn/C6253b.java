package qn;

import ww.AbstractC8193c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: qn.b */
/* loaded from: classes3.dex */
public final class C6253b extends AbstractC8193c {

    /* renamed from: a */
    public int f30301a;

    /* renamed from: b */
    public boolean f30302b;

    /* renamed from: c */
    public /* synthetic */ Object f30303c;

    /* renamed from: d */
    public final /* synthetic */ C6263l f30304d;

    /* renamed from: e */
    public int f30305e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6253b(C6263l c6263l, AbstractC8193c abstractC8193c) {
        super(abstractC8193c);
        this.f30304d = c6263l;
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        this.f30303c = obj;
        this.f30305e |= Integer.MIN_VALUE;
        return this.f30304d.m12258d(0, this);
    }
}
