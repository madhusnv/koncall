package sq;

import android.speech.SpeechRecognizer;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final class l1 implements k2.e0 {

    /* renamed from: a */
    public final /* synthetic */ int f33031a;

    /* renamed from: b */
    public final /* synthetic */ SpeechRecognizer f33032b;

    public /* synthetic */ l1(SpeechRecognizer speechRecognizer, int i10) {
        this.f33031a = i10;
        this.f33032b = speechRecognizer;
    }

    @Override // k2.e0
    public final void dispose() {
        switch (this.f33031a) {
            case 0:
                SpeechRecognizer speechRecognizer = this.f33032b;
                speechRecognizer.stopListening();
                speechRecognizer.destroy();
                break;
            default:
                SpeechRecognizer speechRecognizer2 = this.f33032b;
                speechRecognizer2.stopListening();
                speechRecognizer2.destroy();
                break;
        }
    }
}
