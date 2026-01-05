package p001o;

import ai.salesmax.model.ChatMessages;
import ai.salesmax.model.FileData;
import ai.salesmax.model.WaButton;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.Button;
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
import java.util.List;
import p001o.ewi;
import p001o.jbc;
import p001o.sbc;

/* loaded from: classes.dex */
public class lx8 extends kx8 implements sbc.InterfaceC16795a, jbc.InterfaceC14485a {
    public static final ewi.C13274i O1 = null;
    public static final SparseIntArray P1;
    public final View.OnClickListener A1;
    public final View.OnClickListener B1;
    public final View.OnClickListener C1;
    public final View.OnClickListener D1;
    public final View.OnLongClickListener E1;
    public final View.OnClickListener F1;
    public final View.OnLongClickListener G1;
    public final View.OnClickListener H1;
    public final View.OnLongClickListener I1;
    public final View.OnClickListener J1;
    public final View.OnClickListener K1;
    public final View.OnLongClickListener L1;
    public final View.OnLongClickListener M1;
    public long N1;
    public final ConstraintLayout d1;
    public final ProgressBar e1;
    public final LinearLayout f1;
    public final View g1;
    public final TextView h1;
    public final LinearLayout i1;
    public final View.OnLongClickListener j1;
    public final View.OnClickListener k1;
    public final View.OnLongClickListener l1;
    public final View.OnClickListener m1;
    public final View.OnLongClickListener n1;
    public final View.OnClickListener o1;
    public final View.OnLongClickListener p1;
    public final View.OnClickListener q1;
    public final View.OnLongClickListener r1;
    public final View.OnClickListener s1;
    public final View.OnClickListener t1;
    public final View.OnLongClickListener u1;
    public final View.OnLongClickListener v1;
    public final View.OnLongClickListener w1;
    public final View.OnLongClickListener x1;
    public final View.OnClickListener y1;
    public final View.OnClickListener z1;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        P1 = sparseIntArray;
        sparseIntArray.put(z8e.layoutMessageWithImage, 39);
        sparseIntArray.put(z8e.image_line, 40);
        sparseIntArray.put(z8e.seekBar, 41);
        sparseIntArray.put(z8e.tvDuration, 42);
        sparseIntArray.put(z8e.threeButtonsContainerFirstPart, 43);
    }

    public lx8(yt4 yt4Var, View view) {
        this(yt4Var, view, ewi.m25671L(yt4Var, view, 44, O1, P1));
    }

    @Override // p001o.ewi
    /* renamed from: E */
    public boolean mo16290E() {
        synchronized (this) {
            return this.N1 != 0;
        }
    }

    @Override // p001o.ewi
    /* renamed from: G */
    public void mo16291G() {
        synchronized (this) {
            this.N1 = 16L;
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
                ck6 ck6Var = this.b1;
                ChatMessages chatMessages = this.Z0;
                Integer num = this.a1;
                if (ck6Var != null) {
                    return ck6Var.mo707a(view, num.intValue(), chatMessages);
                }
                return false;
            case 4:
                ck6 ck6Var2 = this.b1;
                ChatMessages chatMessages2 = this.Z0;
                Integer num2 = this.a1;
                if (ck6Var2 != null) {
                    return ck6Var2.mo707a(view, num2.intValue(), chatMessages2);
                }
                return false;
            case 6:
                ck6 ck6Var3 = this.b1;
                ChatMessages chatMessages3 = this.Z0;
                Integer num3 = this.a1;
                if (ck6Var3 != null) {
                    return ck6Var3.mo707a(view, num3.intValue(), chatMessages3);
                }
                return false;
            case 8:
                ck6 ck6Var4 = this.b1;
                ChatMessages chatMessages4 = this.Z0;
                Integer num4 = this.a1;
                if (ck6Var4 != null) {
                    return ck6Var4.mo707a(view, num4.intValue(), chatMessages4);
                }
                return false;
            case 10:
                ck6 ck6Var5 = this.b1;
                ChatMessages chatMessages5 = this.Z0;
                Integer num5 = this.a1;
                if (ck6Var5 != null) {
                    return ck6Var5.mo707a(view, num5.intValue(), chatMessages5);
                }
                return false;
            case 13:
                ck6 ck6Var6 = this.b1;
                ChatMessages chatMessages6 = this.Z0;
                Integer num6 = this.a1;
                if (ck6Var6 != null) {
                    return ck6Var6.mo707a(view, num6.intValue(), chatMessages6);
                }
                return false;
            case 15:
                ck6 ck6Var7 = this.b1;
                ChatMessages chatMessages7 = this.Z0;
                Integer num7 = this.a1;
                if (ck6Var7 != null) {
                    return ck6Var7.mo707a(view, num7.intValue(), chatMessages7);
                }
                return false;
            case 17:
                ck6 ck6Var8 = this.b1;
                ChatMessages chatMessages8 = this.Z0;
                Integer num8 = this.a1;
                if (ck6Var8 != null) {
                    return ck6Var8.mo707a(view, num8.intValue(), chatMessages8);
                }
                return false;
            case 19:
                ck6 ck6Var9 = this.b1;
                ChatMessages chatMessages9 = this.Z0;
                Integer num9 = this.a1;
                if (ck6Var9 != null) {
                    return ck6Var9.mo707a(view, num9.intValue(), chatMessages9);
                }
                return false;
            case 21:
                ck6 ck6Var10 = this.b1;
                ChatMessages chatMessages10 = this.Z0;
                Integer num10 = this.a1;
                if (ck6Var10 != null) {
                    return ck6Var10.mo707a(view, num10.intValue(), chatMessages10);
                }
                return false;
            case 24:
                ck6 ck6Var11 = this.b1;
                ChatMessages chatMessages11 = this.Z0;
                Integer num11 = this.a1;
                if (ck6Var11 != null) {
                    return ck6Var11.mo707a(view, num11.intValue(), chatMessages11);
                }
                return false;
            case 26:
                ck6 ck6Var12 = this.b1;
                ChatMessages chatMessages12 = this.Z0;
                Integer num12 = this.a1;
                if (ck6Var12 != null) {
                    return ck6Var12.mo707a(view, num12.intValue(), chatMessages12);
                }
                return false;
            case Service.MONITORING_FIELD_NUMBER /* 28 */:
                ck6 ck6Var13 = this.b1;
                ChatMessages chatMessages13 = this.Z0;
                Integer num13 = this.a1;
                if (ck6Var13 != null) {
                    return ck6Var13.mo707a(view, num13.intValue(), chatMessages13);
                }
                return false;
            case Service.SYSTEM_PARAMETERS_FIELD_NUMBER /* 29 */:
                ck6 ck6Var14 = this.b1;
                ChatMessages chatMessages14 = this.Z0;
                Integer num14 = this.a1;
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
        if (33 == i) {
            j0((ck6) obj);
        } else if (7 == i) {
            i0((rog) obj);
        } else if (73 == i) {
            k0((Integer) obj);
        } else {
            if (67 != i) {
                return false;
            }
            h0((ChatMessages) obj);
        }
        return true;
    }

    @Override // p001o.jbc.InterfaceC14485a
    /* renamed from: c */
    public final void mo16294c(int i, View view) {
        switch (i) {
            case 1:
                ck6 ck6Var = this.b1;
                ChatMessages chatMessages = this.Z0;
                Integer num = this.a1;
                if (ck6Var != null) {
                    ck6Var.mo708b(view, num.intValue(), chatMessages);
                    break;
                }
                break;
            case 3:
                ck6 ck6Var2 = this.b1;
                ChatMessages chatMessages2 = this.Z0;
                Integer num2 = this.a1;
                if (ck6Var2 != null) {
                    ck6Var2.mo708b(view, num2.intValue(), chatMessages2);
                    break;
                }
                break;
            case 5:
                ck6 ck6Var3 = this.b1;
                ChatMessages chatMessages3 = this.Z0;
                Integer num3 = this.a1;
                if (ck6Var3 != null) {
                    ck6Var3.mo708b(view, num3.intValue(), chatMessages3);
                    break;
                }
                break;
            case 7:
                ck6 ck6Var4 = this.b1;
                ChatMessages chatMessages4 = this.Z0;
                Integer num4 = this.a1;
                if (ck6Var4 != null) {
                    ck6Var4.mo708b(view, num4.intValue(), chatMessages4);
                    break;
                }
                break;
            case 9:
                ck6 ck6Var5 = this.b1;
                ChatMessages chatMessages5 = this.Z0;
                Integer num5 = this.a1;
                if (ck6Var5 != null) {
                    ck6Var5.mo708b(view, num5.intValue(), chatMessages5);
                    break;
                }
                break;
            case 11:
                ck6 ck6Var6 = this.b1;
                ChatMessages chatMessages6 = this.Z0;
                Integer num6 = this.a1;
                if (ck6Var6 != null) {
                    ck6Var6.mo708b(view, num6.intValue(), chatMessages6);
                    break;
                }
                break;
            case 12:
                ck6 ck6Var7 = this.b1;
                ChatMessages chatMessages7 = this.Z0;
                Integer num7 = this.a1;
                if (ck6Var7 != null) {
                    ck6Var7.mo708b(view, num7.intValue(), chatMessages7);
                    break;
                }
                break;
            case 14:
                ck6 ck6Var8 = this.b1;
                ChatMessages chatMessages8 = this.Z0;
                Integer num8 = this.a1;
                if (ck6Var8 != null) {
                    ck6Var8.mo708b(view, num8.intValue(), chatMessages8);
                    break;
                }
                break;
            case 16:
                ck6 ck6Var9 = this.b1;
                ChatMessages chatMessages9 = this.Z0;
                Integer num9 = this.a1;
                if (ck6Var9 != null) {
                    ck6Var9.mo708b(view, num9.intValue(), chatMessages9);
                    break;
                }
                break;
            case 18:
                ck6 ck6Var10 = this.b1;
                ChatMessages chatMessages10 = this.Z0;
                Integer num10 = this.a1;
                if (ck6Var10 != null) {
                    ck6Var10.mo708b(view, num10.intValue(), chatMessages10);
                    break;
                }
                break;
            case 20:
                ck6 ck6Var11 = this.b1;
                ChatMessages chatMessages11 = this.Z0;
                Integer num11 = this.a1;
                if (ck6Var11 != null) {
                    ck6Var11.mo708b(view, num11.intValue(), chatMessages11);
                    break;
                }
                break;
            case 22:
                ck6 ck6Var12 = this.b1;
                ChatMessages chatMessages12 = this.Z0;
                Integer num12 = this.a1;
                if (ck6Var12 != null) {
                    ck6Var12.mo708b(view, num12.intValue(), chatMessages12);
                    break;
                }
                break;
            case 23:
                ck6 ck6Var13 = this.b1;
                ChatMessages chatMessages13 = this.Z0;
                Integer num13 = this.a1;
                if (ck6Var13 != null) {
                    ck6Var13.mo708b(view, num13.intValue(), chatMessages13);
                    break;
                }
                break;
            case 25:
                ck6 ck6Var14 = this.b1;
                ChatMessages chatMessages14 = this.Z0;
                Integer num14 = this.a1;
                if (ck6Var14 != null) {
                    ck6Var14.mo708b(view, num14.intValue(), chatMessages14);
                    break;
                }
                break;
            case 27:
                ck6 ck6Var15 = this.b1;
                ChatMessages chatMessages15 = this.Z0;
                Integer num15 = this.a1;
                if (ck6Var15 != null) {
                    ck6Var15.mo708b(view, num15.intValue(), chatMessages15);
                    break;
                }
                break;
            case 30:
                ck6 ck6Var16 = this.b1;
                ChatMessages chatMessages16 = this.Z0;
                Integer num16 = this.a1;
                if (ck6Var16 != null) {
                    ck6Var16.mo708b(view, num16.intValue(), chatMessages16);
                    break;
                }
                break;
        }
    }

    @Override // p001o.kx8
    public void h0(ChatMessages chatMessages) {
        this.Z0 = chatMessages;
        synchronized (this) {
            this.N1 |= 8;
        }
        m28509h(67);
        super.m25692R();
    }

    public void i0(rog rogVar) {
        this.c1 = rogVar;
    }

    public void j0(ck6 ck6Var) {
        this.b1 = ck6Var;
        synchronized (this) {
            this.N1 |= 1;
        }
        m28509h(33);
        super.m25692R();
    }

    public void k0(Integer num) {
        this.a1 = num;
        synchronized (this) {
            this.N1 |= 4;
        }
        m28509h(73);
        super.m25692R();
    }

    @Override // p001o.ewi
    /* renamed from: p */
    public void mo16295p() {
        long j;
        long messageTime;
        int i;
        int i2;
        int i3;
        FileData fileData;
        String str;
        int i4;
        boolean zIsUploaded;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        int i5;
        int i6;
        int i7;
        int i8;
        boolean showDateText;
        boolean zIsSelected;
        List<WaButton> list;
        FileData messageFile;
        Boolean boolIsStarred;
        ChatMessages replyingToMessage;
        WaButton waButton;
        WaButton waButton2;
        WaButton waButton3;
        String fileName;
        String mimeType;
        String messageUserName;
        String messageText;
        synchronized (this) {
            j = this.N1;
            this.N1 = 0L;
        }
        ChatMessages chatMessages = this.Z0;
        long j2 = j & 24;
        int i9 = 0;
        if (j2 != 0) {
            if (chatMessages != null) {
                showDateText = chatMessages.getShowDateText();
                zIsSelected = chatMessages.isSelected();
                List<WaButton> buttons = chatMessages.getButtons();
                messageTime = chatMessages.getMessageTime();
                messageFile = chatMessages.getMessageFile();
                boolIsStarred = chatMessages.isStarred();
                replyingToMessage = chatMessages.getReplyingToMessage();
                list = buttons;
            } else {
                messageTime = 0;
                showDateText = false;
                zIsSelected = false;
                list = null;
                messageFile = null;
                boolIsStarred = null;
                replyingToMessage = null;
            }
            if (j2 != 0) {
                j |= showDateText ? 4194304L : 2097152L;
            }
            if ((j & 24) != 0) {
                j |= zIsSelected ? MediaStatus.COMMAND_LIKE : MediaStatus.COMMAND_PLAYBACK_RATE;
            }
            i = showDateText ? 0 : 8;
            int i10 = zIsSelected ? 0 : 8;
            boolean zM25676W = ewi.m25676W(boolIsStarred);
            boolean z = replyingToMessage == null;
            if ((j & 24) != 0) {
                j |= zM25676W ? 256L : 128L;
            }
            if ((j & 24) != 0) {
                j |= z ? MediaStatus.COMMAND_STREAM_TRANSFER : MediaStatus.COMMAND_UNFOLLOW;
            }
            if (list != null) {
                int size = list.size();
                waButton2 = (WaButton) ewi.m25667A(list, 2);
                waButton3 = (WaButton) ewi.m25667A(list, 1);
                waButton = (WaButton) ewi.m25667A(list, 0);
                i9 = size;
            } else {
                waButton = null;
                waButton2 = null;
                waButton3 = null;
            }
            if (messageFile != null) {
                fileName = messageFile.getFileName();
                zIsUploaded = messageFile.isUploaded();
                mimeType = messageFile.getMimeType();
            } else {
                fileName = null;
                zIsUploaded = false;
                mimeType = null;
            }
            if ((j & 24) != 0) {
                j = zIsUploaded ? j | MediaStatus.COMMAND_EDIT_TRACKS : j | MediaStatus.COMMAND_QUEUE_REPEAT_ONE;
            }
            if (replyingToMessage != null) {
                messageText = replyingToMessage.getMessageText();
                messageUserName = replyingToMessage.getMessageUserName();
            } else {
                messageUserName = null;
                messageText = null;
            }
            int i11 = zM25676W ? 0 : 8;
            int i12 = z ? 8 : 0;
            boolean z2 = i9 == 1;
            boolean z3 = i9 == 2;
            boolean z4 = i9 == 3;
            if ((j & 24) != 0) {
                j |= z2 ? 1048576L : 524288L;
            }
            if ((j & 24) != 0) {
                j |= z3 ? 64L : 32L;
            }
            if ((j & 24) != 0) {
                j |= z4 ? MediaStatus.COMMAND_FOLLOW : MediaStatus.COMMAND_DISLIKE;
            }
            String waText = waButton2 != null ? waButton2.getWaText() : null;
            String waText2 = waButton3 != null ? waButton3.getWaText() : null;
            String waText3 = waButton != null ? waButton.getWaText() : null;
            i3 = z2 ? 0 : 8;
            int i13 = z3 ? 0 : 8;
            i2 = z4 ? 0 : 8;
            str6 = waText;
            i5 = i10;
            i6 = i11;
            i7 = i12;
            str7 = messageUserName;
            str2 = waText3;
            str3 = waText2;
            str4 = fileName;
            str = mimeType;
            str5 = messageText;
            i4 = i13;
            fileData = messageFile;
        } else {
            messageTime = 0;
            i = 0;
            i2 = 0;
            i3 = 0;
            fileData = null;
            str = null;
            i4 = 0;
            zIsUploaded = false;
            str2 = null;
            str3 = null;
            str4 = null;
            str5 = null;
            str6 = null;
            str7 = null;
            i5 = 0;
            i6 = 0;
            i7 = 0;
        }
        boolean viewOnly = ((MediaStatus.COMMAND_QUEUE_REPEAT_ONE & j) == 0 || fileData == null) ? false : fileData.getViewOnly();
        long j3 = j & 24;
        if (j3 != 0) {
            boolean z5 = zIsUploaded ? true : viewOnly;
            if (j3 != 0) {
                j |= z5 ? MediaStatus.COMMAND_QUEUE_REPEAT_ALL : 512L;
            }
            i8 = z5 ? 8 : 0;
        } else {
            i8 = 0;
        }
        if ((24 & j) != 0) {
            nr1.m40962g(this.n0, chatMessages);
            String str8 = str2;
            fjh.m26938c(this.p0, str8);
            fjh.m26938c(this.q0, str8);
            fjh.m26938c(this.r0, str8);
            String str9 = str3;
            fjh.m26938c(this.s0, str9);
            fjh.m26938c(this.t0, str9);
            fjh.m26938c(this.u0, str6);
            this.v0.setVisibility(i);
            nr1.Q1(this.w0, chatMessages);
            this.x0.setVisibility(i5);
            nr1.O1(this.A0, fileData);
            nr1.n2(this.B0, fileData);
            fjh.m26938c(this.C0, str4);
            nr1.x2(this.D0, chatMessages);
            nr1.q2(this.F0, str);
            nr1.U1(this.H0, chatMessages);
            nr1.T2(this.I0, chatMessages);
            this.e1.setVisibility(i8);
            nr1.I0(this.f1, chatMessages);
            nr1.m40961f(this.g1, fileData);
            nr1.h0(this.h1, Long.valueOf(messageTime));
            nr1.n2(this.i1, fileData);
            nr1.A2(this.K0, chatMessages);
            nr1.c1(this.L0, chatMessages);
            this.M0.setVisibility(i6);
            this.N0.setVisibility(i3);
            this.O0.setVisibility(i7);
            nr1.m40965j(this.Q0, chatMessages);
            String str10 = str5;
            fjh.m26938c(this.R0, str10);
            fjh.m26938c(this.S0, str10);
            String str11 = str7;
            fjh.m26938c(this.T0, str11);
            fjh.m26938c(this.U0, str11);
            this.V0.setVisibility(i2);
            this.Y0.setVisibility(i4);
        }
        if ((j & 16) != 0) {
            this.o0.setOnClickListener(this.K1);
            this.x0.setOnClickListener(this.z1);
            this.z0.setOnClickListener(this.s1);
            this.z0.setOnLongClickListener(this.w1);
            this.A0.setOnClickListener(this.t1);
            this.A0.setOnLongClickListener(this.x1);
            this.B0.setOnClickListener(this.y1);
            this.B0.setOnLongClickListener(this.j1);
            this.C0.setOnClickListener(this.o1);
            this.C0.setOnLongClickListener(this.I1);
            this.D0.setOnClickListener(this.C1);
            this.E0.setOnClickListener(this.q1);
            this.E0.setOnLongClickListener(this.v1);
            this.F0.setOnClickListener(this.A1);
            this.F0.setOnLongClickListener(this.l1);
            this.G0.setOnClickListener(this.H1);
            this.G0.setOnLongClickListener(this.L1);
            this.H0.setOnClickListener(this.B1);
            this.H0.setOnLongClickListener(this.E1);
            this.I0.setOnClickListener(this.F1);
            this.I0.setOnLongClickListener(this.r1);
            this.O0.setOnClickListener(this.k1);
            this.O0.setOnLongClickListener(this.n1);
            this.Q0.setOnClickListener(this.D1);
            this.Q0.setOnLongClickListener(this.G1);
            this.R0.setOnClickListener(this.m1);
            this.R0.setOnLongClickListener(this.p1);
            this.T0.setOnClickListener(this.J1);
            this.T0.setOnLongClickListener(this.M1);
            this.U0.setOnLongClickListener(this.u1);
        }
    }

    public lx8(yt4 yt4Var, View view, Object[] objArr) {
        super(yt4Var, view, 0, (MaterialButton) objArr[24], (ImageButton) objArr[17], (Button) objArr[31], (Button) objArr[26], (Button) objArr[28], (Button) objArr[32], (Button) objArr[29], (Button) objArr[33], (FrameLayout) objArr[1], (TextView) objArr[38], (RelativeLayout) objArr[34], (View) objArr[40], (CardView) objArr[3], (ShapeableImageView) objArr[20], (LinearLayout) objArr[11], (MaterialTextView) objArr[14], (ShapeableImageView) objArr[9], (MaterialCardView) objArr[12], (ShapeableImageView) objArr[13], (MaterialCardView) objArr[7], (ShapeableImageView) objArr[18], (ShapeableImageView) objArr[10], (LinearLayout) objArr[39], (TextView) objArr[36], (ShapeableImageView) objArr[37], (ShapeableImageView) objArr[35], (LinearLayout) objArr[25], (ConstraintLayout) objArr[4], (SeekBar) objArr[41], (MaterialTextView) objArr[21], (MaterialTextView) objArr[6], (MaterialTextView) objArr[22], (MaterialTextView) objArr[5], (MaterialTextView) objArr[23], (LinearLayout) objArr[30], (LinearLayout) objArr[43], (TextView) objArr[42], (LinearLayout) objArr[27]);
        this.N1 = -1L;
        this.n0.setTag(null);
        this.o0.setTag(null);
        this.p0.setTag(null);
        this.q0.setTag(null);
        this.r0.setTag(null);
        this.s0.setTag(null);
        this.t0.setTag(null);
        this.u0.setTag(null);
        this.v0.setTag(null);
        this.w0.setTag(null);
        this.x0.setTag(null);
        this.z0.setTag(null);
        this.A0.setTag(null);
        this.B0.setTag(null);
        this.C0.setTag(null);
        this.D0.setTag(null);
        this.E0.setTag(null);
        this.F0.setTag(null);
        this.G0.setTag(null);
        this.H0.setTag(null);
        this.I0.setTag(null);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.d1 = constraintLayout;
        constraintLayout.setTag(null);
        ProgressBar progressBar = (ProgressBar) objArr[15];
        this.e1 = progressBar;
        progressBar.setTag(null);
        LinearLayout linearLayout = (LinearLayout) objArr[16];
        this.f1 = linearLayout;
        linearLayout.setTag(null);
        View view2 = (View) objArr[19];
        this.g1 = view2;
        view2.setTag(null);
        TextView textView = (TextView) objArr[2];
        this.h1 = textView;
        textView.setTag(null);
        LinearLayout linearLayout2 = (LinearLayout) objArr[8];
        this.i1 = linearLayout2;
        linearLayout2.setTag(null);
        this.K0.setTag(null);
        this.L0.setTag(null);
        this.M0.setTag(null);
        this.N0.setTag(null);
        this.O0.setTag(null);
        this.Q0.setTag(null);
        this.R0.setTag(null);
        this.S0.setTag(null);
        this.T0.setTag(null);
        this.U0.setTag(null);
        this.V0.setTag(null);
        this.Y0.setTag(null);
        a0(view);
        this.j1 = new sbc(this, 15);
        this.k1 = new jbc(this, 3);
        this.l1 = new sbc(this, 19);
        this.m1 = new jbc(this, 7);
        this.n1 = new sbc(this, 4);
        this.o1 = new jbc(this, 20);
        this.p1 = new sbc(this, 8);
        this.q1 = new jbc(this, 16);
        this.r1 = new sbc(this, 13);
        this.s1 = new jbc(this, 1);
        this.t1 = new jbc(this, 25);
        this.u1 = new sbc(this, 29);
        this.v1 = new sbc(this, 17);
        this.w1 = new sbc(this, 2);
        this.x1 = new sbc(this, 26);
        this.y1 = new jbc(this, 14);
        this.z1 = new jbc(this, 30);
        this.A1 = new jbc(this, 18);
        this.B1 = new jbc(this, 23);
        this.C1 = new jbc(this, 11);
        this.D1 = new jbc(this, 27);
        this.E1 = new sbc(this, 24);
        this.F1 = new jbc(this, 12);
        this.G1 = new sbc(this, 28);
        this.H1 = new jbc(this, 9);
        this.I1 = new sbc(this, 21);
        this.J1 = new jbc(this, 5);
        this.K1 = new jbc(this, 22);
        this.L1 = new sbc(this, 10);
        this.M1 = new sbc(this, 6);
        mo16291G();
    }
}
