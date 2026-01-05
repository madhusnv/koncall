package p001o;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import androidx.core.widget.NestedScrollView;
import com.google.android.material.button.MaterialButton;
import p001o.ewi;

/* loaded from: classes.dex */
public class m6 extends l6 {
    public static final ewi.C13274i w0 = null;
    public static final SparseIntArray x0;
    public final NestedScrollView u0;
    public long v0;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        x0 = sparseIntArray;
        sparseIntArray.put(z8e.supportDetail, 1);
        sparseIntArray.put(z8e.resetPreferences, 2);
        sparseIntArray.put(z8e.openAppPermissions, 3);
        sparseIntArray.put(z8e.openDrawOverApps, 4);
        sparseIntArray.put(z8e.openBatteryOptimization, 5);
        sparseIntArray.put(z8e.appVersion, 6);
        sparseIntArray.put(z8e.deviceModel, 7);
    }

    public m6(yt4 yt4Var, View view) {
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

    public m6(yt4 yt4Var, View view, Object[] objArr) {
        super(yt4Var, view, 0, (MaterialButton) objArr[6], (MaterialButton) objArr[7], (MaterialButton) objArr[3], (MaterialButton) objArr[5], (MaterialButton) objArr[4], (MaterialButton) objArr[2], (LinearLayout) objArr[1]);
        this.v0 = -1L;
        NestedScrollView nestedScrollView = (NestedScrollView) objArr[0];
        this.u0 = nestedScrollView;
        nestedScrollView.setTag(null);
        a0(view);
        mo16291G();
    }
}
