package p001o;

import ai.salesmax.model.ChatMessages;
import ai.salesmax.model.FileData;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.gms.cast.MediaStatus;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.imageview.ShapeableImageView;
import com.google.android.material.textview.MaterialTextView;
import p001o.ewi;
import p001o.jbc;
import p001o.sbc;

/* loaded from: classes.dex */
public class hx8 extends gx8 implements jbc.InterfaceC14485a, sbc.InterfaceC16795a {
    public static final ewi.C13274i s1 = null;
    public static final SparseIntArray t1;
    public final ConstraintLayout M0;
    public final ProgressBar N0;
    public final TextView O0;
    public final LinearLayout P0;
    public final View.OnClickListener Q0;
    public final View.OnClickListener R0;
    public final View.OnClickListener S0;
    public final View.OnLongClickListener T0;
    public final View.OnClickListener U0;
    public final View.OnLongClickListener V0;
    public final View.OnClickListener W0;
    public final View.OnLongClickListener X0;
    public final View.OnLongClickListener Y0;
    public final View.OnLongClickListener Z0;
    public final View.OnClickListener a1;
    public final View.OnClickListener b1;
    public final View.OnLongClickListener c1;
    public final View.OnClickListener d1;
    public final View.OnClickListener e1;
    public final View.OnLongClickListener f1;
    public final View.OnLongClickListener g1;
    public final View.OnLongClickListener h1;
    public final View.OnClickListener i1;
    public final View.OnLongClickListener j1;
    public final View.OnLongClickListener k1;
    public final View.OnClickListener l1;
    public final View.OnClickListener m1;
    public final View.OnLongClickListener n1;
    public final View.OnClickListener o1;
    public final View.OnLongClickListener p1;
    public final View.OnClickListener q1;
    public long r1;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        t1 = sparseIntArray;
        sparseIntArray.put(z8e.layoutMessageWithImage, 23);
        sparseIntArray.put(z8e.image_line, 24);
    }

    public hx8(yt4 yt4Var, View view) {
        this(yt4Var, view, ewi.m25671L(yt4Var, view, 25, s1, t1));
    }

    @Override // p001o.ewi
    /* renamed from: E */
    public boolean mo16290E() {
        synchronized (this) {
            return this.r1 != 0;
        }
    }

    @Override // p001o.ewi
    /* renamed from: G */
    public void mo16291G() {
        synchronized (this) {
            this.r1 = 16L;
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
        switch (i) {
            case 2:
                ck6 ck6Var = this.K0;
                ChatMessages chatMessages = this.I0;
                Integer num = this.J0;
                if (ck6Var != null) {
                    return ck6Var.mo707a(view, num.intValue(), chatMessages);
                }
                return false;
            case 3:
            case 5:
            case 7:
            case 9:
            case 11:
            case 12:
            case 14:
            case 16:
            case 18:
            case 20:
            case 22:
            case 24:
            default:
                return false;
            case 4:
                ck6 ck6Var2 = this.K0;
                ChatMessages chatMessages2 = this.I0;
                Integer num2 = this.J0;
                if (ck6Var2 != null) {
                    return ck6Var2.mo707a(view, num2.intValue(), chatMessages2);
                }
                return false;
            case 6:
                ck6 ck6Var3 = this.K0;
                ChatMessages chatMessages3 = this.I0;
                Integer num3 = this.J0;
                if (ck6Var3 != null) {
                    return ck6Var3.mo707a(view, num3.intValue(), chatMessages3);
                }
                return false;
            case 8:
                ck6 ck6Var4 = this.K0;
                ChatMessages chatMessages4 = this.I0;
                Integer num4 = this.J0;
                if (ck6Var4 != null) {
                    return ck6Var4.mo707a(view, num4.intValue(), chatMessages4);
                }
                return false;
            case 10:
                ck6 ck6Var5 = this.K0;
                ChatMessages chatMessages5 = this.I0;
                Integer num5 = this.J0;
                if (ck6Var5 != null) {
                    return ck6Var5.mo707a(view, num5.intValue(), chatMessages5);
                }
                return false;
            case 13:
                ck6 ck6Var6 = this.K0;
                ChatMessages chatMessages6 = this.I0;
                Integer num6 = this.J0;
                if (ck6Var6 != null) {
                    return ck6Var6.mo707a(view, num6.intValue(), chatMessages6);
                }
                return false;
            case 15:
                ck6 ck6Var7 = this.K0;
                ChatMessages chatMessages7 = this.I0;
                Integer num7 = this.J0;
                if (ck6Var7 != null) {
                    return ck6Var7.mo707a(view, num7.intValue(), chatMessages7);
                }
                return false;
            case 17:
                ck6 ck6Var8 = this.K0;
                ChatMessages chatMessages8 = this.I0;
                Integer num8 = this.J0;
                if (ck6Var8 != null) {
                    return ck6Var8.mo707a(view, num8.intValue(), chatMessages8);
                }
                return false;
            case 19:
                ck6 ck6Var9 = this.K0;
                ChatMessages chatMessages9 = this.I0;
                Integer num9 = this.J0;
                if (ck6Var9 != null) {
                    return ck6Var9.mo707a(view, num9.intValue(), chatMessages9);
                }
                return false;
            case 21:
                ck6 ck6Var10 = this.K0;
                ChatMessages chatMessages10 = this.I0;
                Integer num10 = this.J0;
                if (ck6Var10 != null) {
                    return ck6Var10.mo707a(view, num10.intValue(), chatMessages10);
                }
                return false;
            case 23:
                ck6 ck6Var11 = this.K0;
                ChatMessages chatMessages11 = this.I0;
                Integer num11 = this.J0;
                if (ck6Var11 != null) {
                    return ck6Var11.mo707a(view, num11.intValue(), chatMessages11);
                }
                return false;
            case 25:
                ck6 ck6Var12 = this.K0;
                ChatMessages chatMessages12 = this.I0;
                Integer num12 = this.J0;
                if (ck6Var12 != null) {
                    return ck6Var12.mo707a(view, num12.intValue(), chatMessages12);
                }
                return false;
            case 26:
                ck6 ck6Var13 = this.K0;
                ChatMessages chatMessages13 = this.I0;
                Integer num13 = this.J0;
                if (ck6Var13 != null) {
                    return ck6Var13.mo707a(view, num13.intValue(), chatMessages13);
                }
                return false;
        }
    }

    @Override // p001o.ewi
    public boolean b0(int i, Object obj) {
        if (7 == i) {
            h0((rog) obj);
        } else if (73 == i) {
            k0((Integer) obj);
        } else if (33 == i) {
            i0((ck6) obj);
        } else {
            if (67 != i) {
                return false;
            }
            j0((ChatMessages) obj);
        }
        return true;
    }

    @Override // p001o.jbc.InterfaceC14485a
    /* renamed from: c */
    public final void mo16294c(int i, View view) {
        switch (i) {
            case 1:
                ck6 ck6Var = this.K0;
                ChatMessages chatMessages = this.I0;
                Integer num = this.J0;
                if (ck6Var != null) {
                    ck6Var.mo708b(view, num.intValue(), chatMessages);
                    break;
                }
                break;
            case 3:
                ck6 ck6Var2 = this.K0;
                ChatMessages chatMessages2 = this.I0;
                Integer num2 = this.J0;
                if (ck6Var2 != null) {
                    ck6Var2.mo708b(view, num2.intValue(), chatMessages2);
                    break;
                }
                break;
            case 5:
                ck6 ck6Var3 = this.K0;
                ChatMessages chatMessages3 = this.I0;
                Integer num3 = this.J0;
                if (ck6Var3 != null) {
                    ck6Var3.mo708b(view, num3.intValue(), chatMessages3);
                    break;
                }
                break;
            case 7:
                ck6 ck6Var4 = this.K0;
                ChatMessages chatMessages4 = this.I0;
                Integer num4 = this.J0;
                if (ck6Var4 != null) {
                    ck6Var4.mo708b(view, num4.intValue(), chatMessages4);
                    break;
                }
                break;
            case 9:
                ck6 ck6Var5 = this.K0;
                ChatMessages chatMessages5 = this.I0;
                Integer num5 = this.J0;
                if (ck6Var5 != null) {
                    ck6Var5.mo708b(view, num5.intValue(), chatMessages5);
                    break;
                }
                break;
            case 11:
                ck6 ck6Var6 = this.K0;
                ChatMessages chatMessages6 = this.I0;
                Integer num6 = this.J0;
                if (ck6Var6 != null) {
                    ck6Var6.mo708b(view, num6.intValue(), chatMessages6);
                    break;
                }
                break;
            case 12:
                ck6 ck6Var7 = this.K0;
                ChatMessages chatMessages7 = this.I0;
                Integer num7 = this.J0;
                if (ck6Var7 != null) {
                    ck6Var7.mo708b(view, num7.intValue(), chatMessages7);
                    break;
                }
                break;
            case 14:
                ck6 ck6Var8 = this.K0;
                ChatMessages chatMessages8 = this.I0;
                Integer num8 = this.J0;
                if (ck6Var8 != null) {
                    ck6Var8.mo708b(view, num8.intValue(), chatMessages8);
                    break;
                }
                break;
            case 16:
                ck6 ck6Var9 = this.K0;
                ChatMessages chatMessages9 = this.I0;
                Integer num9 = this.J0;
                if (ck6Var9 != null) {
                    ck6Var9.mo708b(view, num9.intValue(), chatMessages9);
                    break;
                }
                break;
            case 18:
                ck6 ck6Var10 = this.K0;
                ChatMessages chatMessages10 = this.I0;
                Integer num10 = this.J0;
                if (ck6Var10 != null) {
                    ck6Var10.mo708b(view, num10.intValue(), chatMessages10);
                    break;
                }
                break;
            case 20:
                ck6 ck6Var11 = this.K0;
                ChatMessages chatMessages11 = this.I0;
                Integer num11 = this.J0;
                if (ck6Var11 != null) {
                    ck6Var11.mo708b(view, num11.intValue(), chatMessages11);
                    break;
                }
                break;
            case 22:
                ck6 ck6Var12 = this.K0;
                ChatMessages chatMessages12 = this.I0;
                Integer num12 = this.J0;
                if (ck6Var12 != null) {
                    ck6Var12.mo708b(view, num12.intValue(), chatMessages12);
                    break;
                }
                break;
            case 24:
                ck6 ck6Var13 = this.K0;
                ChatMessages chatMessages13 = this.I0;
                Integer num13 = this.J0;
                if (ck6Var13 != null) {
                    ck6Var13.mo708b(view, num13.intValue(), chatMessages13);
                    break;
                }
                break;
            case 27:
                ck6 ck6Var14 = this.K0;
                ChatMessages chatMessages14 = this.I0;
                Integer num14 = this.J0;
                if (ck6Var14 != null) {
                    ck6Var14.mo708b(view, num14.intValue(), chatMessages14);
                    break;
                }
                break;
        }
    }

    public void h0(rog rogVar) {
        this.L0 = rogVar;
    }

    public void i0(ck6 ck6Var) {
        this.K0 = ck6Var;
        synchronized (this) {
            this.r1 |= 4;
        }
        m28509h(33);
        super.m25692R();
    }

    public void j0(ChatMessages chatMessages) {
        this.I0 = chatMessages;
        synchronized (this) {
            this.r1 |= 8;
        }
        m28509h(67);
        super.m25692R();
    }

    public void k0(Integer num) {
        this.J0 = num;
        synchronized (this) {
            this.r1 |= 2;
        }
        m28509h(73);
        super.m25692R();
    }

    @Override // p001o.ewi
    /* renamed from: p */
    public void mo16295p() {
        long j;
        long messageTime;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        boolean zIsEmpty;
        boolean zIsUploaded;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        String messageText;
        FileData messageFile;
        ChatMessages replyingToMessage;
        boolean showDateText;
        boolean zIsSelected;
        String fileName;
        String mimeType;
        String messageUserName;
        synchronized (this) {
            j = this.r1;
            this.r1 = 0L;
        }
        ChatMessages chatMessages = this.I0;
        long j2 = j & 24;
        FileData fileData = null;
        String messageText2 = null;
        if (j2 != 0) {
            if (chatMessages != null) {
                messageText = chatMessages.getMessageText();
                showDateText = chatMessages.getShowDateText();
                zIsSelected = chatMessages.isSelected();
                messageTime = chatMessages.getMessageTime();
                messageFile = chatMessages.getMessageFile();
                replyingToMessage = chatMessages.getReplyingToMessage();
            } else {
                messageTime = 0;
                messageText = null;
                messageFile = null;
                replyingToMessage = null;
                showDateText = false;
                zIsSelected = false;
            }
            if (j2 != 0) {
                j |= showDateText ? MediaStatus.COMMAND_STREAM_TRANSFER : MediaStatus.COMMAND_UNFOLLOW;
            }
            if ((j & 24) != 0) {
                j |= zIsSelected ? 64L : 32L;
            }
            zIsEmpty = messageText != null ? messageText.isEmpty() : false;
            if ((j & 24) != 0) {
                j = zIsEmpty ? j | MediaStatus.COMMAND_EDIT_TRACKS : j | MediaStatus.COMMAND_QUEUE_REPEAT_ONE;
            }
            int i6 = showDateText ? 0 : 8;
            int i7 = zIsSelected ? 0 : 8;
            boolean z = replyingToMessage == null;
            if ((j & 24) != 0) {
                j |= z ? MediaStatus.COMMAND_QUEUE_REPEAT_ALL : 512L;
            }
            if (messageFile != null) {
                fileName = messageFile.getFileName();
                zIsUploaded = messageFile.isUploaded();
                mimeType = messageFile.getMimeType();
            } else {
                fileName = null;
                mimeType = null;
                zIsUploaded = false;
            }
            if ((j & 24) != 0) {
                j = zIsUploaded ? j | MediaStatus.COMMAND_FOLLOW : j | MediaStatus.COMMAND_DISLIKE;
            }
            if (replyingToMessage != null) {
                messageText2 = replyingToMessage.getMessageText();
                messageUserName = replyingToMessage.getMessageUserName();
            } else {
                messageUserName = null;
            }
            str3 = messageText2;
            str = messageText;
            i = i6;
            i2 = i7;
            fileData = messageFile;
            str4 = messageUserName;
            i3 = z ? 8 : 0;
            str2 = fileName;
            str5 = mimeType;
        } else {
            messageTime = 0;
            str = null;
            str2 = null;
            str3 = null;
            str4 = null;
            str5 = null;
            zIsEmpty = false;
            zIsUploaded = false;
            i = 0;
            i2 = 0;
            i3 = 0;
        }
        boolean viewOnly = ((MediaStatus.COMMAND_DISLIKE & j) == 0 || fileData == null) ? false : fileData.getViewOnly();
        boolean z2 = (MediaStatus.COMMAND_QUEUE_REPEAT_ONE & j) != 0 && str == null;
        long j3 = j & 24;
        if (j3 != 0) {
            if (zIsEmpty) {
                z2 = true;
            }
            boolean z3 = zIsUploaded ? true : viewOnly;
            if (j3 != 0) {
                j |= z2 ? 256L : 128L;
            }
            if ((j & 24) != 0) {
                j |= z3 ? MediaStatus.COMMAND_LIKE : MediaStatus.COMMAND_PLAYBACK_RATE;
            }
            i5 = z2 ? 8 : 0;
            i4 = z3 ? 8 : 0;
        } else {
            i4 = 0;
            i5 = 0;
        }
        if ((24 & j) != 0) {
            this.n0.setVisibility(i);
            this.o0.setVisibility(i2);
            nr1.O1(this.r0, fileData);
            nr1.n2(this.s0, fileData);
            fjh.m26938c(this.t0, str2);
            nr1.x2(this.u0, chatMessages);
            nr1.m2(this.w0, str5);
            nr1.T2(this.y0, chatMessages);
            this.N0.setVisibility(i4);
            nr1.h0(this.O0, Long.valueOf(messageTime));
            nr1.n2(this.P0, fileData);
            nr1.A2(this.A0, chatMessages);
            nr1.c1(this.B0, chatMessages);
            this.C0.setVisibility(i3);
            fjh.m26938c(this.D0, str);
            this.D0.setVisibility(i5);
            String str6 = str3;
            fjh.m26938c(this.E0, str6);
            fjh.m26938c(this.F0, str6);
            String str7 = str4;
            fjh.m26938c(this.G0, str7);
            fjh.m26938c(this.H0, str7);
        }
        if ((j & 16) != 0) {
            this.o0.setOnClickListener(this.o1);
            this.q0.setOnClickListener(this.W0);
            this.q0.setOnLongClickListener(this.f1);
            this.r0.setOnClickListener(this.d1);
            this.r0.setOnLongClickListener(this.k1);
            this.s0.setOnClickListener(this.e1);
            this.s0.setOnLongClickListener(this.p1);
            this.t0.setOnClickListener(this.S0);
            this.t0.setOnLongClickListener(this.Z0);
            this.u0.setOnClickListener(this.l1);
            this.v0.setOnClickListener(this.U0);
            this.v0.setOnLongClickListener(this.c1);
            this.w0.setOnClickListener(this.i1);
            this.w0.setOnLongClickListener(this.n1);
            this.x0.setOnClickListener(this.a1);
            this.x0.setOnLongClickListener(this.g1);
            this.y0.setOnClickListener(this.Q0);
            this.y0.setOnLongClickListener(this.Y0);
            this.C0.setOnClickListener(this.m1);
            this.C0.setOnLongClickListener(this.V0);
            this.D0.setOnClickListener(this.R0);
            this.D0.setOnLongClickListener(this.X0);
            this.E0.setOnClickListener(this.q1);
            this.E0.setOnLongClickListener(this.T0);
            this.G0.setOnClickListener(this.b1);
            this.G0.setOnLongClickListener(this.j1);
            this.H0.setOnLongClickListener(this.h1);
        }
    }

    public hx8(yt4 yt4Var, View view, Object[] objArr) {
        super(yt4Var, view, 0, (FrameLayout) objArr[1], (RelativeLayout) objArr[20], (View) objArr[24], (CardView) objArr[3], (ShapeableImageView) objArr[16], (LinearLayout) objArr[11], (MaterialTextView) objArr[14], (ShapeableImageView) objArr[9], (MaterialCardView) objArr[12], (MaterialTextView) objArr[13], (MaterialCardView) objArr[7], (ShapeableImageView) objArr[10], (LinearLayout) objArr[23], (TextView) objArr[21], (ShapeableImageView) objArr[22], (ConstraintLayout) objArr[4], (MaterialTextView) objArr[17], (MaterialTextView) objArr[6], (MaterialTextView) objArr[18], (MaterialTextView) objArr[5], (MaterialTextView) objArr[19]);
        this.r1 = -1L;
        this.n0.setTag(null);
        this.o0.setTag(null);
        this.q0.setTag(null);
        this.r0.setTag(null);
        this.s0.setTag(null);
        this.t0.setTag(null);
        this.u0.setTag(null);
        this.v0.setTag(null);
        this.w0.setTag(null);
        this.x0.setTag(null);
        this.y0.setTag(null);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.M0 = constraintLayout;
        constraintLayout.setTag(null);
        ProgressBar progressBar = (ProgressBar) objArr[15];
        this.N0 = progressBar;
        progressBar.setTag(null);
        TextView textView = (TextView) objArr[2];
        this.O0 = textView;
        textView.setTag(null);
        LinearLayout linearLayout = (LinearLayout) objArr[8];
        this.P0 = linearLayout;
        linearLayout.setTag(null);
        this.A0.setTag(null);
        this.B0.setTag(null);
        this.C0.setTag(null);
        this.D0.setTag(null);
        this.E0.setTag(null);
        this.F0.setTag(null);
        this.G0.setTag(null);
        this.H0.setTag(null);
        a0(view);
        this.Q0 = new jbc(this, 12);
        this.R0 = new jbc(this, 24);
        this.S0 = new jbc(this, 20);
        this.T0 = new sbc(this, 8);
        this.U0 = new jbc(this, 16);
        this.V0 = new sbc(this, 4);
        this.W0 = new jbc(this, 1);
        this.X0 = new sbc(this, 25);
        this.Y0 = new sbc(this, 13);
        this.Z0 = new sbc(this, 21);
        this.a1 = new jbc(this, 9);
        this.b1 = new jbc(this, 5);
        this.c1 = new sbc(this, 17);
        this.d1 = new jbc(this, 22);
        this.e1 = new jbc(this, 14);
        this.f1 = new sbc(this, 2);
        this.g1 = new sbc(this, 10);
        this.h1 = new sbc(this, 26);
        this.i1 = new jbc(this, 18);
        this.j1 = new sbc(this, 6);
        this.k1 = new sbc(this, 23);
        this.l1 = new jbc(this, 11);
        this.m1 = new jbc(this, 3);
        this.n1 = new sbc(this, 19);
        this.o1 = new jbc(this, 27);
        this.p1 = new sbc(this, 15);
        this.q1 = new jbc(this, 7);
        mo16291G();
    }
}
