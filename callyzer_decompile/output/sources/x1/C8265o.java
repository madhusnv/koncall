package x1;

import ex.InterfaceC2139c;
import ex.InterfaceC2141e;
import g4.C2492h;
import java.util.Map;
import k2.C3953b;
import k2.InterfaceC3962k;
import kotlin.jvm.internal.AbstractC4155m;
import w2.InterfaceC7879r;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: x1.o */
/* loaded from: classes.dex */
public final class C8265o extends AbstractC4155m implements InterfaceC2141e {

    /* renamed from: a */
    public final /* synthetic */ int f39617a = 0;

    /* renamed from: b */
    public final /* synthetic */ C2492h f39618b;

    /* renamed from: c */
    public final /* synthetic */ InterfaceC7879r f39619c;

    /* renamed from: d */
    public final /* synthetic */ g4.o0 f39620d;

    /* renamed from: e */
    public final /* synthetic */ boolean f39621e;

    /* renamed from: f */
    public final /* synthetic */ int f39622f;

    /* renamed from: g */
    public final /* synthetic */ int f39623g;

    /* renamed from: h */
    public final /* synthetic */ InterfaceC2139c f39624h;

    /* renamed from: j */
    public final /* synthetic */ int f39625j;

    /* renamed from: k */
    public final /* synthetic */ int f39626k;

    /* renamed from: l */
    public final /* synthetic */ Object f39627l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8265o(C2492h c2492h, InterfaceC7879r interfaceC7879r, g4.o0 o0Var, InterfaceC2139c interfaceC2139c, int i10, boolean z6, int i11, int i12, Map map, int i13) {
        super(2);
        this.f39618b = c2492h;
        this.f39619c = interfaceC7879r;
        this.f39620d = o0Var;
        this.f39624h = interfaceC2139c;
        this.f39622f = i10;
        this.f39621e = z6;
        this.f39623g = i11;
        this.f39625j = i12;
        this.f39627l = map;
        this.f39626k = i13;
    }

    @Override // ex.InterfaceC2141e
    public final Object invoke(Object obj, Object obj2) {
        int i10 = this.f39617a;
        InterfaceC3962k interfaceC3962k = (InterfaceC3962k) obj;
        ((Number) obj2).intValue();
        switch (i10) {
            case 0:
                r0.m15442b(this.f39618b, this.f39619c, this.f39620d, this.f39624h, this.f39622f, this.f39621e, this.f39623g, this.f39625j, (Map) this.f39627l, interfaceC3962k, C3953b.m8496A(this.f39626k | 1));
                break;
            default:
                r0.m15445e(this.f39618b, this.f39619c, this.f39620d, this.f39621e, this.f39622f, this.f39623g, this.f39624h, (InterfaceC2139c) this.f39627l, interfaceC3962k, C3953b.m8496A(this.f39625j | 1), this.f39626k);
                break;
        }
        return qw.a0.f30746a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8265o(C2492h c2492h, InterfaceC7879r interfaceC7879r, g4.o0 o0Var, boolean z6, int i10, int i11, InterfaceC2139c interfaceC2139c, InterfaceC2139c interfaceC2139c2, int i12, int i13) {
        super(2);
        this.f39618b = c2492h;
        this.f39619c = interfaceC7879r;
        this.f39620d = o0Var;
        this.f39621e = z6;
        this.f39622f = i10;
        this.f39623g = i11;
        this.f39624h = interfaceC2139c;
        this.f39627l = interfaceC2139c2;
        this.f39625j = i12;
        this.f39626k = i13;
    }
}
