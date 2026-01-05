package sq;

import android.content.Intent;
import android.speech.SpeechRecognizer;
import b3.InterfaceC0579k;
import ex.InterfaceC2137a;
import ex.InterfaceC2139c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final /* synthetic */ class f1 implements InterfaceC2139c {

    /* renamed from: a */
    public final /* synthetic */ int f32854a = 1;

    /* renamed from: b */
    public final /* synthetic */ InterfaceC0579k f32855b;

    /* renamed from: c */
    public final /* synthetic */ w3.p2 f32856c;

    /* renamed from: d */
    public final /* synthetic */ SpeechRecognizer f32857d;

    /* renamed from: e */
    public final /* synthetic */ Intent f32858e;

    /* renamed from: f */
    public final /* synthetic */ InterfaceC2137a f32859f;

    public /* synthetic */ f1(InterfaceC0579k interfaceC0579k, w3.p2 p2Var, SpeechRecognizer speechRecognizer, Intent intent, InterfaceC2137a interfaceC2137a) {
        this.f32855b = interfaceC0579k;
        this.f32856c = p2Var;
        this.f32857d = speechRecognizer;
        this.f32858e = intent;
        this.f32859f = interfaceC2137a;
    }

    @Override // ex.InterfaceC2139c
    public final Object invoke(Object obj) {
        int i10 = this.f32854a;
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        switch (i10) {
            case 0:
                if (zBooleanValue) {
                    InterfaceC0579k.m1742a(this.f32855b);
                    w3.p2 p2Var = this.f32856c;
                    if (p2Var != null) {
                        ((w3.l1) p2Var).m14975a();
                    }
                    this.f32857d.startListening(this.f32858e);
                } else {
                    this.f32859f.invoke();
                }
                break;
            default:
                if (zBooleanValue) {
                    InterfaceC0579k.m1742a(this.f32855b);
                    w3.p2 p2Var2 = this.f32856c;
                    if (p2Var2 != null) {
                        ((w3.l1) p2Var2).m14975a();
                    }
                    this.f32857d.startListening(this.f32858e);
                } else {
                    this.f32859f.invoke();
                }
                break;
        }
        return qw.a0.f30746a;
    }

    public /* synthetic */ f1(InterfaceC2137a interfaceC2137a, InterfaceC0579k interfaceC0579k, w3.p2 p2Var, SpeechRecognizer speechRecognizer, Intent intent) {
        this.f32859f = interfaceC2137a;
        this.f32855b = interfaceC0579k;
        this.f32856c = p2Var;
        this.f32857d = speechRecognizer;
        this.f32858e = intent;
    }
}
