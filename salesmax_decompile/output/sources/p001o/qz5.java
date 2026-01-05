package p001o;

import android.media.DeniedByServerException;
import android.media.MediaDrm;
import android.media.MediaDrmResetException;
import android.media.NotProvisionedException;
import p001o.qd5;

/* loaded from: classes2.dex */
public abstract class qz5 {

    /* renamed from: o.qz5$a */
    public static final class C16492a {
        /* renamed from: a */
        public static boolean m45989a(Throwable th) {
            return th instanceof MediaDrm.MediaDrmStateException;
        }

        /* renamed from: b */
        public static int m45990b(Throwable th) {
            return sqi.m48720Y(sqi.m48721Z(((MediaDrm.MediaDrmStateException) th).getDiagnosticInfo()));
        }
    }

    /* renamed from: o.qz5$b */
    public static final class C16493b {
        /* renamed from: a */
        public static boolean m45991a(Throwable th) {
            return th instanceof MediaDrmResetException;
        }
    }

    /* renamed from: a */
    public static int m45986a(Throwable th, int i) {
        int i2 = sqi.f45790a;
        if (i2 >= 21 && C16492a.m45989a(th)) {
            return C16492a.m45990b(th);
        }
        if (i2 >= 23 && C16493b.m45991a(th)) {
            return 6006;
        }
        if ((th instanceof NotProvisionedException) || m45987b(th)) {
            return 6002;
        }
        if (th instanceof DeniedByServerException) {
            return 6007;
        }
        if (th instanceof i5i) {
            return 6001;
        }
        if (th instanceof qd5.C16343e) {
            return 6003;
        }
        if (th instanceof wd9) {
            return 6008;
        }
        if (i == 1) {
            return 6006;
        }
        if (i == 2) {
            return 6004;
        }
        if (i == 3) {
            return 6002;
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: b */
    public static boolean m45987b(Throwable th) {
        return sqi.f45790a == 34 && (th instanceof NoSuchMethodError) && th.getMessage() != null && th.getMessage().contains("Landroid/media/NotProvisionedException;.<init>(");
    }

    /* renamed from: c */
    public static boolean m45988c(Throwable th) {
        return sqi.f45790a == 34 && (th instanceof NoSuchMethodError) && th.getMessage() != null && th.getMessage().contains("Landroid/media/ResourceBusyException;.<init>(");
    }
}
