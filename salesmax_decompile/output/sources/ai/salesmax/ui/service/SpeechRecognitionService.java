package ai.salesmax.ui.service;

import android.app.Service;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.speech.RecognitionListener;
import android.speech.SpeechRecognizer;
import com.onesignal.session.internal.outcomes.impl.OutcomeEventsTable;
import java.util.ArrayList;
import p001o.id5;
import p001o.sq8;

/* loaded from: classes.dex */
public final class SpeechRecognitionService extends Service implements RecognitionListener {

    /* renamed from: b */
    public static final C1221a f3596b = new C1221a(null);

    /* renamed from: c */
    public static final int f3597c = 8;

    /* renamed from: d */
    public static volatile SpeechRecognitionService f3598d;

    /* renamed from: a */
    public SpeechRecognizer f3599a;

    /* renamed from: ai.salesmax.ui.service.SpeechRecognitionService$a */
    public static final class C1221a {
        public C1221a() {
        }

        public /* synthetic */ C1221a(id5 id5Var) {
            this();
        }
    }

    /* renamed from: a */
    public final void m2668a() {
        SpeechRecognizer speechRecognizer = this.f3599a;
        if (speechRecognizer != null) {
            speechRecognizer.destroy();
        }
        this.f3599a = null;
    }

    @Override // android.speech.RecognitionListener
    public void onBeginningOfSpeech() {
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        sq8.m48649h(intent, "intent");
        return null;
    }

    @Override // android.speech.RecognitionListener
    public void onBufferReceived(byte[] bArr) {
        sq8.m48649h(bArr, "buffer");
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        f3598d = this;
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
        m2668a();
    }

    @Override // android.speech.RecognitionListener
    public void onEndOfSpeech() {
    }

    @Override // android.speech.RecognitionListener
    public void onError(int i) {
        StringBuilder sb = new StringBuilder();
        sb.append("onError: ");
        sb.append(i);
    }

    @Override // android.speech.RecognitionListener
    public void onEvent(int i, Bundle bundle) {
        sq8.m48649h(bundle, OutcomeEventsTable.COLUMN_NAME_PARAMS);
    }

    @Override // android.speech.RecognitionListener
    public void onPartialResults(Bundle bundle) {
        sq8.m48649h(bundle, "partialResults");
    }

    @Override // android.speech.RecognitionListener
    public void onReadyForSpeech(Bundle bundle) {
        sq8.m48649h(bundle, OutcomeEventsTable.COLUMN_NAME_PARAMS);
    }

    @Override // android.speech.RecognitionListener
    public void onResults(Bundle bundle) {
        sq8.m48649h(bundle, "results");
        ArrayList<String> stringArrayList = bundle.getStringArrayList("results_recognition");
        if (stringArrayList == null || !(!stringArrayList.isEmpty())) {
            return;
        }
        String str = stringArrayList.get(0);
        StringBuilder sb = new StringBuilder();
        sb.append("Recognized text: ");
        sb.append(str);
    }

    @Override // android.speech.RecognitionListener
    public void onRmsChanged(float f) {
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        sq8.m48649h(intent, "intent");
        if (this.f3599a != null) {
            return 1;
        }
        SpeechRecognizer speechRecognizerCreateSpeechRecognizer = SpeechRecognizer.createSpeechRecognizer(getApplicationContext());
        this.f3599a = speechRecognizerCreateSpeechRecognizer;
        if (speechRecognizerCreateSpeechRecognizer == null) {
            return 1;
        }
        speechRecognizerCreateSpeechRecognizer.setRecognitionListener(this);
        return 1;
    }
}
