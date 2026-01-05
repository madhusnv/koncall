package wi;

import android.util.Log;
import cj.C0979e;
import io.C3328c;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicReference;
import pg.l8;
import rw.C6669s;
import tb.C7105p;
import ug.g1;
import xi.ExecutorC8384b;
import yg.C8650g;
import yg.C8656m;
import yi.C8674c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: wi.j */
/* loaded from: classes.dex */
public final class CallableC8060j implements Callable {

    /* renamed from: a */
    public final /* synthetic */ long f38590a;

    /* renamed from: b */
    public final /* synthetic */ Throwable f38591b;

    /* renamed from: c */
    public final /* synthetic */ Thread f38592c;

    /* renamed from: d */
    public final /* synthetic */ C3328c f38593d;

    /* renamed from: e */
    public final /* synthetic */ C8062l f38594e;

    public CallableC8060j(C8062l c8062l, long j6, Throwable th2, Thread thread, C3328c c3328c) {
        this.f38594e = c8062l;
        this.f38590a = j6;
        this.f38591b = th2;
        this.f38592c = thread;
        this.f38593d = c3328c;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() throws Throwable {
        C0979e c0979e;
        String str;
        long j6 = this.f38590a;
        long j10 = j6 / 1000;
        C8062l c8062l = this.f38594e;
        String strM15200d = c8062l.m15200d();
        if (strM15200d == null) {
            return l8.m11765f(null);
        }
        C7105p c7105p = c8062l.f38601c;
        c7105p.getClass();
        try {
            C0979e c0979e2 = (C0979e) c7105p.f34291c;
            String str2 = (String) c7105p.f34290b;
            c0979e2.getClass();
            new File((File) c0979e2.f5804c, str2).createNewFile();
        } catch (IOException unused) {
        }
        C0979e c0979e3 = c8062l.f38611m;
        c0979e3.getClass();
        Log.isLoggable("FirebaseCrashlytics", 2);
        c0979e3.m2784s(this.f38591b, this.f38592c, "crash", new C8674c(strM15200d, j10, C6669s.f31944a), true);
        try {
            c0979e = c8062l.f38605g;
            str = ".ae" + j6;
            c0979e.getClass();
        } catch (IOException unused2) {
        }
        if (!new File((File) c0979e.f5804c, str).createNewFile()) {
            throw new IOException("Create new file failed.");
        }
        C3328c c3328c = this.f38593d;
        c8062l.m15198b(false, c3328c, false);
        c8062l.m15199c(new C8055e().f38581a, Boolean.FALSE);
        if (!c8062l.f38600b.m194C()) {
            return l8.m11765f(null);
        }
        C8656m c8656m = ((C8650g) ((AtomicReference) c3328c.f17617i).get()).f41930a;
        ExecutorC8384b executorC8384b = c8062l.f38603e.f40063a;
        g1 g1Var = new g1();
        g1Var.f35448a = this;
        return c8656m.m15986m(executorC8384b, g1Var);
    }
}
