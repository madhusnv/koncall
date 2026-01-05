package p001o;

import com.amplifyframework.storage.s3.transfer.TransferTable;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.JarURLConnection;
import java.net.URI;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.List;
import p001o.wzc;

/* loaded from: classes6.dex */
public final class noe extends pz6 {

    /* renamed from: h */
    public static final C15622a f37109h = new C15622a(null);

    /* renamed from: i */
    public static final wzc f37110i = wzc.C18014a.m55482d(wzc.f52936b, "/", false, 1, null);

    /* renamed from: e */
    public final ClassLoader f37111e;

    /* renamed from: f */
    public final pz6 f37112f;

    /* renamed from: g */
    public final gi9 f37113g;

    /* renamed from: o.noe$a */
    public static final class C15622a {
        public C15622a() {
        }

        public /* synthetic */ C15622a(id5 id5Var) {
            this();
        }

        /* renamed from: b */
        public final boolean m40883b(wzc wzcVar) {
            return !e9g.m24604v(wzcVar.m55473h(), ".class", true);
        }
    }

    /* renamed from: o.noe$b */
    public static final class C15623b extends kf9 implements uk7 {
        public C15623b() {
            super(0);
        }

        @Override // p001o.uk7
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List invoke() {
            noe noeVar = noe.this;
            return noeVar.m40878h(noeVar.f37111e);
        }
    }

    /* renamed from: o.noe$c */
    public static final class C15624c extends kf9 implements xk7 {

        /* renamed from: a */
        public static final C15624c f37115a = new C15624c();

        public C15624c() {
            super(1);
        }

        @Override // p001o.xk7
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(dfj dfjVar) {
            sq8.m48649h(dfjVar, "entry");
            return Boolean.valueOf(noe.f37109h.m40883b(dfjVar.m22990b()));
        }
    }

    public /* synthetic */ noe(ClassLoader classLoader, boolean z, pz6 pz6Var, int i, id5 id5Var) {
        this(classLoader, z, (i & 4) != 0 ? pz6.f40761b : pz6Var);
    }

    @Override // p001o.pz6
    /* renamed from: a */
    public rw6 mo24957a(wzc wzcVar) throws FileNotFoundException {
        sq8.m48649h(wzcVar, TransferTable.COLUMN_FILE);
        if (!f37109h.m40883b(wzcVar)) {
            throw new FileNotFoundException("file not found: " + wzcVar);
        }
        String strM40881k = m40881k(wzcVar);
        for (hwc hwcVar : m40877g()) {
            try {
                return ((pz6) hwcVar.m31227a()).mo24957a(((wzc) hwcVar.m31228b()).m55477o(strM40881k));
            } catch (FileNotFoundException unused) {
            }
        }
        throw new FileNotFoundException("file not found: " + wzcVar);
    }

    @Override // p001o.pz6
    /* renamed from: b */
    public lzf mo24958b(wzc wzcVar) throws IOException {
        sq8.m48649h(wzcVar, TransferTable.COLUMN_FILE);
        if (!f37109h.m40883b(wzcVar)) {
            throw new FileNotFoundException("file not found: " + wzcVar);
        }
        wzc wzcVar2 = f37110i;
        URL resource = this.f37111e.getResource(wzc.m55467s(wzcVar2, wzcVar, false, 2, null).m55476n(wzcVar2).toString());
        if (resource == null) {
            throw new FileNotFoundException("file not found: " + wzcVar);
        }
        URLConnection uRLConnectionOpenConnection = resource.openConnection();
        if (uRLConnectionOpenConnection instanceof JarURLConnection) {
            ((JarURLConnection) uRLConnectionOpenConnection).setUseCaches(false);
        }
        InputStream inputStream = uRLConnectionOpenConnection.getInputStream();
        sq8.m48648g(inputStream, "getInputStream(...)");
        return uac.m51316i(inputStream);
    }

    /* renamed from: f */
    public final wzc m40876f(wzc wzcVar) {
        return f37110i.m55478r(wzcVar, true);
    }

    /* renamed from: g */
    public final List m40877g() {
        return (List) this.f37113g.getValue();
    }

    /* renamed from: h */
    public final List m40878h(ClassLoader classLoader) throws IOException {
        Enumeration<URL> resources = classLoader.getResources("");
        sq8.m48648g(resources, "getResources(...)");
        ArrayList<URL> list = Collections.list(resources);
        sq8.m48648g(list, "list(...)");
        ArrayList arrayList = new ArrayList();
        for (URL url : list) {
            sq8.m48646e(url);
            hwc hwcVarM40879i = m40879i(url);
            if (hwcVarM40879i != null) {
                arrayList.add(hwcVarM40879i);
            }
        }
        Enumeration<URL> resources2 = classLoader.getResources("META-INF/MANIFEST.MF");
        sq8.m48648g(resources2, "getResources(...)");
        ArrayList<URL> list2 = Collections.list(resources2);
        sq8.m48648g(list2, "list(...)");
        ArrayList arrayList2 = new ArrayList();
        for (URL url2 : list2) {
            sq8.m48646e(url2);
            hwc hwcVarM40880j = m40880j(url2);
            if (hwcVarM40880j != null) {
                arrayList2.add(hwcVarM40880j);
            }
        }
        return kh3.x0(arrayList, arrayList2);
    }

    /* renamed from: i */
    public final hwc m40879i(URL url) {
        if (sq8.m48644c(url.getProtocol(), TransferTable.COLUMN_FILE)) {
            return vyh.m53620a(this.f37112f, wzc.C18014a.m55481c(wzc.f52936b, new File(url.toURI()), false, 1, null));
        }
        return null;
    }

    /* renamed from: j */
    public final hwc m40880j(URL url) {
        int iH0;
        String string = url.toString();
        sq8.m48648g(string, "toString(...)");
        if (!e9g.m24597K(string, "jar:file:", false, 2, null) || (iH0 = f9g.h0(string, "!", 0, false, 6, null)) == -1) {
            return null;
        }
        wzc.C18014a c18014a = wzc.f52936b;
        String strSubstring = string.substring(4, iH0);
        sq8.m48648g(strSubstring, "substring(...)");
        return vyh.m53620a(ffj.m26585d(wzc.C18014a.m55481c(c18014a, new File(URI.create(strSubstring)), false, 1, null), this.f37112f, C15624c.f37115a), f37110i);
    }

    /* renamed from: k */
    public final String m40881k(wzc wzcVar) {
        return m40876f(wzcVar).m55476n(f37110i).toString();
    }

    public noe(ClassLoader classLoader, boolean z, pz6 pz6Var) {
        sq8.m48649h(classLoader, "classLoader");
        sq8.m48649h(pz6Var, "systemFileSystem");
        this.f37111e = classLoader;
        this.f37112f = pz6Var;
        this.f37113g = si9.m48360a(new C15623b());
        if (z) {
            m40877g().size();
        }
    }
}
