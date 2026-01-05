package i1;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import d4.AbstractC1594v;
import d4.C1579g;
import d4.InterfaceC1596x;
import ex.InterfaceC2139c;
import k2.C3953b;
import k2.i2;
import kotlin.jvm.internal.AbstractC4155m;
import s4.InterfaceC6747c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: i1.m */
/* loaded from: classes.dex */
public final class C3134m extends AbstractC4155m implements InterfaceC2139c {

    /* renamed from: b */
    public static final C3134m f16918b;

    /* renamed from: c */
    public static final C3134m f16919c;

    /* renamed from: d */
    public static final C3134m f16920d;

    /* renamed from: e */
    public static final C3134m f16921e;

    /* renamed from: f */
    public static final C3134m f16922f;

    /* renamed from: g */
    public static final C3134m f16923g;

    /* renamed from: a */
    public final /* synthetic */ int f16924a;

    static {
        int i10 = 1;
        f16918b = new C3134m(i10, 0);
        f16919c = new C3134m(i10, 1);
        f16920d = new C3134m(i10, 2);
        f16921e = new C3134m(i10, 3);
        f16922f = new C3134m(i10, 4);
        f16923g = new C3134m(i10, 5);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C3134m(int i10, int i11) {
        super(i10);
        this.f16924a = i11;
    }

    @Override // ex.InterfaceC2139c
    public final Object invoke(Object obj) {
        int i10 = this.f16924a;
        qw.a0 a0Var = qw.a0.f30746a;
        switch (i10) {
            case 0:
                ((v3.i0) obj).m14622b();
                return a0Var;
            case 1:
                return a0Var;
            case 2:
                ((Number) obj).longValue();
                return a0Var;
            case 3:
                k2.i1 i1Var = (k2.i1) obj;
                int i11 = AbstractC3130i.f16881a;
                i2 i2Var = AndroidCompositionLocals_androidKt.f2134b;
                i1Var.getClass();
                Context context = (Context) C3953b.m8518u(i1Var, i2Var);
                InterfaceC6747c interfaceC6747c = (InterfaceC6747c) C3953b.m8518u(i1Var, w3.k1.f37836h);
                c1 c1Var = (c1) C3953b.m8518u(i1Var, d1.f16830a);
                if (c1Var == null) {
                    return null;
                }
                return new C3129h(context, interfaceC6747c, c1Var.f16815a, c1Var.f16816b);
            case 4:
                AbstractC1594v.m5229g((InterfaceC1596x) obj, C1579g.f7834c);
                return a0Var;
            default:
                return new p1(((Number) obj).intValue());
        }
    }
}
