package p001o;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.google.android.material.textview.MaterialTextView;
import p001o.ewi;

/* loaded from: classes.dex */
public class anf extends zmf {
    public static final ewi.C13274i C0 = null;
    public static final SparseIntArray D0;
    public final LinearLayout A0;
    public long B0;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        D0 = sparseIntArray;
        sparseIntArray.put(z8e.markAttendance, 1);
        sparseIntArray.put(z8e.itemIcon_attendance, 2);
        sparseIntArray.put(z8e.itemName_attendance, 3);
        sparseIntArray.put(z8e.markAttendanceLogout, 4);
        sparseIntArray.put(z8e.itemIcon_attendance_logout, 5);
        sparseIntArray.put(z8e.itemName_attendance_logout, 6);
        sparseIntArray.put(z8e.sheetMarkLeave, 7);
        sparseIntArray.put(z8e.itemIcon_Leave, 8);
        sparseIntArray.put(z8e.itemName_leave, 9);
        sparseIntArray.put(z8e.toggleGroupDueDateSelection, 10);
        sparseIntArray.put(z8e.btnLaterToday, 11);
        sparseIntArray.put(z8e.btnTomorrow, 12);
        sparseIntArray.put(z8e.btnCustomDate, 13);
    }

    public anf(yt4 yt4Var, View view) {
        this(yt4Var, view, ewi.m25671L(yt4Var, view, 14, C0, D0));
    }

    @Override // p001o.ewi
    /* renamed from: E */
    public boolean mo16290E() {
        synchronized (this) {
            return this.B0 != 0;
        }
    }

    @Override // p001o.ewi
    /* renamed from: G */
    public void mo16291G() {
        synchronized (this) {
            this.B0 = 1L;
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
            this.B0 = 0L;
        }
    }

    public anf(yt4 yt4Var, View view, Object[] objArr) {
        super(yt4Var, view, 0, (Button) objArr[13], (Button) objArr[11], (Button) objArr[12], (MaterialButton) objArr[2], (MaterialButton) objArr[5], (MaterialButton) objArr[8], (MaterialTextView) objArr[3], (MaterialTextView) objArr[6], (MaterialTextView) objArr[9], (LinearLayout) objArr[1], (LinearLayout) objArr[4], (LinearLayout) objArr[7], (MaterialButtonToggleGroup) objArr[10]);
        this.B0 = -1L;
        LinearLayout linearLayout = (LinearLayout) objArr[0];
        this.A0 = linearLayout;
        linearLayout.setTag(null);
        a0(view);
        mo16291G();
    }
}
