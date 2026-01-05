package h4;

import a9.C0073l;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.Layout;
import android.text.TextPaint;
import android.text.TextUtils;
import com.skydoves.balloon.internals.DefinitionKt;
import fm.C2322a;
import j4.C3580h;
import java.util.ArrayList;
import nx.AbstractC5178p;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: h4.r */
/* loaded from: classes.dex */
public final class C2841r {

    /* renamed from: a */
    public final TextPaint f15827a;

    /* renamed from: b */
    public final TextUtils.TruncateAt f15828b;

    /* renamed from: c */
    public final boolean f15829c;

    /* renamed from: d */
    public final boolean f15830d;

    /* renamed from: e */
    public C2322a f15831e;

    /* renamed from: f */
    public final Layout f15832f;

    /* renamed from: g */
    public final int f15833g;

    /* renamed from: h */
    public final int f15834h;

    /* renamed from: i */
    public final int f15835i;

    /* renamed from: j */
    public final float f15836j;

    /* renamed from: k */
    public final float f15837k;

    /* renamed from: l */
    public final boolean f15838l;

    /* renamed from: m */
    public final Paint.FontMetricsInt f15839m;

    /* renamed from: n */
    public final int f15840n;

    /* renamed from: o */
    public final C3580h[] f15841o;

    /* renamed from: p */
    public final Rect f15842p = new Rect();

    /* renamed from: q */
    public C0073l f15843q;

    /* JADX WARN: Removed duplicated region for block: B:61:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01b7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C2841r(java.lang.CharSequence r22, float r23, android.text.TextPaint r24, int r25, android.text.TextUtils.TruncateAt r26, int r27, boolean r28, int r29, int r30, int r31, int r32, int r33, int r34, h4.C2835l r35) {
        /*
            Method dump skipped, instructions count: 759
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: h4.C2841r.<init>(java.lang.CharSequence, float, android.text.TextPaint, int, android.text.TextUtils$TruncateAt, int, boolean, int, int, int, int, int, int, h4.l):void");
    }

    /* renamed from: a */
    public final int m6967a() {
        boolean z6 = this.f15830d;
        Layout layout = this.f15832f;
        return (z6 ? layout.getLineBottom(this.f15833g - 1) : layout.getHeight()) + this.f15834h + this.f15835i + this.f15840n;
    }

    /* renamed from: b */
    public final float m6968b(int i10) {
        return i10 == this.f15833g + (-1) ? this.f15836j + this.f15837k : DefinitionKt.NO_Float_VALUE;
    }

    /* renamed from: c */
    public final C0073l m6969c() {
        C0073l c0073l = this.f15843q;
        if (c0073l != null) {
            return c0073l;
        }
        C0073l c0073l2 = new C0073l();
        c0073l2.f264a = this.f15832f;
        ArrayList arrayList = new ArrayList();
        int length = 0;
        do {
            int iM10098I = AbstractC5178p.m10098I(((Layout) c0073l2.f264a).getText(), '\n', length, 4);
            length = iM10098I < 0 ? ((Layout) c0073l2.f264a).getText().length() : iM10098I + 1;
            arrayList.add(Integer.valueOf(length));
        } while (length < ((Layout) c0073l2.f264a).getText().length());
        c0073l2.f265b = arrayList;
        int size = arrayList.size();
        ArrayList arrayList2 = new ArrayList(size);
        for (int i10 = 0; i10 < size; i10++) {
            arrayList2.add(null);
        }
        c0073l2.f266c = arrayList2;
        c0073l2.f267d = new boolean[((ArrayList) c0073l2.f265b).size()];
        ((ArrayList) c0073l2.f265b).size();
        this.f15843q = c0073l2;
        return c0073l2;
    }

    /* renamed from: d */
    public final float m6970d(int i10) {
        Paint.FontMetricsInt fontMetricsInt;
        return this.f15834h + ((i10 != this.f15833g + (-1) || (fontMetricsInt = this.f15839m) == null) ? this.f15832f.getLineBaseline(i10) : m6973g(i10) - fontMetricsInt.ascent);
    }

    /* renamed from: e */
    public final float m6971e(int i10) {
        Paint.FontMetricsInt fontMetricsInt;
        int i11 = this.f15833g;
        int i12 = i11 - 1;
        Layout layout = this.f15832f;
        if (i10 != i12 || (fontMetricsInt = this.f15839m) == null) {
            return this.f15834h + layout.getLineBottom(i10) + (i10 == i11 + (-1) ? this.f15835i : 0);
        }
        return layout.getLineBottom(i10 - 1) + fontMetricsInt.bottom;
    }

    /* renamed from: f */
    public final int m6972f(int i10) {
        C2840q c2840q = AbstractC2842s.f15844a;
        Layout layout = this.f15832f;
        return (layout.getEllipsisCount(i10) <= 0 || this.f15828b != TextUtils.TruncateAt.END) ? layout.getLineEnd(i10) : layout.getText().length();
    }

    /* renamed from: g */
    public final float m6973g(int i10) {
        return this.f15832f.getLineTop(i10) + (i10 == 0 ? 0 : this.f15834h);
    }

    /* renamed from: h */
    public final float m6974h(int i10, boolean z6) {
        return m6968b(this.f15832f.getLineForOffset(i10)) + m6969c().m231x(i10, true, z6);
    }

    /* renamed from: i */
    public final float m6975i(int i10, boolean z6) {
        return m6968b(this.f15832f.getLineForOffset(i10)) + m6969c().m231x(i10, false, z6);
    }

    /* renamed from: j */
    public final C2322a m6976j() {
        C2322a c2322a = this.f15831e;
        if (c2322a != null) {
            return c2322a;
        }
        Layout layout = this.f15832f;
        C2322a c2322a2 = new C2322a(layout.getText(), layout.getText().length(), this.f15827a.getTextLocale());
        this.f15831e = c2322a2;
        return c2322a2;
    }
}
