package xm;

import uw.InterfaceC7559c;
import wj.C8090p;
import ww.AbstractC8193c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: xm.c */
/* loaded from: classes3.dex */
public final class C8395c extends AbstractC8193c {

    /* renamed from: a */
    public /* synthetic */ Object f40183a;

    /* renamed from: b */
    public final /* synthetic */ C8090p f40184b;

    /* renamed from: c */
    public int f40185c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8395c(C8090p c8090p, InterfaceC7559c interfaceC7559c) {
        super(interfaceC7559c);
        this.f40184b = c8090p;
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        this.f40183a = obj;
        this.f40185c |= Integer.MIN_VALUE;
        return this.f40184b.m15252f(this);
    }
}
