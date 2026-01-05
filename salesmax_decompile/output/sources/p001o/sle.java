package p001o;

import com.google.android.gms.cast.MediaError;
import java.io.PrintStream;

/* loaded from: classes6.dex */
public abstract class sle {

    /* renamed from: a */
    public static final String[] f45617a = {"System.out", "stdout", "sysout"};

    /* renamed from: b */
    public static final EnumC16869b f45618b = m48484e();

    /* renamed from: c */
    public static final EnumC16868a f45619c = m48486g();

    /* renamed from: o.sle$a */
    public enum EnumC16868a {
        DEBUG(0),
        INFO(1),
        WARN(2),
        ERROR(3);

        int levelInt;

        EnumC16868a(int i) {
            this.levelInt = i;
        }

        private int getLevelInt() {
            return this.levelInt;
        }
    }

    /* renamed from: o.sle$b */
    public enum EnumC16869b {
        Stderr,
        Stdout
    }

    /* renamed from: a */
    public static void m48480a(String str) {
        if (m48487h(EnumC16868a.DEBUG)) {
            m48483d().println("SLF4J(D): " + str);
        }
    }

    /* renamed from: b */
    public static final void m48481b(String str) {
        m48483d().println("SLF4J(E): " + str);
    }

    /* renamed from: c */
    public static final void m48482c(String str, Throwable th) {
        m48483d().println("SLF4J(E): " + str);
        m48483d().println("SLF4J(E): Reported exception:");
        th.printStackTrace(m48483d());
    }

    /* renamed from: d */
    public static PrintStream m48483d() {
        return f45618b.ordinal() != 1 ? System.err : System.out;
    }

    /* renamed from: e */
    public static EnumC16869b m48484e() {
        String property = System.getProperty("slf4j.internal.report.stream");
        if (property == null || property.isEmpty()) {
            return EnumC16869b.Stderr;
        }
        for (String str : f45617a) {
            if (str.equalsIgnoreCase(property)) {
                return EnumC16869b.Stdout;
            }
        }
        return EnumC16869b.Stderr;
    }

    /* renamed from: f */
    public static void m48485f(String str) {
        if (m48487h(EnumC16868a.INFO)) {
            m48483d().println("SLF4J(I): " + str);
        }
    }

    /* renamed from: g */
    public static EnumC16868a m48486g() {
        String property = System.getProperty("slf4j.internal.verbosity");
        return (property == null || property.isEmpty()) ? EnumC16868a.INFO : property.equalsIgnoreCase("DEBUG") ? EnumC16868a.DEBUG : property.equalsIgnoreCase(MediaError.ERROR_TYPE_ERROR) ? EnumC16868a.ERROR : property.equalsIgnoreCase("WARN") ? EnumC16868a.WARN : EnumC16868a.INFO;
    }

    /* renamed from: h */
    public static boolean m48487h(EnumC16868a enumC16868a) {
        return enumC16868a.levelInt >= f45619c.levelInt;
    }

    /* renamed from: i */
    public static final void m48488i(String str) {
        if (m48487h(EnumC16868a.WARN)) {
            m48483d().println("SLF4J(W): " + str);
        }
    }
}
