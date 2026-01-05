package androidx.media3.ui;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.media3.common.C2181a;
import androidx.media3.ui.InterfaceC2298b;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.location.DeviceOrientationRequest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Formatter;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArrayList;
import p001o.a8e;
import p001o.aae;
import p001o.c9e;
import p001o.euh;
import p001o.g7e;
import p001o.h9e;
import p001o.ibd;
import p001o.lae;
import p001o.lmh;
import p001o.mad;
import p001o.nf8;
import p001o.op0;
import p001o.pke;
import p001o.ppe;
import p001o.q7e;
import p001o.qth;
import p001o.rbe;
import p001o.sqi;
import p001o.t2b;
import p001o.t9e;
import p001o.tth;
import p001o.ui5;
import p001o.v5e;
import p001o.x7e;
import p001o.xth;
import p001o.yth;

/* loaded from: classes2.dex */
public class PlayerControlView extends FrameLayout {
    public static final float[] o1;
    public final Runnable A0;
    public final Drawable B0;
    public final Drawable C0;
    public final Drawable D0;
    public final Drawable E0;
    public final Drawable F0;
    public final String G0;

    /* renamed from: H */
    public final ImageView f8794H;
    public final String H0;
    public final String I0;
    public final Drawable J0;
    public final Drawable K0;

    /* renamed from: L */
    public final ImageView f8795L;
    public final float L0;

    /* renamed from: M */
    public final ImageView f8796M;
    public final float M0;
    public final String N0;
    public final String O0;
    public final Drawable P0;

    /* renamed from: Q */
    public final View f8797Q;
    public final Drawable Q0;
    public final String R0;
    public final String S0;
    public final Drawable T0;
    public final Drawable U0;
    public final String V0;
    public final String W0;
    public mad X0;
    public InterfaceC2275d Y0;
    public boolean Z0;

    /* renamed from: a */
    public final ibd f8798a;
    public boolean a1;

    /* renamed from: b */
    public final Resources f8799b;
    public boolean b1;

    /* renamed from: c */
    public final ViewOnClickListenerC2274c f8800c;
    public boolean c1;

    /* renamed from: d */
    public final CopyOnWriteArrayList f8801d;
    public boolean d1;

    /* renamed from: e */
    public final RecyclerView f8802e;
    public boolean e1;

    /* renamed from: f */
    public final C2279h f8803f;
    public int f1;

    /* renamed from: g */
    public final C2276e f8804g;
    public int g1;

    /* renamed from: h */
    public final C2281j f8805h;
    public final View h0;
    public int h1;
    public final TextView i0;
    public long[] i1;
    public final TextView j0;
    public boolean[] j1;
    public final ImageView k0;
    public long[] k1;
    public final ImageView l0;
    public boolean[] l1;
    public final ImageView m0;
    public long m1;
    public final ImageView n0;
    public boolean n1;
    public final ImageView o0;
    public final ImageView p0;

    /* renamed from: q */
    public final C2273b f8806q;
    public final View q0;
    public final View r0;

    /* renamed from: s */
    public final tth f8807s;
    public final View s0;
    public final TextView t0;
    public final TextView u0;
    public final InterfaceC2298b v0;
    public final StringBuilder w0;

    /* renamed from: x */
    public final PopupWindow f8808x;
    public final Formatter x0;

    /* renamed from: y */
    public final int f8809y;
    public final lmh.C15105b y0;
    public final lmh.C15106c z0;

    /* renamed from: androidx.media3.ui.PlayerControlView$b */
    public final class C2273b extends AbstractC2283l {
        public C2273b() {
            super();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: n */
        public /* synthetic */ void m7738n(View view) {
            if (PlayerControlView.this.X0 == null || !PlayerControlView.this.X0.mo31989x(29)) {
                return;
            }
            ((mad) sqi.m48729h(PlayerControlView.this.X0)).mo7132a(PlayerControlView.this.X0.mo7115D().mo26856a().mo26876D(1).mo26880J(1, false).mo26875C());
            PlayerControlView.this.f8803f.m7758g(1, PlayerControlView.this.getResources().getString(aae.exo_track_selection_auto));
            PlayerControlView.this.f8808x.dismiss();
        }

        @Override // androidx.media3.ui.PlayerControlView.AbstractC2283l
        /* renamed from: h */
        public void mo7739h(C2280i c2280i) {
            c2280i.f8824u.setText(aae.exo_track_selection_auto);
            c2280i.f8825v.setVisibility(m7741l(((mad) op0.m42515e(PlayerControlView.this.X0)).mo7115D()) ? 4 : 0);
            c2280i.f9794a.setOnClickListener(new View.OnClickListener() { // from class: o.qad
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f41536a.m7738n(view);
                }
            });
        }

        @Override // androidx.media3.ui.PlayerControlView.AbstractC2283l
        /* renamed from: j */
        public void mo7740j(String str) {
            PlayerControlView.this.f8803f.m7758g(1, str);
        }

        /* renamed from: l */
        public final boolean m7741l(yth ythVar) {
            for (int i = 0; i < this.f8830a.size(); i++) {
                if (ythVar.f55973A.containsKey(((C2282k) this.f8830a.get(i)).f8827a.m25632a())) {
                    return true;
                }
            }
            return false;
        }

        /* renamed from: m */
        public void m7742m(List list) {
            this.f8830a = list;
            yth ythVarMo7115D = ((mad) op0.m42515e(PlayerControlView.this.X0)).mo7115D();
            if (list.isEmpty()) {
                PlayerControlView.this.f8803f.m7758g(1, PlayerControlView.this.getResources().getString(aae.exo_track_selection_none));
                return;
            }
            if (!m7741l(ythVarMo7115D)) {
                PlayerControlView.this.f8803f.m7758g(1, PlayerControlView.this.getResources().getString(aae.exo_track_selection_auto));
                return;
            }
            for (int i = 0; i < list.size(); i++) {
                C2282k c2282k = (C2282k) list.get(i);
                if (c2282k.m7764a()) {
                    PlayerControlView.this.f8803f.m7758g(1, c2282k.f8829c);
                    return;
                }
            }
        }
    }

    /* renamed from: androidx.media3.ui.PlayerControlView$c */
    public final class ViewOnClickListenerC2274c implements mad.InterfaceC15266d, InterfaceC2298b.a, View.OnClickListener, PopupWindow.OnDismissListener {
        public ViewOnClickListenerC2274c() {
        }

        @Override // androidx.media3.ui.InterfaceC2298b.a
        /* renamed from: E */
        public void mo7681E(InterfaceC2298b interfaceC2298b, long j) {
            PlayerControlView.this.e1 = true;
            if (PlayerControlView.this.u0 != null) {
                PlayerControlView.this.u0.setText(sqi.n0(PlayerControlView.this.w0, PlayerControlView.this.x0, j));
            }
            PlayerControlView.this.f8798a.m31882V();
        }

        @Override // androidx.media3.ui.InterfaceC2298b.a
        /* renamed from: G */
        public void mo7682G(InterfaceC2298b interfaceC2298b, long j) {
            if (PlayerControlView.this.u0 != null) {
                PlayerControlView.this.u0.setText(sqi.n0(PlayerControlView.this.w0, PlayerControlView.this.x0, j));
            }
        }

        @Override // androidx.media3.ui.InterfaceC2298b.a
        /* renamed from: L */
        public void mo7683L(InterfaceC2298b interfaceC2298b, long j, boolean z) {
            PlayerControlView.this.e1 = false;
            if (!z && PlayerControlView.this.X0 != null) {
                PlayerControlView playerControlView = PlayerControlView.this;
                playerControlView.l0(playerControlView.X0, j);
            }
            PlayerControlView.this.f8798a.m31883W();
        }

        @Override // p001o.mad.InterfaceC15266d
        /* renamed from: X */
        public void mo7684X(mad madVar, mad.C15265c c15265c) {
            if (c15265c.m38651b(4, 5, 13)) {
                PlayerControlView.this.u0();
            }
            if (c15265c.m38651b(4, 5, 7, 13)) {
                PlayerControlView.this.w0();
            }
            if (c15265c.m38651b(8, 13)) {
                PlayerControlView.this.x0();
            }
            if (c15265c.m38651b(9, 13)) {
                PlayerControlView.this.B0();
            }
            if (c15265c.m38651b(8, 9, 11, 0, 16, 17, 13)) {
                PlayerControlView.this.t0();
            }
            if (c15265c.m38651b(11, 0, 13)) {
                PlayerControlView.this.C0();
            }
            if (c15265c.m38651b(12, 13)) {
                PlayerControlView.this.v0();
            }
            if (c15265c.m38651b(2, 13)) {
                PlayerControlView.this.D0();
            }
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            mad madVar = PlayerControlView.this.X0;
            if (madVar == null) {
                return;
            }
            PlayerControlView.this.f8798a.m31883W();
            if (PlayerControlView.this.f8795L == view) {
                if (madVar.mo31989x(9)) {
                    madVar.mo31977E();
                    return;
                }
                return;
            }
            if (PlayerControlView.this.f8794H == view) {
                if (madVar.mo31989x(7)) {
                    madVar.mo31987p();
                    return;
                }
                return;
            }
            if (PlayerControlView.this.f8797Q == view) {
                if (madVar.mo7134c() == 4 || !madVar.mo31989x(12)) {
                    return;
                }
                madVar.b0();
                return;
            }
            if (PlayerControlView.this.h0 == view) {
                if (madVar.mo31989x(11)) {
                    madVar.c0();
                    return;
                }
                return;
            }
            if (PlayerControlView.this.f8796M == view) {
                sqi.w0(madVar, PlayerControlView.this.c1);
                return;
            }
            if (PlayerControlView.this.k0 == view) {
                if (madVar.mo31989x(15)) {
                    madVar.mo7139j(pke.m43810a(madVar.mo7140l(), PlayerControlView.this.h1));
                    return;
                }
                return;
            }
            if (PlayerControlView.this.l0 == view) {
                if (madVar.mo31989x(14)) {
                    madVar.mo7120K(!madVar.mo7130Y());
                    return;
                }
                return;
            }
            if (PlayerControlView.this.q0 == view) {
                PlayerControlView.this.f8798a.m31882V();
                PlayerControlView playerControlView = PlayerControlView.this;
                playerControlView.m7733V(playerControlView.f8803f, PlayerControlView.this.q0);
                return;
            }
            if (PlayerControlView.this.r0 == view) {
                PlayerControlView.this.f8798a.m31882V();
                PlayerControlView playerControlView2 = PlayerControlView.this;
                playerControlView2.m7733V(playerControlView2.f8804g, PlayerControlView.this.r0);
            } else if (PlayerControlView.this.s0 == view) {
                PlayerControlView.this.f8798a.m31882V();
                PlayerControlView playerControlView3 = PlayerControlView.this;
                playerControlView3.m7733V(playerControlView3.f8806q, PlayerControlView.this.s0);
            } else if (PlayerControlView.this.n0 == view) {
                PlayerControlView.this.f8798a.m31882V();
                PlayerControlView playerControlView4 = PlayerControlView.this;
                playerControlView4.m7733V(playerControlView4.f8805h, PlayerControlView.this.n0);
            }
        }

        @Override // android.widget.PopupWindow.OnDismissListener
        public void onDismiss() {
            if (PlayerControlView.this.n1) {
                PlayerControlView.this.f8798a.m31883W();
            }
        }
    }

    /* renamed from: androidx.media3.ui.PlayerControlView$d */
    public interface InterfaceC2275d {
        /* renamed from: G */
        void mo7743G(boolean z);
    }

    /* renamed from: androidx.media3.ui.PlayerControlView$e */
    public final class C2276e extends RecyclerView.AbstractC2371h {

        /* renamed from: a */
        public final String[] f8812a;

        /* renamed from: b */
        public final float[] f8813b;

        /* renamed from: c */
        public int f8814c;

        public C2276e(String[] strArr, float[] fArr) {
            this.f8812a = strArr;
            this.f8813b = fArr;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: f */
        public /* synthetic */ void m7745f(int i, View view) {
            if (i != this.f8814c) {
                PlayerControlView.this.setPlaybackSpeed(this.f8813b[i]);
            }
            PlayerControlView.this.f8808x.dismiss();
        }

        /* renamed from: e */
        public String m7746e() {
            return this.f8812a[this.f8814c];
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC2371h
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public void onBindViewHolder(C2280i c2280i, final int i) {
            String[] strArr = this.f8812a;
            if (i < strArr.length) {
                c2280i.f8824u.setText(strArr[i]);
            }
            if (i == this.f8814c) {
                c2280i.f9794a.setSelected(true);
                c2280i.f8825v.setVisibility(0);
            } else {
                c2280i.f9794a.setSelected(false);
                c2280i.f8825v.setVisibility(4);
            }
            c2280i.f9794a.setOnClickListener(new View.OnClickListener() { // from class: o.rad
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f43322a.m7745f(i, view);
                }
            });
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC2371h
        public int getItemCount() {
            return this.f8812a.length;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC2371h
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public C2280i onCreateViewHolder(ViewGroup viewGroup, int i) {
            return new C2280i(LayoutInflater.from(PlayerControlView.this.getContext()).inflate(h9e.exo_styled_sub_settings_list_item, viewGroup, false));
        }

        /* renamed from: i */
        public void m7749i(float f) {
            int i = 0;
            float f2 = Float.MAX_VALUE;
            int i2 = 0;
            while (true) {
                float[] fArr = this.f8813b;
                if (i >= fArr.length) {
                    this.f8814c = i2;
                    return;
                }
                float fAbs = Math.abs(f - fArr[i]);
                if (fAbs < f2) {
                    i2 = i;
                    f2 = fAbs;
                }
                i++;
            }
        }
    }

    /* renamed from: androidx.media3.ui.PlayerControlView$f */
    public interface InterfaceC2277f {
    }

    /* renamed from: androidx.media3.ui.PlayerControlView$g */
    public final class C2278g extends RecyclerView.d0 {

        /* renamed from: u */
        public final TextView f8816u;

        /* renamed from: v */
        public final TextView f8817v;

        /* renamed from: w */
        public final ImageView f8818w;

        public C2278g(View view) {
            super(view);
            if (sqi.f45790a < 26) {
                view.setFocusable(true);
            }
            this.f8816u = (TextView) view.findViewById(a8e.exo_main_text);
            this.f8817v = (TextView) view.findViewById(a8e.exo_sub_text);
            this.f8818w = (ImageView) view.findViewById(a8e.exo_icon);
            view.setOnClickListener(new View.OnClickListener() { // from class: o.sad
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    this.f45088a.m7754S(view2);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: S */
        public /* synthetic */ void m7754S(View view) {
            PlayerControlView.this.i0(m9148l());
        }
    }

    /* renamed from: androidx.media3.ui.PlayerControlView$h */
    public class C2279h extends RecyclerView.AbstractC2371h {

        /* renamed from: a */
        public final String[] f8820a;

        /* renamed from: b */
        public final String[] f8821b;

        /* renamed from: c */
        public final Drawable[] f8822c;

        public C2279h(String[] strArr, Drawable[] drawableArr) {
            this.f8820a = strArr;
            this.f8821b = new String[strArr.length];
            this.f8822c = drawableArr;
        }

        /* renamed from: d */
        public boolean m7755d() {
            return m7759h(1) || m7759h(0);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC2371h
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public void onBindViewHolder(C2278g c2278g, int i) {
            if (m7759h(i)) {
                c2278g.f9794a.setLayoutParams(new RecyclerView.LayoutParams(-1, -2));
            } else {
                c2278g.f9794a.setLayoutParams(new RecyclerView.LayoutParams(0, 0));
            }
            c2278g.f8816u.setText(this.f8820a[i]);
            if (this.f8821b[i] == null) {
                c2278g.f8817v.setVisibility(8);
            } else {
                c2278g.f8817v.setText(this.f8821b[i]);
            }
            if (this.f8822c[i] == null) {
                c2278g.f8818w.setVisibility(8);
            } else {
                c2278g.f8818w.setImageDrawable(this.f8822c[i]);
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC2371h
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public C2278g onCreateViewHolder(ViewGroup viewGroup, int i) {
            return PlayerControlView.this.new C2278g(LayoutInflater.from(PlayerControlView.this.getContext()).inflate(h9e.exo_styled_settings_list_item, viewGroup, false));
        }

        /* renamed from: g */
        public void m7758g(int i, String str) {
            this.f8821b[i] = str;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC2371h
        public int getItemCount() {
            return this.f8820a.length;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC2371h
        public long getItemId(int i) {
            return i;
        }

        /* renamed from: h */
        public final boolean m7759h(int i) {
            if (PlayerControlView.this.X0 == null) {
                return false;
            }
            if (i == 0) {
                return PlayerControlView.this.X0.mo31989x(13);
            }
            if (i != 1) {
                return true;
            }
            return PlayerControlView.this.X0.mo31989x(30) && PlayerControlView.this.X0.mo31989x(29);
        }
    }

    /* renamed from: androidx.media3.ui.PlayerControlView$i */
    public static class C2280i extends RecyclerView.d0 {

        /* renamed from: u */
        public final TextView f8824u;

        /* renamed from: v */
        public final View f8825v;

        public C2280i(View view) {
            super(view);
            if (sqi.f45790a < 26) {
                view.setFocusable(true);
            }
            this.f8824u = (TextView) view.findViewById(a8e.exo_text);
            this.f8825v = view.findViewById(a8e.exo_check);
        }
    }

    /* renamed from: androidx.media3.ui.PlayerControlView$j */
    public final class C2281j extends AbstractC2283l {
        public C2281j() {
            super();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: m */
        public /* synthetic */ void m7761m(View view) {
            if (PlayerControlView.this.X0 == null || !PlayerControlView.this.X0.mo31989x(29)) {
                return;
            }
            PlayerControlView.this.X0.mo7132a(PlayerControlView.this.X0.mo7115D().mo26856a().mo26876D(3).mo26877G(-3).mo26875C());
            PlayerControlView.this.f8808x.dismiss();
        }

        @Override // androidx.media3.ui.PlayerControlView.AbstractC2283l, androidx.recyclerview.widget.RecyclerView.AbstractC2371h
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public void onBindViewHolder(C2280i c2280i, int i) {
            super.onBindViewHolder(c2280i, i);
            if (i > 0) {
                c2280i.f8825v.setVisibility(((C2282k) this.f8830a.get(i + (-1))).m7764a() ? 0 : 4);
            }
        }

        @Override // androidx.media3.ui.PlayerControlView.AbstractC2283l
        /* renamed from: h */
        public void mo7739h(C2280i c2280i) {
            boolean z;
            c2280i.f8824u.setText(aae.exo_track_selection_none);
            int i = 0;
            while (true) {
                if (i >= this.f8830a.size()) {
                    z = true;
                    break;
                } else {
                    if (((C2282k) this.f8830a.get(i)).m7764a()) {
                        z = false;
                        break;
                    }
                    i++;
                }
            }
            c2280i.f8825v.setVisibility(z ? 0 : 4);
            c2280i.f9794a.setOnClickListener(new View.OnClickListener() { // from class: o.tad
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f46743a.m7761m(view);
                }
            });
        }

        @Override // androidx.media3.ui.PlayerControlView.AbstractC2283l
        /* renamed from: j */
        public void mo7740j(String str) {
        }

        /* renamed from: l */
        public void m7763l(List list) {
            boolean z = false;
            int i = 0;
            while (true) {
                if (i >= list.size()) {
                    break;
                }
                if (((C2282k) list.get(i)).m7764a()) {
                    z = true;
                    break;
                }
                i++;
            }
            if (PlayerControlView.this.n0 != null) {
                ImageView imageView = PlayerControlView.this.n0;
                PlayerControlView playerControlView = PlayerControlView.this;
                imageView.setImageDrawable(z ? playerControlView.P0 : playerControlView.Q0);
                PlayerControlView.this.n0.setContentDescription(z ? PlayerControlView.this.R0 : PlayerControlView.this.S0);
            }
            this.f8830a = list;
        }
    }

    /* renamed from: androidx.media3.ui.PlayerControlView$k */
    public static final class C2282k {

        /* renamed from: a */
        public final euh.C13263a f8827a;

        /* renamed from: b */
        public final int f8828b;

        /* renamed from: c */
        public final String f8829c;

        public C2282k(euh euhVar, int i, int i2, String str) {
            this.f8827a = (euh.C13263a) euhVar.m25627a().get(i);
            this.f8828b = i2;
            this.f8829c = str;
        }

        /* renamed from: a */
        public boolean m7764a() {
            return this.f8827a.m25638g(this.f8828b);
        }
    }

    /* renamed from: androidx.media3.ui.PlayerControlView$l */
    public abstract class AbstractC2283l extends RecyclerView.AbstractC2371h {

        /* renamed from: a */
        public List f8830a = new ArrayList();

        public AbstractC2283l() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: f */
        public /* synthetic */ void m7766f(mad madVar, qth qthVar, C2282k c2282k, View view) {
            if (madVar.mo31989x(29)) {
                madVar.mo7132a(madVar.mo7115D().mo26856a().mo26878H(new xth(qthVar, nf8.m40500F(Integer.valueOf(c2282k.f8828b)))).mo26880J(c2282k.f8827a.m25634c(), false).mo26875C());
                mo7740j(c2282k.f8829c);
                PlayerControlView.this.f8808x.dismiss();
            }
        }

        /* renamed from: e */
        public void m7767e() {
            this.f8830a = Collections.emptyList();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC2371h
        /* renamed from: g */
        public void onBindViewHolder(C2280i c2280i, int i) {
            final mad madVar = PlayerControlView.this.X0;
            if (madVar == null) {
                return;
            }
            if (i == 0) {
                mo7739h(c2280i);
                return;
            }
            final C2282k c2282k = (C2282k) this.f8830a.get(i - 1);
            final qth qthVarM25632a = c2282k.f8827a.m25632a();
            boolean z = madVar.mo7115D().f55973A.get(qthVarM25632a) != null && c2282k.m7764a();
            c2280i.f8824u.setText(c2282k.f8829c);
            c2280i.f8825v.setVisibility(z ? 0 : 4);
            c2280i.f9794a.setOnClickListener(new View.OnClickListener() { // from class: o.uad
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f48646a.m7766f(madVar, qthVarM25632a, c2282k, view);
                }
            });
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC2371h
        public int getItemCount() {
            if (this.f8830a.isEmpty()) {
                return 0;
            }
            return this.f8830a.size() + 1;
        }

        /* renamed from: h */
        public abstract void mo7739h(C2280i c2280i);

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC2371h
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public C2280i onCreateViewHolder(ViewGroup viewGroup, int i) {
            return new C2280i(LayoutInflater.from(PlayerControlView.this.getContext()).inflate(h9e.exo_styled_sub_settings_list_item, viewGroup, false));
        }

        /* renamed from: j */
        public abstract void mo7740j(String str);
    }

    /* renamed from: androidx.media3.ui.PlayerControlView$m */
    public interface InterfaceC2284m {
        /* renamed from: E */
        void mo7769E(int i);
    }

    static {
        t2b.m49198a("media3.ui");
        o1 = new float[]{0.25f, 0.5f, 0.75f, 1.0f, 1.25f, 1.5f, 2.0f};
    }

    public PlayerControlView(Context context) {
        this(context, null);
    }

    /* renamed from: T */
    public static boolean m7703T(mad madVar, lmh.C15106c c15106c) {
        lmh lmhVarMo7112A;
        int iMo6954p;
        if (!madVar.mo31989x(17) || (iMo6954p = (lmhVarMo7112A = madVar.mo7112A()).mo6954p()) <= 1 || iMo6954p > 100) {
            return false;
        }
        for (int i = 0; i < iMo6954p; i++) {
            if (lmhVarMo7112A.m37476n(i, c15106c).f34092m == -9223372036854775807L) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: X */
    public static int m7704X(TypedArray typedArray, int i) {
        return typedArray.getInt(rbe.PlayerControlView_repeat_toggle_modes, i);
    }

    public static void b0(View view, View.OnClickListener onClickListener) {
        if (view == null) {
            return;
        }
        view.setVisibility(8);
        view.setOnClickListener(onClickListener);
    }

    public static boolean d0(int i) {
        return i == 90 || i == 89 || i == 85 || i == 79 || i == 126 || i == 127 || i == 87 || i == 88;
    }

    public static void s0(View view, boolean z) {
        if (view == null) {
            return;
        }
        if (z) {
            view.setVisibility(0);
        } else {
            view.setVisibility(8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPlaybackSpeed(float f) {
        mad madVar = this.X0;
        if (madVar == null || !madVar.mo31989x(13)) {
            return;
        }
        mad madVar2 = this.X0;
        madVar2.mo7135d(madVar2.mo7136e().m35248b(f));
    }

    public final void A0() {
        this.f8802e.measure(0, 0);
        this.f8808x.setWidth(Math.min(this.f8802e.getMeasuredWidth(), getWidth() - (this.f8809y * 2)));
        this.f8808x.setHeight(Math.min(getHeight() - (this.f8809y * 2), this.f8802e.getMeasuredHeight()));
    }

    public final void B0() {
        ImageView imageView;
        if (e0() && this.a1 && (imageView = this.l0) != null) {
            mad madVar = this.X0;
            if (!this.f8798a.m31867A(imageView)) {
                p0(false, this.l0);
                return;
            }
            if (madVar == null || !madVar.mo31989x(14)) {
                p0(false, this.l0);
                this.l0.setImageDrawable(this.K0);
                this.l0.setContentDescription(this.O0);
            } else {
                p0(true, this.l0);
                this.l0.setImageDrawable(madVar.mo7130Y() ? this.J0 : this.K0);
                this.l0.setContentDescription(madVar.mo7130Y() ? this.N0 : this.O0);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00dd A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void C0() {
        long jO0;
        int i;
        lmh.C15106c c15106c;
        long jM37492n;
        mad madVar = this.X0;
        if (madVar == null) {
            return;
        }
        boolean z = true;
        this.d1 = this.b1 && m7703T(madVar, this.z0);
        this.m1 = 0L;
        lmh lmhVarMo7112A = madVar.mo31989x(17) ? madVar.mo7112A() : lmh.f34048a;
        if (!lmhVarMo7112A.m37477q()) {
            int iMo7128W = madVar.mo7128W();
            boolean z2 = this.d1;
            int i2 = z2 ? 0 : iMo7128W;
            int iMo6954p = z2 ? lmhVarMo7112A.mo6954p() - 1 : iMo7128W;
            long j = 0;
            i = 0;
            while (true) {
                if (i2 > iMo6954p) {
                    break;
                }
                if (i2 == iMo7128W) {
                    this.m1 = sqi.q1(j);
                }
                lmhVarMo7112A.m37476n(i2, this.z0);
                lmh.C15106c c15106c2 = this.z0;
                if (c15106c2.f34092m == -9223372036854775807L) {
                    op0.m42517g(this.d1 ^ z);
                    break;
                }
                int i3 = c15106c2.f34093n;
                while (true) {
                    c15106c = this.z0;
                    if (i3 <= c15106c.f34094o) {
                        lmhVarMo7112A.m37473f(i3, this.y0);
                        int iM37481c = this.y0.m37481c();
                        for (int iM37493o = this.y0.m37493o(); iM37493o < iM37481c; iM37493o++) {
                            long jM37484f = this.y0.m37484f(iM37493o);
                            if (jM37484f == Long.MIN_VALUE) {
                                long j2 = this.y0.f34060d;
                                if (j2 != -9223372036854775807L) {
                                    jM37484f = j2;
                                    jM37492n = jM37484f + this.y0.m37492n();
                                    if (jM37492n < 0) {
                                        long[] jArr = this.i1;
                                        if (i == jArr.length) {
                                            int length = jArr.length == 0 ? 1 : jArr.length * 2;
                                            this.i1 = Arrays.copyOf(jArr, length);
                                            this.j1 = Arrays.copyOf(this.j1, length);
                                        }
                                        this.i1[i] = sqi.q1(j + jM37492n);
                                        this.j1[i] = this.y0.m37494p(iM37493o);
                                        i++;
                                    }
                                }
                            } else {
                                jM37492n = jM37484f + this.y0.m37492n();
                                if (jM37492n < 0) {
                                }
                            }
                        }
                        i3++;
                    }
                }
                j += c15106c.f34092m;
                i2++;
                z = true;
            }
            jO0 = j;
        } else if (madVar.mo31989x(16)) {
            long jMo31979M = madVar.mo31979M();
            jO0 = jMo31979M != -9223372036854775807L ? sqi.O0(jMo31979M) : 0L;
            i = 0;
        }
        long jQ1 = sqi.q1(jO0);
        TextView textView = this.t0;
        if (textView != null) {
            textView.setText(sqi.n0(this.w0, this.x0, jQ1));
        }
        InterfaceC2298b interfaceC2298b = this.v0;
        if (interfaceC2298b != null) {
            interfaceC2298b.setDuration(jQ1);
            int length2 = this.k1.length;
            int i4 = i + length2;
            long[] jArr2 = this.i1;
            if (i4 > jArr2.length) {
                this.i1 = Arrays.copyOf(jArr2, i4);
                this.j1 = Arrays.copyOf(this.j1, i4);
            }
            System.arraycopy(this.k1, 0, this.i1, i, length2);
            System.arraycopy(this.l1, 0, this.j1, i, length2);
            this.v0.setAdGroupTimesMs(this.i1, this.j1, i4);
        }
        w0();
    }

    public final void D0() {
        a0();
        p0(this.f8805h.getItemCount() > 0, this.n0);
        z0();
    }

    /* renamed from: S */
    public void m7731S(InterfaceC2284m interfaceC2284m) {
        op0.m42515e(interfaceC2284m);
        this.f8801d.add(interfaceC2284m);
    }

    /* renamed from: U */
    public boolean m7732U(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        mad madVar = this.X0;
        if (madVar == null || !d0(keyCode)) {
            return false;
        }
        if (keyEvent.getAction() != 0) {
            return true;
        }
        if (keyCode == 90) {
            if (madVar.mo7134c() == 4 || !madVar.mo31989x(12)) {
                return true;
            }
            madVar.b0();
            return true;
        }
        if (keyCode == 89 && madVar.mo31989x(11)) {
            madVar.c0();
            return true;
        }
        if (keyEvent.getRepeatCount() != 0) {
            return true;
        }
        if (keyCode == 79 || keyCode == 85) {
            sqi.w0(madVar, this.c1);
            return true;
        }
        if (keyCode == 87) {
            if (!madVar.mo31989x(9)) {
                return true;
            }
            madVar.mo31977E();
            return true;
        }
        if (keyCode == 88) {
            if (!madVar.mo31989x(7)) {
                return true;
            }
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

    /* renamed from: V */
    public final void m7733V(RecyclerView.AbstractC2371h abstractC2371h, View view) {
        this.f8802e.setAdapter(abstractC2371h);
        A0();
        this.n1 = false;
        this.f8808x.dismiss();
        this.n1 = true;
        this.f8808x.showAsDropDown(view, (getWidth() - this.f8808x.getWidth()) - this.f8809y, (-this.f8808x.getHeight()) - this.f8809y);
    }

    /* renamed from: W */
    public final nf8 m7734W(euh euhVar, int i) {
        nf8.C15566a c15566a = new nf8.C15566a();
        nf8 nf8VarM25627a = euhVar.m25627a();
        for (int i2 = 0; i2 < nf8VarM25627a.size(); i2++) {
            euh.C13263a c13263a = (euh.C13263a) nf8VarM25627a.get(i2);
            if (c13263a.m25634c() == i) {
                for (int i3 = 0; i3 < c13263a.f22208a; i3++) {
                    if (c13263a.m25639h(i3)) {
                        C2181a c2181aM25633b = c13263a.m25633b(i3);
                        if ((c2181aM25633b.f7934e & 2) == 0) {
                            c15566a.mo32056a(new C2282k(euhVar, i2, i3, this.f8807s.mo50586a(c2181aM25633b)));
                        }
                    }
                }
            }
        }
        return c15566a.m40520k();
    }

    /* renamed from: Y */
    public void m7735Y() {
        this.f8798a.m31868C();
    }

    /* renamed from: Z */
    public void m7736Z() {
        this.f8798a.m31871F();
    }

    public final void a0() {
        this.f8805h.m7767e();
        this.f8806q.m7767e();
        mad madVar = this.X0;
        if (madVar != null && madVar.mo31989x(30) && this.X0.mo31989x(29)) {
            euh euhVarMo7145t = this.X0.mo7145t();
            this.f8806q.m7742m(m7734W(euhVarMo7145t, 1));
            if (this.f8798a.m31867A(this.n0)) {
                this.f8805h.m7763l(m7734W(euhVarMo7145t, 3));
            } else {
                this.f8805h.m7763l(nf8.m40499E());
            }
        }
    }

    public boolean c0() {
        return this.f8798a.m31874I();
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return m7732U(keyEvent) || super.dispatchKeyEvent(keyEvent);
    }

    public boolean e0() {
        return getVisibility() == 0;
    }

    public void f0() {
        Iterator it = this.f8801d.iterator();
        while (it.hasNext()) {
            ((InterfaceC2284m) it.next()).mo7769E(getVisibility());
        }
    }

    public final void g0(View view) {
        if (this.Y0 == null) {
            return;
        }
        boolean z = !this.Z0;
        this.Z0 = z;
        r0(this.o0, z);
        r0(this.p0, this.Z0);
        InterfaceC2275d interfaceC2275d = this.Y0;
        if (interfaceC2275d != null) {
            interfaceC2275d.mo7743G(this.Z0);
        }
    }

    public mad getPlayer() {
        return this.X0;
    }

    public int getRepeatToggleModes() {
        return this.h1;
    }

    public boolean getShowShuffleButton() {
        return this.f8798a.m31867A(this.l0);
    }

    public boolean getShowSubtitleButton() {
        return this.f8798a.m31867A(this.n0);
    }

    public int getShowTimeoutMs() {
        return this.f1;
    }

    public boolean getShowVrButton() {
        return this.f8798a.m31867A(this.m0);
    }

    public final void h0(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        int i9 = i4 - i2;
        int i10 = i8 - i6;
        if (!(i3 - i == i7 - i5 && i9 == i10) && this.f8808x.isShowing()) {
            A0();
            this.f8808x.update(view, (getWidth() - this.f8808x.getWidth()) - this.f8809y, (-this.f8808x.getHeight()) - this.f8809y, -1, -1);
        }
    }

    public final void i0(int i) {
        if (i == 0) {
            m7733V(this.f8804g, (View) op0.m42515e(this.q0));
        } else if (i == 1) {
            m7733V(this.f8806q, (View) op0.m42515e(this.q0));
        } else {
            this.f8808x.dismiss();
        }
    }

    public void j0(InterfaceC2284m interfaceC2284m) {
        this.f8801d.remove(interfaceC2284m);
    }

    public void k0() {
        ImageView imageView = this.f8796M;
        if (imageView != null) {
            imageView.requestFocus();
        }
    }

    public final void l0(mad madVar, long j) {
        if (this.d1) {
            if (madVar.mo31989x(17) && madVar.mo31989x(10)) {
                lmh lmhVarMo7112A = madVar.mo7112A();
                int iMo6954p = lmhVarMo7112A.mo6954p();
                int i = 0;
                while (true) {
                    long jM37502d = lmhVarMo7112A.m37476n(i, this.z0).m37502d();
                    if (j < jM37502d) {
                        break;
                    }
                    if (i == iMo6954p - 1) {
                        j = jM37502d;
                        break;
                    } else {
                        j -= jM37502d;
                        i++;
                    }
                }
                madVar.mo31978H(i, j);
            }
        } else if (madVar.mo31989x(5)) {
            madVar.mo31984h(j);
        }
        w0();
    }

    public final boolean m0() {
        mad madVar = this.X0;
        return (madVar == null || !madVar.mo31989x(1) || (this.X0.mo31989x(17) && this.X0.mo7112A().m37477q())) ? false : true;
    }

    public void n0() {
        this.f8798a.b0();
    }

    public void o0() {
        u0();
        t0();
        x0();
        B0();
        D0();
        v0();
        C0();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f8798a.m31875O();
        this.a1 = true;
        if (c0()) {
            this.f8798a.m31883W();
        }
        o0();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f8798a.m31876P();
        this.a1 = false;
        removeCallbacks(this.A0);
        this.f8798a.m31882V();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.f8798a.m31877Q(z, i, i2, i3, i4);
    }

    public final void p0(boolean z, View view) {
        if (view == null) {
            return;
        }
        view.setEnabled(z);
        view.setAlpha(z ? this.L0 : this.M0);
    }

    public final void q0() {
        mad madVar = this.X0;
        int iMo7126S = (int) ((madVar != null ? madVar.mo7126S() : 15000L) / 1000);
        TextView textView = this.i0;
        if (textView != null) {
            textView.setText(String.valueOf(iMo7126S));
        }
        View view = this.f8797Q;
        if (view != null) {
            view.setContentDescription(this.f8799b.getQuantityString(t9e.exo_controls_fastforward_by_amount_description, iMo7126S, Integer.valueOf(iMo7126S)));
        }
    }

    public final void r0(ImageView imageView, boolean z) {
        if (imageView == null) {
            return;
        }
        if (z) {
            imageView.setImageDrawable(this.T0);
            imageView.setContentDescription(this.V0);
        } else {
            imageView.setImageDrawable(this.U0);
            imageView.setContentDescription(this.W0);
        }
    }

    public void setAnimationEnabled(boolean z) {
        this.f8798a.m31884X(z);
    }

    public void setExtraAdGroupMarkers(long[] jArr, boolean[] zArr) {
        if (jArr == null) {
            this.k1 = new long[0];
            this.l1 = new boolean[0];
        } else {
            boolean[] zArr2 = (boolean[]) op0.m42515e(zArr);
            op0.m42511a(jArr.length == zArr2.length);
            this.k1 = jArr;
            this.l1 = zArr2;
        }
        C0();
    }

    @Deprecated
    public void setOnFullScreenModeChangedListener(InterfaceC2275d interfaceC2275d) {
        this.Y0 = interfaceC2275d;
        s0(this.o0, interfaceC2275d != null);
        s0(this.p0, interfaceC2275d != null);
    }

    public void setPlayer(mad madVar) {
        boolean z = true;
        op0.m42517g(Looper.myLooper() == Looper.getMainLooper());
        if (madVar != null && madVar.mo7114C() != Looper.getMainLooper()) {
            z = false;
        }
        op0.m42511a(z);
        mad madVar2 = this.X0;
        if (madVar2 == madVar) {
            return;
        }
        if (madVar2 != null) {
            madVar2.mo7113B(this.f8800c);
        }
        this.X0 = madVar;
        if (madVar != null) {
            madVar.mo7117G(this.f8800c);
        }
        o0();
    }

    public void setProgressUpdateListener(InterfaceC2277f interfaceC2277f) {
    }

    public void setRepeatToggleModes(int i) {
        this.h1 = i;
        mad madVar = this.X0;
        if (madVar != null && madVar.mo31989x(15)) {
            int iMo7140l = this.X0.mo7140l();
            if (i == 0 && iMo7140l != 0) {
                this.X0.mo7139j(0);
            } else if (i == 1 && iMo7140l == 2) {
                this.X0.mo7139j(1);
            } else if (i == 2 && iMo7140l == 1) {
                this.X0.mo7139j(2);
            }
        }
        this.f8798a.m31885Y(this.k0, i != 0);
        x0();
    }

    public void setShowFastForwardButton(boolean z) {
        this.f8798a.m31885Y(this.f8797Q, z);
        t0();
    }

    @Deprecated
    public void setShowMultiWindowTimeBar(boolean z) {
        this.b1 = z;
        C0();
    }

    public void setShowNextButton(boolean z) {
        this.f8798a.m31885Y(this.f8795L, z);
        t0();
    }

    public void setShowPlayButtonIfPlaybackIsSuppressed(boolean z) {
        this.c1 = z;
        u0();
    }

    public void setShowPreviousButton(boolean z) {
        this.f8798a.m31885Y(this.f8794H, z);
        t0();
    }

    public void setShowRewindButton(boolean z) {
        this.f8798a.m31885Y(this.h0, z);
        t0();
    }

    public void setShowShuffleButton(boolean z) {
        this.f8798a.m31885Y(this.l0, z);
        B0();
    }

    public void setShowSubtitleButton(boolean z) {
        this.f8798a.m31885Y(this.n0, z);
    }

    public void setShowTimeoutMs(int i) {
        this.f1 = i;
        if (c0()) {
            this.f8798a.m31883W();
        }
    }

    public void setShowVrButton(boolean z) {
        this.f8798a.m31885Y(this.m0, z);
    }

    public void setTimeBarMinUpdateInterval(int i) {
        this.g1 = sqi.m48736o(i, 16, 1000);
    }

    public void setVrButtonListener(View.OnClickListener onClickListener) {
        ImageView imageView = this.m0;
        if (imageView != null) {
            imageView.setOnClickListener(onClickListener);
            p0(onClickListener != null, this.m0);
        }
    }

    public final void t0() {
        boolean zMo31989x;
        boolean zMo31989x2;
        boolean zMo31989x3;
        boolean zMo31989x4;
        boolean zMo31989x5;
        if (e0() && this.a1) {
            mad madVar = this.X0;
            if (madVar != null) {
                zMo31989x = (this.b1 && m7703T(madVar, this.z0)) ? madVar.mo31989x(10) : madVar.mo31989x(5);
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
            if (zMo31989x4) {
                y0();
            }
            if (zMo31989x5) {
                q0();
            }
            p0(zMo31989x3, this.f8794H);
            p0(zMo31989x4, this.h0);
            p0(zMo31989x5, this.f8797Q);
            p0(zMo31989x2, this.f8795L);
            InterfaceC2298b interfaceC2298b = this.v0;
            if (interfaceC2298b != null) {
                interfaceC2298b.setEnabled(zMo31989x);
            }
        }
    }

    public final void u0() {
        if (e0() && this.a1 && this.f8796M != null) {
            boolean zH1 = sqi.h1(this.X0, this.c1);
            Drawable drawable = zH1 ? this.B0 : this.C0;
            int i = zH1 ? aae.exo_controls_play_description : aae.exo_controls_pause_description;
            this.f8796M.setImageDrawable(drawable);
            this.f8796M.setContentDescription(this.f8799b.getString(i));
            p0(m0(), this.f8796M);
        }
    }

    public final void v0() {
        mad madVar = this.X0;
        if (madVar == null) {
            return;
        }
        this.f8804g.m7749i(madVar.mo7136e().f31768a);
        this.f8803f.m7758g(0, this.f8804g.m7746e());
        z0();
    }

    public final void w0() {
        long jMo7127T;
        long jMo7131Z;
        if (e0() && this.a1) {
            mad madVar = this.X0;
            if (madVar == null || !madVar.mo31989x(16)) {
                jMo7127T = 0;
                jMo7131Z = 0;
            } else {
                jMo7127T = this.m1 + madVar.mo7127T();
                jMo7131Z = this.m1 + madVar.mo7131Z();
            }
            TextView textView = this.u0;
            if (textView != null && !this.e1) {
                textView.setText(sqi.n0(this.w0, this.x0, jMo7127T));
            }
            InterfaceC2298b interfaceC2298b = this.v0;
            if (interfaceC2298b != null) {
                interfaceC2298b.setPosition(jMo7127T);
                this.v0.setBufferedPosition(jMo7131Z);
            }
            removeCallbacks(this.A0);
            int iMo7134c = madVar == null ? 1 : madVar.mo7134c();
            if (madVar == null || !madVar.mo31982V()) {
                if (iMo7134c == 4 || iMo7134c == 1) {
                    return;
                }
                postDelayed(this.A0, 1000L);
                return;
            }
            InterfaceC2298b interfaceC2298b2 = this.v0;
            long jMin = Math.min(interfaceC2298b2 != null ? interfaceC2298b2.getPreferredUpdateDelay() : 1000L, 1000 - (jMo7127T % 1000));
            float f = madVar.mo7136e().f31768a;
            postDelayed(this.A0, sqi.m48737p(f > 0.0f ? (long) (jMin / f) : 1000L, this.g1, 1000L));
        }
    }

    public final void x0() {
        ImageView imageView;
        if (e0() && this.a1 && (imageView = this.k0) != null) {
            if (this.h1 == 0) {
                p0(false, imageView);
                return;
            }
            mad madVar = this.X0;
            if (madVar == null || !madVar.mo31989x(15)) {
                p0(false, this.k0);
                this.k0.setImageDrawable(this.D0);
                this.k0.setContentDescription(this.G0);
                return;
            }
            p0(true, this.k0);
            int iMo7140l = madVar.mo7140l();
            if (iMo7140l == 0) {
                this.k0.setImageDrawable(this.D0);
                this.k0.setContentDescription(this.G0);
            } else if (iMo7140l == 1) {
                this.k0.setImageDrawable(this.E0);
                this.k0.setContentDescription(this.H0);
            } else {
                if (iMo7140l != 2) {
                    return;
                }
                this.k0.setImageDrawable(this.F0);
                this.k0.setContentDescription(this.I0);
            }
        }
    }

    public final void y0() {
        mad madVar = this.X0;
        int iF0 = (int) ((madVar != null ? madVar.f0() : DeviceOrientationRequest.OUTPUT_PERIOD_FAST) / 1000);
        TextView textView = this.j0;
        if (textView != null) {
            textView.setText(String.valueOf(iF0));
        }
        View view = this.h0;
        if (view != null) {
            view.setContentDescription(this.f8799b.getQuantityString(t9e.exo_controls_rewind_by_amount_description, iF0, Integer.valueOf(iF0)));
        }
    }

    public final void z0() {
        p0(this.f8803f.m7755d(), this.q0);
    }

    public PlayerControlView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public PlayerControlView(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, attributeSet);
    }

    public PlayerControlView(Context context, AttributeSet attributeSet, int i, AttributeSet attributeSet2) throws Throwable {
        int i2;
        final PlayerControlView playerControlView;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        ViewOnClickListenerC2274c viewOnClickListenerC2274c;
        final PlayerControlView playerControlView2;
        ImageView imageView;
        boolean z9;
        int i20;
        boolean z10;
        int i21;
        boolean z11;
        boolean z12;
        super(context, attributeSet, i);
        int i22 = h9e.exo_player_control_view;
        int i23 = q7e.exo_styled_controls_play;
        int i24 = q7e.exo_styled_controls_pause;
        int i25 = q7e.exo_styled_controls_next;
        int i26 = q7e.exo_styled_controls_simple_fastforward;
        int i27 = q7e.exo_styled_controls_previous;
        int i28 = q7e.exo_styled_controls_simple_rewind;
        int i29 = q7e.exo_styled_controls_fullscreen_exit;
        int i30 = q7e.exo_styled_controls_fullscreen_enter;
        int i31 = q7e.exo_styled_controls_repeat_off;
        int i32 = q7e.exo_styled_controls_repeat_one;
        int i33 = q7e.exo_styled_controls_repeat_all;
        int i34 = q7e.exo_styled_controls_shuffle_on;
        int i35 = q7e.exo_styled_controls_shuffle_off;
        int i36 = q7e.exo_styled_controls_subtitle_on;
        int i37 = q7e.exo_styled_controls_subtitle_off;
        int i38 = q7e.exo_styled_controls_vr;
        this.c1 = true;
        this.f1 = 5000;
        this.h1 = 0;
        this.g1 = 200;
        if (attributeSet2 != null) {
            TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet2, rbe.PlayerControlView, i, 0);
            try {
                int resourceId = typedArrayObtainStyledAttributes.getResourceId(rbe.PlayerControlView_controller_layout_id, i22);
                int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(rbe.PlayerControlView_play_icon, i23);
                int resourceId3 = typedArrayObtainStyledAttributes.getResourceId(rbe.PlayerControlView_pause_icon, i24);
                int resourceId4 = typedArrayObtainStyledAttributes.getResourceId(rbe.PlayerControlView_next_icon, i25);
                int resourceId5 = typedArrayObtainStyledAttributes.getResourceId(rbe.PlayerControlView_fastforward_icon, i26);
                int resourceId6 = typedArrayObtainStyledAttributes.getResourceId(rbe.PlayerControlView_previous_icon, i27);
                int resourceId7 = typedArrayObtainStyledAttributes.getResourceId(rbe.PlayerControlView_rewind_icon, i28);
                int resourceId8 = typedArrayObtainStyledAttributes.getResourceId(rbe.PlayerControlView_fullscreen_exit_icon, i29);
                int resourceId9 = typedArrayObtainStyledAttributes.getResourceId(rbe.PlayerControlView_fullscreen_enter_icon, i30);
                int resourceId10 = typedArrayObtainStyledAttributes.getResourceId(rbe.PlayerControlView_repeat_off_icon, i31);
                int resourceId11 = typedArrayObtainStyledAttributes.getResourceId(rbe.PlayerControlView_repeat_one_icon, i32);
                int resourceId12 = typedArrayObtainStyledAttributes.getResourceId(rbe.PlayerControlView_repeat_all_icon, i33);
                int resourceId13 = typedArrayObtainStyledAttributes.getResourceId(rbe.PlayerControlView_shuffle_on_icon, i34);
                int resourceId14 = typedArrayObtainStyledAttributes.getResourceId(rbe.PlayerControlView_shuffle_off_icon, i35);
                int resourceId15 = typedArrayObtainStyledAttributes.getResourceId(rbe.PlayerControlView_subtitle_on_icon, i36);
                int resourceId16 = typedArrayObtainStyledAttributes.getResourceId(rbe.PlayerControlView_subtitle_off_icon, i37);
                int resourceId17 = typedArrayObtainStyledAttributes.getResourceId(rbe.PlayerControlView_vr_icon, i38);
                playerControlView = this;
                try {
                    playerControlView.f1 = typedArrayObtainStyledAttributes.getInt(rbe.PlayerControlView_show_timeout, playerControlView.f1);
                    playerControlView.h1 = m7704X(typedArrayObtainStyledAttributes, playerControlView.h1);
                    boolean z13 = typedArrayObtainStyledAttributes.getBoolean(rbe.PlayerControlView_show_rewind_button, true);
                    boolean z14 = typedArrayObtainStyledAttributes.getBoolean(rbe.PlayerControlView_show_fastforward_button, true);
                    boolean z15 = typedArrayObtainStyledAttributes.getBoolean(rbe.PlayerControlView_show_previous_button, true);
                    boolean z16 = typedArrayObtainStyledAttributes.getBoolean(rbe.PlayerControlView_show_next_button, true);
                    boolean z17 = typedArrayObtainStyledAttributes.getBoolean(rbe.PlayerControlView_show_shuffle_button, false);
                    boolean z18 = typedArrayObtainStyledAttributes.getBoolean(rbe.PlayerControlView_show_subtitle_button, false);
                    boolean z19 = typedArrayObtainStyledAttributes.getBoolean(rbe.PlayerControlView_show_vr_button, false);
                    playerControlView.setTimeBarMinUpdateInterval(typedArrayObtainStyledAttributes.getInt(rbe.PlayerControlView_time_bar_min_update_interval, playerControlView.g1));
                    boolean z20 = typedArrayObtainStyledAttributes.getBoolean(rbe.PlayerControlView_animation_enabled, true);
                    typedArrayObtainStyledAttributes.recycle();
                    i18 = resourceId14;
                    i17 = resourceId;
                    z8 = z20;
                    i3 = resourceId6;
                    i4 = resourceId7;
                    i5 = resourceId8;
                    i6 = resourceId9;
                    i7 = resourceId10;
                    i8 = resourceId11;
                    i9 = resourceId12;
                    i10 = resourceId13;
                    i11 = resourceId15;
                    i12 = resourceId16;
                    i2 = resourceId17;
                    z = z13;
                    z2 = z14;
                    z3 = z15;
                    z4 = z16;
                    z5 = z17;
                    z6 = z18;
                    z7 = z19;
                    i13 = resourceId2;
                    i14 = resourceId3;
                    i15 = resourceId5;
                    i16 = resourceId4;
                } catch (Throwable th) {
                    th = th;
                    typedArrayObtainStyledAttributes.recycle();
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } else {
            i2 = i38;
            playerControlView = this;
            i3 = i27;
            i4 = i28;
            i5 = i29;
            i6 = i30;
            i7 = i31;
            i8 = i32;
            i9 = i33;
            i10 = i34;
            i11 = i36;
            i12 = i37;
            z = true;
            z2 = true;
            z3 = true;
            z4 = true;
            z5 = false;
            z6 = false;
            z7 = false;
            z8 = true;
            i13 = i23;
            i14 = i24;
            i15 = i26;
            i16 = i25;
            i17 = i22;
            i18 = i35;
        }
        LayoutInflater.from(context).inflate(i17, playerControlView);
        playerControlView.setDescendantFocusability(262144);
        ViewOnClickListenerC2274c viewOnClickListenerC2274c2 = new ViewOnClickListenerC2274c();
        playerControlView.f8800c = viewOnClickListenerC2274c2;
        playerControlView.f8801d = new CopyOnWriteArrayList();
        playerControlView.y0 = new lmh.C15105b();
        playerControlView.z0 = new lmh.C15106c();
        StringBuilder sb = new StringBuilder();
        playerControlView.w0 = sb;
        int i39 = i15;
        playerControlView.x0 = new Formatter(sb, Locale.getDefault());
        playerControlView.i1 = new long[0];
        playerControlView.j1 = new boolean[0];
        playerControlView.k1 = new long[0];
        playerControlView.l1 = new boolean[0];
        playerControlView.A0 = new Runnable() { // from class: o.nad
            @Override // java.lang.Runnable
            public final void run() {
                this.f36633a.w0();
            }
        };
        playerControlView.t0 = (TextView) playerControlView.findViewById(a8e.exo_duration);
        playerControlView.u0 = (TextView) playerControlView.findViewById(a8e.exo_position);
        ImageView imageView2 = (ImageView) playerControlView.findViewById(a8e.exo_subtitle);
        playerControlView.n0 = imageView2;
        if (imageView2 != null) {
            imageView2.setOnClickListener(viewOnClickListenerC2274c2);
        }
        ImageView imageView3 = (ImageView) playerControlView.findViewById(a8e.exo_fullscreen);
        playerControlView.o0 = imageView3;
        b0(imageView3, new View.OnClickListener() { // from class: o.oad
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f38010a.g0(view);
            }
        });
        ImageView imageView4 = (ImageView) playerControlView.findViewById(a8e.exo_minimal_fullscreen);
        playerControlView.p0 = imageView4;
        b0(imageView4, new View.OnClickListener() { // from class: o.oad
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f38010a.g0(view);
            }
        });
        View viewFindViewById = playerControlView.findViewById(a8e.exo_settings);
        playerControlView.q0 = viewFindViewById;
        if (viewFindViewById != null) {
            viewFindViewById.setOnClickListener(viewOnClickListenerC2274c2);
        }
        View viewFindViewById2 = playerControlView.findViewById(a8e.exo_playback_speed);
        playerControlView.r0 = viewFindViewById2;
        if (viewFindViewById2 != null) {
            viewFindViewById2.setOnClickListener(viewOnClickListenerC2274c2);
        }
        View viewFindViewById3 = playerControlView.findViewById(a8e.exo_audio_track);
        playerControlView.s0 = viewFindViewById3;
        if (viewFindViewById3 != null) {
            viewFindViewById3.setOnClickListener(viewOnClickListenerC2274c2);
        }
        InterfaceC2298b interfaceC2298b = (InterfaceC2298b) playerControlView.findViewById(a8e.exo_progress);
        View viewFindViewById4 = playerControlView.findViewById(a8e.exo_progress_placeholder);
        if (interfaceC2298b != null) {
            playerControlView.v0 = interfaceC2298b;
            i19 = i3;
            viewOnClickListenerC2274c = viewOnClickListenerC2274c2;
            playerControlView2 = playerControlView;
            imageView = imageView2;
            z9 = z4;
            i20 = i39;
            z10 = z3;
            i21 = i16;
        } else if (viewFindViewById4 != null) {
            i19 = i3;
            viewOnClickListenerC2274c = viewOnClickListenerC2274c2;
            z9 = z4;
            i20 = i39;
            imageView = imageView2;
            z10 = z3;
            i21 = i16;
            DefaultTimeBar defaultTimeBar = new DefaultTimeBar(context, null, 0, attributeSet2, lae.ExoStyledControls_TimeBar);
            defaultTimeBar.setId(a8e.exo_progress);
            defaultTimeBar.setLayoutParams(viewFindViewById4.getLayoutParams());
            ViewGroup viewGroup = (ViewGroup) viewFindViewById4.getParent();
            int iIndexOfChild = viewGroup.indexOfChild(viewFindViewById4);
            viewGroup.removeView(viewFindViewById4);
            viewGroup.addView(defaultTimeBar, iIndexOfChild);
            playerControlView2 = this;
            playerControlView2.v0 = defaultTimeBar;
        } else {
            i19 = i3;
            viewOnClickListenerC2274c = viewOnClickListenerC2274c2;
            playerControlView2 = playerControlView;
            imageView = imageView2;
            z9 = z4;
            i20 = i39;
            z10 = z3;
            i21 = i16;
            playerControlView2.v0 = null;
        }
        InterfaceC2298b interfaceC2298b2 = playerControlView2.v0;
        ViewOnClickListenerC2274c viewOnClickListenerC2274c3 = viewOnClickListenerC2274c;
        if (interfaceC2298b2 != null) {
            interfaceC2298b2.mo7621a(viewOnClickListenerC2274c3);
        }
        Resources resources = context.getResources();
        playerControlView2.f8799b = resources;
        ImageView imageView5 = (ImageView) playerControlView2.findViewById(a8e.exo_play_pause);
        playerControlView2.f8796M = imageView5;
        if (imageView5 != null) {
            imageView5.setOnClickListener(viewOnClickListenerC2274c3);
        }
        ImageView imageView6 = (ImageView) playerControlView2.findViewById(a8e.exo_prev);
        playerControlView2.f8794H = imageView6;
        if (imageView6 != null) {
            imageView6.setImageDrawable(sqi.m48719X(context, resources, i19));
            imageView6.setOnClickListener(viewOnClickListenerC2274c3);
        }
        ImageView imageView7 = (ImageView) playerControlView2.findViewById(a8e.exo_next);
        playerControlView2.f8795L = imageView7;
        if (imageView7 != null) {
            imageView7.setImageDrawable(sqi.m48719X(context, resources, i21));
            imageView7.setOnClickListener(viewOnClickListenerC2274c3);
        }
        Typeface typefaceM44036g = ppe.m44036g(context, x7e.roboto_medium_numbers);
        ImageView imageView8 = (ImageView) playerControlView2.findViewById(a8e.exo_rew);
        TextView textView = (TextView) playerControlView2.findViewById(a8e.exo_rew_with_amount);
        if (imageView8 != null) {
            z11 = z;
            imageView8.setImageDrawable(sqi.m48719X(context, resources, i4));
            playerControlView2.h0 = imageView8;
            playerControlView2.j0 = null;
        } else {
            z11 = z;
            if (textView != null) {
                textView.setTypeface(typefaceM44036g);
                playerControlView2.j0 = textView;
                playerControlView2.h0 = textView;
            } else {
                playerControlView2.j0 = null;
                playerControlView2.h0 = null;
            }
        }
        View view = playerControlView2.h0;
        if (view != null) {
            view.setOnClickListener(viewOnClickListenerC2274c3);
        }
        ImageView imageView9 = (ImageView) playerControlView2.findViewById(a8e.exo_ffwd);
        TextView textView2 = (TextView) playerControlView2.findViewById(a8e.exo_ffwd_with_amount);
        if (imageView9 != null) {
            imageView9.setImageDrawable(sqi.m48719X(context, resources, i20));
            playerControlView2.f8797Q = imageView9;
            playerControlView2.i0 = null;
        } else if (textView2 != null) {
            textView2.setTypeface(typefaceM44036g);
            playerControlView2.i0 = textView2;
            playerControlView2.f8797Q = textView2;
        } else {
            playerControlView2.i0 = null;
            playerControlView2.f8797Q = null;
        }
        View view2 = playerControlView2.f8797Q;
        if (view2 != null) {
            view2.setOnClickListener(viewOnClickListenerC2274c3);
        }
        ImageView imageView10 = (ImageView) playerControlView2.findViewById(a8e.exo_repeat_toggle);
        playerControlView2.k0 = imageView10;
        if (imageView10 != null) {
            imageView10.setOnClickListener(viewOnClickListenerC2274c3);
        }
        ImageView imageView11 = (ImageView) playerControlView2.findViewById(a8e.exo_shuffle);
        playerControlView2.l0 = imageView11;
        if (imageView11 != null) {
            imageView11.setOnClickListener(viewOnClickListenerC2274c3);
        }
        playerControlView2.L0 = resources.getInteger(c9e.exo_media_button_opacity_percentage_enabled) / 100.0f;
        playerControlView2.M0 = resources.getInteger(c9e.exo_media_button_opacity_percentage_disabled) / 100.0f;
        ImageView imageView12 = (ImageView) playerControlView2.findViewById(a8e.exo_vr);
        playerControlView2.m0 = imageView12;
        if (imageView12 != null) {
            imageView12.setImageDrawable(sqi.m48719X(context, resources, i2));
            playerControlView2.p0(false, imageView12);
        }
        ibd ibdVar = new ibd(playerControlView2);
        playerControlView2.f8798a = ibdVar;
        ibdVar.m31884X(z8);
        C2279h c2279h = playerControlView2.new C2279h(new String[]{resources.getString(aae.exo_controls_playback_speed), resources.getString(aae.exo_track_selection_title_audio)}, new Drawable[]{sqi.m48719X(context, resources, q7e.exo_styled_controls_speed), sqi.m48719X(context, resources, q7e.exo_styled_controls_audiotrack)});
        playerControlView2.f8803f = c2279h;
        playerControlView2.f8809y = resources.getDimensionPixelSize(g7e.exo_settings_offset);
        RecyclerView recyclerView = (RecyclerView) LayoutInflater.from(context).inflate(h9e.exo_styled_settings_list, (ViewGroup) null);
        playerControlView2.f8802e = recyclerView;
        recyclerView.setAdapter(c2279h);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        PopupWindow popupWindow = new PopupWindow((View) recyclerView, -2, -2, true);
        playerControlView2.f8808x = popupWindow;
        if (sqi.f45790a < 23) {
            z12 = false;
            popupWindow.setBackgroundDrawable(new ColorDrawable(0));
        } else {
            z12 = false;
        }
        popupWindow.setOnDismissListener(viewOnClickListenerC2274c3);
        playerControlView2.n1 = true;
        playerControlView2.f8807s = new ui5(getResources());
        playerControlView2.P0 = sqi.m48719X(context, resources, i11);
        playerControlView2.Q0 = sqi.m48719X(context, resources, i12);
        playerControlView2.R0 = resources.getString(aae.exo_controls_cc_enabled_description);
        playerControlView2.S0 = resources.getString(aae.exo_controls_cc_disabled_description);
        playerControlView2.f8805h = new C2281j();
        playerControlView2.f8806q = new C2273b();
        playerControlView2.f8804g = playerControlView2.new C2276e(resources.getStringArray(v5e.exo_controls_playback_speeds), o1);
        playerControlView2.B0 = sqi.m48719X(context, resources, i13);
        playerControlView2.C0 = sqi.m48719X(context, resources, i14);
        playerControlView2.T0 = sqi.m48719X(context, resources, i5);
        playerControlView2.U0 = sqi.m48719X(context, resources, i6);
        playerControlView2.D0 = sqi.m48719X(context, resources, i7);
        playerControlView2.E0 = sqi.m48719X(context, resources, i8);
        playerControlView2.F0 = sqi.m48719X(context, resources, i9);
        playerControlView2.J0 = sqi.m48719X(context, resources, i10);
        playerControlView2.K0 = sqi.m48719X(context, resources, i18);
        playerControlView2.V0 = resources.getString(aae.exo_controls_fullscreen_exit_description);
        playerControlView2.W0 = resources.getString(aae.exo_controls_fullscreen_enter_description);
        playerControlView2.G0 = resources.getString(aae.exo_controls_repeat_off_description);
        playerControlView2.H0 = resources.getString(aae.exo_controls_repeat_one_description);
        playerControlView2.I0 = resources.getString(aae.exo_controls_repeat_all_description);
        playerControlView2.N0 = resources.getString(aae.exo_controls_shuffle_on_description);
        playerControlView2.O0 = resources.getString(aae.exo_controls_shuffle_off_description);
        ibdVar.m31885Y((ViewGroup) playerControlView2.findViewById(a8e.exo_bottom_bar), true);
        ibdVar.m31885Y(playerControlView2.f8797Q, z2);
        ibdVar.m31885Y(playerControlView2.h0, z11);
        ibdVar.m31885Y(imageView6, z10);
        ibdVar.m31885Y(imageView7, z9);
        ibdVar.m31885Y(imageView11, z5);
        ibdVar.m31885Y(imageView, z6);
        ibdVar.m31885Y(imageView12, z7);
        ibdVar.m31885Y(imageView10, playerControlView2.h1 != 0 ? true : z12);
        playerControlView2.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: o.pad
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view3, int i40, int i41, int i42, int i43, int i44, int i45, int i46, int i47) {
                this.f39708a.h0(view3, i40, i41, i42, i43, i44, i45, i46, i47);
            }
        });
    }
}
