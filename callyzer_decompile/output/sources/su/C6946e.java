package su;

import dr.C1772v;
import uw.InterfaceC7559c;
import ww.AbstractC8193c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: su.e */
/* loaded from: classes3.dex */
public final class C6946e extends AbstractC8193c {

    /* renamed from: a */
    public /* synthetic */ Object f33582a;

    /* renamed from: b */
    public final /* synthetic */ C1772v f33583b;

    /* renamed from: c */
    public int f33584c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6946e(C1772v c1772v, InterfaceC7559c interfaceC7559c) {
        super(interfaceC7559c);
        this.f33583b = c1772v;
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        this.f33582a = obj;
        this.f33584c |= Integer.MIN_VALUE;
        return this.f33583b.m5447f(null, this);
    }
}
