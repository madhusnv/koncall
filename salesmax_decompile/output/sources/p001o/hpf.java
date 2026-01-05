package p001o;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.textview.MaterialTextView;
import java.util.ArrayList;
import p001o.ewi;

/* loaded from: classes.dex */
public class hpf extends gpf {
    public static final ewi.C13274i D0 = null;
    public static final SparseIntArray E0;
    public final MaterialCardView B0;
    public long C0;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        E0 = sparseIntArray;
        sparseIntArray.put(z8e.tvReceivedFileText, 1);
        sparseIntArray.put(z8e.buttonCancel, 2);
        sparseIntArray.put(z8e.buttonDone, 3);
        sparseIntArray.put(z8e.tvSelectDocCategoryText, 4);
        sparseIntArray.put(z8e.rvDocType, 5);
        sparseIntArray.put(z8e.tvSelectDocSubCategoryText, 6);
        sparseIntArray.put(z8e.rvDocSubType, 7);
        sparseIntArray.put(z8e.notesBorder1, 8);
        sparseIntArray.put(z8e.taskFileList, 9);
        sparseIntArray.put(z8e.notesActionButtons, 10);
        sparseIntArray.put(z8e.taskAttachment, 11);
        sparseIntArray.put(z8e.taskPicture, 12);
        sparseIntArray.put(z8e.scanDoc, 13);
    }

    public hpf(yt4 yt4Var, View view) {
        this(yt4Var, view, ewi.m25671L(yt4Var, view, 14, D0, E0));
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
            this.C0 = 2L;
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
        j0((ArrayList) obj);
        return true;
    }

    @Override // p001o.gpf
    public void j0(ArrayList arrayList) {
        this.A0 = arrayList;
    }

    @Override // p001o.ewi
    /* renamed from: p */
    public void mo16295p() {
        synchronized (this) {
            this.C0 = 0L;
        }
    }

    public hpf(yt4 yt4Var, View view, Object[] objArr) {
        super(yt4Var, view, 0, (MaterialButton) objArr[2], (MaterialButton) objArr[3], (LinearLayout) objArr[10], (View) objArr[8], (RecyclerView) objArr[7], (RecyclerView) objArr[5], (MaterialButton) objArr[13], (MaterialButton) objArr[11], (RecyclerView) objArr[9], (MaterialButton) objArr[12], (MaterialTextView) objArr[1], (MaterialTextView) objArr[4], (MaterialTextView) objArr[6]);
        this.C0 = -1L;
        MaterialCardView materialCardView = (MaterialCardView) objArr[0];
        this.B0 = materialCardView;
        materialCardView.setTag(null);
        a0(view);
        mo16291G();
    }
}
