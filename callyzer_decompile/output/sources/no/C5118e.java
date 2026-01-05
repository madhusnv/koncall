package no;

import uw.InterfaceC7559c;
import ww.AbstractC8193c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: no.e */
/* loaded from: classes3.dex */
public final class C5118e extends AbstractC8193c {

    /* renamed from: a */
    public /* synthetic */ Object f25058a;

    /* renamed from: b */
    public final /* synthetic */ C5122i f25059b;

    /* renamed from: c */
    public int f25060c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5118e(C5122i c5122i, InterfaceC7559c interfaceC7559c) {
        super(interfaceC7559c);
        this.f25059b = c5122i;
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        this.f25058a = obj;
        this.f25060c |= Integer.MIN_VALUE;
        return this.f25059b.m10050f(null, this);
    }
}
