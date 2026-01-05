package p001o;

import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import com.google.firebase.perf.util.Constants;
import java.nio.charset.Charset;
import java.util.List;
import p001o.cd4;
import p001o.qbg;

/* loaded from: classes2.dex */
public final class yyh implements qbg {

    /* renamed from: a */
    public final zwc f56296a = new zwc();

    /* renamed from: b */
    public final boolean f56297b;

    /* renamed from: c */
    public final int f56298c;

    /* renamed from: d */
    public final int f56299d;

    /* renamed from: e */
    public final String f56300e;

    /* renamed from: f */
    public final float f56301f;

    /* renamed from: g */
    public final int f56302g;

    public yyh(List list) {
        if (list.size() != 1 || (((byte[]) list.get(0)).length != 48 && ((byte[]) list.get(0)).length != 53)) {
            this.f56298c = 0;
            this.f56299d = -1;
            this.f56300e = "sans-serif";
            this.f56297b = false;
            this.f56301f = 0.85f;
            this.f56302g = -1;
            return;
        }
        byte[] bArr = (byte[]) list.get(0);
        this.f56298c = bArr[24];
        this.f56299d = ((bArr[26] & 255) << 24) | ((bArr[27] & 255) << 16) | ((bArr[28] & 255) << 8) | (bArr[29] & 255);
        this.f56300e = "Serif".equals(sqi.m48704I(bArr, 43, bArr.length - 43)) ? "serif" : "sans-serif";
        int i = bArr[25] * 20;
        this.f56302g = i;
        boolean z = (bArr[0] & 32) != 0;
        this.f56297b = z;
        if (z) {
            this.f56301f = sqi.m48735n(((bArr[11] & 255) | ((bArr[10] & 255) << 8)) / i, 0.0f, 0.95f);
        } else {
            this.f56301f = 0.85f;
        }
    }

    /* renamed from: e */
    public static void m58537e(SpannableStringBuilder spannableStringBuilder, int i, int i2, int i3, int i4, int i5) {
        if (i != i2) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan((i >>> 8) | ((i & Constants.MAX_HOST_LENGTH) << 24)), i3, i4, i5 | 33);
        }
    }

    /* renamed from: f */
    public static void m58538f(SpannableStringBuilder spannableStringBuilder, int i, int i2, int i3, int i4, int i5) {
        if (i != i2) {
            int i6 = i5 | 33;
            boolean z = (i & 1) != 0;
            boolean z2 = (i & 2) != 0;
            if (z) {
                if (z2) {
                    spannableStringBuilder.setSpan(new StyleSpan(3), i3, i4, i6);
                } else {
                    spannableStringBuilder.setSpan(new StyleSpan(1), i3, i4, i6);
                }
            } else if (z2) {
                spannableStringBuilder.setSpan(new StyleSpan(2), i3, i4, i6);
            }
            boolean z3 = (i & 4) != 0;
            if (z3) {
                spannableStringBuilder.setSpan(new UnderlineSpan(), i3, i4, i6);
            }
            if (z3 || z || z2) {
                return;
            }
            spannableStringBuilder.setSpan(new StyleSpan(0), i3, i4, i6);
        }
    }

    /* renamed from: g */
    public static void m58539g(SpannableStringBuilder spannableStringBuilder, String str, int i, int i2) {
        if (str != "sans-serif") {
            spannableStringBuilder.setSpan(new TypefaceSpan(str), i, i2, 16711713);
        }
    }

    /* renamed from: h */
    public static String m58540h(zwc zwcVar) {
        op0.m42511a(zwcVar.m60020a() >= 2);
        int iM60010N = zwcVar.m60010N();
        if (iM60010N == 0) {
            return "";
        }
        int iM60025f = zwcVar.m60025f();
        Charset charsetM60012P = zwcVar.m60012P();
        int iM60025f2 = iM60010N - (zwcVar.m60025f() - iM60025f);
        if (charsetM60012P == null) {
            charsetM60012P = uh2.f48931c;
        }
        return zwcVar.m60002F(iM60025f2, charsetM60012P);
    }

    @Override // p001o.qbg
    /* renamed from: a */
    public void mo29158a(byte[] bArr, int i, int i2, qbg.C16330b c16330b, fu3 fu3Var) {
        this.f56296a.m60015S(bArr, i + i2);
        this.f56296a.m60017U(i);
        String strM58540h = m58540h(this.f56296a);
        if (strM58540h.isEmpty()) {
            fu3Var.accept(new jd4(nf8.m40499E(), -9223372036854775807L, -9223372036854775807L));
            return;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(strM58540h);
        m58538f(spannableStringBuilder, this.f56298c, 0, 0, spannableStringBuilder.length(), 16711680);
        m58537e(spannableStringBuilder, this.f56299d, -1, 0, spannableStringBuilder.length(), 16711680);
        m58539g(spannableStringBuilder, this.f56300e, 0, spannableStringBuilder.length());
        float fM48735n = this.f56301f;
        while (this.f56296a.m60020a() >= 8) {
            int iM60025f = this.f56296a.m60025f();
            int iM60036q = this.f56296a.m60036q();
            int iM60036q2 = this.f56296a.m60036q();
            if (iM60036q2 == 1937013100) {
                op0.m42511a(this.f56296a.m60020a() >= 2);
                int iM60010N = this.f56296a.m60010N();
                for (int i3 = 0; i3 < iM60010N; i3++) {
                    m58541d(this.f56296a, spannableStringBuilder);
                }
            } else if (iM60036q2 == 1952608120 && this.f56297b) {
                op0.m42511a(this.f56296a.m60020a() >= 2);
                fM48735n = sqi.m48735n(this.f56296a.m60010N() / this.f56302g, 0.0f, 0.95f);
            }
            this.f56296a.m60017U(iM60025f + iM60036q);
        }
        fu3Var.accept(new jd4(nf8.m40500F(new cd4.C12641b().m20933o(spannableStringBuilder).m20926h(fM48735n, 0).m20927i(0).m20919a()), -9223372036854775807L, -9223372036854775807L));
    }

    @Override // p001o.qbg
    /* renamed from: c */
    public int mo29159c() {
        return 2;
    }

    /* renamed from: d */
    public final void m58541d(zwc zwcVar, SpannableStringBuilder spannableStringBuilder) {
        op0.m42511a(zwcVar.m60020a() >= 12);
        int iM60010N = zwcVar.m60010N();
        int iM60010N2 = zwcVar.m60010N();
        zwcVar.m60018V(2);
        int iM60004H = zwcVar.m60004H();
        zwcVar.m60018V(1);
        int iM60036q = zwcVar.m60036q();
        if (iM60010N2 > spannableStringBuilder.length()) {
            ria.m46824h("Tx3gParser", "Truncating styl end (" + iM60010N2 + ") to cueText.length() (" + spannableStringBuilder.length() + ").");
            iM60010N2 = spannableStringBuilder.length();
        }
        if (iM60010N < iM60010N2) {
            int i = iM60010N2;
            m58538f(spannableStringBuilder, iM60004H, this.f56298c, iM60010N, i, 0);
            m58537e(spannableStringBuilder, iM60036q, this.f56299d, iM60010N, i, 0);
            return;
        }
        ria.m46824h("Tx3gParser", "Ignoring styl with start (" + iM60010N + ") >= end (" + iM60010N2 + ").");
    }
}
