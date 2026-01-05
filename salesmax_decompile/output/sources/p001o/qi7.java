package p001o;

import ai.salesmax.model.ChatChannel;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.appcompat.widget.AppCompatAutoCompleteTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.google.android.gms.cast.MediaStatus;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.chip.Chip;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.imageview.ShapeableImageView;
import com.google.android.material.textfield.TextInputLayout;
import com.google.android.material.textview.MaterialTextView;
import com.ortiz.touchview.TouchImageView;
import p001o.ewi;

/* loaded from: classes.dex */
public class qi7 extends pi7 {
    public static final SparseIntArray A1;
    public static final ewi.C13274i z1;
    public final LinearLayout m1;
    public final v44 n1;
    public final x44 o1;
    public final v44 p1;
    public final x44 q1;
    public final v44 r1;
    public final x44 s1;
    public final v44 t1;
    public final x44 u1;
    public final v44 v1;
    public final x44 w1;
    public final v44 x1;
    public long y1;

    static {
        ewi.C13274i c13274i = new ewi.C13274i(56);
        z1 = c13274i;
        int i = p9e.content_shimmer_chat_my;
        int i2 = p9e.content_shimmer_chat_other;
        c13274i.m25699a(9, new String[]{"content_shimmer_chat_my", "content_shimmer_chat_other", "content_shimmer_chat_my", "content_shimmer_chat_other", "content_shimmer_chat_my", "content_shimmer_chat_other", "content_shimmer_chat_my", "content_shimmer_chat_other", "content_shimmer_chat_my", "content_shimmer_chat_other", "content_shimmer_chat_my"}, new int[]{12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22}, new int[]{i, i2, i, i2, i, i2, i, i2, i, i2, i});
        SparseIntArray sparseIntArray = new SparseIntArray();
        A1 = sparseIntArray;
        sparseIntArray.put(z8e.buttonClose, 23);
        sparseIntArray.put(z8e.tvContactNumber, 24);
        sparseIntArray.put(z8e.membersAdded, 25);
        sparseIntArray.put(z8e.chatDoMore, 26);
        sparseIntArray.put(z8e.buttonCloseOnSelection, 27);
        sparseIntArray.put(z8e.chatMessageCopy, 28);
        sparseIntArray.put(z8e.chatMessageInfo, 29);
        sparseIntArray.put(z8e.chatStarMessage, 30);
        sparseIntArray.put(z8e.chatDownloadFile, 31);
        sparseIntArray.put(z8e.chatShareFile, 32);
        sparseIntArray.put(z8e.shimmerLayout, 33);
        sparseIntArray.put(z8e.newUnreadMessageBlock, 34);
        sparseIntArray.put(z8e.newUnreadMessageChip, 35);
        sparseIntArray.put(z8e.rvChatMessagesList, 36);
        sparseIntArray.put(z8e.layout_send_message, 37);
        sparseIntArray.put(z8e.autoCallExplanation, 38);
        sparseIntArray.put(z8e.layout_message_with_reply, 39);
        sparseIntArray.put(z8e.reply_layout, 40);
        sparseIntArray.put(z8e.image_line, 41);
        sparseIntArray.put(z8e.textQuotedMessageSentBy, 42);
        sparseIntArray.put(z8e.textQuotedMessage, 43);
        sparseIntArray.put(z8e.cancelButton, 44);
        sparseIntArray.put(z8e.layout_message_icons, 45);
        sparseIntArray.put(z8e.emoticonButton, 46);
        sparseIntArray.put(z8e.messageTextLayout, 47);
        sparseIntArray.put(z8e.taskCommentEditText, 48);
        sparseIntArray.put(z8e.cameraButton, 49);
        sparseIntArray.put(z8e.sendTemplateButton, 50);
        sparseIntArray.put(z8e.attachButton, 51);
        sparseIntArray.put(z8e.sendMessageButton, 52);
        sparseIntArray.put(z8e.fabAddUser, 53);
        sparseIntArray.put(z8e.imageOverlayContainer, 54);
        sparseIntArray.put(z8e.closeButton, 55);
    }

    public qi7(yt4 yt4Var, View view) {
        this(yt4Var, view, ewi.m25671L(yt4Var, view, 56, z1, A1));
    }

    @Override // p001o.ewi
    /* renamed from: E */
    public boolean mo16290E() {
        synchronized (this) {
            if (this.y1 != 0) {
                return true;
            }
            return this.n1.mo16290E() || this.q1.mo16290E() || this.r1.mo16290E() || this.s1.mo16290E() || this.t1.mo16290E() || this.u1.mo16290E() || this.v1.mo16290E() || this.w1.mo16290E() || this.x1.mo16290E() || this.o1.mo16290E() || this.p1.mo16290E();
        }
    }

    @Override // p001o.ewi
    /* renamed from: G */
    public void mo16291G() {
        synchronized (this) {
            this.y1 = 128L;
        }
        this.n1.mo16291G();
        this.q1.mo16291G();
        this.r1.mo16291G();
        this.s1.mo16291G();
        this.t1.mo16291G();
        this.u1.mo16291G();
        this.v1.mo16291G();
        this.w1.mo16291G();
        this.x1.mo16291G();
        this.o1.mo16291G();
        this.p1.mo16291G();
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
            p0(((Boolean) obj).booleanValue());
        } else if (2 == i) {
            k0((ChatChannel) obj);
        } else if (48 == i) {
            l0((String) obj);
        } else if (80 == i) {
            n0((Integer) obj);
        } else if (50 == i) {
            m0((Boolean) obj);
        } else if (73 == i) {
            s0((Integer) obj);
        } else {
            if (33 != i) {
                return false;
            }
            q0((ck6) obj);
        }
        return true;
    }

    @Override // p001o.pi7
    public void k0(ChatChannel chatChannel) {
        this.h1 = chatChannel;
        synchronized (this) {
            this.y1 |= 2;
        }
        m28509h(2);
        super.m25692R();
    }

    @Override // p001o.pi7
    public void l0(String str) {
        this.k1 = str;
        synchronized (this) {
            this.y1 |= 4;
        }
        m28509h(48);
        super.m25692R();
    }

    @Override // p001o.pi7
    public void m0(Boolean bool) {
        this.j1 = bool;
    }

    @Override // p001o.pi7
    public void n0(Integer num) {
        this.g1 = num;
        synchronized (this) {
            this.y1 |= 8;
        }
        m28509h(80);
        super.m25692R();
    }

    /* JADX WARN: Removed duplicated region for block: B:67:0x00bd A[PHI: r2
      0x00bd: PHI (r2v3 long) = (r2v2 long), (r2v6 long) binds: [B:55:0x00a5, B:64:0x00b7] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // p001o.ewi
    /* renamed from: p */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void mo16295p() {
        long j;
        int i;
        boolean zEqualsIgnoreCase;
        int i2;
        int i3;
        boolean z;
        int i4;
        long j2;
        long j3;
        boolean zEqualsIgnoreCase2;
        synchronized (this) {
            j = this.y1;
            this.y1 = 0L;
        }
        ChatChannel chatChannel = this.h1;
        String str = this.k1;
        Integer num = this.g1;
        long j4 = j & 130;
        if (j4 != 0) {
            String participantScopeIfInternal = chatChannel != null ? chatChannel.getParticipantScopeIfInternal() : null;
            if (participantScopeIfInternal != null) {
                zEqualsIgnoreCase = participantScopeIfInternal.equalsIgnoreCase("GROUP");
                zEqualsIgnoreCase2 = participantScopeIfInternal.equalsIgnoreCase("DIRECT");
            } else {
                zEqualsIgnoreCase = false;
                zEqualsIgnoreCase2 = false;
            }
            if (j4 != 0) {
                j = zEqualsIgnoreCase ? j | MediaStatus.COMMAND_PLAYBACK_RATE : j | MediaStatus.COMMAND_EDIT_TRACKS;
            }
            if ((j & 130) != 0) {
                j |= zEqualsIgnoreCase2 ? 512L : 256L;
            }
            i = zEqualsIgnoreCase2 ? 0 : 8;
        } else {
            i = 0;
            zEqualsIgnoreCase = false;
        }
        long j5 = j & 136;
        if (j5 != 0) {
            boolean z2 = ewi.m25674U(num) > 0;
            if (j5 != 0) {
                if (z2) {
                    j2 = j | MediaStatus.COMMAND_QUEUE_REPEAT_ONE;
                    j3 = MediaStatus.COMMAND_DISLIKE;
                } else {
                    j2 = j | MediaStatus.COMMAND_QUEUE_REPEAT_ALL;
                    j3 = MediaStatus.COMMAND_LIKE;
                }
                j = j2 | j3;
            }
            int i5 = z2 ? 0 : 8;
            i2 = z2 ? 8 : 0;
            i3 = i5;
        } else {
            i2 = 0;
            i3 = 0;
        }
        if ((MediaStatus.COMMAND_PLAYBACK_RATE & j) != 0) {
            z = !(chatChannel != null ? chatChannel.getExternalParticipantsAllowed() : false);
        } else {
            z = false;
        }
        long j6 = j & 130;
        if (j6 == 0) {
            i4 = 0;
        } else {
            if (!zEqualsIgnoreCase) {
                z = false;
            }
            if (j6 != 0) {
                j |= z ? MediaStatus.COMMAND_UNFOLLOW : MediaStatus.COMMAND_FOLLOW;
            }
            if (!z) {
                i4 = 8;
            }
        }
        if ((130 & j) != 0) {
            this.t0.setVisibility(i4);
            nr1.m40931B(this.C0, chatChannel);
            nr1.m40931B(this.D0, chatChannel);
            nr1.m40932C(this.K0, chatChannel);
            this.S0.setVisibility(i);
            this.T0.setVisibility(i);
            nr1.m40936G(this.b1, chatChannel);
        }
        if ((j & 136) != 0) {
            this.u0.setVisibility(i2);
            this.v0.setVisibility(i3);
        }
        if ((j & 132) != 0) {
            nr1.F2(this.J0, str);
        }
        ewi.m25683r(this.n1);
        ewi.m25683r(this.q1);
        ewi.m25683r(this.r1);
        ewi.m25683r(this.s1);
        ewi.m25683r(this.t1);
        ewi.m25683r(this.u1);
        ewi.m25683r(this.v1);
        ewi.m25683r(this.w1);
        ewi.m25683r(this.x1);
        ewi.m25683r(this.o1);
        ewi.m25683r(this.p1);
    }

    @Override // p001o.pi7
    public void p0(boolean z) {
        this.f1 = z;
    }

    public void q0(ck6 ck6Var) {
        this.l1 = ck6Var;
    }

    public void s0(Integer num) {
        this.i1 = num;
    }

    public qi7(yt4 yt4Var, View view, Object[] objArr) {
        super(yt4Var, view, 0, (ShapeableImageView) objArr[51], (MaterialCardView) objArr[38], (ShapeableImageView) objArr[23], (ShapeableImageView) objArr[27], (ShapeableImageView) objArr[49], (ShapeableImageView) objArr[44], (ShapeableImageView) objArr[6], (ConstraintLayout) objArr[1], (ConstraintLayout) objArr[7], (ShapeableImageView) objArr[26], (ShapeableImageView) objArr[31], (ShapeableImageView) objArr[28], (ShapeableImageView) objArr[29], (ShapeableImageView) objArr[32], (ShapeableImageView) objArr[30], (MaterialTextView) objArr[3], (MaterialTextView) objArr[8], (ImageView) objArr[55], (ShapeableImageView) objArr[46], (FloatingActionButton) objArr[53], (View) objArr[41], (FrameLayout) objArr[54], (TouchImageView) objArr[11], (ShapeableImageView) objArr[2], (LinearLayout) objArr[45], (LinearLayout) objArr[39], (LinearLayout) objArr[37], (MaterialTextView) objArr[25], (TextInputLayout) objArr[47], (RelativeLayout) objArr[34], (Chip) objArr[35], (ShapeableImageView) objArr[5], (ShapeableImageView) objArr[4], (ConstraintLayout) objArr[40], (ConstraintLayout) objArr[0], (RecyclerView) objArr[36], (ShapeableImageView) objArr[52], (ShapeableImageView) objArr[50], (ShimmerFrameLayout) objArr[33], (AppCompatAutoCompleteTextView) objArr[48], (MaterialTextView) objArr[10], (MaterialTextView) objArr[43], (MaterialTextView) objArr[42], (MaterialTextView) objArr[24]);
        this.y1 = -1L;
        this.t0.setTag(null);
        this.u0.setTag(null);
        this.v0.setTag(null);
        this.C0.setTag(null);
        this.D0.setTag(null);
        this.J0.setTag(null);
        this.K0.setTag(null);
        LinearLayout linearLayout = (LinearLayout) objArr[9];
        this.m1 = linearLayout;
        linearLayout.setTag(null);
        v44 v44Var = (v44) objArr[12];
        this.n1 = v44Var;
        m25693Z(v44Var);
        x44 x44Var = (x44) objArr[21];
        this.o1 = x44Var;
        m25693Z(x44Var);
        v44 v44Var2 = (v44) objArr[22];
        this.p1 = v44Var2;
        m25693Z(v44Var2);
        x44 x44Var2 = (x44) objArr[13];
        this.q1 = x44Var2;
        m25693Z(x44Var2);
        v44 v44Var3 = (v44) objArr[14];
        this.r1 = v44Var3;
        m25693Z(v44Var3);
        x44 x44Var3 = (x44) objArr[15];
        this.s1 = x44Var3;
        m25693Z(x44Var3);
        v44 v44Var4 = (v44) objArr[16];
        this.t1 = v44Var4;
        m25693Z(v44Var4);
        x44 x44Var4 = (x44) objArr[17];
        this.u1 = x44Var4;
        m25693Z(x44Var4);
        v44 v44Var5 = (v44) objArr[18];
        this.v1 = v44Var5;
        m25693Z(v44Var5);
        x44 x44Var5 = (x44) objArr[19];
        this.w1 = x44Var5;
        m25693Z(x44Var5);
        v44 v44Var6 = (v44) objArr[20];
        this.x1 = v44Var6;
        m25693Z(v44Var6);
        this.S0.setTag(null);
        this.T0.setTag(null);
        this.V0.setTag(null);
        this.b1.setTag(null);
        a0(view);
        mo16291G();
    }
}
