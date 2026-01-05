package p001o;

import java.io.IOException;

/* loaded from: classes2.dex */
public class fz4 extends IOException {

    /* renamed from: a */
    public final int f24270a;

    public fz4(int i) {
        this.f24270a = i;
    }

    /* renamed from: a */
    public static boolean m27773a(IOException iOException) {
        for (IOException cause = iOException; cause != null; cause = cause.getCause()) {
            if ((cause instanceof fz4) && ((fz4) cause).f24270a == 2008) {
                return true;
            }
        }
        return false;
    }

    public fz4(Throwable th, int i) {
        super(th);
        this.f24270a = i;
    }

    public fz4(String str, int i) {
        super(str);
        this.f24270a = i;
    }

    public fz4(String str, Throwable th, int i) {
        super(str, th);
        this.f24270a = i;
    }
}
