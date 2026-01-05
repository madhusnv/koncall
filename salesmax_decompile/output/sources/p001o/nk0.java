package p001o;

import android.view.textclassifier.TextClassificationManager;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;

/* loaded from: classes2.dex */
public final class nk0 {

    /* renamed from: a */
    public TextView f36965a;

    /* renamed from: b */
    public TextClassifier f36966b;

    /* renamed from: o.nk0$a */
    public static final class C15596a {
        /* renamed from: a */
        public static TextClassifier m40717a(TextView textView) {
            TextClassificationManager textClassificationManager = (TextClassificationManager) textView.getContext().getSystemService(TextClassificationManager.class);
            return textClassificationManager != null ? textClassificationManager.getTextClassifier() : TextClassifier.NO_OP;
        }
    }

    public nk0(TextView textView) {
        this.f36965a = (TextView) fgd.m26663g(textView);
    }

    /* renamed from: a */
    public TextClassifier m40715a() {
        TextClassifier textClassifier = this.f36966b;
        return textClassifier == null ? C15596a.m40717a(this.f36965a) : textClassifier;
    }

    /* renamed from: b */
    public void m40716b(TextClassifier textClassifier) {
        this.f36966b = textClassifier;
    }
}
