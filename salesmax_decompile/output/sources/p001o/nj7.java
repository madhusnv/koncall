package p001o;

import ai.salesmax.model.FileData;
import android.util.SparseIntArray;
import android.view.View;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.imageview.ShapeableImageView;
import com.google.android.material.textview.MaterialTextView;
import com.ortiz.touchview.TouchImageView;
import p001o.ewi;

/* loaded from: classes.dex */
public class nj7 extends mj7 {
    public static final ewi.C13274i w0 = null;
    public static final SparseIntArray x0;
    public final CoordinatorLayout u0;
    public long v0;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        x0 = sparseIntArray;
        sparseIntArray.put(z8e.appBar, 3);
        sparseIntArray.put(z8e.toolbar, 4);
        sparseIntArray.put(z8e.fileDetailsClose, 5);
        sparseIntArray.put(z8e.fileDetailsMore, 6);
    }

    public nj7(yt4 yt4Var, View view) {
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
            this.v0 = 2L;
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
        j0((FileData) obj);
        return true;
    }

    @Override // p001o.mj7
    public void j0(FileData fileData) {
        this.t0 = fileData;
        synchronized (this) {
            this.v0 |= 1;
        }
        m28509h(67);
        super.m25692R();
    }

    @Override // p001o.ewi
    /* renamed from: p */
    public void mo16295p() {
        long j;
        String uploadedUri;
        String fileName;
        synchronized (this) {
            j = this.v0;
            this.v0 = 0L;
        }
        FileData fileData = this.t0;
        long j2 = j & 3;
        if (j2 == 0 || fileData == null) {
            uploadedUri = null;
            fileName = null;
        } else {
            uploadedUri = fileData.getUploadedUri();
            fileName = fileData.getFileName();
        }
        if (j2 != 0) {
            fjh.m26938c(this.q0, fileName);
            nr1.F2(this.r0, uploadedUri);
        }
    }

    public nj7(yt4 yt4Var, View view, Object[] objArr) {
        super(yt4Var, view, 0, (AppBarLayout) objArr[3], (ShapeableImageView) objArr[5], (ShapeableImageView) objArr[6], (MaterialTextView) objArr[1], (TouchImageView) objArr[2], (Toolbar) objArr[4]);
        this.v0 = -1L;
        this.q0.setTag(null);
        this.r0.setTag(null);
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) objArr[0];
        this.u0 = coordinatorLayout;
        coordinatorLayout.setTag(null);
        a0(view);
        mo16291G();
    }
}
