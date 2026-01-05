package p001o;

import ai.salesmax.model.LeadsDeal;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.Button;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.textview.MaterialTextView;
import p001o.ewi;

/* loaded from: classes.dex */
public class q6i extends p6i {
    public static final ewi.C13274i D0 = null;
    public static final SparseIntArray E0;
    public final MaterialCardView B0;
    public long C0;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        E0 = sparseIntArray;
        sparseIntArray.put(z8e.buttonCancel, 1);
        sparseIntArray.put(z8e.title, 2);
        sparseIntArray.put(z8e.buttonDone, 3);
        sparseIntArray.put(z8e.tvHeadingText, 4);
        sparseIntArray.put(z8e.tvCallOutComeTitle, 5);
        sparseIntArray.put(z8e.toggleGroupDueDateSelection, 6);
        sparseIntArray.put(z8e.btnLaterToday, 7);
        sparseIntArray.put(z8e.btnTomorrow, 8);
        sparseIntArray.put(z8e.btnLaterThisWeek, 9);
        sparseIntArray.put(z8e.btnNextWeek, 10);
        sparseIntArray.put(z8e.btnCustomDate, 11);
    }

    public q6i(yt4 yt4Var, View view) {
        this(yt4Var, view, ewi.m25671L(yt4Var, view, 12, D0, E0));
    }

    @Override // p001o.ewi
    /* renamed from: E */
    public boolean mo16290E() {
        synchronized (this) {
            return this.C0 != 0;
        }
    }

    @Override // p001o.ewi
    /* renamed from: G */
    public void mo16291G() {
        synchronized (this) {
            this.C0 = 8L;
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
        if (33 == i) {
            j0((ck6) obj);
        } else if (73 == i) {
            l0((Integer) obj);
        } else {
            if (67 != i) {
                return false;
            }
            k0((LeadsDeal) obj);
        }
        return true;
    }

    public void j0(ck6 ck6Var) {
        this.A0 = ck6Var;
    }

    public void k0(LeadsDeal leadsDeal) {
        this.y0 = leadsDeal;
    }

    public void l0(Integer num) {
        this.z0 = num;
    }

    @Override // p001o.ewi
    /* renamed from: p */
    public void mo16295p() {
        synchronized (this) {
            this.C0 = 0L;
        }
    }

    public q6i(yt4 yt4Var, View view, Object[] objArr) {
        super(yt4Var, view, 0, (Button) objArr[11], (Button) objArr[9], (Button) objArr[7], (Button) objArr[10], (Button) objArr[8], (MaterialButton) objArr[1], (MaterialButton) objArr[3], (MaterialTextView) objArr[2], (MaterialButtonToggleGroup) objArr[6], (MaterialTextView) objArr[5], (MaterialTextView) objArr[4]);
        this.C0 = -1L;
        MaterialCardView materialCardView = (MaterialCardView) objArr[0];
        this.B0 = materialCardView;
        materialCardView.setTag(null);
        a0(view);
        mo16291G();
    }
}
