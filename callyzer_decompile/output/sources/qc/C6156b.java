package qc;

import c9.C0908c;
import ww.AbstractC8193c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: qc.b */
/* loaded from: classes.dex */
public final class C6156b extends AbstractC8193c {

    /* renamed from: a */
    public /* synthetic */ Object f30011a;

    /* renamed from: b */
    public final /* synthetic */ C0908c f30012b;

    /* renamed from: c */
    public int f30013c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6156b(C0908c c0908c, AbstractC8193c abstractC8193c) {
        super(abstractC8193c);
        this.f30012b = c0908c;
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        this.f30011a = obj;
        this.f30013c |= Integer.MIN_VALUE;
        return this.f30012b.read(null, 0L, this);
    }
}
