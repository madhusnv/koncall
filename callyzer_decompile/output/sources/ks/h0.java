package ks;

import java.util.ArrayList;
import wj.C8090p;
import ww.AbstractC8193c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final class h0 extends AbstractC8193c {

    /* renamed from: a */
    public C8090p f21415a;

    /* renamed from: b */
    public ArrayList f21416b;

    /* renamed from: c */
    public /* synthetic */ Object f21417c;

    /* renamed from: d */
    public final /* synthetic */ q0 f21418d;

    /* renamed from: e */
    public int f21419e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(q0 q0Var, AbstractC8193c abstractC8193c) {
        super(abstractC8193c);
        this.f21418d = q0Var;
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        this.f21417c = obj;
        this.f21419e |= Integer.MIN_VALUE;
        return q0.m8965h(this.f21418d, this);
    }
}
