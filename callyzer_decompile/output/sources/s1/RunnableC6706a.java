package s1;

import ak.C0166e;
import android.view.Choreographer;
import android.view.View;
import k2.r1;
import m2.C4640e;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: s1.a */
/* loaded from: classes.dex */
public final class RunnableC6706a implements w0, r1, Runnable, Choreographer.FrameCallback {

    /* renamed from: g */
    public static long f32037g;

    /* renamed from: a */
    public final View f32038a;

    /* renamed from: c */
    public boolean f32040c;

    /* renamed from: e */
    public boolean f32042e;

    /* renamed from: f */
    public long f32043f;

    /* renamed from: b */
    public final C4640e f32039b = new C4640e(new v0[16]);

    /* renamed from: d */
    public final Choreographer f32041d = Choreographer.getInstance();

    /* JADX WARN: Removed duplicated region for block: B:10:0x0035  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public RunnableC6706a(android.view.View r5) {
        /*
            r4 = this;
            r4.<init>()
            r4.f32038a = r5
            m2.e r0 = new m2.e
            r1 = 16
            s1.v0[] r1 = new s1.v0[r1]
            r0.<init>(r1)
            r4.f32039b = r0
            android.view.Choreographer r0 = android.view.Choreographer.getInstance()
            r4.f32041d = r0
            long r0 = s1.RunnableC6706a.f32037g
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L3f
            android.view.Display r0 = r5.getDisplay()
            boolean r5 = r5.isInEditMode()
            if (r5 != 0) goto L35
            if (r0 == 0) goto L35
            float r5 = r0.getRefreshRate()
            r0 = 1106247680(0x41f00000, float:30.0)
            int r0 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r0 < 0) goto L35
            goto L37
        L35:
            r5 = 1114636288(0x42700000, float:60.0)
        L37:
            r0 = 1000000000(0x3b9aca00, float:0.0047237873)
            float r0 = (float) r0
            float r0 = r0 / r5
            long r0 = (long) r0
            s1.RunnableC6706a.f32037g = r0
        L3f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: s1.RunnableC6706a.<init>(android.view.View):void");
    }

    @Override // s1.w0
    /* renamed from: a */
    public final void mo12842a(v0 v0Var) {
        this.f32039b.m9506b(v0Var);
        if (this.f32040c) {
            return;
        }
        this.f32040c = true;
        this.f32038a.post(this);
    }

    @Override // k2.r1
    /* renamed from: c */
    public final void mo5875c() {
        this.f32042e = false;
        this.f32038a.removeCallbacks(this);
        this.f32041d.removeFrameCallback(this);
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j6) {
        if (this.f32042e) {
            this.f32043f = j6;
            this.f32038a.post(this);
        }
    }

    @Override // k2.r1
    /* renamed from: e */
    public final void mo5876e() {
        this.f32042e = true;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C4640e c4640e = this.f32039b;
        if (c4640e.f22886c == 0 || !this.f32040c || !this.f32042e || this.f32038a.getWindowVisibility() != 0) {
            this.f32040c = false;
            return;
        }
        long j6 = this.f32043f + f32037g;
        C0166e c0166e = new C0166e();
        c0166e.f515a = j6;
        boolean z6 = false;
        while (c4640e.f22886c != 0 && !z6) {
            if (Math.max(0L, c0166e.f515a - System.nanoTime()) <= 0 || ((v0) c4640e.f22884a[0]).m12869b(c0166e)) {
                z6 = true;
            } else {
                c4640e.m9515m(0);
            }
        }
        if (z6) {
            this.f32041d.postFrameCallback(this);
        } else {
            this.f32040c = false;
        }
    }

    @Override // k2.r1
    /* renamed from: b */
    public final void mo5874b() {
    }
}
