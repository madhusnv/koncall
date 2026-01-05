package b00;

import c00.C0839f;
import java.io.Closeable;
import java.io.FileNotFoundException;
import java.util.List;
import kotlin.jvm.internal.AbstractC4154l;
import yk.C8687a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: b00.q */
/* loaded from: classes3.dex */
public abstract class AbstractC0532q implements Closeable {

    /* renamed from: a */
    public static final C0539x f3663a;

    static {
        C0539x c0539x;
        try {
            Class.forName("java.nio.file.Files");
            c0539x = new C0540y();
        } catch (ClassNotFoundException unused) {
            c0539x = new C0539x();
        }
        f3663a = c0539x;
        String str = a0.f3585b;
        String property = System.getProperty("java.io.tmpdir");
        AbstractC4154l.m8922e(property, "getProperty(...)");
        C8687a.m16037m(property);
        ClassLoader classLoader = C0839f.class.getClassLoader();
        AbstractC4154l.m8922e(classLoader, "getClassLoader(...)");
        new C0839f(classLoader);
    }

    /* renamed from: A */
    public abstract List mo1600A(a0 a0Var);

    /* renamed from: H */
    public final C0531p m1621H(a0 path) throws FileNotFoundException {
        AbstractC4154l.m8923f(path, "path");
        C0531p c0531pMo1601J = mo1601J(path);
        if (c0531pMo1601J != null) {
            return c0531pMo1601J;
        }
        throw new FileNotFoundException("no such file: " + path);
    }

    /* renamed from: J */
    public abstract C0531p mo1601J(a0 a0Var);

    /* renamed from: P */
    public abstract C0538w mo1602P(a0 a0Var);

    /* renamed from: R */
    public abstract h0 mo1603R(a0 a0Var);

    /* renamed from: S */
    public abstract i0 mo1604S(a0 a0Var);

    /* renamed from: h */
    public abstract h0 mo1605h(a0 a0Var);

    /* renamed from: j */
    public abstract void mo1606j(a0 a0Var, a0 a0Var2);

    /* renamed from: n */
    public abstract void mo1607n(a0 a0Var);

    /* renamed from: u */
    public abstract void mo1608u(a0 a0Var);

    /* renamed from: w */
    public final void m1622w(a0 path) {
        AbstractC4154l.m8923f(path, "path");
        mo1608u(path);
    }

    /* renamed from: z */
    public final boolean m1623z(a0 path) {
        AbstractC4154l.m8923f(path, "path");
        return mo1601J(path) != null;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }
}
