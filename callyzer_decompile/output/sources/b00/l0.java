package b00;

import c00.AbstractC0835b;
import c00.AbstractC0836c;
import c00.C0838e;
import c00.C0841h;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.zip.Inflater;
import kotlin.jvm.internal.AbstractC4154l;
import og.md;
import rw.AbstractC6663m;
import yk.C8687a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final class l0 extends AbstractC0532q {

    /* renamed from: e */
    public static final a0 f3643e;

    /* renamed from: b */
    public final a0 f3644b;

    /* renamed from: c */
    public final AbstractC0532q f3645c;

    /* renamed from: d */
    public final LinkedHashMap f3646d;

    static {
        String str = a0.f3585b;
        f3643e = C8687a.m16037m("/");
    }

    public l0(a0 a0Var, AbstractC0532q abstractC0532q, LinkedHashMap linkedHashMap) {
        this.f3644b = a0Var;
        this.f3645c = abstractC0532q;
        this.f3646d = linkedHashMap;
    }

    @Override // b00.AbstractC0532q
    /* renamed from: A */
    public final List mo1600A(a0 a0Var) throws IOException {
        a0 a0Var2 = f3643e;
        a0Var2.getClass();
        C0841h c0841h = (C0841h) this.f3646d.get(AbstractC0836c.m2256b(a0Var2, a0Var, true));
        if (c0841h != null) {
            return AbstractC6663m.c0(c0841h.f5330q);
        }
        throw new IOException("not a directory: " + a0Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:64:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0125  */
    @Override // b00.AbstractC0532q
    /* renamed from: J */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final b00.C0531p mo1601J(b00.a0 r26) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 315
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: b00.l0.mo1601J(b00.a0):b00.p");
    }

    @Override // b00.AbstractC0532q
    /* renamed from: P */
    public final C0538w mo1602P(a0 a0Var) {
        throw new UnsupportedOperationException("not implemented yet!");
    }

    @Override // b00.AbstractC0532q
    /* renamed from: R */
    public final h0 mo1603R(a0 file) throws IOException {
        AbstractC4154l.m8923f(file, "file");
        throw new IOException("zip file systems are read-only");
    }

    @Override // b00.AbstractC0532q
    /* renamed from: S */
    public final i0 mo1604S(a0 file) throws Throwable {
        Throwable th2;
        d0 d0VarM1524c;
        AbstractC4154l.m8923f(file, "file");
        a0 a0Var = f3643e;
        a0Var.getClass();
        C0841h c0841h = (C0841h) this.f3646d.get(AbstractC0836c.m2256b(a0Var, file, true));
        if (c0841h == null) {
            throw new FileNotFoundException("no such file: " + file);
        }
        long j6 = c0841h.f5319f;
        C0538w c0538wMo1602P = this.f3645c.mo1602P(this.f3644b);
        try {
            d0VarM1524c = AbstractC0517b.m1524c(c0538wMo1602P.m1626h(c0841h.f5321h));
            try {
                c0538wMo1602P.close();
                th2 = null;
            } catch (Throwable th3) {
                th2 = th3;
            }
        } catch (Throwable th4) {
            if (c0538wMo1602P != null) {
                try {
                    c0538wMo1602P.close();
                } catch (Throwable th5) {
                    md.m10764a(th4, th5);
                }
            }
            th2 = th4;
            d0VarM1524c = null;
        }
        if (th2 != null) {
            throw th2;
        }
        AbstractC4154l.m8923f(d0VarM1524c, "<this>");
        AbstractC0835b.m2253f(d0VarM1524c, null);
        if (c0841h.f5320g == 0) {
            return new C0838e(d0VarM1524c, j6, true);
        }
        return new C0838e(new C0537v(AbstractC0517b.m1524c(new C0838e(d0VarM1524c, c0841h.f5318e, true)), new Inflater(true)), j6, false);
    }

    @Override // b00.AbstractC0532q
    /* renamed from: h */
    public final h0 mo1605h(a0 file) throws IOException {
        AbstractC4154l.m8923f(file, "file");
        throw new IOException("zip file systems are read-only");
    }

    @Override // b00.AbstractC0532q
    /* renamed from: j */
    public final void mo1606j(a0 source, a0 target) throws IOException {
        AbstractC4154l.m8923f(source, "source");
        AbstractC4154l.m8923f(target, "target");
        throw new IOException("zip file systems are read-only");
    }

    @Override // b00.AbstractC0532q
    /* renamed from: n */
    public final void mo1607n(a0 dir) throws IOException {
        AbstractC4154l.m8923f(dir, "dir");
        throw new IOException("zip file systems are read-only");
    }

    @Override // b00.AbstractC0532q
    /* renamed from: u */
    public final void mo1608u(a0 path) throws IOException {
        AbstractC4154l.m8923f(path, "path");
        throw new IOException("zip file systems are read-only");
    }
}
