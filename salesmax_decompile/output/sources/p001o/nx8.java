package p001o;

import ai.salesmax.model.ChatMessages;
import ai.salesmax.model.FileData;
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
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.imageview.ShapeableImageView;
import com.google.android.material.textview.MaterialTextView;
import com.google.api.Service;
import p001o.ewi;
import p001o.jbc;
import p001o.sbc;

/* loaded from: classes.dex */
public class nx8 extends mx8 implements jbc.InterfaceC14485a, sbc.InterfaceC16795a {
    public static final ewi.C13274i C1 = null;
    public static final SparseIntArray D1;
    public final View.OnClickListener A1;
    public long B1;
    public final ConstraintLayout R0;
    public final ProgressBar S0;
    public final LinearLayout T0;
    public final View U0;
    public final TextView V0;
    public final LinearLayout W0;
    public final View.OnClickListener X0;
    public final View.OnClickListener Y0;
    public final View.OnClickListener Z0;
    public final View.OnLongClickListener a1;
    public final View.OnLongClickListener b1;
    public final View.OnClickListener c1;
    public final View.OnClickListener d1;
    public final View.OnLongClickListener e1;
    public final View.OnLongClickListener f1;
    public final View.OnLongClickListener g1;
    public final View.OnClickListener h1;
    public final View.OnLongClickListener i1;
    public final View.OnClickListener j1;
    public final View.OnClickListener k1;
    public final View.OnLongClickListener l1;
    public final View.OnLongClickListener m1;
    public final View.OnLongClickListener n1;
    public final View.OnClickListener o1;
    public final View.OnLongClickListener p1;
    public final View.OnClickListener q1;
    public final View.OnClickListener r1;
    public final View.OnClickListener s1;
    public final View.OnClickListener t1;
    public final View.OnLongClickListener u1;
    public final View.OnClickListener v1;
    public final View.OnLongClickListener w1;
    public final View.OnLongClickListener x1;
    public final View.OnClickListener y1;
    public final View.OnLongClickListener z1;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        D1 = sparseIntArray;
        sparseIntArray.put(z8e.layoutMessageWithImage, 27);
        sparseIntArray.put(z8e.image_line, 28);
        sparseIntArray.put(z8e.seekBar, 29);
        sparseIntArray.put(z8e.tvDuration, 30);
        sparseIntArray.put(z8e.msgDeliveryStatus, 31);
    }

    public nx8(yt4 yt4Var, View view) {
        this(yt4Var, view, ewi.m25671L(yt4Var, view, 32, C1, D1));
    }

    @Override // p001o.ewi
    /* renamed from: E */
    public boolean mo16290E() {
        synchronized (this) {
            return this.B1 != 0;
        }
    }

    @Override // p001o.ewi
    /* renamed from: G */
    public void mo16291G() {
        synchronized (this) {
            this.B1 = 16L;
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
                ck6 ck6Var = this.P0;
                ChatMessages chatMessages = this.N0;
                Integer num = this.O0;
                if (ck6Var != null) {
                    return ck6Var.mo707a(view, num.intValue(), chatMessages);
                }
                return false;
            case 4:
                ck6 ck6Var2 = this.P0;
                ChatMessages chatMessages2 = this.N0;
                Integer num2 = this.O0;
                if (ck6Var2 != null) {
                    return ck6Var2.mo707a(view, num2.intValue(), chatMessages2);
                }
                return false;
            case 6:
                ck6 ck6Var3 = this.P0;
                ChatMessages chatMessages3 = this.N0;
                Integer num3 = this.O0;
                if (ck6Var3 != null) {
                    return ck6Var3.mo707a(view, num3.intValue(), chatMessages3);
                }
                return false;
            case 8:
                ck6 ck6Var4 = this.P0;
                ChatMessages chatMessages4 = this.N0;
                Integer num4 = this.O0;
                if (ck6Var4 != null) {
                    return ck6Var4.mo707a(view, num4.intValue(), chatMessages4);
                }
                return false;
            case 10:
                ck6 ck6Var5 = this.P0;
                ChatMessages chatMessages5 = this.N0;
                Integer num5 = this.O0;
                if (ck6Var5 != null) {
                    return ck6Var5.mo707a(view, num5.intValue(), chatMessages5);
                }
                return false;
            case 13:
                ck6 ck6Var6 = this.P0;
                ChatMessages chatMessages6 = this.N0;
                Integer num6 = this.O0;
                if (ck6Var6 != null) {
                    return ck6Var6.mo707a(view, num6.intValue(), chatMessages6);
                }
                return false;
            case 15:
                ck6 ck6Var7 = this.P0;
                ChatMessages chatMessages7 = this.N0;
                Integer num7 = this.O0;
                if (ck6Var7 != null) {
                    return ck6Var7.mo707a(view, num7.intValue(), chatMessages7);
                }
                return false;
            case 17:
                ck6 ck6Var8 = this.P0;
                ChatMessages chatMessages8 = this.N0;
                Integer num8 = this.O0;
                if (ck6Var8 != null) {
                    return ck6Var8.mo707a(view, num8.intValue(), chatMessages8);
                }
                return false;
            case 19:
                ck6 ck6Var9 = this.P0;
                ChatMessages chatMessages9 = this.N0;
                Integer num9 = this.O0;
                if (ck6Var9 != null) {
                    return ck6Var9.mo707a(view, num9.intValue(), chatMessages9);
                }
                return false;
            case 21:
                ck6 ck6Var10 = this.P0;
                ChatMessages chatMessages10 = this.N0;
                Integer num10 = this.O0;
                if (ck6Var10 != null) {
                    return ck6Var10.mo707a(view, num10.intValue(), chatMessages10);
                }
                return false;
            case 24:
                ck6 ck6Var11 = this.P0;
                ChatMessages chatMessages11 = this.N0;
                Integer num11 = this.O0;
                if (ck6Var11 != null) {
                    return ck6Var11.mo707a(view, num11.intValue(), chatMessages11);
                }
                return false;
            case 26:
                ck6 ck6Var12 = this.P0;
                ChatMessages chatMessages12 = this.N0;
                Integer num12 = this.O0;
                if (ck6Var12 != null) {
                    return ck6Var12.mo707a(view, num12.intValue(), chatMessages12);
                }
                return false;
            case Service.MONITORING_FIELD_NUMBER /* 28 */:
                ck6 ck6Var13 = this.P0;
                ChatMessages chatMessages13 = this.N0;
                Integer num13 = this.O0;
                if (ck6Var13 != null) {
                    return ck6Var13.mo707a(view, num13.intValue(), chatMessages13);
                }
                return false;
            case Service.SYSTEM_PARAMETERS_FIELD_NUMBER /* 29 */:
                ck6 ck6Var14 = this.P0;
                ChatMessages chatMessages14 = this.N0;
                Integer num14 = this.O0;
                if (ck6Var14 != null) {
                    return ck6Var14.mo707a(view, num14.intValue(), chatMessages14);
                }
                return false;
            default:
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
                ck6 ck6Var = this.P0;
                ChatMessages chatMessages = this.N0;
                Integer num = this.O0;
                if (ck6Var != null) {
                    ck6Var.mo708b(view, num.intValue(), chatMessages);
                    break;
                }
                break;
            case 3:
                ck6 ck6Var2 = this.P0;
                ChatMessages chatMessages2 = this.N0;
                Integer num2 = this.O0;
                if (ck6Var2 != null) {
                    ck6Var2.mo708b(view, num2.intValue(), chatMessages2);
                    break;
                }
                break;
            case 5:
                ck6 ck6Var3 = this.P0;
                ChatMessages chatMessages3 = this.N0;
                Integer num3 = this.O0;
                if (ck6Var3 != null) {
                    ck6Var3.mo708b(view, num3.intValue(), chatMessages3);
                    break;
                }
                break;
            case 7:
                ck6 ck6Var4 = this.P0;
                ChatMessages chatMessages4 = this.N0;
                Integer num4 = this.O0;
                if (ck6Var4 != null) {
                    ck6Var4.mo708b(view, num4.intValue(), chatMessages4);
                    break;
                }
                break;
            case 9:
                ck6 ck6Var5 = this.P0;
                ChatMessages chatMessages5 = this.N0;
                Integer num5 = this.O0;
                if (ck6Var5 != null) {
                    ck6Var5.mo708b(view, num5.intValue(), chatMessages5);
                    break;
                }
                break;
            case 11:
                ck6 ck6Var6 = this.P0;
                ChatMessages chatMessages6 = this.N0;
                Integer num6 = this.O0;
                if (ck6Var6 != null) {
                    ck6Var6.mo708b(view, num6.intValue(), chatMessages6);
                    break;
                }
                break;
            case 12:
                ck6 ck6Var7 = this.P0;
                ChatMessages chatMessages7 = this.N0;
                Integer num7 = this.O0;
                if (ck6Var7 != null) {
                    ck6Var7.mo708b(view, num7.intValue(), chatMessages7);
                    break;
                }
                break;
            case 14:
                ck6 ck6Var8 = this.P0;
                ChatMessages chatMessages8 = this.N0;
                Integer num8 = this.O0;
                if (ck6Var8 != null) {
                    ck6Var8.mo708b(view, num8.intValue(), chatMessages8);
                    break;
                }
                break;
            case 16:
                ck6 ck6Var9 = this.P0;
                ChatMessages chatMessages9 = this.N0;
                Integer num9 = this.O0;
                if (ck6Var9 != null) {
                    ck6Var9.mo708b(view, num9.intValue(), chatMessages9);
                    break;
                }
                break;
            case 18:
                ck6 ck6Var10 = this.P0;
                ChatMessages chatMessages10 = this.N0;
                Integer num10 = this.O0;
                if (ck6Var10 != null) {
                    ck6Var10.mo708b(view, num10.intValue(), chatMessages10);
                    break;
                }
                break;
            case 20:
                ck6 ck6Var11 = this.P0;
                ChatMessages chatMessages11 = this.N0;
                Integer num11 = this.O0;
                if (ck6Var11 != null) {
                    ck6Var11.mo708b(view, num11.intValue(), chatMessages11);
                    break;
                }
                break;
            case 22:
                ck6 ck6Var12 = this.P0;
                ChatMessages chatMessages12 = this.N0;
                Integer num12 = this.O0;
                if (ck6Var12 != null) {
                    ck6Var12.mo708b(view, num12.intValue(), chatMessages12);
                    break;
                }
                break;
            case 23:
                ck6 ck6Var13 = this.P0;
                ChatMessages chatMessages13 = this.N0;
                Integer num13 = this.O0;
                if (ck6Var13 != null) {
                    ck6Var13.mo708b(view, num13.intValue(), chatMessages13);
                    break;
                }
                break;
            case 25:
                ck6 ck6Var14 = this.P0;
                ChatMessages chatMessages14 = this.N0;
                Integer num14 = this.O0;
                if (ck6Var14 != null) {
                    ck6Var14.mo708b(view, num14.intValue(), chatMessages14);
                    break;
                }
                break;
            case 27:
                ck6 ck6Var15 = this.P0;
                ChatMessages chatMessages15 = this.N0;
                Integer num15 = this.O0;
                if (ck6Var15 != null) {
                    ck6Var15.mo708b(view, num15.intValue(), chatMessages15);
                    break;
                }
                break;
            case 30:
                ck6 ck6Var16 = this.P0;
                ChatMessages chatMessages16 = this.N0;
                Integer num16 = this.O0;
                if (ck6Var16 != null) {
                    ck6Var16.mo708b(view, num16.intValue(), chatMessages16);
                    break;
                }
                break;
        }
    }

    public void h0(rog rogVar) {
        this.Q0 = rogVar;
    }

    public void i0(ck6 ck6Var) {
        this.P0 = ck6Var;
        synchronized (this) {
            this.B1 |= 4;
        }
        m28509h(33);
        super.m25692R();
    }

    public void j0(ChatMessages chatMessages) {
        this.N0 = chatMessages;
        synchronized (this) {
            this.B1 |= 8;
        }
        m28509h(67);
        super.m25692R();
    }

    public void k0(Integer num) {
        this.O0 = num;
        synchronized (this) {
            this.B1 |= 2;
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
        String str4;
        int i;
        boolean zIsUploaded;
        int i2;
        int i3;
        int i4;
        int i5;
        long messageTime;
        FileData messageFile;
        Boolean boolIsStarred;
        ChatMessages replyingToMessage;
        boolean showDateText;
        boolean zIsSelected;
        String fileName;
        String mimeType;
        String messageUserName;
        synchronized (this) {
            j = this.B1;
            this.B1 = 0L;
        }
        ChatMessages chatMessages = this.N0;
        long j3 = j & 24;
        FileData fileData = null;
        String messageText = null;
        if (j3 != 0) {
            if (chatMessages != null) {
                showDateText = chatMessages.getShowDateText();
                zIsSelected = chatMessages.isSelected();
                messageTime = chatMessages.getMessageTime();
                messageFile = chatMessages.getMessageFile();
                boolIsStarred = chatMessages.isStarred();
                replyingToMessage = chatMessages.getReplyingToMessage();
            } else {
                messageTime = 0;
                messageFile = null;
                boolIsStarred = null;
                replyingToMessage = null;
                showDateText = false;
                zIsSelected = false;
            }
            if (j3 != 0) {
                j |= showDateText ? MediaStatus.COMMAND_FOLLOW : MediaStatus.COMMAND_DISLIKE;
            }
            if ((j & 24) != 0) {
                j |= zIsSelected ? 64L : 32L;
            }
            i = showDateText ? 0 : 8;
            int i6 = zIsSelected ? 0 : 8;
            boolean zM25676W = ewi.m25676W(boolIsStarred);
            boolean z = replyingToMessage == null;
            if ((j & 24) != 0) {
                j |= zM25676W ? MediaStatus.COMMAND_QUEUE_REPEAT_ALL : 512L;
            }
            if ((j & 24) != 0) {
                j |= z ? 256L : 128L;
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
                j = zIsUploaded ? j | MediaStatus.COMMAND_LIKE : j | MediaStatus.COMMAND_PLAYBACK_RATE;
            }
            if (replyingToMessage != null) {
                messageText = replyingToMessage.getMessageText();
                messageUserName = replyingToMessage.getMessageUserName();
            } else {
                messageUserName = null;
            }
            str = messageText;
            i2 = i6;
            i3 = zM25676W ? 0 : 8;
            fileData = messageFile;
            i4 = z ? 8 : 0;
            str2 = messageUserName;
            str4 = fileName;
            str3 = mimeType;
            j2 = messageTime;
        } else {
            j2 = 0;
            str = null;
            str2 = null;
            str3 = null;
            str4 = null;
            i = 0;
            zIsUploaded = false;
            i2 = 0;
            i3 = 0;
            i4 = 0;
        }
        boolean viewOnly = ((MediaStatus.COMMAND_PLAYBACK_RATE & j) == 0 || fileData == null) ? false : fileData.getViewOnly();
        long j4 = j & 24;
        if (j4 != 0) {
            boolean z2 = zIsUploaded ? true : viewOnly;
            if (j4 != 0) {
                j |= z2 ? MediaStatus.COMMAND_EDIT_TRACKS : MediaStatus.COMMAND_QUEUE_REPEAT_ONE;
            }
            i5 = z2 ? 8 : 0;
        } else {
            i5 = 0;
        }
        if ((j & 16) != 0) {
            this.n0.setOnClickListener(this.j1);
            this.p0.setOnClickListener(this.Y0);
            this.r0.setOnClickListener(this.c1);
            this.r0.setOnLongClickListener(this.l1);
            this.s0.setOnClickListener(this.d1);
            this.s0.setOnLongClickListener(this.g1);
            this.t0.setOnClickListener(this.k1);
            this.t0.setOnLongClickListener(this.p1);
            this.u0.setOnClickListener(this.A1);
            this.u0.setOnLongClickListener(this.f1);
            this.v0.setOnClickListener(this.s1);
            this.w0.setOnClickListener(this.v1);
            this.w0.setOnLongClickListener(this.b1);
            this.x0.setOnClickListener(this.h1);
            this.x0.setOnLongClickListener(this.n1);
            this.y0.setOnClickListener(this.X0);
            this.y0.setOnLongClickListener(this.m1);
            this.z0.setOnClickListener(this.r1);
            this.z0.setOnLongClickListener(this.z1);
            this.A0.setOnClickListener(this.y1);
            this.A0.setOnLongClickListener(this.e1);
            this.F0.setOnClickListener(this.t1);
            this.F0.setOnLongClickListener(this.w1);
            this.H0.setOnClickListener(this.o1);
            this.H0.setOnLongClickListener(this.x1);
            this.I0.setOnClickListener(this.q1);
            this.I0.setOnLongClickListener(this.u1);
            this.K0.setOnClickListener(this.Z0);
            this.K0.setOnLongClickListener(this.i1);
            this.L0.setOnLongClickListener(this.a1);
        }
        if ((j & 24) != 0) {
            this.o0.setVisibility(i);
            this.p0.setVisibility(i2);
            nr1.O1(this.s0, fileData);
            nr1.n2(this.t0, fileData);
            fjh.m26938c(this.u0, str4);
            nr1.x2(this.v0, chatMessages);
            nr1.q2(this.x0, str3);
            nr1.U1(this.z0, chatMessages);
            nr1.T2(this.A0, chatMessages);
            this.S0.setVisibility(i5);
            nr1.I0(this.T0, chatMessages);
            nr1.m40961f(this.U0, fileData);
            nr1.h0(this.V0, Long.valueOf(j2));
            nr1.n2(this.W0, fileData);
            nr1.A2(this.C0, chatMessages);
            this.E0.setVisibility(i3);
            this.F0.setVisibility(i4);
            nr1.m40965j(this.H0, chatMessages);
            fjh.m26938c(this.I0, str);
            fjh.m26938c(this.J0, str);
            fjh.m26938c(this.K0, str2);
            fjh.m26938c(this.L0, str2);
        }
    }

    public nx8(yt4 yt4Var, View view, Object[] objArr) {
        super(yt4Var, view, 0, (ImageButton) objArr[17], (FrameLayout) objArr[1], (RelativeLayout) objArr[24], (View) objArr[28], (CardView) objArr[3], (ShapeableImageView) objArr[20], (LinearLayout) objArr[11], (MaterialTextView) objArr[14], (ShapeableImageView) objArr[9], (MaterialCardView) objArr[12], (ShapeableImageView) objArr[13], (MaterialCardView) objArr[7], (ShapeableImageView) objArr[18], (ShapeableImageView) objArr[10], (LinearLayout) objArr[27], (TextView) objArr[26], (ShapeableImageView) objArr[31], (ShapeableImageView) objArr[25], (ConstraintLayout) objArr[4], (SeekBar) objArr[29], (MaterialTextView) objArr[21], (MaterialTextView) objArr[6], (MaterialTextView) objArr[22], (MaterialTextView) objArr[5], (MaterialTextView) objArr[23], (TextView) objArr[30]);
        this.B1 = -1L;
        this.n0.setTag(null);
        this.o0.setTag(null);
        this.p0.setTag(null);
        this.r0.setTag(null);
        this.s0.setTag(null);
        this.t0.setTag(null);
        this.u0.setTag(null);
        this.v0.setTag(null);
        this.w0.setTag(null);
        this.x0.setTag(null);
        this.y0.setTag(null);
        this.z0.setTag(null);
        this.A0.setTag(null);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.R0 = constraintLayout;
        constraintLayout.setTag(null);
        ProgressBar progressBar = (ProgressBar) objArr[15];
        this.S0 = progressBar;
        progressBar.setTag(null);
        LinearLayout linearLayout = (LinearLayout) objArr[16];
        this.T0 = linearLayout;
        linearLayout.setTag(null);
        View view2 = (View) objArr[19];
        this.U0 = view2;
        view2.setTag(null);
        TextView textView = (TextView) objArr[2];
        this.V0 = textView;
        textView.setTag(null);
        LinearLayout linearLayout2 = (LinearLayout) objArr[8];
        this.W0 = linearLayout2;
        linearLayout2.setTag(null);
        this.C0.setTag(null);
        this.E0.setTag(null);
        this.F0.setTag(null);
        this.H0.setTag(null);
        this.I0.setTag(null);
        this.J0.setTag(null);
        this.K0.setTag(null);
        this.L0.setTag(null);
        a0(view);
        this.X0 = new jbc(this, 9);
        this.Y0 = new jbc(this, 30);
        this.Z0 = new jbc(this, 5);
        this.a1 = new sbc(this, 29);
        this.b1 = new sbc(this, 17);
        this.c1 = new jbc(this, 1);
        this.d1 = new jbc(this, 25);
        this.e1 = new sbc(this, 13);
        this.f1 = new sbc(this, 21);
        this.g1 = new sbc(this, 26);
        this.h1 = new jbc(this, 18);
        this.i1 = new sbc(this, 6);
        this.j1 = new jbc(this, 22);
        this.k1 = new jbc(this, 14);
        this.l1 = new sbc(this, 2);
        this.m1 = new sbc(this, 10);
        this.n1 = new sbc(this, 19);
        this.o1 = new jbc(this, 27);
        this.p1 = new sbc(this, 15);
        this.q1 = new jbc(this, 7);
        this.r1 = new jbc(this, 23);
        this.s1 = new jbc(this, 11);
        this.t1 = new jbc(this, 3);
        this.u1 = new sbc(this, 8);
        this.v1 = new jbc(this, 16);
        this.w1 = new sbc(this, 4);
        this.x1 = new sbc(this, 28);
        this.y1 = new jbc(this, 12);
        this.z1 = new sbc(this, 24);
        this.A1 = new jbc(this, 20);
        mo16291G();
    }
}
