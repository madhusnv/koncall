package p001o;

import java.io.IOException;

/* loaded from: classes5.dex */
public abstract class ha9 extends IOException {

    /* renamed from: a */
    public s99 f26479a;

    public ha9(String str, s99 s99Var, Throwable th) {
        super(str);
        if (th != null) {
            initCause(th);
        }
        this.f26479a = s99Var;
    }

    /* renamed from: a */
    public s99 m30037a() {
        return this.f26479a;
    }

    /* renamed from: b */
    public String m30038b() {
        return null;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        String message = super.getMessage();
        if (message == null) {
            message = "N/A";
        }
        s99 s99VarM30037a = m30037a();
        String strM30038b = m30038b();
        if (s99VarM30037a == null && strM30038b == null) {
            return message;
        }
        StringBuilder sb = new StringBuilder(100);
        sb.append(message);
        if (strM30038b != null) {
            sb.append(strM30038b);
        }
        if (s99VarM30037a != null) {
            sb.append('\n');
            sb.append(" at ");
            sb.append(s99VarM30037a.toString());
        }
        return sb.toString();
    }

    @Override // java.lang.Throwable
    public String toString() {
        return getClass().getName() + ": " + getMessage();
    }

    public ha9(String str, s99 s99Var) {
        this(str, s99Var, null);
    }
}
