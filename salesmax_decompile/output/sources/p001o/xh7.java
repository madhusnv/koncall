package p001o;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.media3.ui.PlayerView;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textview.MaterialTextView;

/* loaded from: classes.dex */
public abstract class xh7 extends ewi {
    public final PlayerView n0;
    public final MaterialButton o0;
    public final MaterialButton p0;
    public final LinearLayout q0;
    public final MaterialButton r0;
    public final MaterialButton s0;
    public final MaterialTextView t0;
    public final MaterialTextView u0;
    public final FrameLayout v0;
    public final LinearLayout w0;
    public boolean x0;

    public xh7(Object obj, View view, int i, PlayerView playerView, MaterialButton materialButton, MaterialButton materialButton2, LinearLayout linearLayout, MaterialButton materialButton3, MaterialButton materialButton4, MaterialTextView materialTextView, MaterialTextView materialTextView2, FrameLayout frameLayout, LinearLayout linearLayout2) {
        super(obj, view, i);
        this.n0 = playerView;
        this.o0 = materialButton;
        this.p0 = materialButton2;
        this.q0 = linearLayout;
        this.r0 = materialButton3;
        this.s0 = materialButton4;
        this.t0 = materialTextView;
        this.u0 = materialTextView2;
        this.v0 = frameLayout;
        this.w0 = linearLayout2;
    }

    public static xh7 h0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        zt4.m59873g();
        return i0(layoutInflater, viewGroup, z, null);
    }

    public static xh7 i0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (xh7) ewi.m25668F(layoutInflater, p9e.fragment_recording_dialog, viewGroup, z, obj);
    }
}
