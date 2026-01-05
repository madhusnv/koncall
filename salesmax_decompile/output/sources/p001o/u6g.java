package p001o;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* loaded from: classes6.dex */
public abstract class u6g implements y76 {

    /* renamed from: a */
    public InputStream f48432a;

    /* renamed from: b */
    public OutputStream f48433b;

    public u6g(InputStream inputStream, OutputStream outputStream) {
        this.f48432a = inputStream;
        this.f48433b = outputStream;
    }

    @Override // p001o.y76
    /* renamed from: c */
    public boolean mo51046c() {
        return true;
    }

    @Override // p001o.y76
    /* renamed from: e */
    public boolean mo51047e(long j) {
        return true;
    }

    @Override // p001o.y76
    /* renamed from: f */
    public int mo51048f(sl1 sl1Var) {
        if (this.f48433b == null) {
            return -1;
        }
        int length = sl1Var.length();
        if (length > 0) {
            sl1Var.writeTo(this.f48433b);
        }
        sl1Var.clear();
        return length;
    }

    @Override // p001o.y76
    public void flush() throws IOException {
        this.f48433b.flush();
    }

    @Override // p001o.y76
    /* renamed from: g */
    public boolean mo51049g() {
        return false;
    }

    @Override // p001o.y76
    /* renamed from: h */
    public int mo51050h(sl1 sl1Var, sl1 sl1Var2, sl1 sl1Var3) {
        int iMo51048f;
        int length;
        int length2;
        if (sl1Var == null || (length2 = sl1Var.length()) <= 0) {
            iMo51048f = 0;
        } else {
            iMo51048f = mo51048f(sl1Var);
            if (iMo51048f < length2) {
                return iMo51048f;
            }
        }
        if (sl1Var2 != null && (length = sl1Var2.length()) > 0) {
            int iMo51048f2 = mo51048f(sl1Var2);
            if (iMo51048f2 < 0) {
                return iMo51048f > 0 ? iMo51048f : iMo51048f2;
            }
            iMo51048f += iMo51048f2;
            if (iMo51048f2 < length) {
                return iMo51048f;
            }
        }
        if (sl1Var3 == null || sl1Var3.length() <= 0) {
            return iMo51048f;
        }
        int iMo51048f3 = mo51048f(sl1Var3);
        return iMo51048f3 < 0 ? iMo51048f > 0 ? iMo51048f : iMo51048f3 : iMo51048f + iMo51048f3;
    }

    @Override // p001o.y76
    /* renamed from: i */
    public boolean mo51051i(long j) {
        return true;
    }

    @Override // p001o.y76
    public boolean isOpen() {
        return this.f48432a != null;
    }

    @Override // p001o.y76
    /* renamed from: j */
    public int mo27763j(sl1 sl1Var) throws IOException {
        if (this.f48432a == null) {
            return 0;
        }
        int iV0 = sl1Var.V0();
        if (iV0 > 0) {
            return sl1Var.H0(this.f48432a, iV0);
        }
        if (sl1Var.D2()) {
            return 0;
        }
        throw new IOException("FULL");
    }

    @Override // p001o.y76
    /* renamed from: l */
    public boolean mo51052l() {
        return false;
    }

    /* renamed from: m */
    public final boolean m51053m() {
        return !isOpen();
    }
}
