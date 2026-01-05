package ub;

import jc.InterfaceC3738n;
import ww.AbstractC8193c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ub.e */
/* loaded from: classes.dex */
public final class C7389e extends AbstractC8193c {

    /* renamed from: a */
    public InterfaceC3738n f35137a;

    /* renamed from: b */
    public /* synthetic */ Object f35138b;

    /* renamed from: c */
    public final /* synthetic */ C7392h f35139c;

    /* renamed from: d */
    public int f35140d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7389e(C7392h c7392h, AbstractC8193c abstractC8193c) {
        super(abstractC8193c);
        this.f35139c = c7392h;
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        this.f35138b = obj;
        this.f35140d |= Integer.MIN_VALUE;
        return this.f35139c.m13800d(null, this);
    }
}
