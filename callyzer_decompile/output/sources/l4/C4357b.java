package l4;

import c9.C0917l;
import ex.InterfaceC2139c;
import g4.C2492h;
import g4.n0;
import java.util.List;
import kotlin.jvm.internal.AbstractC4154l;
import kotlin.jvm.internal.AbstractC4155m;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: l4.b */
/* loaded from: classes.dex */
public final class C4357b extends AbstractC4155m implements InterfaceC2139c {

    /* renamed from: b */
    public static final C4357b f21853b;

    /* renamed from: c */
    public static final C4357b f21854c;

    /* renamed from: d */
    public static final C4357b f21855d;

    /* renamed from: e */
    public static final C4357b f21856e;

    /* renamed from: f */
    public static final C4357b f21857f;

    /* renamed from: g */
    public static final C4357b f21858g;

    /* renamed from: h */
    public static final C4357b f21859h;

    /* renamed from: a */
    public final /* synthetic */ int f21860a;

    static {
        int i10 = 1;
        f21853b = new C4357b(i10, 0);
        f21854c = new C4357b(i10, 1);
        f21855d = new C4357b(i10, 2);
        f21856e = new C4357b(i10, 3);
        f21857f = new C4357b(i10, 4);
        f21858g = new C4357b(i10, 5);
        f21859h = new C4357b(i10, 6);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C4357b(int i10, int i11) {
        super(i10);
        this.f21860a = i11;
    }

    @Override // ex.InterfaceC2139c
    public final Object invoke(Object obj) {
        int i10 = this.f21860a;
        qw.a0 a0Var = qw.a0.f30746a;
        switch (i10) {
            case 0:
                float[] fArr = ((d3.b0) obj).f7732a;
                break;
            case 1:
                float[] fArr2 = ((d3.b0) obj).f7732a;
                break;
            case 2:
                AbstractC4154l.m8921d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                List list = (List) obj;
                Object obj2 = list.get(0);
                C0917l c0917l = g4.e0.f13572a;
                Boolean bool = Boolean.FALSE;
                C2492h c2492h = (AbstractC4154l.m8918a(obj2, bool) || obj2 == null) ? null : (C2492h) ((InterfaceC2139c) c0917l.f5595c).invoke(obj2);
                AbstractC4154l.m8920c(c2492h);
                Object obj3 = list.get(1);
                int i11 = n0.f13685c;
                n0 n0Var = (AbstractC4154l.m8918a(obj3, bool) || obj3 == null) ? null : (n0) ((InterfaceC2139c) g4.e0.f13587p.f5595c).invoke(obj3);
                AbstractC4154l.m8920c(n0Var);
                break;
            case 3:
                break;
            case 4:
                int i12 = ((C4365j) obj).f21911a;
                break;
            case 5:
                break;
            default:
                int i13 = ((C4365j) obj).f21911a;
                break;
        }
        return a0Var;
    }
}
