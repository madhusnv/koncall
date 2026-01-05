package p3;

import android.os.Build;
import android.view.MotionEvent;
import c9.C0927v;
import com.google.android.gms.internal.measurement.j4;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: p3.j */
/* loaded from: classes.dex */
public final class C5812j {

    /* renamed from: a */
    public final Object f28467a;

    /* renamed from: b */
    public final j4 f28468b;

    /* renamed from: c */
    public final int f28469c;

    /* renamed from: d */
    public int f28470d;

    /* JADX WARN: Removed duplicated region for block: B:29:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0058  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C5812j(java.util.List r7, com.google.android.gms.internal.measurement.j4 r8) {
        /*
            r6 = this;
            r6.<init>()
            r6.f28467a = r7
            r6.f28468b = r8
            r0 = 0
            if (r8 == 0) goto L13
            java.lang.Object r1 = r8.f6253d
            c9.v r1 = (c9.C0927v) r1
            java.lang.Object r1 = r1.f5669c
            android.view.MotionEvent r1 = (android.view.MotionEvent) r1
            goto L14
        L13:
            r1 = r0
        L14:
            r2 = 0
            if (r1 == 0) goto L1c
            int r1 = r1.getButtonState()
            goto L1d
        L1c:
            r1 = r2
        L1d:
            r6.f28469c = r1
            if (r8 == 0) goto L2a
            java.lang.Object r1 = r8.f6253d
            c9.v r1 = (c9.C0927v) r1
            java.lang.Object r1 = r1.f5669c
            android.view.MotionEvent r1 = (android.view.MotionEvent) r1
            goto L2b
        L2a:
            r1 = r0
        L2b:
            if (r1 == 0) goto L30
            r1.getMetaState()
        L30:
            if (r8 == 0) goto L3b
            java.lang.Object r8 = r8.f6253d
            c9.v r8 = (c9.C0927v) r8
            java.lang.Object r8 = r8.f5669c
            r0 = r8
            android.view.MotionEvent r0 = (android.view.MotionEvent) r0
        L3b:
            r8 = 3
            r1 = 2
            r3 = 1
            if (r0 == 0) goto L5a
            int r7 = r0.getActionMasked()
            if (r7 == 0) goto L58
            if (r7 == r3) goto L56
            if (r7 == r1) goto L54
            switch(r7) {
                case 5: goto L58;
                case 6: goto L56;
                case 7: goto L54;
                case 8: goto L52;
                case 9: goto L50;
                case 10: goto L4e;
                default: goto L4d;
            }
        L4d:
            goto L77
        L4e:
            r2 = 5
            goto L77
        L50:
            r2 = 4
            goto L77
        L52:
            r2 = 6
            goto L77
        L54:
            r2 = r8
            goto L77
        L56:
            r2 = r1
            goto L77
        L58:
            r2 = r3
            goto L77
        L5a:
            int r0 = r7.size()
        L5e:
            if (r2 >= r0) goto L54
            java.lang.Object r4 = r7.get(r2)
            p3.q r4 = (p3.C5819q) r4
            boolean r5 = p3.AbstractC5818p.m11399c(r4)
            if (r5 == 0) goto L6d
            goto L56
        L6d:
            boolean r4 = p3.AbstractC5818p.m11397a(r4)
            if (r4 == 0) goto L74
            goto L58
        L74:
            int r2 = r2 + 1
            goto L5e
        L77:
            r6.f28470d = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p3.C5812j.<init>(java.util.List, com.google.android.gms.internal.measurement.j4):void");
    }

    /* renamed from: a */
    public final int m11396a() {
        if (Build.VERSION.SDK_INT < 29) {
            return 0;
        }
        j4 j4Var = this.f28468b;
        MotionEvent motionEvent = j4Var != null ? (MotionEvent) ((C0927v) j4Var.f6253d).f5669c : null;
        if (motionEvent != null) {
            return motionEvent.getClassification();
        }
        return 0;
    }
}
