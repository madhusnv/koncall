package p8;

import android.animation.ObjectAnimator;
import android.view.View;
import java.util.HashMap;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: p8.j */
/* loaded from: classes.dex */
public final class C5849j extends AbstractC5857r {

    /* renamed from: z */
    public static final String[] f28588z = {"android:visibility:visibility", "android:visibility:parent"};

    /* renamed from: y */
    public final int f28589y;

    public C5849j(int i10) {
        this.f28589y = i10;
    }

    /* renamed from: J */
    public static void m11431J(C5864y c5864y) {
        View view = c5864y.f28641b;
        int visibility = view.getVisibility();
        HashMap map = c5864y.f28640a;
        map.put("android:visibility:visibility", Integer.valueOf(visibility));
        map.put("android:visibility:parent", view.getParent());
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        map.put("android:visibility:screenLocation", iArr);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x002f  */
    /* renamed from: L */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static p8.f0 m11432L(p8.C5864y r8, p8.C5864y r9) {
        /*
            p8.f0 r0 = new p8.f0
            r0.<init>()
            r1 = 0
            r0.f28570a = r1
            r0.f28571b = r1
            r2 = 0
            r3 = -1
            java.lang.String r4 = "android:visibility:parent"
            java.lang.String r5 = "android:visibility:visibility"
            if (r8 == 0) goto L2f
            java.util.HashMap r6 = r8.f28640a
            boolean r7 = r6.containsKey(r5)
            if (r7 == 0) goto L2f
            java.lang.Object r7 = r6.get(r5)
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            r0.f28572c = r7
            java.lang.Object r6 = r6.get(r4)
            android.view.ViewGroup r6 = (android.view.ViewGroup) r6
            r0.f28574e = r6
            goto L33
        L2f:
            r0.f28572c = r3
            r0.f28574e = r2
        L33:
            if (r9 == 0) goto L52
            java.util.HashMap r6 = r9.f28640a
            boolean r7 = r6.containsKey(r5)
            if (r7 == 0) goto L52
            java.lang.Object r2 = r6.get(r5)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r0.f28573d = r2
            java.lang.Object r2 = r6.get(r4)
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            r0.f28575f = r2
            goto L56
        L52:
            r0.f28573d = r3
            r0.f28575f = r2
        L56:
            r2 = 1
            if (r8 == 0) goto L8a
            if (r9 == 0) goto L8a
            int r8 = r0.f28572c
            int r9 = r0.f28573d
            if (r8 != r9) goto L68
            android.view.ViewGroup r3 = r0.f28574e
            android.view.ViewGroup r4 = r0.f28575f
            if (r3 != r4) goto L68
            goto L9f
        L68:
            if (r8 == r9) goto L78
            if (r8 != 0) goto L71
            r0.f28571b = r1
            r0.f28570a = r2
            return r0
        L71:
            if (r9 != 0) goto L9f
            r0.f28571b = r2
            r0.f28570a = r2
            return r0
        L78:
            android.view.ViewGroup r8 = r0.f28575f
            if (r8 != 0) goto L81
            r0.f28571b = r1
            r0.f28570a = r2
            return r0
        L81:
            android.view.ViewGroup r8 = r0.f28574e
            if (r8 != 0) goto L9f
            r0.f28571b = r2
            r0.f28570a = r2
            return r0
        L8a:
            if (r8 != 0) goto L95
            int r8 = r0.f28573d
            if (r8 != 0) goto L95
            r0.f28571b = r2
            r0.f28570a = r2
            return r0
        L95:
            if (r9 != 0) goto L9f
            int r8 = r0.f28572c
            if (r8 != 0) goto L9f
            r0.f28571b = r1
            r0.f28570a = r2
        L9f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p8.C5849j.m11432L(p8.y, p8.y):p8.f0");
    }

    /* renamed from: K */
    public final ObjectAnimator m11433K(View view, float f6, float f10) {
        if (f6 == f10) {
            return null;
        }
        AbstractC5865z.f28643a.mo11416d(view, f6);
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, AbstractC5865z.f28644b, f10);
        objectAnimatorOfFloat.addListener(new C5848i(view));
        m11448a(new C5847h(0, view));
        return objectAnimatorOfFloat;
    }

    @Override // p8.AbstractC5857r
    /* renamed from: d */
    public final void mo11427d(C5864y c5864y) {
        m11431J(c5864y);
    }

    @Override // p8.AbstractC5857r
    /* renamed from: g */
    public final void mo11428g(C5864y c5864y) {
        m11431J(c5864y);
        c5864y.f28640a.put("android:fade:transitionAlpha", Float.valueOf(AbstractC5865z.f28643a.mo11415c(c5864y.f28641b)));
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0048, code lost:
    
        if (m11432L(m11457p(r3, false), m11458s(r3, false)).f28570a != false) goto L9;
     */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00f1  */
    @Override // p8.AbstractC5857r
    /* renamed from: m */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.animation.Animator mo11429m(android.view.ViewGroup r18, p8.C5864y r19, p8.C5864y r20) throws java.lang.IllegalAccessException, java.lang.NoSuchFieldException, java.lang.SecurityException, java.lang.IllegalArgumentException {
        /*
            Method dump skipped, instructions count: 397
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p8.C5849j.mo11429m(android.view.ViewGroup, p8.y, p8.y):android.animation.Animator");
    }

    @Override // p8.AbstractC5857r
    /* renamed from: r */
    public final String[] mo11430r() {
        return f28588z;
    }

    @Override // p8.AbstractC5857r
    /* renamed from: t */
    public final boolean mo11434t(C5864y c5864y, C5864y c5864y2) {
        if (c5864y == null && c5864y2 == null) {
            return false;
        }
        if (c5864y != null && c5864y2 != null && c5864y2.f28640a.containsKey("android:visibility:visibility") != c5864y.f28640a.containsKey("android:visibility:visibility")) {
            return false;
        }
        f0 f0VarM11432L = m11432L(c5864y, c5864y2);
        if (f0VarM11432L.f28570a) {
            return f0VarM11432L.f28572c == 0 || f0VarM11432L.f28573d == 0;
        }
        return false;
    }
}
