package p001o;

import p001o.wzc;

/* loaded from: classes6.dex */
public abstract class pz6 {

    /* renamed from: a */
    public static final C16216a f40760a = new C16216a(null);

    /* renamed from: b */
    public static final pz6 f40761b;

    /* renamed from: c */
    public static final wzc f40762c;

    /* renamed from: d */
    public static final pz6 f40763d;

    /* renamed from: o.pz6$a */
    public static final class C16216a {
        public C16216a() {
        }

        public /* synthetic */ C16216a(id5 id5Var) {
            this();
        }
    }

    static {
        pz6 jb9Var;
        try {
            Class.forName("java.nio.file.Files");
            jb9Var = new wyb();
        } catch (ClassNotFoundException unused) {
            jb9Var = new jb9();
        }
        f40761b = jb9Var;
        wzc.C18014a c18014a = wzc.f52936b;
        String property = System.getProperty("java.io.tmpdir");
        sq8.m48648g(property, "getProperty(...)");
        f40762c = wzc.C18014a.m55482d(c18014a, property, false, 1, null);
        ClassLoader classLoader = noe.class.getClassLoader();
        sq8.m48648g(classLoader, "getClassLoader(...)");
        f40763d = new noe(classLoader, false, null, 4, null);
    }

    /* renamed from: a */
    public abstract rw6 mo24957a(wzc wzcVar);

    /* renamed from: b */
    public abstract lzf mo24958b(wzc wzcVar);
}
