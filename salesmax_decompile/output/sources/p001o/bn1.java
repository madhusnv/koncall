package p001o;

import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.google.android.material.button.MaterialButton;
import com.google.firebase.messaging.Constants;
import ernestoyaquello.com.verticalstepperform.AbstractC11918b;

/* loaded from: classes2.dex */
public final class bn1 extends AbstractC11918b {

    /* renamed from: p */
    public static final C12457a f16558p = new C12457a(null);

    /* renamed from: q */
    public static final int f16559q = 8;

    /* renamed from: m */
    public MaterialButton f16560m;

    /* renamed from: n */
    public String f16561n;

    /* renamed from: o */
    public View.OnClickListener f16562o;

    /* renamed from: o.bn1$a */
    public static final class C12457a {
        public C12457a() {
        }

        public /* synthetic */ C12457a(id5 id5Var) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bn1(String str, View.OnClickListener onClickListener) {
        super(str);
        sq8.m48649h(onClickListener, "buttonListener");
        this.f16562o = onClickListener;
    }

    /* renamed from: T */
    public static final boolean m19402T(bn1 bn1Var, TextView textView, int i, KeyEvent keyEvent) {
        sq8.m48649h(bn1Var, "this$0");
        bn1Var.m16180h().m16143x(true);
        return false;
    }

    @Override // ernestoyaquello.com.verticalstepperform.AbstractC11918b
    /* renamed from: A */
    public void mo16155A(boolean z) {
    }

    @Override // ernestoyaquello.com.verticalstepperform.AbstractC11918b
    /* renamed from: U, reason: merged with bridge method [inline-methods] */
    public String mo16183k() {
        return "";
    }

    @Override // ernestoyaquello.com.verticalstepperform.AbstractC11918b
    /* renamed from: V, reason: merged with bridge method [inline-methods] */
    public AbstractC11918b.b mo16191s(String str) {
        sq8.m48649h(str, "stepData");
        return new AbstractC11918b.b(true);
    }

    @Override // ernestoyaquello.com.verticalstepperform.AbstractC11918b
    /* renamed from: W, reason: merged with bridge method [inline-methods] */
    public void mo16164J(String str) {
        sq8.m48649h(str, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
    }

    @Override // ernestoyaquello.com.verticalstepperform.AbstractC11918b
    /* renamed from: c */
    public View mo16175c() {
        MaterialButton materialButton = new MaterialButton(m16177e());
        this.f16560m = materialButton;
        sq8.m48646e(materialButton);
        materialButton.setIcon(lk0.m37353b(m16177e(), w7e.ic_home_menu));
        MaterialButton materialButton2 = this.f16560m;
        sq8.m48646e(materialButton2);
        materialButton2.setText("Click To Upload");
        MaterialButton materialButton3 = this.f16560m;
        sq8.m48646e(materialButton3);
        View.OnClickListener onClickListener = this.f16562o;
        if (onClickListener == null) {
            sq8.m48667z(ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
            onClickListener = null;
        }
        materialButton3.setOnClickListener(onClickListener);
        MaterialButton materialButton4 = this.f16560m;
        sq8.m48646e(materialButton4);
        materialButton4.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: o.an1
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
                return bn1.m19402T(this.f15037a, textView, i, keyEvent);
            }
        });
        this.f16561n = m16177e().getResources().getString(hae.error);
        MaterialButton materialButton5 = this.f16560m;
        sq8.m48647f(materialButton5, "null cannot be cast to non-null type com.google.android.material.button.MaterialButton");
        return materialButton5;
    }

    @Override // ernestoyaquello.com.verticalstepperform.AbstractC11918b
    /* renamed from: l */
    public String mo16184l() {
        return "";
    }

    @Override // ernestoyaquello.com.verticalstepperform.AbstractC11918b
    /* renamed from: x */
    public void mo16196x(boolean z) {
    }

    @Override // ernestoyaquello.com.verticalstepperform.AbstractC11918b
    /* renamed from: y */
    public void mo16197y(boolean z) {
    }

    @Override // ernestoyaquello.com.verticalstepperform.AbstractC11918b
    /* renamed from: z */
    public void mo16198z(boolean z) {
    }
}
