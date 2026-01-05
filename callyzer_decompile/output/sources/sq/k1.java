package sq;

import android.os.Bundle;
import android.speech.RecognitionListener;
import ex.InterfaceC2139c;
import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC4154l;
import l4.C4381z;
import og.yf;
import rw.AbstractC6663m;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final class k1 implements RecognitionListener {

    /* renamed from: a */
    public final /* synthetic */ k2.w0 f32993a;

    /* renamed from: b */
    public final /* synthetic */ InterfaceC2139c f32994b;

    /* renamed from: c */
    public final /* synthetic */ k2.w0 f32995c;

    /* renamed from: d */
    public final /* synthetic */ k2.w0 f32996d;

    public k1(k2.w0 w0Var, InterfaceC2139c interfaceC2139c, k2.w0 w0Var2, k2.w0 w0Var3) {
        this.f32993a = w0Var;
        this.f32994b = interfaceC2139c;
        this.f32995c = w0Var2;
        this.f32996d = w0Var3;
    }

    @Override // android.speech.RecognitionListener
    public final void onEndOfSpeech() {
        this.f32993a.setValue(Boolean.FALSE);
    }

    @Override // android.speech.RecognitionListener
    public final void onError(int i10) {
        this.f32993a.setValue(Boolean.FALSE);
    }

    @Override // android.speech.RecognitionListener
    public final void onReadyForSpeech(Bundle bundle) {
        this.f32993a.setValue(Boolean.TRUE);
    }

    @Override // android.speech.RecognitionListener
    public final void onResults(Bundle bundle) {
        String str;
        ArrayList<String> stringArrayList = bundle != null ? bundle.getStringArrayList("results_recognition") : null;
        if (stringArrayList == null || (str = (String) AbstractC6663m.m12743G(stringArrayList)) == null) {
            str = "";
        }
        if (str.length() > 0) {
            k2.w0 w0Var = this.f32995c;
            String str2 = ((C4381z) w0Var.getValue()).f21945a.f13620b;
            long j6 = ((C4381z) w0Var.getValue()).f21946b;
            int i10 = g4.n0.f13685c;
            int i11 = (int) (j6 & 4294967295L);
            String strSubstring = str2.substring(0, i11);
            AbstractC4154l.m8922e(strSubstring, "substring(...)");
            String strSubstring2 = str2.substring(i11);
            AbstractC4154l.m8922e(strSubstring2, "substring(...)");
            String str3 = strSubstring + " " + str + " " + strSubstring2;
            C4381z c4381z = (C4381z) w0Var.getValue();
            int length = str3.length();
            w0Var.setValue(C4381z.m9154b(c4381z, str3, yf.m11072a(length, length), 4));
            this.f32996d.setValue(Boolean.valueOf(((C4381z) w0Var.getValue()).f21945a.f13620b.length() > 1000));
            this.f32994b.invoke(str3);
        }
        this.f32993a.setValue(Boolean.FALSE);
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
