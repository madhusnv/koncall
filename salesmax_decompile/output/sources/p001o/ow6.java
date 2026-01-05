package p001o;

import ai.salesmax.model.Template;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.imageview.ShapeableImageView;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.textview.MaterialTextView;
import p001o.ewi;

/* loaded from: classes.dex */
public class ow6 extends nw6 {
    public static final ewi.C13274i H0 = null;
    public static final SparseIntArray I0;
    public final CoordinatorLayout E0;
    public boolean F0;
    public long G0;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        I0 = sparseIntArray;
        sparseIntArray.put(z8e.appBar, 5);
        sparseIntArray.put(z8e.toolbar, 6);
        sparseIntArray.put(z8e.fileDetailsClose, 7);
        sparseIntArray.put(z8e.fileDetailsMore, 8);
        sparseIntArray.put(z8e.viewFile, 9);
        sparseIntArray.put(z8e.templateEdit, 10);
        sparseIntArray.put(z8e.deleteTemplate, 11);
        sparseIntArray.put(z8e.leadDetailsBorder1, 12);
        sparseIntArray.put(z8e.filePager, 13);
    }

    public ow6(yt4 yt4Var, View view) {
        this(yt4Var, view, ewi.m25671L(yt4Var, view, 14, H0, I0));
    }

    @Override // p001o.ewi
    /* renamed from: E */
    public boolean mo16290E() {
        synchronized (this) {
            return this.G0 != 0;
        }
    }

    @Override // p001o.ewi
    /* renamed from: G */
    public void mo16291G() {
        synchronized (this) {
            this.G0 = 16L;
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
        if (73 == i) {
            m0((Integer) obj);
        } else if (93 == i) {
            k0(((Boolean) obj).booleanValue());
        } else if (33 == i) {
            l0((ck6) obj);
        } else {
            if (67 != i) {
                return false;
            }
            j0((Template) obj);
        }
        return true;
    }

    @Override // p001o.nw6
    public void j0(Template template) {
        this.B0 = template;
        synchronized (this) {
            this.G0 |= 8;
        }
        m28509h(67);
        super.m25692R();
    }

    @Override // p001o.nw6
    public void k0(boolean z) {
        this.A0 = z;
        synchronized (this) {
            this.G0 |= 2;
        }
        m28509h(93);
        super.m25692R();
    }

    public void l0(ck6 ck6Var) {
        this.D0 = ck6Var;
    }

    public void m0(Integer num) {
        this.C0 = num;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0026 A[PHI: r2
      0x0026: PHI (r2v1 long) = (r2v0 long), (r2v8 long) binds: [B:7:0x0015, B:13:0x0021] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // p001o.ewi
    /* renamed from: p */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void mo16295p() {
        long j;
        int i;
        String str;
        String description;
        synchronized (this) {
            j = this.G0;
            this.G0 = 0L;
        }
        boolean z = this.A0;
        Template template = this.B0;
        long j2 = j & 18;
        if (j2 == 0) {
            i = 0;
        } else {
            if (j2 != 0) {
                j |= z ? 256L : 128L;
            }
            if (z) {
                i = 8;
            }
        }
        long j3 = j & 24;
        String documentCategory = null;
        if (j3 != 0) {
            boolean z2 = template == null;
            if (j3 != 0) {
                j |= z2 ? 64L : 32L;
            }
            if (template != null) {
                documentCategory = template.getDocumentCategory();
                description = template.getDescription();
            } else {
                description = null;
            }
            i = z2 ? 4 : 0;
            String str2 = documentCategory;
            documentCategory = description;
            str = str2;
        } else {
            str = null;
        }
        if ((24 & j) != 0) {
            nr1.f1(this.s0, documentCategory);
            fjh.m26938c(this.t0, str);
            this.v0.setVisibility(i);
        }
        if ((j & 18) != 0) {
            this.w0.setVisibility(i);
        }
        long j4 = j & 16;
        if (j4 != 0) {
            CoordinatorLayout coordinatorLayout = this.E0;
            boolean z3 = this.F0;
            wh1.m54388b(coordinatorLayout, false, z3, false, z3, false, true, false, true);
        }
        if (j4 != 0) {
            this.F0 = true;
        }
    }

    public ow6(yt4 yt4Var, View view, Object[] objArr) {
        super(yt4Var, view, 0, (AppBarLayout) objArr[5], (MaterialButton) objArr[11], (ShapeableImageView) objArr[7], (ShapeableImageView) objArr[8], (ViewPager2) objArr[13], (MaterialTextView) objArr[1], (MaterialTextView) objArr[2], (View) objArr[12], (LinearLayout) objArr[3], (TabLayout) objArr[4], (MaterialButton) objArr[10], (Toolbar) objArr[6], (MaterialButton) objArr[9]);
        this.G0 = -1L;
        this.s0.setTag(null);
        this.t0.setTag(null);
        this.v0.setTag(null);
        this.w0.setTag(null);
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) objArr[0];
        this.E0 = coordinatorLayout;
        coordinatorLayout.setTag(null);
        a0(view);
        mo16291G();
    }
}
