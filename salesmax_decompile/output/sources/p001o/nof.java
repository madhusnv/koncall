package p001o;

import ai.salesmax.model.ChatMessages;
import android.util.SparseIntArray;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.imageview.ShapeableImageView;
import com.google.android.material.textview.MaterialTextView;
import p001o.ewi;

/* loaded from: classes.dex */
public class nof extends mof {
    public static final ewi.C13274i H0;
    public static final SparseIntArray I0;
    public final ConstraintLayout E0;
    public final ConstraintLayout F0;
    public long G0;

    static {
        ewi.C13274i c13274i = new ewi.C13274i(18);
        H0 = c13274i;
        c13274i.m25699a(1, new String[]{"item_chat_me"}, new int[]{5}, new int[]{p9e.item_chat_me});
        SparseIntArray sparseIntArray = new SparseIntArray();
        I0 = sparseIntArray;
        sparseIntArray.put(z8e.messageDetailTitle, 6);
        sparseIntArray.put(z8e.buttonClose, 7);
        sparseIntArray.put(z8e.leadTitle, 8);
        sparseIntArray.put(z8e.sheetMessageSentTemplate, 9);
        sparseIntArray.put(z8e.messageSentTemplate, 10);
        sparseIntArray.put(z8e.messageSent, 11);
        sparseIntArray.put(z8e.sheetMessageDeliveredTemplate, 12);
        sparseIntArray.put(z8e.messageDeliveredTemplate, 13);
        sparseIntArray.put(z8e.messageDelivered, 14);
        sparseIntArray.put(z8e.sheetMessageReadTemplate, 15);
        sparseIntArray.put(z8e.messageReadTemplate, 16);
        sparseIntArray.put(z8e.messageRead, 17);
    }

    public nof(yt4 yt4Var, View view) {
        this(yt4Var, view, ewi.m25671L(yt4Var, view, 18, H0, I0));
    }

    @Override // p001o.ewi
    /* renamed from: E */
    public boolean mo16290E() {
        synchronized (this) {
            if (this.G0 != 0) {
                return true;
            }
            return this.z0.mo16290E();
        }
    }

    @Override // p001o.ewi
    /* renamed from: G */
    public void mo16291G() {
        synchronized (this) {
            this.G0 = 4L;
        }
        this.z0.mo16291G();
        m25692R();
    }

    @Override // p001o.ewi
    /* renamed from: M */
    public boolean mo16292M(int i, Object obj, int i2) {
        if (i != 0) {
            return false;
        }
        return k0((kx8) obj, i2);
    }

    @Override // p001o.ewi
    public boolean b0(int i, Object obj) {
        if (67 != i) {
            return false;
        }
        j0((ChatMessages) obj);
        return true;
    }

    @Override // p001o.mof
    public void j0(ChatMessages chatMessages) {
        this.D0 = chatMessages;
        synchronized (this) {
            this.G0 |= 2;
        }
        m28509h(67);
        super.m25692R();
    }

    public final boolean k0(kx8 kx8Var, int i) {
        if (i != 0) {
            return false;
        }
        synchronized (this) {
            this.G0 |= 1;
        }
        return true;
    }

    @Override // p001o.ewi
    /* renamed from: p */
    public void mo16295p() {
        long j;
        long sentAt;
        long j2;
        synchronized (this) {
            j = this.G0;
            sentAt = 0;
            this.G0 = 0L;
        }
        ChatMessages chatMessages = this.D0;
        long j3 = j & 6;
        if (j3 == 0 || chatMessages == null) {
            j2 = 0;
        } else {
            long readAt = chatMessages.getReadAt();
            sentAt = chatMessages.getSentAt();
            j2 = readAt;
        }
        if (j3 != 0) {
            nr1.k0(this.r0, Long.valueOf(sentAt));
            nr1.k0(this.v0, Long.valueOf(j2));
            nr1.k0(this.y0, Long.valueOf(sentAt));
            this.z0.h0(chatMessages);
        }
        ewi.m25683r(this.z0);
    }

    public nof(yt4 yt4Var, View view, Object[] objArr) {
        super(yt4Var, view, 1, (ShapeableImageView) objArr[7], (MaterialTextView) objArr[8], (MaterialTextView) objArr[14], (MaterialButton) objArr[13], (MaterialTextView) objArr[3], (ConstraintLayout) objArr[6], (MaterialTextView) objArr[17], (MaterialButton) objArr[16], (MaterialTextView) objArr[4], (MaterialTextView) objArr[11], (MaterialButton) objArr[10], (MaterialTextView) objArr[2], (kx8) objArr[5], (ConstraintLayout) objArr[12], (ConstraintLayout) objArr[15], (ConstraintLayout) objArr[9]);
        this.G0 = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.E0 = constraintLayout;
        constraintLayout.setTag(null);
        ConstraintLayout constraintLayout2 = (ConstraintLayout) objArr[1];
        this.F0 = constraintLayout2;
        constraintLayout2.setTag(null);
        this.r0.setTag(null);
        this.v0.setTag(null);
        this.y0.setTag(null);
        m25693Z(this.z0);
        a0(view);
        mo16291G();
    }
}
