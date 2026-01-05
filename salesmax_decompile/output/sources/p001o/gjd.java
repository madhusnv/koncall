package p001o;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Rect;
import androidx.camera.core.InterfaceC1893c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import p001o.sc8;

/* loaded from: classes2.dex */
public class gjd {

    /* renamed from: a */
    public final int f25341a;

    /* renamed from: b */
    public final sc8.C16803g f25342b;

    /* renamed from: c */
    public final Rect f25343c;

    /* renamed from: d */
    public final int f25344d;

    /* renamed from: e */
    public final int f25345e;

    /* renamed from: f */
    public final Matrix f25346f;

    /* renamed from: g */
    public final cjg f25347g;

    /* renamed from: h */
    public final String f25348h;

    /* renamed from: j */
    public final zfa f25350j;

    /* renamed from: k */
    public int f25351k = -1;

    /* renamed from: i */
    public final List f25349i = new ArrayList();

    public gjd(xc2 xc2Var, sc8.C16803g c16803g, Rect rect, int i, int i2, Matrix matrix, cjg cjgVar, zfa zfaVar, int i3) {
        this.f25341a = i3;
        this.f25342b = c16803g;
        this.f25345e = i2;
        this.f25344d = i;
        this.f25343c = rect;
        this.f25346f = matrix;
        this.f25347g = cjgVar;
        this.f25348h = String.valueOf(xc2Var.hashCode());
        List listMo55965a = xc2Var.mo55965a();
        Objects.requireNonNull(listMo55965a);
        Iterator it = listMo55965a.iterator();
        while (it.hasNext()) {
            this.f25349i.add(Integer.valueOf(((ge2) it.next()).getId()));
        }
        this.f25350j = zfaVar;
    }

    /* renamed from: a */
    public zfa m28864a() {
        return this.f25350j;
    }

    /* renamed from: b */
    public Rect m28865b() {
        return this.f25343c;
    }

    /* renamed from: c */
    public int m28866c() {
        return this.f25345e;
    }

    /* renamed from: d */
    public sc8.C16803g m28867d() {
        return this.f25342b;
    }

    /* renamed from: e */
    public int m28868e() {
        return this.f25341a;
    }

    /* renamed from: f */
    public int m28869f() {
        return this.f25344d;
    }

    /* renamed from: g */
    public Matrix m28870g() {
        return this.f25346f;
    }

    /* renamed from: h */
    public List m28871h() {
        return this.f25349i;
    }

    /* renamed from: i */
    public String m28872i() {
        return this.f25348h;
    }

    /* renamed from: j */
    public boolean m28873j() {
        return this.f25347g.isAborted();
    }

    /* renamed from: k */
    public boolean m28874k() {
        return m28867d() == null;
    }

    /* renamed from: l */
    public void m28875l(vc8 vc8Var) {
        this.f25347g.mo19463h(vc8Var);
    }

    /* renamed from: m */
    public void m28876m(int i) {
        if (this.f25351k != i) {
            this.f25351k = i;
            this.f25347g.mo19456a(i);
        }
    }

    /* renamed from: n */
    public void m28877n() {
        this.f25347g.mo19458c();
    }

    /* renamed from: o */
    public void m28878o(InterfaceC1893c interfaceC1893c) {
        this.f25347g.mo19459d(interfaceC1893c);
    }

    /* renamed from: p */
    public void m28879p(sc8.C16804h c16804h) {
        this.f25347g.mo19462g(c16804h);
    }

    /* renamed from: q */
    public void m28880q() {
        if (this.f25351k != -1) {
            m28876m(100);
        }
        this.f25347g.mo19461f();
    }

    /* renamed from: r */
    public void m28881r(Bitmap bitmap) {
        this.f25347g.mo19457b(bitmap);
    }

    /* renamed from: s */
    public void m28882s(vc8 vc8Var) {
        this.f25347g.mo19460e(vc8Var);
    }
}
