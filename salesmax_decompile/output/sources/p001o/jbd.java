package p001o;

import android.media.metrics.LogSessionId;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class jbd {

    /* renamed from: d */
    public static final jbd f30095d;

    /* renamed from: a */
    public final String f30096a;

    /* renamed from: b */
    public final C14486a f30097b;

    /* renamed from: c */
    public final Object f30098c;

    /* renamed from: o.jbd$a */
    public static final class C14486a {

        /* renamed from: b */
        public static final C14486a f30099b = new C14486a(LogSessionId.LOG_SESSION_ID_NONE);

        /* renamed from: a */
        public final LogSessionId f30100a;

        public C14486a(LogSessionId logSessionId) {
            this.f30100a = logSessionId;
        }
    }

    static {
        f30095d = sqi.f45790a < 31 ? new jbd("") : new jbd(C14486a.f30099b, "");
    }

    public jbd(String str) {
        op0.m42517g(sqi.f45790a < 31);
        this.f30096a = str;
        this.f30097b = null;
        this.f30098c = new Object();
    }

    /* renamed from: a */
    public LogSessionId m33479a() {
        return ((C14486a) op0.m42515e(this.f30097b)).f30100a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jbd)) {
            return false;
        }
        jbd jbdVar = (jbd) obj;
        return Objects.equals(this.f30096a, jbdVar.f30096a) && Objects.equals(this.f30097b, jbdVar.f30097b) && Objects.equals(this.f30098c, jbdVar.f30098c);
    }

    public int hashCode() {
        return Objects.hash(this.f30096a, this.f30097b, this.f30098c);
    }

    public jbd(LogSessionId logSessionId, String str) {
        this(new C14486a(logSessionId), str);
    }

    public jbd(C14486a c14486a, String str) {
        this.f30097b = c14486a;
        this.f30096a = str;
        this.f30098c = new Object();
    }
}
