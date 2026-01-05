package x1;

import ex.InterfaceC2141e;
import k2.C3953b;
import k2.InterfaceC3962k;
import kotlin.jvm.internal.AbstractC4155m;
import w2.InterfaceC7879r;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: x1.a */
/* loaded from: classes.dex */
public final class C8251a extends AbstractC4155m implements InterfaceC2141e {

    /* renamed from: a */
    public final /* synthetic */ InterfaceC7879r f39404a;

    /* renamed from: b */
    public final /* synthetic */ int f39405b;

    /* renamed from: c */
    public final /* synthetic */ int f39406c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8251a(int i10, int i11, InterfaceC7879r interfaceC7879r) {
        super(2);
        this.f39404a = interfaceC7879r;
        this.f39405b = i10;
        this.f39406c = i11;
    }

    @Override // ex.InterfaceC2141e
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        AbstractC8254d.m15432b(C3953b.m8496A(this.f39405b | 1), this.f39406c, (InterfaceC3962k) obj, this.f39404a);
        return qw.a0.f30746a;
    }
}
