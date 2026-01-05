package ub;

import wc.C7985s;
import ww.AbstractC8193c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ub.c */
/* loaded from: classes.dex */
public final class C7387c extends AbstractC8193c {

    /* renamed from: a */
    public C7985s f35128a;

    /* renamed from: b */
    public C7392h f35129b;

    /* renamed from: c */
    public /* synthetic */ Object f35130c;

    /* renamed from: d */
    public final /* synthetic */ C7392h f35131d;

    /* renamed from: e */
    public int f35132e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7387c(C7392h c7392h, AbstractC8193c abstractC8193c) {
        super(abstractC8193c);
        this.f35131d = c7392h;
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        this.f35130c = obj;
        this.f35132e |= Integer.MIN_VALUE;
        return this.f35131d.m13798b(this);
    }
}
