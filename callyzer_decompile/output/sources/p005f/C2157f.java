package p005f;

import ex.InterfaceC2137a;
import ex.InterfaceC2141e;
import k2.C3953b;
import k2.InterfaceC3962k;
import kotlin.jvm.internal.AbstractC4155m;
import og.ke;
import qw.a0;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: f.f */
/* loaded from: classes.dex */
public final class C2157f extends AbstractC4155m implements InterfaceC2141e {

    /* renamed from: a */
    public final /* synthetic */ boolean f10011a;

    /* renamed from: b */
    public final /* synthetic */ InterfaceC2137a f10012b;

    /* renamed from: c */
    public final /* synthetic */ int f10013c;

    /* renamed from: d */
    public final /* synthetic */ int f10014d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2157f(boolean z6, InterfaceC2137a interfaceC2137a, int i10, int i11) {
        super(2);
        this.f10011a = z6;
        this.f10012b = interfaceC2137a;
        this.f10013c = i10;
        this.f10014d = i11;
    }

    @Override // ex.InterfaceC2141e
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int iM8496A = C3953b.m8496A(this.f10013c | 1);
        int i10 = this.f10014d;
        ke.m10735a(this.f10011a, this.f10012b, (InterfaceC3962k) obj, iM8496A, i10);
        return a0.f30746a;
    }
}
