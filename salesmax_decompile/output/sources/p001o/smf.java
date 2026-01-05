package p001o;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textview.MaterialTextView;
import p001o.ewi;

/* loaded from: classes.dex */
public class smf extends rmf {
    public static final ewi.C13274i w0 = null;
    public static final SparseIntArray x0;
    public final LinearLayout t0;
    public boolean u0;
    public long v0;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        x0 = sparseIntArray;
        sparseIntArray.put(z8e.sheetCreateTemplate, 1);
        sparseIntArray.put(z8e.itemIcon_template, 2);
        sparseIntArray.put(z8e.itemName_template, 3);
        sparseIntArray.put(z8e.sheetCreateScript, 4);
        sparseIntArray.put(z8e.itemIcon_script, 5);
        sparseIntArray.put(z8e.itemName_script, 6);
    }

    public smf(yt4 yt4Var, View view) {
        this(yt4Var, view, ewi.m25671L(yt4Var, view, 7, w0, x0));
    }

    @Override // p001o.ewi
    /* renamed from: E */
    public boolean mo16290E() {
        synchronized (this) {
            return this.v0 != 0;
        }
    }

    @Override // p001o.ewi
    /* renamed from: G */
    public void mo16291G() {
        synchronized (this) {
            this.v0 = 1L;
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
        long j;
        synchronized (this) {
            j = this.v0;
            this.v0 = 0L;
        }
        long j2 = j & 1;
        if (j2 != 0) {
            LinearLayout linearLayout = this.t0;
            boolean z = this.u0;
            wh1.m54388b(linearLayout, z, z, z, z, true, true, true, true);
        }
        if (j2 != 0) {
            this.u0 = true;
        }
    }

    public smf(yt4 yt4Var, View view, Object[] objArr) {
        super(yt4Var, view, 0, (MaterialButton) objArr[5], (MaterialButton) objArr[2], (MaterialTextView) objArr[6], (MaterialTextView) objArr[3], (LinearLayout) objArr[4], (LinearLayout) objArr[1]);
        this.v0 = -1L;
        LinearLayout linearLayout = (LinearLayout) objArr[0];
        this.t0 = linearLayout;
        linearLayout.setTag(null);
        a0(view);
        mo16291G();
    }
}
