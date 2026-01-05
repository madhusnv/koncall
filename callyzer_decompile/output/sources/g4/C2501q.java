package g4;

import a9.C0073l;
import android.graphics.Matrix;
import android.graphics.Shader;
import android.text.Layout;
import android.text.TextUtils;
import c3.C0848c;
import com.skydoves.balloon.internals.DefinitionKt;
import com.sun.mail.util.AbstractC1452a;
import d3.AbstractC1561o;
import d3.C1562p;
import d3.InterfaceC1563q;
import d6.C1612b;
import f3.AbstractC2199e;
import h4.AbstractC2842s;
import h4.C2840q;
import h4.C2841r;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C4165w;
import kotlin.jvm.internal.C4166x;
import m4.AbstractC4646a;
import o4.C5288d;
import og.ka;
import og.pe;
import og.uf;
import og.yf;
import r4.C6457l;
import rw.AbstractC6663m;
import s4.AbstractC6746b;
import s4.C6745a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: g4.q */
/* loaded from: classes.dex */
public final class C2501q {

    /* renamed from: a */
    public final C0073l f13697a;

    /* renamed from: b */
    public final int f13698b;

    /* renamed from: c */
    public final boolean f13699c;

    /* renamed from: d */
    public final float f13700d;

    /* renamed from: e */
    public final float f13701e;

    /* renamed from: f */
    public final int f13702f;

    /* renamed from: g */
    public final ArrayList f13703g;

    /* renamed from: h */
    public final ArrayList f13704h;

    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Object, java.util.Collection, java.util.List] */
    public C2501q(C0073l c0073l, long j6, int i10, int i11) {
        boolean z6;
        int i12;
        int iM12917h;
        int i13;
        this.f13697a = c0073l;
        this.f13698b = i10;
        if (C6745a.m12920k(j6) != 0 || C6745a.m12919j(j6) != 0) {
            AbstractC4646a.m9525a("Setting Constraints.minWidth and Constraints.minHeight is not supported, these should be the default zero values instead.");
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = (ArrayList) c0073l.f268e;
        int size = arrayList2.size();
        float f6 = 0.0f;
        int i14 = 0;
        int i15 = 0;
        while (i14 < size) {
            C2504t c2504t = (C2504t) arrayList2.get(i14);
            C5288d c5288d = c2504t.f13716a;
            int iM12918i = C6745a.m12918i(j6);
            if (C6745a.m12913d(j6)) {
                i12 = i14;
                iM12917h = C6745a.m12917h(j6) - ((int) Math.ceil(f6));
                if (iM12917h < 0) {
                    iM12917h = 0;
                }
            } else {
                i12 = i14;
                iM12917h = C6745a.m12917h(j6);
            }
            C2486b c2486b = new C2486b(c5288d, this.f13698b - i15, i11, AbstractC6746b.m12924b(iM12918i, iM12917h, 5));
            float fM6414b = c2486b.m6414b() + f6;
            C2841r c2841r = c2486b.f13558d;
            int i16 = i15 + c2841r.f15833g;
            arrayList.add(new C2503s(c2486b, c2504t.f13717b, c2504t.f13718c, i15, i16, f6, fM6414b));
            if (!c2841r.f15830d) {
                if (i16 == this.f13698b) {
                    i13 = i12;
                    if (i13 != pe.m10832g((ArrayList) this.f13697a.f268e)) {
                    }
                } else {
                    i13 = i12;
                }
                i14 = i13 + 1;
                i15 = i16;
                f6 = fM6414b;
            }
            z6 = true;
            i15 = i16;
            f6 = fM6414b;
            break;
        }
        z6 = false;
        this.f13701e = f6;
        this.f13702f = i15;
        this.f13699c = z6;
        this.f13704h = arrayList;
        this.f13700d = C6745a.m12918i(j6);
        ArrayList arrayList3 = new ArrayList(arrayList.size());
        int size2 = arrayList.size();
        for (int i17 = 0; i17 < size2; i17++) {
            C2503s c2503s = (C2503s) arrayList.get(i17);
            ?? r72 = c2503s.f13709a.f13560f;
            ArrayList arrayList4 = new ArrayList(r72.size());
            int size3 = r72.size();
            for (int i18 = 0; i18 < size3; i18++) {
                C0848c c0848c = (C0848c) r72.get(i18);
                arrayList4.add(c0848c != null ? c2503s.m6479a(c0848c) : null);
            }
            AbstractC6663m.m12765x(arrayList3, arrayList4);
        }
        if (arrayList3.size() < ((List) this.f13697a.f265b).size()) {
            int size4 = ((List) this.f13697a.f265b).size() - arrayList3.size();
            ArrayList arrayList5 = new ArrayList(size4);
            for (int i19 = 0; i19 < size4; i19++) {
                arrayList5.add(null);
            }
            arrayList3 = AbstractC6663m.m12754R(arrayList3, arrayList5);
        }
        this.f13703g = arrayList3;
    }

    /* renamed from: i */
    public static void m6466i(C2501q c2501q, InterfaceC1563q interfaceC1563q, long j6, d3.k0 k0Var, C6457l c6457l, AbstractC2199e abstractC2199e) {
        interfaceC1563q.mo5107i();
        ArrayList arrayList = c2501q.f13704h;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            C2503s c2503s = (C2503s) arrayList.get(i10);
            c2503s.f13709a.m6418f(interfaceC1563q, j6, k0Var, c6457l, abstractC2199e);
            interfaceC1563q.mo5112n(DefinitionKt.NO_Float_VALUE, c2503s.f13709a.m6414b());
        }
        interfaceC1563q.mo5113o();
    }

    /* renamed from: j */
    public static void m6467j(C2501q c2501q, InterfaceC1563q interfaceC1563q, AbstractC1561o abstractC1561o, float f6, d3.k0 k0Var, C6457l c6457l, AbstractC2199e abstractC2199e) {
        interfaceC1563q.mo5107i();
        ArrayList arrayList = c2501q.f13704h;
        if (arrayList.size() <= 1 || (abstractC1561o instanceof d3.n0)) {
            ka.m10728b(c2501q, interfaceC1563q, abstractC1561o, f6, k0Var, c6457l, abstractC2199e);
        } else if (abstractC1561o instanceof d3.j0) {
            int size = arrayList.size();
            float fMax = 0.0f;
            float fM6414b = 0.0f;
            for (int i10 = 0; i10 < size; i10++) {
                C2503s c2503s = (C2503s) arrayList.get(i10);
                fM6414b += c2503s.f13709a.m6414b();
                fMax = Math.max(fMax, c2503s.f13709a.m6416d());
            }
            Shader shaderMo5177b = ((d3.j0) abstractC1561o).mo5177b((Float.floatToRawIntBits(fMax) << 32) | (Float.floatToRawIntBits(fM6414b) & 4294967295L));
            Matrix matrix = new Matrix();
            shaderMo5177b.getLocalMatrix(matrix);
            int size2 = arrayList.size();
            for (int i11 = 0; i11 < size2; i11++) {
                C2486b c2486b = ((C2503s) arrayList.get(i11)).f13709a;
                c2486b.m6419g(interfaceC1563q, new C1562p(shaderMo5177b), f6, k0Var, c6457l, abstractC2199e);
                interfaceC1563q.mo5112n(DefinitionKt.NO_Float_VALUE, c2486b.m6414b());
                matrix.setTranslate(DefinitionKt.NO_Float_VALUE, -c2486b.m6414b());
                shaderMo5177b.setLocalMatrix(matrix);
            }
        }
        interfaceC1563q.mo5113o();
    }

    /* renamed from: a */
    public final void m6468a(long j6, float[] fArr) {
        m6476k(n0.m6458e(j6));
        m6477l(n0.m6457d(j6));
        C4166x c4166x = new C4166x();
        c4166x.f21162a = 0;
        uf.m10997k(this.f13704h, j6, new C2500p(j6, fArr, c4166x, new C4165w()));
    }

    /* renamed from: b */
    public final float m6469b(int i10) {
        m6478m(i10);
        ArrayList arrayList = this.f13704h;
        C2503s c2503s = (C2503s) arrayList.get(uf.m10995i(arrayList, i10));
        C2486b c2486b = c2503s.f13709a;
        return c2486b.f13558d.m6971e(i10 - c2503s.f13712d) + c2503s.f13714f;
    }

    /* renamed from: c */
    public final int m6470c(int i10, boolean z6) {
        int iM6972f;
        m6478m(i10);
        ArrayList arrayList = this.f13704h;
        C2503s c2503s = (C2503s) arrayList.get(uf.m10995i(arrayList, i10));
        C2486b c2486b = c2503s.f13709a;
        int i11 = i10 - c2503s.f13712d;
        C2841r c2841r = c2486b.f13558d;
        if (z6) {
            Layout layout = c2841r.f15832f;
            C2840q c2840q = AbstractC2842s.f15844a;
            if (layout.getEllipsisCount(i11) <= 0 || c2841r.f15828b != TextUtils.TruncateAt.END) {
                C0073l c0073lM6969c = c2841r.m6969c();
                Layout layout2 = (Layout) c0073lM6969c.f264a;
                iM6972f = c0073lM6969c.m195D(layout2.getLineEnd(i11), layout2.getLineStart(i11));
            } else {
                iM6972f = layout.getEllipsisStart(i11) + layout.getLineStart(i11);
            }
        } else {
            iM6972f = c2841r.m6972f(i11);
        }
        return iM6972f + c2503s.f13710b;
    }

    /* renamed from: d */
    public final int m6471d(int i10) {
        int length = ((C2492h) this.f13697a.f264a).f13620b.length();
        ArrayList arrayList = this.f13704h;
        C2503s c2503s = (C2503s) arrayList.get(i10 >= length ? pe.m10832g(arrayList) : i10 < 0 ? 0 : uf.m10994h(arrayList, i10));
        return c2503s.f13709a.f13558d.f15832f.getLineForOffset(c2503s.m6482d(i10)) + c2503s.f13712d;
    }

    /* renamed from: e */
    public final int m6472e(float f6) {
        ArrayList arrayList = this.f13704h;
        C2503s c2503s = (C2503s) arrayList.get(uf.m10996j(arrayList, f6));
        int i10 = c2503s.f13711c - c2503s.f13710b;
        int i11 = c2503s.f13712d;
        if (i10 == 0) {
            return i11;
        }
        C2486b c2486b = c2503s.f13709a;
        float f10 = f6 - c2503s.f13714f;
        C2841r c2841r = c2486b.f13558d;
        return c2841r.f15832f.getLineForVertical(((int) f10) - c2841r.f15834h) + i11;
    }

    /* renamed from: f */
    public final float m6473f(int i10) {
        m6478m(i10);
        ArrayList arrayList = this.f13704h;
        C2503s c2503s = (C2503s) arrayList.get(uf.m10995i(arrayList, i10));
        C2486b c2486b = c2503s.f13709a;
        return c2486b.f13558d.m6973g(i10 - c2503s.f13712d) + c2503s.f13714f;
    }

    /* renamed from: g */
    public final int m6474g(long j6) {
        int i10 = (int) (j6 & 4294967295L);
        float fIntBitsToFloat = Float.intBitsToFloat(i10);
        ArrayList arrayList = this.f13704h;
        C2503s c2503s = (C2503s) arrayList.get(uf.m10996j(arrayList, fIntBitsToFloat));
        int i11 = c2503s.f13711c;
        int i12 = c2503s.f13710b;
        if (i11 - i12 == 0) {
            return i12;
        }
        C2486b c2486b = c2503s.f13709a;
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j6 >> 32));
        float fIntBitsToFloat3 = Float.intBitsToFloat(i10) - c2503s.f13714f;
        long jFloatToRawIntBits = (Float.floatToRawIntBits(fIntBitsToFloat3) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat2) << 32);
        C2841r c2841r = c2486b.f13558d;
        int lineForVertical = c2841r.f15832f.getLineForVertical(((int) Float.intBitsToFloat((int) (4294967295L & jFloatToRawIntBits))) - c2841r.f15834h);
        return c2841r.f15832f.getOffsetForHorizontal(lineForVertical, (c2841r.m6968b(lineForVertical) * (-1)) + Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32))) + i12;
    }

    /* renamed from: h */
    public final long m6475h(C0848c c0848c, int i10, C1612b c1612b) {
        long jM6480b;
        long j6;
        float f6 = c0848c.f5355b;
        ArrayList arrayList = this.f13704h;
        int iM10996j = uf.m10996j(arrayList, f6);
        float f10 = ((C2503s) arrayList.get(iM10996j)).f13715g;
        float f11 = c0848c.f5357d;
        if (f10 >= f11 || iM10996j == pe.m10832g(arrayList)) {
            C2503s c2503s = (C2503s) arrayList.get(iM10996j);
            return c2503s.m6480b(true, c2503s.f13709a.m6415c(c2503s.m6481c(c0848c), i10, c1612b));
        }
        int iM10996j2 = uf.m10996j(arrayList, f11);
        long jM6480b2 = n0.f13684b;
        while (true) {
            jM6480b = n0.f13684b;
            if (!n0.m6454a(jM6480b2, jM6480b) || iM10996j > iM10996j2) {
                break;
            }
            C2503s c2503s2 = (C2503s) arrayList.get(iM10996j);
            jM6480b2 = c2503s2.m6480b(true, c2503s2.f13709a.m6415c(c2503s2.m6481c(c0848c), i10, c1612b));
            iM10996j++;
        }
        if (n0.m6454a(jM6480b2, jM6480b)) {
            return jM6480b;
        }
        while (true) {
            j6 = n0.f13684b;
            if (!n0.m6454a(jM6480b, j6) || iM10996j > iM10996j2) {
                break;
            }
            C2503s c2503s3 = (C2503s) arrayList.get(iM10996j2);
            jM6480b = c2503s3.m6480b(true, c2503s3.f13709a.m6415c(c2503s3.m6481c(c0848c), i10, c1612b));
            iM10996j2--;
        }
        return n0.m6454a(jM6480b, j6) ? jM6480b2 : yf.m11072a((int) (jM6480b2 >> 32), (int) (4294967295L & jM6480b));
    }

    /* renamed from: k */
    public final void m6476k(int i10) {
        boolean z6 = false;
        C0073l c0073l = this.f13697a;
        if (i10 >= 0 && i10 < ((C2492h) c0073l.f264a).f13620b.length()) {
            z6 = true;
        }
        if (z6) {
            return;
        }
        StringBuilder sbM4567n = AbstractC1452a.m4567n(i10, "offset(", ") is out of bounds [0, ");
        sbM4567n.append(((C2492h) c0073l.f264a).f13620b.length());
        sbM4567n.append(')');
        AbstractC4646a.m9525a(sbM4567n.toString());
    }

    /* renamed from: l */
    public final void m6477l(int i10) {
        boolean z6 = false;
        C0073l c0073l = this.f13697a;
        if (i10 >= 0 && i10 <= ((C2492h) c0073l.f264a).f13620b.length()) {
            z6 = true;
        }
        if (z6) {
            return;
        }
        StringBuilder sbM4567n = AbstractC1452a.m4567n(i10, "offset(", ") is out of bounds [0, ");
        sbM4567n.append(((C2492h) c0073l.f264a).f13620b.length());
        sbM4567n.append(']');
        AbstractC4646a.m9525a(sbM4567n.toString());
    }

    /* renamed from: m */
    public final void m6478m(int i10) {
        boolean z6 = false;
        int i11 = this.f13702f;
        if (i10 >= 0 && i10 < i11) {
            z6 = true;
        }
        if (z6) {
            return;
        }
        AbstractC4646a.m9525a("lineIndex(" + i10 + ") is out of bounds [0, " + i11 + ')');
    }
}
