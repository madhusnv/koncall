package p001o;

import ai.salesmax.model.SupportResource;
import android.util.SparseIntArray;
import android.view.View;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.chip.Chip;
import com.google.android.material.imageview.ShapeableImageView;
import com.google.android.material.textview.MaterialTextView;
import p001o.ewi;
import p001o.jbc;
import p001o.sbc;

/* loaded from: classes.dex */
public class y29 extends x29 implements sbc.InterfaceC16795a, jbc.InterfaceC14485a {
    public static final ewi.C13274i A0 = null;
    public static final SparseIntArray B0 = null;
    public final View.OnLongClickListener x0;
    public final View.OnClickListener y0;
    public long z0;

    public y29(yt4 yt4Var, View view) {
        this(yt4Var, view, ewi.m25671L(yt4Var, view, 7, A0, B0));
    }

    @Override // p001o.ewi
    /* renamed from: E */
    public boolean mo16290E() {
        synchronized (this) {
            return this.z0 != 0;
        }
    }

    @Override // p001o.ewi
    /* renamed from: G */
    public void mo16291G() {
        synchronized (this) {
            this.z0 = 8L;
        }
        m25692R();
    }

    @Override // p001o.ewi
    /* renamed from: M */
    public boolean mo16292M(int i, Object obj, int i2) {
        return false;
    }

    @Override // p001o.sbc.InterfaceC16795a
    /* renamed from: a */
    public final boolean mo16293a(int i, View view) {
        ck6 ck6Var = this.w0;
        SupportResource supportResource = this.u0;
        Integer num = this.v0;
        if (ck6Var != null) {
            return ck6Var.mo707a(view, num.intValue(), supportResource);
        }
        return false;
    }

    @Override // p001o.ewi
    public boolean b0(int i, Object obj) {
        if (33 == i) {
            h0((ck6) obj);
        } else if (73 == i) {
            j0((Integer) obj);
        } else {
            if (67 != i) {
                return false;
            }
            i0((SupportResource) obj);
        }
        return true;
    }

    @Override // p001o.jbc.InterfaceC14485a
    /* renamed from: c */
    public final void mo16294c(int i, View view) {
        ck6 ck6Var = this.w0;
        SupportResource supportResource = this.u0;
        Integer num = this.v0;
        if (ck6Var != null) {
            ck6Var.mo708b(view, num.intValue(), supportResource);
        }
    }

    public void h0(ck6 ck6Var) {
        this.w0 = ck6Var;
        synchronized (this) {
            this.z0 |= 1;
        }
        m28509h(33);
        super.m25692R();
    }

    public void i0(SupportResource supportResource) {
        this.u0 = supportResource;
        synchronized (this) {
            this.z0 |= 4;
        }
        m28509h(67);
        super.m25692R();
    }

    public void j0(Integer num) {
        this.v0 = num;
        synchronized (this) {
            this.z0 |= 2;
        }
        m28509h(73);
        super.m25692R();
    }

    @Override // p001o.ewi
    /* renamed from: p */
    public void mo16295p() {
        long j;
        String thumbnailUrl;
        String category;
        String subCategory;
        String title;
        String description;
        String format;
        synchronized (this) {
            j = this.z0;
            this.z0 = 0L;
        }
        SupportResource supportResource = this.u0;
        long j2 = 12 & j;
        if (j2 == 0 || supportResource == null) {
            thumbnailUrl = null;
            category = null;
            subCategory = null;
            title = null;
            description = null;
            format = null;
        } else {
            thumbnailUrl = supportResource.getThumbnailUrl();
            subCategory = supportResource.getSubCategory();
            title = supportResource.getTitle();
            description = supportResource.getDescription();
            format = supportResource.getFormat();
            category = supportResource.getCategory();
        }
        if (j2 != 0) {
            fjh.m26938c(this.n0, category);
            fjh.m26938c(this.o0, format);
            fjh.m26938c(this.p0, subCategory);
            nr1.R2(this.r0, thumbnailUrl);
            fjh.m26938c(this.s0, title);
            fjh.m26938c(this.t0, description);
        }
        if ((j & 8) != 0) {
            this.q0.setOnClickListener(this.y0);
            this.q0.setOnLongClickListener(this.x0);
        }
    }

    public y29(yt4 yt4Var, View view, Object[] objArr) {
        super(yt4Var, view, 0, (Chip) objArr[4], (Chip) objArr[6], (Chip) objArr[5], (MaterialCardView) objArr[0], (ShapeableImageView) objArr[1], (MaterialTextView) objArr[2], (MaterialTextView) objArr[3]);
        this.z0 = -1L;
        this.n0.setTag(null);
        this.o0.setTag(null);
        this.p0.setTag(null);
        this.q0.setTag(null);
        this.r0.setTag(null);
        this.s0.setTag(null);
        this.t0.setTag(null);
        a0(view);
        this.x0 = new sbc(this, 2);
        this.y0 = new jbc(this, 1);
        mo16291G();
    }
}
