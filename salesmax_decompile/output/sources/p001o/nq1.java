package p001o;

import com.google.firebase.perf.util.Constants;
import java.io.ByteArrayInputStream;
import java.io.CharConversionException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import p001o.x89;

/* loaded from: classes5.dex */
public final class nq1 {

    /* renamed from: a */
    public final q68 f37145a;

    /* renamed from: b */
    public final InputStream f37146b;

    /* renamed from: c */
    public final byte[] f37147c;

    /* renamed from: h */
    public int f37152h;

    /* renamed from: g */
    public boolean f37151g = true;

    /* renamed from: d */
    public int f37148d = 0;

    /* renamed from: e */
    public int f37149e = 0;

    /* renamed from: f */
    public final boolean f37150f = true;

    public nq1(q68 q68Var, InputStream inputStream) {
        this.f37145a = q68Var;
        this.f37146b = inputStream;
        this.f37147c = q68Var.m44849e();
    }

    /* renamed from: a */
    public final boolean m40905a(int i) {
        if ((65280 & i) == 0) {
            this.f37151g = true;
        } else {
            if ((i & Constants.MAX_HOST_LENGTH) != 0) {
                return false;
            }
            this.f37151g = false;
        }
        this.f37152h = 2;
        return true;
    }

    /* renamed from: b */
    public final boolean m40906b(int i) throws CharConversionException {
        if ((i >> 8) == 0) {
            this.f37151g = true;
        } else if ((16777215 & i) == 0) {
            this.f37151g = false;
        } else if (((-16711681) & i) == 0) {
            m40912h("3412");
        } else {
            if ((i & (-65281)) != 0) {
                return false;
            }
            m40912h("2143");
        }
        this.f37152h = 4;
        return true;
    }

    /* renamed from: c */
    public ca9 m40907c(int i, i6c i6cVar, lq1 lq1Var, rh2 rh2Var, int i2) {
        int i3 = this.f37148d;
        s89 s89VarM40909e = m40909e();
        int i4 = this.f37148d - i3;
        if (s89VarM40909e != s89.UTF8 || !x89.EnumC18074a.CANONICALIZE_FIELD_NAMES.enabledIn(i2)) {
            return new oce(this.f37145a, i, m40908d(), i6cVar, rh2Var.m46758q(i2));
        }
        return new p1i(this.f37145a, i, this.f37146b, i6cVar, lq1Var.m37709H(i2), this.f37147c, this.f37148d, this.f37149e, i4, this.f37150f);
    }

    /* renamed from: d */
    public Reader m40908d() {
        s89 s89VarM44854j = this.f37145a.m44854j();
        int iBits = s89VarM44854j.bits();
        if (iBits != 8 && iBits != 16) {
            if (iBits != 32) {
                throw new RuntimeException("Internal error");
            }
            q68 q68Var = this.f37145a;
            return new n1i(q68Var, this.f37146b, this.f37147c, this.f37148d, this.f37149e, q68Var.m44854j().isBigEndian());
        }
        InputStream gbbVar = this.f37146b;
        if (gbbVar == null) {
            gbbVar = new ByteArrayInputStream(this.f37147c, this.f37148d, this.f37149e);
        } else if (this.f37148d < this.f37149e) {
            gbbVar = new gbb(this.f37145a, gbbVar, this.f37147c, this.f37148d, this.f37149e);
        }
        return new InputStreamReader(gbbVar, s89VarM44854j.getJavaName());
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x005e  */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public s89 m40909e() {
        int i;
        s89 s89Var;
        boolean z = false;
        if (m40910f(4)) {
            byte[] bArr = this.f37147c;
            int i2 = this.f37148d;
            int i3 = (bArr[i2 + 3] & 255) | (bArr[i2] << 24) | ((bArr[i2 + 1] & 255) << 16) | ((bArr[i2 + 2] & 255) << 8);
            if (m40911g(i3) || m40906b(i3) || m40905a(i3 >>> 16)) {
                z = true;
            }
        } else if (m40910f(2)) {
            byte[] bArr2 = this.f37147c;
            int i4 = this.f37148d;
            if (m40905a((bArr2[i4 + 1] & 255) | ((bArr2[i4] & 255) << 8))) {
            }
        }
        if (!z || (i = this.f37152h) == 1) {
            s89Var = s89.UTF8;
        } else if (i == 2) {
            s89Var = this.f37151g ? s89.UTF16_BE : s89.UTF16_LE;
        } else {
            if (i != 4) {
                throw new RuntimeException("Internal error");
            }
            s89Var = this.f37151g ? s89.UTF32_BE : s89.UTF32_LE;
        }
        this.f37145a.m44862r(s89Var);
        return s89Var;
    }

    /* renamed from: f */
    public boolean m40910f(int i) throws IOException {
        int i2;
        int i3 = this.f37149e - this.f37148d;
        while (i3 < i) {
            InputStream inputStream = this.f37146b;
            if (inputStream == null) {
                i2 = -1;
            } else {
                byte[] bArr = this.f37147c;
                int i4 = this.f37149e;
                i2 = inputStream.read(bArr, i4, bArr.length - i4);
            }
            if (i2 < 1) {
                return false;
            }
            this.f37149e += i2;
            i3 += i2;
        }
        return true;
    }

    /* renamed from: g */
    public final boolean m40911g(int i) throws CharConversionException {
        if (i == -16842752) {
            m40912h("3412");
        } else {
            if (i == -131072) {
                this.f37148d += 4;
                this.f37152h = 4;
                this.f37151g = false;
                return true;
            }
            if (i == 65279) {
                this.f37151g = true;
                this.f37148d += 4;
                this.f37152h = 4;
                return true;
            }
            if (i == 65534) {
                m40912h("2143");
            }
        }
        int i2 = i >>> 16;
        if (i2 == 65279) {
            this.f37148d += 2;
            this.f37152h = 2;
            this.f37151g = true;
            return true;
        }
        if (i2 == 65534) {
            this.f37148d += 2;
            this.f37152h = 2;
            this.f37151g = false;
            return true;
        }
        if ((i >>> 8) != 15711167) {
            return false;
        }
        this.f37148d += 3;
        this.f37152h = 1;
        this.f37151g = true;
        return true;
    }

    /* renamed from: h */
    public final void m40912h(String str) throws CharConversionException {
        throw new CharConversionException("Unsupported UCS-4 endianness (" + str + ") detected");
    }
}
