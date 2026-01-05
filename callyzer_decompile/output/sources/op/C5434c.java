package op;

import av.C0458a;
import ex.InterfaceC2137a;
import g2.f4;
import j$.time.LocalDateTime;
import j$.time.ZoneOffset;
import java.util.Locale;
import k2.w0;
import kotlin.jvm.internal.AbstractC4154l;
import org.bouncycastle.iana.AEADAlgorithm;
import qw.a0;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: op.c */
/* loaded from: classes3.dex */
public final /* synthetic */ class C5434c implements InterfaceC2137a {

    /* renamed from: a */
    public final /* synthetic */ int f27335a;

    /* renamed from: b */
    public final /* synthetic */ w0 f27336b;

    public /* synthetic */ C5434c(w0 w0Var, int i10) {
        this.f27335a = i10;
        this.f27336b = w0Var;
    }

    @Override // ex.InterfaceC2137a
    public final Object invoke() {
        switch (this.f27335a) {
            case 0:
                this.f27336b.setValue(Boolean.FALSE);
                break;
            case 1:
                this.f27336b.setValue(Boolean.valueOf(!((Boolean) r0.getValue()).booleanValue()));
                break;
            case 2:
                this.f27336b.setValue(Boolean.FALSE);
                break;
            case 3:
                this.f27336b.setValue(Boolean.FALSE);
                break;
            case 4:
                this.f27336b.setValue(Boolean.valueOf(!((Boolean) r0.getValue()).booleanValue()));
                break;
            case 5:
                this.f27336b.setValue(Boolean.FALSE);
                break;
            case 6:
                this.f27336b.setValue(Boolean.FALSE);
                break;
            case 7:
                this.f27336b.setValue(Boolean.FALSE);
                break;
            case 8:
                this.f27336b.setValue(Boolean.valueOf(!((Boolean) r0.getValue()).booleanValue()));
                break;
            case 9:
                this.f27336b.setValue(Boolean.FALSE);
                break;
            case 10:
                this.f27336b.setValue(Boolean.FALSE);
                break;
            case 11:
                this.f27336b.setValue(null);
                break;
            case 12:
                this.f27336b.setValue(Boolean.TRUE);
                break;
            case 13:
                this.f27336b.setValue(Boolean.TRUE);
                break;
            case 14:
                this.f27336b.setValue(Boolean.FALSE);
                break;
            case AEADAlgorithm.AEAD_AES_SIV_CMAC_256 /* 15 */:
                this.f27336b.setValue(null);
                break;
            case 16:
                this.f27336b.setValue(Boolean.FALSE);
                break;
            case 17:
                this.f27336b.setValue(Boolean.FALSE);
                break;
            case 18:
                this.f27336b.setValue(Boolean.FALSE);
                break;
            case 19:
                this.f27336b.setValue(Boolean.FALSE);
                break;
            case 20:
                this.f27336b.setValue(Boolean.FALSE);
                break;
            case 21:
                this.f27336b.setValue(Boolean.TRUE);
                break;
            case 22:
                this.f27336b.setValue(Boolean.FALSE);
                break;
            case 23:
                this.f27336b.setValue(Boolean.FALSE);
                break;
            case 24:
                this.f27336b.setValue(Boolean.FALSE);
                break;
            case 25:
                this.f27336b.setValue(Boolean.FALSE);
                break;
            case 26:
                this.f27336b.setValue(Boolean.FALSE);
                break;
            case 27:
                this.f27336b.setValue(Boolean.FALSE);
                break;
            case 28:
                this.f27336b.setValue(Boolean.FALSE);
                break;
            default:
                long epochMilli = LocalDateTime.now().atOffset(ZoneOffset.UTC).toInstant().toEpochMilli();
                C0458a c0458a = new C0458a(9);
                Locale locale = Locale.getDefault();
                AbstractC4154l.m8922e(locale, "getDefault(...)");
                this.f27336b.setValue(f4.m6144d(locale, Long.valueOf(epochMilli), c0458a, 28));
                break;
        }
        return a0.f30746a;
    }
}
