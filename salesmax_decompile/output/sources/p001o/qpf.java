package p001o;

import ai.salesmax.model.Tasks;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.google.android.material.textview.MaterialTextView;
import p001o.ewi;

/* loaded from: classes.dex */
public class qpf extends ppf {
    public static final ewi.C13274i y0 = null;
    public static final SparseIntArray z0;
    public final LinearLayout w0;
    public long x0;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        z0 = sparseIntArray;
        sparseIntArray.put(z8e.outcomeBlockText, 2);
        sparseIntArray.put(z8e.outcomeBlock, 3);
        sparseIntArray.put(z8e.btnDone, 4);
        sparseIntArray.put(z8e.btnCancelled, 5);
        sparseIntArray.put(z8e.btnDintJoin, 6);
        sparseIntArray.put(z8e.taskBasicDescriptionLayout, 7);
        sparseIntArray.put(z8e.btnGetMeetingLink, 8);
    }

    public qpf(yt4 yt4Var, View view) {
        this(yt4Var, view, ewi.m25671L(yt4Var, view, 9, y0, z0));
    }

    @Override // p001o.ewi
    /* renamed from: E */
    public boolean mo16290E() {
        synchronized (this) {
            return this.x0 != 0;
        }
    }

    @Override // p001o.ewi
    /* renamed from: G */
    public void mo16291G() {
        synchronized (this) {
            this.x0 = 2L;
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
        j0((Tasks) obj);
        return true;
    }

    @Override // p001o.ppf
    public void j0(Tasks tasks) {
        this.v0 = tasks;
        synchronized (this) {
            this.x0 |= 1;
        }
        m28509h(67);
        super.m25692R();
    }

    @Override // p001o.ewi
    /* renamed from: p */
    public void mo16295p() {
        long j;
        synchronized (this) {
            j = this.x0;
            this.x0 = 0L;
        }
        Tasks tasks = this.v0;
        long j2 = j & 3;
        String body = (j2 == 0 || tasks == null) ? null : tasks.getBody();
        if (j2 != 0) {
            fjh.m26938c(this.t0, body);
        }
    }

    public qpf(yt4 yt4Var, View view, Object[] objArr) {
        super(yt4Var, view, 0, (Button) objArr[5], (Button) objArr[6], (Button) objArr[4], (MaterialButton) objArr[8], (MaterialButtonToggleGroup) objArr[3], (MaterialTextView) objArr[2], (TextInputEditText) objArr[1], (TextInputLayout) objArr[7]);
        this.x0 = -1L;
        LinearLayout linearLayout = (LinearLayout) objArr[0];
        this.w0 = linearLayout;
        linearLayout.setTag(null);
        this.t0.setTag(null);
        a0(view);
        mo16291G();
    }
}
