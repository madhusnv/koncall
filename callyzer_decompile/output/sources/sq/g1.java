package sq;

import android.content.Context;
import android.content.Intent;
import android.speech.SpeechRecognizer;
import b3.InterfaceC0579k;
import ex.InterfaceC2137a;
import p005f.C2162k;
import r5.AbstractC6468c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final /* synthetic */ class g1 implements InterfaceC2137a {

    /* renamed from: a */
    public final /* synthetic */ int f32874a = 1;

    /* renamed from: b */
    public final /* synthetic */ Context f32875b;

    /* renamed from: c */
    public final /* synthetic */ SpeechRecognizer f32876c;

    /* renamed from: d */
    public final /* synthetic */ InterfaceC0579k f32877d;

    /* renamed from: e */
    public final /* synthetic */ w3.p2 f32878e;

    /* renamed from: f */
    public final /* synthetic */ Intent f32879f;

    /* renamed from: g */
    public final /* synthetic */ C2162k f32880g;

    /* renamed from: h */
    public final /* synthetic */ k2.w0 f32881h;

    public /* synthetic */ g1(Context context, SpeechRecognizer speechRecognizer, InterfaceC0579k interfaceC0579k, w3.p2 p2Var, Intent intent, C2162k c2162k, k2.w0 w0Var) {
        this.f32875b = context;
        this.f32876c = speechRecognizer;
        this.f32877d = interfaceC0579k;
        this.f32878e = p2Var;
        this.f32879f = intent;
        this.f32880g = c2162k;
        this.f32881h = w0Var;
    }

    @Override // ex.InterfaceC2137a
    public final Object invoke() {
        switch (this.f32874a) {
            case 0:
                boolean z6 = AbstractC6468c.m12450a(this.f32875b, "android.permission.RECORD_AUDIO") == 0;
                InterfaceC0579k.m1742a(this.f32877d);
                w3.p2 p2Var = this.f32878e;
                if (p2Var != null) {
                    ((w3.l1) p2Var).m14975a();
                }
                boolean zBooleanValue = ((Boolean) this.f32881h.getValue()).booleanValue();
                SpeechRecognizer speechRecognizer = this.f32876c;
                if (zBooleanValue) {
                    speechRecognizer.stopListening();
                }
                if (z6) {
                    speechRecognizer.startListening(this.f32879f);
                } else {
                    this.f32880g.mo1274a("android.permission.RECORD_AUDIO");
                }
                break;
            default:
                boolean z10 = AbstractC6468c.m12450a(this.f32875b, "android.permission.RECORD_AUDIO") == 0;
                boolean zBooleanValue2 = ((Boolean) this.f32881h.getValue()).booleanValue();
                SpeechRecognizer speechRecognizer2 = this.f32876c;
                if (zBooleanValue2) {
                    speechRecognizer2.stopListening();
                }
                if (z10) {
                    InterfaceC0579k.m1742a(this.f32877d);
                    w3.p2 p2Var2 = this.f32878e;
                    if (p2Var2 != null) {
                        ((w3.l1) p2Var2).m14975a();
                    }
                    speechRecognizer2.startListening(this.f32879f);
                } else {
                    this.f32880g.mo1274a("android.permission.RECORD_AUDIO");
                }
                break;
        }
        return qw.a0.f30746a;
    }

    public /* synthetic */ g1(Context context, InterfaceC0579k interfaceC0579k, w3.p2 p2Var, SpeechRecognizer speechRecognizer, Intent intent, C2162k c2162k, k2.w0 w0Var) {
        this.f32875b = context;
        this.f32877d = interfaceC0579k;
        this.f32878e = p2Var;
        this.f32876c = speechRecognizer;
        this.f32879f = intent;
        this.f32880g = c2162k;
        this.f32881h = w0Var;
    }
}
