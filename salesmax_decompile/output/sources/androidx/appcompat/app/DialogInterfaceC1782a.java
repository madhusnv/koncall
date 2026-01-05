package androidx.appcompat.app;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.ListAdapter;
import android.widget.ListView;
import androidx.appcompat.app.AlertController;
import com.google.firebase.perf.util.Constants;
import p001o.dk0;
import p001o.z5e;

/* renamed from: androidx.appcompat.app.a */
/* loaded from: classes2.dex */
public class DialogInterfaceC1782a extends dk0 implements DialogInterface {

    /* renamed from: a */
    public final AlertController f5438a;

    /* renamed from: androidx.appcompat.app.a$a */
    public static class a {

        /* renamed from: a */
        public final AlertController.C1756b f5439a;

        /* renamed from: b */
        public final int f5440b;

        public a(Context context) {
            this(context, DialogInterfaceC1782a.m3864h(context, 0));
        }

        /* renamed from: a */
        public a mo3868a(ListAdapter listAdapter, DialogInterface.OnClickListener onClickListener) {
            AlertController.C1756b c1756b = this.f5439a;
            c1756b.f5362w = listAdapter;
            c1756b.f5363x = onClickListener;
            return this;
        }

        /* renamed from: b */
        public a mo3869b(boolean z) {
            this.f5439a.f5357r = z;
            return this;
        }

        /* renamed from: c */
        public a mo3870c(View view) {
            this.f5439a.f5346g = view;
            return this;
        }

        public DialogInterfaceC1782a create() {
            DialogInterfaceC1782a dialogInterfaceC1782a = new DialogInterfaceC1782a(this.f5439a.f5340a, this.f5440b);
            this.f5439a.m3783a(dialogInterfaceC1782a.f5438a);
            dialogInterfaceC1782a.setCancelable(this.f5439a.f5357r);
            if (this.f5439a.f5357r) {
                dialogInterfaceC1782a.setCanceledOnTouchOutside(true);
            }
            dialogInterfaceC1782a.setOnCancelListener(this.f5439a.f5358s);
            dialogInterfaceC1782a.setOnDismissListener(this.f5439a.f5359t);
            DialogInterface.OnKeyListener onKeyListener = this.f5439a.f5360u;
            if (onKeyListener != null) {
                dialogInterfaceC1782a.setOnKeyListener(onKeyListener);
            }
            return dialogInterfaceC1782a;
        }

        /* renamed from: d */
        public a mo3871d(Drawable drawable) {
            this.f5439a.f5343d = drawable;
            return this;
        }

        /* renamed from: e */
        public a mo3872e(CharSequence[] charSequenceArr, DialogInterface.OnClickListener onClickListener) {
            AlertController.C1756b c1756b = this.f5439a;
            c1756b.f5361v = charSequenceArr;
            c1756b.f5363x = onClickListener;
            return this;
        }

        /* renamed from: f */
        public a mo3873f(CharSequence charSequence) {
            this.f5439a.f5347h = charSequence;
            return this;
        }

        /* renamed from: g */
        public a mo3874g(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
            AlertController.C1756b c1756b = this.f5439a;
            c1756b.f5351l = charSequence;
            c1756b.f5353n = onClickListener;
            return this;
        }

        public Context getContext() {
            return this.f5439a.f5340a;
        }

        /* renamed from: h */
        public a mo3875h(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
            AlertController.C1756b c1756b = this.f5439a;
            c1756b.f5354o = charSequence;
            c1756b.f5356q = onClickListener;
            return this;
        }

        /* renamed from: i */
        public a mo3876i(DialogInterface.OnCancelListener onCancelListener) {
            this.f5439a.f5358s = onCancelListener;
            return this;
        }

        /* renamed from: j */
        public a mo3877j(DialogInterface.OnKeyListener onKeyListener) {
            this.f5439a.f5360u = onKeyListener;
            return this;
        }

        /* renamed from: k */
        public a mo3878k(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
            AlertController.C1756b c1756b = this.f5439a;
            c1756b.f5348i = charSequence;
            c1756b.f5350k = onClickListener;
            return this;
        }

        /* renamed from: l */
        public a mo3879l(ListAdapter listAdapter, int i, DialogInterface.OnClickListener onClickListener) {
            AlertController.C1756b c1756b = this.f5439a;
            c1756b.f5362w = listAdapter;
            c1756b.f5363x = onClickListener;
            c1756b.f5333I = i;
            c1756b.f5332H = true;
            return this;
        }

        /* renamed from: m */
        public DialogInterfaceC1782a m3880m() {
            DialogInterfaceC1782a dialogInterfaceC1782aCreate = create();
            dialogInterfaceC1782aCreate.show();
            return dialogInterfaceC1782aCreate;
        }

        public a setNegativeButton(int i, DialogInterface.OnClickListener onClickListener) {
            AlertController.C1756b c1756b = this.f5439a;
            c1756b.f5351l = c1756b.f5340a.getText(i);
            this.f5439a.f5353n = onClickListener;
            return this;
        }

        public a setPositiveButton(int i, DialogInterface.OnClickListener onClickListener) {
            AlertController.C1756b c1756b = this.f5439a;
            c1756b.f5348i = c1756b.f5340a.getText(i);
            this.f5439a.f5350k = onClickListener;
            return this;
        }

        public a setTitle(CharSequence charSequence) {
            this.f5439a.f5345f = charSequence;
            return this;
        }

        public a setView(View view) {
            AlertController.C1756b c1756b = this.f5439a;
            c1756b.f5365z = view;
            c1756b.f5364y = 0;
            c1756b.f5329E = false;
            return this;
        }

        public a(Context context, int i) {
            this.f5439a = new AlertController.C1756b(new ContextThemeWrapper(context, DialogInterfaceC1782a.m3864h(context, i)));
            this.f5440b = i;
        }
    }

    public DialogInterfaceC1782a(Context context, int i) {
        super(context, m3864h(context, i));
        this.f5438a = new AlertController(getContext(), this, getWindow());
    }

    /* renamed from: h */
    public static int m3864h(Context context, int i) {
        if (((i >>> 24) & Constants.MAX_HOST_LENGTH) >= 1) {
            return i;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(z5e.alertDialogTheme, typedValue, true);
        return typedValue.resourceId;
    }

    /* renamed from: f */
    public Button m3865f(int i) {
        return this.f5438a.m3760c(i);
    }

    /* renamed from: g */
    public ListView m3866g() {
        return this.f5438a.m3762e();
    }

    /* renamed from: i */
    public void m3867i(View view) {
        this.f5438a.m3776s(view);
    }

    @Override // p001o.dk0, p001o.fn3, android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f5438a.m3763f();
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (this.f5438a.m3764g(i, keyEvent)) {
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        if (this.f5438a.m3765h(i, keyEvent)) {
            return true;
        }
        return super.onKeyUp(i, keyEvent);
    }

    @Override // p001o.dk0, android.app.Dialog
    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        this.f5438a.m3774q(charSequence);
    }
}
