package p001o;

import android.text.Editable;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import com.google.firebase.messaging.Constants;
import ernestoyaquello.com.verticalstepperform.AbstractC11918b;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class dn1 extends AbstractC11918b {

    /* renamed from: o */
    public static final C12993a f20285o = new C12993a(null);

    /* renamed from: p */
    public static final int f20286p = 8;

    /* renamed from: m */
    public EditText f20287m;

    /* renamed from: n */
    public String f20288n;

    /* renamed from: o.dn1$a */
    public static final class C12993a {
        public C12993a() {
        }

        public /* synthetic */ C12993a(id5 id5Var) {
            this();
        }
    }

    /* renamed from: o.dn1$b */
    public static final class C12994b implements TextWatcher {
        public C12994b() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            sq8.m48649h(editable, "s");
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            sq8.m48649h(charSequence, "s");
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            sq8.m48649h(charSequence, "s");
            dn1.this.m16193u(true);
        }
    }

    public dn1(String str) {
        super(str);
    }

    /* renamed from: T */
    public static final boolean m23572T(dn1 dn1Var, TextView textView, int i, KeyEvent keyEvent) {
        sq8.m48649h(dn1Var, "this$0");
        dn1Var.m16180h().m16143x(true);
        return false;
    }

    @Override // ernestoyaquello.com.verticalstepperform.AbstractC11918b
    /* renamed from: A */
    public void mo16155A(boolean z) {
    }

    @Override // ernestoyaquello.com.verticalstepperform.AbstractC11918b
    /* renamed from: U, reason: merged with bridge method [inline-methods] */
    public String mo16183k() {
        String string;
        EditText editText = this.f20287m;
        sq8.m48646e(editText);
        Editable text = editText.getText();
        return (text == null || (string = text.toString()) == null) ? "" : string;
    }

    @Override // ernestoyaquello.com.verticalstepperform.AbstractC11918b
    /* renamed from: V, reason: merged with bridge method [inline-methods] */
    public AbstractC11918b.b mo16191s(String str) {
        sq8.m48649h(str, "stepData");
        if (str.length() >= 3) {
            return new AbstractC11918b.b(true);
        }
        h8g h8gVar = h8g.f26398a;
        String str2 = this.f20288n;
        sq8.m48646e(str2);
        String str3 = String.format(str2, Arrays.copyOf(new Object[]{3}, 1));
        sq8.m48648g(str3, "format(...)");
        return new AbstractC11918b.b(false, str3);
    }

    @Override // ernestoyaquello.com.verticalstepperform.AbstractC11918b
    /* renamed from: W, reason: merged with bridge method [inline-methods] */
    public void mo16164J(String str) {
        sq8.m48649h(str, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        EditText editText = this.f20287m;
        if (editText != null) {
            sq8.m48646e(editText);
            editText.setText(str);
        }
    }

    @Override // ernestoyaquello.com.verticalstepperform.AbstractC11918b
    /* renamed from: c */
    public View mo16175c() {
        View viewInflate = LayoutInflater.from(m16177e()).inflate(p9e.item_bulk_add_name, (ViewGroup) null, false);
        sq8.m48648g(viewInflate, "inflate(...)");
        View viewFindViewById = viewInflate.findViewById(z8e.bulkUploadName);
        sq8.m48647f(viewFindViewById, "null cannot be cast to non-null type android.widget.EditText");
        this.f20287m = (EditText) viewFindViewById;
        this.f20288n = m16177e().getResources().getString(hae.error);
        EditText editText = this.f20287m;
        sq8.m48646e(editText);
        editText.addTextChangedListener(new C12994b());
        EditText editText2 = this.f20287m;
        sq8.m48646e(editText2);
        editText2.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: o.cn1
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
                return dn1.m23572T(this.f18363a, textView, i, keyEvent);
            }
        });
        return viewInflate;
    }

    @Override // ernestoyaquello.com.verticalstepperform.AbstractC11918b
    /* renamed from: l */
    public String mo16184l() {
        String strMo16183k = mo16183k();
        if (strMo16183k != null) {
            if (!(strMo16183k.length() == 0)) {
                return strMo16183k;
            }
        }
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
