package l4;

import android.graphics.Matrix;
import android.os.Build;
import android.view.View;
import android.view.inputmethod.CursorAnchorInfo;
import android.view.inputmethod.InputMethodManager;
import c3.C0848c;
import com.skydoves.balloon.internals.DefinitionKt;
import d6.AbstractC1614d;
import g4.l0;
import g4.n0;
import kotlin.jvm.internal.AbstractC4154l;
import kotlin.jvm.internal.AbstractC4155m;
import og.yf;
import pg.w9;
import r4.EnumC6455j;
import th.AbstractC7152b;
import w3.C7904v;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: l4.c */
/* loaded from: classes.dex */
public final class C4358c {

    /* renamed from: a */
    public final C7904v f21861a;

    /* renamed from: b */
    public final C4367l f21862b;

    /* renamed from: d */
    public boolean f21864d;

    /* renamed from: e */
    public boolean f21865e;

    /* renamed from: f */
    public boolean f21866f;

    /* renamed from: g */
    public boolean f21867g;

    /* renamed from: h */
    public boolean f21868h;

    /* renamed from: i */
    public boolean f21869i;

    /* renamed from: j */
    public C4381z f21870j;

    /* renamed from: k */
    public l0 f21871k;

    /* renamed from: l */
    public InterfaceC4374s f21872l;

    /* renamed from: n */
    public C0848c f21874n;

    /* renamed from: o */
    public C0848c f21875o;

    /* renamed from: c */
    public final Object f21863c = new Object();

    /* renamed from: m */
    public AbstractC4155m f21873m = C4357b.f21854c;

    /* renamed from: p */
    public final CursorAnchorInfo.Builder f21876p = new CursorAnchorInfo.Builder();

    /* renamed from: q */
    public final float[] f21877q = d3.b0.m5094a();

    /* renamed from: r */
    public final Matrix f21878r = new Matrix();

    public C4358c(C7904v c7904v, C4367l c4367l) {
        this.f21861a = c7904v;
        this.f21862b = c4367l;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, qw.g] */
    /* JADX WARN: Type inference failed for: r3v3, types: [ex.c, kotlin.jvm.internal.m] */
    /* renamed from: a */
    public final void m9069a() {
        boolean z6;
        C4367l c4367l = this.f21862b;
        ?? r22 = c4367l.f21922c;
        InputMethodManager inputMethodManager = (InputMethodManager) r22.getValue();
        View view = (View) c4367l.f21921b;
        if (inputMethodManager.isActive(view)) {
            ?? r32 = this.f21873m;
            float[] fArr = this.f21877q;
            r32.invoke(new d3.b0(fArr));
            this.f21861a.m15036r(fArr);
            Matrix matrix = this.f21878r;
            d3.h0.m5144p(matrix, fArr);
            C4381z c4381z = this.f21870j;
            AbstractC4154l.m8920c(c4381z);
            long j6 = c4381z.f21946b;
            InterfaceC4374s interfaceC4374s = this.f21872l;
            AbstractC4154l.m8920c(interfaceC4374s);
            l0 l0Var = this.f21871k;
            AbstractC4154l.m8920c(l0Var);
            C0848c c0848c = this.f21874n;
            AbstractC4154l.m8920c(c0848c);
            C0848c c0848c2 = this.f21875o;
            AbstractC4154l.m8920c(c0848c2);
            boolean z10 = this.f21866f;
            boolean z11 = this.f21867g;
            boolean z12 = this.f21868h;
            boolean z13 = this.f21869i;
            CursorAnchorInfo.Builder builder = this.f21876p;
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
                boolean zM13415a = AbstractC7152b.m13415a(c0848c, fM11911b, c0848cM6445c.f5355b);
                boolean zM13415a2 = AbstractC7152b.m13415a(c0848c, fM11911b, c0848cM6445c.f5357d);
                boolean z14 = l0Var.m6443a(iMo2733Y) == EnumC6455j.Rtl;
                int i10 = (zM13415a || zM13415a2) ? 1 : 0;
                if (!zM13415a || !zM13415a2) {
                    i10 |= 2;
                }
                if (z14) {
                    i10 |= 4;
                }
                int i11 = i10;
                float f6 = c0848cM6445c.f5355b;
                float f10 = c0848cM6445c.f5357d;
                builder.setInsertionMarkerLocation(fM11911b, f6, f10, f10, i11);
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
                        float f11 = fArr2[i13];
                        int i14 = iM6457d;
                        float f12 = fArr2[i13 + 1];
                        int i15 = iMo2733Y2;
                        float f13 = fArr2[i13 + 2];
                        float f14 = fArr2[i13 + 3];
                        int i16 = i12;
                        int i17 = (c0848c.f5354a < f13 ? 1 : 0) & (f11 < c0848c.f5356c ? 1 : 0) & (c0848c.f5355b < f14 ? 1 : 0) & (f12 < c0848c.f5357d ? 1 : 0);
                        if (!AbstractC7152b.m13415a(c0848c, f11, f12) || !AbstractC7152b.m13415a(c0848c, f13, f14)) {
                            i17 |= 2;
                        }
                        if (l0Var.m6443a(iMo2733Y4) == EnumC6455j.Rtl) {
                            i17 |= 4;
                        }
                        builder.addCharacterBounds(i16, f11, f12, f13, f14, i17);
                        i12 = i16 + 1;
                        iM6457d = i14;
                        iMo2733Y2 = i15;
                    }
                }
            }
            int i18 = Build.VERSION.SDK_INT;
            if (i18 >= 33 && z12) {
                AbstractC1614d.m5275k(builder, c0848c2);
            }
            if (i18 >= 34 && z13) {
                c6.e0.m2354a(builder, l0Var, c0848c);
            }
            ((InputMethodManager) r22.getValue()).updateCursorAnchorInfo(view, builder.build());
            this.f21865e = false;
        }
    }
}
