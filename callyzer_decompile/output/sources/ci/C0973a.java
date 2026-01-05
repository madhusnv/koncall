package ci;

import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import ii.C3269k;
import java.security.GeneralSecurityException;
import java.security.SecureRandom;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Random;
import javax.crypto.Cipher;
import k0.ScheduledExecutorServiceC3894d;
import kz.AbstractC4299e;
import pg.o7;
import pg.t8;
import pg.x5;
import w3.u0;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ci.a */
/* loaded from: classes.dex */
public final class C0973a extends ThreadLocal {

    /* renamed from: a */
    public final /* synthetic */ int f5786a;

    public /* synthetic */ C0973a(int i10) {
        this.f5786a = i10;
    }

    @Override // java.lang.ThreadLocal
    public final Object initialValue() {
        switch (this.f5786a) {
            case 0:
                try {
                    return (Cipher) C3269k.f17466e.m7622a("AES/GCM-SIV/NoPadding");
                } catch (GeneralSecurityException e2) {
                    throw new IllegalStateException(e2);
                }
            case 1:
                return 0L;
            case 2:
                try {
                    return (Cipher) C3269k.f17466e.m7622a("AES/CTR/NoPadding");
                } catch (GeneralSecurityException e10) {
                    throw new IllegalStateException(e10);
                }
            case 3:
                try {
                    return (Cipher) C3269k.f17466e.m7622a("AES/ECB/NOPADDING");
                } catch (GeneralSecurityException e11) {
                    throw new IllegalStateException(e11);
                }
            case 4:
                try {
                    return (Cipher) C3269k.f17466e.m7622a("AES/CTR/NOPADDING");
                } catch (GeneralSecurityException e12) {
                    throw new IllegalStateException(e12);
                }
            case 5:
                try {
                    return (Cipher) C3269k.f17466e.m7622a("AES/GCM/NoPadding");
                } catch (GeneralSecurityException e13) {
                    throw new IllegalStateException(e13);
                }
            case 6:
                SecureRandom secureRandom = new SecureRandom();
                secureRandom.nextLong();
                return secureRandom;
            case 7:
                return new Random();
            case 8:
                if (Looper.myLooper() == Looper.getMainLooper()) {
                    return t8.m11875d();
                }
                if (Looper.myLooper() != null) {
                    return new ScheduledExecutorServiceC3894d(new Handler(Looper.myLooper()));
                }
                return null;
            case 9:
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss 'GMT'", Locale.US);
                simpleDateFormat.setLenient(false);
                simpleDateFormat.setTimeZone(AbstractC4299e.f21707a);
                return simpleDateFormat;
            case 10:
                return Boolean.FALSE;
            default:
                Choreographer choreographer = Choreographer.getInstance();
                Looper looperMyLooper = Looper.myLooper();
                if (looperMyLooper == null) {
                    throw new IllegalStateException("no Looper on this thread");
                }
                u0 u0Var = new u0(choreographer, o7.m11807b(looperMyLooper));
                return x5.m11928d(u0Var, u0Var.f37979m);
        }
    }
}
