package p001o;

import ai.salesmax.model.ChatChannel;
import ai.salesmax.model.Leads;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatAutoCompleteTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.google.android.gms.cast.MediaStatus;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.chip.Chip;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.imageview.ShapeableImageView;
import com.google.android.material.progressindicator.CircularProgressIndicator;
import com.google.android.material.textfield.TextInputLayout;
import com.google.android.material.textview.MaterialTextView;
import com.ortiz.touchview.TouchImageView;
import p001o.ewi;

/* loaded from: classes.dex */
public class pg7 extends og7 {
    public static final ewi.C13274i F1;
    public static final SparseIntArray G1;
    public final x44 A1;
    public final v44 B1;
    public final x44 C1;
    public final v44 D1;
    public long E1;
    public final LinearLayout s1;
    public final v44 t1;
    public final x44 u1;
    public final v44 v1;
    public final x44 w1;
    public final v44 x1;
    public final x44 y1;
    public final v44 z1;

    static {
        ewi.C13274i c13274i = new ewi.C13274i(61);
        F1 = c13274i;
        int i = p9e.content_shimmer_chat_my;
        int i2 = p9e.content_shimmer_chat_other;
        c13274i.m25699a(10, new String[]{"content_shimmer_chat_my", "content_shimmer_chat_other", "content_shimmer_chat_my", "content_shimmer_chat_other", "content_shimmer_chat_my", "content_shimmer_chat_other", "content_shimmer_chat_my", "content_shimmer_chat_other", "content_shimmer_chat_my", "content_shimmer_chat_other", "content_shimmer_chat_my"}, new int[]{16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26}, new int[]{i, i2, i, i2, i, i2, i, i2, i, i2, i});
        SparseIntArray sparseIntArray = new SparseIntArray();
        G1 = sparseIntArray;
        sparseIntArray.put(z8e.buttonClose, 27);
        sparseIntArray.put(z8e.placeCallButton, 28);
        sparseIntArray.put(z8e.openWhatsappButton, 29);
        sparseIntArray.put(z8e.chatDoMore, 30);
        sparseIntArray.put(z8e.buttonCloseOnSelection, 31);
        sparseIntArray.put(z8e.chatMessageCopy, 32);
        sparseIntArray.put(z8e.chatMessageInfo, 33);
        sparseIntArray.put(z8e.chatStarMessage, 34);
        sparseIntArray.put(z8e.chatDownloadFile, 35);
        sparseIntArray.put(z8e.chatShareFile, 36);
        sparseIntArray.put(z8e.shimmerLayout, 37);
        sparseIntArray.put(z8e.newUnreadMessageBlock, 38);
        sparseIntArray.put(z8e.newUnreadMessageChip, 39);
        sparseIntArray.put(z8e.rvChatMessagesList, 40);
        sparseIntArray.put(z8e.autoCallExplanation, 41);
        sparseIntArray.put(z8e.layout_message_with_reply, 42);
        sparseIntArray.put(z8e.reply_layout, 43);
        sparseIntArray.put(z8e.image_line, 44);
        sparseIntArray.put(z8e.textQuotedMessageSentBy, 45);
        sparseIntArray.put(z8e.textQuotedMessage, 46);
        sparseIntArray.put(z8e.cancelButton, 47);
        sparseIntArray.put(z8e.layout_message_icons, 48);
        sparseIntArray.put(z8e.emoticonButton, 49);
        sparseIntArray.put(z8e.messageTextLayout, 50);
        sparseIntArray.put(z8e.taskCommentEditText, 51);
        sparseIntArray.put(z8e.cameraButton, 52);
        sparseIntArray.put(z8e.scanButton, 53);
        sparseIntArray.put(z8e.sendTemplateButton, 54);
        sparseIntArray.put(z8e.attachButton, 55);
        sparseIntArray.put(z8e.sendMessageButton, 56);
        sparseIntArray.put(z8e.sendWhatsappTemplateMessageOnly, 57);
        sparseIntArray.put(z8e.fabAddUser, 58);
        sparseIntArray.put(z8e.imageOverlayContainer, 59);
        sparseIntArray.put(z8e.closeButton, 60);
    }

    public pg7(yt4 yt4Var, View view) {
        this(yt4Var, view, ewi.m25671L(yt4Var, view, 61, F1, G1));
    }

    @Override // p001o.ewi
    /* renamed from: E */
    public boolean mo16290E() {
        synchronized (this) {
            if (this.E1 != 0) {
                return true;
            }
            return this.t1.mo16290E() || this.w1.mo16290E() || this.x1.mo16290E() || this.y1.mo16290E() || this.z1.mo16290E() || this.A1.mo16290E() || this.B1.mo16290E() || this.C1.mo16290E() || this.D1.mo16290E() || this.u1.mo16290E() || this.v1.mo16290E();
        }
    }

    @Override // p001o.ewi
    /* renamed from: G */
    public void mo16291G() {
        synchronized (this) {
            this.E1 = 256L;
        }
        this.t1.mo16291G();
        this.w1.mo16291G();
        this.x1.mo16291G();
        this.y1.mo16291G();
        this.z1.mo16291G();
        this.A1.mo16291G();
        this.B1.mo16291G();
        this.C1.mo16291G();
        this.D1.mo16291G();
        this.u1.mo16291G();
        this.v1.mo16291G();
        m25692R();
    }

    @Override // p001o.ewi
    /* renamed from: M */
    public boolean mo16292M(int i, Object obj, int i2) {
        return false;
    }

    @Override // p001o.ewi
    public boolean b0(int i, Object obj) {
        if (90 == i) {
            s0(((Boolean) obj).booleanValue());
        } else if (2 == i) {
            l0((ChatChannel) obj);
        } else if (48 == i) {
            m0((String) obj);
        } else if (80 == i) {
            q0((Integer) obj);
        } else if (50 == i) {
            n0((Boolean) obj);
        } else if (73 == i) {
            u0((Integer) obj);
        } else if (61 == i) {
            p0((Leads) obj);
        } else {
            if (33 != i) {
                return false;
            }
            t0((ck6) obj);
        }
        return true;
    }

    @Override // p001o.og7
    public void l0(ChatChannel chatChannel) {
        this.m1 = chatChannel;
        synchronized (this) {
            this.E1 |= 2;
        }
        m28509h(2);
        super.m25692R();
    }

    @Override // p001o.og7
    public void m0(String str) {
        this.q1 = str;
        synchronized (this) {
            this.E1 |= 4;
        }
        m28509h(48);
        super.m25692R();
    }

    @Override // p001o.og7
    public void n0(Boolean bool) {
        this.p1 = bool;
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x009f  */
    @Override // p001o.ewi
    /* renamed from: p */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void mo16295p() {
        long j;
        boolean z;
        Long l;
        String str;
        int i;
        int i2;
        boolean z2;
        long j2;
        long j3;
        Leads contact;
        Long channelWillBeChargedNext;
        String recipientExternalId;
        synchronized (this) {
            j = this.E1;
            this.E1 = 0L;
        }
        ChatChannel chatChannel = this.m1;
        String str2 = this.q1;
        Integer num = this.l1;
        Leads leads = this.n1;
        long j4 = j & 258;
        int i3 = 0;
        if (j4 != 0) {
            if (chatChannel != null) {
                contact = chatChannel.getContact();
                channelWillBeChargedNext = chatChannel.getChannelWillBeChargedNext();
                recipientExternalId = chatChannel.getRecipientExternalId();
            } else {
                contact = null;
                channelWillBeChargedNext = null;
                recipientExternalId = null;
            }
            z = contact == null;
            if (j4 != 0) {
                j = z ? j | MediaStatus.COMMAND_EDIT_TRACKS : j | MediaStatus.COMMAND_QUEUE_REPEAT_ONE;
            }
            l = channelWillBeChargedNext;
            str = recipientExternalId;
        } else {
            z = false;
            l = null;
            str = null;
        }
        long j5 = j & 264;
        if (j5 != 0) {
            boolean z3 = ewi.m25674U(num) > 0;
            if (j5 != 0) {
                if (z3) {
                    j2 = j | MediaStatus.COMMAND_LIKE;
                    j3 = MediaStatus.COMMAND_FOLLOW;
                } else {
                    j2 = j | MediaStatus.COMMAND_PLAYBACK_RATE;
                    j3 = MediaStatus.COMMAND_DISLIKE;
                }
                j = j2 | j3;
            }
            int i4 = z3 ? 0 : 8;
            i = z3 ? 8 : 0;
            i2 = i4;
        } else {
            i = 0;
            i2 = 0;
        }
        if ((MediaStatus.COMMAND_EDIT_TRACKS & j) == 0) {
            z2 = false;
        } else {
            if ((chatChannel != null ? chatChannel.getVisitorId() : null) != null) {
                z2 = true;
            }
        }
        long j6 = j & 258;
        if (j6 != 0) {
            if (!z) {
                z2 = false;
            }
            if (j6 != 0) {
                j |= z2 ? MediaStatus.COMMAND_QUEUE_REPEAT_ALL : 512L;
            }
            if (!z2) {
                i3 = 8;
            }
        }
        int i5 = i3;
        if ((j & 264) != 0) {
            this.t0.setVisibility(i);
            this.u0.setVisibility(i2);
        }
        if ((258 & j) != 0) {
            nr1.i1(this.B0, chatChannel);
            nr1.Y0(this.J0, chatChannel);
            nr1.m40933D(this.M0, chatChannel);
            nr1.m40935F(this.N0, chatChannel);
            nr1.r1(this.T0, chatChannel);
            nr1.m40934E(this.d1, chatChannel);
            nr1.m40936G(this.e1, chatChannel);
            nr1.C2(this.h1, l);
            this.j1.setVisibility(i5);
            fjh.m26938c(this.j1, str);
        }
        if ((320 & j) != 0) {
            nr1.d1(this.C0, leads);
            nr1.Z0(this.i1, leads);
        }
        if ((j & 260) != 0) {
            nr1.F2(this.I0, str2);
        }
        ewi.m25683r(this.t1);
        ewi.m25683r(this.w1);
        ewi.m25683r(this.x1);
        ewi.m25683r(this.y1);
        ewi.m25683r(this.z1);
        ewi.m25683r(this.A1);
        ewi.m25683r(this.B1);
        ewi.m25683r(this.C1);
        ewi.m25683r(this.D1);
        ewi.m25683r(this.u1);
        ewi.m25683r(this.v1);
    }

    @Override // p001o.og7
    public void p0(Leads leads) {
        this.n1 = leads;
        synchronized (this) {
            this.E1 |= 64;
        }
        m28509h(61);
        super.m25692R();
    }

    @Override // p001o.og7
    public void q0(Integer num) {
        this.l1 = num;
        synchronized (this) {
            this.E1 |= 8;
        }
        m28509h(80);
        super.m25692R();
    }

    @Override // p001o.og7
    public void s0(boolean z) {
        this.k1 = z;
    }

    public void t0(ck6 ck6Var) {
        this.r1 = ck6Var;
    }

    public void u0(Integer num) {
        this.o1 = num;
    }

    public pg7(yt4 yt4Var, View view, Object[] objArr) {
        super(yt4Var, view, 0, (ShapeableImageView) objArr[55], (MaterialCardView) objArr[41], (ShapeableImageView) objArr[27], (ShapeableImageView) objArr[31], (ShapeableImageView) objArr[52], (ShapeableImageView) objArr[47], (ConstraintLayout) objArr[1], (ConstraintLayout) objArr[8], (ShapeableImageView) objArr[30], (ShapeableImageView) objArr[35], (ShapeableImageView) objArr[32], (ShapeableImageView) objArr[33], (ShapeableImageView) objArr[36], (ShapeableImageView) objArr[34], (MaterialTextView) objArr[3], (MaterialTextView) objArr[9], (ImageView) objArr[60], (ShapeableImageView) objArr[49], (FloatingActionButton) objArr[58], (View) objArr[44], (FrameLayout) objArr[59], (TouchImageView) objArr[15], (ShapeableImageView) objArr[2], (LinearLayout) objArr[48], (LinearLayout) objArr[42], (LinearLayout) objArr[11], (LinearLayout) objArr[13], (TextInputLayout) objArr[50], (RelativeLayout) objArr[38], (Chip) objArr[39], (ShapeableImageView) objArr[29], (ShapeableImageView) objArr[28], (CircularProgressIndicator) objArr[6], (ConstraintLayout) objArr[43], (ConstraintLayout) objArr[0], (RecyclerView) objArr[40], (ShapeableImageView) objArr[53], (ShapeableImageView) objArr[56], (ShapeableImageView) objArr[54], (MaterialButton) objArr[57], (ShimmerFrameLayout) objArr[37], (AppCompatAutoCompleteTextView) objArr[51], (MaterialTextView) objArr[14], (MaterialTextView) objArr[12], (MaterialTextView) objArr[46], (MaterialTextView) objArr[45], (TextView) objArr[7], (MaterialTextView) objArr[4], (MaterialTextView) objArr[5]);
        this.E1 = -1L;
        this.t0.setTag(null);
        this.u0.setTag(null);
        this.B0.setTag(null);
        this.C0.setTag(null);
        this.I0.setTag(null);
        this.J0.setTag(null);
        this.M0.setTag(null);
        this.N0.setTag(null);
        LinearLayout linearLayout = (LinearLayout) objArr[10];
        this.s1 = linearLayout;
        linearLayout.setTag(null);
        v44 v44Var = (v44) objArr[16];
        this.t1 = v44Var;
        m25693Z(v44Var);
        x44 x44Var = (x44) objArr[25];
        this.u1 = x44Var;
        m25693Z(x44Var);
        v44 v44Var2 = (v44) objArr[26];
        this.v1 = v44Var2;
        m25693Z(v44Var2);
        x44 x44Var2 = (x44) objArr[17];
        this.w1 = x44Var2;
        m25693Z(x44Var2);
        v44 v44Var3 = (v44) objArr[18];
        this.x1 = v44Var3;
        m25693Z(v44Var3);
        x44 x44Var3 = (x44) objArr[19];
        this.y1 = x44Var3;
        m25693Z(x44Var3);
        v44 v44Var4 = (v44) objArr[20];
        this.z1 = v44Var4;
        m25693Z(v44Var4);
        x44 x44Var4 = (x44) objArr[21];
        this.A1 = x44Var4;
        m25693Z(x44Var4);
        v44 v44Var5 = (v44) objArr[22];
        this.B1 = v44Var5;
        m25693Z(v44Var5);
        x44 x44Var5 = (x44) objArr[23];
        this.C1 = x44Var5;
        m25693Z(x44Var5);
        v44 v44Var6 = (v44) objArr[24];
        this.D1 = v44Var6;
        m25693Z(v44Var6);
        this.T0.setTag(null);
        this.V0.setTag(null);
        this.d1.setTag(null);
        this.e1.setTag(null);
        this.h1.setTag(null);
        this.i1.setTag(null);
        this.j1.setTag(null);
        a0(view);
        mo16291G();
    }
}
