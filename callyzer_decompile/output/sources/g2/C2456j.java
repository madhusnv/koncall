package g2;

import ex.InterfaceC2137a;
import ex.InterfaceC2141e;
import k2.C3953b;
import k2.InterfaceC3962k;
import kotlin.jvm.internal.AbstractC4155m;
import s2.C6734c;
import w2.InterfaceC7879r;
import w4.AbstractC7917i;
import w4.C7922n;
import w4.C7931w;
import w4.InterfaceC7930v;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: g2.j */
/* loaded from: classes.dex */
public final class C2456j extends AbstractC4155m implements InterfaceC2141e {

    /* renamed from: a */
    public final /* synthetic */ int f11826a = 0;

    /* renamed from: b */
    public final /* synthetic */ InterfaceC2137a f11827b;

    /* renamed from: c */
    public final /* synthetic */ C6734c f11828c;

    /* renamed from: d */
    public final /* synthetic */ int f11829d;

    /* renamed from: e */
    public final /* synthetic */ int f11830e;

    /* renamed from: f */
    public final /* synthetic */ Object f11831f;

    /* renamed from: g */
    public final /* synthetic */ Object f11832g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2456j(InterfaceC2137a interfaceC2137a, InterfaceC7879r interfaceC7879r, C7922n c7922n, C6734c c6734c, int i10, int i11) {
        super(2);
        this.f11827b = interfaceC2137a;
        this.f11831f = interfaceC7879r;
        this.f11832g = c7922n;
        this.f11828c = c6734c;
        this.f11829d = i10;
        this.f11830e = i11;
    }

    @Override // ex.InterfaceC2141e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f11826a) {
            case 0:
                ((Number) obj2).intValue();
                InterfaceC7879r interfaceC7879r = (InterfaceC7879r) this.f11831f;
                C7922n c7922n = (C7922n) this.f11832g;
                AbstractC2457k.m6189d(this.f11827b, interfaceC7879r, c7922n, this.f11828c, (InterfaceC3962k) obj, C3953b.m8496A(this.f11829d | 1), this.f11830e);
                break;
            default:
                ((Number) obj2).intValue();
                InterfaceC7930v interfaceC7930v = (InterfaceC7930v) this.f11831f;
                C7931w c7931w = (C7931w) this.f11832g;
                AbstractC7917i.m15047a(interfaceC7930v, this.f11827b, c7931w, this.f11828c, (InterfaceC3962k) obj, C3953b.m8496A(this.f11829d | 1), this.f11830e);
                break;
        }
        return qw.a0.f30746a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2456j(InterfaceC7930v interfaceC7930v, InterfaceC2137a interfaceC2137a, C7931w c7931w, C6734c c6734c, int i10, int i11) {
        super(2);
        this.f11831f = interfaceC7930v;
        this.f11827b = interfaceC2137a;
        this.f11832g = c7931w;
        this.f11828c = c6734c;
        this.f11829d = i10;
        this.f11830e = i11;
    }
}
