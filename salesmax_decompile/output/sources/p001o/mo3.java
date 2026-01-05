package p001o;

import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

/* loaded from: classes6.dex */
public final class mo3 extends RuntimeException {

    /* renamed from: a */
    public final List f35769a;

    /* renamed from: b */
    public final String f35770b;

    /* renamed from: c */
    public Throwable f35771c;

    /* renamed from: o.mo3$a */
    public static final class C15371a extends RuntimeException {
        public C15371a(String str) {
            super(str);
        }

        @Override // java.lang.Throwable
        public synchronized Throwable fillInStackTrace() {
            return this;
        }
    }

    /* renamed from: o.mo3$b */
    public static abstract class AbstractC15372b {
        /* renamed from: a */
        public abstract void mo39446a(Object obj);
    }

    /* renamed from: o.mo3$c */
    public static final class C15373c extends AbstractC15372b {

        /* renamed from: a */
        public final PrintStream f35772a;

        public C15373c(PrintStream printStream) {
            this.f35772a = printStream;
        }

        @Override // p001o.mo3.AbstractC15372b
        /* renamed from: a */
        public void mo39446a(Object obj) {
            this.f35772a.println(obj);
        }
    }

    /* renamed from: o.mo3$d */
    public static final class C15374d extends AbstractC15372b {

        /* renamed from: a */
        public final PrintWriter f35773a;

        public C15374d(PrintWriter printWriter) {
            this.f35773a = printWriter;
        }

        @Override // p001o.mo3.AbstractC15372b
        /* renamed from: a */
        public void mo39446a(Object obj) {
            this.f35773a.println(obj);
        }
    }

    public mo3(Throwable... thArr) {
        this(thArr == null ? Collections.singletonList(new NullPointerException("exceptions was null")) : Arrays.asList(thArr));
    }

    /* renamed from: a */
    public final void m39443a(StringBuilder sb, Throwable th, String str) {
        sb.append(str);
        sb.append(th);
        sb.append('\n');
        for (StackTraceElement stackTraceElement : th.getStackTrace()) {
            sb.append("\t\tat ");
            sb.append(stackTraceElement);
            sb.append('\n');
        }
        if (th.getCause() != null) {
            sb.append("\tCaused by: ");
            m39443a(sb, th.getCause(), "");
        }
    }

    /* renamed from: b */
    public List m39444b() {
        return this.f35769a;
    }

    /* renamed from: c */
    public final void m39445c(AbstractC15372b abstractC15372b) {
        StringBuilder sb = new StringBuilder(128);
        sb.append(this);
        sb.append('\n');
        for (StackTraceElement stackTraceElement : getStackTrace()) {
            sb.append("\tat ");
            sb.append(stackTraceElement);
            sb.append('\n');
        }
        int i = 1;
        for (Throwable th : this.f35769a) {
            sb.append("  ComposedException ");
            sb.append(i);
            sb.append(" :\n");
            m39443a(sb, th, "\t");
            i++;
        }
        abstractC15372b.mo39446a(sb.toString());
    }

    @Override // java.lang.Throwable
    public synchronized Throwable getCause() {
        int i;
        if (this.f35771c == null) {
            String property = System.getProperty("line.separator");
            if (this.f35769a.size() > 1) {
                IdentityHashMap identityHashMap = new IdentityHashMap();
                StringBuilder sb = new StringBuilder();
                sb.append("Multiple exceptions (");
                sb.append(this.f35769a.size());
                sb.append(")");
                sb.append(property);
                for (Throwable cause : this.f35769a) {
                    int i2 = 0;
                    while (true) {
                        if (cause != null) {
                            for (int i3 = 0; i3 < i2; i3++) {
                                sb.append("  ");
                            }
                            sb.append("|-- ");
                            sb.append(cause.getClass().getCanonicalName());
                            sb.append(": ");
                            String message = cause.getMessage();
                            if (message == null || !message.contains(property)) {
                                sb.append(message);
                                sb.append(property);
                            } else {
                                sb.append(property);
                                for (String str : message.split(property)) {
                                    for (int i4 = 0; i4 < i2 + 2; i4++) {
                                        sb.append("  ");
                                    }
                                    sb.append(str);
                                    sb.append(property);
                                }
                            }
                            int i5 = 0;
                            while (true) {
                                i = i2 + 2;
                                if (i5 >= i) {
                                    break;
                                }
                                sb.append("  ");
                                i5++;
                            }
                            StackTraceElement[] stackTrace = cause.getStackTrace();
                            if (stackTrace.length > 0) {
                                sb.append("at ");
                                sb.append(stackTrace[0]);
                                sb.append(property);
                            }
                            if (identityHashMap.containsKey(cause)) {
                                Throwable cause2 = cause.getCause();
                                if (cause2 != null) {
                                    for (int i6 = 0; i6 < i; i6++) {
                                        sb.append("  ");
                                    }
                                    sb.append("|-- ");
                                    sb.append("(cause not expanded again) ");
                                    sb.append(cause2.getClass().getCanonicalName());
                                    sb.append(": ");
                                    sb.append(cause2.getMessage());
                                    sb.append(property);
                                }
                            } else {
                                identityHashMap.put(cause, Boolean.TRUE);
                                cause = cause.getCause();
                                i2++;
                            }
                        }
                    }
                }
                this.f35771c = new C15371a(sb.toString().trim());
            } else {
                this.f35771c = (Throwable) this.f35769a.get(0);
            }
        }
        return this.f35771c;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return this.f35770b;
    }

    @Override // java.lang.Throwable
    public void printStackTrace() {
        printStackTrace(System.err);
    }

    @Override // java.lang.Throwable
    public void printStackTrace(PrintStream printStream) {
        m39445c(new C15373c(printStream));
    }

    @Override // java.lang.Throwable
    public void printStackTrace(PrintWriter printWriter) {
        m39445c(new C15374d(printWriter));
    }

    public mo3(Iterable iterable) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        if (iterable != null) {
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                Throwable th = (Throwable) it.next();
                if (th instanceof mo3) {
                    linkedHashSet.addAll(((mo3) th).m39444b());
                } else if (th != null) {
                    linkedHashSet.add(th);
                } else {
                    linkedHashSet.add(new NullPointerException("Throwable was null!"));
                }
            }
        } else {
            linkedHashSet.add(new NullPointerException("errors was null"));
        }
        if (!linkedHashSet.isEmpty()) {
            List listUnmodifiableList = Collections.unmodifiableList(new ArrayList(linkedHashSet));
            this.f35769a = listUnmodifiableList;
            this.f35770b = listUnmodifiableList.size() + " exceptions occurred. ";
            return;
        }
        throw new IllegalArgumentException("errors is empty");
    }
}
