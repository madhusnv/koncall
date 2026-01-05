package p001o;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textview.MaterialTextView;

/* loaded from: classes.dex */
public abstract class ei7 extends ewi {
    public final Button n0;
    public final ImageView o0;
    public final View p0;
    public final FrameLayout q0;
    public final MaterialButton r0;
    public final MaterialButton s0;
    public final LinearLayout t0;
    public final MaterialButton u0;
    public final ScrollView v0;
    public final MaterialTextView w0;

    public ei7(Object obj, View view, int i, Button button, ImageView imageView, View view2, FrameLayout frameLayout, MaterialButton materialButton, MaterialButton materialButton2, LinearLayout linearLayout, MaterialButton materialButton3, ScrollView scrollView, MaterialTextView materialTextView) {
        super(obj, view, i);
        this.n0 = button;
        this.o0 = imageView;
        this.p0 = view2;
        this.q0 = frameLayout;
        this.r0 = materialButton;
        this.s0 = materialButton2;
        this.t0 = linearLayout;
        this.u0 = materialButton3;
        this.v0 = scrollView;
        this.w0 = materialTextView;
    }

    public static ei7 h0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        zt4.m59873g();
        return i0(layoutInflater, viewGroup, z, null);
    }

    public static ei7 i0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (ei7) ewi.m25668F(layoutInflater, p9e.fragment_streaming_voice_note, viewGroup, z, obj);
    }
}
