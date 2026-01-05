package qn;

import java.util.Iterator;
import mm.C4802m;
import ww.AbstractC8193c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: qn.j */
/* loaded from: classes3.dex */
public final class C6261j extends AbstractC8193c {

    /* renamed from: a */
    public Iterator f30343a;

    /* renamed from: b */
    public C4802m f30344b;

    /* renamed from: c */
    public /* synthetic */ Object f30345c;

    /* renamed from: d */
    public final /* synthetic */ C6263l f30346d;

    /* renamed from: e */
    public int f30347e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6261j(C6263l c6263l, AbstractC8193c abstractC8193c) {
        super(abstractC8193c);
        this.f30346d = c6263l;
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        this.f30345c = obj;
        this.f30347e |= Integer.MIN_VALUE;
        return this.f30346d.m12267m(this);
    }
}
