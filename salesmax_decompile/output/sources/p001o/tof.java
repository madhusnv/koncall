package p001o;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputEditText;
import p001o.ewi;

/* loaded from: classes.dex */
public class tof extends sof {
    public static final ewi.C13274i w0 = null;
    public static final SparseIntArray x0;
    public final LinearLayout u0;
    public long v0;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        x0 = sparseIntArray;
        sparseIntArray.put(z8e.tv_device_registration_title, 1);
        sparseIntArray.put(z8e.tv_device_registration_desc, 2);
        sparseIntArray.put(z8e.et_workspace_pin, 3);
        sparseIntArray.put(z8e.btn_register_device, 4);
        sparseIntArray.put(z8e.tv_or, 5);
        sparseIntArray.put(z8e.tv_admin_approval_helper, 6);
        sparseIntArray.put(z8e.btn_request_approval, 7);
    }

    public tof(yt4 yt4Var, View view) {
        this(yt4Var, view, ewi.m25671L(yt4Var, view, 8, w0, x0));
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
        synchronized (this) {
            this.v0 = 0L;
        }
    }

    public tof(yt4 yt4Var, View view, Object[] objArr) {
        super(yt4Var, view, 0, (MaterialButton) objArr[4], (MaterialButton) objArr[7], (TextInputEditText) objArr[3], (TextView) objArr[6], (TextView) objArr[2], (TextView) objArr[1], (TextView) objArr[5]);
        this.v0 = -1L;
        LinearLayout linearLayout = (LinearLayout) objArr[0];
        this.u0 = linearLayout;
        linearLayout.setTag(null);
        a0(view);
        mo16291G();
    }
}
