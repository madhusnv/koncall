package k1;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import c3.C0847b;
import ex.InterfaceC2139c;
import k2.C3953b;
import kotlin.jvm.internal.AbstractC4155m;
import p3.C5819q;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: k1.d */
/* loaded from: classes.dex */
public final class C3929d extends AbstractC4155m implements InterfaceC2139c {

    /* renamed from: b */
    public static final C3929d f20046b;

    /* renamed from: c */
    public static final C3929d f20047c;

    /* renamed from: d */
    public static final C3929d f20048d;

    /* renamed from: e */
    public static final C3929d f20049e;

    /* renamed from: f */
    public static final C3929d f20050f;

    /* renamed from: g */
    public static final C3929d f20051g;

    /* renamed from: a */
    public final /* synthetic */ int f20052a;

    static {
        int i10 = 1;
        f20046b = new C3929d(i10, 0);
        f20047c = new C3929d(i10, 1);
        f20048d = new C3929d(i10, 2);
        f20049e = new C3929d(i10, 3);
        f20050f = new C3929d(i10, 4);
        f20051g = new C3929d(i10, 5);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C3929d(int i10, int i11) {
        super(i10);
        this.f20052a = i11;
    }

    @Override // ex.InterfaceC2139c
    public final Object invoke(Object obj) {
        switch (this.f20052a) {
            case 0:
                k2.i1 i1Var = (k2.i1) obj;
                k2.i2 i2Var = AndroidCompositionLocals_androidKt.f2134b;
                i1Var.getClass();
                if (((Context) C3953b.m8518u(i1Var, i2Var)).getPackageManager().hasSystemFeature("android.software.leanback")) {
                    return AbstractC3931f.f20080b;
                }
                InterfaceC3928c.f20031a.getClass();
                return C3927b.f20021c;
            case 1:
                long j6 = ((C0847b) obj).f5352a;
                return qw.a0.f30746a;
            case 2:
                return Boolean.TRUE;
            case 3:
                ((Number) obj).longValue();
                return qw.a0.f30746a;
            case 4:
                return Boolean.valueOf(!(((C5819q) obj).f28484i == 2));
            default:
                ((Number) obj).floatValue();
                return qw.a0.f30746a;
        }
    }
}
