package w3;

import android.view.ViewGroup;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public abstract class i3 {

    /* renamed from: a */
    public static final ViewGroup.LayoutParams f37809a = new ViewGroup.LayoutParams(-2, -2);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00af  */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, java.util.Collection] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final w3.g3 m14960a(w3.AbstractC7883a r6, k2.AbstractC3969r r7, s2.C6734c r8) {
        /*
            java.util.concurrent.atomic.AtomicBoolean r0 = w3.p1.f37915a
            r1 = 0
            r2 = 1
            boolean r0 = r0.compareAndSet(r1, r2)
            r3 = 0
            if (r0 == 0) goto L41
            r0 = 6
            vx.h r0 = pg.o6.m11805a(r2, r3, r3, r0)
            qw.p r2 = w3.u0.f37968n
            java.lang.Object r2 = r2.getValue()
            uw.h r2 = (uw.InterfaceC7564h) r2
            yx.d r2 = tx.c0.m13479b(r2)
            o6.s0 r4 = new o6.s0
            r5 = 17
            r4.<init>(r0, r3, r5)
            r5 = 3
            tx.c0.m13502y(r2, r3, r3, r4, r5)
            s1.t r2 = new s1.t
            r4 = 11
            r2.<init>(r4, r0)
            java.lang.Object r0 = u2.AbstractC7316m.f34890b
            monitor-enter(r0)
            java.lang.Object r4 = u2.AbstractC7316m.f34896h     // Catch: java.lang.Throwable -> L3e
            java.util.ArrayList r2 = rw.AbstractC6663m.m12753Q(r2, r4)     // Catch: java.lang.Throwable -> L3e
            u2.AbstractC7316m.f34896h = r2     // Catch: java.lang.Throwable -> L3e
            monitor-exit(r0)
            u2.AbstractC7316m.m13676a()
            goto L41
        L3e:
            r6 = move-exception
            monitor-exit(r0)
            throw r6
        L41:
            int r0 = r6.getChildCount()
            if (r0 <= 0) goto L54
            android.view.View r0 = r6.getChildAt(r1)
            boolean r1 = r0 instanceof w3.C7904v
            if (r1 == 0) goto L52
            w3.v r0 = (w3.C7904v) r0
            goto L58
        L52:
            r0 = r3
            goto L58
        L54:
            r6.removeAllViews()
            goto L52
        L58:
            if (r0 != 0) goto L70
            w3.v r0 = new w3.v
            android.content.Context r1 = r6.getContext()
            uw.h r2 = r7.mo8563h()
            r0.<init>(r1, r2)
            android.view.View r1 = r0.getView()
            android.view.ViewGroup$LayoutParams r2 = w3.i3.f37809a
            r6.addView(r1, r2)
        L70:
            android.view.View r6 = r0.getView()
            r1 = 2131362300(0x7f0a01fc, float:1.8344377E38)
            java.lang.Object r6 = r6.getTag(r1)
            boolean r2 = r6 instanceof w3.g3
            if (r2 == 0) goto L82
            r3 = r6
            w3.g3 r3 = (w3.g3) r3
        L82:
            if (r3 != 0) goto L9e
            w3.g3 r3 = new w3.g3
            ug.j r6 = new ug.j
            v3.g0 r2 = r0.getRoot()
            r6.<init>(r2)
            k2.u r2 = new k2.u
            r2.<init>(r7, r6)
            r3.<init>(r0, r2)
            android.view.View r6 = r0.getView()
            r6.setTag(r1, r3)
        L9e:
            r3.m14954a(r8)
            uw.h r6 = r0.getCoroutineContext()
            uw.h r8 = r7.mo8563h()
            boolean r6 = kotlin.jvm.internal.AbstractC4154l.m8918a(r6, r8)
            if (r6 != 0) goto Lb6
            uw.h r6 = r7.mo8563h()
            r0.setCoroutineContext(r6)
        Lb6:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: w3.i3.m14960a(w3.a, k2.r, s2.c):w3.g3");
    }
}
