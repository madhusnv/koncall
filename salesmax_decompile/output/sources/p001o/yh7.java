package p001o;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.media3.ui.PlayerView;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textview.MaterialTextView;
import p001o.ewi;

/* loaded from: classes.dex */
public class yh7 extends xh7 {
    public static final SparseIntArray A0;
    public static final ewi.C13274i z0 = null;
    public long y0;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        A0 = sparseIntArray;
        sparseIntArray.put(z8e.tvSectionRecordingRunning, 1);
        sparseIntArray.put(z8e.tvHeadingRecording, 2);
        sparseIntArray.put(z8e.timerTextView, 3);
        sparseIntArray.put(z8e.stopButton, 4);
        sparseIntArray.put(z8e.mAudioPlayer, 5);
        sparseIntArray.put(z8e.recordingActionsLayout, 6);
        sparseIntArray.put(z8e.reDoButton, 7);
        sparseIntArray.put(z8e.newLeadWhatsappButton, 8);
        sparseIntArray.put(z8e.saveButton, 9);
    }

    public yh7(yt4 yt4Var, View view) {
        this(yt4Var, view, ewi.m25671L(yt4Var, view, 10, z0, A0));
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
            this.y0 = 2L;
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
        if (50 != i) {
            return false;
        }
        j0(((Boolean) obj).booleanValue());
        return true;
    }

    public void j0(boolean z) {
        this.x0 = z;
    }

    @Override // p001o.ewi
    /* renamed from: p */
    public void mo16295p() {
        synchronized (this) {
            this.y0 = 0L;
        }
    }

    public yh7(yt4 yt4Var, View view, Object[] objArr) {
        super(yt4Var, view, 0, (PlayerView) objArr[5], (MaterialButton) objArr[8], (MaterialButton) objArr[7], (LinearLayout) objArr[6], (MaterialButton) objArr[9], (MaterialButton) objArr[4], (MaterialTextView) objArr[3], (MaterialTextView) objArr[2], (FrameLayout) objArr[0], (LinearLayout) objArr[1]);
        this.y0 = -1L;
        this.v0.setTag(null);
        a0(view);
        mo16291G();
    }
}
