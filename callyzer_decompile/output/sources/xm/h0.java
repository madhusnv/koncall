package xm;

import ug.C7439j;
import ww.AbstractC8193c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final class h0 extends AbstractC8193c {

    /* renamed from: a */
    public /* synthetic */ Object f40361a;

    /* renamed from: b */
    public final /* synthetic */ C7439j f40362b;

    /* renamed from: c */
    public int f40363c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(C7439j c7439j, AbstractC8193c abstractC8193c) {
        super(abstractC8193c);
        this.f40362b = c7439j;
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        this.f40361a = obj;
        this.f40363c |= Integer.MIN_VALUE;
        return this.f40362b.m14005p(null, this);
    }
}
