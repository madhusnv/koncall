package kr;

import ex.InterfaceC2139c;
import kotlin.jvm.internal.AbstractC4154l;
import or.C5454q;
import u2.C7320q;
import yr.C8767z;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: kr.w */
/* loaded from: classes3.dex */
public final class C4208w implements InterfaceC2139c {

    /* renamed from: a */
    public final /* synthetic */ int f21324a;

    /* renamed from: b */
    public final /* synthetic */ int f21325b;

    /* renamed from: c */
    public final /* synthetic */ Object f21326c;

    public /* synthetic */ C4208w(Object obj, int i10, int i11) {
        this.f21324a = i11;
        this.f21326c = obj;
        this.f21325b = i10;
    }

    @Override // ex.InterfaceC2139c
    public final Object invoke(Object obj) {
        switch (this.f21324a) {
            case 0:
                C5454q it = (C5454q) obj;
                AbstractC4154l.m8923f(it, "it");
                C7320q c7320q = (C7320q) this.f21326c;
                int i10 = this.f21325b;
                c7320q.set(i10, C5454q.m11181a((C5454q) c7320q.get(i10), !((C5454q) c7320q.get(i10)).f27493c));
                break;
            default:
                ((Boolean) obj).getClass();
                ((InterfaceC2139c) this.f21326c).invoke(new C8767z(this.f21325b));
                break;
        }
        return qw.a0.f30746a;
    }
}
