package p001o;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textview.MaterialTextView;
import p001o.ewi;

/* loaded from: classes.dex */
public class kmf extends jmf {
    public static final ewi.C13274i V0 = null;
    public static final SparseIntArray W0;
    public final LinearLayout T0;
    public long U0;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        W0 = sparseIntArray;
        sparseIntArray.put(z8e.tvRechurnLeadInfo, 1);
        sparseIntArray.put(z8e.callOutcome_ActionButton, 2);
        sparseIntArray.put(z8e.sheetAddCallManually, 3);
        sparseIntArray.put(z8e.itemIcon_manualCall, 4);
        sparseIntArray.put(z8e.itemName_manualCall, 5);
        sparseIntArray.put(z8e.sheetAddTask, 6);
        sparseIntArray.put(z8e.itemIcon_task, 7);
        sparseIntArray.put(z8e.itemName_task, 8);
        sparseIntArray.put(z8e.sheetAddNotes, 9);
        sparseIntArray.put(z8e.itemIcon_note, 10);
        sparseIntArray.put(z8e.itemName_note, 11);
        sparseIntArray.put(z8e.sheetAddVisit, 12);
        sparseIntArray.put(z8e.itemIcon_visit, 13);
        sparseIntArray.put(z8e.itemName_visit, 14);
        sparseIntArray.put(z8e.sheetAddDocument, 15);
        sparseIntArray.put(z8e.itemIcon_document, 16);
        sparseIntArray.put(z8e.itemName_document, 17);
        sparseIntArray.put(z8e.sheetVideoLink, 18);
        sparseIntArray.put(z8e.itemIcon_video, 19);
        sparseIntArray.put(z8e.itemName_video, 20);
        sparseIntArray.put(z8e.sheetRequestPayment, 21);
        sparseIntArray.put(z8e.itemIcon_payment, 22);
        sparseIntArray.put(z8e.itemName_payment, 23);
        sparseIntArray.put(z8e.sheetAddTag, 24);
        sparseIntArray.put(z8e.itemIcon_tag, 25);
        sparseIntArray.put(z8e.itemName_tag, 26);
        sparseIntArray.put(z8e.sheetAddNCallDetails, 27);
        sparseIntArray.put(z8e.itemIcon_call, 28);
        sparseIntArray.put(z8e.itemName_call, 29);
        sparseIntArray.put(z8e.sheetEditCustomProperties, 30);
        sparseIntArray.put(z8e.itemIcon_custom, 31);
        sparseIntArray.put(z8e.itemName_custom, 32);
    }

    public kmf(yt4 yt4Var, View view) {
        this(yt4Var, view, ewi.m25671L(yt4Var, view, 33, V0, W0));
    }

    @Override // p001o.ewi
    /* renamed from: E */
    public boolean mo16290E() {
        synchronized (this) {
            return this.U0 != 0;
        }
    }

    @Override // p001o.ewi
    /* renamed from: G */
    public void mo16291G() {
        synchronized (this) {
            this.U0 = 1L;
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
            this.U0 = 0L;
        }
    }

    public kmf(yt4 yt4Var, View view, Object[] objArr) {
        super(yt4Var, view, 0, (MaterialButton) objArr[2], (MaterialButton) objArr[28], (MaterialButton) objArr[31], (MaterialButton) objArr[16], (MaterialButton) objArr[4], (MaterialButton) objArr[10], (MaterialButton) objArr[22], (MaterialButton) objArr[25], (MaterialButton) objArr[7], (MaterialButton) objArr[19], (MaterialButton) objArr[13], (MaterialTextView) objArr[29], (MaterialTextView) objArr[32], (MaterialTextView) objArr[17], (MaterialTextView) objArr[5], (MaterialTextView) objArr[11], (MaterialTextView) objArr[23], (MaterialTextView) objArr[26], (MaterialTextView) objArr[8], (MaterialTextView) objArr[20], (MaterialTextView) objArr[14], (LinearLayout) objArr[3], (LinearLayout) objArr[15], (LinearLayout) objArr[27], (LinearLayout) objArr[9], (LinearLayout) objArr[24], (LinearLayout) objArr[6], (LinearLayout) objArr[12], (LinearLayout) objArr[30], (LinearLayout) objArr[21], (LinearLayout) objArr[18], (MaterialTextView) objArr[1]);
        this.U0 = -1L;
        LinearLayout linearLayout = (LinearLayout) objArr[0];
        this.T0 = linearLayout;
        linearLayout.setTag(null);
        a0(view);
        mo16291G();
    }
}
