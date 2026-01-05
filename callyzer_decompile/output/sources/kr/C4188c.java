package kr;

import ex.InterfaceC2139c;
import kotlin.jvm.internal.AbstractC4154l;
import or.C5454q;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: kr.c */
/* loaded from: classes3.dex */
public final /* synthetic */ class C4188c implements InterfaceC2139c {

    /* renamed from: a */
    public final /* synthetic */ int f21234a;

    /* renamed from: b */
    public final /* synthetic */ InterfaceC2139c f21235b;

    /* renamed from: c */
    public final /* synthetic */ C5454q f21236c;

    public /* synthetic */ C4188c(InterfaceC2139c interfaceC2139c, C5454q c5454q, int i10) {
        this.f21234a = i10;
        this.f21235b = interfaceC2139c;
        this.f21236c = c5454q;
    }

    @Override // ex.InterfaceC2139c
    public final Object invoke(Object obj) {
        switch (this.f21234a) {
            case 0:
                ((Boolean) obj).booleanValue();
                this.f21235b.invoke(this.f21236c);
                break;
            case 1:
                String it = (String) obj;
                AbstractC4154l.m8923f(it, "it");
                this.f21235b.invoke(this.f21236c);
                break;
            default:
                String it2 = (String) obj;
                AbstractC4154l.m8923f(it2, "it");
                this.f21235b.invoke(this.f21236c);
                break;
        }
        return qw.a0.f30746a;
    }
}
