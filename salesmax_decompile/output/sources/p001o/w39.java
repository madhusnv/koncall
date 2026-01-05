package p001o;

import ai.salesmax.model.ChatMessages;
import ai.salesmax.model.FileData;
import ai.salesmax.model.Leads;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.gms.cast.MediaStatus;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.imageview.ShapeableImageView;
import com.google.android.material.textview.MaterialTextView;
import com.google.api.Service;
import p001o.ewi;
import p001o.jbc;
import p001o.sbc;

/* loaded from: classes.dex */
public class w39 extends v39 implements jbc.InterfaceC14485a, sbc.InterfaceC16795a {
    public static final ewi.C13274i J1 = null;
    public static final SparseIntArray K1;
    public final View.OnLongClickListener A1;
    public final View.OnClickListener B1;
    public final View.OnClickListener C1;
    public final View.OnClickListener D1;
    public final View.OnClickListener E1;
    public final View.OnLongClickListener F1;
    public final View.OnLongClickListener G1;
    public final View.OnClickListener H1;
    public long I1;
    public final ConstraintLayout V0;
    public final LinearLayout W0;
    public final ProgressBar X0;
    public final LinearLayout Y0;
    public final TextView Z0;
    public final View a1;
    public final View.OnClickListener b1;
    public final View.OnLongClickListener c1;
    public final View.OnLongClickListener d1;
    public final View.OnLongClickListener e1;
    public final View.OnClickListener f1;
    public final View.OnClickListener g1;
    public final View.OnLongClickListener h1;
    public final View.OnLongClickListener i1;
    public final View.OnLongClickListener j1;
    public final View.OnLongClickListener k1;
    public final View.OnClickListener l1;
    public final View.OnClickListener m1;
    public final View.OnClickListener n1;
    public final View.OnClickListener o1;
    public final View.OnClickListener p1;
    public final View.OnClickListener q1;
    public final View.OnLongClickListener r1;
    public final View.OnLongClickListener s1;
    public final View.OnClickListener t1;
    public final View.OnClickListener u1;
    public final View.OnLongClickListener v1;
    public final View.OnLongClickListener w1;
    public final View.OnClickListener x1;
    public final View.OnClickListener y1;
    public final View.OnLongClickListener z1;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        K1 = sparseIntArray;
        sparseIntArray.put(z8e.layoutMessageWithImage, 31);
        sparseIntArray.put(z8e.image_line, 32);
        sparseIntArray.put(z8e.seekBar, 33);
        sparseIntArray.put(z8e.tvDuration, 34);
        sparseIntArray.put(z8e.msgDeliveryStatus, 35);
    }

    public w39(yt4 yt4Var, View view) {
        this(yt4Var, view, ewi.m25671L(yt4Var, view, 36, J1, K1));
    }

    @Override // p001o.ewi
    /* renamed from: E */
    public boolean mo16290E() {
        synchronized (this) {
            return this.I1 != 0;
        }
    }

    @Override // p001o.ewi
    /* renamed from: G */
    public void mo16291G() {
        synchronized (this) {
            this.I1 = 16L;
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
                ck6 ck6Var = this.T0;
                ChatMessages chatMessages = this.R0;
                Integer num = this.S0;
                if (ck6Var != null) {
                    return ck6Var.mo707a(view, num.intValue(), chatMessages);
                }
                return false;
            case 4:
                ck6 ck6Var2 = this.T0;
                ChatMessages chatMessages2 = this.R0;
                Integer num2 = this.S0;
                if (ck6Var2 != null) {
                    return ck6Var2.mo707a(view, num2.intValue(), chatMessages2);
                }
                return false;
            case 6:
                ck6 ck6Var3 = this.T0;
                ChatMessages chatMessages3 = this.R0;
                Integer num3 = this.S0;
                if (ck6Var3 != null) {
                    return ck6Var3.mo707a(view, num3.intValue(), chatMessages3);
                }
                return false;
            case 8:
                ck6 ck6Var4 = this.T0;
                ChatMessages chatMessages4 = this.R0;
                Integer num4 = this.S0;
                if (ck6Var4 != null) {
                    return ck6Var4.mo707a(view, num4.intValue(), chatMessages4);
                }
                return false;
            case 10:
                ck6 ck6Var5 = this.T0;
                ChatMessages chatMessages5 = this.R0;
                Integer num5 = this.S0;
                if (ck6Var5 != null) {
                    return ck6Var5.mo707a(view, num5.intValue(), chatMessages5);
                }
                return false;
            case 12:
                ck6 ck6Var6 = this.T0;
                ChatMessages chatMessages6 = this.R0;
                Integer num6 = this.S0;
                if (ck6Var6 != null) {
                    return ck6Var6.mo707a(view, num6.intValue(), chatMessages6);
                }
                return false;
            case 15:
                ck6 ck6Var7 = this.T0;
                ChatMessages chatMessages7 = this.R0;
                Integer num7 = this.S0;
                if (ck6Var7 != null) {
                    return ck6Var7.mo707a(view, num7.intValue(), chatMessages7);
                }
                return false;
            case 17:
                ck6 ck6Var8 = this.T0;
                ChatMessages chatMessages8 = this.R0;
                Integer num8 = this.S0;
                if (ck6Var8 != null) {
                    return ck6Var8.mo707a(view, num8.intValue(), chatMessages8);
                }
                return false;
            case 19:
                ck6 ck6Var9 = this.T0;
                ChatMessages chatMessages9 = this.R0;
                Integer num9 = this.S0;
                if (ck6Var9 != null) {
                    return ck6Var9.mo707a(view, num9.intValue(), chatMessages9);
                }
                return false;
            case 21:
                ck6 ck6Var10 = this.T0;
                ChatMessages chatMessages10 = this.R0;
                Integer num10 = this.S0;
                if (ck6Var10 != null) {
                    return ck6Var10.mo707a(view, num10.intValue(), chatMessages10);
                }
                return false;
            case 23:
                ck6 ck6Var11 = this.T0;
                ChatMessages chatMessages11 = this.R0;
                Integer num11 = this.S0;
                if (ck6Var11 != null) {
                    return ck6Var11.mo707a(view, num11.intValue(), chatMessages11);
                }
                return false;
            case 26:
                ck6 ck6Var12 = this.T0;
                ChatMessages chatMessages12 = this.R0;
                Integer num12 = this.S0;
                if (ck6Var12 != null) {
                    return ck6Var12.mo707a(view, num12.intValue(), chatMessages12);
                }
                return false;
            case Service.MONITORING_FIELD_NUMBER /* 28 */:
                ck6 ck6Var13 = this.T0;
                ChatMessages chatMessages13 = this.R0;
                Integer num13 = this.S0;
                if (ck6Var13 != null) {
                    return ck6Var13.mo707a(view, num13.intValue(), chatMessages13);
                }
                return false;
            case 30:
                ck6 ck6Var14 = this.T0;
                ChatMessages chatMessages14 = this.R0;
                Integer num14 = this.S0;
                if (ck6Var14 != null) {
                    return ck6Var14.mo707a(view, num14.intValue(), chatMessages14);
                }
                return false;
            case um5.CC_ENABLE_ARENAS_FIELD_NUMBER /* 31 */:
                ck6 ck6Var15 = this.T0;
                ChatMessages chatMessages15 = this.R0;
                Integer num15 = this.S0;
                if (ck6Var15 != null) {
                    return ck6Var15.mo707a(view, num15.intValue(), chatMessages15);
                }
                return false;
            default:
                return false;
        }
    }

    @Override // p001o.ewi
    public boolean b0(int i, Object obj) {
        if (33 == i) {
            i0((ck6) obj);
        } else if (7 == i) {
            h0((rog) obj);
        } else if (73 == i) {
            k0((Integer) obj);
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
                ck6 ck6Var = this.T0;
                ChatMessages chatMessages = this.R0;
                Integer num = this.S0;
                if (ck6Var != null) {
                    ck6Var.mo708b(view, num.intValue(), chatMessages);
                    break;
                }
                break;
            case 3:
                ck6 ck6Var2 = this.T0;
                ChatMessages chatMessages2 = this.R0;
                Integer num2 = this.S0;
                if (ck6Var2 != null) {
                    ck6Var2.mo708b(view, num2.intValue(), chatMessages2);
                    break;
                }
                break;
            case 5:
                ck6 ck6Var3 = this.T0;
                ChatMessages chatMessages3 = this.R0;
                Integer num3 = this.S0;
                if (ck6Var3 != null) {
                    ck6Var3.mo708b(view, num3.intValue(), chatMessages3);
                    break;
                }
                break;
            case 7:
                ck6 ck6Var4 = this.T0;
                ChatMessages chatMessages4 = this.R0;
                Integer num4 = this.S0;
                if (ck6Var4 != null) {
                    ck6Var4.mo708b(view, num4.intValue(), chatMessages4);
                    break;
                }
                break;
            case 9:
                ck6 ck6Var5 = this.T0;
                ChatMessages chatMessages5 = this.R0;
                Integer num5 = this.S0;
                if (ck6Var5 != null) {
                    ck6Var5.mo708b(view, num5.intValue(), chatMessages5);
                    break;
                }
                break;
            case 11:
                ck6 ck6Var6 = this.T0;
                ChatMessages chatMessages6 = this.R0;
                Integer num6 = this.S0;
                if (ck6Var6 != null) {
                    ck6Var6.mo708b(view, num6.intValue(), chatMessages6);
                    break;
                }
                break;
            case 13:
                ck6 ck6Var7 = this.T0;
                ChatMessages chatMessages7 = this.R0;
                Integer num7 = this.S0;
                if (ck6Var7 != null) {
                    ck6Var7.mo708b(view, num7.intValue(), chatMessages7);
                    break;
                }
                break;
            case 14:
                ck6 ck6Var8 = this.T0;
                ChatMessages chatMessages8 = this.R0;
                Integer num8 = this.S0;
                if (ck6Var8 != null) {
                    ck6Var8.mo708b(view, num8.intValue(), chatMessages8);
                    break;
                }
                break;
            case 16:
                ck6 ck6Var9 = this.T0;
                ChatMessages chatMessages9 = this.R0;
                Integer num9 = this.S0;
                if (ck6Var9 != null) {
                    ck6Var9.mo708b(view, num9.intValue(), chatMessages9);
                    break;
                }
                break;
            case 18:
                ck6 ck6Var10 = this.T0;
                ChatMessages chatMessages10 = this.R0;
                Integer num10 = this.S0;
                if (ck6Var10 != null) {
                    ck6Var10.mo708b(view, num10.intValue(), chatMessages10);
                    break;
                }
                break;
            case 20:
                ck6 ck6Var11 = this.T0;
                ChatMessages chatMessages11 = this.R0;
                Integer num11 = this.S0;
                if (ck6Var11 != null) {
                    ck6Var11.mo708b(view, num11.intValue(), chatMessages11);
                    break;
                }
                break;
            case 22:
                ck6 ck6Var12 = this.T0;
                ChatMessages chatMessages12 = this.R0;
                Integer num12 = this.S0;
                if (ck6Var12 != null) {
                    ck6Var12.mo708b(view, num12.intValue(), chatMessages12);
                    break;
                }
                break;
            case 24:
                ck6 ck6Var13 = this.T0;
                ChatMessages chatMessages13 = this.R0;
                Integer num13 = this.S0;
                if (ck6Var13 != null) {
                    ck6Var13.mo708b(view, num13.intValue(), chatMessages13);
                    break;
                }
                break;
            case 25:
                ck6 ck6Var14 = this.T0;
                ChatMessages chatMessages14 = this.R0;
                Integer num14 = this.S0;
                if (ck6Var14 != null) {
                    ck6Var14.mo708b(view, num14.intValue(), chatMessages14);
                    break;
                }
                break;
            case 27:
                ck6 ck6Var15 = this.T0;
                ChatMessages chatMessages15 = this.R0;
                Integer num15 = this.S0;
                if (ck6Var15 != null) {
                    ck6Var15.mo708b(view, num15.intValue(), chatMessages15);
                    break;
                }
                break;
            case Service.SYSTEM_PARAMETERS_FIELD_NUMBER /* 29 */:
                ck6 ck6Var16 = this.T0;
                ChatMessages chatMessages16 = this.R0;
                Integer num16 = this.S0;
                if (ck6Var16 != null) {
                    ck6Var16.mo708b(view, num16.intValue(), chatMessages16);
                    break;
                }
                break;
            case 32:
                ck6 ck6Var17 = this.T0;
                ChatMessages chatMessages17 = this.R0;
                Integer num17 = this.S0;
                if (ck6Var17 != null) {
                    ck6Var17.mo708b(view, num17.intValue(), chatMessages17);
                    break;
                }
                break;
            case 33:
                ck6 ck6Var18 = this.T0;
                ChatMessages chatMessages18 = this.R0;
                Integer num18 = this.S0;
                if (ck6Var18 != null) {
                    ck6Var18.mo708b(view, num18.intValue(), chatMessages18);
                    break;
                }
                break;
        }
    }

    public void h0(rog rogVar) {
        this.U0 = rogVar;
    }

    public void i0(ck6 ck6Var) {
        this.T0 = ck6Var;
        synchronized (this) {
            this.I1 |= 1;
        }
        m28509h(33);
        super.m25692R();
    }

    public void j0(ChatMessages chatMessages) {
        this.R0 = chatMessages;
        synchronized (this) {
            this.I1 |= 8;
        }
        m28509h(67);
        super.m25692R();
    }

    public void k0(Integer num) {
        this.S0 = num;
        synchronized (this) {
            this.I1 |= 4;
        }
        m28509h(73);
        super.m25692R();
    }

    @Override // p001o.ewi
    /* renamed from: p */
    public void mo16295p() {
        long j;
        long j2;
        String str;
        String str2;
        String str3;
        Leads leads;
        String str4;
        int i;
        boolean zIsUploaded;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        long messageTime;
        Leads referredContact;
        FileData messageFile;
        Boolean boolIsStarred;
        ChatMessages replyingToMessage;
        boolean showDateText;
        boolean zIsSelected;
        String fileName;
        String mimeType;
        String messageUserName;
        synchronized (this) {
            j = this.I1;
            this.I1 = 0L;
        }
        ChatMessages chatMessages = this.R0;
        long j3 = j & 24;
        FileData fileData = null;
        String messageText = null;
        if (j3 != 0) {
            if (chatMessages != null) {
                showDateText = chatMessages.getShowDateText();
                zIsSelected = chatMessages.isSelected();
                referredContact = chatMessages.getReferredContact();
                messageTime = chatMessages.getMessageTime();
                messageFile = chatMessages.getMessageFile();
                boolIsStarred = chatMessages.isStarred();
                replyingToMessage = chatMessages.getReplyingToMessage();
            } else {
                messageTime = 0;
                referredContact = null;
                messageFile = null;
                boolIsStarred = null;
                replyingToMessage = null;
                showDateText = false;
                zIsSelected = false;
            }
            if (j3 != 0) {
                j |= showDateText ? MediaStatus.COMMAND_STREAM_TRANSFER : MediaStatus.COMMAND_UNFOLLOW;
            }
            if ((j & 24) != 0) {
                j |= zIsSelected ? MediaStatus.COMMAND_EDIT_TRACKS : MediaStatus.COMMAND_QUEUE_REPEAT_ONE;
            }
            i = showDateText ? 0 : 8;
            int i7 = zIsSelected ? 0 : 8;
            boolean z = referredContact == null;
            boolean zM25676W = ewi.m25676W(boolIsStarred);
            boolean z2 = replyingToMessage == null;
            if ((j & 24) != 0) {
                j |= z ? MediaStatus.COMMAND_LIKE : MediaStatus.COMMAND_PLAYBACK_RATE;
            }
            if ((j & 24) != 0) {
                j |= zM25676W ? 64L : 32L;
            }
            if ((j & 24) != 0) {
                j |= z2 ? MediaStatus.COMMAND_FOLLOW : MediaStatus.COMMAND_DISLIKE;
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
                j = zIsUploaded ? j | MediaStatus.COMMAND_QUEUE_REPEAT_ALL : j | 512;
            }
            if (replyingToMessage != null) {
                messageText = replyingToMessage.getMessageText();
                messageUserName = replyingToMessage.getMessageUserName();
            } else {
                messageUserName = null;
            }
            str2 = messageText;
            i2 = i7;
            i3 = z ? 8 : 0;
            leads = referredContact;
            fileData = messageFile;
            i4 = zM25676W ? 0 : 8;
            str3 = messageUserName;
            i5 = z2 ? 8 : 0;
            str = fileName;
            str4 = mimeType;
            j2 = messageTime;
        } else {
            j2 = 0;
            str = null;
            str2 = null;
            str3 = null;
            leads = null;
            str4 = null;
            i = 0;
            zIsUploaded = false;
            i2 = 0;
            i3 = 0;
            i4 = 0;
            i5 = 0;
        }
        boolean viewOnly = ((512 & j) == 0 || fileData == null) ? false : fileData.getViewOnly();
        long j4 = j & 24;
        if (j4 != 0) {
            boolean z3 = zIsUploaded ? true : viewOnly;
            if (j4 != 0) {
                j |= z3 ? 256L : 128L;
            }
            i6 = z3 ? 8 : 0;
        } else {
            i6 = 0;
        }
        if ((j & 16) != 0) {
            this.n0.setOnClickListener(this.B1);
            this.o0.setOnClickListener(this.l1);
            this.r0.setOnClickListener(this.H1);
            this.t0.setOnClickListener(this.n1);
            this.t0.setOnLongClickListener(this.d1);
            this.u0.setOnClickListener(this.f1);
            this.u0.setOnLongClickListener(this.z1);
            this.v0.setOnClickListener(this.g1);
            this.v0.setOnLongClickListener(this.A1);
            this.w0.setOnClickListener(this.y1);
            this.w0.setOnLongClickListener(this.F1);
            this.x0.setOnClickListener(this.t1);
            this.x0.setOnLongClickListener(this.w1);
            this.y0.setOnClickListener(this.o1);
            this.z0.setOnClickListener(this.q1);
            this.z0.setOnLongClickListener(this.v1);
            this.A0.setOnClickListener(this.C1);
            this.A0.setOnLongClickListener(this.G1);
            this.B0.setOnClickListener(this.x1);
            this.B0.setOnLongClickListener(this.k1);
            this.C0.setOnClickListener(this.m1);
            this.C0.setOnLongClickListener(this.c1);
            this.D0.setOnClickListener(this.b1);
            this.D0.setOnLongClickListener(this.h1);
            this.I0.setOnClickListener(this.E1);
            this.I0.setOnLongClickListener(this.r1);
            this.K0.setOnClickListener(this.D1);
            this.K0.setOnLongClickListener(this.e1);
            this.L0.setOnClickListener(this.p1);
            this.L0.setOnLongClickListener(this.s1);
            this.N0.setOnClickListener(this.u1);
            this.N0.setOnLongClickListener(this.j1);
            this.O0.setOnLongClickListener(this.i1);
        }
        if ((j & 24) != 0) {
            nr1.m40962g(this.n0, chatMessages);
            this.p0.setVisibility(i);
            this.q0.setVisibility(i3);
            this.r0.setVisibility(i2);
            nr1.O1(this.u0, fileData);
            nr1.X0(this.v0, leads);
            nr1.n2(this.w0, fileData);
            fjh.m26938c(this.x0, str);
            nr1.x2(this.y0, chatMessages);
            nr1.q2(this.A0, str4);
            nr1.U1(this.C0, chatMessages);
            nr1.T2(this.D0, chatMessages);
            nr1.n2(this.W0, fileData);
            this.X0.setVisibility(i6);
            nr1.I0(this.Y0, chatMessages);
            nr1.h0(this.Z0, Long.valueOf(j2));
            nr1.m40961f(this.a1, fileData);
            nr1.A2(this.F0, chatMessages);
            this.H0.setVisibility(i4);
            this.I0.setVisibility(i5);
            nr1.m40965j(this.K0, chatMessages);
            fjh.m26938c(this.L0, str2);
            fjh.m26938c(this.M0, str2);
            fjh.m26938c(this.N0, str3);
            fjh.m26938c(this.O0, str3);
            nr1.d1(this.P0, leads);
        }
    }

    public w39(yt4 yt4Var, View view, Object[] objArr) {
        super(yt4Var, view, 0, (MaterialButton) objArr[27], (ImageButton) objArr[20], (FrameLayout) objArr[1], (ConstraintLayout) objArr[4], (RelativeLayout) objArr[28], (View) objArr[32], (CardView) objArr[3], (ShapeableImageView) objArr[23], (ShapeableImageView) objArr[5], (LinearLayout) objArr[14], (MaterialTextView) objArr[17], (ShapeableImageView) objArr[12], (MaterialCardView) objArr[15], (ShapeableImageView) objArr[16], (MaterialCardView) objArr[10], (ShapeableImageView) objArr[21], (ShapeableImageView) objArr[13], (LinearLayout) objArr[31], (TextView) objArr[30], (ShapeableImageView) objArr[35], (ShapeableImageView) objArr[29], (ConstraintLayout) objArr[7], (SeekBar) objArr[33], (MaterialTextView) objArr[24], (MaterialTextView) objArr[9], (MaterialTextView) objArr[25], (MaterialTextView) objArr[8], (MaterialTextView) objArr[26], (MaterialTextView) objArr[6], (TextView) objArr[34]);
        this.I1 = -1L;
        this.n0.setTag(null);
        this.o0.setTag(null);
        this.p0.setTag(null);
        this.q0.setTag(null);
        this.r0.setTag(null);
        this.t0.setTag(null);
        this.u0.setTag(null);
        this.v0.setTag(null);
        this.w0.setTag(null);
        this.x0.setTag(null);
        this.y0.setTag(null);
        this.z0.setTag(null);
        this.A0.setTag(null);
        this.B0.setTag(null);
        this.C0.setTag(null);
        this.D0.setTag(null);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.V0 = constraintLayout;
        constraintLayout.setTag(null);
        LinearLayout linearLayout = (LinearLayout) objArr[11];
        this.W0 = linearLayout;
        linearLayout.setTag(null);
        ProgressBar progressBar = (ProgressBar) objArr[18];
        this.X0 = progressBar;
        progressBar.setTag(null);
        LinearLayout linearLayout2 = (LinearLayout) objArr[19];
        this.Y0 = linearLayout2;
        linearLayout2.setTag(null);
        TextView textView = (TextView) objArr[2];
        this.Z0 = textView;
        textView.setTag(null);
        View view2 = (View) objArr[22];
        this.a1 = view2;
        view2.setTag(null);
        this.F0.setTag(null);
        this.H0.setTag(null);
        this.I0.setTag(null);
        this.K0.setTag(null);
        this.L0.setTag(null);
        this.M0.setTag(null);
        this.N0.setTag(null);
        this.O0.setTag(null);
        this.P0.setTag(null);
        a0(view);
        this.b1 = new jbc(this, 14);
        this.c1 = new sbc(this, 26);
        this.d1 = new sbc(this, 2);
        this.e1 = new sbc(this, 30);
        this.f1 = new jbc(this, 27);
        this.g1 = new jbc(this, 3);
        this.h1 = new sbc(this, 15);
        this.i1 = new sbc(this, 31);
        this.j1 = new sbc(this, 8);
        this.k1 = new sbc(this, 12);
        this.l1 = new jbc(this, 24);
        this.m1 = new jbc(this, 25);
        this.n1 = new jbc(this, 1);
        this.o1 = new jbc(this, 13);
        this.p1 = new jbc(this, 9);
        this.q1 = new jbc(this, 18);
        this.r1 = new sbc(this, 6);
        this.s1 = new sbc(this, 10);
        this.t1 = new jbc(this, 22);
        this.u1 = new jbc(this, 7);
        this.v1 = new sbc(this, 19);
        this.w1 = new sbc(this, 23);
        this.x1 = new jbc(this, 11);
        this.y1 = new jbc(this, 16);
        this.z1 = new sbc(this, 28);
        this.A1 = new sbc(this, 4);
        this.B1 = new jbc(this, 32);
        this.C1 = new jbc(this, 20);
        this.D1 = new jbc(this, 29);
        this.E1 = new jbc(this, 5);
        this.F1 = new sbc(this, 17);
        this.G1 = new sbc(this, 21);
        this.H1 = new jbc(this, 33);
        mo16291G();
    }
}
