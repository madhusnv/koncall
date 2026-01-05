package p001o;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import androidx.cardview.widget.CardView;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textview.MaterialTextView;
import p001o.ewi;

/* loaded from: classes.dex */
public class fi7 extends ei7 {
    public static final SparseIntArray A0;
    public static final ewi.C13274i z0 = null;
    public final CardView x0;
    public long y0;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        A0 = sparseIntArray;
        sparseIntArray.put(z8e.micPulseWrapper, 1);
        sparseIntArray.put(z8e.micPulseRing, 2);
        sparseIntArray.put(z8e.imgMicPulse, 3);
        sparseIntArray.put(z8e.scrollTranscript, 4);
        sparseIntArray.put(z8e.tvTranscript, 5);
        sparseIntArray.put(z8e.btnDone, 6);
        sparseIntArray.put(z8e.recordingActionsLayout, 7);
        sparseIntArray.put(z8e.reDoButton, 8);
        sparseIntArray.put(z8e.newLeadWhatsappButton, 9);
        sparseIntArray.put(z8e.saveButton, 10);
    }

    public fi7(yt4 yt4Var, View view) {
        this(yt4Var, view, ewi.m25671L(yt4Var, view, 11, z0, A0));
    }

    @Override // p001o.ewi
    /* renamed from: E */
    public boolean mo16290E() {
        synchronized (this) {
            return this.y0 != 0;
        }
    }

    @Override // p001o.ewi
    /* renamed from: G */
    public void mo16291G() {
        synchronized (this) {
            this.y0 = 1L;
        }
        m25692R();
    }

    @Override // p001o.ewi
    /* renamed from: M */
    public boolean mo16292M(int i, Object obj, int i2) {
        return false;
    }

    @Override // p001o.ewi
    public boolean b0(int i, Object obj) {
        return true;
    }

    @Override // p001o.ewi
    /* renamed from: p */
    public void mo16295p() {
        synchronized (this) {
            this.y0 = 0L;
        }
    }

    public fi7(yt4 yt4Var, View view, Object[] objArr) {
        super(yt4Var, view, 0, (Button) objArr[6], (ImageView) objArr[3], (View) objArr[2], (FrameLayout) objArr[1], (MaterialButton) objArr[9], (MaterialButton) objArr[8], (LinearLayout) objArr[7], (MaterialButton) objArr[10], (ScrollView) objArr[4], (MaterialTextView) objArr[5]);
        this.y0 = -1L;
        CardView cardView = (CardView) objArr[0];
        this.x0 = cardView;
        cardView.setTag(null);
        a0(view);
        mo16291G();
    }
}
