package p001o;

import ai.salesmax.model.ChatMessages;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import p001o.ewi;

/* loaded from: classes.dex */
public class fx8 extends ex8 {
    public static final ewi.C13274i v0 = null;
    public static final SparseIntArray w0 = null;
    public final TextView t0;
    public long u0;

    public fx8(yt4 yt4Var, View view) {
        this(yt4Var, view, ewi.m25671L(yt4Var, view, 3, v0, w0));
    }

    @Override // p001o.ewi
    /* renamed from: E */
    public boolean mo16290E() {
        synchronized (this) {
            return this.u0 != 0;
        }
    }

    @Override // p001o.ewi
    /* renamed from: G */
    public void mo16291G() {
        synchronized (this) {
            this.u0 = 16L;
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
            i0((ck6) obj);
        } else if (67 == i) {
            j0((ChatMessages) obj);
        } else if (73 == i) {
            k0((Integer) obj);
        } else {
            if (7 != i) {
                return false;
            }
            h0((rog) obj);
        }
        return true;
    }

    public void h0(rog rogVar) {
        this.s0 = rogVar;
    }

    public void i0(ck6 ck6Var) {
        this.r0 = ck6Var;
    }

    public void j0(ChatMessages chatMessages) {
        this.p0 = chatMessages;
        synchronized (this) {
            this.u0 |= 2;
        }
        m28509h(67);
        super.m25692R();
    }

    public void k0(Integer num) {
        this.q0 = num;
    }

    @Override // p001o.ewi
    /* renamed from: p */
    public void mo16295p() {
        long j;
        long messageTime;
        String messageText;
        synchronized (this) {
            j = this.u0;
            messageTime = 0;
            this.u0 = 0L;
        }
        ChatMessages chatMessages = this.p0;
        long j2 = j & 18;
        if (j2 == 0 || chatMessages == null) {
            messageText = null;
        } else {
            messageText = chatMessages.getMessageText();
            messageTime = chatMessages.getMessageTime();
        }
        if (j2 != 0) {
            fjh.m26938c(this.t0, messageText);
            nr1.z2(this.o0, Long.valueOf(messageTime));
        }
    }

    public fx8(yt4 yt4Var, View view, Object[] objArr) {
        super(yt4Var, view, 0, (LinearLayout) objArr[0], (TextView) objArr[2]);
        this.u0 = -1L;
        this.n0.setTag(null);
        TextView textView = (TextView) objArr[1];
        this.t0 = textView;
        textView.setTag(null);
        this.o0.setTag(null);
        a0(view);
        mo16291G();
    }
}
