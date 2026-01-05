package p001o;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textview.MaterialTextView;
import p001o.ewi;

/* loaded from: classes.dex */
public class gnf extends fnf {
    public static final ewi.C13274i c1 = null;
    public static final SparseIntArray d1;
    public final LinearLayout a1;
    public long b1;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        d1 = sparseIntArray;
        sparseIntArray.put(z8e.sheetSearchChat, 1);
        sparseIntArray.put(z8e.sheetSearchChatPic, 2);
        sparseIntArray.put(z8e.sheetSearchChatText, 3);
        sparseIntArray.put(z8e.putLabel, 4);
        sparseIntArray.put(z8e.putLabelIcon, 5);
        sparseIntArray.put(z8e.deleteName, 6);
        sparseIntArray.put(z8e.sheetAssignChat, 7);
        sparseIntArray.put(z8e.assigneeProfilePic, 8);
        sparseIntArray.put(z8e.assigneeName, 9);
        sparseIntArray.put(z8e.inviteOthersToChat, 10);
        sparseIntArray.put(z8e.inviteOthersToChatIcon, 11);
        sparseIntArray.put(z8e.inviteOthersToChatLabel, 12);
        sparseIntArray.put(z8e.markAsClosed, 13);
        sparseIntArray.put(z8e.markAsClosedIcon, 14);
        sparseIntArray.put(z8e.markAsClosedLabel, 15);
        sparseIntArray.put(z8e.markAsOpen, 16);
        sparseIntArray.put(z8e.markAsOpenIcon, 17);
        sparseIntArray.put(z8e.markAsOpenLabel, 18);
        sparseIntArray.put(z8e.createNextStep, 19);
        sparseIntArray.put(z8e.createNextStepIcon, 20);
        sparseIntArray.put(z8e.createNextStepLabel, 21);
        sparseIntArray.put(z8e.updateOpenTask, 22);
        sparseIntArray.put(z8e.updateOpenTaskIcon, 23);
        sparseIntArray.put(z8e.updateOpenTaskLabel, 24);
        sparseIntArray.put(z8e.editLeadDetail, 25);
        sparseIntArray.put(z8e.editLeadDetailIcon, 26);
        sparseIntArray.put(z8e.editLeadDetailLabel, 27);
        sparseIntArray.put(z8e.createTicket, 28);
        sparseIntArray.put(z8e.createTicketIcon, 29);
        sparseIntArray.put(z8e.createTicketLabel, 30);
        sparseIntArray.put(z8e.addMessageOutcome, 31);
        sparseIntArray.put(z8e.addMessageOutcomeIcon, 32);
        sparseIntArray.put(z8e.addMessageOutcomeLabel, 33);
        sparseIntArray.put(z8e.leaveChat, 34);
        sparseIntArray.put(z8e.leaveChatIcon, 35);
        sparseIntArray.put(z8e.leaveChatLabel, 36);
        sparseIntArray.put(z8e.handleChatBot, 37);
        sparseIntArray.put(z8e.handleChatBotIcon, 38);
        sparseIntArray.put(z8e.handleChatBotLabel, 39);
    }

    public gnf(yt4 yt4Var, View view) {
        this(yt4Var, view, ewi.m25671L(yt4Var, view, 40, c1, d1));
    }

    @Override // p001o.ewi
    /* renamed from: E */
    public boolean mo16290E() {
        synchronized (this) {
            return this.b1 != 0;
        }
    }

    @Override // p001o.ewi
    /* renamed from: G */
    public void mo16291G() {
        synchronized (this) {
            this.b1 = 1L;
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
            this.b1 = 0L;
        }
    }

    public gnf(yt4 yt4Var, View view, Object[] objArr) {
        super(yt4Var, view, 0, (ConstraintLayout) objArr[31], (MaterialButton) objArr[32], (MaterialTextView) objArr[33], (MaterialTextView) objArr[9], (MaterialButton) objArr[8], (ConstraintLayout) objArr[19], (MaterialButton) objArr[20], (MaterialTextView) objArr[21], (ConstraintLayout) objArr[28], (MaterialButton) objArr[29], (MaterialTextView) objArr[30], (MaterialTextView) objArr[6], (ConstraintLayout) objArr[25], (MaterialButton) objArr[26], (MaterialTextView) objArr[27], (ConstraintLayout) objArr[37], (MaterialButton) objArr[38], (MaterialTextView) objArr[39], (ConstraintLayout) objArr[10], (MaterialButton) objArr[11], (MaterialTextView) objArr[12], (ConstraintLayout) objArr[34], (MaterialButton) objArr[35], (MaterialTextView) objArr[36], (ConstraintLayout) objArr[13], (MaterialButton) objArr[14], (MaterialTextView) objArr[15], (ConstraintLayout) objArr[16], (MaterialButton) objArr[17], (MaterialTextView) objArr[18], (ConstraintLayout) objArr[4], (MaterialButton) objArr[5], (ConstraintLayout) objArr[7], (ConstraintLayout) objArr[1], (MaterialButton) objArr[2], (MaterialTextView) objArr[3], (ConstraintLayout) objArr[22], (MaterialButton) objArr[23], (MaterialTextView) objArr[24]);
        this.b1 = -1L;
        LinearLayout linearLayout = (LinearLayout) objArr[0];
        this.a1 = linearLayout;
        linearLayout.setTag(null);
        a0(view);
        mo16291G();
    }
}
