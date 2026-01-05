package c6;

import android.app.job.JobScheduler;
import android.content.Context;
import android.graphics.Rect;
import android.hardware.camera2.CaptureRequest;
import android.os.Build;
import android.os.CancellationSignal;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.inputmethod.CursorAnchorInfo;
import android.view.inputmethod.DeleteGesture;
import android.view.inputmethod.DeleteRangeGesture;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.HandwritingGesture;
import android.view.inputmethod.InsertGesture;
import android.view.inputmethod.JoinOrSplitGesture;
import android.view.inputmethod.PreviewableHandwritingGesture;
import android.view.inputmethod.RemoveSpaceGesture;
import android.view.inputmethod.SelectGesture;
import android.view.inputmethod.SelectRangeGesture;
import android.widget.TextView;
import android.window.BackEvent;
import c3.C0848c;
import c4.C0855e;
import g4.C2492h;
import g4.C2501q;
import kotlin.jvm.internal.AbstractC4154l;
import l4.C4356a;
import l4.C4360e;
import l4.C4379x;
import l4.InterfaceC4362g;
import og.pe;
import og.yf;
import pg.j9;
import rw.AbstractC6662l;
import s1.C6725t;
import z1.C8848h;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public abstract class e0 {
    /* renamed from: a */
    public static final void m2354a(CursorAnchorInfo.Builder builder, g4.l0 l0Var, C0848c c0848c) {
        if (c0848c.m2284f()) {
            return;
        }
        float f6 = c0848c.f5355b;
        C2501q c2501q = l0Var.f13671b;
        int iM6472e = c2501q.m6472e(f6);
        int iM6472e2 = c2501q.m6472e(c0848c.f5357d);
        if (iM6472e > iM6472e2) {
            return;
        }
        while (true) {
            builder.addVisibleLineBounds(l0Var.m6447e(iM6472e), c2501q.m6473f(iM6472e), l0Var.m6448f(iM6472e), c2501q.m6469b(iM6472e));
            if (iM6472e == iM6472e2) {
                return;
            } else {
                iM6472e++;
            }
        }
    }

    /* renamed from: b */
    public static final void m2355b(CursorAnchorInfo.Builder builder, g4.l0 l0Var, C0848c c0848c) {
        if (c0848c.m2284f()) {
            return;
        }
        float f6 = c0848c.f5355b;
        C2501q c2501q = l0Var.f13671b;
        int iM6472e = c2501q.m6472e(f6);
        int iM6472e2 = c2501q.m6472e(c0848c.f5357d);
        if (iM6472e > iM6472e2) {
            return;
        }
        while (true) {
            builder.addVisibleLineBounds(l0Var.m6447e(iM6472e), c2501q.m6473f(iM6472e), l0Var.m6448f(iM6472e), c2501q.m6469b(iM6472e));
            if (iM6472e == iM6472e2) {
                return;
            } else {
                iM6472e++;
            }
        }
    }

    /* renamed from: c */
    public static Context m2356c(Context context, int i10) {
        return context.createDeviceContext(i10);
    }

    /* renamed from: d */
    public static int m2357d(HandwritingGesture handwritingGesture, C6725t c6725t) {
        String fallbackText = handwritingGesture.getFallbackText();
        if (fallbackText == null) {
            return 3;
        }
        c6725t.invoke(new C4356a(fallbackText, 1));
        return 5;
    }

    /* renamed from: e */
    public static JobScheduler m2358e(JobScheduler jobScheduler) {
        JobScheduler jobSchedulerForNamespace = jobScheduler.forNamespace("androidx.work.systemjobscheduler");
        AbstractC4154l.m8922e(jobSchedulerForNamespace, "jobScheduler.forNamespace(WORKMANAGER_NAMESPACE)");
        return jobSchedulerForNamespace;
    }

    /* renamed from: f */
    public static AccessibilityNodeInfo.AccessibilityAction m2359f() {
        return AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_IN_DIRECTION;
    }

    /* renamed from: g */
    public static float m2360g(VelocityTracker velocityTracker, int i10) {
        return velocityTracker.getAxisVelocity(i10);
    }

    /* renamed from: h */
    public static void m2361h(AccessibilityNodeInfo accessibilityNodeInfo, Rect rect) {
        accessibilityNodeInfo.getBoundsInWindow(rect);
    }

    /* renamed from: i */
    public static CharSequence m2362i(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.getContainerTitle();
    }

    /* renamed from: j */
    public static int m2363j(Context context) {
        return context.getDeviceId();
    }

    /* renamed from: k */
    public static int m2364k(Context context) {
        return context.getDeviceId();
    }

    /* renamed from: l */
    public static int m2365l(ViewConfiguration viewConfiguration, int i10, int i11, int i12) {
        return viewConfiguration.getScaledMaximumFlingVelocity(i10, i11, i12);
    }

    /* renamed from: m */
    public static int m2366m(ViewConfiguration viewConfiguration, int i10, int i11, int i12) {
        return viewConfiguration.getScaledMinimumFlingVelocity(i10, i11, i12);
    }

    /* renamed from: n */
    public static boolean m2367n(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.isAccessibilityDataSensitive();
    }

    /* renamed from: o */
    public static void m2368o(long j6, C2492h c2492h, boolean z6, C6725t c6725t) {
        if (z6) {
            int i10 = g4.n0.f13685c;
            int iCharCount = (int) (j6 >> 32);
            int iCharCount2 = (int) (j6 & 4294967295L);
            int iCodePointBefore = iCharCount > 0 ? Character.codePointBefore(c2492h, iCharCount) : 10;
            int iCodePointAt = iCharCount2 < c2492h.f13620b.length() ? Character.codePointAt(c2492h, iCharCount2) : 10;
            if (j9.m11725j(iCodePointBefore) && (j9.m11724i(iCodePointAt) || j9.m11723h(iCodePointAt))) {
                do {
                    iCharCount -= Character.charCount(iCodePointBefore);
                    if (iCharCount == 0) {
                        break;
                    } else {
                        iCodePointBefore = Character.codePointBefore(c2492h, iCharCount);
                    }
                } while (j9.m11725j(iCodePointBefore));
                j6 = yf.m11072a(iCharCount, iCharCount2);
            } else if (j9.m11725j(iCodePointAt) && (j9.m11724i(iCodePointBefore) || j9.m11723h(iCodePointBefore))) {
                do {
                    iCharCount2 += Character.charCount(iCodePointAt);
                    if (iCharCount2 == c2492h.f13620b.length()) {
                        break;
                    } else {
                        iCodePointAt = Character.codePointAt(c2492h, iCharCount2);
                    }
                } while (j9.m11725j(iCodePointAt));
                j6 = yf.m11072a(iCharCount, iCharCount2);
            }
        }
        int i11 = (int) (4294967295L & j6);
        c6725t.invoke(new C8848h(new InterfaceC4362g[]{new C4379x(i11, i11), new C4360e(g4.n0.m6456c(j6), 0)}));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0263  */
    /* JADX WARN: Type inference failed for: r11v3, types: [wr.n] */
    /* JADX WARN: Type inference failed for: r17v1 */
    /* JADX WARN: Type inference failed for: r17v2, types: [long] */
    /* JADX WARN: Type inference failed for: r17v3 */
    /* renamed from: p */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int m2369p(x1.v0 r16, android.view.inputmethod.HandwritingGesture r17, b2.y0 r18, w3.t2 r19, s1.C6725t r20) {
        /*
            Method dump skipped, instructions count: 824
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: c6.e0.m2369p(x1.v0, android.view.inputmethod.HandwritingGesture, b2.y0, w3.t2, s1.t):int");
    }

    /* renamed from: q */
    public static boolean m2370q(x1.v0 v0Var, PreviewableHandwritingGesture previewableHandwritingGesture, b2.y0 y0Var, CancellationSignal cancellationSignal) {
        g4.k0 k0Var;
        C2492h c2492h = v0Var.f39712j;
        if (c2492h != null) {
            x1.r1 r1VarM15480d = v0Var.m15480d();
            if (c2492h.equals((r1VarM15480d == null || (k0Var = r1VarM15480d.f39668a.f13670a) == null) ? null : k0Var.f13660a)) {
                if (previewableHandwritingGesture instanceof SelectGesture) {
                    SelectGesture selectGesture = (SelectGesture) previewableHandwritingGesture;
                    if (y0Var != null) {
                        long jM11722g = j9.m11722g(v0Var, d3.h0.m5151w(selectGesture.getSelectionArea()), selectGesture.getGranularity() != 1 ? 0 : 1);
                        x1.v0 v0Var2 = y0Var.f3869d;
                        if (v0Var2 != null) {
                            v0Var2.m15482f(jM11722g);
                        }
                        x1.v0 v0Var3 = y0Var.f3869d;
                        if (v0Var3 != null) {
                            v0Var3.m15481e(g4.n0.f13684b);
                        }
                        if (!g4.n0.m6455b(jM11722g)) {
                            y0Var.m1707q(false);
                            y0Var.m1705o(x1.k0.None);
                        }
                    }
                } else if (previewableHandwritingGesture instanceof DeleteGesture) {
                    DeleteGesture deleteGesture = (DeleteGesture) previewableHandwritingGesture;
                    if (y0Var != null) {
                        long jM11722g2 = j9.m11722g(v0Var, d3.h0.m5151w(deleteGesture.getDeletionArea()), deleteGesture.getGranularity() != 1 ? 0 : 1);
                        x1.v0 v0Var4 = y0Var.f3869d;
                        if (v0Var4 != null) {
                            v0Var4.m15481e(jM11722g2);
                        }
                        x1.v0 v0Var5 = y0Var.f3869d;
                        if (v0Var5 != null) {
                            v0Var5.m15482f(g4.n0.f13684b);
                        }
                        if (!g4.n0.m6455b(jM11722g2)) {
                            y0Var.m1707q(false);
                            y0Var.m1705o(x1.k0.None);
                        }
                    }
                } else if (previewableHandwritingGesture instanceof SelectRangeGesture) {
                    SelectRangeGesture selectRangeGesture = (SelectRangeGesture) previewableHandwritingGesture;
                    if (y0Var != null) {
                        long jM11717b = j9.m11717b(v0Var, d3.h0.m5151w(selectRangeGesture.getSelectionStartArea()), d3.h0.m5151w(selectRangeGesture.getSelectionEndArea()), selectRangeGesture.getGranularity() != 1 ? 0 : 1);
                        x1.v0 v0Var6 = y0Var.f3869d;
                        if (v0Var6 != null) {
                            v0Var6.m15482f(jM11717b);
                        }
                        x1.v0 v0Var7 = y0Var.f3869d;
                        if (v0Var7 != null) {
                            v0Var7.m15481e(g4.n0.f13684b);
                        }
                        if (!g4.n0.m6455b(jM11717b)) {
                            y0Var.m1707q(false);
                            y0Var.m1705o(x1.k0.None);
                        }
                    }
                } else if (previewableHandwritingGesture instanceof DeleteRangeGesture) {
                    DeleteRangeGesture deleteRangeGesture = (DeleteRangeGesture) previewableHandwritingGesture;
                    if (y0Var != null) {
                        long jM11717b2 = j9.m11717b(v0Var, d3.h0.m5151w(deleteRangeGesture.getDeletionStartArea()), d3.h0.m5151w(deleteRangeGesture.getDeletionEndArea()), deleteRangeGesture.getGranularity() != 1 ? 0 : 1);
                        x1.v0 v0Var8 = y0Var.f3869d;
                        if (v0Var8 != null) {
                            v0Var8.m15481e(jM11717b2);
                        }
                        x1.v0 v0Var9 = y0Var.f3869d;
                        if (v0Var9 != null) {
                            v0Var9.m15482f(g4.n0.f13684b);
                        }
                        if (!g4.n0.m6455b(jM11717b2)) {
                            y0Var.m1707q(false);
                            y0Var.m1705o(x1.k0.None);
                        }
                    }
                }
                if (cancellationSignal != null) {
                    cancellationSignal.setOnCancelListener(new C0855e(1, y0Var));
                }
                return true;
            }
        }
        return false;
    }

    /* renamed from: r */
    public static float m2371r(BackEvent backEvent) {
        return backEvent.getProgress();
    }

    /* renamed from: s */
    public static void m2372s(EditorInfo editorInfo) {
        editorInfo.setSupportedHandwritingGestures(pe.m10834i(SelectGesture.class, DeleteGesture.class, SelectRangeGesture.class, DeleteRangeGesture.class, JoinOrSplitGesture.class, InsertGesture.class, RemoveSpaceGesture.class));
        editorInfo.setSupportedHandwritingGesturePreviews(AbstractC6662l.m12710M(new Class[]{SelectGesture.class, DeleteGesture.class, SelectRangeGesture.class, DeleteRangeGesture.class}));
    }

    /* renamed from: t */
    public static void m2373t(TextView textView, int i10, float f6) {
        textView.setLineHeight(i10, f6);
    }

    /* renamed from: u */
    public static final void m2374u(c0.h1 h1Var, i0.r0 priority) {
        AbstractC4154l.m8923f(priority, "priority");
        if (Build.VERSION.SDK_INT >= 34) {
            h1Var.m2202c(CaptureRequest.CONTROL_SETTINGS_OVERRIDE, 1, priority);
        }
    }

    /* renamed from: v */
    public static int m2375v(BackEvent backEvent) {
        return backEvent.getSwipeEdge();
    }

    /* renamed from: w */
    public static float m2376w(BackEvent backEvent) {
        return backEvent.getTouchX();
    }

    /* renamed from: x */
    public static float m2377x(BackEvent backEvent) {
        return backEvent.getTouchY();
    }
}
