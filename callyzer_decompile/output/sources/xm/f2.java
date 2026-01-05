package xm;

import java.util.Iterator;
import mm.C4802m;
import tm.C7173a;
import ww.AbstractC8193c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final class f2 extends AbstractC8193c {

    /* renamed from: a */
    public C4802m f40284a;

    /* renamed from: b */
    public C7173a f40285b;

    /* renamed from: c */
    public Iterator f40286c;

    /* renamed from: d */
    public int f40287d;

    /* renamed from: e */
    public /* synthetic */ Object f40288e;

    /* renamed from: f */
    public final /* synthetic */ l2 f40289f;

    /* renamed from: g */
    public int f40290g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f2(l2 l2Var, AbstractC8193c abstractC8193c) {
        super(abstractC8193c);
        this.f40289f = l2Var;
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        this.f40288e = obj;
        this.f40290g |= Integer.MIN_VALUE;
        return this.f40289f.m15592h(null, this);
    }
}
