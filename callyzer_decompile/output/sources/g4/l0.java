package g4;

import android.graphics.RectF;
import android.text.Layout;
import c3.C0848c;
import com.skydoves.balloon.internals.DefinitionKt;
import com.sun.mail.util.AbstractC1452a;
import d3.AbstractC1558l;
import d3.C1555i;
import fm.C2322a;
import g2.b7;
import h4.C2841r;
import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC4154l;
import m4.AbstractC4646a;
import og.pe;
import og.uf;
import og.yf;
import r4.EnumC6455j;
import rw.AbstractC6663m;
import s4.C6756l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class l0 {

    /* renamed from: a */
    public final k0 f13670a;

    /* renamed from: b */
    public final C2501q f13671b;

    /* renamed from: c */
    public final long f13672c;

    /* renamed from: d */
    public final float f13673d;

    /* renamed from: e */
    public final float f13674e;

    /* renamed from: f */
    public final ArrayList f13675f;

    public l0(k0 k0Var, C2501q c2501q, long j6) {
        this.f13670a = k0Var;
        this.f13671b = c2501q;
        this.f13672c = j6;
        ArrayList arrayList = c2501q.f13704h;
        boolean zIsEmpty = arrayList.isEmpty();
        float fM6970d = DefinitionKt.NO_Float_VALUE;
        this.f13673d = zIsEmpty ? 0.0f : ((C2503s) arrayList.get(0)).f13709a.f13558d.m6970d(0);
        if (!arrayList.isEmpty()) {
            C2503s c2503s = (C2503s) AbstractC6663m.m12750N(arrayList);
            fM6970d = c2503s.f13709a.f13558d.m6970d(r4.f15833g - 1) + c2503s.f13714f;
        }
        this.f13674e = fM6970d;
        this.f13675f = c2501q.f13703g;
    }

    /* renamed from: a */
    public final EnumC6455j m6443a(int i10) {
        C2501q c2501q = this.f13671b;
        ArrayList arrayList = c2501q.f13704h;
        c2501q.m6477l(i10);
        C2503s c2503s = (C2503s) arrayList.get(i10 == ((C2492h) c2501q.f13697a.f264a).f13620b.length() ? pe.m10832g(arrayList) : uf.m10994h(arrayList, i10));
        return c2503s.f13709a.f13558d.f15832f.isRtlCharAt(c2503s.m6482d(i10)) ? EnumC6455j.Rtl : EnumC6455j.Ltr;
    }

    /* renamed from: b */
    public final C0848c m6444b(int i10) {
        float fM6975i;
        float fM6975i2;
        float fM6974h;
        float fM6974h2;
        C2501q c2501q = this.f13671b;
        c2501q.m6476k(i10);
        ArrayList arrayList = c2501q.f13704h;
        C2503s c2503s = (C2503s) arrayList.get(uf.m10994h(arrayList, i10));
        C2486b c2486b = c2503s.f13709a;
        int iM6482d = c2503s.m6482d(i10);
        CharSequence charSequence = c2486b.f13559e;
        if (iM6482d < 0 || iM6482d >= charSequence.length()) {
            StringBuilder sbM4567n = AbstractC1452a.m4567n(iM6482d, "offset(", ") is out of bounds [0,");
            sbM4567n.append(charSequence.length());
            sbM4567n.append(')');
            AbstractC4646a.m9525a(sbM4567n.toString());
        }
        C2841r c2841r = c2486b.f13558d;
        Layout layout = c2841r.f15832f;
        int lineForOffset = layout.getLineForOffset(iM6482d);
        float fM6973g = c2841r.m6973g(lineForOffset);
        float fM6971e = c2841r.m6971e(lineForOffset);
        boolean z6 = layout.getParagraphDirection(lineForOffset) == 1;
        boolean zIsRtlCharAt = layout.isRtlCharAt(iM6482d);
        if (!z6 || zIsRtlCharAt) {
            if (z6 && zIsRtlCharAt) {
                fM6974h = c2841r.m6975i(iM6482d, false);
                fM6974h2 = c2841r.m6975i(iM6482d + 1, true);
            } else if (zIsRtlCharAt) {
                fM6974h = c2841r.m6974h(iM6482d, false);
                fM6974h2 = c2841r.m6974h(iM6482d + 1, true);
            } else {
                fM6975i = c2841r.m6975i(iM6482d, false);
                fM6975i2 = c2841r.m6975i(iM6482d + 1, true);
            }
            float f6 = fM6974h;
            fM6975i = fM6974h2;
            fM6975i2 = f6;
        } else {
            fM6975i = c2841r.m6974h(iM6482d, false);
            fM6975i2 = c2841r.m6974h(iM6482d + 1, true);
        }
        RectF rectF = new RectF(fM6975i, fM6973g, fM6975i2, fM6971e);
        return c2503s.m6479a(new C0848c(rectF.left, rectF.top, rectF.right, rectF.bottom));
    }

    /* renamed from: c */
    public final C0848c m6445c(int i10) {
        C2501q c2501q = this.f13671b;
        ArrayList arrayList = c2501q.f13704h;
        c2501q.m6477l(i10);
        C2503s c2503s = (C2503s) arrayList.get(i10 == ((C2492h) c2501q.f13697a.f264a).f13620b.length() ? pe.m10832g(arrayList) : uf.m10994h(arrayList, i10));
        C2486b c2486b = c2503s.f13709a;
        int iM6482d = c2503s.m6482d(i10);
        CharSequence charSequence = c2486b.f13559e;
        C2841r c2841r = c2486b.f13558d;
        if (iM6482d < 0 || iM6482d > charSequence.length()) {
            StringBuilder sbM4567n = AbstractC1452a.m4567n(iM6482d, "offset(", ") is out of bounds [0,");
            sbM4567n.append(charSequence.length());
            sbM4567n.append(']');
            AbstractC4646a.m9525a(sbM4567n.toString());
        }
        float fM6974h = c2841r.m6974h(iM6482d, false);
        int lineForOffset = c2841r.f15832f.getLineForOffset(iM6482d);
        return c2503s.m6479a(new C0848c(fM6974h, c2841r.m6973g(lineForOffset), fM6974h, c2841r.m6971e(lineForOffset)));
    }

    /* renamed from: d */
    public final boolean m6446d() {
        long j6 = this.f13672c;
        float f6 = (int) (j6 >> 32);
        C2501q c2501q = this.f13671b;
        return f6 < c2501q.f13700d || c2501q.f13699c || ((float) ((int) (j6 & 4294967295L))) < c2501q.f13701e;
    }

    /* renamed from: e */
    public final float m6447e(int i10) {
        C2501q c2501q = this.f13671b;
        c2501q.m6478m(i10);
        ArrayList arrayList = c2501q.f13704h;
        C2503s c2503s = (C2503s) arrayList.get(uf.m10995i(arrayList, i10));
        C2486b c2486b = c2503s.f13709a;
        int i11 = i10 - c2503s.f13712d;
        C2841r c2841r = c2486b.f13558d;
        return c2841r.f15832f.getLineLeft(i11) + (i11 == c2841r.f15833g + (-1) ? c2841r.f15836j : DefinitionKt.NO_Float_VALUE);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l0)) {
            return false;
        }
        l0 l0Var = (l0) obj;
        return AbstractC4154l.m8918a(this.f13670a, l0Var.f13670a) && this.f13671b.equals(l0Var.f13671b) && C6756l.m12948a(this.f13672c, l0Var.f13672c) && this.f13673d == l0Var.f13673d && this.f13674e == l0Var.f13674e && AbstractC4154l.m8918a(this.f13675f, l0Var.f13675f);
    }

    /* renamed from: f */
    public final float m6448f(int i10) {
        C2501q c2501q = this.f13671b;
        c2501q.m6478m(i10);
        ArrayList arrayList = c2501q.f13704h;
        C2503s c2503s = (C2503s) arrayList.get(uf.m10995i(arrayList, i10));
        C2486b c2486b = c2503s.f13709a;
        int i11 = i10 - c2503s.f13712d;
        C2841r c2841r = c2486b.f13558d;
        return c2841r.f15832f.getLineRight(i11) + (i11 == c2841r.f15833g + (-1) ? c2841r.f15837k : DefinitionKt.NO_Float_VALUE);
    }

    /* renamed from: g */
    public final int m6449g(int i10) {
        C2501q c2501q = this.f13671b;
        c2501q.m6478m(i10);
        ArrayList arrayList = c2501q.f13704h;
        C2503s c2503s = (C2503s) arrayList.get(uf.m10995i(arrayList, i10));
        C2486b c2486b = c2503s.f13709a;
        return c2486b.f13558d.f15832f.getLineStart(i10 - c2503s.f13712d) + c2503s.f13710b;
    }

    /* renamed from: h */
    public final EnumC6455j m6450h(int i10) {
        C2501q c2501q = this.f13671b;
        ArrayList arrayList = c2501q.f13704h;
        c2501q.m6477l(i10);
        C2503s c2503s = (C2503s) arrayList.get(i10 == ((C2492h) c2501q.f13697a.f264a).f13620b.length() ? pe.m10832g(arrayList) : uf.m10994h(arrayList, i10));
        C2486b c2486b = c2503s.f13709a;
        int iM6482d = c2503s.m6482d(i10);
        C2841r c2841r = c2486b.f13558d;
        return c2841r.f15832f.getParagraphDirection(c2841r.f15832f.getLineForOffset(iM6482d)) == 1 ? EnumC6455j.Ltr : EnumC6455j.Rtl;
    }

    public final int hashCode() {
        return this.f13675f.hashCode() + AbstractC1452a.m4555b(this.f13674e, AbstractC1452a.m4555b(this.f13673d, AbstractC1452a.m4557d((this.f13671b.hashCode() + (this.f13670a.hashCode() * 31)) * 31, 31, this.f13672c), 31), 31);
    }

    /* renamed from: i */
    public final C1555i m6451i(int i10, int i11) {
        C2501q c2501q = this.f13671b;
        C2492h c2492h = (C2492h) c2501q.f13697a.f264a;
        if (i10 < 0 || i10 > i11 || i11 > c2492h.f13620b.length()) {
            StringBuilder sbM4566m = AbstractC1452a.m4566m(i10, i11, "Start(", ") or End(", ") is out of range [0..");
            sbM4566m.append(c2492h.f13620b.length());
            sbM4566m.append("), or start > end!");
            AbstractC4646a.m9525a(sbM4566m.toString());
        }
        if (i10 == i11) {
            return AbstractC1558l.m5178a();
        }
        C1555i c1555iM5178a = AbstractC1558l.m5178a();
        uf.m10997k(c2501q.f13704h, yf.m11072a(i10, i11), new b7(c1555iM5178a, i10, i11, 4));
        return c1555iM5178a;
    }

    /* renamed from: j */
    public final long m6452j(int i10) {
        int iM6002l;
        int iM6000j;
        int iM6000j2;
        C2501q c2501q = this.f13671b;
        ArrayList arrayList = c2501q.f13704h;
        c2501q.m6477l(i10);
        C2503s c2503s = (C2503s) arrayList.get(i10 == ((C2492h) c2501q.f13697a.f264a).f13620b.length() ? pe.m10832g(arrayList) : uf.m10994h(arrayList, i10));
        C2486b c2486b = c2503s.f13709a;
        int iM6482d = c2503s.m6482d(i10);
        C2322a c2322aM6976j = c2486b.f13558d.m6976j();
        if (c2322aM6976j.m5999i(c2322aM6976j.m6002l(iM6482d))) {
            c2322aM6976j.m5991a(iM6482d);
            iM6002l = iM6482d;
            while (iM6002l != -1 && (!c2322aM6976j.m5999i(iM6002l) || c2322aM6976j.m5995e(iM6002l))) {
                iM6002l = c2322aM6976j.m6002l(iM6002l);
            }
        } else {
            c2322aM6976j.m5991a(iM6482d);
            iM6002l = c2322aM6976j.m5998h(iM6482d) ? (!c2322aM6976j.m5996f(iM6482d) || c2322aM6976j.m5994d(iM6482d)) ? c2322aM6976j.m6002l(iM6482d) : iM6482d : c2322aM6976j.m5994d(iM6482d) ? c2322aM6976j.m6002l(iM6482d) : -1;
        }
        if (iM6002l == -1) {
            iM6002l = iM6482d;
        }
        if (c2322aM6976j.m5995e(c2322aM6976j.m6000j(iM6482d))) {
            c2322aM6976j.m5991a(iM6482d);
            iM6000j = iM6482d;
            while (iM6000j != -1 && (c2322aM6976j.m5999i(iM6000j) || !c2322aM6976j.m5995e(iM6000j))) {
                iM6000j = c2322aM6976j.m6000j(iM6000j);
            }
        } else {
            c2322aM6976j.m5991a(iM6482d);
            if (c2322aM6976j.m5994d(iM6482d)) {
                if (!c2322aM6976j.m5996f(iM6482d) || c2322aM6976j.m5998h(iM6482d)) {
                    iM6000j2 = c2322aM6976j.m6000j(iM6482d);
                    iM6000j = iM6000j2;
                } else {
                    iM6000j = iM6482d;
                }
            } else if (c2322aM6976j.m5998h(iM6482d)) {
                iM6000j2 = c2322aM6976j.m6000j(iM6482d);
                iM6000j = iM6000j2;
            } else {
                iM6000j = -1;
            }
        }
        if (iM6000j != -1) {
            iM6482d = iM6000j;
        }
        return c2503s.m6480b(false, yf.m11072a(iM6002l, iM6482d));
    }

    public final String toString() {
        return "TextLayoutResult(layoutInput=" + this.f13670a + ", multiParagraph=" + this.f13671b + ", size=" + ((Object) C6756l.m12949b(this.f13672c)) + ", firstBaseline=" + this.f13673d + ", lastBaseline=" + this.f13674e + ", placeholderRects=" + this.f13675f + ')';
    }
}
