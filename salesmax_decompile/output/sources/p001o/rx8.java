package p001o;

import ai.salesmax.model.CommentSummary;
import ai.salesmax.model.LeadsUser;
import android.util.SparseIntArray;
import android.view.View;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.imageview.ShapeableImageView;
import com.google.android.material.textview.MaterialTextView;
import p001o.ewi;
import p001o.jbc;

/* loaded from: classes.dex */
public class rx8 extends qx8 implements jbc.InterfaceC14485a {
    public static final SparseIntArray A0;
    public static final ewi.C13274i z0 = null;
    public final View.OnClickListener x0;
    public long y0;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        A0 = sparseIntArray;
        sparseIntArray.put(z8e.ivCommentedOn, 6);
    }

    public rx8(yt4 yt4Var, View view) {
        this(yt4Var, view, ewi.m25671L(yt4Var, view, 7, z0, A0));
    }

    @Override // p001o.ewi
    /* renamed from: E */
    public boolean mo16290E() {
        synchronized (this) {
            return this.y0 != 0;
        }
    }

    @Override // p001o.ewi
    /* renamed from: G */
    public void mo16291G() {
        synchronized (this) {
            this.y0 = 8L;
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
        if (33 == i) {
            h0((ck6) obj);
        } else if (73 == i) {
            j0((Integer) obj);
        } else {
            if (67 != i) {
                return false;
            }
            i0((CommentSummary) obj);
        }
        return true;
    }

    @Override // p001o.jbc.InterfaceC14485a
    /* renamed from: c */
    public final void mo16294c(int i, View view) {
        ck6 ck6Var = this.w0;
        CommentSummary commentSummary = this.u0;
        Integer num = this.v0;
        if (ck6Var != null) {
            ck6Var.mo708b(view, num.intValue(), commentSummary);
        }
    }

    public void h0(ck6 ck6Var) {
        this.w0 = ck6Var;
        synchronized (this) {
            this.y0 |= 1;
        }
        m28509h(33);
        super.m25692R();
    }

    public void i0(CommentSummary commentSummary) {
        this.u0 = commentSummary;
        synchronized (this) {
            this.y0 |= 4;
        }
        m28509h(67);
        super.m25692R();
    }

    public void j0(Integer num) {
        this.v0 = num;
        synchronized (this) {
            this.y0 |= 2;
        }
        m28509h(73);
        super.m25692R();
    }

    @Override // p001o.ewi
    /* renamed from: p */
    public void mo16295p() {
        long j;
        long createdAt;
        boolean zIsNewComment;
        LeadsUser commenter;
        synchronized (this) {
            j = this.y0;
            this.y0 = 0L;
        }
        CommentSummary commentSummary = this.u0;
        long j2 = 12 & j;
        String name = null;
        if (j2 != 0) {
            if (commentSummary != null) {
                commenter = commentSummary.getCommenter();
                zIsNewComment = commentSummary.isNewComment();
                createdAt = commentSummary.getCreatedAt();
            } else {
                createdAt = 0;
                zIsNewComment = false;
                commenter = null;
            }
            if (commenter != null) {
                name = commenter.getName();
            }
        } else {
            createdAt = 0;
            zIsNewComment = false;
            commenter = null;
        }
        if (j2 != 0) {
            nr1.N2(this.n0, Boolean.valueOf(zIsNewComment));
            nr1.m40953X(this.p0, commentSummary);
            nr1.f1(this.q0, name);
            nr1.V0(this.r0, commenter);
            nr1.h0(this.t0, Long.valueOf(createdAt));
        }
        if ((j & 8) != 0) {
            this.o0.setOnClickListener(this.x0);
        }
    }

    public rx8(yt4 yt4Var, View view, Object[] objArr) {
        super(yt4Var, view, 0, (ShapeableImageView) objArr[5], (MaterialCardView) objArr[0], (MaterialTextView) objArr[3], (MaterialTextView) objArr[2], (ShapeableImageView) objArr[1], (MaterialTextView) objArr[6], (MaterialTextView) objArr[4]);
        this.y0 = -1L;
        this.n0.setTag(null);
        this.o0.setTag(null);
        this.p0.setTag(null);
        this.q0.setTag(null);
        this.r0.setTag(null);
        this.t0.setTag(null);
        a0(view);
        this.x0 = new jbc(this, 1);
        mo16291G();
    }
}
