package sq;

import android.os.Bundle;
import android.speech.RecognitionListener;
import ex.InterfaceC2139c;
import java.util.ArrayList;
import nx.AbstractC5178p;
import rw.AbstractC6663m;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final class z1 implements RecognitionListener {

    /* renamed from: a */
    public final /* synthetic */ k2.w0 f33392a;

    /* renamed from: b */
    public final /* synthetic */ InterfaceC2139c f33393b;

    /* renamed from: c */
    public final /* synthetic */ k2.w0 f33394c;

    public z1(InterfaceC2139c interfaceC2139c, k2.w0 w0Var, k2.w0 w0Var2) {
        this.f33392a = w0Var;
        this.f33393b = interfaceC2139c;
        this.f33394c = w0Var2;
    }

    @Override // android.speech.RecognitionListener
    public final void onEndOfSpeech() {
        this.f33392a.setValue(Boolean.FALSE);
    }

    @Override // android.speech.RecognitionListener
    public final void onError(int i10) {
        this.f33392a.setValue(Boolean.FALSE);
    }

    @Override // android.speech.RecognitionListener
    public final void onReadyForSpeech(Bundle bundle) {
        this.f33392a.setValue(Boolean.TRUE);
    }

    @Override // android.speech.RecognitionListener
    public final void onResults(Bundle bundle) {
        ArrayList<String> stringArrayList;
        String str = (bundle == null || (stringArrayList = bundle.getStringArrayList("results_recognition")) == null) ? null : (String) AbstractC6663m.m12743G(stringArrayList);
        if (str == null) {
            str = "";
        }
        if (!AbstractC5178p.m10101L(str)) {
            k2.w0 w0Var = this.f33394c;
            w0Var.setValue(((String) w0Var.getValue()) + " " + str);
            this.f33393b.invoke((String) w0Var.getValue());
        }
        this.f33392a.setValue(Boolean.FALSE);
    }

    @Override // android.speech.RecognitionListener
    public final void onBeginningOfSpeech() {
    }

    @Override // android.speech.RecognitionListener
    public final void onBufferReceived(byte[] bArr) {
    }

    @Override // android.speech.RecognitionListener
    public final void onPartialResults(Bundle bundle) {
    }

    @Override // android.speech.RecognitionListener
    public final void onRmsChanged(float f6) {
    }

    @Override // android.speech.RecognitionListener
    public final void onEvent(int i10, Bundle bundle) {
    }
}
