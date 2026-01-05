package p001o;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;
import androidx.emoji2.text.C2069f;

/* loaded from: classes2.dex */
public class nzh {

    /* renamed from: d */
    public static final ThreadLocal f37488d = new ThreadLocal();

    /* renamed from: a */
    public final int f37489a;

    /* renamed from: b */
    public final C2069f f37490b;

    /* renamed from: c */
    public volatile int f37491c = 0;

    public nzh(C2069f c2069f, int i) {
        this.f37490b = c2069f;
        this.f37489a = i;
    }

    /* renamed from: a */
    public void m41325a(Canvas canvas, float f, float f2, Paint paint) {
        Typeface typefaceM6128g = this.f37490b.m6128g();
        Typeface typeface = paint.getTypeface();
        paint.setTypeface(typefaceM6128g);
        canvas.drawText(this.f37490b.m6124c(), this.f37489a * 2, 2, f, f2, paint);
        paint.setTypeface(typeface);
    }

    /* renamed from: b */
    public int m41326b(int i) {
        return m41331g().m40372h(i);
    }

    /* renamed from: c */
    public int m41327c() {
        return m41331g().m40373i();
    }

    /* renamed from: d */
    public int m41328d() {
        return this.f37491c & 3;
    }

    /* renamed from: e */
    public int m41329e() {
        return m41331g().m40375k();
    }

    /* renamed from: f */
    public int m41330f() {
        return m41331g().m40376l();
    }

    /* renamed from: g */
    public final ndb m41331g() {
        ThreadLocal threadLocal = f37488d;
        ndb ndbVar = (ndb) threadLocal.get();
        if (ndbVar == null) {
            ndbVar = new ndb();
            threadLocal.set(ndbVar);
        }
        this.f37490b.m6125d().m42083j(ndbVar, this.f37489a);
        return ndbVar;
    }

    /* renamed from: h */
    public short m41332h() {
        return m41331g().m40377m();
    }

    /* renamed from: i */
    public int m41333i() {
        return m41331g().m40378n();
    }

    /* renamed from: j */
    public boolean m41334j() {
        return m41331g().m40374j();
    }

    /* renamed from: k */
    public boolean m41335k() {
        return (this.f37491c & 4) > 0;
    }

    /* renamed from: l */
    public void m41336l(boolean z) {
        int iM41328d = m41328d();
        if (z) {
            this.f37491c = iM41328d | 4;
        } else {
            this.f37491c = iM41328d;
        }
    }

    /* renamed from: m */
    public void m41337m(boolean z) {
        int i = this.f37491c & 4;
        this.f37491c = z ? i | 2 : i | 1;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(", id:");
        sb.append(Integer.toHexString(m41330f()));
        sb.append(", codepoints:");
        int iM41327c = m41327c();
        for (int i = 0; i < iM41327c; i++) {
            sb.append(Integer.toHexString(m41326b(i)));
            sb.append(" ");
        }
        return sb.toString();
    }
}
