package c4;

import android.graphics.Rect;
import android.os.CancellationSignal;
import android.view.ScrollCaptureCallback;
import android.view.ScrollCaptureSession;
import ao.C0372k;
import ao.C0381t;
import com.skydoves.balloon.internals.DefinitionKt;
import d3.h0;
import d4.C1589q;
import java.util.function.Consumer;
import k2.e1;
import s4.C6755k;
import tx.c0;
import tx.o1;
import tx.s1;
import uw.InterfaceC7559c;
import w3.C7904v;
import yx.C8810d;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: c4.d */
/* loaded from: classes.dex */
public final class ScrollCaptureCallbackC0854d implements ScrollCaptureCallback {

    /* renamed from: a */
    public final C1589q f5383a;

    /* renamed from: b */
    public final C6755k f5384b;

    /* renamed from: c */
    public final C0861k f5385c;

    /* renamed from: d */
    public final C7904v f5386d;

    /* renamed from: e */
    public final C8810d f5387e;

    /* renamed from: f */
    public final C0859i f5388f;

    public ScrollCaptureCallbackC0854d(C1589q c1589q, C6755k c6755k, C8810d c8810d, C0861k c0861k, C7904v c7904v) {
        this.f5383a = c1589q;
        this.f5384b = c6755k;
        this.f5385c = c0861k;
        this.f5386d = c7904v;
        this.f5387e = new C8810d(c8810d.f42488a.t0(C0857g.f5393a));
        this.f5388f = new C0859i(c6755k.m12945b(), new C0853c(this, null));
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m2296a(c4.ScrollCaptureCallbackC0854d r11, android.view.ScrollCaptureSession r12, s4.C6755k r13, ww.AbstractC8193c r14) {
        /*
            Method dump skipped, instructions count: 334
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: c4.ScrollCaptureCallbackC0854d.m2296a(c4.d, android.view.ScrollCaptureSession, s4.k, ww.c):java.lang.Object");
    }

    public final void onScrollCaptureEnd(Runnable runnable) {
        c0.m13502y(this.f5387e, o1.f34663b, null, new C0372k(this, runnable, (InterfaceC7559c) null, 21), 2);
    }

    public final void onScrollCaptureImageRequest(ScrollCaptureSession scrollCaptureSession, CancellationSignal cancellationSignal, Rect rect, Consumer consumer) {
        s1 s1VarM13502y = c0.m13502y(this.f5387e, null, null, new C0381t(this, scrollCaptureSession, rect, consumer, null, 3), 3);
        s1VarM13502y.v0(new C0856f(cancellationSignal, 0));
        cancellationSignal.setOnCancelListener(new C0855e(0, s1VarM13502y));
    }

    public final void onScrollCaptureSearch(CancellationSignal cancellationSignal, Consumer consumer) {
        consumer.accept(h0.m5147s(this.f5384b));
    }

    public final void onScrollCaptureStart(ScrollCaptureSession scrollCaptureSession, CancellationSignal cancellationSignal, Runnable runnable) {
        this.f5388f.f5399b = DefinitionKt.NO_Float_VALUE;
        ((e1) this.f5385c.f5403b).setValue(Boolean.TRUE);
        runnable.run();
    }
}
