package g4;

import android.graphics.Canvas;
import android.text.TextUtils;
import com.skydoves.balloon.internals.DefinitionKt;
import d3.AbstractC1550d;
import d3.AbstractC1561o;
import d3.InterfaceC1563q;
import f3.AbstractC2199e;
import h4.AbstractC2842s;
import h4.C2835l;
import h4.C2840q;
import h4.C2841r;
import o4.AbstractC5286b;
import o4.C5285a;
import o4.C5288d;
import o4.C5289e;
import r4.C6457l;
import s4.C6745a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: g4.b */
/* loaded from: classes.dex */
public final class C2486b {

    /* renamed from: a */
    public final C5288d f13555a;

    /* renamed from: b */
    public final int f13556b;

    /* renamed from: c */
    public final long f13557c;

    /* renamed from: d */
    public final C2841r f13558d;

    /* renamed from: e */
    public final CharSequence f13559e;

    /* renamed from: f */
    public final Object f13560f;

    /* JADX WARN: Removed duplicated region for block: B:102:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0243  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x027a  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x027e  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0122  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C2486b(o4.C5288d r21, int r22, int r23, long r24) {
        /*
            Method dump skipped, instructions count: 845
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: g4.C2486b.<init>(o4.d, int, int, long):void");
    }

    /* renamed from: a */
    public final C2841r m6413a(int i10, int i11, TextUtils.TruncateAt truncateAt, int i12, int i13, int i14, int i15, int i16, CharSequence charSequence) {
        C2508x c2508x;
        float fM6416d = m6416d();
        C5288d c5288d = this.f13555a;
        C5289e c5289e = c5288d.f25963g;
        int i17 = c5288d.f25968m;
        C2835l c2835l = c5288d.f25965j;
        o0 o0Var = c5288d.f25958b;
        C5285a c5285a = AbstractC5286b.f25954a;
        C2510z c2510z = o0Var.f13690c;
        return new C2841r(charSequence, fM6416d, c5289e, i10, truncateAt, i17, (c2510z == null || (c2508x = c2510z.f13734b) == null) ? false : c2508x.f13731a, i12, i14, i15, i16, i13, i11, c2835l);
    }

    /* renamed from: b */
    public final float m6414b() {
        return this.f13558d.m6967a();
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00a8  */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long m6415c(c3.C0848c r12, int r13, d6.C1612b r14) {
        /*
            r11 = this;
            android.graphics.RectF r4 = d3.h0.m5148t(r12)
            r12 = 1
            r8 = 0
            if (r13 != 0) goto L9
            goto Ld
        L9:
            if (r13 != r12) goto Ld
            r13 = r12
            goto Le
        Ld:
            r13 = r8
        Le:
            cp.f r6 = new cp.f
            r0 = 7
            r6.<init>(r0, r14)
            h4.r r0 = r11.f13558d
            android.text.Layout r1 = r0.f15832f
            int r14 = android.os.Build.VERSION.SDK_INT
            r2 = 34
            if (r14 < r2) goto L24
            int[] r13 = h4.AbstractC2825b.m6928a(r0, r4, r13, r6)
            goto Lb8
        L24:
            a9.l r2 = r0.m6969c()
            if (r13 != r12) goto L3a
            c9.e r13 = new c9.e
            java.lang.CharSequence r14 = r1.getText()
            fm.a r3 = r0.m6976j()
            r5 = 7
            r13.<init>(r5, r14, r3)
        L38:
            r5 = r13
            goto L51
        L3a:
            java.lang.CharSequence r13 = r1.getText()
            android.text.TextPaint r3 = r0.f15827a
            r5 = 29
            if (r14 < r5) goto L4b
            i4.b r14 = new i4.b
            r14.<init>(r13, r3)
        L49:
            r13 = r14
            goto L38
        L4b:
            i4.c r14 = new i4.c
            r14.<init>(r13)
            goto L49
        L51:
            float r13 = r4.top
            int r13 = (int) r13
            int r13 = r1.getLineForVertical(r13)
            float r14 = r4.top
            float r3 = r0.m6971e(r13)
            int r14 = (r14 > r3 ? 1 : (r14 == r3 ? 0 : -1))
            if (r14 <= 0) goto L69
            int r13 = r13 + 1
            int r14 = r0.f15833g
            if (r13 < r14) goto L69
            goto La8
        L69:
            r3 = r13
            float r13 = r4.bottom
            int r13 = (int) r13
            int r13 = r1.getLineForVertical(r13)
            if (r13 != 0) goto L7e
            float r14 = r4.bottom
            float r7 = r0.m6973g(r8)
            int r14 = (r14 > r7 ? 1 : (r14 == r7 ? 0 : -1))
            if (r14 >= 0) goto L7e
            goto La8
        L7e:
            r7 = 1
            int r14 = h4.AbstractC2838o.m6965e(r0, r1, r2, r3, r4, r5, r6, r7)
        L83:
            r9 = r3
            r10 = -1
            if (r14 != r10) goto L91
            if (r9 >= r13) goto L91
            int r3 = r9 + 1
            r7 = 1
            int r14 = h4.AbstractC2838o.m6965e(r0, r1, r2, r3, r4, r5, r6, r7)
            goto L83
        L91:
            if (r14 != r10) goto L94
            goto La8
        L94:
            r7 = 0
            r3 = r13
            int r13 = h4.AbstractC2838o.m6965e(r0, r1, r2, r3, r4, r5, r6, r7)
        L9a:
            if (r13 != r10) goto La6
            if (r9 >= r3) goto La6
            int r3 = r3 + (-1)
            r7 = 0
            int r13 = h4.AbstractC2838o.m6965e(r0, r1, r2, r3, r4, r5, r6, r7)
            goto L9a
        La6:
            if (r13 != r10) goto Laa
        La8:
            r13 = 0
            goto Lb8
        Laa:
            int r14 = r14 + r12
            int r14 = r5.mo2602l(r14)
            int r13 = r13 - r12
            int r13 = r5.mo2603m(r13)
            int[] r13 = new int[]{r14, r13}
        Lb8:
            if (r13 != 0) goto Lbd
            long r12 = g4.n0.f13684b
            return r12
        Lbd:
            r14 = r13[r8]
            r12 = r13[r12]
            long r12 = og.yf.m11072a(r14, r12)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: g4.C2486b.m6415c(c3.c, int, d6.b):long");
    }

    /* renamed from: d */
    public final float m6416d() {
        return C6745a.m12918i(this.f13557c);
    }

    /* renamed from: e */
    public final void m6417e(InterfaceC1563q interfaceC1563q) {
        Canvas canvasM5119a = AbstractC1550d.m5119a(interfaceC1563q);
        C2841r c2841r = this.f13558d;
        if (c2841r.f15830d) {
            canvasM5119a.save();
            canvasM5119a.clipRect(DefinitionKt.NO_Float_VALUE, DefinitionKt.NO_Float_VALUE, m6416d(), m6414b());
        }
        int i10 = c2841r.f15834h;
        if (canvasM5119a.getClipBounds(c2841r.f15842p)) {
            if (i10 != 0) {
                canvasM5119a.translate(DefinitionKt.NO_Float_VALUE, i10);
            }
            C2840q c2840q = AbstractC2842s.f15844a;
            c2840q.f15826a = canvasM5119a;
            c2841r.f15832f.draw(c2840q);
            if (i10 != 0) {
                canvasM5119a.translate(DefinitionKt.NO_Float_VALUE, (-1) * i10);
            }
        }
        if (c2841r.f15830d) {
            canvasM5119a.restore();
        }
    }

    /* renamed from: f */
    public final void m6418f(InterfaceC1563q interfaceC1563q, long j6, d3.k0 k0Var, C6457l c6457l, AbstractC2199e abstractC2199e) {
        C5289e c5289e = this.f13555a.f25963g;
        int i10 = c5289e.f25971c;
        c5289e.m10434d(j6);
        c5289e.m10436f(k0Var);
        c5289e.m10437g(c6457l);
        c5289e.m10435e(abstractC2199e);
        c5289e.m10432b(3);
        m6417e(interfaceC1563q);
        c5289e.m10432b(i10);
    }

    /* renamed from: g */
    public final void m6419g(InterfaceC1563q interfaceC1563q, AbstractC1561o abstractC1561o, float f6, d3.k0 k0Var, C6457l c6457l, AbstractC2199e abstractC2199e) {
        C5289e c5289e = this.f13555a.f25963g;
        int i10 = c5289e.f25971c;
        float fM6416d = m6416d();
        float fM6414b = m6414b();
        c5289e.m10433c(abstractC1561o, (Float.floatToRawIntBits(fM6414b) & 4294967295L) | (Float.floatToRawIntBits(fM6416d) << 32), f6);
        c5289e.m10436f(k0Var);
        c5289e.m10437g(c6457l);
        c5289e.m10435e(abstractC2199e);
        c5289e.m10432b(3);
        m6417e(interfaceC1563q);
        c5289e.m10432b(i10);
    }
}
