package p001o;

import ai.salesmax.model.ChatLabel;
import android.util.SparseIntArray;
import android.view.View;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.google.android.material.textview.MaterialTextView;
import p001o.ewi;
import p001o.jbc;
import p001o.sbc;

/* loaded from: classes.dex */
public class fw extends ew implements sbc.InterfaceC16795a, jbc.InterfaceC14485a {
    public static final ewi.C13274i D0 = null;
    public static final SparseIntArray E0;
    public final View.OnLongClickListener A0;
    public final View.OnClickListener B0;
    public long C0;
    public final MaterialCardView z0;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        E0 = sparseIntArray;
        sparseIntArray.put(z8e.buttonCancel, 3);
        sparseIntArray.put(z8e.title, 4);
        sparseIntArray.put(z8e.buttonDone, 5);
        sparseIntArray.put(z8e.outcomeTypeLayout, 6);
        sparseIntArray.put(z8e.pickColorText, 7);
        sparseIntArray.put(z8e.pickColor, 8);
        sparseIntArray.put(z8e.buttonAddOption, 9);
    }

    public fw(yt4 yt4Var, View view) {
        this(yt4Var, view, ewi.m25671L(yt4Var, view, 10, D0, E0));
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
            this.C0 = 8L;
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
        ck6 ck6Var = this.y0;
        ChatLabel chatLabel = this.w0;
        Integer num = this.x0;
        if (ck6Var != null) {
            return ck6Var.mo707a(view, num.intValue(), chatLabel);
        }
        return false;
    }

    @Override // p001o.ewi
    public boolean b0(int i, Object obj) {
        if (33 == i) {
            k0((ck6) obj);
        } else if (73 == i) {
            l0((Integer) obj);
        } else {
            if (67 != i) {
                return false;
            }
            j0((ChatLabel) obj);
        }
        return true;
    }

    @Override // p001o.jbc.InterfaceC14485a
    /* renamed from: c */
    public final void mo16294c(int i, View view) {
        ck6 ck6Var = this.y0;
        ChatLabel chatLabel = this.w0;
        Integer num = this.x0;
        if (ck6Var != null) {
            ck6Var.mo708b(view, num.intValue(), chatLabel);
        }
    }

    @Override // p001o.ew
    public void j0(ChatLabel chatLabel) {
        this.w0 = chatLabel;
        synchronized (this) {
            this.C0 |= 4;
        }
        m28509h(67);
        super.m25692R();
    }

    public void k0(ck6 ck6Var) {
        this.y0 = ck6Var;
        synchronized (this) {
            this.C0 |= 1;
        }
        m28509h(33);
        super.m25692R();
    }

    public void l0(Integer num) {
        this.x0 = num;
        synchronized (this) {
            this.C0 |= 2;
        }
        m28509h(73);
        super.m25692R();
    }

    @Override // p001o.ewi
    /* renamed from: p */
    public void mo16295p() {
        long j;
        synchronized (this) {
            j = this.C0;
            this.C0 = 0L;
        }
        ChatLabel chatLabel = this.w0;
        long j2 = 12 & j;
        String label = (j2 == 0 || chatLabel == null) ? null : chatLabel.getLabel();
        if ((j & 8) != 0) {
            this.q0.setOnClickListener(this.B0);
            this.q0.setOnLongClickListener(this.A0);
        }
        if (j2 != 0) {
            fjh.m26938c(this.s0, label);
        }
    }

    public fw(yt4 yt4Var, View view, Object[] objArr) {
        super(yt4Var, view, 0, (MaterialButton) objArr[9], (MaterialButton) objArr[3], (MaterialButton) objArr[5], (MaterialCardView) objArr[1], (TextInputLayout) objArr[6], (TextInputEditText) objArr[2], (MaterialButton) objArr[8], (MaterialTextView) objArr[7], (MaterialTextView) objArr[4]);
        this.C0 = -1L;
        this.q0.setTag(null);
        MaterialCardView materialCardView = (MaterialCardView) objArr[0];
        this.z0 = materialCardView;
        materialCardView.setTag(null);
        this.s0.setTag(null);
        a0(view);
        this.A0 = new sbc(this, 2);
        this.B0 = new jbc(this, 1);
        mo16291G();
    }
}
