package er;

import av.C0458a;
import ex.InterfaceC2137a;
import g2.f4;
import j$.time.LocalDateTime;
import j$.time.ZoneOffset;
import java.util.Locale;
import k2.w0;
import kotlin.jvm.internal.AbstractC4154l;
import qw.a0;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: er.p */
/* loaded from: classes3.dex */
public final /* synthetic */ class C2116p implements InterfaceC2137a {

    /* renamed from: a */
    public final /* synthetic */ int f9887a;

    /* renamed from: b */
    public final /* synthetic */ w0 f9888b;

    /* renamed from: c */
    public final /* synthetic */ w0 f9889c;

    public /* synthetic */ C2116p(w0 w0Var, w0 w0Var2, int i10) {
        this.f9887a = i10;
        this.f9888b = w0Var;
        this.f9889c = w0Var2;
    }

    @Override // ex.InterfaceC2137a
    public final Object invoke() {
        switch (this.f9887a) {
            case 0:
                this.f9888b.setValue("");
                this.f9889c.setValue(Boolean.FALSE);
                break;
            case 1:
                this.f9888b.setValue("");
                this.f9889c.setValue(Boolean.FALSE);
                break;
            case 2:
                this.f9888b.setValue(null);
                this.f9889c.setValue(Boolean.FALSE);
                break;
            case 3:
                this.f9888b.setValue("");
                this.f9889c.setValue(Boolean.FALSE);
                break;
            case 4:
                this.f9888b.setValue("");
                this.f9889c.setValue(Boolean.FALSE);
                break;
            case 5:
                this.f9888b.setValue(Boolean.FALSE);
                this.f9889c.setValue(Boolean.TRUE);
                break;
            case 6:
                this.f9888b.setValue(Boolean.FALSE);
                this.f9889c.setValue(Boolean.TRUE);
                break;
            case 7:
                this.f9888b.setValue(Boolean.FALSE);
                long epochMilli = LocalDateTime.now().atOffset(ZoneOffset.UTC).toInstant().toEpochMilli();
                C0458a c0458a = new C0458a(7);
                Locale locale = Locale.getDefault();
                AbstractC4154l.m8922e(locale, "getDefault(...)");
                this.f9889c.setValue(f4.m6144d(locale, Long.valueOf(epochMilli), c0458a, 28));
                break;
            case 8:
                this.f9888b.setValue(Boolean.FALSE);
                long epochMilli2 = LocalDateTime.now().atOffset(ZoneOffset.UTC).toInstant().toEpochMilli();
                C0458a c0458a2 = new C0458a(8);
                Locale locale2 = Locale.getDefault();
                AbstractC4154l.m8922e(locale2, "getDefault(...)");
                this.f9889c.setValue(f4.m6144d(locale2, Long.valueOf(epochMilli2), c0458a2, 28));
                break;
            case 9:
                this.f9888b.setValue("");
                this.f9889c.setValue(Boolean.FALSE);
                break;
            case 10:
                this.f9888b.setValue("");
                this.f9889c.setValue(Boolean.FALSE);
                break;
            case 11:
                this.f9888b.setValue(Boolean.TRUE);
                this.f9889c.setValue(Boolean.FALSE);
                break;
            default:
                this.f9888b.setValue(Boolean.TRUE);
                this.f9889c.setValue(Boolean.FALSE);
                break;
        }
        return a0.f30746a;
    }
}
