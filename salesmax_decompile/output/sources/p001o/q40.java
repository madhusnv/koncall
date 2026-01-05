package p001o;

import android.util.SparseIntArray;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.gms.cast.MediaStatus;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.chip.Chip;
import com.google.android.material.chip.ChipGroup;
import com.google.android.material.textview.MaterialTextView;
import p001o.ewi;

/* loaded from: classes.dex */
public class q40 extends p40 {
    public static final ewi.C13274i A0 = null;
    public static final SparseIntArray B0;
    public final ConstraintLayout y0;
    public long z0;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        B0 = sparseIntArray;
        sparseIntArray.put(z8e.backButton, 8);
        sparseIntArray.put(z8e.taskTypeHeading, 9);
        sparseIntArray.put(z8e.chipTagGroup, 10);
    }

    public q40(yt4 yt4Var, View view) {
        this(yt4Var, view, ewi.m25671L(yt4Var, view, 11, A0, B0));
    }

    @Override // p001o.ewi
    /* renamed from: E */
    public boolean mo16290E() {
        synchronized (this) {
            return this.z0 != 0;
        }
    }

    @Override // p001o.ewi
    /* renamed from: G */
    public void mo16291G() {
        synchronized (this) {
            this.z0 = 2L;
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
        if (67 != i) {
            return false;
        }
        j0((String) obj);
        return true;
    }

    @Override // p001o.p40
    public void j0(String str) {
        this.x0 = str;
        synchronized (this) {
            this.z0 |= 1;
        }
        m28509h(67);
        super.m25692R();
    }

    @Override // p001o.ewi
    /* renamed from: p */
    public void mo16295p() {
        long j;
        boolean zEqualsIgnoreCase;
        boolean zEqualsIgnoreCase2;
        boolean zEqualsIgnoreCase3;
        boolean zEqualsIgnoreCase4;
        boolean zEqualsIgnoreCase5;
        boolean zEqualsIgnoreCase6;
        synchronized (this) {
            j = this.z0;
            this.z0 = 0L;
        }
        String str = this.x0;
        long j2 = j & 3;
        boolean zEqualsIgnoreCase7 = false;
        if (j2 != 0) {
            if (str != null) {
                zEqualsIgnoreCase7 = str.equalsIgnoreCase(this.o0.getResources().getString(hae.demo));
                zEqualsIgnoreCase2 = str.equalsIgnoreCase(this.r0.getResources().getString(hae.get_document));
                zEqualsIgnoreCase3 = str.equalsIgnoreCase(this.p0.getResources().getString(hae.follow_up));
                zEqualsIgnoreCase4 = str.equalsIgnoreCase(this.q0.getResources().getString(hae.get_appointment));
                zEqualsIgnoreCase5 = str.equalsIgnoreCase(this.u0.getResources().getString(hae.send_proposal));
                zEqualsIgnoreCase6 = str.equalsIgnoreCase(this.t0.getResources().getString(hae.send_document));
                zEqualsIgnoreCase = str.equalsIgnoreCase(this.s0.getResources().getString(hae.in_person_meeting));
            } else {
                zEqualsIgnoreCase = false;
                zEqualsIgnoreCase2 = false;
                zEqualsIgnoreCase3 = false;
                zEqualsIgnoreCase4 = false;
                zEqualsIgnoreCase5 = false;
                zEqualsIgnoreCase6 = false;
            }
            if (j2 != 0) {
                j |= zEqualsIgnoreCase7 ? MediaStatus.COMMAND_PLAYBACK_RATE : MediaStatus.COMMAND_EDIT_TRACKS;
            }
            if ((j & 3) != 0) {
                j |= zEqualsIgnoreCase2 ? MediaStatus.COMMAND_QUEUE_REPEAT_ONE : MediaStatus.COMMAND_QUEUE_REPEAT_ALL;
            }
            if ((j & 3) != 0) {
                j |= zEqualsIgnoreCase3 ? 128L : 64L;
            }
            if ((j & 3) != 0) {
                j |= zEqualsIgnoreCase4 ? 512L : 256L;
            }
            if ((j & 3) != 0) {
                j |= zEqualsIgnoreCase5 ? MediaStatus.COMMAND_DISLIKE : MediaStatus.COMMAND_LIKE;
            }
            if ((j & 3) != 0) {
                j |= zEqualsIgnoreCase6 ? 8L : 4L;
            }
            if ((j & 3) != 0) {
                j |= zEqualsIgnoreCase ? 32L : 16L;
            }
        } else {
            zEqualsIgnoreCase = false;
            zEqualsIgnoreCase2 = false;
            zEqualsIgnoreCase3 = false;
            zEqualsIgnoreCase4 = false;
            zEqualsIgnoreCase5 = false;
            zEqualsIgnoreCase6 = false;
        }
        if ((j & 3) != 0) {
            np3.m40895a(this.o0, zEqualsIgnoreCase7);
            np3.m40895a(this.p0, zEqualsIgnoreCase3);
            np3.m40895a(this.q0, zEqualsIgnoreCase4);
            np3.m40895a(this.r0, zEqualsIgnoreCase2);
            np3.m40895a(this.s0, zEqualsIgnoreCase);
            np3.m40895a(this.t0, zEqualsIgnoreCase6);
            np3.m40895a(this.u0, zEqualsIgnoreCase5);
        }
    }

    public q40(yt4 yt4Var, View view, Object[] objArr) {
        super(yt4Var, view, 0, (MaterialButton) objArr[8], (Chip) objArr[3], (Chip) objArr[1], (Chip) objArr[6], (Chip) objArr[5], (Chip) objArr[7], (Chip) objArr[4], (Chip) objArr[2], (ChipGroup) objArr[10], (MaterialTextView) objArr[9]);
        this.z0 = -1L;
        this.o0.setTag(null);
        this.p0.setTag(null);
        this.q0.setTag(null);
        this.r0.setTag(null);
        this.s0.setTag(null);
        this.t0.setTag(null);
        this.u0.setTag(null);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.y0 = constraintLayout;
        constraintLayout.setTag(null);
        a0(view);
        mo16291G();
    }
}
