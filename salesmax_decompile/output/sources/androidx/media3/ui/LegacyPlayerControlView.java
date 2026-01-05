package androidx.media3.ui;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Looper;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.media3.ui.InterfaceC2298b;
import java.util.Arrays;
import java.util.Formatter;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArrayList;
import p001o.a8e;
import p001o.aae;
import p001o.c9e;
import p001o.h9e;
import p001o.lmh;
import p001o.mad;
import p001o.op0;
import p001o.pke;
import p001o.q7e;
import p001o.rbe;
import p001o.sqi;
import p001o.t2b;
import p001o.tq;

/* loaded from: classes2.dex */
public class LegacyPlayerControlView extends FrameLayout {
    public boolean A0;
    public boolean B0;
    public boolean C0;
    public int D0;
    public int E0;
    public int F0;
    public boolean G0;

    /* renamed from: H */
    public final TextView f8777H;
    public boolean H0;
    public boolean I0;
    public boolean J0;
    public boolean K0;

    /* renamed from: L */
    public final InterfaceC2298b f8778L;
    public long L0;

    /* renamed from: M */
    public final StringBuilder f8779M;
    public long[] M0;
    public boolean[] N0;
    public long[] O0;
    public boolean[] P0;

    /* renamed from: Q */
    public final Formatter f8780Q;
    public long Q0;
    public long R0;
    public long S0;

    /* renamed from: a */
    public final ViewOnClickListenerC2270c f8781a;

    /* renamed from: b */
    public final CopyOnWriteArrayList f8782b;

    /* renamed from: c */
    public final View f8783c;

    /* renamed from: d */
    public final View f8784d;

    /* renamed from: e */
    public final View f8785e;

    /* renamed from: f */
    public final View f8786f;

    /* renamed from: g */
    public final View f8787g;

    /* renamed from: h */
    public final View f8788h;
    public final lmh.C15105b h0;
    public final lmh.C15106c i0;
    public final Runnable j0;
    public final Runnable k0;
    public final Drawable l0;
    public final Drawable m0;
    public final Drawable n0;
    public final String o0;
    public final String p0;

    /* renamed from: q */
    public final ImageView f8789q;
    public final String q0;
    public final Drawable r0;

    /* renamed from: s */
    public final ImageView f8790s;
    public final Drawable s0;
    public final float t0;
    public final float u0;
    public final String v0;
    public final String w0;

    /* renamed from: x */
    public final View f8791x;
    public mad x0;

    /* renamed from: y */
    public final TextView f8792y;
    public boolean y0;
    public boolean z0;

    /* renamed from: androidx.media3.ui.LegacyPlayerControlView$b */
    public static final class C2269b {
        /* renamed from: a */
        public static boolean m7680a(View view) {
            return view.isAccessibilityFocused();
        }
    }

    /* renamed from: androidx.media3.ui.LegacyPlayerControlView$c */
    public final class ViewOnClickListenerC2270c implements mad.InterfaceC15266d, InterfaceC2298b.a, View.OnClickListener {
        public ViewOnClickListenerC2270c() {
        }

        @Override // androidx.media3.ui.InterfaceC2298b.a
        /* renamed from: E */
        public void mo7681E(InterfaceC2298b interfaceC2298b, long j) {
            LegacyPlayerControlView.this.C0 = true;
            if (LegacyPlayerControlView.this.f8777H != null) {
                LegacyPlayerControlView.this.f8777H.setText(sqi.n0(LegacyPlayerControlView.this.f8779M, LegacyPlayerControlView.this.f8780Q, j));
            }
        }

        @Override // androidx.media3.ui.InterfaceC2298b.a
        /* renamed from: G */
        public void mo7682G(InterfaceC2298b interfaceC2298b, long j) {
            if (LegacyPlayerControlView.this.f8777H != null) {
                LegacyPlayerControlView.this.f8777H.setText(sqi.n0(LegacyPlayerControlView.this.f8779M, LegacyPlayerControlView.this.f8780Q, j));
            }
        }

        @Override // androidx.media3.ui.InterfaceC2298b.a
        /* renamed from: L */
        public void mo7683L(InterfaceC2298b interfaceC2298b, long j, boolean z) {
            LegacyPlayerControlView.this.C0 = false;
            if (z || LegacyPlayerControlView.this.x0 == null) {
                return;
            }
            LegacyPlayerControlView legacyPlayerControlView = LegacyPlayerControlView.this;
            legacyPlayerControlView.m7669G(legacyPlayerControlView.x0, j);
        }

        @Override // p001o.mad.InterfaceC15266d
        /* renamed from: X */
        public void mo7684X(mad madVar, mad.C15265c c15265c) {
            if (c15265c.m38651b(4, 5)) {
                LegacyPlayerControlView.this.m7673K();
            }
            if (c15265c.m38651b(4, 5, 7)) {
                LegacyPlayerControlView.this.m7674L();
            }
            if (c15265c.m38650a(8)) {
                LegacyPlayerControlView.this.m7675M();
            }
            if (c15265c.m38650a(9)) {
                LegacyPlayerControlView.this.m7676N();
            }
            if (c15265c.m38651b(8, 9, 11, 0, 13)) {
                LegacyPlayerControlView.this.m7672J();
            }
            if (c15265c.m38651b(11, 0)) {
                LegacyPlayerControlView.this.m7677O();
            }
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            mad madVar = LegacyPlayerControlView.this.x0;
            if (madVar == null) {
                return;
            }
            if (LegacyPlayerControlView.this.f8784d == view) {
                madVar.mo31977E();
                return;
            }
            if (LegacyPlayerControlView.this.f8783c == view) {
                madVar.mo31987p();
                return;
            }
            if (LegacyPlayerControlView.this.f8787g == view) {
                if (madVar.mo7134c() != 4) {
                    madVar.b0();
                    return;
                }
                return;
            }
            if (LegacyPlayerControlView.this.f8788h == view) {
                madVar.c0();
                return;
            }
            if (LegacyPlayerControlView.this.f8785e == view) {
                sqi.v0(madVar);
                return;
            }
            if (LegacyPlayerControlView.this.f8786f == view) {
                sqi.u0(madVar);
            } else if (LegacyPlayerControlView.this.f8789q == view) {
                madVar.mo7139j(pke.m43810a(madVar.mo7140l(), LegacyPlayerControlView.this.F0));
            } else if (LegacyPlayerControlView.this.f8790s == view) {
                madVar.mo7120K(!madVar.mo7130Y());
            }
        }
    }

    /* renamed from: androidx.media3.ui.LegacyPlayerControlView$d */
    public interface InterfaceC2271d {
    }

    static {
        t2b.m49198a("media3.ui");
    }

    public LegacyPlayerControlView(Context context) {
        this(context, null);
    }

    /* renamed from: B */
    public static boolean m7639B(int i) {
        return i == 90 || i == 89 || i == 85 || i == 79 || i == 126 || i == 127 || i == 87 || i == 88;
    }

    /* renamed from: w */
    public static boolean m7662w(lmh lmhVar, lmh.C15106c c15106c) {
        if (lmhVar.mo6954p() > 100) {
            return false;
        }
        int iMo6954p = lmhVar.mo6954p();
        for (int i = 0; i < iMo6954p; i++) {
            if (lmhVar.m37476n(i, c15106c).f34092m == -9223372036854775807L) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: y */
    public static int m7663y(TypedArray typedArray, int i) {
        return typedArray.getInt(rbe.LegacyPlayerControlView_repeat_toggle_modes, i);
    }

    /* renamed from: A */
    public final void m7664A() {
        removeCallbacks(this.k0);
        if (this.D0 <= 0) {
            this.L0 = -9223372036854775807L;
            return;
        }
        long jUptimeMillis = SystemClock.uptimeMillis();
        int i = this.D0;
        this.L0 = jUptimeMillis + i;
        if (this.y0) {
            postDelayed(this.k0, i);
        }
    }

    /* renamed from: C */
    public boolean m7665C() {
        return getVisibility() == 0;
    }

    /* renamed from: D */
    public final void m7666D() {
        View view;
        View view2;
        boolean zH1 = sqi.h1(this.x0, this.A0);
        if (zH1 && (view2 = this.f8785e) != null) {
            view2.sendAccessibilityEvent(8);
        } else {
            if (zH1 || (view = this.f8786f) == null) {
                return;
            }
            view.sendAccessibilityEvent(8);
        }
    }

    /* renamed from: E */
    public final void m7667E() {
        View view;
        View view2;
        boolean zH1 = sqi.h1(this.x0, this.A0);
        if (zH1 && (view2 = this.f8785e) != null) {
            view2.requestFocus();
        } else {
            if (zH1 || (view = this.f8786f) == null) {
                return;
            }
            view.requestFocus();
        }
    }

    /* renamed from: F */
    public final void m7668F(mad madVar, int i, long j) {
        madVar.mo31978H(i, j);
    }

    /* renamed from: G */
    public final void m7669G(mad madVar, long j) {
        int iMo7128W;
        lmh lmhVarMo7112A = madVar.mo7112A();
        if (this.B0 && !lmhVarMo7112A.m37477q()) {
            int iMo6954p = lmhVarMo7112A.mo6954p();
            iMo7128W = 0;
            while (true) {
                long jM37502d = lmhVarMo7112A.m37476n(iMo7128W, this.i0).m37502d();
                if (j < jM37502d) {
                    break;
                }
                if (iMo7128W == iMo6954p - 1) {
                    j = jM37502d;
                    break;
                } else {
                    j -= jM37502d;
                    iMo7128W++;
                }
            }
        } else {
            iMo7128W = madVar.mo7128W();
        }
        m7668F(madVar, iMo7128W, j);
        m7674L();
    }

    /* renamed from: H */
    public final void m7670H() {
        m7673K();
        m7672J();
        m7675M();
        m7676N();
        m7677O();
    }

    /* renamed from: I */
    public final void m7671I(boolean z, boolean z2, View view) {
        if (view == null) {
            return;
        }
        view.setEnabled(z2);
        view.setAlpha(z2 ? this.t0 : this.u0);
        view.setVisibility(z ? 0 : 8);
    }

    /* renamed from: J */
    public final void m7672J() {
        boolean zMo31989x;
        boolean zMo31989x2;
        boolean zMo31989x3;
        boolean zMo31989x4;
        boolean zMo31989x5;
        if (m7665C() && this.y0) {
            mad madVar = this.x0;
            if (madVar != null) {
                zMo31989x = madVar.mo31989x(5);
                zMo31989x3 = madVar.mo31989x(7);
                zMo31989x4 = madVar.mo31989x(11);
                zMo31989x5 = madVar.mo31989x(12);
                zMo31989x2 = madVar.mo31989x(9);
            } else {
                zMo31989x = false;
                zMo31989x2 = false;
                zMo31989x3 = false;
                zMo31989x4 = false;
                zMo31989x5 = false;
            }
            m7671I(this.I0, zMo31989x3, this.f8783c);
            m7671I(this.G0, zMo31989x4, this.f8788h);
            m7671I(this.H0, zMo31989x5, this.f8787g);
            m7671I(this.J0, zMo31989x2, this.f8784d);
            InterfaceC2298b interfaceC2298b = this.f8778L;
            if (interfaceC2298b != null) {
                interfaceC2298b.setEnabled(zMo31989x);
            }
        }
    }

    /* renamed from: K */
    public final void m7673K() {
        boolean z;
        boolean z2;
        if (m7665C() && this.y0) {
            boolean zH1 = sqi.h1(this.x0, this.A0);
            View view = this.f8785e;
            boolean z3 = true;
            if (view != null) {
                z = (!zH1 && view.isFocused()) | false;
                z2 = (sqi.f45790a < 21 ? z : !zH1 && C2269b.m7680a(this.f8785e)) | false;
                this.f8785e.setVisibility(zH1 ? 0 : 8);
            } else {
                z = false;
                z2 = false;
            }
            View view2 = this.f8786f;
            if (view2 != null) {
                z |= zH1 && view2.isFocused();
                if (sqi.f45790a < 21) {
                    z3 = z;
                } else if (!zH1 || !C2269b.m7680a(this.f8786f)) {
                    z3 = false;
                }
                z2 |= z3;
                this.f8786f.setVisibility(zH1 ? 8 : 0);
            }
            if (z) {
                m7667E();
            }
            if (z2) {
                m7666D();
            }
        }
    }

    /* renamed from: L */
    public final void m7674L() {
        long jMo7127T;
        long jMo7131Z;
        if (m7665C() && this.y0) {
            mad madVar = this.x0;
            if (madVar != null) {
                jMo7127T = this.Q0 + madVar.mo7127T();
                jMo7131Z = this.Q0 + madVar.mo7131Z();
            } else {
                jMo7127T = 0;
                jMo7131Z = 0;
            }
            boolean z = jMo7127T != this.R0;
            this.R0 = jMo7127T;
            this.S0 = jMo7131Z;
            TextView textView = this.f8777H;
            if (textView != null && !this.C0 && z) {
                textView.setText(sqi.n0(this.f8779M, this.f8780Q, jMo7127T));
            }
            InterfaceC2298b interfaceC2298b = this.f8778L;
            if (interfaceC2298b != null) {
                interfaceC2298b.setPosition(jMo7127T);
                this.f8778L.setBufferedPosition(jMo7131Z);
            }
            removeCallbacks(this.j0);
            int iMo7134c = madVar == null ? 1 : madVar.mo7134c();
            if (madVar == null || !madVar.mo31982V()) {
                if (iMo7134c == 4 || iMo7134c == 1) {
                    return;
                }
                postDelayed(this.j0, 1000L);
                return;
            }
            InterfaceC2298b interfaceC2298b2 = this.f8778L;
            long jMin = Math.min(interfaceC2298b2 != null ? interfaceC2298b2.getPreferredUpdateDelay() : 1000L, 1000 - (jMo7127T % 1000));
            float f = madVar.mo7136e().f31768a;
            postDelayed(this.j0, sqi.m48737p(f > 0.0f ? (long) (jMin / f) : 1000L, this.E0, 1000L));
        }
    }

    /* renamed from: M */
    public final void m7675M() {
        ImageView imageView;
        if (m7665C() && this.y0 && (imageView = this.f8789q) != null) {
            if (this.F0 == 0) {
                m7671I(false, false, imageView);
                return;
            }
            mad madVar = this.x0;
            if (madVar == null) {
                m7671I(true, false, imageView);
                this.f8789q.setImageDrawable(this.l0);
                this.f8789q.setContentDescription(this.o0);
                return;
            }
            m7671I(true, true, imageView);
            int iMo7140l = madVar.mo7140l();
            if (iMo7140l == 0) {
                this.f8789q.setImageDrawable(this.l0);
                this.f8789q.setContentDescription(this.o0);
            } else if (iMo7140l == 1) {
                this.f8789q.setImageDrawable(this.m0);
                this.f8789q.setContentDescription(this.p0);
            } else if (iMo7140l == 2) {
                this.f8789q.setImageDrawable(this.n0);
                this.f8789q.setContentDescription(this.q0);
            }
            this.f8789q.setVisibility(0);
        }
    }

    /* renamed from: N */
    public final void m7676N() {
        ImageView imageView;
        if (m7665C() && this.y0 && (imageView = this.f8790s) != null) {
            mad madVar = this.x0;
            if (!this.K0) {
                m7671I(false, false, imageView);
                return;
            }
            if (madVar == null) {
                m7671I(true, false, imageView);
                this.f8790s.setImageDrawable(this.s0);
                this.f8790s.setContentDescription(this.w0);
            } else {
                m7671I(true, true, imageView);
                this.f8790s.setImageDrawable(madVar.mo7130Y() ? this.r0 : this.s0);
                this.f8790s.setContentDescription(madVar.mo7130Y() ? this.v0 : this.w0);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00d4 A[SYNTHETIC] */
    /* renamed from: O */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m7677O() {
        int i;
        lmh.C15106c c15106c;
        long jM37492n;
        mad madVar = this.x0;
        if (madVar == null) {
            return;
        }
        boolean z = true;
        this.B0 = this.z0 && m7662w(madVar.mo7112A(), this.i0);
        long j = 0;
        this.Q0 = 0L;
        lmh lmhVarMo7112A = madVar.mo7112A();
        if (lmhVarMo7112A.m37477q()) {
            i = 0;
        } else {
            int iMo7128W = madVar.mo7128W();
            boolean z2 = this.B0;
            int i2 = z2 ? 0 : iMo7128W;
            int iMo6954p = z2 ? lmhVarMo7112A.mo6954p() - 1 : iMo7128W;
            long j2 = 0;
            i = 0;
            while (true) {
                if (i2 > iMo6954p) {
                    break;
                }
                if (i2 == iMo7128W) {
                    this.Q0 = sqi.q1(j2);
                }
                lmhVarMo7112A.m37476n(i2, this.i0);
                lmh.C15106c c15106c2 = this.i0;
                if (c15106c2.f34092m == -9223372036854775807L) {
                    op0.m42517g(this.B0 ^ z);
                    break;
                }
                int i3 = c15106c2.f34093n;
                while (true) {
                    c15106c = this.i0;
                    if (i3 <= c15106c.f34094o) {
                        lmhVarMo7112A.m37473f(i3, this.h0);
                        int iM37481c = this.h0.m37481c();
                        for (int iM37493o = this.h0.m37493o(); iM37493o < iM37481c; iM37493o++) {
                            long jM37484f = this.h0.m37484f(iM37493o);
                            if (jM37484f == Long.MIN_VALUE) {
                                long j3 = this.h0.f34060d;
                                if (j3 != -9223372036854775807L) {
                                    jM37484f = j3;
                                    jM37492n = jM37484f + this.h0.m37492n();
                                    if (jM37492n < 0) {
                                        long[] jArr = this.M0;
                                        if (i == jArr.length) {
                                            int length = jArr.length == 0 ? 1 : jArr.length * 2;
                                            this.M0 = Arrays.copyOf(jArr, length);
                                            this.N0 = Arrays.copyOf(this.N0, length);
                                        }
                                        this.M0[i] = sqi.q1(j2 + jM37492n);
                                        this.N0[i] = this.h0.m37494p(iM37493o);
                                        i++;
                                    }
                                }
                            } else {
                                jM37492n = jM37484f + this.h0.m37492n();
                                if (jM37492n < 0) {
                                }
                            }
                        }
                        i3++;
                    }
                }
                j2 += c15106c.f34092m;
                i2++;
                z = true;
            }
            j = j2;
        }
        long jQ1 = sqi.q1(j);
        TextView textView = this.f8792y;
        if (textView != null) {
            textView.setText(sqi.n0(this.f8779M, this.f8780Q, jQ1));
        }
        InterfaceC2298b interfaceC2298b = this.f8778L;
        if (interfaceC2298b != null) {
            interfaceC2298b.setDuration(jQ1);
            int length2 = this.O0.length;
            int i4 = i + length2;
            long[] jArr2 = this.M0;
            if (i4 > jArr2.length) {
                this.M0 = Arrays.copyOf(jArr2, i4);
                this.N0 = Arrays.copyOf(this.N0, i4);
            }
            System.arraycopy(this.O0, 0, this.M0, i, length2);
            System.arraycopy(this.P0, 0, this.N0, i, length2);
            this.f8778L.setAdGroupTimesMs(this.M0, this.N0, i4);
        }
        m7674L();
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return m7678x(keyEvent) || super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            removeCallbacks(this.k0);
        } else if (motionEvent.getAction() == 1) {
            m7664A();
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public mad getPlayer() {
        return this.x0;
    }

    public int getRepeatToggleModes() {
        return this.F0;
    }

    public boolean getShowShuffleButton() {
        return this.K0;
    }

    public int getShowTimeoutMs() {
        return this.D0;
    }

    public boolean getShowVrButton() {
        View view = this.f8791x;
        return view != null && view.getVisibility() == 0;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.y0 = true;
        long j = this.L0;
        if (j != -9223372036854775807L) {
            long jUptimeMillis = j - SystemClock.uptimeMillis();
            if (jUptimeMillis <= 0) {
                m7679z();
            } else {
                postDelayed(this.k0, jUptimeMillis);
            }
        } else if (m7665C()) {
            m7664A();
        }
        m7670H();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.y0 = false;
        removeCallbacks(this.j0);
        removeCallbacks(this.k0);
    }

    public void setExtraAdGroupMarkers(long[] jArr, boolean[] zArr) {
        if (jArr == null) {
            this.O0 = new long[0];
            this.P0 = new boolean[0];
        } else {
            boolean[] zArr2 = (boolean[]) op0.m42515e(zArr);
            op0.m42511a(jArr.length == zArr2.length);
            this.O0 = jArr;
            this.P0 = zArr2;
        }
        m7677O();
    }

    public void setPlayer(mad madVar) {
        boolean z = true;
        op0.m42517g(Looper.myLooper() == Looper.getMainLooper());
        if (madVar != null && madVar.mo7114C() != Looper.getMainLooper()) {
            z = false;
        }
        op0.m42511a(z);
        mad madVar2 = this.x0;
        if (madVar2 == madVar) {
            return;
        }
        if (madVar2 != null) {
            madVar2.mo7113B(this.f8781a);
        }
        this.x0 = madVar;
        if (madVar != null) {
            madVar.mo7117G(this.f8781a);
        }
        m7670H();
    }

    public void setProgressUpdateListener(InterfaceC2271d interfaceC2271d) {
    }

    public void setRepeatToggleModes(int i) {
        this.F0 = i;
        mad madVar = this.x0;
        if (madVar != null) {
            int iMo7140l = madVar.mo7140l();
            if (i == 0 && iMo7140l != 0) {
                this.x0.mo7139j(0);
            } else if (i == 1 && iMo7140l == 2) {
                this.x0.mo7139j(1);
            } else if (i == 2 && iMo7140l == 1) {
                this.x0.mo7139j(2);
            }
        }
        m7675M();
    }

    public void setShowFastForwardButton(boolean z) {
        this.H0 = z;
        m7672J();
    }

    @Deprecated
    public void setShowMultiWindowTimeBar(boolean z) {
        this.z0 = z;
        m7677O();
    }

    public void setShowNextButton(boolean z) {
        this.J0 = z;
        m7672J();
    }

    public void setShowPlayButtonIfPlaybackIsSuppressed(boolean z) {
        this.A0 = z;
        m7673K();
    }

    public void setShowPreviousButton(boolean z) {
        this.I0 = z;
        m7672J();
    }

    public void setShowRewindButton(boolean z) {
        this.G0 = z;
        m7672J();
    }

    public void setShowShuffleButton(boolean z) {
        this.K0 = z;
        m7676N();
    }

    public void setShowTimeoutMs(int i) {
        this.D0 = i;
        if (m7665C()) {
            m7664A();
        }
    }

    public void setShowVrButton(boolean z) {
        View view = this.f8791x;
        if (view != null) {
            view.setVisibility(z ? 0 : 8);
        }
    }

    public void setTimeBarMinUpdateInterval(int i) {
        this.E0 = sqi.m48736o(i, 16, 1000);
    }

    public void setVrButtonListener(View.OnClickListener onClickListener) {
        View view = this.f8791x;
        if (view != null) {
            view.setOnClickListener(onClickListener);
            m7671I(getShowVrButton(), onClickListener != null, this.f8791x);
        }
    }

    /* renamed from: x */
    public boolean m7678x(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        mad madVar = this.x0;
        if (madVar == null || !m7639B(keyCode)) {
            return false;
        }
        if (keyEvent.getAction() != 0) {
            return true;
        }
        if (keyCode == 90) {
            if (madVar.mo7134c() == 4) {
                return true;
            }
            madVar.b0();
            return true;
        }
        if (keyCode == 89) {
            madVar.c0();
            return true;
        }
        if (keyEvent.getRepeatCount() != 0) {
            return true;
        }
        if (keyCode == 79 || keyCode == 85) {
            sqi.w0(madVar, this.A0);
            return true;
        }
        if (keyCode == 87) {
            madVar.mo31977E();
            return true;
        }
        if (keyCode == 88) {
            madVar.mo31987p();
            return true;
        }
        if (keyCode == 126) {
            sqi.v0(madVar);
            return true;
        }
        if (keyCode != 127) {
            return true;
        }
        sqi.u0(madVar);
        return true;
    }

    /* renamed from: z */
    public void m7679z() {
        if (m7665C()) {
            setVisibility(8);
            Iterator it = this.f8782b.iterator();
            if (it.hasNext()) {
                tq.m50332a(it.next());
                getVisibility();
                throw null;
            }
            removeCallbacks(this.j0);
            removeCallbacks(this.k0);
            this.L0 = -9223372036854775807L;
        }
    }

    public LegacyPlayerControlView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public LegacyPlayerControlView(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, attributeSet);
    }

    public LegacyPlayerControlView(Context context, AttributeSet attributeSet, int i, AttributeSet attributeSet2) {
        super(context, attributeSet, i);
        int resourceId = h9e.exo_legacy_player_control_view;
        this.A0 = true;
        this.D0 = 5000;
        this.F0 = 0;
        this.E0 = 200;
        this.L0 = -9223372036854775807L;
        this.G0 = true;
        this.H0 = true;
        this.I0 = true;
        this.J0 = true;
        this.K0 = false;
        if (attributeSet2 != null) {
            TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet2, rbe.LegacyPlayerControlView, i, 0);
            try {
                this.D0 = typedArrayObtainStyledAttributes.getInt(rbe.LegacyPlayerControlView_show_timeout, this.D0);
                resourceId = typedArrayObtainStyledAttributes.getResourceId(rbe.LegacyPlayerControlView_controller_layout_id, resourceId);
                this.F0 = m7663y(typedArrayObtainStyledAttributes, this.F0);
                this.G0 = typedArrayObtainStyledAttributes.getBoolean(rbe.LegacyPlayerControlView_show_rewind_button, this.G0);
                this.H0 = typedArrayObtainStyledAttributes.getBoolean(rbe.LegacyPlayerControlView_show_fastforward_button, this.H0);
                this.I0 = typedArrayObtainStyledAttributes.getBoolean(rbe.LegacyPlayerControlView_show_previous_button, this.I0);
                this.J0 = typedArrayObtainStyledAttributes.getBoolean(rbe.LegacyPlayerControlView_show_next_button, this.J0);
                this.K0 = typedArrayObtainStyledAttributes.getBoolean(rbe.LegacyPlayerControlView_show_shuffle_button, this.K0);
                setTimeBarMinUpdateInterval(typedArrayObtainStyledAttributes.getInt(rbe.LegacyPlayerControlView_time_bar_min_update_interval, this.E0));
            } finally {
                typedArrayObtainStyledAttributes.recycle();
            }
        }
        this.f8782b = new CopyOnWriteArrayList();
        this.h0 = new lmh.C15105b();
        this.i0 = new lmh.C15106c();
        StringBuilder sb = new StringBuilder();
        this.f8779M = sb;
        this.f8780Q = new Formatter(sb, Locale.getDefault());
        this.M0 = new long[0];
        this.N0 = new boolean[0];
        this.O0 = new long[0];
        this.P0 = new boolean[0];
        ViewOnClickListenerC2270c viewOnClickListenerC2270c = new ViewOnClickListenerC2270c();
        this.f8781a = viewOnClickListenerC2270c;
        this.j0 = new Runnable() { // from class: o.pba
            @Override // java.lang.Runnable
            public final void run() {
                this.f39775a.m7674L();
            }
        };
        this.k0 = new Runnable() { // from class: o.qba
            @Override // java.lang.Runnable
            public final void run() {
                this.f41592a.m7679z();
            }
        };
        LayoutInflater.from(context).inflate(resourceId, this);
        setDescendantFocusability(262144);
        InterfaceC2298b interfaceC2298b = (InterfaceC2298b) findViewById(a8e.exo_progress);
        View viewFindViewById = findViewById(a8e.exo_progress_placeholder);
        if (interfaceC2298b != null) {
            this.f8778L = interfaceC2298b;
        } else if (viewFindViewById != null) {
            DefaultTimeBar defaultTimeBar = new DefaultTimeBar(context, null, 0, attributeSet2);
            defaultTimeBar.setId(a8e.exo_progress);
            defaultTimeBar.setLayoutParams(viewFindViewById.getLayoutParams());
            ViewGroup viewGroup = (ViewGroup) viewFindViewById.getParent();
            int iIndexOfChild = viewGroup.indexOfChild(viewFindViewById);
            viewGroup.removeView(viewFindViewById);
            viewGroup.addView(defaultTimeBar, iIndexOfChild);
            this.f8778L = defaultTimeBar;
        } else {
            this.f8778L = null;
        }
        this.f8792y = (TextView) findViewById(a8e.exo_duration);
        this.f8777H = (TextView) findViewById(a8e.exo_position);
        InterfaceC2298b interfaceC2298b2 = this.f8778L;
        if (interfaceC2298b2 != null) {
            interfaceC2298b2.mo7621a(viewOnClickListenerC2270c);
        }
        View viewFindViewById2 = findViewById(a8e.exo_play);
        this.f8785e = viewFindViewById2;
        if (viewFindViewById2 != null) {
            viewFindViewById2.setOnClickListener(viewOnClickListenerC2270c);
        }
        View viewFindViewById3 = findViewById(a8e.exo_pause);
        this.f8786f = viewFindViewById3;
        if (viewFindViewById3 != null) {
            viewFindViewById3.setOnClickListener(viewOnClickListenerC2270c);
        }
        View viewFindViewById4 = findViewById(a8e.exo_prev);
        this.f8783c = viewFindViewById4;
        if (viewFindViewById4 != null) {
            viewFindViewById4.setOnClickListener(viewOnClickListenerC2270c);
        }
        View viewFindViewById5 = findViewById(a8e.exo_next);
        this.f8784d = viewFindViewById5;
        if (viewFindViewById5 != null) {
            viewFindViewById5.setOnClickListener(viewOnClickListenerC2270c);
        }
        View viewFindViewById6 = findViewById(a8e.exo_rew);
        this.f8788h = viewFindViewById6;
        if (viewFindViewById6 != null) {
            viewFindViewById6.setOnClickListener(viewOnClickListenerC2270c);
        }
        View viewFindViewById7 = findViewById(a8e.exo_ffwd);
        this.f8787g = viewFindViewById7;
        if (viewFindViewById7 != null) {
            viewFindViewById7.setOnClickListener(viewOnClickListenerC2270c);
        }
        ImageView imageView = (ImageView) findViewById(a8e.exo_repeat_toggle);
        this.f8789q = imageView;
        if (imageView != null) {
            imageView.setOnClickListener(viewOnClickListenerC2270c);
        }
        ImageView imageView2 = (ImageView) findViewById(a8e.exo_shuffle);
        this.f8790s = imageView2;
        if (imageView2 != null) {
            imageView2.setOnClickListener(viewOnClickListenerC2270c);
        }
        View viewFindViewById8 = findViewById(a8e.exo_vr);
        this.f8791x = viewFindViewById8;
        setShowVrButton(false);
        m7671I(false, false, viewFindViewById8);
        Resources resources = context.getResources();
        this.t0 = resources.getInteger(c9e.exo_media_button_opacity_percentage_enabled) / 100.0f;
        this.u0 = resources.getInteger(c9e.exo_media_button_opacity_percentage_disabled) / 100.0f;
        this.l0 = sqi.m48719X(context, resources, q7e.exo_legacy_controls_repeat_off);
        this.m0 = sqi.m48719X(context, resources, q7e.exo_legacy_controls_repeat_one);
        this.n0 = sqi.m48719X(context, resources, q7e.exo_legacy_controls_repeat_all);
        this.r0 = sqi.m48719X(context, resources, q7e.exo_legacy_controls_shuffle_on);
        this.s0 = sqi.m48719X(context, resources, q7e.exo_legacy_controls_shuffle_off);
        this.o0 = resources.getString(aae.exo_controls_repeat_off_description);
        this.p0 = resources.getString(aae.exo_controls_repeat_one_description);
        this.q0 = resources.getString(aae.exo_controls_repeat_all_description);
        this.v0 = resources.getString(aae.exo_controls_shuffle_on_description);
        this.w0 = resources.getString(aae.exo_controls_shuffle_off_description);
        this.R0 = -9223372036854775807L;
        this.S0 = -9223372036854775807L;
    }
}
