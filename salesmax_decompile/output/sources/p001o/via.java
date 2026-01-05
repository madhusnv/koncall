package p001o;

/* loaded from: classes6.dex */
public class via extends RuntimeException {

    /* renamed from: a */
    public Throwable f50418a;

    public via(Throwable th) {
        this(th == null ? null : th.toString(), th);
    }

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.f50418a;
    }

    public via(String str, Throwable th) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(str);
        stringBuffer.append(" (Caused by ");
        stringBuffer.append(th);
        stringBuffer.append(")");
        super(stringBuffer.toString());
        this.f50418a = th;
    }
}
