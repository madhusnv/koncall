package z1;

import android.graphics.Matrix;
import android.os.Build;
import android.view.View;
import android.view.inputmethod.CursorAnchorInfo;
import android.view.inputmethod.InputMethodManager;
import c3.C0848c;
import c6.e0;
import com.skydoves.balloon.internals.DefinitionKt;
import d3.b0;
import d3.h0;
import d6.AbstractC1614d;
import g4.l0;
import g4.n0;
import kotlin.jvm.internal.AbstractC4154l;
import l4.C4381z;
import l4.InterfaceC4374s;
import og.yf;
import pg.k9;
import pg.w9;
import r4.EnumC6455j;
import t3.InterfaceC7033t;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: z1.k */
/* loaded from: classes.dex */
public final class C8851k {

    /* renamed from: a */
    public final C8842b f42589a;

    /* renamed from: b */
    public final C8849i f42590b;

    /* renamed from: d */
    public boolean f42592d;

    /* renamed from: e */
    public boolean f42593e;

    /* renamed from: f */
    public boolean f42594f;

    /* renamed from: g */
    public boolean f42595g;

    /* renamed from: h */
    public boolean f42596h;

    /* renamed from: i */
    public boolean f42597i;

    /* renamed from: j */
    public C4381z f42598j;

    /* renamed from: k */
    public l0 f42599k;

    /* renamed from: l */
    public InterfaceC4374s f42600l;

    /* renamed from: m */
    public C0848c f42601m;

    /* renamed from: n */
    public C0848c f42602n;

    /* renamed from: c */
    public final Object f42591c = new Object();

    /* renamed from: o */
    public final CursorAnchorInfo.Builder f42603o = new CursorAnchorInfo.Builder();

    /* renamed from: p */
    public final float[] f42604p = b0.m5094a();

    /* renamed from: q */
    public final Matrix f42605q = new Matrix();

    public C8851k(C8842b c8842b, C8849i c8849i) {
        this.f42589a = c8842b;
        this.f42590b = c8849i;
    }

    /* renamed from: a */
    public final void m16328a() {
        boolean z6;
        C8849i c8849i = this.f42590b;
        InputMethodManager inputMethodManagerM16322t = c8849i.m16322t();
        View view = (View) c8849i.f42583b;
        if (!inputMethodManagerM16322t.isActive(view) || this.f42598j == null || this.f42600l == null || this.f42599k == null || this.f42601m == null || this.f42602n == null) {
            return;
        }
        float[] fArr = this.f42604p;
        b0.m5097d(fArr);
        InterfaceC7033t interfaceC7033t = (InterfaceC7033t) this.f42589a.f42560a.f42588t.getValue();
        if (interfaceC7033t != null) {
            if (!interfaceC7033t.mo13305s()) {
                interfaceC7033t = null;
            }
            if (interfaceC7033t != null) {
                interfaceC7033t.mo13306t(fArr);
            }
        }
        C0848c c0848c = this.f42602n;
        AbstractC4154l.m8920c(c0848c);
        float f6 = -c0848c.f5354a;
        C0848c c0848c2 = this.f42602n;
        AbstractC4154l.m8920c(c0848c2);
        b0.m5099f(fArr, f6, -c0848c2.f5355b);
        Matrix matrix = this.f42605q;
        h0.m5144p(matrix, fArr);
        C4381z c4381z = this.f42598j;
        AbstractC4154l.m8920c(c4381z);
        long j6 = c4381z.f21946b;
        InterfaceC4374s interfaceC4374s = this.f42600l;
        AbstractC4154l.m8920c(interfaceC4374s);
        l0 l0Var = this.f42599k;
        AbstractC4154l.m8920c(l0Var);
        C0848c c0848c3 = this.f42601m;
        AbstractC4154l.m8920c(c0848c3);
        C0848c c0848c4 = this.f42602n;
        AbstractC4154l.m8920c(c0848c4);
        boolean z10 = this.f42594f;
        boolean z11 = this.f42595g;
        boolean z12 = this.f42596h;
        boolean z13 = this.f42597i;
        CursorAnchorInfo.Builder builder = this.f42603o;
        builder.reset();
        builder.setMatrix(matrix);
        n0 n0Var = c4381z.f21947c;
        int iM6458e = n0.m6458e(j6);
        builder.setSelectionRange(iM6458e, n0.m6457d(j6));
        if (!z10 || iM6458e < 0) {
            z6 = z11;
        } else {
            int iMo2733Y = interfaceC4374s.mo2733Y(iM6458e);
            C0848c c0848cM6445c = l0Var.m6445c(iMo2733Y);
            z6 = z11;
            float fM11911b = w9.m11911b(c0848cM6445c.f5354a, DefinitionKt.NO_Float_VALUE, (int) (l0Var.f13672c >> 32));
            boolean zM11734a = k9.m11734a(c0848c3, fM11911b, c0848cM6445c.f5355b);
            boolean zM11734a2 = k9.m11734a(c0848c3, fM11911b, c0848cM6445c.f5357d);
            boolean z14 = l0Var.m6443a(iMo2733Y) == EnumC6455j.Rtl;
            int i10 = (zM11734a || zM11734a2) ? 1 : 0;
            if (!zM11734a || !zM11734a2) {
                i10 |= 2;
            }
            if (z14) {
                i10 |= 4;
            }
            int i11 = i10;
            float f10 = c0848cM6445c.f5355b;
            float f11 = c0848cM6445c.f5357d;
            builder.setInsertionMarkerLocation(fM11911b, f10, f11, f11, i11);
        }
        if (z6) {
            int iM6458e2 = n0Var != null ? n0.m6458e(n0Var.f13686a) : -1;
            int iM6457d = n0Var != null ? n0.m6457d(n0Var.f13686a) : -1;
            if (iM6458e2 >= 0 && iM6458e2 < iM6457d) {
                builder.setComposingText(iM6458e2, c4381z.f21945a.f13620b.subSequence(iM6458e2, iM6457d));
                int iMo2733Y2 = interfaceC4374s.mo2733Y(iM6458e2);
                int iMo2733Y3 = interfaceC4374s.mo2733Y(iM6457d);
                float[] fArr2 = new float[(iMo2733Y3 - iMo2733Y2) * 4];
                l0Var.f13671b.m6468a(yf.m11072a(iMo2733Y2, iMo2733Y3), fArr2);
                int i12 = iM6458e2;
                while (i12 < iM6457d) {
                    int iMo2733Y4 = interfaceC4374s.mo2733Y(i12);
                    int i13 = (iMo2733Y4 - iMo2733Y2) * 4;
                    float f12 = fArr2[i13];
                    int i14 = iM6457d;
                    float f13 = fArr2[i13 + 1];
                    int i15 = iMo2733Y2;
                    float f14 = fArr2[i13 + 2];
                    float f15 = fArr2[i13 + 3];
                    int i16 = i12;
                    int i17 = (c0848c3.f5354a < f14 ? 1 : 0) & (f12 < c0848c3.f5356c ? 1 : 0) & (c0848c3.f5355b < f15 ? 1 : 0) & (f13 < c0848c3.f5357d ? 1 : 0);
                    if (!k9.m11734a(c0848c3, f12, f13) || !k9.m11734a(c0848c3, f14, f15)) {
                        i17 |= 2;
                    }
                    if (l0Var.m6443a(iMo2733Y4) == EnumC6455j.Rtl) {
                        i17 |= 4;
                    }
                    builder.addCharacterBounds(i16, f12, f13, f14, f15, i17);
                    i12 = i16 + 1;
                    iM6457d = i14;
                    iMo2733Y2 = i15;
                }
            }
        }
        int i18 = Build.VERSION.SDK_INT;
        if (i18 >= 33 && z12) {
            AbstractC1614d.m5276l(builder, c0848c4);
        }
        if (i18 >= 34 && z13) {
            e0.m2355b(builder, l0Var, c0848c3);
        }
        c8849i.m16322t().updateCursorAnchorInfo(view, builder.build());
        this.f42593e = false;
    }
}
