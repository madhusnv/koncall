package org.slf4j.helpers;

import java.io.PrintStream;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: org.slf4j.helpers.f */
/* loaded from: classes3.dex */
public abstract class AbstractC5717f {

    /* renamed from: a */
    public static final EnumC5716e f28190a;

    /* renamed from: b */
    public static final EnumC5715d f28191b;

    static {
        EnumC5716e enumC5716e;
        String[] strArr = {"System.out", "stdout", "sysout"};
        String property = System.getProperty("slf4j.internal.report.stream");
        if (property != null && !property.isEmpty()) {
            int i10 = 0;
            while (true) {
                if (i10 >= 3) {
                    enumC5716e = EnumC5716e.Stderr;
                    break;
                } else {
                    if (strArr[i10].equalsIgnoreCase(property)) {
                        enumC5716e = EnumC5716e.Stdout;
                        break;
                    }
                    i10++;
                }
            }
        } else {
            enumC5716e = EnumC5716e.Stderr;
        }
        f28190a = enumC5716e;
        String property2 = System.getProperty("slf4j.internal.verbosity");
        f28191b = (property2 == null || property2.isEmpty()) ? EnumC5715d.INFO : property2.equalsIgnoreCase("DEBUG") ? EnumC5715d.DEBUG : property2.equalsIgnoreCase("ERROR") ? EnumC5715d.ERROR : property2.equalsIgnoreCase("WARN") ? EnumC5715d.WARN : EnumC5715d.INFO;
    }

    /* renamed from: a */
    public static final void m11269a(String str) {
        m11271c().println("SLF4J(E): " + str);
    }

    /* renamed from: b */
    public static final void m11270b(String str, Throwable th2) {
        m11271c().println("SLF4J(E): " + str);
        m11271c().println("SLF4J(E): Reported exception:");
        th2.printStackTrace(m11271c());
    }

    /* renamed from: c */
    public static PrintStream m11271c() {
        return f28190a.ordinal() != 1 ? System.err : System.out;
    }

    /* renamed from: d */
    public static void m11272d(String str) {
        if (m11273e(EnumC5715d.INFO)) {
            m11271c().println("SLF4J(I): " + str);
        }
    }

    /* renamed from: e */
    public static boolean m11273e(EnumC5715d enumC5715d) {
        return enumC5715d.levelInt >= f28191b.levelInt;
    }

    /* renamed from: f */
    public static final void m11274f(String str) {
        if (m11273e(EnumC5715d.WARN)) {
            m11271c().println("SLF4J(W): " + str);
        }
    }
}
