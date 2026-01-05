package c00;

import aw.C0465e;
import b00.AbstractC0517b;
import b00.AbstractC0532q;
import b00.C0531p;
import b00.C0538w;
import b00.C0539x;
import b00.a0;
import b00.h0;
import b00.i0;
import bl.C0689a;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.JarURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.jvm.internal.AbstractC4154l;
import nx.AbstractC5178p;
import nx.AbstractC5185w;
import og.nd;
import qw.C6361k;
import qw.C6366p;
import rw.AbstractC6663m;
import rw.AbstractC6664n;
import yk.C8687a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: c00.f */
/* loaded from: classes3.dex */
public final class C0839f extends AbstractC0532q {

    /* renamed from: e */
    public static final a0 f5309e;

    /* renamed from: b */
    public final ClassLoader f5310b;

    /* renamed from: c */
    public final AbstractC0532q f5311c;

    /* renamed from: d */
    public final C6366p f5312d;

    static {
        String str = a0.f3585b;
        f5309e = C8687a.m16037m("/");
    }

    public C0839f(ClassLoader classLoader) {
        C0539x systemFileSystem = AbstractC0532q.f3663a;
        AbstractC4154l.m8923f(systemFileSystem, "systemFileSystem");
        this.f5310b = classLoader;
        this.f5311c = systemFileSystem;
        this.f5312d = nd.m10782c(new C0465e(2, this));
    }

    @Override // b00.AbstractC0532q
    /* renamed from: A */
    public final List mo1600A(a0 a0Var) throws FileNotFoundException {
        a0 a0Var2 = f5309e;
        a0Var2.getClass();
        String strM1613r = AbstractC0836c.m2256b(a0Var2, a0Var, true).m1518c(a0Var2).f3586a.m1613r();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        boolean z6 = false;
        for (C6361k c6361k : (List) this.f5312d.getValue()) {
            AbstractC0532q abstractC0532q = (AbstractC0532q) c6361k.f30755a;
            a0 a0Var3 = (a0) c6361k.f30756b;
            try {
                List listMo1600A = abstractC0532q.mo1600A(a0Var3.m1519d(strM1613r));
                ArrayList arrayList = new ArrayList();
                for (Object obj : listMo1600A) {
                    if (C0689a.m1982j((a0) obj)) {
                        arrayList.add(obj);
                    }
                }
                ArrayList arrayList2 = new ArrayList(AbstractC6664n.m12768r(arrayList, 10));
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj2 = arrayList.get(i10);
                    i10++;
                    a0 a0Var4 = (a0) obj2;
                    AbstractC4154l.m8923f(a0Var4, "<this>");
                    arrayList2.add(a0Var2.m1519d(AbstractC5185w.m10135q(AbstractC5178p.m10107R(a0Var4.f3586a.m1613r(), a0Var3.f3586a.m1613r()), '\\', '/')));
                }
                AbstractC6663m.m12765x(linkedHashSet, arrayList2);
                z6 = true;
            } catch (IOException unused) {
            }
        }
        if (z6) {
            return AbstractC6663m.c0(linkedHashSet);
        }
        throw new FileNotFoundException("file not found: " + a0Var);
    }

    @Override // b00.AbstractC0532q
    /* renamed from: J */
    public final C0531p mo1601J(a0 path) {
        AbstractC4154l.m8923f(path, "path");
        if (!C0689a.m1982j(path)) {
            return null;
        }
        a0 a0Var = f5309e;
        a0Var.getClass();
        String strM1613r = AbstractC0836c.m2256b(a0Var, path, true).m1518c(a0Var).f3586a.m1613r();
        for (C6361k c6361k : (List) this.f5312d.getValue()) {
            C0531p c0531pMo1601J = ((AbstractC0532q) c6361k.f30755a).mo1601J(((a0) c6361k.f30756b).m1519d(strM1613r));
            if (c0531pMo1601J != null) {
                return c0531pMo1601J;
            }
        }
        return null;
    }

    @Override // b00.AbstractC0532q
    /* renamed from: P */
    public final C0538w mo1602P(a0 a0Var) throws FileNotFoundException {
        if (!C0689a.m1982j(a0Var)) {
            throw new FileNotFoundException("file not found: " + a0Var);
        }
        a0 a0Var2 = f5309e;
        a0Var2.getClass();
        String strM1613r = AbstractC0836c.m2256b(a0Var2, a0Var, true).m1518c(a0Var2).f3586a.m1613r();
        for (C6361k c6361k : (List) this.f5312d.getValue()) {
            try {
                return ((AbstractC0532q) c6361k.f30755a).mo1602P(((a0) c6361k.f30756b).m1519d(strM1613r));
            } catch (FileNotFoundException unused) {
            }
        }
        throw new FileNotFoundException("file not found: " + a0Var);
    }

    @Override // b00.AbstractC0532q
    /* renamed from: R */
    public final h0 mo1603R(a0 file) throws IOException {
        AbstractC4154l.m8923f(file, "file");
        throw new IOException(this + " is read-only");
    }

    @Override // b00.AbstractC0532q
    /* renamed from: S */
    public final i0 mo1604S(a0 file) throws IOException {
        AbstractC4154l.m8923f(file, "file");
        if (!C0689a.m1982j(file)) {
            throw new FileNotFoundException("file not found: " + file);
        }
        a0 a0Var = f5309e;
        a0Var.getClass();
        URL resource = this.f5310b.getResource(AbstractC0836c.m2256b(a0Var, file, false).m1518c(a0Var).f3586a.m1613r());
        if (resource == null) {
            throw new FileNotFoundException("file not found: " + file);
        }
        URLConnection uRLConnectionOpenConnection = resource.openConnection();
        if (uRLConnectionOpenConnection instanceof JarURLConnection) {
            ((JarURLConnection) uRLConnectionOpenConnection).setUseCaches(false);
        }
        InputStream inputStream = uRLConnectionOpenConnection.getInputStream();
        AbstractC4154l.m8922e(inputStream, "getInputStream(...)");
        return AbstractC0517b.m1529h(inputStream);
    }

    @Override // b00.AbstractC0532q
    /* renamed from: h */
    public final h0 mo1605h(a0 file) throws IOException {
        AbstractC4154l.m8923f(file, "file");
        throw new IOException(this + " is read-only");
    }

    @Override // b00.AbstractC0532q
    /* renamed from: j */
    public final void mo1606j(a0 source, a0 target) throws IOException {
        AbstractC4154l.m8923f(source, "source");
        AbstractC4154l.m8923f(target, "target");
        throw new IOException(this + " is read-only");
    }

    @Override // b00.AbstractC0532q
    /* renamed from: n */
    public final void mo1607n(a0 dir) throws IOException {
        AbstractC4154l.m8923f(dir, "dir");
        throw new IOException(this + " is read-only");
    }

    @Override // b00.AbstractC0532q
    /* renamed from: u */
    public final void mo1608u(a0 path) throws IOException {
        AbstractC4154l.m8923f(path, "path");
        throw new IOException(this + " is read-only");
    }
}
