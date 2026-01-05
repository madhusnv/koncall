package p001o;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.Layout;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.SpannedString;
import android.text.TextUtils;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes2.dex */
public final class cd4 {

    /* renamed from: a */
    public final CharSequence f17897a;

    /* renamed from: b */
    public final Layout.Alignment f17898b;

    /* renamed from: c */
    public final Layout.Alignment f17899c;

    /* renamed from: d */
    public final Bitmap f17900d;

    /* renamed from: e */
    public final float f17901e;

    /* renamed from: f */
    public final int f17902f;

    /* renamed from: g */
    public final int f17903g;

    /* renamed from: h */
    public final float f17904h;

    /* renamed from: i */
    public final int f17905i;

    /* renamed from: j */
    public final float f17906j;

    /* renamed from: k */
    public final float f17907k;

    /* renamed from: l */
    public final boolean f17908l;

    /* renamed from: m */
    public final int f17909m;

    /* renamed from: n */
    public final int f17910n;

    /* renamed from: o */
    public final float f17911o;

    /* renamed from: p */
    public final int f17912p;

    /* renamed from: q */
    public final float f17913q;

    /* renamed from: r */
    public static final cd4 f17888r = new C12641b().m20933o("").m20919a();

    /* renamed from: s */
    public static final String f17889s = sqi.B0(0);

    /* renamed from: t */
    public static final String f17890t = sqi.B0(17);

    /* renamed from: u */
    public static final String f17891u = sqi.B0(1);

    /* renamed from: v */
    public static final String f17892v = sqi.B0(2);

    /* renamed from: w */
    public static final String f17893w = sqi.B0(3);

    /* renamed from: x */
    public static final String f17894x = sqi.B0(18);

    /* renamed from: y */
    public static final String f17895y = sqi.B0(4);

    /* renamed from: z */
    public static final String f17896z = sqi.B0(5);

    /* renamed from: A */
    public static final String f17877A = sqi.B0(6);

    /* renamed from: B */
    public static final String f17878B = sqi.B0(7);

    /* renamed from: C */
    public static final String f17879C = sqi.B0(8);

    /* renamed from: D */
    public static final String f17880D = sqi.B0(9);

    /* renamed from: E */
    public static final String f17881E = sqi.B0(10);

    /* renamed from: F */
    public static final String f17882F = sqi.B0(11);

    /* renamed from: G */
    public static final String f17883G = sqi.B0(12);

    /* renamed from: H */
    public static final String f17884H = sqi.B0(13);

    /* renamed from: I */
    public static final String f17885I = sqi.B0(14);

    /* renamed from: J */
    public static final String f17886J = sqi.B0(15);

    /* renamed from: K */
    public static final String f17887K = sqi.B0(16);

    /* renamed from: o.cd4$b */
    public static final class C12641b {

        /* renamed from: a */
        public CharSequence f17914a;

        /* renamed from: b */
        public Bitmap f17915b;

        /* renamed from: c */
        public Layout.Alignment f17916c;

        /* renamed from: d */
        public Layout.Alignment f17917d;

        /* renamed from: e */
        public float f17918e;

        /* renamed from: f */
        public int f17919f;

        /* renamed from: g */
        public int f17920g;

        /* renamed from: h */
        public float f17921h;

        /* renamed from: i */
        public int f17922i;

        /* renamed from: j */
        public int f17923j;

        /* renamed from: k */
        public float f17924k;

        /* renamed from: l */
        public float f17925l;

        /* renamed from: m */
        public float f17926m;

        /* renamed from: n */
        public boolean f17927n;

        /* renamed from: o */
        public int f17928o;

        /* renamed from: p */
        public int f17929p;

        /* renamed from: q */
        public float f17930q;

        /* renamed from: a */
        public cd4 m20919a() {
            return new cd4(this.f17914a, this.f17916c, this.f17917d, this.f17915b, this.f17918e, this.f17919f, this.f17920g, this.f17921h, this.f17922i, this.f17923j, this.f17924k, this.f17925l, this.f17926m, this.f17927n, this.f17928o, this.f17929p, this.f17930q);
        }

        /* renamed from: b */
        public C12641b m20920b() {
            this.f17927n = false;
            return this;
        }

        /* renamed from: c */
        public int m20921c() {
            return this.f17920g;
        }

        /* renamed from: d */
        public int m20922d() {
            return this.f17922i;
        }

        /* renamed from: e */
        public CharSequence m20923e() {
            return this.f17914a;
        }

        /* renamed from: f */
        public C12641b m20924f(Bitmap bitmap) {
            this.f17915b = bitmap;
            return this;
        }

        /* renamed from: g */
        public C12641b m20925g(float f) {
            this.f17926m = f;
            return this;
        }

        /* renamed from: h */
        public C12641b m20926h(float f, int i) {
            this.f17918e = f;
            this.f17919f = i;
            return this;
        }

        /* renamed from: i */
        public C12641b m20927i(int i) {
            this.f17920g = i;
            return this;
        }

        /* renamed from: j */
        public C12641b m20928j(Layout.Alignment alignment) {
            this.f17917d = alignment;
            return this;
        }

        /* renamed from: k */
        public C12641b m20929k(float f) {
            this.f17921h = f;
            return this;
        }

        /* renamed from: l */
        public C12641b m20930l(int i) {
            this.f17922i = i;
            return this;
        }

        /* renamed from: m */
        public C12641b m20931m(float f) {
            this.f17930q = f;
            return this;
        }

        /* renamed from: n */
        public C12641b m20932n(float f) {
            this.f17925l = f;
            return this;
        }

        /* renamed from: o */
        public C12641b m20933o(CharSequence charSequence) {
            this.f17914a = charSequence;
            return this;
        }

        /* renamed from: p */
        public C12641b m20934p(Layout.Alignment alignment) {
            this.f17916c = alignment;
            return this;
        }

        /* renamed from: q */
        public C12641b m20935q(float f, int i) {
            this.f17924k = f;
            this.f17923j = i;
            return this;
        }

        /* renamed from: r */
        public C12641b m20936r(int i) {
            this.f17929p = i;
            return this;
        }

        /* renamed from: s */
        public C12641b m20937s(int i) {
            this.f17928o = i;
            this.f17927n = true;
            return this;
        }

        public C12641b() {
            this.f17914a = null;
            this.f17915b = null;
            this.f17916c = null;
            this.f17917d = null;
            this.f17918e = -3.4028235E38f;
            this.f17919f = Integer.MIN_VALUE;
            this.f17920g = Integer.MIN_VALUE;
            this.f17921h = -3.4028235E38f;
            this.f17922i = Integer.MIN_VALUE;
            this.f17923j = Integer.MIN_VALUE;
            this.f17924k = -3.4028235E38f;
            this.f17925l = -3.4028235E38f;
            this.f17926m = -3.4028235E38f;
            this.f17927n = false;
            this.f17928o = -16777216;
            this.f17929p = Integer.MIN_VALUE;
        }

        public C12641b(cd4 cd4Var) {
            this.f17914a = cd4Var.f17897a;
            this.f17915b = cd4Var.f17900d;
            this.f17916c = cd4Var.f17898b;
            this.f17917d = cd4Var.f17899c;
            this.f17918e = cd4Var.f17901e;
            this.f17919f = cd4Var.f17902f;
            this.f17920g = cd4Var.f17903g;
            this.f17921h = cd4Var.f17904h;
            this.f17922i = cd4Var.f17905i;
            this.f17923j = cd4Var.f17910n;
            this.f17924k = cd4Var.f17911o;
            this.f17925l = cd4Var.f17906j;
            this.f17926m = cd4Var.f17907k;
            this.f17927n = cd4Var.f17908l;
            this.f17928o = cd4Var.f17909m;
            this.f17929p = cd4Var.f17912p;
            this.f17930q = cd4Var.f17913q;
        }
    }

    /* renamed from: b */
    public static cd4 m20915b(Bundle bundle) {
        C12641b c12641b = new C12641b();
        CharSequence charSequence = bundle.getCharSequence(f17889s);
        if (charSequence != null) {
            c12641b.m20933o(charSequence);
            ArrayList parcelableArrayList = bundle.getParcelableArrayList(f17890t);
            if (parcelableArrayList != null) {
                SpannableString spannableStringValueOf = SpannableString.valueOf(charSequence);
                Iterator it = parcelableArrayList.iterator();
                while (it.hasNext()) {
                    yh4.m57809c((Bundle) it.next(), spannableStringValueOf);
                }
                c12641b.m20933o(spannableStringValueOf);
            }
        }
        Layout.Alignment alignment = (Layout.Alignment) bundle.getSerializable(f17891u);
        if (alignment != null) {
            c12641b.m20934p(alignment);
        }
        Layout.Alignment alignment2 = (Layout.Alignment) bundle.getSerializable(f17892v);
        if (alignment2 != null) {
            c12641b.m20928j(alignment2);
        }
        Bitmap bitmap = (Bitmap) bundle.getParcelable(f17893w);
        if (bitmap != null) {
            c12641b.m20924f(bitmap);
        } else {
            byte[] byteArray = bundle.getByteArray(f17894x);
            if (byteArray != null) {
                c12641b.m20924f(BitmapFactory.decodeByteArray(byteArray, 0, byteArray.length));
            }
        }
        String str = f17895y;
        if (bundle.containsKey(str)) {
            String str2 = f17896z;
            if (bundle.containsKey(str2)) {
                c12641b.m20926h(bundle.getFloat(str), bundle.getInt(str2));
            }
        }
        String str3 = f17877A;
        if (bundle.containsKey(str3)) {
            c12641b.m20927i(bundle.getInt(str3));
        }
        String str4 = f17878B;
        if (bundle.containsKey(str4)) {
            c12641b.m20929k(bundle.getFloat(str4));
        }
        String str5 = f17879C;
        if (bundle.containsKey(str5)) {
            c12641b.m20930l(bundle.getInt(str5));
        }
        String str6 = f17881E;
        if (bundle.containsKey(str6)) {
            String str7 = f17880D;
            if (bundle.containsKey(str7)) {
                c12641b.m20935q(bundle.getFloat(str6), bundle.getInt(str7));
            }
        }
        String str8 = f17882F;
        if (bundle.containsKey(str8)) {
            c12641b.m20932n(bundle.getFloat(str8));
        }
        String str9 = f17883G;
        if (bundle.containsKey(str9)) {
            c12641b.m20925g(bundle.getFloat(str9));
        }
        String str10 = f17884H;
        if (bundle.containsKey(str10)) {
            c12641b.m20937s(bundle.getInt(str10));
        }
        if (!bundle.getBoolean(f17885I, false)) {
            c12641b.m20920b();
        }
        String str11 = f17886J;
        if (bundle.containsKey(str11)) {
            c12641b.m20936r(bundle.getInt(str11));
        }
        String str12 = f17887K;
        if (bundle.containsKey(str12)) {
            c12641b.m20931m(bundle.getFloat(str12));
        }
        return c12641b.m20919a();
    }

    /* renamed from: a */
    public C12641b m20916a() {
        return new C12641b();
    }

    /* renamed from: c */
    public final Bundle m20917c() {
        Bundle bundle = new Bundle();
        CharSequence charSequence = this.f17897a;
        if (charSequence != null) {
            bundle.putCharSequence(f17889s, charSequence);
            CharSequence charSequence2 = this.f17897a;
            if (charSequence2 instanceof Spanned) {
                ArrayList<? extends Parcelable> arrayListM57807a = yh4.m57807a((Spanned) charSequence2);
                if (!arrayListM57807a.isEmpty()) {
                    bundle.putParcelableArrayList(f17890t, arrayListM57807a);
                }
            }
        }
        bundle.putSerializable(f17891u, this.f17898b);
        bundle.putSerializable(f17892v, this.f17899c);
        bundle.putFloat(f17895y, this.f17901e);
        bundle.putInt(f17896z, this.f17902f);
        bundle.putInt(f17877A, this.f17903g);
        bundle.putFloat(f17878B, this.f17904h);
        bundle.putInt(f17879C, this.f17905i);
        bundle.putInt(f17880D, this.f17910n);
        bundle.putFloat(f17881E, this.f17911o);
        bundle.putFloat(f17882F, this.f17906j);
        bundle.putFloat(f17883G, this.f17907k);
        bundle.putBoolean(f17885I, this.f17908l);
        bundle.putInt(f17884H, this.f17909m);
        bundle.putInt(f17886J, this.f17912p);
        bundle.putFloat(f17887K, this.f17913q);
        return bundle;
    }

    /* renamed from: d */
    public Bundle m20918d() {
        Bundle bundleM20917c = m20917c();
        if (this.f17900d != null) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            op0.m42517g(this.f17900d.compress(Bitmap.CompressFormat.PNG, 0, byteArrayOutputStream));
            bundleM20917c.putByteArray(f17894x, byteArrayOutputStream.toByteArray());
        }
        return bundleM20917c;
    }

    public boolean equals(Object obj) {
        Bitmap bitmap;
        Bitmap bitmap2;
        if (this == obj) {
            return true;
        }
        if (obj == null || cd4.class != obj.getClass()) {
            return false;
        }
        cd4 cd4Var = (cd4) obj;
        return TextUtils.equals(this.f17897a, cd4Var.f17897a) && this.f17898b == cd4Var.f17898b && this.f17899c == cd4Var.f17899c && ((bitmap = this.f17900d) != null ? !((bitmap2 = cd4Var.f17900d) == null || !bitmap.sameAs(bitmap2)) : cd4Var.f17900d == null) && this.f17901e == cd4Var.f17901e && this.f17902f == cd4Var.f17902f && this.f17903g == cd4Var.f17903g && this.f17904h == cd4Var.f17904h && this.f17905i == cd4Var.f17905i && this.f17906j == cd4Var.f17906j && this.f17907k == cd4Var.f17907k && this.f17908l == cd4Var.f17908l && this.f17909m == cd4Var.f17909m && this.f17910n == cd4Var.f17910n && this.f17911o == cd4Var.f17911o && this.f17912p == cd4Var.f17912p && this.f17913q == cd4Var.f17913q;
    }

    public int hashCode() {
        return r6c.m46256b(this.f17897a, this.f17898b, this.f17899c, this.f17900d, Float.valueOf(this.f17901e), Integer.valueOf(this.f17902f), Integer.valueOf(this.f17903g), Float.valueOf(this.f17904h), Integer.valueOf(this.f17905i), Float.valueOf(this.f17906j), Float.valueOf(this.f17907k), Boolean.valueOf(this.f17908l), Integer.valueOf(this.f17909m), Integer.valueOf(this.f17910n), Float.valueOf(this.f17911o), Integer.valueOf(this.f17912p), Float.valueOf(this.f17913q));
    }

    public cd4(CharSequence charSequence, Layout.Alignment alignment, Layout.Alignment alignment2, Bitmap bitmap, float f, int i, int i2, float f2, int i3, int i4, float f3, float f4, float f5, boolean z, int i5, int i6, float f6) {
        if (charSequence == null) {
            op0.m42515e(bitmap);
        } else {
            op0.m42511a(bitmap == null);
        }
        if (charSequence instanceof Spanned) {
            this.f17897a = SpannedString.valueOf(charSequence);
        } else if (charSequence != null) {
            this.f17897a = charSequence.toString();
        } else {
            this.f17897a = null;
        }
        this.f17898b = alignment;
        this.f17899c = alignment2;
        this.f17900d = bitmap;
        this.f17901e = f;
        this.f17902f = i;
        this.f17903g = i2;
        this.f17904h = f2;
        this.f17905i = i3;
        this.f17906j = f4;
        this.f17907k = f5;
        this.f17908l = z;
        this.f17909m = i5;
        this.f17910n = i4;
        this.f17911o = f3;
        this.f17912p = i6;
        this.f17913q = f6;
    }
}
