package sq;

import av.C0458a;
import com.websoptimization.callyzerbiz.R;
import ex.InterfaceC2137a;
import g2.f4;
import j$.time.LocalDateTime;
import j$.time.ZoneOffset;
import java.util.Locale;
import kotlin.jvm.internal.AbstractC4154l;
import org.bouncycastle.iana.AEADAlgorithm;
import qt.EnumC6306a;
import rt.C6617a;
import rt.C6618b;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final /* synthetic */ class j2 implements InterfaceC2137a {

    /* renamed from: a */
    public final /* synthetic */ int f32980a;

    /* renamed from: b */
    public final /* synthetic */ k2.w0 f32981b;

    public /* synthetic */ j2(k2.w0 w0Var, int i10) {
        this.f32980a = i10;
        this.f32981b = w0Var;
    }

    @Override // ex.InterfaceC2137a
    public final Object invoke() {
        switch (this.f32980a) {
            case 0:
                long epochMilli = LocalDateTime.now().atOffset(ZoneOffset.UTC).toInstant().toEpochMilli();
                C0458a c0458a = new C0458a(10);
                Locale locale = Locale.getDefault();
                AbstractC4154l.m8922e(locale, "getDefault(...)");
                this.f32981b.setValue(f4.m6144d(locale, Long.valueOf(epochMilli), c0458a, 28));
                break;
            case 1:
                this.f32981b.setValue(Boolean.FALSE);
                break;
            case 2:
                this.f32981b.setValue(Boolean.FALSE);
                break;
            case 3:
                this.f32981b.setValue(Boolean.FALSE);
                break;
            case 4:
                this.f32981b.setValue(Boolean.FALSE);
                break;
            case 5:
                this.f32981b.setValue(Boolean.TRUE);
                break;
            case 6:
                this.f32981b.setValue(Boolean.TRUE);
                break;
            case 7:
                this.f32981b.setValue(Boolean.FALSE);
                break;
            case 8:
                k2.w0 w0Var = this.f32981b;
                C6617a c6617a = ((C6618b) w0Var.getValue()).f31792j;
                if (!AbstractC4154l.m8918a(c6617a != null ? c6617a.f31778h : null, EnumC6306a.FROM_LEAD.getToken())) {
                    return null;
                }
                C6617a c6617a2 = ((C6618b) w0Var.getValue()).f31792j;
                String str = c6617a2 != null ? c6617a2.f31780j : null;
                if (str == null || str.length() == 0) {
                    return null;
                }
                return Integer.valueOf(R.drawable.ic_arrow_down);
            case 9:
                this.f32981b.setValue(Boolean.FALSE);
                break;
            case 10:
                this.f32981b.setValue(Boolean.TRUE);
                break;
            case 11:
                this.f32981b.setValue(Boolean.FALSE);
                break;
            case 12:
                this.f32981b.setValue(Boolean.FALSE);
                break;
            case 13:
                this.f32981b.setValue(Boolean.TRUE);
                break;
            case 14:
                this.f32981b.setValue(Boolean.FALSE);
                break;
            case AEADAlgorithm.AEAD_AES_SIV_CMAC_256 /* 15 */:
                this.f32981b.setValue(Boolean.valueOf(!((Boolean) r0.getValue()).booleanValue()));
                break;
            case 16:
                this.f32981b.setValue(Boolean.FALSE);
                break;
            case 17:
                this.f32981b.setValue(Boolean.FALSE);
                break;
            case 18:
                this.f32981b.setValue(Boolean.TRUE);
                break;
            case 19:
                this.f32981b.setValue(Boolean.TRUE);
                break;
            case 20:
                this.f32981b.setValue(Boolean.TRUE);
                break;
            case 21:
                this.f32981b.setValue(Boolean.FALSE);
                break;
            case 22:
                this.f32981b.setValue(Boolean.FALSE);
                break;
            case 23:
                this.f32981b.setValue(Boolean.FALSE);
                break;
            case 24:
                this.f32981b.setValue(Boolean.TRUE);
                break;
            case 25:
                this.f32981b.setValue(Boolean.TRUE);
                break;
            case 26:
                this.f32981b.setValue(Boolean.TRUE);
                break;
            case 27:
                this.f32981b.setValue(Boolean.FALSE);
                break;
            case 28:
                this.f32981b.setValue(Boolean.TRUE);
                break;
            default:
                this.f32981b.setValue(Boolean.TRUE);
                break;
        }
        return qw.a0.f30746a;
    }
}
