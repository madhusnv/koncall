package j$.time;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* renamed from: j$.time.a */
/* loaded from: classes2.dex */
public final class C3399a extends AbstractC3400b implements Serializable {

    /* renamed from: b */
    public static final C3399a f18047b;
    private static final long serialVersionUID = 6740630888130243051L;

    /* renamed from: a */
    public final ZoneId f18048a;

    public C3399a(ZoneId zoneId) {
        this.f18048a = zoneId;
    }

    static {
        System.currentTimeMillis();
        f18047b = new C3399a(ZoneOffset.UTC);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C3399a) {
            return this.f18048a.equals(((C3399a) obj).f18048a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f18048a.hashCode() + 1;
    }

    public final String toString() {
        return "SystemClock[" + this.f18048a + "]";
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
    }
}
