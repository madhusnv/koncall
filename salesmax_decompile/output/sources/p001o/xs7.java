package p001o;

import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes5.dex */
public final class xs7 extends Exception {

    /* renamed from: g */
    public static final StackTraceElement[] f54227g = new StackTraceElement[0];

    /* renamed from: a */
    public final List f54228a;

    /* renamed from: b */
    public ic9 f54229b;

    /* renamed from: c */
    public ez4 f54230c;

    /* renamed from: d */
    public Class f54231d;

    /* renamed from: e */
    public String f54232e;

    /* renamed from: f */
    public Exception f54233f;

    public xs7(String str) {
        this(str, Collections.emptyList());
    }

    /* renamed from: b */
    public static void m56761b(List list, Appendable appendable) {
        try {
            m56762c(list, appendable);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: c */
    public static void m56762c(List list, Appendable appendable) throws IOException {
        int size = list.size();
        int i = 0;
        while (i < size) {
            int i2 = i + 1;
            appendable.append("Cause (").append(String.valueOf(i2)).append(" of ").append(String.valueOf(size)).append("): ");
            Throwable th = (Throwable) list.get(i);
            if (th instanceof xs7) {
                ((xs7) th).m56768h(appendable);
            } else {
                m56763d(th, appendable);
            }
            i = i2;
        }
    }

    /* renamed from: d */
    public static void m56763d(Throwable th, Appendable appendable) throws IOException {
        try {
            appendable.append(th.getClass().toString()).append(": ").append(th.getMessage()).append('\n');
        } catch (IOException unused) {
            throw new RuntimeException(th);
        }
    }

    /* renamed from: a */
    public final void m56764a(Throwable th, List list) {
        if (!(th instanceof xs7)) {
            list.add(th);
            return;
        }
        Iterator it = ((xs7) th).m56765e().iterator();
        while (it.hasNext()) {
            m56764a((Throwable) it.next(), list);
        }
    }

    /* renamed from: e */
    public List m56765e() {
        return this.f54228a;
    }

    /* renamed from: f */
    public List m56766f() {
        ArrayList arrayList = new ArrayList();
        m56764a(this, arrayList);
        return arrayList;
    }

    @Override // java.lang.Throwable
    public Throwable fillInStackTrace() {
        return this;
    }

    /* renamed from: g */
    public void m56767g(String str) {
        List listM56766f = m56766f();
        int size = listM56766f.size();
        int i = 0;
        while (i < size) {
            StringBuilder sb = new StringBuilder();
            sb.append("Root cause (");
            int i2 = i + 1;
            sb.append(i2);
            sb.append(" of ");
            sb.append(size);
            sb.append(")");
            i = i2;
        }
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        StringBuilder sb = new StringBuilder(71);
        sb.append(this.f54232e);
        sb.append(this.f54231d != null ? ", " + this.f54231d : "");
        sb.append(this.f54230c != null ? ", " + this.f54230c : "");
        sb.append(this.f54229b != null ? ", " + this.f54229b : "");
        List<Throwable> listM56766f = m56766f();
        if (listM56766f.isEmpty()) {
            return sb.toString();
        }
        if (listM56766f.size() == 1) {
            sb.append("\nThere was 1 root cause:");
        } else {
            sb.append("\nThere were ");
            sb.append(listM56766f.size());
            sb.append(" root causes:");
        }
        for (Throwable th : listM56766f) {
            sb.append('\n');
            sb.append(th.getClass().getName());
            sb.append('(');
            sb.append(th.getMessage());
            sb.append(')');
        }
        sb.append("\n call GlideException#logRootCauses(String) for more detail");
        return sb.toString();
    }

    /* renamed from: h */
    public final void m56768h(Appendable appendable) throws IOException {
        m56763d(this, appendable);
        m56761b(m56765e(), new C18241a(appendable));
    }

    /* renamed from: i */
    public void m56769i(ic9 ic9Var, ez4 ez4Var) {
        m56770j(ic9Var, ez4Var, null);
    }

    /* renamed from: j */
    public void m56770j(ic9 ic9Var, ez4 ez4Var, Class cls) {
        this.f54229b = ic9Var;
        this.f54230c = ez4Var;
        this.f54231d = cls;
    }

    /* renamed from: k */
    public void m56771k(Exception exc) {
        this.f54233f = exc;
    }

    @Override // java.lang.Throwable
    public void printStackTrace() throws IOException {
        printStackTrace(System.err);
    }

    public xs7(String str, Throwable th) {
        this(str, Collections.singletonList(th));
    }

    @Override // java.lang.Throwable
    public void printStackTrace(PrintStream printStream) throws IOException {
        m56768h(printStream);
    }

    public xs7(String str, List list) {
        this.f54232e = str;
        setStackTrace(f54227g);
        this.f54228a = list;
    }

    @Override // java.lang.Throwable
    public void printStackTrace(PrintWriter printWriter) throws IOException {
        m56768h(printWriter);
    }

    /* renamed from: o.xs7$a */
    public static final class C18241a implements Appendable {

        /* renamed from: a */
        public final Appendable f54234a;

        /* renamed from: b */
        public boolean f54235b = true;

        public C18241a(Appendable appendable) {
            this.f54234a = appendable;
        }

        /* renamed from: a */
        public final CharSequence m56772a(CharSequence charSequence) {
            return charSequence == null ? "" : charSequence;
        }

        @Override // java.lang.Appendable
        public Appendable append(char c) throws IOException {
            if (this.f54235b) {
                this.f54235b = false;
                this.f54234a.append("  ");
            }
            this.f54235b = c == '\n';
            this.f54234a.append(c);
            return this;
        }

        @Override // java.lang.Appendable
        public Appendable append(CharSequence charSequence) {
            CharSequence charSequenceM56772a = m56772a(charSequence);
            return append(charSequenceM56772a, 0, charSequenceM56772a.length());
        }

        @Override // java.lang.Appendable
        public Appendable append(CharSequence charSequence, int i, int i2) throws IOException {
            CharSequence charSequenceM56772a = m56772a(charSequence);
            boolean z = false;
            if (this.f54235b) {
                this.f54235b = false;
                this.f54234a.append("  ");
            }
            if (charSequenceM56772a.length() > 0 && charSequenceM56772a.charAt(i2 - 1) == '\n') {
                z = true;
            }
            this.f54235b = z;
            this.f54234a.append(charSequenceM56772a, i, i2);
            return this;
        }
    }
}
