package p001o;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textview.MaterialTextView;
import p001o.ewi;

/* loaded from: classes.dex */
public class bpf extends apf {
    public static final ewi.C13274i E0 = null;
    public static final SparseIntArray F0;
    public final LinearLayout C0;
    public long D0;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        F0 = sparseIntArray;
        sparseIntArray.put(z8e.sheetSearchChat, 1);
        sparseIntArray.put(z8e.sheetSearchChatPic, 2);
        sparseIntArray.put(z8e.sheetSearchChatText, 3);
        sparseIntArray.put(z8e.putLabel, 4);
        sparseIntArray.put(z8e.putLabelIcon, 5);
        sparseIntArray.put(z8e.deleteName, 6);
        sparseIntArray.put(z8e.inviteOthersToChat, 7);
        sparseIntArray.put(z8e.inviteOthersToChatIcon, 8);
        sparseIntArray.put(z8e.inviteOthersToChatLabel, 9);
        sparseIntArray.put(z8e.markAsClosed, 10);
        sparseIntArray.put(z8e.markAsClosedIcon, 11);
        sparseIntArray.put(z8e.markAsClosedLabel, 12);
        sparseIntArray.put(z8e.leaveChat, 13);
        sparseIntArray.put(z8e.leaveChatIcon, 14);
        sparseIntArray.put(z8e.leaveChatLabel, 15);
    }

    public bpf(yt4 yt4Var, View view) {
        this(yt4Var, view, ewi.m25671L(yt4Var, view, 16, E0, F0));
    }

    @Override // p001o.ewi
    /* renamed from: E */
    public boolean mo16290E() {
        synchronized (this) {
            return this.D0 != 0;
        }
    }

    @Override // p001o.ewi
    /* renamed from: G */
    public void mo16291G() {
        synchronized (this) {
            this.D0 = 1L;
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
            this.D0 = 0L;
        }
    }

    public bpf(yt4 yt4Var, View view, Object[] objArr) {
        super(yt4Var, view, 0, (MaterialTextView) objArr[6], (ConstraintLayout) objArr[7], (MaterialButton) objArr[8], (MaterialTextView) objArr[9], (ConstraintLayout) objArr[13], (MaterialButton) objArr[14], (MaterialTextView) objArr[15], (ConstraintLayout) objArr[10], (MaterialButton) objArr[11], (MaterialTextView) objArr[12], (ConstraintLayout) objArr[4], (MaterialButton) objArr[5], (ConstraintLayout) objArr[1], (MaterialButton) objArr[2], (MaterialTextView) objArr[3]);
        this.D0 = -1L;
        LinearLayout linearLayout = (LinearLayout) objArr[0];
        this.C0 = linearLayout;
        linearLayout.setTag(null);
        a0(view);
        mo16291G();
    }
}
