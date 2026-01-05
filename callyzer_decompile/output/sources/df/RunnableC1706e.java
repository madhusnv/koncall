package df;

import a1.C0005d;
import a1.c0;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.google.android.datatransport.runtime.synchronization.SynchronizationException;
import ef.C2049i;
import ef.InterfaceC2044d;
import ff.InterfaceC2282a;
import ff.InterfaceC2283b;
import io.C3328c;
import java.util.Objects;
import xe.C8357i;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: df.e */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC1706e implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C3328c f8314a;

    /* renamed from: b */
    public final /* synthetic */ C8357i f8315b;

    /* renamed from: c */
    public final /* synthetic */ int f8316c;

    /* renamed from: d */
    public final /* synthetic */ Runnable f8317d;

    public /* synthetic */ RunnableC1706e(C3328c c3328c, C8357i c8357i, int i10, Runnable runnable) {
        this.f8314a = c3328c;
        this.f8315b = c8357i;
        this.f8316c = i10;
        this.f8317d = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        final C8357i c8357i = this.f8315b;
        final int i10 = this.f8316c;
        Runnable runnable = this.f8317d;
        final C3328c c3328c = this.f8314a;
        InterfaceC2283b interfaceC2283b = (InterfaceC2283b) c3328c.f17614f;
        try {
            try {
                InterfaceC2044d interfaceC2044d = (InterfaceC2044d) c3328c.f17611c;
                Objects.requireNonNull(interfaceC2044d);
                ((C2049i) interfaceC2283b).m5776z(new c0(7, interfaceC2044d));
                NetworkInfo activeNetworkInfo = ((ConnectivityManager) ((Context) c3328c.f17609a).getSystemService("connectivity")).getActiveNetworkInfo();
                if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
                    ((C2049i) interfaceC2283b).m5776z(new InterfaceC2282a() { // from class: df.f
                        @Override // ff.InterfaceC2282a
                        /* renamed from: b */
                        public final Object mo17b() {
                            ((C0005d) c3328c.f17612d).a0(c8357i, i10 + 1, false);
                            return null;
                        }
                    });
                } else {
                    c3328c.m7653h(c8357i, i10);
                }
                runnable.run();
            } catch (SynchronizationException unused) {
                ((C0005d) c3328c.f17612d).a0(c8357i, i10 + 1, false);
                runnable.run();
            }
        } catch (Throwable th2) {
            runnable.run();
            throw th2;
        }
    }
}
