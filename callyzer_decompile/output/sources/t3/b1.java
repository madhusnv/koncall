package t3;

import ex.InterfaceC2141e;
import k2.C3953b;
import k2.InterfaceC3962k;
import kotlin.jvm.internal.AbstractC4155m;
import w2.InterfaceC7879r;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class b1 extends AbstractC4155m implements InterfaceC2141e {

    /* renamed from: a */
    public final /* synthetic */ InterfaceC7879r f33962a;

    /* renamed from: b */
    public final /* synthetic */ InterfaceC2141e f33963b;

    /* renamed from: c */
    public final /* synthetic */ int f33964c;

    /* renamed from: d */
    public final /* synthetic */ int f33965d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b1(InterfaceC7879r interfaceC7879r, InterfaceC2141e interfaceC2141e, int i10, int i11) {
        super(2);
        this.f33962a = interfaceC7879r;
        this.f33963b = interfaceC2141e;
        this.f33964c = i10;
        this.f33965d = i11;
    }

    @Override // ex.InterfaceC2141e
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int iM8496A = C3953b.m8496A(this.f33964c | 1);
        int i10 = this.f33965d;
        c1.m13274c(this.f33962a, this.f33963b, (InterfaceC3962k) obj, iM8496A, i10);
        return qw.a0.f30746a;
    }
}
