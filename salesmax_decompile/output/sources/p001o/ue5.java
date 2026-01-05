package p001o;

import androidx.work.PeriodicWorkRequest;
import java.io.FileNotFoundException;
import java.io.IOException;
import p001o.sga;
import p001o.xga;

/* loaded from: classes2.dex */
public class ue5 implements sga {

    /* renamed from: a */
    public final int f48765a;

    public ue5() {
        this(-1);
    }

    @Override // p001o.sga
    /* renamed from: a */
    public int mo48310a(int i) {
        int i2 = this.f48765a;
        return i2 == -1 ? i == 7 ? 6 : 3 : i2;
    }

    @Override // p001o.sga
    /* renamed from: b */
    public sga.C16837b mo48311b(sga.C16836a c16836a, sga.C16838c c16838c) {
        if (!m51398e(c16838c.f45397c)) {
            return null;
        }
        if (c16836a.m48314a(1)) {
            return new sga.C16837b(1, PeriodicWorkRequest.MIN_PERIODIC_FLEX_MILLIS);
        }
        if (c16836a.m48314a(2)) {
            return new sga.C16837b(2, 60000L);
        }
        return null;
    }

    @Override // p001o.sga
    /* renamed from: d */
    public long mo48313d(sga.C16838c c16838c) {
        IOException iOException = c16838c.f45397c;
        if ((iOException instanceof byc) || (iOException instanceof FileNotFoundException) || (iOException instanceof g28) || (iOException instanceof xga.C18156h) || fz4.m27773a(iOException)) {
            return -9223372036854775807L;
        }
        return Math.min((c16838c.f45398d - 1) * 1000, 5000);
    }

    /* renamed from: e */
    public boolean m51398e(IOException iOException) {
        if (!(iOException instanceof j28)) {
            return false;
        }
        int i = ((j28) iOException).f29628d;
        return i == 403 || i == 404 || i == 410 || i == 416 || i == 500 || i == 503;
    }

    public ue5(int i) {
        this.f48765a = i;
    }
}
